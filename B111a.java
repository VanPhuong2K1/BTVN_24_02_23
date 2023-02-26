package BVN_110_111_216;

import java.util.Scanner;

public class B111a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao H: ");
        int n = sc.nextInt();
        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n - i; j++)
            {
                System.out.print("   ");
            }
            for (j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}