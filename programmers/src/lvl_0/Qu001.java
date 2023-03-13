package lvl_0;

public class Qu001 {

	/**
	 * 문제: 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
	 */
	
	// 방법1
	static int solution1(int num1, int num2) {
        int answer = -1;
        
        answer = num1 % num2;
        
        return answer;
    }
	
	// 방법2
	static int solution2(int num1, int num2) {
        return num1 % num2;
    }
	
	public static void main(String[] args) {
		System.out.println("방법1의 테스트케이스1: " + solution1(3, 2));
		System.out.println("방법1의 테스트케이스2: " + solution1(10, 5));
		System.out.println("방법2의 테스트케이스1: " + solution2(3, 2));
		System.out.println("방법2의 테스트케이스2: " + solution2(10, 5));
	}
}
