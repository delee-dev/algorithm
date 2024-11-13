package lecture.greedy;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        /**
         * (이코테) 1이 될 때까지
         * */

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int rep = 0;

        while (n != 1) {
            if (n % k == 0) {
                n = n / k;
            } else {
                n = n - 1;
            }
            rep++;
        }

        System.out.println(rep);
    }
}
