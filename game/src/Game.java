import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Game {
    private Random random=new Random();
    private static JFrame jFrame;
    JPanel panel=new JPanel();
    private static JButton jButton;
    private static int X=100;
    private  static int Y=100;
    private  static final int width=20;
    private  static final int height=20;
    static {
        jFrame=new JFrame();
        jFrame.setBounds(400,600,800,600);
    }

    public  void  location() throws InterruptedException {



        int n=random.nextInt(2);
        switch (n)
        {
            case 0:
                X+=width;
                break;
            case 1:
                Y+=width;
                break;
        }
        jButton.setBounds(X,Y,width,height);
        jFrame.add(jButton);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        //Thread.sleep(1000);

    }

    public  void game() throws InterruptedException {

            location();
            jFrame.remove(jButton);
            jFrame.revalidate();
            jFrame.repaint();
            Thread.sleep(1000);
            location();

           // System.arraycopy();
    }



}
