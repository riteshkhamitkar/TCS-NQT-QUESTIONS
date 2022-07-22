import java.util.Scanner;

public class tcsnqtquestion1 {

    //Input part
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i =0; i<N;i++)
           arr[i]=sc.nextInt();


        //Logic part
        int ptr =0;
        for(int i = 0; i<N;i++){
            if(arr[i]!=0){
                arr[ptr]=arr[i];
                ptr++;
            }

        }
        //Logic for zeros
        for(int i = ptr;i<N;i++){
            arr[i]=0;

        }
        //Output part
        for(int i=0;i<N;i++)
            System.out.print(arr[i]);
    }
    
}

/*.. //Problem Statement –

A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

Example 1 :

N=7 and arr = [4,5,0,1.9,0,5,0].

There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

Input :

7  – Value of N

[4,5,0,1,0,0,5] – Element of arr[O] to arr[N-1],While input each element is separated by newline

Output:

4 5 1 9 5 0 0 */

