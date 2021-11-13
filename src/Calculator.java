import java.util.Scanner;

public class Calculator {
	static int getFirstValue(Scanner scanner) {
		System.out.println("첫번째 입력 값 : ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		return first;	
	}
	static String getSymbol(Scanner scanner) {
		System.out.println("사칙연산 기호 :  (ex> +, -, *,  /)");
		String symbol = scanner.next();
		System.out.println(symbol);
		
		return symbol; 
	}
	
	static int getSecondValue(Scanner scanner) {
		System.out.println("두번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		return second;
	}
	
	
	static int calculate(int first, String symbol, int second) {
		int result =0 ; 
		
		if (symbol.equals("+")) {
			System.out.println("덧셈 : " + (first + second)); 
			result = first + second;
		} else if (symbol.equals("-")) {
			System.out.println("뺄셈 : " + (first - second));
			result = first - second;
		} else if (symbol.equals("*")) {
			System.out.println("곱셈 : " + (first * second));
			result = first * second;
		} else if (symbol.equals("/")) {
			System.out.println("나눗셈 : " + (first / second));
			result = first / second;
		} else {
			System.out.println("사칙연산 기호중에 1개를 입력하세요.");
		}
		
		return result; 
		
	}
	
	static void print(int result) {
		System.out.println("최종결과 값 : " + result); 
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int first = getFirstValue(scanner);

		int result = first;

		while (true) {
			String symbol = getSymbol(scanner);
			

			if (symbol.equals("quit")) {
				print(result);
				break;
			}

			int second = getSecondValue(scanner);

			result = calculate(result, symbol, second);
			

		}

	}
}
