import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class SwingAdvCon{
    public static void main(String[] args) {
        // real time - Task Manager -> tasks,priority,time

        JFrame frame = new JFrame("Task Manager");

        //task table 
        String[] colnames = {"Task","Category","Priority","Completion"};
        Object[][] data ={{"Task1","Work","High",30},{"Task2","Personal","Medium",60},{"Task3","Work","Low",70}};

        // JTable
        JTable tasktable = new JTable(new DefaultTableModel(data,colnames));

        // JScrollPane
        JScrollPane taskscroll = new JScrollPane(tasktable);

        //JTree -> root -> Branches 
        //root
        DefaultMutableTreeNode  root = new DefaultMutableTreeNode("Categories");
        DefaultMutableTreeNode  worknode = new DefaultMutableTreeNode("Work");
        DefaultMutableTreeNode  personalnode = new DefaultMutableTreeNode("Personal");
        root.add(worknode);
        root.add(personalnode);

        JTree tasktree = new JTree(root);
        JScrollPane treescrollpane = new JScrollPane(tasktree);

        String[] prioritylevel = {"High","Medium","Low"};
        JList<String> prioritylist = new JList<>(prioritylevel);
        JScrollPane listscrollpane = new JScrollPane(prioritylist);

        //JTabedpane
        JTabbedPane tabpane = new JTabbedPane();
        tabpane.addTab("AllTasks",taskscroll);
        tabpane.addTab("Categories",treescrollpane);
        tabpane.addTab("Priority List",listscrollpane);
        
        //JProgress Part
        JProgressBar progress = new JProgressBar();
        progress.setStringPainted(true);

        //JSlider
        JSlider slider = new JSlider(JSlider.HORIZONTAL);
        slider.setMajorTickSpacing(25);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        //Spinner
        SpinnerModel spinner = new SpinnerNumberModel(3,1,10,1);
        JSpinner taskspinner = new JSpinner(spinner);

        //layout
        frame.setLayout(new BorderLayout());

        frame.add(tabpane,BorderLayout.CENTER);
        frame.add(createprioritypanel(slider),BorderLayout.SOUTH);
        frame.add(createprogressbar(progress),BorderLayout.NORTH);
        frame.add(createspinnerpanel(taskspinner),BorderLayout.EAST);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);

    }
    private static JPanel createprioritypanel(JSlider slider){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Task Priority"));
        panel.add(slider);
        return panel;
    }
    private static JPanel createprogressbar(JProgressBar progress){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Task Completion : "));
        panel.add(progress);
        return panel;
    }
    private static JPanel createspinnerpanel(JSpinner spinner){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Number of Tasks : "));
        panel.add(spinner);
        return panel;
    }
}