import java.awt.*;
import java.awt.event.*;
public class AWTlayoutExp {
    public static void main(String[] args) {
        //frame
        Frame frame = new Frame("AWT Layout Manager App");
        frame.setSize(500, 400);
        frame.setVisible(true);

        // //flowLayout 
        // FlowLayout flowobj = new FlowLayout();
        // //create panel -> simplest container

        // Panel flowPanel = new Panel(flowobj);
        // frame.add(flowPanel);
        // //add compnonents
        // flowPanel.add(new Button("Button 1"));
        // flowPanel.add(new Button("Button 2"));
        // flowPanel.add(new Button("Button 3"));
        // flowPanel.add(new Button("Button 4"));
        // flowPanel.add(new Button("Button 5"));

        // Border Layout 
        // BorderLayout borderobj = new BorderLayout();
        // frame.setLayout(borderobj);
        
        // Button btn6 = new Button ("Button 6");
        // Button btn7 = new Button ("Button 7");
        // Button btn8 = new Button ("Button 8");
        // frame.add(btn6,BorderLayout.NORTH);
        // frame.add(btn7,BorderLayout.CENTER);
        // frame.add(btn8,BorderLayout.WEST);

        // Grid Layout
        GridLayout gridobj = new GridLayout(2,2);
        Panel gridpanel = new Panel(gridobj);
        frame.add(gridpanel);

        gridpanel.add(new Button("Button 1"));
        gridpanel.add(new Button("Button 2"));
        gridpanel.add(new Button("Button 3"));
        gridpanel.add(new Button("Button 4"));

        
        //window listener - interface window events
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                //close the frame 
                System.exit(0);
            }
        });  //window Adapter
    }
}
