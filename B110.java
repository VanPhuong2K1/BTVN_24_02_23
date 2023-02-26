package BVN_110_111_216;

public class B110
{
    public static void main(String[] args)
    {
        int a, b, c, t, k;
        k = 0;
        for(a = 0; a <= 200; a++)
            for(b = 0; b <= 100; b++)
                for(c = 0; c <= 40; c++)
                    if(a * 1000 + b * 2000 + c * 5000 == 200000 )
                    {
                        k++;
                        System.out.println("Phuong an thu: " + k);
                        System.out.println("So a:\t"+ a + "\tSo b:" + b + "\t So c:" + c);
                    }
    }
}
