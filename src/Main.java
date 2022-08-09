import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //DZ 4.1
       int number = 1;
       while (number <= 10) {
           System.out.print(" " + number);
           number ++;}
       System.out.println("");
       for (int numberNew = number - 1; numberNew >=1; numberNew --){
           System.out.print(" " + numberNew);}

       //DZ 4.2
        System.out.println("");
        for (int friday = 5; friday <= 31;  friday ++) {
            friday = friday + 7;
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");}

        //DZ 4.3
        int years = 2017;
        int yearsStart = years - 200;
        int yearsFinish = years + 100;
        while (yearsStart < yearsFinish) {
            System.out.println(yearsStart);
            yearsStart = yearsStart + 79;}

    }
}