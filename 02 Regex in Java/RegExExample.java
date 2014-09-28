import java.util.regex.*;

public class RegExExample {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d+");       
        Matcher m = p.matcher("000123");
        if (m.matches()) {
            System.out.println("YEAH!");
        }
    }
}
