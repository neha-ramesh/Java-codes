import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.print("Row: ");
int n= sc.nextInt();
System.out.print("Column: ");
int m= sc.nextInt();

int [][]arr= new int[n][m];

System.out.println("Enter the elements");
for (int i=0;i<n;i++)
{
   for(int j=0;j<m;j++)
   {
       arr[i][j]=sc.nextInt();
   }
}

System.out.println("Enter 1 for diagonal sum, 2 for row sum, 3 for column sum");
int choice=sc.nextInt();
int sum=0;

switch (choice)
{
   case 1:
       for (int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
               if (i==j)
                  {
                       sum+=arr[i][j];
                   }
           }
       }
       System.out.println("Sum of diagonal: "+sum);
       break;
       
   case 2:
        for(int i=0;i<n;i++)
        {
           sum=0;
           for (int j=0;j<n;j++)
           {
               sum+=arr[i][j]; 
           }
           System.out.println("Sum of "+i+" row: "+sum);
        }
        break;
       
    case 3:
        System.out.print("Enter the column number: ");
        int num=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           for (int j=0;j<n;j++)
           {
               if (num==j)
               {
                   sum+=arr[i][num]; 
               }
               
           }
        }
        System.out.println("Sum of the given row: "+sum);
        break;
        
    default :
        System.out.println("Enter a valid option");
}

}
}
