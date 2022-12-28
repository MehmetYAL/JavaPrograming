package Array;

import java.util.Arrays;

public class array1to100 {
    public static void main(String[] args) {
        int [] number=new int[101];
int k=0;
        for (int i =1; i < 101; i++) {
            number[i]=i;

        }System.out.print(Arrays.toString(number));

    }
}
