package week3;
import java.util.Scanner;
//입력받은 수가 3의 배수인지 판별하는 프로그램

public class MultipleOfThree {
	public static void main(String[]args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:"); //입력 안내 출력
		number=input.nextInt();
		if(number % 3==0) {
			System.out.println("입력된 수는 3의 배수입니다.");
		}else
			System.out.println("입력된 수는 3의 배수가 아닙니다.");
	}
}