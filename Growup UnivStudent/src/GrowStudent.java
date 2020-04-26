import java.util.Scanner;

import javax.swing.JFrame;

public class GrowStudent {
	public static void main(String[] args) {


		gamescreen screen = new gamescreen();
		screen.setTitle("대학생 키우기");
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
			System.out.println("\t+-----<< 대학생 키우기 >>-----+");
			System.out.println("1. 시작하기");
			System.out.println("2. 종료하기");
			starting = pick.nextInt();

			if (starting == 1)
				break;
			else if (starting == 2) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("\n잘못 입력하였습니다.\n");
			}
		} // while문 종료

		System.out.println("=========================== 게임을 시작합니다 ============================");
		System.out.println();
		System.out.println("<설레는 새 학기가 시작되었다!..도 잠시 어느새 중간고사가 끝?! 이제 남은 건 진짜 기말고사 뿐이야..!>");
		System.out.println("<종강까지 남은 45일 동안 대학생을 열심히 키워보자! 당신은 과연 어떤 엔딩을 맞이하게 될 것인가 !>");
		System.out.println();

		while (true) {

			if (Month == 5) {
				Today = Daily[Day % 7];
			} // 5월과 6월일정에 맞게함
			if (Day == 32) {
				Month = 6;
				Day = 1;
				Today = Daily[Day % 7];
			}
			System.out.println("===================================================================");
			System.out.println("종강까지 D-" + DdayNumber + "  2020년   " + Month + "월   " + Day + "일   " + Today + "요일");
			System.out.println(
					"체력 : " + Power + "  /  지적능력: " + Intelli + " /   돈 : " + Money + "원   /  친화력 : " + Friend);
			System.out.println();
			System.out.println("주인공 : 앞으로 종강까지 " + DdayNumber + "일! 뭘 해볼까?");
			System.out.println();
			System.out.println("1. 강의듣기 : 강의를 듣자! 학점을 살려야겠어!(1일 소모, 체력 -10, 지적능력 +10, 돈 -5000, <주말은 선택안됨>)");
			System.out.println("2. 공부하기 : 공부를 하자! A+를 받는거야!(1일 소모, 체력 -20, 지적능력 +10)");
			System.out.println("3. 알바가기 : 돈을 벌어보자! 힘든만큼  보람찰거야!(1일 소모, 체력 -20, 돈 +20000)"); // 알바종류를 switch case로 늘려도
																							// 좋을듯
			System.out.println("4. 친구와 놀러가기 : 친목을 쌓아보자! 친구들과 돈독해지자!(1일 소모, 체력 -10, 돈 -20000, 친화력 +10)"); // 랜덤함수로 랜덤하게
																											// 선배가 준
																											// 족보(지적능력+3)
																											// 이런것도
																											// 좋을듯?!
			System.out.println("5. 휴식하기 : 쉬어보자! 역시 쉬는게 최고야!(1일 소모, 체력+20)");// 랜덤함수로 배고파서 충동적으로 피자를 시켰다!(돈 -20000) 이런거..
			System.out.println("===================================================================");// 5. 공부하기를 따로 만들까
																										// 생각중
			int select = pick.nextInt();
			if (select == 1 && (Today.equals("토") || Today.equals("일"))) {
				System.out.println("※ 주말입니다. 다시 선택해주십시오!※");
				continue;
			} // 어떻게 할지..
			switch (select) {
			case 1:
				System.out.println("\n강의를 듣자\n");
				System.out.println("어떤 과목의 강의를 들으시겠습니까?");
				System.out.println("1. 오픈소스소프트웨어\n2. 데이터베이스\n3. 정보보호");
				int iselect = pick.nextInt();
				if (iselect == 1)
					System.out.println("오픈소스소프트웨어 강의를 듣자");
				else if (iselect == 2)
					System.out.println("데이터베이스 강의를 듣자");
				else
					System.out.println("정보보호 강의를 듣자");

				int i = (int) Math.round(Math.random() * (10) + 1);
				if (i <= 2 && i > 0) {
					System.out.println("교수님 : 오픈소스 소프트웨어 강의를 시작하겠습니다\n주인공: 강의 내용을 다 이해했어!");
					System.out.println("\n지적능력이 +20 만큼 올랐다!");
					Intelli += 20;
				} else if (i <= 10 && i > 8) {
					System.out.println("교수님 : 오픈소스 소프트웨어 강의를 시작하겠습니다 \n주인공 : 강의 내용이 이해가 안가...");
					System.out.println("\n지적능력이 +5 만큼 올랐다!");
					Intelli += 5;
				} else {
					System.out.println("교수님 : 오픈소스 소프트웨어 강의를 시작하겠습니다 \n주인공: 강의 내용이 보람찼어!");
					System.out.println("\n지적능력이 +10 만큼 올랐다!");
					Intelli += 10;
				}
				System.out.println();
				Day++;
				DdayNumber--;
				Power -= 10;
				Money -= 5000;
				break;
			case 2:
				System.out.println("\n공부를 하자\n");
				System.out.println("어떤 과목의 공부를 하시겠습니까?");
				System.out.println("1. 오픈소스소프트웨어\n2. 데이터베이스\n3. 정보보호");
				int studyselect = pick.nextInt();
				if (studyselect == 1)
					System.out.println("오픈소스소프트웨어 공부를 하자");
				else if (studyselect == 2)
					System.out.println("데이터베이스 공부를 하자");
				else
					System.out.println("정보보호 공부를 하자");

				int study = (int) Math.round(Math.random() * (10) + 1);
				if (study <= 2 && study > 0) {
					System.out.println("\n공부 중");
					System.out.println("\n오늘 공부한 내용이 다 외울 수 있었어! 지적능력이 +20 만큼 올랐다!");
					Intelli += 20;
				} else if (study <= 10 && study > 8) {
					System.out.println("\n공부하지 않고 놀았다!");
					System.out.println("체력이 -5 만큼 더 줄었다!");
					Power -= 5;
				} else {
					System.out.println("\n공부 중");
					System.out.println("\n오늘 공부한 내용이 이해가 갔어! 지적능력이 +10 만큼 올랐다!");
					Intelli += 10;
				}
				System.out.println();
				Day++;
				DdayNumber--;
				Power -= 20;
				break;

			case 3:
				System.out.println("\n알바를 가자\n");
				System.out.println("어느 직종의 알바를 가시겠습니까?");
				System.out.println("1. 제과점\n2. 영화관\n3. 아이스크림");
				int parttime = pick.nextInt();
				if (parttime == 1)
					System.out.println("제과점 알바를 가자");
				else if (parttime == 2)
					System.out.println("영화관 알바를 가자");
				else
					System.out.println("아이스크림 알바를 가자");

				int job = (int) Math.round(Math.random() * (10) + 1);
				if (job <= 2 && job > 0) {
					System.out.println("\n알바 중");
					System.out.println("\n보너스를 받았다! 알바비 +4만원을 받았다!");
					Money += 40000;
				} else if (job <= 10 && job > 8) {
					System.out.println("\n알바 중");
					System.out.println("\n실수를 했다... 변상을 해야돼서 알바비를 다 썼다!");
					System.out.println("체력이 -5 만큼 더 줄었다!");
					Power -= 5;
				} else {
					System.out.println("\n알바 중");
					System.out.println("\n알바비 +2만원을 받았다!");
					Money += 20000;
				}
				System.out.println();
				Day++;
				DdayNumber--;
				Power -= 20;
				break;
			case 4:
				System.out.println("\n친구들이랑 놀러를 가자\n");
				System.out.println("어느 장소로 가시겠습니까?");
				System.out.println("1. 놀이공원\n2. 영화관\n3. 노래방");
				int place = pick.nextInt();
				if (place == 1)
					System.out.println("놀이공원으로 가자");
				else if (place == 2)
					System.out.println("영화관으로로 가자");
				else
					System.out.println("노래방으로 가자");
				int play = (int) Math.round(Math.random() * (10) + 1);
				if (play <= 2 && play > 0) {
					System.out.println("\n노는 중");
					System.out.println("\n친구들이랑 더 친해졌어! 친화력이 +20 만큼 올랐다!");
					Friend += 20;
				} else if (play <= 10 && play > 8) {
					System.out.println("\n노는 중");
					System.out.println("\n친구들이랑 서먹서먹 했다... 친화력이 +5 만큼 올랐다!");
					Friend += 5;
					System.out.println("피곤해서 체력이 -10 만큼 더 줄었다!");
					Power -= 10;
				} else {
					System.out.println("\n노는 중");
					System.out.println("\n친구들이랑 잘 놀았다! 친화력이 +10 만큼 올랐다!");
					Friend += 10;
				}
				System.out.println();
				Day++;
				DdayNumber--;
				Power -= 10;
				Money -= 20000;
				break;
			case 5:
				System.out.println("\n쉬어보자\n");
				System.out.println("무엇을 하시겠습니까?");
				System.out.println("1. 낮잠자기\n2. 산책하기\n3. 게임하기");
				int restselect = pick.nextInt();
				if (restselect == 1)
					System.out.println("낮잠을 자자");
				else if (restselect == 2)
					System.out.println("날씨도 좋은데 산책을 가자");
				else
					System.out.println("게임을 하자");
				int rest = (int) Math.round(Math.random() * (10) + 1);
				if (rest <= 2 && rest > 0) {
					System.out.println("\n쉬는 중");
					System.out.println("너무 푹 쉬었다! 체력이 +30 만큼 올랐다!");
					Power += 30;
				} else if (rest <= 10 && rest > 8) {
					System.out.println("\n쉬는 중");
					System.out.println("\n쉬어도 피곤해... 체력이 +5 만큼 올랐다!");
					Power += 5;
				} else {
					System.out.println("\n쉬는 중");
					System.out.println("\n잘 쉬었다! 체력이 +20 만큼 올랐다!");
					Power += 20;
				}
				System.out.println();
				Day++;
				DdayNumber--;
				break;
			}
			if (DdayNumber == 0)
				break;  종강시 while끝나고 엔딩 나오게 함 
			if (Power <= 0) {
				System.out.println("===================================================================");
				System.out.println("체력이 0이 되었습니다. 더 이상 움직일 수 없습니다.");
				System.out.println("========================== 게임 종료되었습니다 ===========================");
			} else if (Intelli <= 0) {
				System.out.println("===================================================================");
				System.out.println("지적능력이 0이 되었습니다. 더 이상 공부를 할 수 없습니다.");
				System.out.println("========================== 게임 종료되었습니다 ===========================");
			} else if (Money <= 0) {
				System.out.println("===================================================================");
				System.out.println("돈이 0이 되었습니다. 더 이상 어디를 갈 수가 없습니다.");
				System.out.println("========================== 게임 종료되었습니다 ===========================");
			} else if (Friend <= 0) {
				System.out.println("===================================================================");
				System.out.println("친화력이 0이 되었습니다. 더 이상 친구들을 만날 수 없습니다.");
				System.out.println("========================== 게임 종료되었습니다 ===========================");
			}

			if (Power <= 0 || Intelli <= 0 || Money <= 0 || Friend <= 0) {
				System.out.println("===================================================================");
				System.out.println("<게임을 다시 시작하시겠습니까?>");
				System.out.println("===================================================================");
				while (true) {
					System.out.println("1. 시작하기");
					System.out.println("2. 종료하기");
					starting = pick.nextInt();

					if (starting == 1) {
						DdayNumber = 45; // 초기값
						Power = 20; // 체력
						Money = 100000; // 돈
						Friend = 50; // 친화력
						Intelli = 30; // 지적능력
						Month = 5; // 월
						Day = 1; // 일
						Today = null;
						break;
					}

					else if (starting == 2) {
						System.out.println("게임을 종료합니다.");
						System.exit(0);
					} else {
						System.out.println("\n잘못 입력하였습니다.\n");
					}
				}
			}
		} // 와일종료

		System.out.println("===================================================================\n");
		System.out.println("=========================== 게임 끝났습니다 ============================\n");
		System.out.println("===================================================================\n");

		if (Power == 100 && Intelli == 100 && Friend == 100) {
			System.out.println("===================================================================");
			System.out.println("당신은 과탑이 되었습니다!\n 축하드립니다!");
			System.out.println("===================================================================");
		} else if (Power >= 50 && Intelli >= 50 && Friend >= 50) {
			System.out.println("===================================================================");
			System.out.println("당신은 학교 생활을 알차게 보내셨군요!");
			System.out.println("===================================================================");
		} else if (Power == 0 && Intelli == 0 && Friend == 0) {
			System.out.println("===================================================================");
			System.out.println("당신은 학교를 다니지 않았군요... ");
			System.out.println("===================================================================");
		}
	}

	// TODO Auto-generated method stub
*/
}
}
