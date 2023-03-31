public class Operators {
    public static void main(String[] args) {

        int firstValue = 10;
        int secondValue = -29;
        int thirdValue = 15;
        int fourthValue = 7;

        int firstSum = firstValue + secondValue;
        int secondSum = thirdValue + fourthValue;

        System.out.println(firstSum > secondSum ? true : false);

        firstSum++;
        secondSum = secondSum - 2;

        System.out.println(firstSum > secondSum ? true : false);

        System.out.println(firstSum % 2 == 0 || secondSum % 2 == 0 ? true : false);

    }
}
