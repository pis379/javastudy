package ch04;

public class Exam4_1 {
	public static void main(String[] args) {
		int workingTime = 6; // 근무시간
		if(workingTime<=7) {
			System.out.println("계속 근무!");
		}else {
			if(workingTime>=8) {
				System.out.println("퇴근~");
			}
		}

	}
}