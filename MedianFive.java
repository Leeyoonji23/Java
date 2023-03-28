package week3;
import java.util.Arrays;
import java.util.Scanner;
//양수 5개를 입력 받아 배열에 저장하고, 가운데 값을 출력하는 프로그램

import java.util.Scanner;

public class MedianFive {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        // 5개의 양수를 입력받아 배열에 저장
        System.out.println("5개의 양수를 입력하세요.");
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println("양수를 입력해주세요.");
                i--;
                continue;
            }
            arr[i] = num;
        }
        
        // 배열을 정렬하여 중앙값 출력
        Arrays.sort(arr);
        int mid = arr[arr.length / 2];
        System.out.println("중앙값: " + mid);
    }
}
