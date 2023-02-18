import java.util.*;
import java.io.*;
public class UserInput
{
    int[] input_1(int a)// input for  addition subtraction ,multiplacation and division
    {
        int arr[]=new int[2];
        Scanner so=new Scanner(System.in);
        if(a==1)//inputs for addition
        {
            System.out.println("enter  the numbers to be added");
            arr[0]=so.nextInt();
            arr[1]=so.nextInt();
        }
        else if(a==2)//input for subtraction
        {
            System.out.println("enter  the numbers from which you want to subtract from");
            arr[0]=so.nextInt();
            System.out.println("enter  the numbers from which you want to subtract ");
            arr[1]=so.nextInt();
        }
        else if(a==3)//input for multiplication
        {
            System.out.println("enter  the numbers to be multiplied");
            arr[0]=so.nextInt();
            arr[1]=so.nextInt();
        }
        else if(a==3)//input for division
        {
            System.out.println("enter  the  divident");
            arr[0]=so.nextInt();
            System.out.println("enter  the divisor ");
            arr[1]=so.nextInt();
        }
        return arr;
    }
    int[] input_2(int l)// input for  addition ,variance  and standard deviation of array . .
    {
        System.out.println("Enter the array");
        Scanner so=new Scanner(System.in);
        int arr[]=new int[l];
        for (int i=0;i<l;i++)
        arr[i]=so.nextInt();
        return arr;
    }
}
