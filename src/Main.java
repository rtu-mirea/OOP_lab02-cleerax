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
                    String code = "public class task1code {\n" +
                            "    public void code() {\n" +
                            "        double x = Math.pow(4, 1.0/2);\n" +
                            "        x = Math.pow(4, 2);\n" +
                            "        x = Math.sqrt(x);\n" +
                            "        x = Math.abs(-4);\n" +
                            "        int borya = Math.abs(-2);\n" +
                            "        int vitya = Integer.parseInt(\"5862\");\n" +
                            "        String s = Integer.toString(vitya);\n"+
                            "    }\n" +
                            "}";
                    task1 t1 = new task1(code);
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
                                System.out.println(t1.chkMath());
                                break;
                            case ("2"):
                                System.out.println(t1.Methods());
                                break;
                            case ("3"):
                                System.out.println(t1.vars());
                                break;
                            case ("4"):
                                System.out.println(t1.operators());
                                break;
                            case ("0"):
                                break;
                            default:
                                System.out.println("Неверное значение");
                        }
                    }
                    choice2 = "";
                    break;
                case("2"):
                    String t = "Я родился в 52 13 531 маленькой деревне. Я был еще 545 ребенком, когда на н491ас напали " +
                            "солдаты. Иностранные5845 солдаты.";
                    task2 t2 = new task2(t);
                    System.out.println("Исхожный текст: " + t);
                    t2.n1();
                    System.out.println("Вставлено слово \"Вставка\" перед первым словом.\r\nПолученный текст: " + t2.getText());
                    t2.n2();
                    System.out.println("Трехзначные числа заменены палиндромами.\r\nПолученный текст: " + t2.getText());
                    t2.n3();
                    System.out.println("Полученный текст: " + t2.getText());
                    break;
                case("3"):
                    Scanner s = new Scanner(System.in);
                    task3 t3 = new task3();
                    while(!choice2.equals("0")) {
                        System.out.println("Выберите задачу:\r\n" +
                                "1. Определить, что строка содержит целое число, заключенное в кавычки\r\n" +
                                "2. Дана строка с целыми числами. Найти числа, стоящие в кавычках и увеличить их в два раза\r\n" +
                                "0. Выход");

                        choice2 = scan.nextLine();

                        switch (choice2) {
                            case ("1"):
                                System.out.print("Введите строку: ");
                                System.out.println(t3.n1(s.nextLine()) ? "Верно" : "Неверно");
                                break;
                            case ("2"):
                                System.out.print("Введите строку: ");
                                System.out.println("Полученная строка: " + t3.n2(s.nextLine()));
                                break;
                            case ("0"):
                                break;
                        }
                    }
                    choice2 = "";
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