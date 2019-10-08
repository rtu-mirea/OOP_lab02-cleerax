import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice = "";
        String choice2 = "";

        while (!choice.equals("0")) {
            System.out.println("Выберите задание:\r\n" +
                    "1. Задание 1\r\n" +
                    "2. Задание 2\r\n" +
                    "3. Задание 3\r\n" +
                    "0. Выход");

            choice = scan.nextLine();

            switch(choice) {
                case("1"):
                    while(!choice2.equals("0")) {
                        System.out.println("Выберите задачу:\r\n" +
                                "1. Определить, была ли подключена библиотека математических функций\r\n" +
                                "2. Сформировать список (строку) математических функций, используемых в программе\r\n" +
                                "3. Сформировать список переменных, указав их тип, которым присваивалось вычисленное " +
                                "с помощью функций значение\r\n" +
                                "4. Найти операторы, которые конвертируют строковые значения в числовой формат и наоборот\r\n" +
                                "0. Выход");

                        choice2 = scan.nextLine();

                        switch(choice2) {
                            case ("1"):
                                break;
                            case ("2"):
                                break;
                            case ("3"):
                                break;
                            case ("4"):
                                break;
                            case ("0"):
                                break;
                            default:
                                System.out.println("Неверное значение");
                        }
                    }
                    break;
                case("2"):
                    break;
                case("3"):
                    break;
                case("0"):
                    break;
                default:
                    System.out.println("Неверное значение");
                    break;
            }
        }
    }
}
