import java.util.Scanner;

// 1. 패키지에서 ctlr+n으로 클래스를 만든다. -> 기존 클래스에서 관련메소드들 가져온다
//  -> 여기선 에러가 안났지만, 기존클래스에서 날 것이다. 기존클래스 내부 메서드들이 -> 타 클래스 메서드로 갔으니 -> class명을 메서드앞에 추가로 적어줘야한다.
public class Input {
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
	

}
