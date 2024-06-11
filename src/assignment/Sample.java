package assignment;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int arr[] = {123,163,254,378,366,122,108,174,166,177,189,267,277,378,101,378,466,208};

        Arrays.sort(arr);
        int[] oddarray = new int[arr.length];
        int count = 0;
        for(int i =0; i < arr.length; i++) {


            if (arr[i] % 2 != 0) {
                oddarray[count++] = arr[i];

            }
        }

        for (int a: oddarray){
            System.out.println(a);
        }


        }

    }

