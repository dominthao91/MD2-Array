import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name student");
        String inputName = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println(inputName + "vị trí thứ " + (i)+"trong mảng");
                isExit = true;
                break;
            }
        }
        if (!isExit) {
            System.out.println("không có" + inputName + "trong mảng");
        }
    }
}