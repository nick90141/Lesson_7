package task_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Worker[] workers = new Worker[5];

        for (int i = 0; i < workers.length; i++) {
            System.out.println("Введите данные про работника №" + (i + 1));
            System.out.print("Фамилия и имя: ");
            String name = in.next();
            System.out.print("Должность: ");
            String position = in.next();

            int year;
            do {
                try {
                    System.out.print("Год начала работы: ");
                    year = in.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Неправильный год");
                    in.next();
                    year = -1;
                }

            } while (year == -1);
            workers[i] = new Worker(name, position, year);
        }

        Arrays.sort(workers, Comparator.comparing(Worker::getName));


        System.out.println("\nСписок работников:");
        for (Worker worker : workers) {
            System.out.println(worker);
        }
        System.out.print("\nВведите опыт работы: ");
        int year_at_work = in.nextInt();
        System.out.println("\nРаботники с опытом больше " + year_at_work + " лет:");
        for (Worker worker : workers) {
            if (2023 - worker.experience() > year_at_work) {
                System.out.println(worker.getName() + ", опыт: " + (2023 - worker.experience()) + " лет");
            }
        }
    }
}
