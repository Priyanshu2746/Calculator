import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main extends Functions
{
    public static void main(String args[])throws IOException
    {
        UserInput ob=new UserInput();
        int arr[]=new int[1000]; 
        int t=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(t!=1)
        {
            System.out.println("enter 1 for working on two numbers enter 2 if you want to work on a list of numbers");
            int num = Integer.parseInt(br.readLine());
            if(num==1)
            {
                System.out.println("enter 1 for addition 2 for subtraction 3 for multiplication 4 for division");
                int a= Integer.parseInt(br.readLine());
                if(a==1)
                {
                    arr=ob.input_1(a);
                    long sum=sumTwo(arr);
                    System.out.println(sum);
                }
                else if (a==2)
                {
                    arr=ob.input_1(a);
                    long val=subtract(arr);
                    System.out.println(val);
                }
                else if (a==3)
                {
                    arr=ob.input_1(a);
                    long val=multiply(arr);
                    System.out.println(val);
                }
                else if (a==4)
                {
                    arr=ob.input_1(a);
                    double val=divide(arr);
                    System.out.println(val);
                }
            }
            else if(num==2)
            {
                 System.out.println("enter the size of the array you wanna put in");
                 int n= Integer.parseInt(br.readLine());
                 arr=ob.input_2(n);                
                 int a=100000; 
                 while(a!=0)
                 {
                     System.out.println("enter 1 for sum of the array  2 for mean  3 for Standard deviation  4 for variance 0 to exit the array  ");
                     a=Integer.parseInt(br.readLine());
                     if (a==1)
                     {
                          long x=sum(arr,n);
                          System.out.println("SUM="+x);
                     }
                     else if (a==2)
                     {
                         double x=mean(arr,n);
                         System.out.println("SUM="+x);                 
                     }
                     else if (a==3)
                     {
                         double x=SD(arr,n);
                         System.out.println("Standard deviation="+x); 
                     }
                     else if (a==4)
                     {
                         double x=getVariance(arr);
                         System.out.println("Standard deviation="+x); 
                     }
                 }
           }
           System.out.println("enter 1 if you want close the calculator");
           t=Integer.parseInt(br.readLine());
        }
    }
}
