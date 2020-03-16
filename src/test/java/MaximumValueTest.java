import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {

    @Test
    public void givenThreeInteger_WhenSecondNumberIsMaximum_ShouldReturnMaximumNumber() {
        MaximumValue maximumValue = new MaximumValue();
        int resultMaximumNumber = (int) maximumValue.getMaximumValue(5, 16, 10);
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeInteger_WhenThirdNumberIsMaximum_ShouldReturnMaximumNumber() {
        MaximumValue maximumValue = new MaximumValue();
        int resultMaximumNumber = (int) maximumValue.getMaximumValue(5, 10, 16);
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeInteger_WhenTwoNumbersAreEqual_ShouldReturnMaximumNumber_() {
        MaximumValue maximumValue = new MaximumValue();
        int resultMaximumNumber = (int) maximumValue.getMaximumValue(16, 10, 16);
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeFloat_WhenFirstNumberIsMaximum_ShouldReturnMaximumNumber() {
        MaximumValue maximumValue = new MaximumValue();
        float resultMaximumNumber = (float) maximumValue.getMaximumValue(16.5f, 10.55f, 5.1f);
        Assert.assertEquals(16.5, resultMaximumNumber, 0.0);
    }

    @Test
    public void givenThreeFloat_WhenSecondNumberIsMaximum_ShouldReturnMaximumNumber() {
        MaximumValue maximumValue = new MaximumValue();
        float resultMaximumNumber = (float) maximumValue.getMaximumValue(10.55f, 16.5f, 5.1f);
        Assert.assertEquals(16.5, resultMaximumNumber, 0.0);
    }

    @Test
    public void givenThreeFloat_WhenThirdNumberIsMaximum_ShouldReturnMaximumNumber() {
        MaximumValue maximumValue = new MaximumValue();
        float resultMaximumNumber = (float) maximumValue.getMaximumValue(10.55f, 5.1f, 16.5f);
        Assert.assertEquals(16.5, resultMaximumNumber, 0.0);
    }

    @Test
    public void givenThreeFloat_WhenTwoNumberAreEqual_ShouldReturnMaximumNumber() {
        MaximumValue maximumValue = new MaximumValue();
        float resultMaximumNumber = (float) maximumValue.getMaximumValue(10.5f, 16.5f, 10.5f);
        Assert.assertEquals(16.5, resultMaximumNumber, 0.0);
    }

    @Test
    public void givenThreeStrings_WhenFirstIsMaximumString_ShouldReturnMaximumString() {
        MaximumValue maximumValue = new MaximumValue();
        String resultMaximumString = (String) maximumValue.getMaximumValue("Amey", "Amar", "Aman");
        Assert.assertEquals("Amey", resultMaximumString);
    }

    @Test
    public void givenThreeStrings_WhenSecondIsMaximumString_ShouldReturnMaximumString() {
        MaximumValue maximumValue = new MaximumValue();
        String resultMaximumString = (String) maximumValue.getMaximumValue("Amar", "Amey", "Aman");
        Assert.assertEquals("Amey", resultMaximumString);
    }

    @Test
    public void givenThreeStrings_WhenThirdIsMaximumString_ShouldReturnMaximumString() {
        MaximumValue maximumValue = new MaximumValue();
        String resultMaximumString = (String) maximumValue.getMaximumValue("Amar", "Aman", "Amey");
        Assert.assertEquals("Amey", resultMaximumString);
    }

    @Test
    public void givenThreeStrings_WhenTwoStringsAreEqual_ShouldReturnMaximumString() {
        MaximumValue maximumValue = new MaximumValue();
        String resultMaximumString = (String) maximumValue.getMaximumValue("Amey", "Aman", "Amey");
        Assert.assertEquals("Amey", resultMaximumString);
    }

    @Test
    public void givenThreeInteger_WhenFirstNumberIsMaximum_ShouldReturnMaximumNumberByGeneric() {
        MaximumValue maximumValue = new MaximumValue(16, 5, 10);
        Comparable resultMaximumNumber = maximumValue.getMaximumValue();
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeInteger_WhenSecondNumberIsMaximum_ShouldReturnMaximumNumberByGeneric() {
        MaximumValue maximumValue = new MaximumValue(5, 16, 10);
        Comparable resultMaximumNumber = maximumValue.getMaximumValue();
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeInteger_WhenThirdNumberIsMaximum_ShouldReturnMaximumNumberByGeneric() {
        MaximumValue maximumValue = new MaximumValue(5, 10, 16);
        Comparable resultMaximumNumber = maximumValue.getMaximumValue();
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeInteger_WhenTwoNumbersAreEqual_ShouldReturnMaximumNumberByGeneric() {
        MaximumValue maximumValue = new MaximumValue(16, 10, 16);
        Comparable resultMaximumNumber = maximumValue.getMaximumValue();
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeFloat_WhenFirstNumberIsMaximum_ShouldReturnMaximumNumberByGeneric() {
        MaximumValue maximumValue = new MaximumValue(16.5f, 10.55f, 5.1f);
        Comparable resultMaximumNumber = maximumValue.getMaximumValue();
        Assert.assertEquals(16.5, (Float) resultMaximumNumber, 0.0);
    }

    @Test
    public void givenThreeFloat_WhenSecondNumberIsMaximum_ShouldReturnMaximumNumberByGeneric() {
        MaximumValue maximumValue = new MaximumValue(10.55f, 16.5f, 5.1f);
        Comparable resultMaximumNumber = maximumValue.getMaximumValue();
        Assert.assertEquals(16.5, (Float) resultMaximumNumber, 0.0);
    }

    @Test
    public void givenThreeFloat_WhenThirdNumberIsMaximum_ShouldReturnMaximumNumberByGeneric() {
        MaximumValue maximumValue = new MaximumValue(10.55f, 5.1f, 16.5f);
        Comparable resultMaximumNumber = maximumValue.getMaximumValue();
        Assert.assertEquals(16.5, (Float) resultMaximumNumber, 0.0);
    }

    @Test
    public void givenThreeFloat_WhenTwoNumberAreEqual_ShouldReturnMaximumNumberByGeneric() {
        MaximumValue maximumValue = new MaximumValue(10.5f, 16.5f, 10.5f);
        Comparable resultMaximumNumber = maximumValue.getMaximumValue();
        Assert.assertEquals(16.5, (Float) resultMaximumNumber, 0.0);
    }

    @Test
    public void givenThreeStrings_WhenFirstIsMaximumString_ShouldReturnMaximumStringByGeneric() {
        MaximumValue maximumValue = new MaximumValue("Amey", "Amar", "Aman");
        Comparable resultMaximumString = maximumValue.getMaximumValue();
        Assert.assertEquals("Amey", resultMaximumString);
    }

    @Test
    public void givenThreeStrings_WhenSecondIsMaximumString_ShouldReturnMaximumStringByGeneric() {
        MaximumValue maximumValue = new MaximumValue("Amar", "Amey", "Aman");
        Comparable resultMaximumString = maximumValue.getMaximumValue();
        Assert.assertEquals("Amey", resultMaximumString);
    }

    @Test
    public void givenThreeStrings_WhenThirdIsMaximumString_ShouldReturnMaximumStringByGeneric() {
        MaximumValue maximumValue = new MaximumValue("Amar", "Aman", "Amey");
        Comparable resultMaximumString = maximumValue.getMaximumValue();
        Assert.assertEquals("Amey", resultMaximumString);
    }

    @Test
    public void givenThreeStrings_WhenTwoStringsAreEqual_ShouldReturnMaximumStringByGeneric() {
        MaximumValue maximumValue = new MaximumValue("Amey", "Aman", "Amey");
        Comparable resultMaximumString = maximumValue.getMaximumValue();
        Assert.assertEquals("Amey", resultMaximumString);
    }
}