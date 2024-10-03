import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Demoblaze {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        String title= driver.getTitle();

        if (title.equals("STORE") ) {
            System.out.println("Page landed on correct website");
        }
        else {
            System.out.println("Page not landed on correct website");
        }

        driver.quit();
    }
}