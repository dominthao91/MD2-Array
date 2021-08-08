import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int counter, i = 0, j = 0;
        int temp;
        int[] number = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số phần tử trong mảng");
        counter = scanner.nextInt();
        for (i = 0; i < counter; i++) {
            System.out.print("Phần tử" + (i + 1) + ":");
            number[i] = scanner.nextInt();
        }
        j = i - 1;
        i = 0;
        scanner.close();
        while (i < j) {
            temp = number[i];
            number[i] = number[j];
            number[j] = temp;
            i++;
            j--;
        }
        System.out.println("mảng sau khi đảo đảo ngược");
        for (i = 0; i < counter; i++) {
            System.out.print(number[i] + " ");
        }

    }
}
