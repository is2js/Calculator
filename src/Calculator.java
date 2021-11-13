import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 스캐너는 한번생성후, 여러번 입력 받을 수 있다.
		// 1. 처음 입력받는 피연산자1은 그대로 받아준다.
		//    2번째 입력(기호) + 3번째입력(피연산자2) -> 결과값 -> 다시 첫번째 연산자로 활용 -> 무한반복 
		//    2~3번째 입력 코드가 반복되니 -> 반복문으로 해결하자.
		System.out.println("첫번째 입력 값 : ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		//3. 자.. result는.. 반복문을 돌때마다 업데이트되는 first로 쓸 것이다. 
		// 업데이트전) 에는  직전까지의 first로 사용되며,    ex>                = result(직전까지의 first) + second 
		// 업데이트후) 에는   result 사칙 second 한  결과값이 된다. ex> result =  
		//int result = 0; // 최초의 first를 넣어줘야한다.
		int result = first;
		
		while(true) {
			System.out.println("사칙연산 기호 :  (ex> +, -, *,  /)");
			String symbol = scanner.next();
			System.out.println(symbol);
			
			// 마지막. 무한반복을 끊어주도록 입력받을 수 있다. 
			if (symbol.equals("quit") ) {
				System.out.println("최종결과 값 : "+result); // 최종결과 -> 직전까지 업데이트 된 first
				break;
			}
			
			System.out.println("두번째 입력 값 : ");
			int second = scanner.nextInt();
			System.out.println(second);
			
			// 2. 연산결과값을 변수에 저장을 해놔야지, 다음 first가 될 수있다.
			// int result = 0; -> 업데이트 되어야하는 변수는, 반복문 위의 변수로 둔다!!!
			// 4. 연산결과를 출력하지말고 변수에 저장한다.
			if (symbol.equals("+")) {
				//result = first + second;
				//5. 직전까지의 result가 first의 값이다.  -> my) 
				System.out.println("덧셈 : " + (result + second)); // 업데이트 전 처리해야 (직전까지의 first) + 새로운 second 연산됨. 업데이트된 first로 하면안돼지ㅣ..
				result = result + second;
			} else if(symbol.equals("-")){
				System.out.println("뺄셈 : " + (result - second));
				result = result - second;
			} else if(symbol.equals("*")){
				System.out.println("곱셈 : " + (result * second));
				result = result * second;
			} else if(symbol.equals("/")){
				System.out.println("나눗셈 : " + (result / second));
				result = result / second;
			} else {
				// 사칙연산외 다른 것을 입력한 경우도 처리하자!!!!!!!!!!!!
				System.out.println("사칙연산 기호중에 1개를 입력하세요.");
			} //연산결과 result -> first로 업데이트 되어야한다. 
			
			
		}

	}
}
