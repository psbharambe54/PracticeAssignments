import arrayprograms.ReversedArrayProg;

import java.util.Arrays;

import static stringprograms.AllStringFunctions.getCharCount;
import static stringprograms.AllStringFunctions.printUniqueChar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,8,9};
        int[] arr1 = Arrays.copyOf(arr, arr.length);
           getCharCount("abbccd");
        System.out.println("***************************************************");
            printUniqueChar("bbaackko");
        System.out.println("***************************************************");

        System.out.println("reversed array using loop: ");
            new ReversedArrayProg().getReversedArrayUsingLoop(arr);

        System.out.println("reversed array using collection: ");
        new ReversedArrayProg().getReversedArrayUsingString(arr1);

        System.out.println("***************************************************");



    }

}