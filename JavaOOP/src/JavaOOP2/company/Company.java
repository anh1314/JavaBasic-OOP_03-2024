package JavaOOP2.company;

import JavaOOP2.person.Person;

public class Company extends Person  {
   public Company (){
       super();
   }
public  void showInfo(){
    System.out.println("Tên: " +name);
    System.out.println("Tuổi: " +age);
    System.out.println("Giới tính: " +gender);
}

    public static void main(String[] args) {
       Company company = new Company();
       company.showInfo();
   }
}



