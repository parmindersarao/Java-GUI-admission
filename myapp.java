import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;

public class myapp {
    private static JFrame myframe;
    private static JPanel panel;
    public static void main(String[] args){
        ImageIcon iconimage = new ImageIcon("images/logoicon.png");// making a object of ImageIcon class and passing the address of image which in images folder 
        ImageIcon fullimage = new ImageIcon("images/rlogo.png");
        JLabel logo = new JLabel();
        logo.setIcon(fullimage);
        logo.setHorizontalAlignment(JLabel.CENTER);
        logo.setVerticalAlignment(JLabel.TOP);
        JLabel name = new JLabel("Name");
        name.setBounds(10,30,50,30);

        myframe = new JFrame();
        myframe.setVisible(true);//make it visible
        myframe.setSize(1000,800);//set size by dimension X and Y
        myframe.setTitle("Ripudaman college Admission form"); // title 
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // by default it is HIDE_ON_CLOSE so we have to set it to close 
        myframe.setResizable(true);// by set it to false we are not able to resize 
        myframe.setIconImage(iconimage.getImage()); //set icon using ImageIcon object and call a function getimage which will get image from path whic we describe when we create image object
        myframe.getContentPane().setBackground(Color.WHITE);
        myframe.add(logo);
        myframe.add(name, logo);
        panel = new JPanel();
        panel.setBounds(20,80,900,700);
        panel.setBackground(Color.gray);
        panel.add(name);


    }
    
}
