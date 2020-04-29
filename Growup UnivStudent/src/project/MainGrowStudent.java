package project;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainGrowStudent extends JFrame {
	Container contentPane;

	MainGrowStudent() {
		setTitle("<< 대학생 키우기 >>");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(null);

		init.MT();
		JLabel Lb1 = new JLabel();
		Lb1.setBounds(270, 140, 600, 20);
		Lb1.setText(
				"종강까지 D- " + init.DdayNumber + " 2020년  " + init.Month + " 월  " + init.Day + "일  " + init.Today + "요일");
		contentPane.add(Lb1);

		JLabel Lb2 = new JLabel();
		Lb2.setBounds(290, 170, 600, 20);
		Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
		contentPane.add(Lb2);

		JButton LBtn = new JButton("강의듣기");
		contentPane.add(LBtn);
		LBtn.setBounds(20, 300, 130, 30);
		LBtn.addActionListener(event -> {

			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력

			} else
				new Lecture(Lb1, Lb2);
		});

		JButton SBtn = new JButton("공부하기");
		contentPane.add(SBtn);
		SBtn.setBounds(170, 300, 130, 30);
		SBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new Study(Lb1, Lb2);
		});

		JButton PtBtn = new JButton("알바가기");
		contentPane.add(PtBtn);
		PtBtn.setBounds(320, 300, 130, 30);
		PtBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else
				new PartTime(Lb1, Lb2);
		});

		JButton PlayBtn = new JButton("친구와 놀러가기");
		contentPane.add(PlayBtn);
		PlayBtn.setBounds(470, 300, 130, 30);
		PlayBtn.addActionListener(event -> {
			if (init.Power <= 0) {
				JOptionPane.showMessageDialog(null, "체력이 " + init.Power + "입니다" + "\n체력이 없어서 더 이상 할 수 없습니다", "경고",
						JOptionPane.WARNING_MESSAGE); // 메시지 출력

			} else if (init.Money <= 0) {
				JOptionPane.showMessageDialog(null, "돈이 없어서 더 이상 할 수 없습니다", "경고", JOptionPane.WARNING_MESSAGE); // 메시지
																												// 출력
			} else
				new Play(Lb1, Lb2);
		});

		JButton RestBtn = new JButton("휴식하기");
		contentPane.add(RestBtn);
		RestBtn.setBounds(620, 300, 130, 30);
		RestBtn.addActionListener(event -> {
			new Rest(Lb1, Lb2);
		});

		setSize(800, 680);
		setVisible(true);
	}

	public static void main(String[] args) {

		new MainGrowStudent();

	}
}
