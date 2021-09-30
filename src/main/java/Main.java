import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        boolean Check_Flag = true;
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int counter = -1;
        while (Check_Flag) {
            int input_digit = sc.nextInt();
            if (input_digit == 0) {
                Check_Flag = false;
            }
            sum += input_digit;
            counter += 1;
        }
        System.out.print(counter+" ");
        System.out.print(sum+" ");
        System.out.print(Math.floor((sum/counter)*10)/10);

    }
}
