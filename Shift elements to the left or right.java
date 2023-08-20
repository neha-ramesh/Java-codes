import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }


        for(int i=0;i<n;i++)
        {
            if(i!=n-1)
            {
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }

        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
