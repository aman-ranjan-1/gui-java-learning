import java.awt.*;
import java.awt.event.*;
public class AWTgui{
    public static void main(String[] args) {
        // Frame - main window 
        Frame frame = new Frame("AWT Application");
        frame.setSize(400,400);

        // label,button
        //label
        Label label = new Label("Name: ");
        label.setBounds(50,50,80,25);// position x, y ,width,height ,  

        //Textfield
        TextField textField = new TextField();// INPUT AREA
        textField.setBounds(140, 50, 180, 25);

        //Buttons
        Button btn = new Button("Submit");
        btn.setBounds(140, 90, 100, 30);

        //checkbox
        Checkbox chk = new Checkbox("I agree to terms & conditions");
        chk.setBounds(50, 140, 200, 25);

        //radiobuttons
        CheckboxGroup chk_grp = new CheckboxGroup();
        Checkbox radio1 = new Checkbox("Option1 ",chk_grp,false);
        Checkbox radio2 = new Checkbox("Option2 ",chk_grp,false);
        radio1.setBounds(50, 180, 100, 25);
        radio2.setBounds(160, 180, 100, 25);

        Label listLabel = new Label("Select Device:");
        listLabel.setBounds(50, 210, 120, 25);

        //list
        List lst = new List();
        lst.setBounds(50, 240, 200, 80);
        lst.add("Laptop");
        lst.add("Mouse");
        lst.add("Smartphone");

        //adding all the elements to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(btn);
        frame.add(chk);
        frame.add(radio1);
        frame.add(radio2);
        frame.add(lst);
        frame.add(listLabel);

        //window listener - interface window events
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                //close the frame 
                frame.dispose();
            }
        });  //window Adapter
        frame.setVisible(true);
    }
}