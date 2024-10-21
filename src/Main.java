import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ввод числа
        System.out.print("Введите число: ");
        String in = sc.nextLine();
        //создаю стек и заношу значения
        Stack<Character> s = new Stack<>();
        for (char digit : in.toCharArray()) {
            s.push(digit);
        }
        // Извлекаем цифры из стека и формируем новое число
        StringBuilder rev = new StringBuilder();
        while (!s.isEmpty()) {
            rev.append(s.pop());
        }
        //результат
        System.out.println("Число с обратным порядком: " + rev.toString());
    }
}