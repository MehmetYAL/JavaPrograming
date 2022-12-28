package Array;

import java.util.Arrays;

public class Array100To1 {
    public static void main(String[] args) {
       // int[] number=new int[101];
      //  int result= number.length;
        //int[] temp=new int[result];

       // for (int i =result-1; i>-1 ; i--) {

//temp[result-i-1]=number[i];
//result+=number[i];
        int[] array = new int[100];
        System.out.println("Input Array :" + Arrays.toString(array));

        // Declaring variables for array reversal
        int n = array.length;
        int[] temp = new int[n];

        // Reversal of array using Temporary variable
        for(int i = n - 1; i > -1; i--) {
            // Storing the elements of the input array in reverse order
            temp[n - i - 1] = array[i];
        }
            System.out.print(Arrays.toString(temp)+" ");
        }

    }

