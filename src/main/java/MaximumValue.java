public class MaximumValue {
    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximum Value Problem");
    }

    //METHOD TO FIND MAXIMUM INTEGER VALUE
    public int getMaximumNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int maximumResultOne = Math.max(firstNumber, secondNumber);
        int maximumResult = Math.max(thirdNumber, maximumResultOne);
        return maximumResult;
    }

    //METHOD TO FIND MAXIMUM FLOAT VALUE
    public float getMaximumFloatNumber(float firstNumber, float secondNumber, float thirdNumber) {
        float maximumResultOne = Math.max(firstNumber, secondNumber);
        float maximumResultFloat = Math.max(thirdNumber, maximumResultOne);
        return maximumResultFloat;
    }
}