import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {
    @Test
    public void givenThreeInteger_WhenFirstIsMaximum_ShouldReturnMaximumNumber() {
        MaximumValue maximumValue = new MaximumValue();
        int resultMaximumNumber = maximumValue.getMaximumNumber(16, 5, 10);
        Assert.assertEquals(16, resultMaximumNumber);
    }
}
