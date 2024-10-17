import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int firstNumber = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int secondNumber = sc.nextInt();

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        sc.nextLine();
        System.out.print("사칙연산 기호를 입력하세요: ");
        char operation = sc.next().charAt(0);

        // +
        if (operation == '+') {
            System.out.println(firstNumber + secondNumber);
        } else if (operation == '-') {
            System.out.println(firstNumber - secondNumber);
        } else if (operation == '*') {
            System.out.println(firstNumber * secondNumber);
        } else if (operation == '/') {
            if (secondNumber != 0) {
                System.out.println(firstNumber / secondNumber);
            } else {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
        } else {
            System.out.println("입력이 잘못되었습니다.");
        }
    }
}
