package Klausur2;

import java.util.Arrays;

public class ArrayHelper {

    public static void main(String[] args) {
        int[] array  =  {8,5,1,9,0,4};
        arrangeOrder(array);
        System.out.println(Arrays.toString(array));



    }



    public static void arrangeOrder(int[] numbers){
    int help;
    for(int i=0;i< numbers.length-1;i++){
        for(int j = i +1; j<numbers.length; j++){

            if(numbers[i]>numbers[j]) {
                help = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = help;
            }

    }



    }


}
}
