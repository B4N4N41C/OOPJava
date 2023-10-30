import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите через пробел марку машины модель, год выпуска и цену: ");
            String[] carStrings = input.nextLine().split(" ");
            Car car = new Car(carStrings[0], carStrings[1], Integer.parseInt(carStrings[2]),
                    Integer.parseInt(carStrings[3]));
            System.out.print("Введите через пробел Имя, уровень мастерства от 1 до 3, день, месяц и год рождения: ");
            String[] masterStrings = input.nextLine().split(" ");
            Master master = new Master(masterStrings[0], Integer.parseInt(masterStrings[1]),
                    Integer.parseInt(masterStrings[2]), Integer.parseInt(masterStrings[3]),
                    Integer.parseInt(masterStrings[4]));
            System.out.print("Введите сколько частей машины вы повредили: ");
            int parts = input.nextInt();
            Repair repair = new Repair(parts, master, car);
            System.out.println(repair.toString());
            System.out.println(repair.determiningTheCost());
        }
    }
}
