package lab;

import java.util.Scanner;

public class Main {
    static boolean dim_is_valid (int dim, int w, int h, int n)
    {
        return  (dim / w) * (dim / h) >= n;
    }

    static int f(int w,int h,int n){
       int R = 1;
        while (!dim_is_valid (R,w,h,n) )
        {
            R *= 2;
        }
        int L = R / 2;
        while (R - L > 1)
        {
        int N = (L + R) / 2;
            if (!dim_is_valid(N,w,h,n))
            {
                L = N;
            }
            else
            {
                R = N;
            }
        }
        return  R;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int n = scanner.nextInt();


        System.out.println(f(w,h,n));
    }
}
