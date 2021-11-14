import java.util.Scanner;

public class StringCalculator {
	public static void main(String[] args) {
		//1. 처음 만들 건 스캐너 만들고, 사용자에게 뭐하는지 알려주기  + 자동 import는 ctrl+1이다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산할 값 입력 : ");
		String value = scanner.nextLine();
		System.out.println("입력 값 : " + value);
		
		//2. 공백기준으로 split해서 배열로 받고, 앞서작성한 caculator에서 로직보기
		String[] values = value.split(" " ); 
		// 첫번째값꺼내기 -> 조건에 만족하면 (일단 드가서, quit아니면) symbol과 두번째값은 반복해서 꺼내오면서, 연산하여, 첫번째 값을 업데이트
		// - quit들어올때까지 무한반복 while True -> 배열에 담긴 것은 [index기준  있을때까지 반복] !! while ( < arr.length)로 바뀜.
		// - arr.length는 마지막 index(n-1) +1 값이라서.. 기준index가 필요하다 int i =? -> 2번째값부터 꺼내야하니 i=1부터 시작시킨다. 
		// -> 배열의 끝  while < arr.length(N)으로서 n-1까지!(횟수아님)
		int first = Integer.parseInt(values[0]);
		System.out.println("first : " + first);
		//while ( < values.length) 
		int i = 1;
		while( i < values.length) {
			//3. 2번째부터라면.. 첫번째로 꺼내지는 것이 심볼이다. 
			String symbol = values[i];
			System.out.println("symbol : " + symbol);
			
			// 4. i기준 i=symbol, i+1 다음것=second를 꺼낸다 --> 2개씩 건너뛸 예정?
			int second= Integer.parseInt(values[i+1]); 
			System.out.println("second : " + second);
		}
	}

}
