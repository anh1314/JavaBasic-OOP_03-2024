package homework.javabasic.collection5;
import java.util.ArrayList;
import java.util.List;
class NhanVien { //class cha
    String ten; int tuoi; double luong;
    // Phương thức trong class con phải cùng cùng tên, cùng tham số
    public NhanVien(String ten, int tuoi, double luong) {  //class con
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
    }
    // Phương thức toString() được sử dụng để chuyển đổi đối tượng thành 1 chuỗi đại diện của nó
    //  Phương thức toString() được ghi đè (@Override) trong class NhanVien
    //  và trả về chuỗi chứa thông tin của đối tượng NhanVien
    @Override //ghi đè phương thức từ class cha trong class con
    public String toString() {
        return "Tên: " + ten + ", Tuổi: " + tuoi + ", Lương: " + luong;
    }
}
public class collection_employee {
    public static void addNhanvien(List<NhanVien> nhanvien, String ten, int tuoi, double luong){
        NhanVien NV = new NhanVien(ten, tuoi, luong);
        nhanvien.add(NV);
    }
    public static void main(String[] args) {
        List<NhanVien> nhanvien = new ArrayList<>();
        addNhanvien(nhanvien, "Thu Nhi", 25, 1000000);
        addNhanvien(nhanvien, "Phong Vu", 26, 1200000);
        for ( int i = 0; i < nhanvien.size(); i++ ){
            System.out.println(nhanvien.get(i));
        }
    }
}
