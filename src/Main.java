import javax.swing.plaf.synth.SynthToggleButtonUI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("\ntask 1");
        int age = 18;
        if (age >= 18) {
            System.out.printf("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } if (age < 17){

            System.out.println(" Если возраст человека равен " + age + " то он не достиг совершеннолетия , нужно не много подождать.");
        }


        System.out.println("\ntask 2");

        int temperature = 12;
        if (temperature < 5)
        {
            System.out.println(" на улице " + temperature + " градусов, нужно надесть шапку");
        } if (temperature > 5) {
            System.out.println(" на улице " + temperature + " градусов, можно идти без шапки");
        }

            System.out.println("\ntask3");
            int speed = 60;
            if (speed <= 60) {
                System.out.printf(" если скорость " + speed + " km/h ,  то можно ездить спокойно");
            } else {
                System.out.printf("если скоорость " + speed + " km/h ,  то нужно заплатить штраф");

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
        int newAge2 = 7;
        if (newAge2 < 5) {
            System.out.printf(" если возраст ребенка равен " + newAge2 + ", то ему нельзя кататься на аттракционе");
        } else if (newAge2 >= 5 && newAge2 < 14)
        {
            System.out.printf("если возраст ребенка равен " + newAge2 + ", то он может кататься со взрослыми на аттракционе");
        } else   {
            System.out.printf("если возраст ребенка равен " + newAge2 + ",  то он может кататься без взрословго на аттракционе");
        }

        System.out.println("\ntask6");
        int passengers = 100;

        if (passengers <= 60) {
            System.out.println(" в вагоне есть сидячие места");

        } else if (passengers <= 102) {
            System.out.println("в вагоне есть место но только стоячее");

        } else {
            System.out.println("в вагоне уже нет места");

        }

        System.out.println("\ntask7");
        int one =80;
        int two = 99;
        int three = 135;
        if (one >= two && one>=three){
            System.out.println(" наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println(" наибольшее число:" + two);
        } else {
            System.out.println(" наибольшее число:" + three);







        }


    }
}