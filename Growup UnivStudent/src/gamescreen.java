import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* -------------------변수-------------------- */
class init { 
	int DdayNumber;
	int Power;
	int Money;
	int Friend;
	int Intelli;
	int Month;
	int Day;
	String Daily[];
	String Today;
	private int Count;

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
				+ ", Today=" + Today + ", Count=" + Count + "]";
	}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}

}



/* -------------------1.시작 화면 패널-------------------- */
@SuppressWarnings("serial")
class JPanel1 extends JPanel {
	private JButton StartBtn, EndBtn;
	private JLabel Lb1;
	public JPanel1 jpanel1;
	public JPanel2 jpanel2;
	
	public JPanel1(gamescreen screen) {
		
		setLayout(null);

		Lb1 = new JLabel("<< 대학생 키우기 >>");
		Lb1.setBounds(340, 100, 600, 20);
		add(Lb1);

		StartBtn = new JButton("게임 시작");
		StartBtn.setBounds(200, 300, 150, 50);
		add(StartBtn);

		EndBtn = new JButton("게임 종료");
		EndBtn.setBounds(450, 300, 150, 50);
		add(EndBtn);

		StartBtn.addActionListener(new MyActionListener());
		EndBtn.addActionListener(new MyActionListener1());
	}

	/* -------------------게임 시작 버튼 키 눌리면 패널 2번 호출-------------------- */
	class MyActionListener implements ActionListener { // 
		@Override
		public void actionPerformed(ActionEvent e) {
			//screen.change1_2("panel2");
			
		}
	}
	
	/* -------------------게임 종료 버튼 키 누르면 패널 창 닫기-------------------- */
	class MyActionListener1 implements ActionListener { // 
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
}

/* -------------------2.선택 패널-------------------- */
@SuppressWarnings("serial")
class JPanel2 extends JPanel {
	private gamescreen screen;
	private JLabel Lb1, Lb2, Lb3, Lb4;
	private JButton LtBtn, StBtn, PtBtn, PlayBtn, RestBtn;

	init a = new init();
	String Daily[] = { "금", "토", "일", "월", "화", "수", "목"};

	public JPanel2(gamescreen screen) {
		setLayout(null);
		this.screen = screen;

		if (a.getCount() == 0)
			first();
		
		if (a.getMonth() == 5 && a.getDay() == 1) {
			a.setToday(a.Daily[a.Day % 7]);
		}
		
		if (a.getMonth() == 5 && a.getDay() == 32) {
			a.setMonth(6);
			a.setDay(1);
			a.setToday(a.Daily[a.Day % 7]);
		}

		System.out.println(a.getCount() + ", " + a.getDay() + ", " + a.Friend + ", " + a.Intelli + ", " + a.Money + ", " + a.Month + ", " + a.Power + ", " + a.Today);
		
		Lb1 = new JLabel("설레는 새 학기가 시작되었다!..도 잠시 어느새 중간고사가 끝?!");
		Lb1.setBounds(220, 50, 600, 20);
		add(Lb1);

		Lb2 = new JLabel(" 이제 남은 건 진짜 기말고사 뿐이야..!");
		Lb2.setBounds(290, 80, 600, 20);
		add(Lb2);

		Lb3 = new JLabel("종강까지 남은 45일 동안 대학생을 열심히 키워보자!");
		Lb3.setBounds(250, 110, 600, 20);
		add(Lb3);

		Lb4 = new JLabel("종강까지 D-" + a.getDdayNumber() + "  2020년   " + a.getMonth() + "월   " + a.getDay() + "일   " + a.getToday() + "요일");
		Lb4.setBounds(270, 140, 600, 20);
		add(Lb4);

		LtBtn = new JButton("강의듣기");
		LtBtn.setBounds(20, 300, 130, 30);
		add(LtBtn);
		LtBtn.addActionListener(new MyActionListener());

		StBtn = new JButton("공부하기");
		StBtn.setBounds(170, 300, 130, 30);
		add(StBtn);
		StBtn.addActionListener(new MyActionListener());

		PtBtn = new JButton("알바가기");
		PtBtn.setBounds(320, 300, 130, 30);
		add(PtBtn);
		PtBtn.addActionListener(new MyActionListener());

		PlayBtn = new JButton("친구와 놀러가기");
		PlayBtn.setBounds(470, 300, 130, 30);
		add(PlayBtn);
		PlayBtn.addActionListener(new MyActionListener());

		RestBtn = new JButton("휴식하기");
		RestBtn.setBounds(620, 300, 130, 30);
		add(RestBtn);
		RestBtn.addActionListener(new MyActionListener());
	}

	/* -------------------변수초기 세팅-------------------- */
	private void first() {
		a.setDdayNumber(45);
		a.setPower(100);
		a.setMoney(100000);
		a.setFriend(50);
		a.setIntelli(30);
		a.setMonth(5);
		a.setDay(1);
		a.setDaily(Daily);
		a.setToday(null);
		a.setCount(1);
	}

	/* -------------------리스너-------------------- */
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String btnVal = e.getActionCommand();
			switch (btnVal) {
			case ("강의듣기"):
				screen.change2_3("panel3");
				break;

			case ("공부하기"):
				screen.change2_4("panel4");
				break;

			case ("알바가기"):
				screen.change2_5("panel5");
				break;

			case ("친구와 놀러가기"):
				screen.change2_6("panel6");
				break;

			case ("휴식하기"):
				screen.change2_7("panel7");
				break;
			}
		}
	}
}

/* -------------------2-1.강의 패널-------------------- */
@SuppressWarnings("serial")
class JPanel3 extends JPanel {
	private gamescreen screen;
	private JLabel Lb1;
	private JButton OSBtn, DBBtn, SCBtn;

	public JPanel3(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		Lb1 = new JLabel("어떤 과목의 강의를 들으시겠습니까?");
		Lb1.setBounds(290, 80, 600, 20);
		add(Lb1);

		OSBtn = new JButton("오픈소스소프트웨어");
		OSBtn.setBounds(110, 300, 170, 30);
		add(OSBtn);
		OSBtn.addActionListener(new MyActionListener());

		DBBtn = new JButton("데이터베이스");
		DBBtn.setBounds(310, 300, 170, 30);
		add(DBBtn);
		DBBtn.addActionListener(new MyActionListener());

		SCBtn = new JButton("정보보호");
		SCBtn.setBounds(510, 300, 170, 30);
		add(SCBtn);
		SCBtn.addActionListener(new MyActionListener());

	}

	/* -------------------리스너-------------------- */
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change3_8("panel8");
		}
	}
}

/* -------------------2-1-1.강의 결과 패널-------------------- */
@SuppressWarnings("serial")
class JPanel8 extends JPanel {
	private gamescreen screen;
	private JLabel LtLb1, LtLb2, LtLb3;
	private JLabel LtLb4, LtLb5, LtLb6;
	private JLabel LtLb7, LtLb8, LtLb9;
	private JButton BackBtn;

	public JPanel8(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		init a = new init();

		/* -------------------랜덤값 부여-------------------- */
		int Lt = (int) Math.round(Math.random() * (10) + 1);
		if (Lt <= 2 && Lt > 0) {
			
			LtLb1 = new JLabel("교수님 : 강의를 시작하겠습니다");
			LtLb1.setBounds(310, 60, 600, 20);
			add(LtLb1);
			LtLb2 = new JLabel("주인공: 강의 내용을 다 이해했어!");
			LtLb2.setBounds(300, 90, 600, 20);
			add(LtLb2);
			LtLb3 = new JLabel("지적능력이 +20 만큼 올랐다!");
			LtLb3.setBounds(310, 120, 600, 20);
			add(LtLb3);
			a.setIntelli(a.getIntelli() + 20);
			
		} else if (Lt <= 10 && Lt > 8) {
			
			LtLb4 = new JLabel("교수님 : 강의를 시작하겠습니다");
			LtLb4.setBounds(310, 60, 600, 20);
			add(LtLb4);
			LtLb5 = new JLabel("주인공 : 강의 내용이 이해가 안가...");
			LtLb5.setBounds(310, 90, 600, 20);
			add(LtLb5);
			LtLb6 = new JLabel("지적능력이 +5 만큼 올랐다!");
			LtLb6.setBounds(310, 120, 600, 20);
			add(LtLb6);
			a.setIntelli(+5);
			
		} else {
			
			LtLb7 = new JLabel("교수님 : 강의를 시작하겠습니다");
			LtLb7.setBounds(310, 60, 600, 20);
			add(LtLb7);
			LtLb8 = new JLabel("주인공: 강의 내용이 보람찼어!");
			LtLb8.setBounds(310, 90, 600, 20);
			add(LtLb8);
			LtLb9 = new JLabel("지적능력이 +10 만큼 올랐다!");
			LtLb9.setBounds(310, 120, 600, 20);
			add(LtLb9);
			a.setIntelli(+10);
			
		}
		a.Day++;
		a.DdayNumber -= a.DdayNumber;
		a.Power -= 10;
		a.Money -= 5000;

		BackBtn = new JButton("메인으로 돌아가기");
		BackBtn.setBounds(310, 300, 170, 30);
		add(BackBtn);
		BackBtn.addActionListener(new MyActionListener());

	}

	/* -------------------리스너-------------------- */
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change8_2("panel2");
		}
	}
	
}

/* -------------------2-2.공부 패널-------------------- */
@SuppressWarnings("serial")
class JPanel4 extends JPanel {
	private gamescreen screen;
	private JLabel Lb1;
	private JButton OSBtn, DBBtn, SCBtn;

	public JPanel4(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		Lb1 = new JLabel("어떤 과목의 공부를 하시겠습니까?");
		Lb1.setBounds(300, 80, 600, 20);
		add(Lb1);

		OSBtn = new JButton("오픈소스소프트웨어");
		OSBtn.setBounds(110, 300, 170, 30);
		add(OSBtn);
		OSBtn.addActionListener(new MyActionListener());

		DBBtn = new JButton("데이터베이스");
		DBBtn.setBounds(310, 300, 170, 30);
		add(DBBtn);
		DBBtn.addActionListener(new MyActionListener());

		SCBtn = new JButton("정보보호");
		SCBtn.setBounds(510, 300, 170, 30);
		add(SCBtn);
		SCBtn.addActionListener(new MyActionListener());

	}

	/* -------------------리스너-------------------- */
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change4_9("panel9");
		}
	}
}

/* -------------------2-2-1.공부 결과 패널-------------------- */
@SuppressWarnings("serial")
class JPanel9 extends JPanel {
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
			StLb1 = new JLabel("오늘 공부한 내용이 다 외울 수 있었어!");
			StLb1.setBounds(310, 60, 600, 20);
			add(StLb1);
			StLb2 = new JLabel("지적능력이 +20 만큼 올랐다!");
			StLb2.setBounds(310, 90, 600, 20);
			add(StLb2);
			a.setIntelli(a.getIntelli() + 20);
		} else if (St <= 10 && St > 8) {
			StLb3 = new JLabel("공부하지 않고 놀았다!");
			StLb3.setBounds(310, 60, 600, 20);
			add(StLb3);
			StLb4 = new JLabel("체력이 -5 만큼 더 줄었다!");
			StLb4.setBounds(310, 90, 600, 20);
			add(StLb4);
			a.setIntelli(+5);
		} else {
			StLb5 = new JLabel("오늘 공부한 내용이 이해가 갔어!");
			StLb5.setBounds(310, 60, 600, 20);
			add(StLb5);
			StLb6 = new JLabel("지적능력이 +10 만큼 올랐다!");
			StLb6.setBounds(310, 90, 600, 20);
			add(StLb6);
			a.setIntelli(+10);
		}
		a.Day++;
		a.DdayNumber -= a.DdayNumber;
		a.Power -= 10;
		a.Money -= 5000;

		BackBtn = new JButton("메인으로 돌아가기");
		BackBtn.setBounds(310, 300, 170, 30);
		add(BackBtn);
		BackBtn.addActionListener(new MyActionListener());

	}

	/* -------------------리스너-------------------- */
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change9_2("panel2");
		}
	}
}

/* -------------------2-3.알바 패널-------------------- */
@SuppressWarnings("serial")
class JPanel5 extends JPanel {
	private gamescreen screen;
	private JLabel Lb1;
	private JButton BBtn, TBtn, IceBtn;

	public JPanel5(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		Lb1 = new JLabel("어느 직종의 알바를 가시겠습니까?");
		Lb1.setBounds(300, 80, 600, 20);
		add(Lb1);

		BBtn = new JButton("제과점");
		BBtn.setBounds(150, 300, 100, 30);
		add(BBtn);
		BBtn.addActionListener(new MyActionListener());

		TBtn = new JButton("영화관");
		TBtn.setBounds(350, 300, 100, 30);
		add(TBtn);
		TBtn.addActionListener(new MyActionListener());

		IceBtn = new JButton("아이스크림");
		IceBtn.setBounds(550, 300, 100, 30);
		add(IceBtn);
		IceBtn.addActionListener(new MyActionListener());

	}

	/* -------------------리스너-------------------- */
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change5_10("panel10");
		}
	}
}

/* -------------------2-3-1.알바 결과 패널-------------------- */
@SuppressWarnings("serial")
class JPanel10 extends JPanel {
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
			PtLb1 = new JLabel("보너스를 받았다!");
			PtLb1.setBounds(350, 60, 600, 20);
			add(PtLb1);
			PtLb2 = new JLabel("알바비 +4만원을 받았다!");
			PtLb2.setBounds(330, 90, 600, 20);
			add(PtLb2);
			a.setIntelli(a.getIntelli() + 20);
		} else if (Pt <= 10 && Pt > 8) {
			PtLb3 = new JLabel("실수를 했다... 변상을 해야돼서 알바비를 다 썼다!");
			PtLb3.setBounds(270, 60, 600, 20);
			add(PtLb3);
			PtLb4 = new JLabel("체력이 -5 만큼 더 줄었다!");
			PtLb4.setBounds(330, 90, 600, 20);
			add(PtLb4);
			a.setIntelli(+5);
		} else {
			PtLb5 = new JLabel("알바 끝!");
			PtLb5.setBounds(370, 60, 600, 20);
			add(PtLb5);
			PtLb6 = new JLabel("알바비 +2만원을 받았다!");
			PtLb6.setBounds(330, 90, 600, 20);
			add(PtLb6);
			a.setIntelli(+10);
		}
		a.Day++;
		a.DdayNumber -= a.DdayNumber;
		a.Power -= 10;
		a.Money -= 5000;

		BackBtn = new JButton("메인으로 돌아가기");
		BackBtn.setBounds(310, 300, 170, 30);
		add(BackBtn);
		BackBtn.addActionListener(new MyActionListener());

	}
	
	/* -------------------리스너-------------------- */
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change10_2("panel2");
		}
	}
}

/* -------------------2-4.친구와 놀러가기 패널-------------------- */
@SuppressWarnings("serial")
class JPanel6 extends JPanel {
	private gamescreen screen;
	private JLabel Lb1;
	private JButton Ptn, TBtn, SBtn;

	public JPanel6(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		Lb1 = new JLabel("어느 장소로 가시겠습니까?");
		Lb1.setBounds(330, 80, 600, 20);
		add(Lb1);

		Ptn = new JButton("놀이공원");
		Ptn.setBounds(150, 300, 100, 30);
		add(Ptn);
		Ptn.addActionListener(new MyActionListener());

		TBtn = new JButton("영화관");
		TBtn.setBounds(350, 300, 100, 30);
		add(TBtn);
		TBtn.addActionListener(new MyActionListener());

		SBtn = new JButton("노래방");
		SBtn.setBounds(550, 300, 100, 30);
		add(SBtn);
		SBtn.addActionListener(new MyActionListener());

	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change6_11("panel11");
		}
	}
}

/* -------------------2-4-1.친구와 놀러가기 결과 패널-------------------- */
@SuppressWarnings("serial")
class JPanel11 extends JPanel { 
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
			PlayLb1 = new JLabel("친구들이랑 더 친해졌어!");
			PlayLb1.setBounds(330, 60, 600, 20);
			add(PlayLb1);
			PlayLb2 = new JLabel("친화력이 +20 만큼 올랐다!");
			PlayLb2.setBounds(320, 90, 600, 20);
			add(PlayLb2);
			a.setIntelli(a.getIntelli() + 20);
		} else if (PlayLb <= 10 && PlayLb > 8) {
			PlayLb3 = new JLabel("친구들이랑 서먹서먹 했다...");
			PlayLb3.setBounds(320, 60, 600, 20);
			add(PlayLb3);
			PlayLb4 = new JLabel("친화력이 +5 만큼 올랐다! 피곤해서 체력이 -10 만큼 더 줄었다!");
			PlayLb4.setBounds(250, 90, 600, 20);
			add(PlayLb4);
			a.setIntelli(+5);
		} else {
			PlayLb5 = new JLabel("친구들이랑 잘 놀았다!");
			PlayLb5.setBounds(330, 60, 600, 20);
			add(PlayLb5);
			PlayLb6 = new JLabel("친화력이 +10 만큼 올랐다!");
			PlayLb6.setBounds(320, 90, 600, 20);
			add(PlayLb6);
			a.setIntelli(+10);
		}
		a.Day++;
		a.DdayNumber -= a.DdayNumber;
		a.Power -= 10;
		a.Money -= 5000;

		BackBtn = new JButton("메인으로 돌아가기");
		BackBtn.setBounds(310, 300, 170, 30);
		add(BackBtn);
		BackBtn.addActionListener(new MyActionListener());

	}

	/* -------------------리스너-------------------- */
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change11_2("panel2");
		}
	}
}

/* -------------------2-5.휴식하기 패널-------------------- */
@SuppressWarnings("serial")
class JPanel7 extends JPanel {
	private gamescreen screen;
	private JLabel Lb1;
	private JButton SlBtn, WlBtn, GmBtn;

	public JPanel7(gamescreen screen) {
		this.screen = screen;
		setLayout(null);

		Lb1 = new JLabel("무엇을 하시겠습니까?");
		Lb1.setBounds(335, 80, 600, 20);
		add(Lb1);

		SlBtn = new JButton("낮잠자기");
		SlBtn.setBounds(150, 300, 100, 30);
		add(SlBtn);
		SlBtn.addActionListener(new MyActionListener());

		WlBtn = new JButton("산책하기");
		WlBtn.setBounds(350, 300, 100, 30);
		add(WlBtn);
		WlBtn.addActionListener(new MyActionListener());

		GmBtn = new JButton("게임하기");
		GmBtn.setBounds(550, 300, 100, 30);
		add(GmBtn);
		GmBtn.addActionListener(new MyActionListener());

	}

	/* -------------------리스너-------------------- */
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change7_12("panel12");
		}
	}
}

/* -------------------2-5-1.휴식하기 결과 패널-------------------- */
@SuppressWarnings("serial")
class JPanel12 extends JPanel { 
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
			PlayLb1 = new JLabel("너무 푹 쉬었다!");
			PlayLb1.setBounds(350, 60, 600, 20);
			add(PlayLb1);
			PlayLb2 = new JLabel("체력이 +30 만큼 올랐다!");
			PlayLb2.setBounds(330, 90, 600, 20);
			add(PlayLb2);
			a.setIntelli(a.getIntelli() + 20);
		} else if (PlayLb <= 10 && PlayLb > 8) {
			PlayLb3 = new JLabel("쉬어도 피곤해...");
			PlayLb3.setBounds(350, 60, 600, 20);
			add(PlayLb3);
			PlayLb4 = new JLabel("체력이 +5 만큼 올랐다!");
			PlayLb4.setBounds(330, 90, 600, 20);
			add(PlayLb4);
			a.setIntelli(+5);
		} else {
			PlayLb5 = new JLabel("잘 쉬었다!");
			PlayLb5.setBounds(355, 60, 600, 20);
			add(PlayLb5);
			PlayLb6 = new JLabel("체력이 +20 만큼 올랐다!");
			PlayLb6.setBounds(330, 90, 600, 20);
			add(PlayLb6);
			a.setIntelli(+10);
		}
		a.Day++;
		a.DdayNumber -= a.DdayNumber;
		a.Power -= 10;
		a.Money -= 5000;

		BackBtn = new JButton("메인으로 돌아가기");
		BackBtn.setBounds(310, 300, 170, 30);
		add(BackBtn);
		BackBtn.addActionListener(new MyActionListener());

	}

	/* -------------------리스너-------------------- */
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			screen.change12_2("panel2");
		}
	}
}

/*
@SuppressWarnings("serial")
class JPanel13 extends JPanel { // 선택2 패널
	private gamescreen screen;
	private JLabel Lb1, Lb2;
	private JButton LtBtn, StBtn, PtBtn, PlayBtn, RestBtn;

	public JPanel13(gamescreen screen) {
		setLayout(null);
		this.screen = screen;

		init a = new init();
		String Daily[] = { "일", "월", "화", "수", "목", "금", "토" };

		a.setDdayNumber(45); // 초기값
		a.setPower(100); // 체력
		a.setMoney(100000); // 돈
		a.setFriend(50); // 친화력
		a.setIntelli(30); // 지적능력
		a.setMonth(5); // 월
		a.setDay(1); // 일
		a.setDaily(Daily);
		a.setToday(null);

		if (a.getMonth() == 5) {
			a.Today = a.Daily[a.Day % 7];
		} // 5월과 6월일정에 맞게함
		if (a.Day == 32) {
			a.Month = 6;
			a.Day = 1;
			a.Today = a.Daily[a.Day % 7];
		}

		Lb1 = new JLabel("종강까지 D-" + a.getDdayNumber() + "  2020년   " + a.getMonth() + "월   " + a.getDay() + "일   " + a.getToday() + "요일");
		Lb1.setBounds(290, 60, 600, 20);
		add(Lb1);

		Lb2 = new JLabel("체력 : " + a.getPower() + "   지적능력: " + a.getIntelli() + "   돈 : " + a.getMoney() + "   친화력 : " + a.getFriend());
		Lb2.setBounds(270, 90, 600, 20);
		add(Lb2);

		LtBtn = new JButton("강의듣기");
		LtBtn.setBounds(20, 300, 130, 30);
		add(LtBtn);
		LtBtn.addActionListener(new MyActionListener());

		StBtn = new JButton("공부하기");
		StBtn.setBounds(170, 300, 130, 30);
		add(StBtn);
		StBtn.addActionListener(new MyActionListener());

		PtBtn = new JButton("알바가기");
		PtBtn.setBounds(320, 300, 130, 30);
		add(PtBtn);
		PtBtn.addActionListener(new MyActionListener());

		PlayBtn = new JButton("친구와 놀러가기");
		PlayBtn.setBounds(470, 300, 130, 30);
		add(PlayBtn);
		PlayBtn.addActionListener(new MyActionListener());

		RestBtn = new JButton("휴식하기");
		RestBtn.setBounds(620, 300, 130, 30);
		add(RestBtn);
		RestBtn.addActionListener(new MyActionListener());
	}

	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String btnVal = e.getActionCommand();
			switch (btnVal) {
			case ("강의듣기"):
				screen.change13_3("panel3"); // 강의 패널
				break;

			case ("공부하기"):
				screen.change13_4("panel4"); // 공부 패널
				break;

			case ("알바가기"):
				screen.change13_5("panel5"); // 알바 패널
				break;

			case ("친구와 놀러가기"):
				screen.change13_6("panel6"); // 친구와 놀러가기 패널
				break;

			case ("휴식하기"):
				screen.change13_7("panel7"); // 휴식하기 패널
			}
		}
	}
}
*/
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
	//public JPanel13 jpanel13 = null;

	/* -------------------메인에서 선택화면-------------------- */
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

	/* -------------------선택화면에서 강의듣기-------------------- */
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

	/* -------------------선택화면에서 공부하기-------------------- */
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

	/* -------------------선택화면에서 알바가기-------------------- */
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
	
	/* -------------------선택화면에서 친구와 놀러가기-------------------- */
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

	/* -------------------선택화면에서 휴식하기-------------------- */
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

	/* -------------------강의듣기 결과로 이동-------------------- */
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
	
	/* -------------------강의듣기 결과에서 선택화면-------------------- */
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
	
	/* -------------------공부하기 결과로 이동-------------------- */
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

	/* -------------------공부하기 결과에서 선택화면-------------------- */
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

	/* -------------------알바가기 결과로 이동-------------------- */
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

	/* -------------------알바가기 결과에서 선택화면-------------------- */
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

	/* -------------------친구와 놀러가기 결과로 이동-------------------- */
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

	/* -------------------친구와 놀러가기 결과에서 선택화면-------------------- */
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
	
	/* -------------------휴식하기 결과로 이동-------------------- */
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

	/* -------------------휴식하기 결과에서 선택화면-------------------- */
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
/*
	public void change13_3(String panelName) { // 13에서 2번 패널 이동
		if (panelName.contentEquals("jpanel13")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel13);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel3);
			revalidate();
			repaint();
		}
	}

	public void change13_4(String panelName) { // 13에서 2번 패널 이동
		if (panelName.contentEquals("jpanel13")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel13);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel4);
			revalidate();
			repaint();
		}
	}

	public void change13_5(String panelName) { // 13에서 2번 패널 이동
		if (panelName.contentEquals("jpanel13")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel13);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel5);
			revalidate();
			repaint();
		}
	}

	public void change13_6(String panelName) { // 13에서 2번 패널 이동
		if (panelName.contentEquals("jpanel13")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel13);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel6);
			revalidate();
			repaint();
		}
	}

	public void change13_7(String panelName) { // 13에서 2번 패널 이동
		if (panelName.contentEquals("jpanel13")) {
			getContentPane().removeAll();
			getContentPane().add(jpanel13);
			revalidate();
			repaint();
		} else {
			getContentPane().removeAll();
			getContentPane().add(jpanel7);
			revalidate();
			repaint();
		}
	}
	*/
}