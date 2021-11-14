import java.util.Scanner;

public class StringCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산할 값 입력 : ");
		String value = scanner.nextLine();
		System.out.println("입력 값 : " + value);
		
		String[] values = value.split(" " );
		int first = Integer.parseInt(values[0]);
		System.out.println("first : " + first);
		
		// 11. 끝을 안다면(배열에 담김, 무한반복 quit필요없음) ---> for문으로 바꾸는 게 훨씬 짧고 좋다.
		//1) int i = 1; -> while문은 도는 기준(주로index)을 따로 선언해서 사용해야하는데 for문은 안에서 한다.  2) 기준을 증가시키는 부분도 while문 내부에서 한줄 따로 해줘야함.
		int result = first;
		//while( i < values.length) {
		//i++ 대신 2씩 증가시키려면 그냥 할당문을 쓰면된다. i=i+2, i+=2
		for(int i = 1; i < values.length; i += 2) {
			String symbol = values[i];
			System.out.println("symbol : " + symbol);
			
			int second= Integer.parseInt(values[i+1]); 
			System.out.println("second : " + second);
			
			result = Calculator.calculate(result, symbol, second);
			//2) i = i + 2;  //while문은 기준을 증가시키는 것도 따로 한줄 내어야하는데 for문은 식안에 들어간다.
		}
		
		Output.print(result);
		
	}

}
