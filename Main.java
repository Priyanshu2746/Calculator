import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Functions {
    public static void main(String args[]) throws IOException {
        // create a UserInput object
        UserInput ob = new UserInput();
        // create an integer array to store the input values
        int arr[] = new int[1000];
        // initialize the loop control variable
        int t = 0;
        // create a BufferedReader object to read user input from the console
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // start a loop that will run until the user chooses to exit
        while (t != 1) {
            // prompt the user for input type
            System.out.println("enter 1 for working on two numbers enter 2 if you want to work on a list of numbers");
            // read the input from the console
            int num = Integer.parseInt(br.readLine());
            // perform the operation based on the user's input type
            if (num == 1) {
                // prompt the user for the operation type
                System.out.println("enter 1 for addition 2 for subtraction 3 for multiplication 4 for division");
                // read the input from the console
                int a = Integer.parseInt(br.readLine());
                // perform the appropriate operation based on the user's input
                if (a == 1) {
                    arr = ob.input_1(a);
                    long sum = sumTwo(arr);
                    System.out.println(sum);
                } else if (a == 2) {
                    arr = ob.input_1(a);
                    long val = subtract(arr);
                    System.out.println(val);
                } else if (a == 3) {
                    arr = ob.input_1(a);
                    long val = multiply(arr);
                    System.out.println(val);
                } else if (a == 4) {
                    arr = ob.input_1(a);
                    double val = divide(arr);
                    System.out.println(val);
                }
            } else if (num == 2) {
                // prompt the user for the size of the input array
                System.out.println("enter the size of the array you wanna put in");
                // read the input from the console
                int n = Integer.parseInt(br.readLine());
                // create the input array based on the user's specified size
                arr = ob.input_2(n);
                // initialize the loop control variable
                int a = 100000;
                // start a loop that will run until the user chooses to exit
                while (a != 0) {
                    // prompt the user for the operation type
                    System.out.println("enter 1 for sum of the array  2 for mean  3 for Standard deviation  4 for variance 0 to exit the array  ");
                    // read the input from the console
                    a = Integer.parseInt(br.readLine());
                    // perform the appropriate operation based on the user's input
                    if (a == 1) {
                        long x = sum(arr, n);
                        System.out.println("SUM=" + x);
                    } else if (a == 2) {
                        double x = mean(arr, n);
                        System.out.println("SUM=" + x);
                    } else if (a == 3) {
                        double x = SD(arr, n);
                        System.out.println("Standard deviation=" + x);
                    } else if (a == 4) {
                        double x = getVariance(arr);
                        System.out.println("Standard deviation="+x);
                    }
                }
            }
            System.out.println("enter 1 if you want close the calculator");
            t=Integer.parseInt(br.readLine());
        }
    }
}
