import java.lang.reflect.Array;

public class Kamol_Practice {

    public static void main(String[] args) {
        // Write a Java method with 3 params to find
        // the smallest number among three numbers.
        /*double smallestNumber = Kamol_Practice.findSmallestNumber(12, 33, 6);
        System.out.println(smallestNumber);

        // Write a Java method to compute the average of three numbers
        // Formula: 1 + 2 + 3 / 3
        double findAvgOfThreeNumbers =  findAvgOfThreeNumbers(3, 4, 5);
        System.out.println(findAvgOfThreeNumbers);*/

        int [] num = {22, 33, 44, 55, 66};

        int result = findIndexFromArray(num, 44);  // 3
        System.out.println(result);

        //System.out.println(Kamol_Practice.findIndexFromArray(num, 22));


        //Given an array num, calculate the sum
        // of all numbers in the array and print out to the console

        // [] = {1, 2, 3, 4} == 10
        //int [] num = {1, 2, 3, 4};
        /*int result = 0;

        for (int i : num) {
            result += i;
        }
        System.out.println(result);*/



        //Write a Java method to find the index of an array element.
        //findIndex(int [] num = {11, 24, 63, 34}, 24) == 1
        // if array is empty return -1;






    }

     static double findSmallestNumber(double x , double y , double z){

      /*  if (x < y && x < z){
            return x;
        }else if ( y < x && y < z){
            return y;
        }else{
            return z;
        }*/

        return Math.min(Math.min(x, y), z);
    }


     static double findAvgOfThreeNumbers(double x , double y , double z){

        return (x + y + z)/3;
    }

    static int findIndexFromArray(int [] numArr, int value) {


        int index = 0;

        if (numArr.length == 0) {
            return -1;
        } else {

            for (int i = 0; i < numArr.length; i++) {

                if (numArr[i] == value) {
                    index = i;
                   return index;

                }
            }
            return index;
        }
    }
}
