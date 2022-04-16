import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class myapp {
    public static void main(String[] args){
        ImageIcon iconimage = new ImageIcon("images/logoicon.png");// making a object of ImageIcon class and passing the address of image which in images folder 
        ImageIcon fullimage = new ImageIcon("images/rlogo.png");
        JLabel logo = new JLabel();
        logo.setText("its logo");
        logo.setIcon(fullimage);
        JLabel label = new JLabel();
        label.setIcon(fullimage);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        JFrame myframe = new JFrame();
        myframe.setVisible(true);//make it visible
        myframe.setSize(1000,800);//set size by dimension X and Y
        myframe.setTitle("Ripudaman college Admission form"); // title 
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // by default it is HIDE_ON_CLOSE so we have to set it to close 
        myframe.setResizable(true);// by set it to false we are not able to resize 
        myframe.setIconImage(iconimage.getImage()); //set icon using ImageIcon object and call a function getimage which will get image from path whic we describe when we create image object
        myframe.add(logo);
        myframe.add(label);


    }
    
}
