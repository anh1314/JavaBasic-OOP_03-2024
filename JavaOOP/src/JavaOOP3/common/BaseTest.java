package JavaOOP3.common;
public class BaseTest {
    public void createDriver(){
        System.out.println("Run on browser " +Constants.browser);
        System.out.println("Report is " +Constants.report);
        System.out.println("Headless is " +Constants.headless);
    }
    public  void closeDriver(){
        Constants constants = new Constants();
              System.out.println("Close the browser " +  constants.getBrowser("Chrome"));
    }
}
