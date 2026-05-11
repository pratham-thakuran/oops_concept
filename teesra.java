import java.awt.event.*;
import javax.swing.*;

public class teesra {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Teesra");
        JLabel movie = new JLabel("Enter Movie Name:");
        JTextField text1 = new JTextField();
        text1.getText();
        movie.setBounds(100,50,150,30);
        text1.setBounds(300,50,140,30);
        frame.add(movie);

        JLabel Director = new JLabel("Enter Director Name:");
        JTextField text2 = new JTextField();
        text2.getText();
        Director.setBounds(100,100,150,30);
        text2.setBounds(300,100,140,30);
        frame.add(Director);
        frame.add(text1);
        
        JLabel Rating = new JLabel("Rating:");
        JTextField text3 = new JTextField();
        text1.getText();
        Rating.setBounds(100,150,150,30);
        text3.setBounds(300,150,140,30);
        frame.add(Rating);
        frame.add(text2);

        JButton button = new JButton("Submit");
        button.setBounds(200,200,140,30);
        frame.add(button);
        frame.add(text3);


        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String moviename = text1.getText();
                String directorname = text2.getText();
                String rating = text3.getText();
                JOptionPane.showMessageDialog(frame,"Movie:"+moviename+"\nDirector:"+directorname+"\nRating:"+rating);
            }
        });

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
    }
}
