//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    private static boolean runNextGame(Scanner scan) {
        System.out.println("Попробуешь еще раз? (да/нет)");
        String answer = scan.nextLine().trim().toLowerCase();

        while (!answer.equals("да") && !answer.equals("нет")) {
            System.out.println("Пожалуйста, введите 'да' или 'нет':");
            answer = scan.nextLine().trim().toLowerCase();
        }

        return answer.equals("да");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("Введите первое число: ");
            int num1 = scan.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = scan.nextInt();
            System.out.println("Введите действие ( + , - , * , /)");
            scan.nextLine(); // Очистка буфера
            String d = scan.nextLine().trim();

            switch (d) {
                case "+":
                    int res1 = num1 + num2;
                    System.out.println("Сумма равна: " + res1);
                    break;
                case "-":
                    int res2 = num1 - num2;
                    System.out.println("Вычитание равно: " + res2);
                    break;
                case "*":
                    int res3 = num1 * num2;
                    System.out.println("Умножение равно: " + res3);
                    break;
                case "/":
                    if (num2 != 0) {
                        int res4 = num1 / num2;
                        System.out.println("Деление равно: " + res4);
                    } else {
                        System.out.println("Делить на 0 нельзя!");
                    }
                    break;
                default:
                    System.out.println("Неизвестное действие!");
                    break;
            }

            run = runNextGame(scan);
        }

        System.out.println("Спасибо за использование калькулятора!");
        // scan.close(); // Не закрываем Scanner, чтобы не блокировать System.in
    }
}
