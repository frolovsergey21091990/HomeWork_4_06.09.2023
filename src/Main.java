public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задача 1");
        int age = 18;
    if (age < 18) {
        System.out.println("не достиг совершеннолетия");
    }
    else {
        System.out.println("достиг совершеннолетия");
    }
        System.out.println("Задача 2");
    int temperature = 10;
    if (temperature < 5) {
        System.out.println("на улице " + temperature + " градусов нужно надеть шапку");
    }
    else {
        System.out.println("на улице " + temperature + " градусов можно идти без шапки");
    }
        System.out.println("Задача 3");
int speed = 70;
if (speed > 60) {
    System.out.println("Если скорость " + speed + ", то придется платить штраф");
}
else {
    System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
}
        System.out.println("Задача 4");
int agePeople = 25;
if (agePeople >= 2 && agePeople <=6) {
    System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в детский сад");
}
        if (agePeople >= 7 && agePeople < 17) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в школу");
        }
        if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить на работу");
        }
        System.out.println("Задача 5");
        int ageChildren = 16;
        if (ageChildren <= 5) {
            System.out.println("Если возраст равен " + ageChildren + ", то ему нельзя кататься на атракционе");
        }
        if (ageChildren > 5 && ageChildren <= 14) {
            System.out.println("Если возраст равен " + ageChildren + ", то ему можно кататься на атракционе в сопровождении взрослого");
        }
        else {
            System.out.println("Если возраст равен " + ageChildren + ", то ему можно кататься на атракционе без сопровождения взрослого");
        }
        System.out.println("Задача 6 _ не совсем понял как сделать else");
int passengers = 60;
        if (passengers >= 60 && passengers <= 102) {
            System.out.println("есть стоячие места");
        }
        if (passengers < 60) {
        System.out.println("есть сидячие места");
        }  else {
    System.out.println("мест нет");
                 }
        System.out.println("Задача 7");
    int one = 10;
        int two = 20;
        int three = 30;
        if (one < two || two > three) {
            System.out.println(two);
        }
            if (three > two && three > one) {
                System.out.println(three);
            }
            else { System.out.println(one);
                            }

    }

    }
