import java.util.Scanner;
public class LowerMatrix {
    public static void main(String[] args) {
        int a[] = new int[3][3];
        System.out.println("Enter row: ");
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println("Enter Column: ");
        Scanner sc= new Scanner(System.in);
        int c=sc.nextInt();
        if(r==c)
        {
            System.out.println("Enter the elements: ");
            for(int i=0 ; i<r ; i++)
            {
                for(int j=0 ; j<r ; j++)
                {
                    Scanner sc=new Scanner(System.in);
                    a[i][j]=sc.nextInt();
                    System.out.print(" ");
                }
            }
            System.out.println(" The Matrix is: ");
            for(int i=0 ; i<r ; i++ )
            {
                for(int j=0 ; j<r ; j++)
                {
                    System.out.print(a[i][j] + " ");
            }
                System.out.println(" ");
        }
            System.out.println("Lower triangular matrix: ");
            for(int i=0 ; i<r ; i++)
            {
                for(int j=0 ; j<r ; j++)
                {
                    if(i>=j)
                    {
                        System.out.print(a[i][j] +" ");
                    }
                    else {
                        System.out.print("0"+" ");
                    }
                }
                else
            }
            System.out.println("Not a order matrix: ");
    }
}
