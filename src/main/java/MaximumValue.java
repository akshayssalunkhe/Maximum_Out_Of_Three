public class MaximumValue<E extends Comparable> {
    E firstValue;
    E secondValue;
    E thirdValue;

    //DEFAULT CONSTRUCTOR
    public MaximumValue() {
    }

    //PARAMETRISED CONSTRUCTOR
    public MaximumValue(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public E getMaximumValue() {
        return getMaximumValue(firstValue, secondValue, thirdValue);
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximum Value Problem");
    }

    //GENERIC METHOD TO FIND MAXIMUM VALUE
    public <E extends Comparable> E getMaximumValue(E firstValue, E secondValue, E thirdValue) {
        E maximumValue = firstValue;
        if (secondValue.compareTo(maximumValue) > 0) {
            maximumValue = secondValue;
        }
        if (thirdValue.compareTo(maximumValue) > 0) {
            maximumValue = thirdValue;
        }
        return maximumValue;
    }
}