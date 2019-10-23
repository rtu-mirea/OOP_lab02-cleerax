import java.util.regex.*;

public class task3 {

    public boolean n1(String line) {
        Pattern p = Pattern.compile("[\"']\\d+[\"']");
        Matcher m = p.matcher(line);
        return m.find();
    }

    public String n2(String line) {
        Pattern p = Pattern.compile("[\"']\\d+[\"']");
        Matcher m = p.matcher(line);
        int a;
        String s = line;
        while (m.find()) {
            a = Integer.parseInt(m.group().substring(1, m.group().length() - 1)) * 2;
            s = "" + m.group().charAt(0) + a + m.group().charAt(m.group().length() - 1);
            line = line.replace(m.group(), s);
        }
        return line;
    }
}