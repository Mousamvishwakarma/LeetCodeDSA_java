import java.util.*;

public class AnyOddPlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] digits = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            digits[i] = Integer.parseInt(input[i]);
        }

        boolean hasOdd = false;
        for (int d : digits) {
            if (d % 2 != 0) {
                hasOdd = true;
                break;
            }
        }

        if (hasOdd) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    System.out.println(Arrays.toString(digits));
                    return;
                }
                digits[i] = 0;
            }
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println(Arrays.toString(digits));
        }
    }
}
