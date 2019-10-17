public class task2 {

    private StringBuffer text;

    public task2(String text) { this.text = new StringBuffer(text); }

    public String getText() {
        return text.toString();
    }

    public void n1() {
        text.insert(text.indexOf(".") + 2, "Вставка ");
    }

    public void n2() {
        int c = 0;
        StringBuffer s = new StringBuffer();
        String temp;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i)))
                c++;
            else
                c = 0;
            if (c == 3) {
                temp = "";
                s.setLength(0);
                s.append(text.substring(i - 2, i + 1));
                temp = s.toString() + s.reverse().toString();
                text.replace(i - 2, i + 1, temp);
            }
        }
    }

    public void n3() {
        String line;
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Введите предложение, которое хотите добавить в конец текста: ");
        line = " " + scan.nextLine();
        text.append(line);
    }
}
