public class task1 {

    private String code;

    public task1(String code) {
        this.code = code;
    }

    public boolean chkMath() {
        return code.contains("import java.lang.Math;");
    }

    public String Methods() {
        String res = "";
        String func = "";
        int i = 0;
        while (i != -1) {
            i = code.indexOf("Math.", i);
            func = "";
            if (i != -1) {
                while (code.charAt(i) != '(') {
                    if (code.charAt(i) != '(')
                        func += code.charAt(i);
                    i++;
                }
            }
            if(!res.contains(func))
                res += func + ", ";
        }
        res = res.substring(0, res.length() - 2);
        return res;
    }

    public String vars() {
        String res = "";
        String var = "";
        String type = "";

        return res;
    }

    public String operators() {
        String res = "";
        return res;
    }
}
