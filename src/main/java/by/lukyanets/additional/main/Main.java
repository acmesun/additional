package by.lukyanets.additional.main;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - eng\n2 - bel\nany - default");
        char i = 0;
        try {
            i = (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String country = "";
        String language = "";
        switch (i) {
            case '1':
                language = "en";
                country = "US";
                break;
            case '2':
                language = "be";
                country = "BY";
                break;
        }
        Locale current = new Locale(language, country);
        ResourceBundle bundle = ResourceBundle.getBundle("text", current);
        String s1 = bundle.getString("str1");
        System.out.println(s1);
        String s2 = bundle.getString("str2");
        System.out.println(s2);
    }
}
