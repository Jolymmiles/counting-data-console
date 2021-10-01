import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        boolean Check_Flag = true;
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int counter = -1;
        while (Check_Flag) {
            double input_digit = sc.nextDouble();
            if (input_digit == 0) {
                Check_Flag = false;
            }
            sum += input_digit;
            counter += 1;
        }
        System.out.print(counter + " " + Math.floor(sum*100)/100+ " " +Math.floor((sum/counter)*100)/100);

    }
}