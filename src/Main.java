import java.util.Scanner;

public class Main {
    public static int randomNumber(int n) {
        return n * n - (3 * n) + 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("I have a number in my mind !\nPlease guess it : ");
            int n = scanner.nextInt();
            int x = randomNumber(n);
            boolean flag = false;
            while (!flag) {
                if (x == n) {
                    System.out.println("******* THAT WAS RIGHT *******\nAgain :\n");
                    flag = true;
                } else {
                    if (n > x) {
                        System.out.println("Your number is larger than mine !\nRetry !");
                    } else {
                        System.out.println("Your number is smaller than mine !\nRetry !");
                    }
                    n = scanner.nextInt();
                }


            }
        }
    }
}