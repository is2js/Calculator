import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 스캐너는 한번생성후, 여러번 입력 받을 수 있다.
		System.out.println("첫번째 입력 값 : ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		System.out.println("사칙연산 기호 :  (ex> +, -, *,  /)");
		String symbol = scanner.next(); // 문자열 1글자만 받을 거면 .next()로 받아 넘겨준다.
		System.out.println(symbol);
		
		System.out.println("두번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		// .equals : 값자체 비교,   == id(주소값)비교 
		if (symbol.equals("+")) {
			System.out.println("덧셈 : " + (first + second));
		} else if(symbol.equals("-")){
			System.out.println("뺄셈 : " + (first - second));
		} else if(symbol.equals("*")){
			System.out.println("곱셈 : " + (first * second));
		} else if(symbol.equals("/")){
			System.out.println("나눗셈 : " + (first / second));
		} else {
			// 사칙연산외 다른 것을 입력한 경우도 처리하자!!!!!!!!!!!!
			System.out.println("사칙연산 기호중에 1개를 입력하세요.");
		}

	}
}
