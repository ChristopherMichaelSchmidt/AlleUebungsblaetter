package Klausur1;

public class NumberHelper {
    public static boolean isSortedArray(int[] numbers){
        for(int i=0; i<numbers.length;i++){
            if (numbers[i] > numbers[i+1]) {
                return false;
            }

        }

        return true;
    }


        public static int[] removeDuplicates(int[] numbers){

            for(int i=0; i< numbers.length;i++){
                for(int j=i+1; j<numbers.length-1;j++){
                    if(numbers[i] == numbers[j]){
                        numbers[j] = -1;

                    }


                }


            }
        return numbers;

        }




}
