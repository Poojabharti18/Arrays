package ArrayConcept;

import java.util.Scanner;

public class SumofArray  {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter the inputs");
        int sum=0;
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
            
        }
        System.out.println(sum);
    }

}




	


//WAP to calculate sum of array?
//
//size:
//3
//input:
//1
//2
//3
//output:
//sum=1+2+3=6
