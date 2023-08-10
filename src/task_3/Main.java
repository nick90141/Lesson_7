package task_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Except extends Exception{
    public Except(String message) {
        super(message);
    }

    public void method() {
        System.out.println("Мій Виняток!");
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Price[] price = new Price[2];

        for (int i = 0; i < price.length; i++) {
            System.out.println("Введите данные про магазин №" + (i + 1));
            System.out.print("Введите название товара: ");
            String good = in.next();
            System.out.print("Введите название магазина: ");
            String magazine = in.next();
            System.out.print("Стоимость товара в ГРН: ");
            double priceUAH = in.nextDouble();

            price[i] = new Price(good, magazine, priceUAH);

        }
        Arrays.sort(price, Comparator.comparing(Price::getmagazine));

        System.out.println("\nСписок магазинов:");
        for (Price p : price) {
            System.out.println(p);
        }
        System.out.print("\nВведите название товара который интересует: ");
        String search = in.next();
        boolean found = false;

        try {
            for (Price p : price) {
                if (p.getGood().equalsIgnoreCase(search)) {
                    System.out.println("Товар: " + p.getGood());
                    System.out.println("Стоимость: " + p.getPriceUAH() + " грн");
                    found = true;
                }
            }
            if (!found) {
                throw new Except("Вы ввели неверное название товара!");
            }
        } catch (Except e) {
            System.out.println(e.getMessage());
            in.next();
        }
    }
}


