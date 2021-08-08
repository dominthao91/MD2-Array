import java.util.Scanner;

public class RemoveElementFromArray {
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
        System.out.println("các phần tử vừa nhập vào");
        showArray(number);
        System.out.println("");
        System.out.println("nhập vị trí muốn xóa");
        int deleteIndext = scanner.nextInt();
        int[] newArray = removeElementFromArray(number, deleteIndext);
        System.out.print("Mảng sau khi xóa:");
        showArray(newArray);
    }

    public static void showArray(int[] number) {
        for (int x : number) {
            System.out.print(x + ",");
        }
    }

    public static int[] removeElementFromArray(int[] number, int deletedIndex) {
        int[] newArray = new int[number.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < deletedIndex) {
                newArray[i] = number[i];
            } else {
                newArray[i] = number[i + 1];
            }
        }
        return newArray;
    }
}
