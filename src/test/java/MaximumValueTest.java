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
        int resultMaximumNumber = maximumValue.getMaximumNumber( 5, 10, 16);
        Assert.assertEquals(16,resultMaximumNumber);
    }
}
