import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {
    //GLOBAL OBJECT
    MaximumValue maximumValue = new MaximumValue();

    @Test
    public void givenThreeInteger_WhenFirstNumberIsMaximum_ShouldReturnMaximumNumber() {
        int resultMaximumNumber = maximumValue.getMaximumValue(16, 5, 10);
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeInteger_WhenSecondNumberIsMaximum_ShouldReturnMaximumNumber() {
        int resultMaximumNumber = maximumValue.getMaximumValue(5, 16, 10);
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeInteger_WhenThirdNumberIsMaximum_ShouldReturnMaximumNumber() {
        int resultMaximumNumber = maximumValue.getMaximumValue(5, 10, 16);
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeInteger_WhenTwoNumbersAreEqual_ShouldReturnMaximumNumber_() {
        int resultMaximumNumber = maximumValue.getMaximumValue(16, 10, 16);
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeFloat_WhenFirstNumberIsMaximum_ShouldReturnMaximumNumber() {
        float resultMaximumNumber = maximumValue.getMaximumValue(16.5f, 10.55f, 5.1f);
        Assert.assertEquals(16.5, resultMaximumNumber, 0.0);
    }

    @Test
    public void givenThreeFloat_WhenSecondNumberIsMaximum_ShouldReturnMaximumNumber() {
        float resultMaximumNumber = maximumValue.getMaximumValue(10.55f, 16.5f, 5.1f);
        Assert.assertEquals(16.5, resultMaximumNumber, 0.0);
    }

    @Test
    public void givenThreeFloat_WhenThirdNumberIsMaximum_ShouldReturnMaximumNumber() {
        float resultMaximumNumber = maximumValue.getMaximumValue(10.55f, 5.1f, 16.5f);
        Assert.assertEquals(16.5, resultMaximumNumber, 0.0);
    }

    @Test
    public void givenThreeFloat_WhenTwoNumberAreEqual_ShouldReturnMaximumNumber() {
        float resultMaximumNumber = maximumValue.getMaximumValue(10.5f, 16.5f, 10.5f);
        Assert.assertEquals(16.5, resultMaximumNumber, 0.0);
    }

    @Test
    public void givenThreeStrings_WhenFirstIsMaximumString_ShouldReturnMaximumString() {
        String resultMaximumString = maximumValue.getMaximumValue("Amey", "Amar", "Aman");
        Assert.assertEquals("Amey", resultMaximumString);
    }

    @Test
    public void givenThreeStrings_WhenSecondIsMaximumString_ShouldReturnMaximumString() {
        String resultMaximumString = maximumValue.getMaximumValue("Amar", "Amey", "Aman");
        Assert.assertEquals("Amey", resultMaximumString);
    }

    @Test
    public void givenThreeStrings_WhenThirdIsMaximumString_ShouldReturnMaximumString() {
        String resultMaximumString = maximumValue.getMaximumValue("Amar", "Aman", "Amey");
        Assert.assertEquals("Amey", resultMaximumString);
    }

    @Test
    public void givenThreeStrings_WhenTwoStringsAreEqual_ShouldReturnMaximumString() {
        String resultMaximumString = maximumValue.getMaximumValue("Amey", "Aman", "Amey");
        Assert.assertEquals("Amey", resultMaximumString);
    }
}