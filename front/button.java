package front;

import java.util.ArrayList;

import javax.swing.JButton;

public class button {
    public static ArrayList<JButton> buttons() {
        ArrayList<JButton> buttonList = new ArrayList<>();

            for(int i = 1; i <= 5; i++) {
               JButton button = new JButton("teste");
               button.setBounds(50, 50 + (i - 1) * 40, 95, 30);
               buttonList.add(button);
            }

            return buttonList;
         }  
}
