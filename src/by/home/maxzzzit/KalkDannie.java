package by.home.maxzzzit;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class KalkDannie extends JFrame{
	double ch1, ch2, summa, raznost, proizvedenie, chasnoe;
	int plus = 0,  minus = 0,  umnosh = 0,  delit = 0;
	JTextField kalkTF1;
	JButton zero, one, two, three, four, five, six, seven, eight, nine, kalkButClean, kalkButVichislit,
			kalkButPlus, kalkButMinus, kalkButUmnosh, kalkButDelit;

	KalkDannie() {

		kalkTF1 = new JTextField(13);
		zero = new JButton("  0  ");
		one = new JButton("  1  ");
		two = new JButton("  2  ");
		three = new JButton("  3  ");
		four = new JButton("  4  ");
		five = new JButton("  5  ");
		six = new JButton("  6  ");
		seven = new JButton("  7  ");
		eight = new JButton("  8  ");
		nine = new JButton("  9  ");
		kalkButClean = new JButton("  C  ");
		kalkButVichislit = new JButton("  =  ");
		kalkButPlus = new JButton("+");
		kalkButMinus = new JButton("-");
		kalkButUmnosh = new JButton("*");
		kalkButDelit = new JButton("/");

		setLayout(new FlowLayout());
		Font big = kalkTF1.getFont().deriveFont(Font.PLAIN,25f);
		kalkTF1.setFont(big);
		add(kalkTF1);
		add(kalkButPlus);
		add(kalkButMinus);
		add(kalkButUmnosh);
		add(kalkButDelit);
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(seven);
		add(eight);
		add(nine);
		add(zero);
		add(kalkButClean);
		add(kalkButVichislit);
		setBounds(100,100,250,100);

		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				kalkTF1.setText(kalkTF1.getText()+"1");
			}
		});
		
		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				kalkTF1.setText(kalkTF1.getText()+"2");
			}
		});
			
		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				kalkTF1.setText(kalkTF1.getText()+"3");
			}
		});
		
		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				kalkTF1.setText(kalkTF1.getText()+"4");
			}
		});
		
		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				kalkTF1.setText(kalkTF1.getText()+"5");
			}
		});
		
		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				kalkTF1.setText(kalkTF1.getText()+"6");
			}
		});
		
		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				kalkTF1.setText(kalkTF1.getText()+"7");
			}
		});
		
		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				kalkTF1.setText(kalkTF1.getText()+"8");
			}
		});
		
		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				kalkTF1.setText(kalkTF1.getText()+"9");
			}
		});
		
		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				kalkTF1.setText(kalkTF1.getText()+"0");
			}
		});
		setTitle("Калькулятор");
		setSize(330, 215);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
