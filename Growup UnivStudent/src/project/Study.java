package project;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Study extends JFrame {
	Container contentPane;
	static JButton button1 = new JButton("오픈소스소프트웨어");
	static JButton button2 = new JButton("데이터베이스");
	static JButton button3 = new JButton("정보보호");
	static JButton button4 = new JButton("뒤로가기");

	Study(JLabel Lb1, JLabel Lb2) {
		setTitle("공부하기");
		setLocationRelativeTo(null);
		contentPane = getContentPane();
		contentPane.setLayout(null);

		JLabel SLb1 = new JLabel();
		SLb1.setText("어떤 과목의 공부를 하시겠습니까?");
		SLb1.setBounds(270, 140, 600, 20);
		contentPane.add(SLb1);

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
			init.intelli_up();
			Lb1.setText("종강까지 D- " + init.DdayNumber + " 2020년  " + init.Month + " 월  " + init.Day + "일  " + init.Today
					+ "요일");
			Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
			dispose();
		});
		button2.addActionListener(event -> {
			init.intelli_up();
			;
			Lb1.setText("종강까지 D- " + init.DdayNumber + " 2020년  " + init.Month + " 월  " + init.Day + "일  " + init.Today
					+ "요일");
			Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
			dispose();
		});
		button3.addActionListener(event -> {
			init.intelli_up();
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
