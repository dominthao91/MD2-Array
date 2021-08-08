import java.util.Scanner;

public class DemKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhập vào chuỗi kí tự");
        String strings = scanner.nextLine();
        System.out.println("nhập kí tự muốn kiểm tra");
        char character = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < strings.length(); i++) {
            if (character == strings.charAt(i)){
                count++;
            }
        }
        System.out.printf("số lần xuất hiện của %c trong chuỗi = %d",character,count);
    }
}
