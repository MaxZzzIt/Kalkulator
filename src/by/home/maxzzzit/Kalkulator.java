package by.home.maxzzzit;

import javax.swing.JFrame;

public class Kalkulator{

	public static void main(String[]args) {
		
		KalkDannie kalkDannie = new KalkDannie("Kalkulator");
		KalkVichislenie kalkVichislenie = new KalkVichislenie();
		kalkVichislenie.KalkVichislenie();
		kalkDannie.setSize(330, 215);
		kalkDannie.setLocationRelativeTo(null);
		kalkDannie.setResizable(false);
		kalkDannie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		kalkDannie.setVisible(true);

	}
}
