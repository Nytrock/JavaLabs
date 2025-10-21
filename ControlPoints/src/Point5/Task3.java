package Point5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        System.out.println(isDate(date));
    }

    public static boolean isDate(String str) {
        String regex = "^(31/(01|03|05|07|09|11))|((30|29)/(01|03|05|07|09|11|04|06|08|10|12))|(0[1-9]|1\\d|2[0-8]/(0[1-9]|1[0-2]))/((16|1[7-9]|[2-9]{2})\\d\\d)";
        regex += "(29/02/())$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
