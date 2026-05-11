import javax.swing.*;
public class dusra {
    public static void main(String[] args) {
        //JFrame
        JFrame frame = new JFrame();
        frame.setTitle("My second page");

        // JLabel
        JLabel label  = new JLabel("Enter your name:");
        label.setBounds(50,50,100,30);
        frame.add(label);

        // JTextField
        JTextField textfield = new JTextField();
        textfield.getText();
        textfield.setBounds(200,100,150,30);
        frame.add(textfield);

        // JButton
        JButton button = new JButton("Submit");
        button.setBounds(200,200,100,30);
        frame.add(button);

        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
