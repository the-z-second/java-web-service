
package client;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	void link(String url,String payload)
	{
		EmailFunctionService s=new EmailFunctionService();
		EmailFunction s2=s.getEmailFunction();
		s2.sendEmail(url, payload);
	}
	
	void link2(String url,String payload)
	{
		EmailFunctionService s=new EmailFunctionService();
		EmailFunction s2=s.getEmailFunction();
		s2.sendEmailBatch(url, payload);
	}
	
	void link3(String url)
	{
		EmailFunctionService s=new EmailFunctionService();
		EmailFunction s2=s.getEmailFunction();
		s2.validateEmailAddress(url);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gui() {
		setTitle("\u90AE\u4EF6\u670D\u52A1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 345);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(148, 48, 249, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u6536\u4EF6\u5730\u5740\uFF1A");
		label.setBounds(53, 51, 85, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5185\u5BB9\uFF1A");
		label_1.setBounds(78, 97, 58, 15);
		contentPane.add(label_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(148, 79, 249, 116);
		contentPane.add(textArea);
		
		JButton button = new JButton("\u5355\u53D1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input_address=textField.getText();
				String input_content=textArea.getText();
				link(input_address,input_content);
				textField_1.setText("Y");
			}
		});
		button.setBounds(40, 261, 97, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u6279\u91CF\u53D1\u9001");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input_address=textField.getText();
				String input_content=textArea.getText();
				link2(input_address,input_content);
				textField_1.setText("Y");
			}
		});
		button_1.setBounds(180, 261, 97, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u9A8C\u8BC1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input_address=textField.getText();
				link3(input_address);
				textField_1.setText("Y");
			}
		});
		button_2.setBounds(308, 261, 97, 23);
		contentPane.add(button_2);
		
		JLabel label_2 = new JLabel("\u8F93\u51FA\uFF1A");
		label_2.setBounds(78, 222, 58, 15);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 216, 249, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		Choice c = new Choice();
		c.add("soap");
		c.add("rest");
		c.setBounds(80, 150, 60, 20);
		contentPane.add(c);

	}
}
