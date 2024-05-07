import javax.swing.*;
import java.awt.event.ActionEvent;

public class Windows {

    public  static void getWindows()
    {
         JFrame jFrame=new JFrame();
         jFrame.setBounds(400,200,400,200);


         JButton jButton1 =new JButton("开始游戏");
         JButton jButton2 =new JButton("退出游戏");
         jFrame.setLayout(null);

         jButton1.setBounds(10,120,100,40);
         jButton2.setBounds(280,120,100,40);

         jFrame.add(jButton1);
         jFrame.add(jButton2);

         jFrame.setVisible(true);

         jButton1.addActionListener(new AbstractAction() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     new Game().game();
                 } catch (InterruptedException ex) {
                     throw new RuntimeException(ex);
                 }
                 jFrame.dispose();
             }
         });

         jButton2.addActionListener(new AbstractAction() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.exit(0);
             }
         });

    }

}
