import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(135,90,80,25);
        button.addActionListener(new GUI());
        panel.add(button);

        success =new JLabel("");
        success.setBounds(125,120,300,25);
        panel.add(success);

        frame.setResizable(false);

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + "," + password);

        if(user.equals("Kunj") && password.equals("12345")){
            success.setText("Login Successful!!");
         }
        else if(user.equals("Meet") && password.equals("54321")){
            success.setText("Login Successful!!");
        }
        else
            success.setText("Login Unsuccessful  :( ");

    }

}
