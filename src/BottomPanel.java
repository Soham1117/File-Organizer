import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BottomPanel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton organise;
	JLabel indicator;
	
	public BottomPanel()
	{
	
	
	setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
	setLayout(new BorderLayout());
	organise = new JButton("Organise");
	add(organise,BorderLayout.LINE_END);
	indicator = new JLabel();
	
	
	
	//add(nooffiles);
	
	
	}

	
}
