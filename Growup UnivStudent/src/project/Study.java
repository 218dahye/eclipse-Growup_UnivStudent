package project;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Study extends JFrame {
	Container contentPane;
	static JButton button1 = new JButton("���¼ҽ�����Ʈ����");
	static JButton button2 = new JButton("�����ͺ��̽�");
	static JButton button3 = new JButton("������ȣ");
	static JButton button4 = new JButton("�ڷΰ���");

	Study(JLabel Lb1, JLabel Lb2) {
		setTitle("�����ϱ�");
		setLocationRelativeTo(null);
		contentPane = getContentPane();
		contentPane.setLayout(null);

		JLabel SLb1 = new JLabel();
		SLb1.setText("� ������ ���θ� �Ͻðڽ��ϱ�?");
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
			Lb1.setText("�������� D- " + init.DdayNumber + " 2020��  " + init.Month + " ��  " + init.Day + "��  " + init.Today
					+ "����");
			Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
			dispose();
		});
		button2.addActionListener(event -> {
			init.intelli_up();
			;
			Lb1.setText("�������� D- " + init.DdayNumber + " 2020��  " + init.Month + " ��  " + init.Day + "��  " + init.Today
					+ "����");
			Lb2.setText("ü�� " + init.Power + " ���� " + init.Intelli + " �� " + init.Money + " ģȭ�� " + init.Friend);
			dispose();
		});
		button3.addActionListener(event -> {
			init.intelli_up();
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
