import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 스캐너는 한번생성후, 여러번 입력 받을 수 있다.
		System.out.println("첫번째 입력 값 : ");
		int first = scanner.nextInt();
		System.out.println(first);
		System.out.println("두번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		
		System.out.println("덧셈 : " + (first+second)); //덧셈 : 34 -> 문자열과 더하는데, 숫자부터 먼저 계산하고 문자열로 변환되도록 괄호를 먼저 치자.
		System.out.println("뺄셈 : " + (first-second)); //덧셈 : 34 -> 문자열과 더하는데, 숫자부터 먼저 계산하고 문자열로 변환되도록 괄호를 먼저 치자.
		System.out.println("곱셈 : " + (first*second)); //덧셈 : 34 -> 문자열과 더하는데, 숫자부터 먼저 계산하고 문자열로 변환되도록 괄호를 먼저 치자.
		System.out.println("나눗셈 : " + (first/second)); //덧셈 : 34 -> 문자열과 더하는데, 숫자부터 먼저 계산하고 문자열로 변환되도록 괄호를 먼저 치자.
		

	}
}
