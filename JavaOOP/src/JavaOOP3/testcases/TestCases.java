package JavaOOP3.testcases;

import JavaOOP3.common.BaseTest;

public class TestCases extends BaseTest {
    public  void testLogin(){
        createDriver();
        System.out.println("Navigate to URL https://cms.anhtester.com/login");
        System.out.println("Set email valid");
        System.out.println("Enter password");
        System.out.println("Click on Login botton ");
        System.out.println("Confirm successful login ");
        closeDriver();
    }

    public  void testAddCategory(){
        createDriver();
        System.out.println("Confirm successful login, at the homepage");
        System.out.println("Navigate to the Dashboard, under the Product section, select Category");
        System.out.println("Click on Add new category");
        System.out.println("In the Category Information, fill in the fields: Name, Parent Category, Ordering Number ");
        System.out.println("In the Category Information, select valid fields: Type, Banner , Icon, Filtering Attributes");
        System.out.println("In the Category Information, fill in the fields: Meta Title, Meta Description");
        System.out.println("Check all information fields are valid, then click Save");
        System.out.println("The system displays a message : Category has been inserted successfully");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        System.out.println("\n====Login====" );
        testCases.testLogin();
        System.out.println("\n===Add Category===");
        testCases.testAddCategory();
    }
}

