public class Main {
    public static void main(String[] args) {
        //task1
        int intVar = 4;
        byte byteVar = 1;
        short shortVar = 1;
        long longVar = 1;
        float floatVar = 1.0f;
        double doubleVar = 1.0d;

        System.out.println("Значение переменной intVar с типом int равно " + intVar);
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar);
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar);
        System.out.println("Значение переменной longVar с типом long равно " + longVar);
        System.out.println("Значение переменной floatVar с типом float равно " + floatVar);
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar);
        //task2
        double firstDig = 27.12;
        long secondDig = 987678965549L;
        double thirdDig = 2.786;
        short fourthDig =  569;
        short fifthDig = -159;
        short sixthDig = 27897;
        byte seventhDig = 67;

        //task3
        byte lpPupils = 23;
        byte asPupils = 27;
        byte eaPupils = 30;
        System.out.println("На каждого ученика рассчитано " + 480 / (lpPupils + asPupils + eaPupils) + " листов бумаги");

        //task4
        int bottles = 16;
        int minutes = 2;
        int bottlesPerMinute = bottles / minutes;

        System.out.println("За 20 минут машина произвела " + bottlesPerMinute * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerMinute * 60 * 24 + " штук бутылок");
        System.out.println("За 3 дня минут машина произвела " + bottlesPerMinute * 60 * 24 * 3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesPerMinute * 60 * 24 * 30 + " штук бутылок");

        //task5
        int cans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int classes = cans / (whitePerClass + brownPerClass);
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePerClass * classes + " банок белой краски и " + brownPerClass * classes + " банок коричневой краски");

        //task6
        int banana = 5;
        int milk = 2;
        int iceCream = 2;
        int eggs = 4;
        int grBanana = 80;
        int grMilk = 105;
        int grIceCream = 100;
        int grEggs = 70;

        int totalGrams = banana * grBanana + milk * grMilk + iceCream * grIceCream + eggs * grEggs;
        System.out.println("Вес в граммах " + totalGrams + ", в килограммах " + totalGrams / 1_000D);
    }
}