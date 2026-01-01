import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        System.out.println("Numbers between " + num1 + " and " + num2 + ":");

        
        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        for (int i = start + 1; i < end; i++) {
              if(i%2 == 0){
            System.out.print(i + " ");
        }
}
        System.out.println();
    }
}
