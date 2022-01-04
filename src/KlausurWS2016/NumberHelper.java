package KlausurWS2016;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {
        int[][] array = { {3,5,8}, {6,3,2}};
        System.out.println(Arrays.toString(getFlatArray(array)));

    }


    public static int[] getFlatArray(int[][] numbers){

        ArrayList<Integer> hilf2= new ArrayList<>();
        for(int i=0; i<numbers.length;i++){
            for(int j = 0; j<numbers[i].length;j++){
                hilf2.add(numbers[i][j]);

            }


        }
        int[] hilf = new int[hilf2.size()];

       for(int i =0; i< hilf2.size();i++){
           hilf[i] = hilf2.get(i);



        }
        return hilf;


    }



}
