   package front;

   import front.button;

import java.util.ArrayList;

import javax.swing.*;

   public class userInterface {
         public static void layout() {
            JFrame frame = new JFrame();
      
            frame.setSize(700, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);
            frame.setVisible(true);

            ArrayList<JButton> buttonList = button.buttons();

            for (JButton button : buttonList) {
               frame.add(button);
           }
         }
   }
