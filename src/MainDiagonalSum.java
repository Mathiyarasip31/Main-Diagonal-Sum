import java.util.Scanner;
public class MainDiagonalSum {
    static int Sum(int array[][],int n,int m)
    {
        int sum=0;
        for(int i = 0; i < n; i++) {
                sum+=array[i][i];
            }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=scanner.nextInt();
        System.out.println("Enter number of columns");
        int m=scanner.nextInt();
        System.out.println("Enter elements");
        int array[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Sum of main diagonals "+Sum(array,n,m));
    }
}