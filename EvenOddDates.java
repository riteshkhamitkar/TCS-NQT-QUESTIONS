import java.util.*;
class Main
{
   public static void main (String[]args)
   {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt ();
       int arr[] = new int[n];
       for (int i = 0; i < n; i++)
           arr[i] = sc.nextInt ();
       int d = sc.nextInt ();
       int x = sc.nextInt ();
       int countEven = 0, countOdd = 0;
       for (int i = 0; i < n; i++)
       {
       if (arr[i] % 2 == 0)
           countEven++;
       else
           countOdd++;
       }
       if (d % 2 != 0)
       {
       if (countEven == 0)
           System.out.println ("0");
       else
           System.out.println (countEven * x);
       }
       else
       {
       if (countOdd == 0)
           System.out.println ("0");
       else
           System.out.println (countOdd * x);
       }
   }
}
