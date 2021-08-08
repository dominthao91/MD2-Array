import java.util.Scanner;

public class TemperatureSwitch {
    public static double celsiusToFahrenheit(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }

    public static double fahrenheitToCelsius(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return  doC;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1 . CelsiusToFahrenheit");
            System.out.println("2 . FahrenheitToCelsius");
            System.out.println("0 . Exit");
            System.out.println("Enter your choice");
            choice =scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhập dộ C");
                    celsius = scanner.nextDouble();
                    System.out.println(celsius + " độ C = " + celsiusToFahrenheit(celsius)+" độ F");
                    break;
                }
                case 2: {
                    System.out.println("Nhập dộ F");
                    fahrenheit = scanner.nextDouble();
                    System.out.println(fahrenheit + " độ F = " + fahrenheitToCelsius(fahrenheit)+" độ C");
                    break;
                }
                case 0: {
                    System.exit(0);
                }
            }

        } while (choice != 0) ;
    }
}