import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //DZ 4.2
       int number = 1;
       while (number <= 10) {
           System.out.print(" " + number);
           number ++;}
       System.out.println("");

       for (int numberNew = number - 1; numberNew >=1; numberNew --){
           System.out.print(" " + numberNew);
       }
       //DZ 4.2

    }
}