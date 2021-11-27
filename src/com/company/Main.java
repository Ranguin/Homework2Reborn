package com.company;

public class Main {

    public static void main(String[] args) {
        byte clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        byte clientOS2 = 1;
        short clientDeviceYear = 2013;
        if (clientOS2 == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        int year = 2021;
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " год  является високосным");
            }
            else System.out.println(year + " год не является високосным");
        }


        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка в пределах 20 км занимает сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка в пределах от 20 км до 60 км занимает двое суток.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка в пределах от 60 км до 100 км занимает трое суток");
        } else System.out.println("Далековато _-_");


        byte monthNumber =  12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка!");
        }
    }
}
