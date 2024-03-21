package JavaOOP2.person;

public class Person {
     protected String name = "Vô Ưu";
     protected int age = 25;
     protected String gender = "Nữ";
    String adress = "TP.HCM";
    String phone = "08302921";

    void showInfo(){
    System.out.println("Tên: " +name);
    System.out.println("Tuổi: " +age);
    System.out.println("Giới tính: " +gender);
    System.out.println("Địa chỉ: " +adress);
    System.out.println("SĐT: " +phone);
}
    protected Person() {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.adress = adress;
        this.phone = phone;
    }

    public  Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
