import java.util.*;
import java.lang.*;
import java.math.*;
class Functions extends UserInput
{
    static long sumTwo(int arr[])
    {
        long sum=0;
        sum=arr[0]+arr[1];
        return sum;
    }
    static long subtract(int arr[])
    {
        long val=0;
        val=arr[0]-arr[1];
        return val;
    }
    static long multiply(int arr[])
    {
        long val=0;
        val=arr[0]*arr[1];
        return val;
    }
    static double divide(int arr[])
    {
        double val=0;
        val=arr[0]/arr[1];
        return val;
    }
    static long sum(int arr[],int l) //for sum of the array 
    {
        long sum=0;
        for(int i=0;i<l;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    static double mean(int  arr[],int l)// for array mean
    {
        double mean=0;
        long sum=sum(arr,l);
        mean=sum/l;
        return mean;
    }
    static double SD(int arr[],int l)//for standard deviation 
    {
        double sd;
        double mean=0;
        long sum=sum(arr,l);
        mean=sum/l;
        int mean1 =(int)mean;
        for(int i=0;i<l;i++)
        {
            arr[i]=arr[i]-mean1;
            arr[i]=arr[i]*arr[i];
        }
        sum=sum(arr,l);
        sd=Math.sqrt(sum);
        sd=sd/l;
        return sd;
    }
    static double getVariance(int[] arr)
    {
        double mean = 0;
        double sum = 0;
        // Calculate the mean of the array
        for (double num : arr) {
            sum += num;
        }
        mean = sum / arr.length;
        // Calculate the variance of the array
        double variance = 0;
        for (double num : arr) {
            variance += Math.pow(num - mean, 2);
        }
        variance /= arr.length;
        return variance;
    }
}
