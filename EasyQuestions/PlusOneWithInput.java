import java.util.*;

public class PlusOneWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits (space separated): ");
        String[] input = sc.nextLine().split(" ");
        int[] digits = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            digits[i] = Integer.parseInt(input[i]);
        }

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }
    }
}

