package dsml.diagram.m2t;


import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

public class TransformationView extends ViewPart {
	public static final String ID = "dsml.diagram.m2t.TransformationView";

	public RSyntaxTextArea textArea;

	public TransformationView() {
		super();
	}

	public void setFocus() {
		
	}

	public void createPartControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.EMBEDDED | SWT.NO_BACKGROUND);
		Frame frame = SWT_AWT.new_Frame(composite);
		JPanel cp = new JPanel(new BorderLayout());

		textArea = new RSyntaxTextArea(20, 60);
		textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_XML);
		textArea.setCodeFoldingEnabled(true);
		textArea.setAntiAliasingEnabled(true);
		RTextScrollPane sp = new RTextScrollPane(textArea);
		sp.setFoldIndicatorEnabled(true);
		cp.add(sp);

		JToolBar toolBar = new JToolBar();
		ClassLoader cldr = this.getClass().getClassLoader();
		java.net.URL imageURL   = cldr.getResource("icons/save.gif");
		ImageIcon aceOfDiamonds = new ImageIcon(imageURL);
		
		JButton saveButton = new JButton("Save", aceOfDiamonds );
		
		saveButton.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
            	            	
            	String content = textArea.getText();
            	try {
	    			File file = new File("c:\\newfile.txt");
	
	    			// if file doesnt exists, then create it
	    			if (!file.exists()) {
	    				file.createNewFile();
	    			}
	
	    			FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    			BufferedWriter bw = new BufferedWriter(fw);
	    			bw.write(content);
	    			bw.close();
	            	} catch (IOException e1) {
	          	      e1.printStackTrace();
          	    }
            	
  
            }
        }); 
		
		toolBar.add(saveButton, BorderLayout.WEST);
		cp.add(toolBar, BorderLayout.NORTH);
		
	
		frame.add(cp);
		
		frame.pack();
        frame.setLocationRelativeTo(null);
	}

	public void setInput(String parameter){
		textArea.setText(parameter);
	}

}