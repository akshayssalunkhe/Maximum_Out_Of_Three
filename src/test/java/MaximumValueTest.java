import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {
    //GLOBAL OBJECT
    MaximumValue maximumValue = new MaximumValue();

    @Test
    public void givenThreeInteger_WhenFirstNumberIsMaximum_ShouldReturnMaximumNumber() {
        int resultMaximumNumber = maximumValue.getMaximumNumber(16, 5, 10);
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeInteger_WhenSecondNumberIsMaximum_ShouldReturnMaximumNumber() {
        int resultMaximumNumber = maximumValue.getMaximumNumber(5, 16, 10);
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeInteger_WhenThirdNumberIsMaximum_ShouldReturnMaximumNumber() {
        int resultMaximumNumber = maximumValue.getMaximumNumber(5, 10, 16);
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeInteger_WhenTwoNumbersAreEqual_ShouldReturnMaximumNumber_() {
        int resultMaximumNumber = maximumValue.getMaximumNumber(16, 10, 16);
        Assert.assertEquals(16, resultMaximumNumber);
    }

    @Test
    public void givenThreeFloat_WhenFirstNumberIsMaximum_ShouldReturnMaximumNumber() {
        float resultMaximumNumber = maximumValue.getMaximumFloatNumber(16.5f, 10.55f, 5.1f);
        Assert.assertEquals(16.5, resultMaximumNumber, 0.0);
    }
}
