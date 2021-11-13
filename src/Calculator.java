import java.util.Scanner;

public class Calculator {
	// 0. 메인함수 위, 클래스 아래 부분에 메소드를 static으로 작성해준다.
	// *1. static(클래스변수, 메인함수 등에 붙어서 메모리에 1순위로 올라가야하는 것들)이 붙은 함수는, static이 붙은 메소드만 호출 가능하므로,
	//  -> main 메소드에서 호출하려면, static을 붙이고 메서드를 만들어야한다.
	static int getFirstValue(Scanner scanner) {
		System.out.println("첫번째 입력 값 : ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		return first;		// 기존코드에서 return만 생겨난다.
	}
	// 2. static으로 시작하며, 사칙연산기호 -> string을 반환해줘야한다.
	static String getSymbol(Scanner scanner) {
		System.out.println("사칙연산 기호 :  (ex> +, -, *,  /)");
		String symbol = scanner.next();
		System.out.println(symbol);
		
		return symbol; 
	}
	
	// 3.
	static int getSecondValue(Scanner scanner) {
		System.out.println("두번째 입력 값 : ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		return second;
	}
	
	
	// 4. fisrt, symbol, second를 받아서, 각 조건에 따라 계산해주는 메소드를 작성한다. -> 계산의 결과는 int를 반환할 것.
	static int calculate(int first, String symbol, int second) {
		// 4-1. main에 있던 코드를 복붙하면 에러가 많이 난다. 하나씩 고쳐주면 된다.
		// ***업데이트되는 직전까지의 first가 result 업데이트 변수였다. -> 하지만, 메소드에서는 first에다가 그 직전까지의 first가 들어올 것이므로, first로 수정한다.
		// ***대신 업데이트된 first는 result에 담아서 result로 return하면 된다.
		
		int result =0 ; // *****직전까지의 result인 [first]에 의해  메소드에서 업데이트되어-> return될 변수다. 선언만 해놓는다.*****
		
		if (symbol.equals("+")) {
			System.out.println("덧셈 : " + (first + second)); // 업데이트 전 처리해야 (직전까지의 first) + 새로운 second 연산됨. 업데이트된
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
	
	// 6. 최종결과 출력부분도 메서드로 구현해보자. 현업에 가면 1개의 라인이라도 메소드로 분리하는 경험을 할 수 있다.
	static void print(int result) {
		System.out.println("최종결과 값 : " + result); 
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//		System.out.println("첫번째 입력 값 : ");
//		int first = scanner.nextInt();
//		System.out.println(first);
		
		int first = getFirstValue(scanner);

		int result = first;

		while (true) {
//			System.out.println("사칙연산 기호 :  (ex> +, -, *,  /)");
//			String symbol = scanner.next();
//			System.out.println(symbol);
			String symbol = getSymbol(scanner);
			

			if (symbol.equals("quit")) {
//				System.out.println("최종결과 값 : " + result); // 최종결과 -> 직전까지 업데이트 된 first
				print(result);
				break;
			}

//			System.out.println("두번째 입력 값 : ");
//			int second = scanner.nextInt();
//			System.out.println(second);
			int second = getSecondValue(scanner);

//			if (symbol.equals("+")) {
//				System.out.println("덧셈 : " + (result + second)); // 업데이트 전 처리해야 (직전까지의 first) + 새로운 second 연산됨. 업데이트된
//				result = result + second;
//			} else if (symbol.equals("-")) {
//				System.out.println("뺄셈 : " + (result - second));
//				result = result - second;
//			} else if (symbol.equals("*")) {
//				System.out.println("곱셈 : " + (result * second));
//				result = result * second;
//			} else if (symbol.equals("/")) {
//				System.out.println("나눗셈 : " + (result / second));
//				result = result / second;
//			} else {
//				System.out.println("사칙연산 기호중에 1개를 입력하세요.");
//			}
			
			//5. **연산의 결과(업데이트된 first)를 메서드에서 받아오니, 업데이트변수에 할당해준다.**
			// -> 첫번째 인자에는 직쩐까지의 first가 들어가야한다. 업데이트되는 반복문의 일부를 메서드화 시켰기 때문에 헤깔릴 수 있다.
			result = calculate(result, symbol, second);
			

		}

	}
}
