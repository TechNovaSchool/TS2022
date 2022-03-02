public class Mika_2022 {

   public static void printName(){
       System.out.println("Mika");
   }

    public static void main(String[] args) {
        System.out.println(Mika_2022.findSmallestNumber(56, 34, 68));

        double result1 = Mika_2022.avgOfThree(34, 2, 66);
        System.out.println(result1);

        int [] num = {1, 2, 3, 4};
        int result = 0;
        for(int i =0; i < num.length; i++) {
            result += num[i];
        }
        System.out.println(result);

        int [] xx = {12, 4243, 21, 23};

        System.out.println(Mika_2022.findIndexOf(xx, 21));


    }

    //write a java method with 3 params to find
    //the smallest number among three numbers

    public static int findSmallestNumber(int x, int y, int z){
       /*if(x < y && x < z){
           return x;
       } else if(y < x && y < z){
           return y;
       } else {
           return z;
       }*/
        return Math.min(Math.min(x, y), z);
    }

    //java method that calculates the average of given 3 numbers
    public static double avgOfThree(double x, double y, double z){
        return (x+y+z)/3;
    }

    //to find the index of an array element
    static int findIndexOf(int [] no, int value) {
       int index = 0;
        if (no.length == 0) {
            return -1;
        } else {
            for (int i = 0; i < no.length; i++) {
                if (no[i] == value) {
                    index = i;
                }
            }
        } return index;
    }


}
