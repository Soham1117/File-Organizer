import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class TopPanel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel address;
	JTextField addresstf;
	public TopPanel()
	{
		Border innerBorder = BorderFactory.createTitledBorder("File Details");
		Border outerBorder = BorderFactory.createEmptyBorder(15,15,15,15);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		address = new JLabel("Enter Directory Address : ");
		address.setHorizontalAlignment(JLabel.CENTER);
		address.setFont(new Font("Serif", Font.PLAIN, 20));
			
		addresstf = new JTextField(48);
		addresstf.setHorizontalAlignment(JTextField.CENTER);
		
					
		setLayout(new BorderLayout());
		
		add(address,BorderLayout.NORTH);
		add(addresstf,BorderLayout.LINE_END);
	}
}
