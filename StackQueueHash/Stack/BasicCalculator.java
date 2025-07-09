import java.util.*;
public class BasicCalculator {
    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0, result = 0, sign = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                result *= stack.pop();
                result += stack.pop();
                num = 0;
            }
        }
        result += sign * num;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        System.out.println(calculate(expression));
    }
}
