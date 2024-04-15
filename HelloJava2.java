import java.awt.*;
import javax.swing.*;

public class HelloJava2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java!");
        class HelloComponent extends JComponent {
            public void paintComponent( Graphics g ) {
                g.drawString( "Hello, Java2!", 125, 95 );
            }
        }
        frame.add( new HelloComponent() );
        frame.setSize( 300,300);
        frame.setVisible( true );
    }
}

