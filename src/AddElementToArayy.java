import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArayy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int[] arrNumber = new int[5];
       int size,index,inputAdd;

        System.out.println("nhập số lượng phần tử trong mảng");
        size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("phần tử thứ "+ i+ ":");
            arrNumber[i] = scanner.nextInt();
        }
        System.out.println("các phầm tử vừa nhập vào là");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print(arrNumber[i]+",");
        }
        System.out.println("");
        System.out.println("nhập vị trí muốn thêm");
        index = scanner.nextInt();
        System.out.println("nhập số muốn thêm");
        inputAdd =scanner.nextInt();
        System.out.println("mảng sau khi thêm");
        displayArray(addToArray(index,inputAdd,arrNumber));
    }
    public static void displayArray(int[] array){
        for (int element : array) {
            System.out.print(element + ", ");
        }
    }

    public static int[] addToArray(int index, int input, int[] array) {
        int[] newArray = new int[array.length+1];
        for (int i = 0; i < newArray.length; i++) {
            if (index > i){
                newArray[i] = array[i];
            }else if (index == i){
                newArray[i] = input;
            }else {
                newArray[i] = array[i - 1];

            }
        }
        return newArray;
    }

}