package by.home.maxzzzit;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KalkDannie extends JFrame{
	double ch1, ch2, summa, raznost, proizvedenie, chasnoe;
	int plus = 0,  minus = 0,  umnosh = 0,  delit = 0;
	public KalkDannie(String s) {
		super(s);	

//		JFrame kalkForm = new JFrame();
//		JPanel kalkPanel = new JPanel();
		JTextField kalkTF1 = new JTextField(13);
		JButton zero = new JButton("  0  ");
		JButton one = new JButton("  1  ");
		JButton two = new JButton("  2  ");
		JButton three = new JButton("  3  ");
		JButton four = new JButton("  4  ");
		JButton five = new JButton("  5  ");
		JButton six = new JButton("  6  ");
		JButton seven = new JButton("  7  ");
		JButton eight = new JButton("  8  ");
		JButton nine = new JButton("  9  ");
		JButton kalkButClean = new JButton("  C  ");
		JButton kalkButVichislit = new JButton("  =  ");
		JButton kalkButPlus = new JButton("+");
		JButton kalkButMinus = new JButton("-");
		JButton kalkButUmnosh = new JButton("*");
		JButton kalkButDelit = new JButton("/");

		setLayout(new FlowLayout());
//		kalkForm.add(kalkPanel.add(kalkTF1));
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
		
	
		
		
		
		kalkButPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String chislo1 = kalkTF1.getText();	
				ch1 = Double.parseDouble(chislo1);
				kalkTF1.setText(null);
				plus++;
			}
		});

		kalkButMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String chislo1 = kalkTF1.getText();	
				ch1 = Double.parseDouble(chislo1);
				kalkTF1.setText(null);
				minus++;
			}
		});
		
		kalkButUmnosh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String chislo1 = kalkTF1.getText();	
				ch1 = Double.parseDouble(chislo1);
				kalkTF1.setText(null);
				umnosh++;
			}
		});
		
		kalkButDelit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String chislo1 = kalkTF1.getText();	
				ch1 = Double.parseDouble(chislo1);
				kalkTF1.setText(null);
				delit++;
			}
		});
		
		kalkButClean.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				kalkTF1.setText(null);
				plus = 0;
				minus = 0;
				umnosh = 0;
				delit = 0;
			}
		});
		
		kalkButVichislit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				if (plus == 1) {
				String chislo2 = kalkTF1.getText();	
				ch2 = Double.parseDouble(chislo2);
				kalkTF1.setText(null);
				summa = ch1+ch2;
				kalkTF1.setText(summa+"");
				System.out.println("Сумма "+ ch1+" + "+ch2+" = "+summa);
				}

				if (minus == 1) {
				String chislo2 = kalkTF1.getText();	
				ch2 = Double.parseDouble(chislo2);
				kalkTF1.setText(null);
				raznost = ch1-ch2;
				kalkTF1.setText(raznost+"");
				System.out.println("Разность "+ ch1+" - "+ch2+" = "+raznost);
				}
				
				if (umnosh == 1) {
				String chislo2 = kalkTF1.getText();	
				ch2 = Double.parseDouble(chislo2);
				kalkTF1.setText(null);
				proizvedenie = ch1*ch2;
				kalkTF1.setText(proizvedenie+"");
				System.out.println("Произведение "+ ch1+" * "+ch2+" = "+proizvedenie);
				}
				
				if (delit == 1) {
				String chislo2 = kalkTF1.getText();	
				ch2 = Double.parseDouble(chislo2);
				kalkTF1.setText(null);
				chasnoe = ch1/ch2;
//				double rezult = Math.ceil(chasnoe);
				double rezult = Math.round(chasnoe);
				kalkTF1.setText(rezult+"");
				System.out.println("Часное "+ ch1+" / "+ch2+" = "+rezult);
				}
				
				summa = 0;
				raznost = 0;
				proizvedenie = 0;
				chasnoe = 0;
				plus = 0;
				minus = 0;
				umnosh = 0;
				delit = 0;

	}

});
		
		
	}
}
