public class MaximumValue {
    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximum Value Problem");
    }

    //METHOD TO FIND MAXIMUM INTEGER
    public int getMaximumNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int maximumResultOne = Math.max(firstNumber, secondNumber);
        int maximumResult = Math.max(thirdNumber, maximumResultOne);
        return maximumResult;
    }
}
