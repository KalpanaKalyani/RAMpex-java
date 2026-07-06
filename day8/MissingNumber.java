package day8;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};

        int n = 5;

        int totalSum = 0;
        int arraySum = 0;

        for (int i = 1; i <= n; i++) {
            totalSum += i;
        }

        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        int missing = totalSum - arraySum;

        System.out.println("Missing Number = " + missing);
    }
}