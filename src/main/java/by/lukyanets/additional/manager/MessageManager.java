package by.lukyanets.additional.manager;

import java.util.Locale;
import java.util.ResourceBundle;

public enum MessageManager {
    EN(ResourceBundle.getBundle("text", new Locale("en", "EN"))),
    BY(ResourceBundle.getBundle("text", new Locale("be", "BY")));


    private ResourceBundle bundle;

    MessageManager(ResourceBundle bundle) {
        this.bundle = bundle;
    }

    public String getString(String key) {
        return bundle.getString(key);
    }
}
