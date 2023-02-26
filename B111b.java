package BVN_110_111_216;

import java.util.Scanner;

public class B111b
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap chieu cao H: ");
        int n = in.nextInt();
        int i, j;
        for(i = 1; i <= n; i++)
        {
            for (j = 1; j <= n + i - 1; j++)
            {
                if(j == n + i - 1 || j == n - i + 1|| i == n)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
