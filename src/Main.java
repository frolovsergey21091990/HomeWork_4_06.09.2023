public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 18;
        if (age < 18) {
            System.out.println("не достиг совершеннолетия");
        } else {
            System.out.println("достиг совершеннолетия");
        }
        System.out.println("Задача 2");
        int temperature = 10;
        if (temperature < 5) {
            System.out.println("на улице " + temperature + " градусов нужно надеть шапку");
        } else {
            System.out.println("на улице " + temperature + " градусов можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется платить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println("Задача 4");
        int agePeople = 16;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в детский сад");
        } else {
            if (agePeople >= 7 && agePeople <= 17) {
                System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в школу");
            } else {
                if (agePeople >= 18 && agePeople <= 24) {
                    System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в университет");
                } else {
                    if (age > 24) {
                        System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить на работу");
                    }
                }
            }
            System.out.println("Задача 5");
            int ageChildren = 3;
            if (ageChildren <= 5) {
                System.out.println("Если возраст равен " + ageChildren + ", то ему нельзя кататься на атракционе");
            }
            if (ageChildren > 5 && ageChildren <= 14) {
                System.out.println("Если возраст равен " + ageChildren + ", то ему можно кататься на атракционе в сопровождении взрослого");
            } else {
                if (ageChildren > 14)
                    System.out.println("Если возраст равен " + ageChildren + ", то ему можно кататься на атракционе без сопровождения взрослого");
            }

            System.out.println("Задача 6");
            int place = 110;
            int seatPlace = 60;
            int totalPlace = 102;
            if (place < totalPlace) {
                if (place <= seatPlace) {
                    System.out.println("есть сидячее место");
                } else {
                    System.out.println("есть стоячее место");
                }
            } else {
                System.out.println("мест больше нет");
            }
            System.out.println("Задача 7");
            int one = 2;
            int two = 3;
            int three = 1;
            if (one > two && one > three) {
                System.out.println(one);
            } else {
                if (two > one && two > three) {
                    System.out.println(two);
                } else {
                    System.out.println(three);
                }
            }
        }
    }
}

