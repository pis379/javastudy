package ch07;

public class BloodHouse {
	public boolean isPossible(Human human) {
		int age = 0; // �������� ���̸� Ȯ���Ͽ� ����
		boolean isPossible = false; // ���� ���� ����
		/* �Ѱܹ��� Human Ŭ�����κ��� age ���� Ȯ�� age = ? */
		age = human.age;
		/* age�� 16�� �̻� 69�� ���� �϶��� ���� �����ϵ��� ���ǹ� �ۼ� */
		if(age >= 16 && age <= 69) {
			isPossible = true;
		}
		return isPossible;
	}

	public String action(Human human) {
		String result = ""; // ���� ��� ����
		boolean pos = isPossible(human);
	
		/* isPossible() �޼ҵ带 Ȱ���Ͽ� ���� ���� ���θ� Ȯ���ϴ� ���ǹ� �ۼ� */
		if(pos == true) {
			result = "������ �Ϸ�Ǿ����ϴ�. " +human.name+ "�� �����մϴ�.";
		}else{
			result = "������ �Ұ����մϴ�.";
		}
		/* ���� ���� �� result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�. */
		/* ���� �Ұ� �� result = "������ �Ұ����մϴ�. */
		return result;
	}
}