package smaple;
import java.io.*;
import java.util.*;

public class bublesort 
{

	public static void main(String[] args)
	{
        Scanner s=new Scanner(System.in);
        int a[]=new int[4];
        int i=0,temp;
              
        for(;i<4;i++)
        {
        	System.out.println("Enter the aray values:");
            a[i]=s.nextInt();
        }
        for(;i<4;i++)
        {
        	if(a[i]>a[i++])   
        	{
        		temp=a[i++];
        		a[i++]=a[i];
        		a[i]=temp;
        	}
        }
        for(;i<4;i++)
        {
        	System.out.println(a[i]);
        }
    }

}


