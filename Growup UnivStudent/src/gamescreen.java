import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class init {	//���� ����
	int DdayNumber;
	int Power;
	int Money;
	int Friend;
	int Intelli;
	int Month;
	int Day;
	String Daily[];
	String Today;

	public int getDdayNumber() {
		return DdayNumber;
	}

	public void setDdayNumber(int ddayNumber) {
		DdayNumber = ddayNumber;
	}

	public int getPower() {
		return Power;
	}

	public void setPower(int power) {
		Power = power;
	}

	public int getMoney() {
		return Money;
	}

	public void setMoney(int money) {
		Money = money;
	}

	public int getFriend() {
		return Friend;
	}

	public void setFriend(int friend) {
		Friend = friend;
	}

	public int getIntelli() {
		return Intelli;
	}

	public void setIntelli(int intelli) {
		Intelli = intelli;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

	public String[] getDaily() {
		return Daily;
	}

	public void setDaily(String[] daily) {
		Daily = daily;
	}

	public String getToday() {
		return Today;
	}

	public void setToday(String today) {
		Today = today;
	}

	@Override
	public String toString() {
		return "init [DdayNumber=" + DdayNumber + ", Power=" + Power + ", Money=" + Money + ", Friend=" + Friend
				+ ", Intelli=" + Intelli + ", Month=" + Month + ", Day=" + Day + ", Daily=" + Arrays.toString(Daily)
				+ ", Today=" + Today + "]";
	}

	public void setDaily(String string, String string2, String string3, String string4, String string5, String string6,
			String string7) {
		// TODO Auto-generated method stub

	}

}

@SuppressWarnings("serial")
class JPanel1 extends JPanel { // ���� �г�

	private JButton StartBtn, EndBtn;
	private gamescreen screen;

	public JPanel1(gamescreen screen) {

		init a = new init();
		String Daily[] = { "��", "��", "ȭ", "��", "��", "��", "��" };

		a.setDdayNumber(45); // �ʱⰪ
		a.setPower(100); // ü��
		a.setMoney(100000); // ��
		a.setFriend(50); // ģȭ��
		a.setIntelli(30); // �����ɷ�
		a.setMonth(5); // ��
		a.setDay(1); // ��
		a.setDaily(Daily);
		a.setToday(null);

		if (a.getMonth() == 5) {
			a.Today = a.Daily[a.Day % 7];
		} // 5���� 6�������� �°���
		if (a.Day == 32) {
			a.Month = 6;
			a.Day = 1;
			a.Today = a.Daily[a.Day % 7];
		}

		this.screen = screen;
		setLayout(null);

		JLabel Lb1 = new JLabel("<< ���л� Ű��� >>");
		Lb1.setBounds(340, 100, 600, 20);
		add(Lb1);

		StartBtn = new JButton("���� ����");
		StartBtn.setBounds(200, 300, 150, 50);
		add(StartBtn);
		EndBtn = new JButton("���� ����");
		EndBtn.setBounds(450, 300, 150, 50);
		add(EndBtn);

		StartBtn.addActionListener(new MyActionListener());
		EndBtn.addActionListener(new MyActionListener1());
	}

	class MyActionListener implements ActionListener { // ��ư Ű ������ �г� 2�� ȣ��
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change1_2("panel2");
		}
	}

	class MyActionListener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}

	}
}

@SuppressWarnings("serial")
class JPanel2 extends JPanel { // ���� �г�
	private gamescreen screen;

	public JPanel2(gamescreen screen) {
		init a = new init();
		System.out.println(a.DdayNumber + ", " + a.Intelli);

		setLayout(null);
		this.screen = screen;
		JLabel Lb1 = new JLabel("������ �� �бⰡ ���۵Ǿ���!..�� ��� ����� �߰���簡 ��?!");
		Lb1.setBounds(220, 50, 600, 20);
		add(Lb1);

		JLabel Lb2 = new JLabel(" ���� ���� �� ��¥ �⸻��� ���̾�..!");
		Lb2.setBounds(290, 80, 600, 20);
		add(Lb2);

		JLabel Lb3 = new JLabel("�������� ���� 45�� ���� ���л��� ������ Ű������!");
		Lb3.setBounds(250, 110, 600, 20);
		add(Lb3);

		JLabel Lb4 = new JLabel("�������� D-" + a.getDdayNumber() + "  2020��   " + a.getMonth() + "��   " + a.getDay()
				+ "��   " + a.getToday() + "����");
		Lb4.setBounds(270, 140, 600, 20);
		add(Lb4);

		JButton LtBtn = new JButton("���ǵ��");
		LtBtn.setBounds(20, 300, 100, 30);
		add(LtBtn);
		LtBtn.addActionListener(new MyActionListener());

		JButton StBtn = new JButton("�����ϱ�");
		StBtn.setBounds(150, 300, 100, 30);
		add(StBtn);
		StBtn.addActionListener(new MyActionListener());

		JButton PtBtn = new JButton("�˹ٰ���");
		PtBtn.setBounds(280, 300, 100, 30);
		add(PtBtn);
		PtBtn.addActionListener(new MyActionListener());

		JButton PlayBtn = new JButton("ģ���� �����");
		PlayBtn.setBounds(410, 300, 150, 30);
		add(PlayBtn);
		PlayBtn.addActionListener(new MyActionListener());

		JButton RestBtn = new JButton("�޽��ϱ�");
		RestBtn.setBounds(590, 300, 100, 30);
		add(RestBtn);
		RestBtn.addActionListener(new MyActionListener());
	}

	class MyActionListener implements ActionListener { // ��ư Ű ������ �г� 1�� ȣ��
		@Override
		public void actionPerformed(ActionEvent e) {
			String btnVal = e.getActionCommand();
			switch (btnVal) {
			case ("���ǵ��"):
				screen.change2_3("panel3"); // ���� �г�
				break;

			case ("�����ϱ�"):
				screen.change2_4("panel4"); // ���� �г�
				break;

			case ("�˹ٰ���"):
				screen.change2_5("panel5"); // �˹� �г�
				break;

			case ("ģ���� �����"):
				screen.change2_6("panel6"); // ģ���� ����� �г�
				break;

			case ("�޽��ϱ�"):
				screen.change2_7("panel7"); // �޽��ϱ� �г�
			}
		}
	}

}

@SuppressWarnings("serial")
class JPanel3 extends JPanel { // ���� �г�
	private gamescreen screen;
	private JLabel Lb1;
	private JButton OSBtn, DBBtn, SCBtn;

	public JPanel3(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		Lb1 = new JLabel("� ������ ���Ǹ� �����ðڽ��ϱ�?");
		Lb1.setBounds(290, 80, 600, 20);
		add(Lb1);

		OSBtn = new JButton("���¼ҽ�����Ʈ����");
		OSBtn.setBounds(110, 300, 170, 30);
		add(OSBtn);
		OSBtn.addActionListener(new MyActionListener());

		DBBtn = new JButton("�����ͺ��̽�");
		DBBtn.setBounds(310, 300, 170, 30);
		add(DBBtn);
		DBBtn.addActionListener(new MyActionListener());

		SCBtn = new JButton("������ȣ");
		SCBtn.setBounds(510, 300, 170, 30);
		add(SCBtn);
		SCBtn.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener { // ��ư Ű ������ �г� 2�� ȣ��
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change3_8("panel8");
		}
	}
}

@SuppressWarnings("serial")
class JPanel8 extends JPanel { // ���� ��� �г�
	private gamescreen screen;
	private JLabel LtLb1, LtLb2, LtLb3;
	private JLabel LtLb4, LtLb5, LtLb6;
	private JLabel LtLb7, LtLb8, LtLb9;
	private JButton BackBtn;

	public JPanel8(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		init a = new init();

		int Lt = (int) Math.round(Math.random() * (10) + 1);
		if (Lt <= 2 && Lt > 0) {
			LtLb1 = new JLabel("������ : ���Ǹ� �����ϰڽ��ϴ�");
			LtLb1.setBounds(300, 60, 600, 20);
			add(LtLb1);
			LtLb2 = new JLabel("���ΰ�: ���� ������ �� �����߾�!");
			LtLb2.setBounds(300, 90, 600, 20);
			add(LtLb2);
			LtLb3 = new JLabel("�����ɷ��� +20 ��ŭ �ö���!");
			LtLb3.setBounds(300, 120, 600, 20);
			add(LtLb3);
			a.setIntelli(a.getIntelli() + 20);
		} else if (Lt <= 10 && Lt > 8) {
			LtLb4 = new JLabel("������ : ���Ǹ� �����ϰڽ��ϴ�");
			LtLb4.setBounds(300, 60, 600, 20);
			add(LtLb4);
			LtLb5 = new JLabel("���ΰ� : ���� ������ ���ذ� �Ȱ�...");
			LtLb5.setBounds(300, 90, 600, 20);
			add(LtLb5);
			LtLb6 = new JLabel("�����ɷ��� +5 ��ŭ �ö���!");
			LtLb6.setBounds(300, 120, 600, 20);
			add(LtLb6);
			a.setIntelli(+5);
		} else {
			LtLb7 = new JLabel("������ : ���Ǹ� �����ϰڽ��ϴ�");
			LtLb7.setBounds(300, 60, 600, 20);
			add(LtLb7);
			LtLb8 = new JLabel("���ΰ�: ���� ������ ����á��!");
			LtLb8.setBounds(300, 90, 600, 20);
			add(LtLb8);
			LtLb9 = new JLabel("�����ɷ��� +10 ��ŭ �ö���!");
			LtLb9.setBounds(300, 120, 600, 20);
			add(LtLb9);
			a.setIntelli(+10);
		}
		a.Day++;
		a.DdayNumber -= a.DdayNumber;
		a.Power -= 10;
		a.Money -= 5000;

		BackBtn = new JButton("�������� ���ư���");
		BackBtn.setBounds(300, 300, 170, 30);
		add(BackBtn);
		BackBtn.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener { // ��ư Ű ������ �г� 2�� ȣ��
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change8_2("panel2");
		}
	}
}

@SuppressWarnings("serial")
class JPanel4 extends JPanel { // ���� �г�
	private gamescreen screen;

	public JPanel4(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		JLabel Lb1 = new JLabel("� ������ ���θ� �Ͻðڽ��ϱ�?");
		Lb1.setBounds(300, 80, 600, 20);
		add(Lb1);

		JButton OSBtn = new JButton("���¼ҽ�����Ʈ����");
		OSBtn.setBounds(110, 300, 170, 30);
		add(OSBtn);
		OSBtn.addActionListener(new MyActionListener());

		JButton DBBtn = new JButton("�����ͺ��̽�");
		DBBtn.setBounds(310, 300, 170, 30);
		add(DBBtn);
		DBBtn.addActionListener(new MyActionListener());

		JButton SCBtn = new JButton("������ȣ");
		SCBtn.setBounds(510, 300, 170, 30);
		add(SCBtn);
		SCBtn.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener { // ��ư Ű ������ �г� 2�� ȣ��
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change4_9("panel9");
		}
	}
}

@SuppressWarnings("serial")
class JPanel9 extends JPanel { // ���� ��� �г�
	private gamescreen screen;
	private JLabel StLb1, StLb2;
	private JLabel StLb3, StLb4;
	private JLabel StLb5, StLb6;
	private JButton BackBtn;

	public JPanel9(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		init a = new init();

		int St = (int) Math.round(Math.random() * (10) + 1);
		if (St <= 2 && St > 0) {
			StLb1 = new JLabel("���� ������ ������ �� �ܿ� �� �־���!");
			StLb1.setBounds(300, 60, 600, 20);
			add(StLb1);
			StLb2 = new JLabel("�����ɷ��� +20 ��ŭ �ö���!");
			StLb2.setBounds(300, 90, 600, 20);
			add(StLb2);
			a.setIntelli(a.getIntelli() + 20);
		} else if (St <= 10 && St > 8) {
			StLb3 = new JLabel("�������� �ʰ� ��Ҵ�!");
			StLb3.setBounds(300, 60, 600, 20);
			add(StLb3);
			StLb4 = new JLabel("ü���� -5 ��ŭ �� �پ���!");
			StLb4.setBounds(300, 90, 600, 20);
			add(StLb4);
			a.setIntelli(+5);
		} else {
			StLb5 = new JLabel("���� ������ ������ ���ذ� ����!");
			StLb5.setBounds(300, 60, 600, 20);
			add(StLb5);
			StLb6 = new JLabel("�����ɷ��� +10 ��ŭ �ö���!");
			StLb6.setBounds(300, 90, 600, 20);
			add(StLb6);
			a.setIntelli(+10);
		}
		a.Day++;
		a.DdayNumber -= a.DdayNumber;
		a.Power -= 10;
		a.Money -= 5000;

		BackBtn = new JButton("�������� ���ư���");
		BackBtn.setBounds(300, 300, 170, 30);
		add(BackBtn);
		BackBtn.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener { // ��ư Ű ������ �г� 2�� ȣ��
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change9_2("panel2");
		}
	}
}

@SuppressWarnings("serial")
class JPanel5 extends JPanel { // �˹� �г�
	private gamescreen screen;

	public JPanel5(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		JLabel Lb1 = new JLabel("��� ������ �˹ٸ� ���ðڽ��ϱ�?");
		Lb1.setBounds(300, 60, 600, 20);
		add(Lb1);

		JButton BBtn = new JButton("������");
		BBtn.setBounds(150, 300, 100, 30);
		add(BBtn);
		BBtn.addActionListener(new MyActionListener());

		JButton TBtn = new JButton("��ȭ��");
		TBtn.setBounds(300, 300, 100, 30);
		add(TBtn);
		TBtn.addActionListener(new MyActionListener());

		JButton IceBtn = new JButton("���̽�ũ��");
		IceBtn.setBounds(450, 300, 100, 30);
		add(IceBtn);
		IceBtn.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener { // ��ư Ű ������ �г� 2�� ȣ��
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change5_10("panel10");
		}
	}
}
@SuppressWarnings("serial")
class JPanel10 extends JPanel { // �˹� ��� �г�
	private gamescreen screen;
	private JLabel PtLb1, PtLb2;
	private JLabel PtLb3, PtLb4;
	private JLabel PtLb5, PtLb6;
	private JButton BackBtn;

	public JPanel10(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		init a = new init();

		int Pt = (int) Math.round(Math.random() * (10) + 1);
		if (Pt <= 2 && Pt > 0) {
			PtLb1 = new JLabel("���ʽ��� �޾Ҵ�!");
			PtLb1.setBounds(300, 60, 600, 20);
			add(PtLb1);
			PtLb2 = new JLabel("�˹ٺ� +4������ �޾Ҵ�!");
			PtLb2.setBounds(300, 90, 600, 20);
			add(PtLb2);
			a.setIntelli(a.getIntelli() + 20);
		} else if (Pt <= 10 && Pt > 8) {
			PtLb3 = new JLabel("�Ǽ��� �ߴ�... ������ �ؾߵż� �˹ٺ� �� ���!");
			PtLb3.setBounds(300, 60, 600, 20);
			add(PtLb3);
			PtLb4 = new JLabel("ü���� -5 ��ŭ �� �پ���!");
			PtLb4.setBounds(300, 90, 600, 20);
			add(PtLb4);
			a.setIntelli(+5);
		} else {
			PtLb5 = new JLabel("�˹� ��!");
			PtLb5.setBounds(300, 60, 600, 20);
			add(PtLb5);
			PtLb6 = new JLabel("�˹ٺ� +2������ �޾Ҵ�!");
			PtLb6.setBounds(300, 90, 600, 20);
			add(PtLb6);
			a.setIntelli(+10);
		}
		a.Day++;
		a.DdayNumber -= a.DdayNumber;
		a.Power -= 10;
		a.Money -= 5000;

		BackBtn = new JButton("�������� ���ư���");
		BackBtn.setBounds(300, 300, 170, 30);
		add(BackBtn);
		BackBtn.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener { // ��ư Ű ������ �г� 2�� ȣ��
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change10_2("panel2");
		}
	}
}

@SuppressWarnings("serial")
class JPanel6 extends JPanel { // ģ���� ����� �г�
	private gamescreen screen;

	public JPanel6(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		JLabel Lb1 = new JLabel("��� ��ҷ� ���ðڽ��ϱ�?");
		Lb1.setBounds(250, 40, 600, 20);
		add(Lb1);

		JButton BBtn = new JButton("���̰���");
		BBtn.setBounds(100, 300, 100, 30);
		add(BBtn);
		BBtn.addActionListener(new MyActionListener());

		JButton TBtn = new JButton("��ȭ��");
		TBtn.setBounds(320, 300, 100, 30);
		add(TBtn);
		TBtn.addActionListener(new MyActionListener());

		JButton IceBtn = new JButton("�뷡��");
		IceBtn.setBounds(500, 300, 100, 30);
		add(IceBtn);
		IceBtn.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener { // ��ư Ű ������ �г� 2�� ȣ��
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change6_11("panel11");
		}
	}
}
@SuppressWarnings("serial")
class JPanel11 extends JPanel { // ģ���� ����� ��� �г�
	private gamescreen screen;
	private JLabel PlayLb1, PlayLb2;
	private JLabel PlayLb3, PlayLb4;
	private JLabel PlayLb5, PlayLb6;
	private JButton BackBtn;

	public JPanel11(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		init a = new init();

		int PlayLb = (int) Math.round(Math.random() * (10) + 1);
		if (PlayLb <= 2 && PlayLb > 0) {
			PlayLb1 = new JLabel("ģ�����̶� �� ģ������!");
			PlayLb1.setBounds(300, 40, 600, 20);
			add(PlayLb1);
			PlayLb2 = new JLabel("ģȭ���� +20 ��ŭ �ö���!");
			PlayLb2.setBounds(300, 60, 600, 20);
			add(PlayLb2);
			a.setIntelli(a.getIntelli() + 20);
		} else if (PlayLb <= 10 && PlayLb > 8) {
			PlayLb3 = new JLabel("ģ�����̶� ���Լ��� �ߴ�...");
			PlayLb3.setBounds(300, 40, 600, 20);
			add(PlayLb3);
			PlayLb4 = new JLabel("ģȭ���� +5 ��ŭ �ö���! �ǰ��ؼ� ü���� -10 ��ŭ �� �پ���!");
			PlayLb4.setBounds(300, 60, 600, 20);
			add(PlayLb4);
			a.setIntelli(+5);
		} else {
			PlayLb5 = new JLabel("ģ�����̶� �� ��Ҵ�!");
			PlayLb5.setBounds(300, 40, 600, 20);
			add(PlayLb5);
			PlayLb6 = new JLabel("ģȭ���� +10 ��ŭ �ö���!");
			PlayLb6.setBounds(300, 60, 600, 20);
			add(PlayLb6);
			a.setIntelli(+10);
		}
		a.Day++;
		a.DdayNumber -= a.DdayNumber;
		a.Power -= 10;
		a.Money -= 5000;

		BackBtn = new JButton("�������� ���ư���");
		BackBtn.setBounds(300, 300, 170, 30);
		add(BackBtn);
		BackBtn.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener { // ��ư Ű ������ �г� 2�� ȣ��
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change11_2("panel2");
		}
	}
}

@SuppressWarnings("serial")
class JPanel7 extends JPanel { // �޽��ϱ� �г�
	private gamescreen screen;

	public JPanel7(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		JLabel Lb1 = new JLabel("������ �Ͻðڽ��ϱ�?");
		Lb1.setBounds(250, 40, 600, 20);
		add(Lb1);

		JButton SlBtn = new JButton("�����ڱ�");
		SlBtn.setBounds(100, 300, 100, 30);
		add(SlBtn);
		SlBtn.addActionListener(new MyActionListener());

		JButton WlBtn = new JButton("��å�ϱ�");
		WlBtn.setBounds(320, 300, 100, 30);
		add(WlBtn);
		WlBtn.addActionListener(new MyActionListener());

		JButton GmBtn = new JButton("�����ϱ�");
		GmBtn.setBounds(500, 300, 100, 30);
		add(GmBtn);
		GmBtn.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener { // ��ư Ű ������ �г� 2�� ȣ��
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change7_12("panel12");
		}
	}
}
@SuppressWarnings("serial")
class JPanel12 extends JPanel { // �޽��ϱ� ��� �г�
	private gamescreen screen;
	private JLabel PlayLb1, PlayLb2;
	private JLabel PlayLb3, PlayLb4;
	private JLabel PlayLb5, PlayLb6;
	private JButton BackBtn;

	public JPanel12(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		init a = new init();

		int PlayLb = (int) Math.round(Math.random() * (10) + 1);
		if (PlayLb <= 2 && PlayLb > 0) {
			PlayLb1 = new JLabel("�ʹ� ǫ ������!");
			PlayLb1.setBounds(300, 40, 600, 20);
			add(PlayLb1);
			PlayLb2 = new JLabel("ü���� +30 ��ŭ �ö���!");
			PlayLb2.setBounds(300, 60, 600, 20);
			add(PlayLb2);
			a.setIntelli(a.getIntelli() + 20);
		} else if (PlayLb <= 10 && PlayLb > 8) {
			PlayLb3 = new JLabel("��� �ǰ���...");
			PlayLb3.setBounds(300, 40, 600, 20);
			add(PlayLb3);
			PlayLb4 = new JLabel("ü���� +5 ��ŭ �ö���!");
			PlayLb4.setBounds(300, 60, 600, 20);
			add(PlayLb4);
			a.setIntelli(+5);
		} else {
			PlayLb5 = new JLabel("�� ������!");
			PlayLb5.setBounds(300, 40, 600, 20);
			add(PlayLb5);
			PlayLb6 = new JLabel("ü���� +20 ��ŭ �ö���!");
			PlayLb6.setBounds(300, 60, 600, 20);
			add(PlayLb6);
			a.setIntelli(+10);
		}
		a.Day++;
		a.DdayNumber -= a.DdayNumber;
		a.Power -= 10;
		a.Money -= 5000;

		BackBtn = new JButton("�������� ���ư���");
		BackBtn.setBounds(300, 300, 170, 30);
		add(BackBtn);
		BackBtn.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener { // ��ư Ű ������ �г� 2�� ȣ��
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change12_2("panel2");
		}
	}
}
@SuppressWarnings("serial")
class gamescreen extends JFrame {
	public JPanel1 jpanel1 = null;
	public JPanel2 jpanel2 = null;
	public JPanel3 jpanel3 = null;
	public JPanel4 jpanel4 = null;
	public JPanel5 jpanel5 = null;
	public JPanel6 jpanel6 = null;
	public JPanel7 jpanel7 = null;
	public JPanel8 jpanel8 = null;
	public JPanel9 jpanel9 = null;
	public JPanel10 jpanel10 = null;
	public JPanel11 jpanel11 = null;
	public JPanel12 jpanel12 = null;

	public void change1_2(String panelName) {
		if (panelName.contentEquals("panel1")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel1);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel2);
			revalidate();
			repaint();
		}
	}

	public void change2_3(String panelName) {
		if (panelName.contentEquals("jpanel2")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel2);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel3);
			revalidate();
			repaint();
		}
	}

	public void change2_4(String panelName) {
		if (panelName.contentEquals("jpanel2")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel2);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel4);
			revalidate();
			repaint();
		}
	}

	public void change2_5(String panelName) {
		if (panelName.contentEquals("jpanel2")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel2);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel5);
			revalidate();
			repaint();
		}
	}

	public void change2_6(String panelName) {
		if (panelName.contentEquals("jpanel2")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel2);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel6);
			revalidate();
			repaint();
		}
	}

	public void change2_7(String panelName) {
		if (panelName.contentEquals("jpanel2")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel2);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel7);
			revalidate();
			repaint();
		}
	}

	public void change3_8(String panelName) {
		if (panelName.contentEquals("jpane3")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel3);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel8);
			revalidate();
			repaint();
		}
	}

	public void change8_2(String panelName) {
		if (panelName.contentEquals("jpane8")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel8);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel2);
			revalidate();
			repaint();
		}
	}

	public void change4_9(String panelName) {
		if (panelName.contentEquals("jpane4")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel4);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel9);
			revalidate();
			repaint();
		}
	}
	public void change9_2(String panelName) {
		if (panelName.contentEquals("jpane9")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel9);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel2);
			revalidate();
			repaint();
		}
	}
	public void change5_10(String panelName) {
		if (panelName.contentEquals("jpane5")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel5);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel10);
			revalidate();
			repaint();
		}
	}
	public void change10_2(String panelName) {
		if (panelName.contentEquals("jpane10")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel10);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel2);
			revalidate();
			repaint();
		}
	}
	public void change6_11(String panelName) {
		if (panelName.contentEquals("jpane6")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel6);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel11);
			revalidate();
			repaint();
		}
	}
	public void change11_2(String panelName) {
		if (panelName.contentEquals("jpanel11")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel11);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel2);
			revalidate();
			repaint();
		}
	}
	public void change7_12(String panelName) {
		if (panelName.contentEquals("jpane7")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel7);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel12);
			revalidate();
			repaint();
		}
	}
	public void change12_2(String panelName) {
		if (panelName.contentEquals("jpanel12")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel12);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel2);
			revalidate();
			repaint();
		}
	}
}
