import java.util.Scanner;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        int[] number = new int[10];
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số phần tử trong mảng");
        size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử" + (i) + ":");
            number[i] = scanner.nextInt();
        }
        System.out.println("các phần tủ vừa nhập vào");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
        }
        System.out.println("");
        int max = number[0];
        int index = 1;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
                index = i + 1;
            }
        }
        System.out.println("phàn tử lớn nhất là " + max + " ở vị trí thứ " + index);
    }
}
