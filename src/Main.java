import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] lop = {"Lan", "Linh", "Long", "Minh", "My"," Thu"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên cân tìm: ");
        String ten = sc.next();

        boolean b = false;
        for (int i = 0; i <= lop.length; i++){
            if(lop[i].equals(ten)){
                System.out.println("Số thứ tự của sinh viên " + ten + " là: " +  i);
                b = true;
                break;
            }

        }
        if (!b)
            System.out.println("Sinh viên " + ten + " không có trong danh sách");

    }
}