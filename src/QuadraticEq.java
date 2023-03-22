// 2차 방정식이 주어졌을 때 근을 계산하는 프로그램을 작성하라.
import java.util.Scanner;

public class QuadraticEq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("b의 값을 입력하세요:");
        float b = input.nextFloat();

        System.out.print("c의 값을 입력하세요:");
        float c = input.nextFloat();

        // 계산
        float discriminant = b * b - 4 * c;
        float r1= (-b + (float) Math.sqrt(discriminant)) / 2;
        float r2 = (-b - (float) Math.sqrt(discriminant)) / 2;

        // 결과 출력
        if (discriminant > 0) {
            System.out.println("이차방정식의 근은 " + r1+" 과"+r2+" 두개입니다.");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        } else if (discriminant == 0) {
            System.out.println("이차방정식의 근은 중근으로, "+r1+"입니다.");
            System.out.println("R1 = R2 = " + r1);
        } else {
            System.out.println("이차방정식의 근이 없습니다.");
            System.out.println("R1 = " + r1 + " + " + (float) Math.sqrt(-discriminant) / 2 + "i");
            System.out.println("R2 = " + r2 + " - " + (float) Math.sqrt(-discriminant) / 2 + "i");
        }
    }
}