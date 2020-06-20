package ua.com.alevel.nix.pavlohnatenko.module1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Level2Task1 {

    public static boolean isPermissible(String s) {
        Pattern pattern1 = Pattern.compile("\\(.+\\)");
        Pattern pattern2 = Pattern.compile("\\[.+]");
        Pattern pattern3 = Pattern.compile("\\{.+}");

        Matcher matcher1 = pattern1.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);
        Matcher matcher3 = pattern3.matcher(s);

        return matcher1.find() || matcher2.find() || matcher3.find() || s.isEmpty();
    }
}
