import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Old array");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

        Random random=new Random();
        for (int i=0;i<n;i++)
        {
            int y=random.nextInt(n);
            int temp = arr[i];
            arr[i] = arr[y];
            arr[y] = temp;
        }
        System.out.println("New array");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Old array");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

        Random random=new Random();
        for (int i=0;i<n;i++)
        {
            int y=random.nextInt(n);
            int temp = arr[i];
            arr[i] = arr[y];
            arr[y] = temp;
        }
        System.out.println("New array");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
