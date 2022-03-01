public class AlyPracticeCoding {

    public static void main(String[] args){

        //write java method with 3 parameters to find
        //smallest number among three numbers

        double smallestNumber = AlyPracticeCoding.findSmallestNumber(12,3,6);
        System.out.println(smallestNumber);


        //write code to get average of 3 numbers

        double findAverageOfThree = findAverageOfThree(3,4,5);
        System.out.println(findAverageOfThree);

        // given array num, calculate sum of all numbers in array and print out
        // [] = {1,2,3,4...}==10;

        /*int [] num = {1,2,3,4};
        int result = 0;

        for(int i =0; i< num) {
            result +=i;

        }
        System.out.println(result);*/


        //write java program to find index of an array element
        // findIndex(3)==2; Method below (int [] num = {11,24,63,34}, 21)
        // if array is empty - return -1;

        int [] num = {11,22,33,44,55};
       int result = findIndexFromArray(num, 55);
        System.out.println(result);


    }

    public static double findSmallestNumber(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        } else if (y < x && y < z) {
            return y;
        } else {
            return z;
        }


    }

    public static double findAverageOfThree(double x, double y, double z){
        return (x +y+z)/3;

    }


    static int findIndexFromArray (int[] numArr, int value) {
        int index = 0;
        if(numArr.length == 0){ //length w/o parantheses - its for arrays
            return -1;
        } else {
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == value) {
                index = i;
                return index;
            } else {
                return -1;
            } // this exercise is unfinished
        }
            return index;
        }

    }
}
