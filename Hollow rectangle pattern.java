import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	    int n=sc.nextInt();
	    for (int i=0;i<5;i++)
	    {
	        for (int j=0;j<n;j++)
	        {
	            if ((j>=1&&j<n-1) && (i==1||i==2||i==3))
	            {
	                System.out.print(" ");
	            }
	            else{
	                System.out.print("&");
	            }
	            
	        }
	        System.out.println();
	    }
	    
	    for (int i=1;i<3;i++)
	    {
	        for (int j=1;j<n-1;j++)
	        {
	            System.out.print(" ");
	        }
	        System.out.println();
	    } 
	}
}
