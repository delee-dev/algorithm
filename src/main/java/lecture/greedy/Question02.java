package lecture.greedy;

import java.util.List;
import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        /**
         * (이코테) 곱하기 혹은 더하기
         * */

        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.next().split("");
        int result = Integer.parseInt(numbers[0]);

        int i = 1;
        while (numbers.length != i) {
            int nextInt = Integer.parseInt(numbers[i]);
            if (List.of(0, 1).contains(result) || List.of(0, 1).contains(nextInt)) {
                result += nextInt;
            } else {
                result *= nextInt;
            }
            i++;
        }

        System.out.println(result);
    }
}
