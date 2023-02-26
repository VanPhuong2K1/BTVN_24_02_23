package BVN_110_111_216;

import java.util.Scanner;

public class B216
{
    public static void main(String[] args)
    {
        int n;
        int chan = 0;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        }
        while (n <= 0);

        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        // trả về độ dài của mảng
        for (int i = 0; i < n; i++)
        {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }

        // tính số lượng số nguyên chẵn trong mảng
        for (int i = 0; i < n; i++)
        {
            if (A[i] % 2 == 0)
            {
                chan++;
            }
        }
        System.out.println("Số lượng số nguyên chẵn trong mảng = " + chan);
    }
}
