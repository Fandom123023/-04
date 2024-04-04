public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("\ntask 1");
        int age = 18;
        if (age >= 18) {
            System.out.printf("Если возраст человека равен %s, то он совершеннолетний.\n", age);
        } else {

            System.out.println(" нужно не много подождать ");
        }


        System.out.println("\ntask 2");

        int temperature = 5;
        if (temperature < 5) {


            System.out.println("нужно надесть шапку");
        } else {
            System.out.println("можно идти без шапки");

            System.out.println("\ntask3");
            int speed = 60;
            if (speed <= 60) {
                System.out.printf(" если скорость %s то можно ездить спокойно\n", speed);
            } else {
                System.out.printf("если скоорость %s то нужно заплатить штраф\n", speed);
            }
        }
        System.out.println("\ntask4");
        int newAge = 2;
        if (newAge >= 2 && newAge <= 6) {
            System.out.printf("если возраст человека %s то он ходит в садик\n", newAge);

        } else if (newAge >= 7 && newAge <= 17) {
            System.out.printf("если возраст человека %s то он ходит школу\n", newAge);
        } else if (newAge >= 18 && newAge <= 24) {
            System.out.printf("если возраст человека %s то он ходит университет\n", newAge);
        } else if (newAge > 24) {
            System.out.printf("если возраст человека %s то он ходит на работу\n", newAge);
        }

        System.out.println("\ntask5");
        int newAge2 = 5;
        if (newAge2 >= 5 && newAge2 <= 14) {
            System.out.printf("если возраст ребенка %s то он может кататься со взрослыми\n", newAge2);
        } else if (newAge2 > 14) {
            System.out.printf("если возраст ребенка %s то он может кататься без взрословго\n", newAge2);
        }
        System.out.println("\ntask6");
        int capacity = 102;
        int seatingArea = 60;
        int occupiedPlaces = 20;
        if (occupiedPlaces < seatingArea) {
            System.out.println("есть свободные сидячие места");

        } else if (occupiedPlaces == capacity) {
            System.out.println("нет свободных мест");
        } else if (seatingArea < occupiedPlaces) {
            System.out.println("нет сидячих мест");
        } else if (capacity > occupiedPlaces) {
            System.out.println(" свободных мест больше чем занятых");

        }

        System.out.println("\ntask7");
        int one =80;
        int two = 99;
        int three = 135;
        if (one >= two && one>=three){
            System.out.println(" наибольшее число " + one);
        } else if (two >= one && two >= three) {
            System.out.println(" наибольшее число " + two);
        } else if (three >= one && three >= two){
            System.out.println(" наибольшее число " + three);







        }


    }
}