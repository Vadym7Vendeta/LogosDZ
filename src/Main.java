import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();
        if (n % 2 == 0){
            System.out.println("Число парне");
        }else {
            System.out.println("Число непарне");
        }
    }
}
