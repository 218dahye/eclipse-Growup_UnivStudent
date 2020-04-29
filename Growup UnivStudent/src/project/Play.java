package project;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Play extends JFrame {
	Container contentPane;
	static JButton button1 = new JButton("놀이공원");
	static JButton button2 = new JButton("영화관");
	static JButton button3 = new JButton("노래방");
	static JButton button4 = new JButton("뒤로가기");

	Play(JLabel Lb1, JLabel Lb2) {
		setTitle("친구랑 놀러가기");
		setLocationRelativeTo(null);
		contentPane = getContentPane();
		contentPane.setLayout(null);

		JLabel PlayLb1 = new JLabel();
		PlayLb1.setText("어느 장소로 가시겠습니까?");
		PlayLb1.setBounds(270, 140, 600, 20);
		contentPane.add(PlayLb1);

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
			init.friend_up();
			Lb1.setText("종강까지 D- " + init.DdayNumber + " 2020년  " + init.Month + " 월  " + init.Day + "일  " + init.Today
					+ "요일");
			Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
			dispose();
		});
		button2.addActionListener(event -> {
			init.friend_up();
			Lb1.setText("종강까지 D- " + init.DdayNumber + " 2020년  " + init.Month + " 월  " + init.Day + "일  " + init.Today
					+ "요일");
			Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money + " 친화력 " + init.Friend);
			dispose();
		});
		button3.addActionListener(event -> {
			init.friend_up();
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
