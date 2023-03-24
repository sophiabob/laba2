import javax.swing.*;

public class main2 {
    public static void main(String[] args) {
        System.out.println("Hello!");

        JFrame f = new JFrame("Swing Paint demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel my_panel = new MyPanel();
    //    my_panel.repaint();
        my_panel.setSymbols("1, 2, 3");
        f.add(my_panel);
        f.pack();
        f.setVisible(true);
    }
}
