// insertion sort
import java.util.Scanner;
import java.util.*;
public class Program
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]= sc.nextInt();
        int j;
        for(int i=0;i<n;i++){
        j=i;
        while(j>0 && a[j-1]>a[j]){
            int t=a[j];
            a[j]=a[j-1];
            a[j-1]=t;
            j=j-1;
        }
        
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]);
    }
}
