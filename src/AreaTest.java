//원의 반지름을 입력받아 원의 면적을 구하기
import java.util.Scanner; //Scanner 클래스 포함

public class AreaTest {
	public static void main(String args[]) {
		
		double radius; // 원의 반지름
		double area; //원의 면적
		Scanner input = new Scanner(System.in);
		System.out.println("반지름을 입력하시오:"); // 입력안내를 출력한다
		radius = input.nextDouble();
		area=3.14*radius*radius; //원의 면적=3.14*반지름*반지름
		
		System.out.println(area);
	}
	}