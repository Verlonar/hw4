package ru.verlonar;

public class Main {

    public static void main(String[] args) {
	    //задание 1
        task1();
        split();

        //задание 2
        task2();
        split();

        //задание 3
        task3();
        split();
    }

    public static void task1() {
        int i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        i = 10;

        for (;i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void task2() {
        int i = 7;

        for (; i < 31; i += 7) {
            if (i % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
            }
        }
    }

    public static void task3() {
        int start = 0;
        int currentYear = 2022;
        int observationFrom = currentYear - 200;
        int observationTo = currentYear + 100;

        for (; start <= observationTo; start += 79) {
            if (start >= observationFrom) {
                System.out.println(start);
            }
        }
    }

    public static void split() {
        System.out.println("------------------------------------------------");
    }
}
