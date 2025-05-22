package github1;

	import javax.swing.*; 
	import java.awt.*; 
	 
	public class pg5d { 
	 
	    JFrame frame; 
	 
	   pg5d() { 
	        frame = new JFrame("Color Tabbed Pane Example"); 
	 
	        // Create Panels for each color 
	        JPanel cyanPanel = new JPanel(); 
	        cyanPanel.setBackground(Color.CYAN); 
	 
	        JPanel magentaPanel = new JPanel(); 
	        magentaPanel.setBackground(Color.MAGENTA); 
	 
	        JPanel yellowPanel = new JPanel(); 
	        yellowPanel.setBackground(Color.YELLOW); 
	 
	        // Create Tabbed Pane 
	        JTabbedPane tabbedPane = new JTabbedPane(); 
	        tabbedPane.add("Cyan", cyanPanel); 
	        tabbedPane.add("Magenta", magentaPanel); 
	        tabbedPane.add("Yellow", yellowPanel); 
	 
	        // Add tabbed pane to frame 
	        frame.add(tabbedPane); 
	 
	// Final frame setup 
	frame.setSize(400, 400); 
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	frame.setVisible(true); 
	} 
	public static void main(String[] args) { 
	new pg5d(); 
	} 
	
}
