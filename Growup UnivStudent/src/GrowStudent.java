import java.util.Scanner;

import javax.swing.JFrame;

public class GrowStudent {
	public static void main(String[] args) {


		gamescreen screen = new gamescreen();
		screen.setTitle("���л� Ű���");
		screen.jpanel1 = new JPanel1(screen);
		screen.jpanel2 = new JPanel2(screen);
		screen.jpanel3 = new JPanel3(screen);
		screen.jpanel4 = new JPanel4(screen);
		screen.jpanel5 = new JPanel5(screen);
		screen.jpanel6 = new JPanel6(screen);
		screen.jpanel7 = new JPanel7(screen);
		screen.jpanel8 = new JPanel8(screen);
		screen.jpanel9 = new JPanel9(screen);
		screen.jpanel10 = new JPanel10(screen);
		screen.jpanel11 = new JPanel11(screen);
		screen.jpanel12 = new JPanel12(screen);

		screen.add(screen.jpanel1);
		screen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		screen.setSize(800, 680);
		screen.setVisible(true);

		/*Scanner pick = new Scanner(System.in);

		while (true) {
			System.out.println("\t+-----<< ���л� Ű��� >>-----+");
			System.out.println("1. �����ϱ�");
			System.out.println("2. �����ϱ�");
			starting = pick.nextInt();

			if (starting == 1)
				break;
			else if (starting == 2) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);
			} else {
				System.out.println("\n�߸� �Է��Ͽ����ϴ�.\n");
			}
		} // while�� ����

		System.out.println("=========================== ������ �����մϴ� ============================");
		System.out.println();
		System.out.println("<������ �� �бⰡ ���۵Ǿ���!..�� ��� ����� �߰���簡 ��?! ���� ���� �� ��¥ �⸻��� ���̾�..!>");
		System.out.println("<�������� ���� 45�� ���� ���л��� ������ Ű������! ����� ���� � ������ �����ϰ� �� ���ΰ� !>");
		System.out.println();

		while (true) {

			if (Month == 5) {
				Today = Daily[Day % 7];
			} // 5���� 6�������� �°���
			if (Day == 32) {
				Month = 6;
				Day = 1;
				Today = Daily[Day % 7];
			}
			System.out.println("===================================================================");
			System.out.println("�������� D-" + DdayNumber + "  2020��   " + Month + "��   " + Day + "��   " + Today + "����");
			System.out.println(
					"ü�� : " + Power + "  /  �����ɷ�: " + Intelli + " /   �� : " + Money + "��   /  ģȭ�� : " + Friend);
			System.out.println();
			System.out.println("���ΰ� : ������ �������� " + DdayNumber + "��! �� �غ���?");
			System.out.println();
			System.out.println("1. ���ǵ�� : ���Ǹ� ����! ������ ����߰ھ�!(1�� �Ҹ�, ü�� -10, �����ɷ� +10, �� -5000, <�ָ��� ���þȵ�>)");
			System.out.println("2. �����ϱ� : ���θ� ����! A+�� �޴°ž�!(1�� �Ҹ�, ü�� -20, �����ɷ� +10)");
			System.out.println("3. �˹ٰ��� : ���� �����! ���縸ŭ  �������ž�!(1�� �Ҹ�, ü�� -20, �� +20000)"); // �˹������� switch case�� �÷���
																							// ������
			System.out.println("4. ģ���� ����� : ģ���� �׾ƺ���! ģ����� ����������!(1�� �Ҹ�, ü�� -10, �� -20000, ģȭ�� +10)"); // �����Լ��� �����ϰ�
																											// ���谡 ��
																											// ����(�����ɷ�+3)
																											// �̷��͵�
																											// ������?!
			System.out.println("5. �޽��ϱ� : �����! ���� ���°� �ְ��!(1�� �Ҹ�, ü��+20)");// �����Լ��� ����ļ� �浿������ ���ڸ� ���״�!(�� -20000) �̷���..
			System.out.println("===================================================================");// 5. �����ϱ⸦ ���� �����
																										// ������
			int select = pick.nextInt();
			if (select == 1 && (Today.equals("��") || Today.equals("��"))) {
				System.out.println("�� �ָ��Դϴ�. �ٽ� �������ֽʽÿ�!��");
				continue;
			} // ��� ����..
			switch (select) {
			case 1:
				System.out.println("\n���Ǹ� ����\n");
				System.out.println("� ������ ���Ǹ� �����ðڽ��ϱ�?");
				System.out.println("1. ���¼ҽ�����Ʈ����\n2. �����ͺ��̽�\n3. ������ȣ");
				int iselect = pick.nextInt();
				if (iselect == 1)
					System.out.println("���¼ҽ�����Ʈ���� ���Ǹ� ����");
				else if (iselect == 2)
					System.out.println("�����ͺ��̽� ���Ǹ� ����");
				else
					System.out.println("������ȣ ���Ǹ� ����");

				int i = (int) Math.round(Math.random() * (10) + 1);
				if (i <= 2 && i > 0) {
					System.out.println("������ : ���¼ҽ� ����Ʈ���� ���Ǹ� �����ϰڽ��ϴ�\n���ΰ�: ���� ������ �� �����߾�!");
					System.out.println("\n�����ɷ��� +20 ��ŭ �ö���!");
					Intelli += 20;
				} else if (i <= 10 && i > 8) {
					System.out.println("������ : ���¼ҽ� ����Ʈ���� ���Ǹ� �����ϰڽ��ϴ� \n���ΰ� : ���� ������ ���ذ� �Ȱ�...");
					System.out.println("\n�����ɷ��� +5 ��ŭ �ö���!");
					Intelli += 5;
				} else {
					System.out.println("������ : ���¼ҽ� ����Ʈ���� ���Ǹ� �����ϰڽ��ϴ� \n���ΰ�: ���� ������ ����á��!");
					System.out.println("\n�����ɷ��� +10 ��ŭ �ö���!");
					Intelli += 10;
				}
				System.out.println();
				Day++;
				DdayNumber--;
				Power -= 10;
				Money -= 5000;
				break;
			case 2:
				System.out.println("\n���θ� ����\n");
				System.out.println("� ������ ���θ� �Ͻðڽ��ϱ�?");
				System.out.println("1. ���¼ҽ�����Ʈ����\n2. �����ͺ��̽�\n3. ������ȣ");
				int studyselect = pick.nextInt();
				if (studyselect == 1)
					System.out.println("���¼ҽ�����Ʈ���� ���θ� ����");
				else if (studyselect == 2)
					System.out.println("�����ͺ��̽� ���θ� ����");
				else
					System.out.println("������ȣ ���θ� ����");

				int study = (int) Math.round(Math.random() * (10) + 1);
				if (study <= 2 && study > 0) {
					System.out.println("\n���� ��");
					System.out.println("\n���� ������ ������ �� �ܿ� �� �־���! �����ɷ��� +20 ��ŭ �ö���!");
					Intelli += 20;
				} else if (study <= 10 && study > 8) {
					System.out.println("\n�������� �ʰ� ��Ҵ�!");
					System.out.println("ü���� -5 ��ŭ �� �پ���!");
					Power -= 5;
				} else {
					System.out.println("\n���� ��");
					System.out.println("\n���� ������ ������ ���ذ� ����! �����ɷ��� +10 ��ŭ �ö���!");
					Intelli += 10;
				}
				System.out.println();
				Day++;
				DdayNumber--;
				Power -= 20;
				break;

			case 3:
				System.out.println("\n�˹ٸ� ����\n");
				System.out.println("��� ������ �˹ٸ� ���ðڽ��ϱ�?");
				System.out.println("1. ������\n2. ��ȭ��\n3. ���̽�ũ��");
				int parttime = pick.nextInt();
				if (parttime == 1)
					System.out.println("������ �˹ٸ� ����");
				else if (parttime == 2)
					System.out.println("��ȭ�� �˹ٸ� ����");
				else
					System.out.println("���̽�ũ�� �˹ٸ� ����");

				int job = (int) Math.round(Math.random() * (10) + 1);
				if (job <= 2 && job > 0) {
					System.out.println("\n�˹� ��");
					System.out.println("\n���ʽ��� �޾Ҵ�! �˹ٺ� +4������ �޾Ҵ�!");
					Money += 40000;
				} else if (job <= 10 && job > 8) {
					System.out.println("\n�˹� ��");
					System.out.println("\n�Ǽ��� �ߴ�... ������ �ؾߵż� �˹ٺ� �� ���!");
					System.out.println("ü���� -5 ��ŭ �� �پ���!");
					Power -= 5;
				} else {
					System.out.println("\n�˹� ��");
					System.out.println("\n�˹ٺ� +2������ �޾Ҵ�!");
					Money += 20000;
				}
				System.out.println();
				Day++;
				DdayNumber--;
				Power -= 20;
				break;
			case 4:
				System.out.println("\nģ�����̶� ��� ����\n");
				System.out.println("��� ��ҷ� ���ðڽ��ϱ�?");
				System.out.println("1. ���̰���\n2. ��ȭ��\n3. �뷡��");
				int place = pick.nextInt();
				if (place == 1)
					System.out.println("���̰������� ����");
				else if (place == 2)
					System.out.println("��ȭ�����η� ����");
				else
					System.out.println("�뷡������ ����");
				int play = (int) Math.round(Math.random() * (10) + 1);
				if (play <= 2 && play > 0) {
					System.out.println("\n��� ��");
					System.out.println("\nģ�����̶� �� ģ������! ģȭ���� +20 ��ŭ �ö���!");
					Friend += 20;
				} else if (play <= 10 && play > 8) {
					System.out.println("\n��� ��");
					System.out.println("\nģ�����̶� ���Լ��� �ߴ�... ģȭ���� +5 ��ŭ �ö���!");
					Friend += 5;
					System.out.println("�ǰ��ؼ� ü���� -10 ��ŭ �� �پ���!");
					Power -= 10;
				} else {
					System.out.println("\n��� ��");
					System.out.println("\nģ�����̶� �� ��Ҵ�! ģȭ���� +10 ��ŭ �ö���!");
					Friend += 10;
				}
				System.out.println();
				Day++;
				DdayNumber--;
				Power -= 10;
				Money -= 20000;
				break;
			case 5:
				System.out.println("\n�����\n");
				System.out.println("������ �Ͻðڽ��ϱ�?");
				System.out.println("1. �����ڱ�\n2. ��å�ϱ�\n3. �����ϱ�");
				int restselect = pick.nextInt();
				if (restselect == 1)
					System.out.println("������ ����");
				else if (restselect == 2)
					System.out.println("������ ������ ��å�� ����");
				else
					System.out.println("������ ����");
				int rest = (int) Math.round(Math.random() * (10) + 1);
				if (rest <= 2 && rest > 0) {
					System.out.println("\n���� ��");
					System.out.println("�ʹ� ǫ ������! ü���� +30 ��ŭ �ö���!");
					Power += 30;
				} else if (rest <= 10 && rest > 8) {
					System.out.println("\n���� ��");
					System.out.println("\n��� �ǰ���... ü���� +5 ��ŭ �ö���!");
					Power += 5;
				} else {
					System.out.println("\n���� ��");
					System.out.println("\n�� ������! ü���� +20 ��ŭ �ö���!");
					Power += 20;
				}
				System.out.println();
				Day++;
				DdayNumber--;
				break;
			}
			if (DdayNumber == 0)
				break;  ������ while������ ���� ������ �� 
			if (Power <= 0) {
				System.out.println("===================================================================");
				System.out.println("ü���� 0�� �Ǿ����ϴ�. �� �̻� ������ �� �����ϴ�.");
				System.out.println("========================== ���� ����Ǿ����ϴ� ===========================");
			} else if (Intelli <= 0) {
				System.out.println("===================================================================");
				System.out.println("�����ɷ��� 0�� �Ǿ����ϴ�. �� �̻� ���θ� �� �� �����ϴ�.");
				System.out.println("========================== ���� ����Ǿ����ϴ� ===========================");
			} else if (Money <= 0) {
				System.out.println("===================================================================");
				System.out.println("���� 0�� �Ǿ����ϴ�. �� �̻� ��� �� ���� �����ϴ�.");
				System.out.println("========================== ���� ����Ǿ����ϴ� ===========================");
			} else if (Friend <= 0) {
				System.out.println("===================================================================");
				System.out.println("ģȭ���� 0�� �Ǿ����ϴ�. �� �̻� ģ������ ���� �� �����ϴ�.");
				System.out.println("========================== ���� ����Ǿ����ϴ� ===========================");
			}

			if (Power <= 0 || Intelli <= 0 || Money <= 0 || Friend <= 0) {
				System.out.println("===================================================================");
				System.out.println("<������ �ٽ� �����Ͻðڽ��ϱ�?>");
				System.out.println("===================================================================");
				while (true) {
					System.out.println("1. �����ϱ�");
					System.out.println("2. �����ϱ�");
					starting = pick.nextInt();

					if (starting == 1) {
						DdayNumber = 45; // �ʱⰪ
						Power = 20; // ü��
						Money = 100000; // ��
						Friend = 50; // ģȭ��
						Intelli = 30; // �����ɷ�
						Month = 5; // ��
						Day = 1; // ��
						Today = null;
						break;
					}

					else if (starting == 2) {
						System.out.println("������ �����մϴ�.");
						System.exit(0);
					} else {
						System.out.println("\n�߸� �Է��Ͽ����ϴ�.\n");
					}
				}
			}
		} // ��������

		System.out.println("===================================================================\n");
		System.out.println("=========================== ���� �������ϴ� ============================\n");
		System.out.println("===================================================================\n");

		if (Power == 100 && Intelli == 100 && Friend == 100) {
			System.out.println("===================================================================");
			System.out.println("����� ��ž�� �Ǿ����ϴ�!\n ���ϵ帳�ϴ�!");
			System.out.println("===================================================================");
		} else if (Power >= 50 && Intelli >= 50 && Friend >= 50) {
			System.out.println("===================================================================");
			System.out.println("����� �б� ��Ȱ�� ������ �����̱���!");
			System.out.println("===================================================================");
		} else if (Power == 0 && Intelli == 0 && Friend == 0) {
			System.out.println("===================================================================");
			System.out.println("����� �б��� �ٴ��� �ʾұ���... ");
			System.out.println("===================================================================");
		}
	}

	// TODO Auto-generated method stub
*/
}
}
