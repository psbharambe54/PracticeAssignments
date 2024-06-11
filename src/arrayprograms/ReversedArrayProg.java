package arrayprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReversedArrayProg implements Calculations {
    @Override
    public void usingCollection(int... arr) {
      List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
      Collections.reverse(list);
      int[] array = list.stream().mapToInt(Integer::intValue).toArray();
      System.out.println(Arrays.toString(array));

    }

    @Override
    public void usingLopp(int... arr) {
        int end = arr.length -1;
        int start =0;

       while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

           start++;
           end--;
       }
        System.out.println(Arrays.toString(arr));
        }

        public void getReversedArrayUsingLoop(int... arr){
        usingLopp(arr);
        }

        public void getReversedArrayUsingString(int... arr){
        usingCollection(arr);
     }


}
