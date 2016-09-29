package pages;

import static com.codeborne.selenide.Selenide.*;

public class ApplicationPage {

    public void load(String path) {
        open(path);
    }
}
