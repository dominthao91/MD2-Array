import java.util.Scanner;

public class FindMinValueInArray {
    public static void main(String[] args) {
        int[] number = new int[5];
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số phần tử trong mảng");
        size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử" + (i) + ":");
            number[i] = scanner.nextInt();
        }
        System.out.println("các phần tử vừa nhập vào");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+",");
        }
        System.out.println("");
        int min = number[0];
        int index = 1;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
                index = i + 1;
            }
        }
        System.out.println("phàn tử nhỏ nhất là " + min + " ở vị trí thứ " + index);
    }
}