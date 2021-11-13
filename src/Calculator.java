import java.util.Scanner;

public class Calculator {

	// * 3. static 붙어있는 메서드 -> 클래스 메서드 -> **new로 객체를 안만들어도 사용가능한 메서드**
	// int first = scanner.nextInt(); -> public int nextInt() {} -> **static이 추가로 안붙은 메서드 -> new 안스턴스를 만들어서 호출해야하는 메서드다.
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

	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int first = Input.getFirstValue(scanner);

		int result = first;

		while (true) {
			String symbol = Input.getSymbol(scanner);
			

			if (symbol.equals("quit")) {
				Output.print(result);
				break;
			}

			int second = Input.getSecondValue(scanner);

			result = calculate(result, symbol, second);
			

		}

	}
}
