import java.util.*;
public class bin_search
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sorted array...");
        int a[]=new int[10];
        int i=0,j,n=0,k=0;
        int lb=0,ub=0,p;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter a number present in the array?");
            a[i]=in.nextInt();
        }
        System.out.println("Enter the number to be searched?");
        n=in.nextInt();
        for(i=0;i<10;i++)
        {
            p=lb+ub/2;
            if(n<p)
            {
                lb+=1;
            }
            if(n>p)
            {
                ub+=1;
            }
            if(n==p)
            {
                k=0;
                break;
            }
        }
        if(k==1)
        {
            System.out.println("The entered number is present in the array!");
        }
        else
        {
            System.out.println("The entered number is not present in the array");
        }
    }
}

            