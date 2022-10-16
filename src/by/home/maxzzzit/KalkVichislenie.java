package by.home.maxzzzit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkVichislenie {
    KalkVichislenie kalkVichislenie = new KalkVichislenie();
	void KalkVichislenie(){

        kalkVichislenie.one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kalkTF1.setText(kalkTF1.getText()+"1");
            }
        });
    }
}
