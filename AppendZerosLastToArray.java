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

