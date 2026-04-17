import java.util.*;
import javax.swing.*;
import java.awt.*;

public class SwingMenu {
    public static void main(String[] args){
        JFrame frame = new JFrame("Swing Menu Toolbar");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);

        //menu-> menubar, menuitems -file -> sub menu-> clickable item
        JMenuBar menubar = new JMenuBar();

        //menu -> file
        JMenu filemenu = new JMenu("File");

        //menu -> items
        JMenuItem newitem = new JMenuItem("New");
        JMenuItem openitem = new JMenuItem("Open");
        JMenuItem saveitem = new JMenuItem("Save");
        JMenuItem exititem = new JMenuItem("Exit");
        
        //add -> fileitem
        filemenu.add(newitem);
        filemenu.add(openitem);
        filemenu.add(saveitem);
        filemenu.addSeparator();
        filemenu.add(exititem);

        // create edit menu
        JMenu editmenu = new JMenu("Edit");
        JMenuItem cutitem = new JMenuItem("Cut");
        JMenuItem copyitem = new JMenuItem("Copy");
        JMenuItem pasteitem = new JMenuItem("Paste");

        JMenu submenu = new JMenu("SubMenu");
        JCheckBoxMenuItem checkitem = new JCheckBoxMenuItem("Checkable Item");

        submenu.add(checkitem);
        editmenu.add(cutitem);
        editmenu.add(copyitem);
        editmenu.add(pasteitem);
        editmenu.addSeparator();
        editmenu.add(submenu);

        //add to menubar
        menubar.add(filemenu);
        menubar.add(editmenu);

        frame.setJMenuBar(menubar);
        frame.setVisible(true);
    }
}
