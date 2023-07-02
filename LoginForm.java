package LoginForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static boolean Check(String username, String password, String captcha){
        if (username.equals("yaggeshsawant2003") && password.equals("Yaggesh@123") && captcha.equals("C56Yt")){
            return true;

        }
        return false;
    }
    public static void addComponentsToPanel(JPanel panel){
        JLabel userlabel=new JLabel("Username");
        JTextField usertext=new JTextField();
        JLabel password=new JLabel("password");
        JTextField userpassword=new JTextField();
        JLabel Captcha=new JLabel("enter captcha shown below");
        JTextField userCaptcha=new JTextField();
        JLabel enterCaptcha=new JLabel("C56Yt");
        enterCaptcha.createImage(20,10);
        JLabel blank=new JLabel();




        //add buttons in login form
        JButton cancelButton=new JButton("Cancel");
        JButton LoginButton=new JButton("Login");

        //add components to panel
        panel.add(userlabel);
        panel.add(usertext);
        panel.add(password);
        panel.add(userpassword);
        panel.add(Captcha);
        panel.add(userCaptcha);
        panel.add(enterCaptcha);
        panel.add(blank);
        panel.add(cancelButton);
        panel.add(LoginButton);

        //adding action to buttons
        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Check(usertext.getText() , userpassword.getText(), userCaptcha.getText())) {
                    JOptionPane.showMessageDialog(panel, "hello" + usertext.getText()+"! welcome to java swing!",
                            "Login message", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(panel, "Invalid usernane or password",
                            "Login message", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
     public static void main(String[] args){
         JFrame frame=new JFrame("Login Form");

         JPanel panel=new JPanel(new GridLayout(5,2,15,15));

         //calling method
         addComponentsToPanel(panel);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setLocationRelativeTo(null);
         frame.setSize(400,200);
         frame.getContentPane().add(panel);
         frame.setVisible(true);
    }
}
