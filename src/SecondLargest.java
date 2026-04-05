import java.util.Scanner;

public class SecondLargest {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                if (!sc.hasNextInt())
                        return;
                int n = sc.nextInt();

                int max1 = Integer.MIN_VALUE;
                int max2 = Integer.MIN_VALUE;

                for (int i = 0; i < n; i++) {
                        if (!sc.hasNextInt())
                                break;
                        int current = sc.nextInt();

                        if (current > max1) {
                                max2 = max1;
                                max1 = current;
                        }

                        else if (current > max2 && current < max1) {
                                max2 = current;
                        }
                }

                System.out.println(max2);

                sc.close();
        }
}