package project;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Play extends JFrame {
	Container contentPane;
	static JButton button1 = new JButton("���̰���");
	static JButton button2 = new JButton("��ȭ��");
	static JButton button3 = new JButton("�뷡��");
	static JButton button4 = new JButton("�ڷΰ���");

	Play(JLabel Lb1, JLabel Lb2) {
		setTitle("ģ���� �����");
		setLocationRelativeTo(null);
		contentPane = getContentPane();
		contentPane.setLayout(null);

		JLabel PlayLb1 = new JLabel();
		PlayLb1.setText("��� ��ҷ� ���ðڽ��ϱ�?");
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
			Lb1.setText("�������� D- " + init.DdayNumber + " 2020��  " + init.Month + " ��  " + init.Day + "��  " + init.Today
					+ "����");
			Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
			dispose();
		});
		button2.addActionListener(event -> {
			init.friend_up();
			Lb1.setText("�������� D- " + init.DdayNumber + " 2020��  " + init.Month + " ��  " + init.Day + "��  " + init.Today
					+ "����");
			Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
			dispose();
		});
		button3.addActionListener(event -> {
			init.friend_up();
			Lb1.setText("�������� D- " + init.DdayNumber + " 2020��  " + init.Month + " ��  " + init.Day + "��  " + init.Today
					+ "����");
			Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
			dispose();
		});
		button4.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "�ڷ� �̵��մϴ�", "�ڷ� �̵�", JOptionPane.INFORMATION_MESSAGE); // �޽���
			dispose();
		});

		setSize(800, 680);
		setVisible(true);
	}

}