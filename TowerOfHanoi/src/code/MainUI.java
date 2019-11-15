package code;

import javax.swing.JFrame;

public class MainUI extends JFrame  {


	private static final long serialVersionUID = 1L;

	public static void main(String[] args) 
	{
	 new MainUI();
	}

	public MainUI() 
	{
		Hanoi hanoi = new Hanoi(3);
		hanoi.setBounds(0, 0, 520, 350);
		add(hanoi);
		
		Hanoi hanoi2 = new Hanoi(5);		
		hanoi2.setBounds(0, 400, 520, 350);
		add(hanoi2);
		
		setLayout(null);
		setSize(850, 900);
		setTitle("Tower of Hanoi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
