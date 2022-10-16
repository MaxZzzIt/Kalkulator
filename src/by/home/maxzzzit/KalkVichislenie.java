package by.home.maxzzzit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkVichislenie {
    KalkDannie kalkDannie = new KalkDannie();
	void KalkVichislenie(){

        kalkDannie.kalkButPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chislo1 = kalkDannie.kalkTF1.getText();
                kalkDannie.ch1 = Double.parseDouble(chislo1);
                kalkDannie.kalkTF1.setText(null);
                kalkDannie.plus++;
            }
        });

        kalkDannie.kalkButMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chislo1 = kalkDannie.kalkTF1.getText();
                kalkDannie.ch1 = Double.parseDouble(chislo1);
                kalkDannie.kalkTF1.setText(null);
                kalkDannie.minus++;
            }
        });

        kalkDannie.kalkButUmnosh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chislo1 = kalkDannie.kalkTF1.getText();
                kalkDannie.ch1 = Double.parseDouble(chislo1);
                kalkDannie.kalkTF1.setText(null);
                kalkDannie.umnosh++;
            }
        });

        kalkDannie.kalkButDelit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chislo1 = kalkDannie.kalkTF1.getText();
                kalkDannie.ch1 = Double.parseDouble(chislo1);
                kalkDannie.kalkTF1.setText(null);
                kalkDannie.delit++;
            }
        });

        kalkDannie.kalkButClean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kalkDannie.kalkTF1.setText(null);
                kalkDannie.plus = 0;
                kalkDannie.minus = 0;
                kalkDannie.umnosh = 0;
                kalkDannie.delit = 0;
            }
        });

        kalkDannie.kalkButVichislit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (kalkDannie.plus == 1) {
                    String chislo2 = kalkDannie.kalkTF1.getText();
                    kalkDannie.ch2 = Double.parseDouble(chislo2);
                    kalkDannie.kalkTF1.setText(null);
                    kalkDannie.summa = kalkDannie.ch1+kalkDannie.ch2;
                    kalkDannie.kalkTF1.setText(kalkDannie.summa+"");
                    System.out.println("Сумма "+ kalkDannie.ch1+" + "+kalkDannie.ch2+" = "+kalkDannie.summa);
                }

                if (kalkDannie.minus == 1) {
                    String chislo2 = kalkDannie.kalkTF1.getText();
                    kalkDannie.ch2 = Double.parseDouble(chislo2);
                    kalkDannie.kalkTF1.setText(null);
                    kalkDannie.raznost = kalkDannie.ch1-kalkDannie.ch2;
                    kalkDannie.kalkTF1.setText(kalkDannie.raznost+"");
                    System.out.println("Разность "+ kalkDannie.ch1+" - "+kalkDannie.ch2+" = "+kalkDannie.raznost);
                }

                if (kalkDannie.umnosh == 1) {
                    String chislo2 = kalkDannie.kalkTF1.getText();
                    kalkDannie.ch2 = Double.parseDouble(chislo2);
                    kalkDannie.kalkTF1.setText(null);
                    kalkDannie.proizvedenie = kalkDannie.ch1*kalkDannie.ch2;
                    kalkDannie.kalkTF1.setText(kalkDannie.proizvedenie+"");
                    System.out.println("Произведение "+ kalkDannie.ch1+" * "+kalkDannie.ch2+" = "+kalkDannie.proizvedenie);
                }

                if (kalkDannie.delit == 1) {
                    String chislo2 = kalkDannie.kalkTF1.getText();
                    kalkDannie.ch2 = Double.parseDouble(chislo2);
                    kalkDannie.kalkTF1.setText(null);
                    kalkDannie.chasnoe = kalkDannie.ch1/kalkDannie.ch2;
//				double rezult = Math.ceil(chasnoe);
                    double rezult = Math.round(kalkDannie.chasnoe);
                    kalkDannie.kalkTF1.setText(rezult+"");
                    System.out.println("Часное "+ kalkDannie.ch1+" / "+kalkDannie.ch2+" = "+rezult);
                }

                kalkDannie.summa = 0;
                kalkDannie.raznost = 0;
                kalkDannie.proizvedenie = 0;
                kalkDannie.chasnoe = 0;
                kalkDannie.plus = 0;
                kalkDannie.minus = 0;
                kalkDannie.umnosh = 0;
                kalkDannie.delit = 0;
            }
        });
    }
}
