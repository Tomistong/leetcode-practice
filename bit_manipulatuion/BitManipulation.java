import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input number: ");

        while (input.hasNext()) {
            int number, count = 0, anotherCount = 0;
            number = input.nextInt();

            while (number != 0) {
                number = number&(number-1);
                System.out.println(number);
                count++;
            }
            
            System.out.printf("numbers of one: %d", count);
        }
    }
}