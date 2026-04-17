import java.io.File;
import java.awt.FlowLayout;  

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SwingDialogs{
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Dialog Application");
            frame.setSize(400,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton filechooser = new JButton("Show file chooser Dialog");
            filechooser.addActionListener(e -> showFileChooser(frame));

            JPanel panel = new JPanel(new FlowLayout());
            panel.add(filechooser);

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
}