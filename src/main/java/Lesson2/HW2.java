package Lesson2;
public class HW2 {

    public static void main(String[] args) {

        byte byteV=10;
        int intV=10;
        long longV;

        char charV;

        float floatV=5.2f;
        short shortV=5;
        double doubleV;



        int year = 2024;


        System.out.println(methodB(intV,floatV));
        methodC(intV);
        System.out.println(methodD(intV));
        methodF(year);
    }


    public static boolean methodB(int a, float b){
        if(a + b <10 || a + b >20 ){
            return false;
        }
        return true;
    }

    public static void methodC(int a){
        if(a<0){
            System.out.println("Число отрицательное.");
        }
        else {
            System.out.println("Число положительное.");
        }
    }


    public static boolean methodD(int a){
        if(a<0){
            return true;
        } else {
            return false;
        }
    }




    public static void methodF(int year){
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println("Год высокосный");
        }
        else {
            System.out.println("Год не высокосный");
        }
    }
}