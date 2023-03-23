package week3;

public class KoreanChar {
	public static void main(String args[]) {
		        char c= 0xAC00;
		        int cnt=0; //글자 갯수 세기 위함
		        do {
		            System.out.print(c);
		            c++;
		            if (c %588==0) { // 자음 바뀌는 부분
		                System.out.print("\n--.............--\n");
		                c++; // 다음 문자로 넘어감
		            }
		            else if ((c - 0xD743) % 28 == 0) { // 한글 자음 간격이 28자
		                System.out.print("\n--.............--\n");
		            }
		        } while (c <= '힣');
		    }
}
