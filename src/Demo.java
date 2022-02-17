import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo {
    public static void main(String[] args) {
        Frame wnd=new Frame("Да ну нах!");
        wnd.setSize(500,400);
        wnd.setLocation(500,400);
        wnd.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        wnd.setVisible(true);
    }
}
