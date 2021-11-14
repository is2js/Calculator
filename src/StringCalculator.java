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
		
		int i = 1;
		//6. calculate()메서드는 가져가서 사용할 예정. 우리는 main메서드의 로직만 모방한다.(Calculator의 메서드는 사용. Main만 바꾸는 과정인듯?)
		// first -> for문위변수result에 [최초의first]주입후, 반복문에서 [직전까지의fisrt] -> [현재 업데이트된 first]로 계속 업데이트 되도록 한다.
		int result = first;
		while( i < values.length) {
			String symbol = values[i];
			System.out.println("symbol : " + symbol);
			
			int second= Integer.parseInt(values[i+1]); 
			System.out.println("second : " + second);
			
			//7. 전에 만들어둔 Cacluator 클래스에서 main만 무시하고 메서드는 쓴다.
			// first, symbol, second를 넣어주고, 업데이트된 first를 int로 반환받는다.  static int calculate(int first, String symbol, int second)
			result = Calculator.calculate(result, symbol, second);
			
			//8. 무한루프도는 이유는 기준i를 증가안시켜서 그렇다.
			//** i기준으로 2개씩(i, i+1) 뽑았다면, 그다음 값은 i+2에서 2개를 뽑아야한다. 
			i = i + 2;
		}
		
		//9. Output도 기존 메서드를 활용하면 된다. input -> Main만 달라졌다.
		Output.print(result);
		
	}

}
