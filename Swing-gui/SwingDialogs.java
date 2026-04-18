import java.io.File;
import javax.swing.*;
import java.awt.*;

public class SwingDialogs{
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Dialog Application");
            frame.setSize(400,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton filechooser = new JButton("Show file chooser Dialog");
            filechooser.addActionListener(e -> showFileChooser(frame));

            JButton colorchooser = new JButton("Show Color chooser Dialog");
            colorchooser.addActionListener ( e -> showColorChooser(frame));

            JButton dialogbtn = new JButton("Show Dialog");
            dialogbtn.addActionListener ( e -> showDialog(frame));

            JPanel panel = new JPanel(new FlowLayout());
            panel.add(filechooser);
            panel.add(colorchooser);
            panel.add(dialogbtn);

            frame.add(panel);
            frame.setVisible(true);
        });
    }

    private static void showFileChooser(JFrame frame ){
        JFileChooser file = new JFileChooser();
        int result = file.showOpenDialog(frame);

        if(result == JFileChooser.APPROVE_OPTION){
            File selectedfile = file.getSelectedFile();
            JOptionPane.showMessageDialog(frame,
                "Selected File : " + selectedfile.getAbsolutePath(),
                "File",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(frame,
                "File Selection Cancelled",
                "File",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private static void showColorChooser(JFrame frame){
        Color selectedcolor = JColorChooser.showDialog(frame,"choose a color",Color.RED);
        if(selectedcolor != null){
            JOptionPane.showMessageDialog(frame,
                "Selected Color : " + selectedcolor,
                "Color Chooser",
                JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(frame,
                "Color Not Selected / Color Selection Cancelled",
                "Color Chooser",
                JOptionPane.WARNING_MESSAGE);
        }
    }
    private static void showDialog(JFrame frame){
        JDialog customdialog = new JDialog(frame,"Custom Dialog",true);
        customdialog.setSize(300,200);
        customdialog.setLayout(new BorderLayout());
        JLabel  label = new JLabel("This is a Custom Dialog",JLabel.CENTER);
        JButton closebtn = new JButton ("Close");
        closebtn.addActionListener(e-> customdialog.dispose());
        
        customdialog.add(label,BorderLayout.CENTER);
        customdialog.add(closebtn,BorderLayout.EAST);
        customdialog.setLocationRelativeTo(frame);
        customdialog.setVisible(true);
    }
}