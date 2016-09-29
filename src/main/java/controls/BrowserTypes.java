package controls;

public enum BrowserTypes {
    firefox {
        void start() {
            System.setProperty("webdriver.chrome.driver", "drivers/geckodriver.exe");
            System.setProperty("selenide.browser", "firefox");
        }

    },
    chrome {
        void start() {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            System.setProperty("selenide.browser", "chrome");
        }
    },
    ie {
        void start() {
            System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
            System.setProperty("selenide.browser", "ie");
        }
    }
}
