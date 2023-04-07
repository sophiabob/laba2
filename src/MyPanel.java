import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class MyPanel extends JPanel {
    public MyPanel() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
    public Dimension getPrefferedSize() {
        return new Dimension(1560,700);
    }

    private int x = 100;
    private int y = 100;
    private int width = 50;
    private int height = 100;
    private int step = 30;
    private int delta = 5;

    private ArrayList<Rectangle> outList = new ArrayList<Rectangle>();

    public void setSymbols(String parm) {
        String[] arr = parm.replace(",", "").split(" ");
        for (String cifra:arr) {
            switch(cifra) {
                case "1":
                    segment(2);
                    segment(4);
                    break;
                case "2":
                    segment(1);
                    segment(2);
                    segment(3);
                    segment(5);
                    segment(6);
                    break;
                case "3":
                    segment(1);
                    segment(2);
                    segment(3);
                    segment(4);
                    segment(5);
                    break;
            }
            x = x + step + width;
        }
    }

    private void segment(int number) {
        switch(number) {
            case 1:
                outList.add(new Rectangle(x + delta,y,x+width-delta,y));
                break;
            case 2:
                outList.add(new Rectangle(x+width,y+delta,x+width,y+(height/2)-delta));
                break;
            case 3:
                outList.add(new Rectangle(x + delta,y+height/2,x+width-delta,y+height/2));
                break;
            case 4:
                outList.add(new Rectangle(x+width,y+(height/2)+delta,x+width,y+height-delta));
                break;
            case 5:
                outList.add(new Rectangle(x + delta,y+height,x+width-delta,y+height));
                break;
            case 6:
                outList.add(new Rectangle(x,y+(height/2)+delta,x,y+height-delta));
                break;
            case 7:
                outList.add(new Rectangle(x,y+delta,x,y+(height/2)-delta));
                break;
        }
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Rectangle rect: outList) {
            g.drawLine(rect.x, rect.y, rect.width, rect.height);
        }
    }
}