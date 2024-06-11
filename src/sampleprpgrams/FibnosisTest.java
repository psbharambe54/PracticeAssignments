package sampleprpgrams;

import java.util.ArrayList;
import java.util.List;

public class FibnosisTest {
    public static int fibnosis(int start, int second, int num){
        int sum =0;
        System.out.println(start+","+second);
        for (int i = 0; i <= num; i++) {

            sum = start + second;
//            System.out.println(sum);
            System.out.print(start+" ");
            start = second;
            second = sum;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4};
        int num = 10;
        fibnosis(0,1,num);


    }
}
