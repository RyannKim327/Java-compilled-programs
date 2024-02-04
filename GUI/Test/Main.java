package Test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class Main extends JFrame{
	private JLabel title;
	private JTextField message;
	private JButton send;

	public Main(){
		super("This is my app");
		setSize(300, 300);
		setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		title = new JLabel("Please enter your name");
		message = new JTextField(20);
		send = new JButton("Send");

		message.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				send();
			}
		});

		send.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				send();
			}
		});

		panel.add(title);
		panel.add(message);
		panel.add(send);

		add(panel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	void send(){
		String text = message.getText();
		message.setText("");
		JOptionPane.showMessageDialog(null, String.format("Hello %s", text));
	}
	public static void main(String[] args){
		Main a = new Main();
		a.setVisible(true);
	}
}
