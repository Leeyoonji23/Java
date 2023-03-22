//윤년을 검사하는 프로그램
import java.util.Scanner; //값을 입력받기 위한 Scanner 호출

public class LeapYear{
	public static void main(String args[]) {
		
		System.out.println("해를 입력하세요:");
		try (Scanner sc = new Scanner(System.in)) {
			int year =sc.nextInt();
			if((year%4==0&& year%100!=0|| year%400==0)) { //윤년의 조건을 만족하기 위해서는 4, 100,400으로 나누어 떨어져야 하는 조건문이다.
				System.out.println(year+"년은 윤년입니다"); //if 문을 사용하여 조건을 만족하면 윤년임을 출력한다.
			}
			else {
				System.out.println(year+"년은 윤년이 아닙니다");
				
			}
		}
	}

}

