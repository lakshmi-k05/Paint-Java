package Paint;
import java.awt.*;
import javax.swing.*;

public class PaintClient extends JPanel{

    public void paint (Graphics g)
    {
    	
    	ShapeColor c = new Red("red");
    	ShapeColor c2 = new Blue("blue");
    	Shape sq = new Rectangle(600,100,344, 800);
    	sq.setColor(c,c2);
    	sq.draw(g);
    }

    public static void main(String ad[])
    {

        JFrame jp1 = new JFrame();
        PaintClient a=new PaintClient ();
        jp1.getContentPane().add(a, BorderLayout.CENTER);
        jp1.setSize(new Dimension(1000,1000));
        jp1.setVisible(true);
        
        
    }
}