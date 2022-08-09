import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //1
        for (int i = 0; i < 10; i++) {
        System.out.println("Итерация цикла " + i);}
        //2
        for (int i = 2020; i < 2070; i = i + 4) {
            System.out.println("Высокосный год " + i);}
        //3
        int salary = 65535;
        int total = 0;
        for (int i = 0; total < 1_000_000; i++) {
            total = total + salary / 100; //капитализация процентов, если ЗП переводится во вклад
            total = total + salary;
            System.out.println(total);
            System.out.println("Месяц " + i + " Итого " + total);}
        //4
        for (int i = 0; total < 1_000_000; i++) {// можно переменную i убрали из цикла и поставить до
            total = total + total / 100; //капитализация процентов, если ЗП переводится во вклад
            total = total + salary;
//          if (i % 5 == 0){ - % это операция получения остатка от деления
            System.out.println("Месяц " + i + " Итого " + total);}
        //5
        int start = 5;
        while (start > 0) {
            System.out.println(start);
            start--;
        }

    }
}