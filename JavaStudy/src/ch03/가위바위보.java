package ch03;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		// 가위바위보 공식 표현
		int com = 0; // 초기화
		int player = 0; // 초기화

		Random r = new Random();
		com = r.nextInt(3);

		Scanner s = new Scanner(System.in);
		player = s.nextInt();

		if ((player + 1) % 3 == com) {
			System.out.println("컴퓨터 이김");
		} else {
			if (player == com) {
				System.out.println("비김");
			} else {
				System.out.println("플레이어 이김");
			}
		}

	}

}
