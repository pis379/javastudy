package ch03;

import java.util.Random;
import java.util.Scanner;

public class ���������� {

	public static void main(String[] args) {
		// ���������� ���� ǥ��
		int com = 0; // �ʱ�ȭ
		int player = 0; // �ʱ�ȭ

		Random r = new Random();
		com = r.nextInt(3);

		Scanner s = new Scanner(System.in);
		player = s.nextInt();

		if ((player + 1) % 3 == com) {
			System.out.println("��ǻ�� �̱�");
		} else {
			if (player == com) {
				System.out.println("���");
			} else {
				System.out.println("�÷��̾� �̱�");
			}
		}

	}

}
