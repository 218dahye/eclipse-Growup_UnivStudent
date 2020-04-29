package project;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class PartTime extends JFrame {
	Container contentPane;
	static JButton button1 = new JButton("제과점");
	static JButton button2 = new JButton("영화관");
	static JButton button3 = new JButton("아이스크림");
	static JButton button4 = new JButton("뒤로가기");

	PartTime(JLabel Lb1, JLabel Lb2) {
		setTitle("알바가기");
		setLocationRelativeTo(null);
		contentPane = getContentPane();
		contentPane.setLayout(null);

		JLabel PtLb1 = new JLabel();
		PtLb1.setText("어느 직종의 알바를 가시겠습니까?");
		PtLb1.setBounds(270, 140, 600, 20);
		contentPane.add(PtLb1);

		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);
		button4.setEnabled(true);

		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);
		contentPane.add(button4);

		button1.setBounds(10, 300, 170, 30);
		button2.setBounds(210, 300, 170, 30);
		button3.setBounds(410, 300, 170, 30);
		button4.setBounds(610, 300, 170, 30);

		button1.addActionListener(event -> {
			init.money_up();
			Lb1.setText("종강까지 D- " + init.DdayNumber + " 2020년  " + init.Month + " 월  " + init.Day + "일  " + init.Today
					+ "요일");
			Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
			dispose();
		});
		button2.addActionListener(event -> {
			init.money_up();
			Lb1.setText("종강까지 D- " + init.DdayNumber + " 2020년  " + init.Month + " 월  " + init.Day + "일  " + init.Today
					+ "요일");
			Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
			dispose();
		});
		button3.addActionListener(event -> {
			init.money_up();
			Lb1.setText("종강까지 D- " + init.DdayNumber + " 2020년  " + init.Month + " 월  " + init.Day + "일  " + init.Today
					+ "요일");
			Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
			dispose();
		});

		button4.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "뒤로 이동합니다", "뒤로 이동", JOptionPane.INFORMATION_MESSAGE); // 메시지
			dispose();
		});

		setSize(800, 680);
		setVisible(true);
	}

}
