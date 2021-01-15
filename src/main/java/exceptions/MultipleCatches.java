package exceptions;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int nums[] = {};
            // int nums[] = {1, 2, 3};
            int numCount = nums.length;
            System.out.printf("numCount = %d%n", numCount);
            int aNum = 42 / numCount;
            int nums1[] = {1};
            nums[42] = 99;
        } /*catch (Exception e) {
            System.out.printf("Oopsie Doopsie...%n");
        }*/
        catch (ArithmeticException e) {
            System.out.printf("Division by 0: %s%n", e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.printf("Array index is invalid: %s%n", e);
        }
        System.out.printf("After try/catch blocks..%n");
    }
}
