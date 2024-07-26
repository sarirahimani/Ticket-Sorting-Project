package project2;
//Import required statements
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * This class is the GUI for Project 2/Ticket Sorting System
 * With this GUI the user can add and remove tickets to an 
 * ArrayHeap. The user can check if the ArrayHeap is empty, 
 * and the user can get the rank of a ticket at a certain index. 
 * @author Sahara Karima Mosin Rahimani
 *
 */
public class project2GUI extends JFrame implements ActionListener{
	/**
	 * Declaring all required variables, elements of the GUI and the ArrayHeap
	 * 
	 */
		private JTextArea output;
		private JLabel addLabel, rankLabel, removeLabel, emptyLabel, rankAtLabel, positionLabel;
		private JTextField rankInput, positionInput;
		private JPanel inPanel, outPanel, mainPanel;
		private JButton addButton, removeButton, emptyButton, rankButton;
		private ArrayHeap heap=new ArrayHeap(); 
		private int rank, position;
		
		public project2GUI() {
			

			/*
			 * Initializing panels and setting their layout
			 */
			inPanel = new JPanel();
			inPanel.setLayout(new GridLayout(20,1));
			
			outPanel = new JPanel();
			outPanel.setLayout(new FlowLayout());
			
			mainPanel = new JPanel();
			mainPanel.setLayout(new FlowLayout());
			
			
			/*
			 * Initializing labels
			 */
			addLabel = new JLabel("Add:");
			rankLabel= new JLabel("Rank:"); 
			removeLabel= new JLabel("Remove Root:");
			emptyLabel= new JLabel("Is ArrayHeap empty?");
			rankAtLabel = new JLabel("Rank at:");
			positionLabel= new JLabel("Position:"); 
		
			/*
			 * Initializing the text area for output and 
			 * Initializing all buttons
			 */
			output=new JTextArea(30,30);
		
			
			addButton=new JButton("Add!");
			addButton.addActionListener(this);
			
			removeButton =new JButton("Remove!");
			removeButton.addActionListener(this);
			
			emptyButton=new JButton("Check!");
			emptyButton.addActionListener(this);
			
			rankButton=new JButton("Rank!");
			rankButton.addActionListener(this);
		
			/*
			 * Initializing all Text Fields
			 */
			rankInput = new JTextField(15);
			rankInput.addActionListener(this);
		
			positionInput = new JTextField(15);
			positionInput.addActionListener(this);
		
			/*
			 * Adding all elements to panels
			 */
			inPanel.add(addLabel);
			inPanel.add(rankLabel);
			inPanel.add(rankInput);
			inPanel.add(addButton);
			inPanel.add(removeLabel);
			inPanel.add(removeButton);
			inPanel.add(emptyLabel);
			inPanel.add(emptyButton);
			inPanel.add(rankAtLabel);
			inPanel.add(positionLabel);
			inPanel.add(positionInput);
			inPanel.add(rankButton);
		
		
			outPanel.add(new JScrollPane(output));

			mainPanel.add(inPanel);
			mainPanel.add(outPanel);
			this.add(mainPanel);
		
		}
	 

		/**
		  * This is the event handler for all the buttons 
		  */
		public void actionPerformed(ActionEvent actEvent) {
		try {
			if(actEvent.getSource()==addButton) {
				 /**
				  * if addButton is clicked:
				  * Get the input/rank entered by the user and convert it to integer
				  * create a ticket object with the rank entered, then add the ticket to the heap
				  * add: ArrayHeap is composed of: (all elements in heap) in the String out
				  * show out in the text area
				  */
				 String  initialRank= rankInput.getText();
				 rank=Integer.parseInt(initialRank);	
				 ticket myTicket=new ticket(rank);
				 heap.add(myTicket);
				 String out="\n ArrayHeap is composed of:\n"+heap.toString()+"\n";
				 output.append(out);
				 
			 }else if(actEvent.getSource()==removeButton) {
				 /**
				  * if removeButton is clicked:
				  * Set String out equal to:
				  * Removing: (rank of root) 
				  * ArrayHeap is composed of:
				  * (tickets)
				  * Show out in text area
				  */
				 String out="\n Removing: "+heap.removeMax()+"\n"+"ArrayHeap is composed of:\n"+heap.toString()+"\n";
				 output.append(out);
			 }else if(actEvent.getSource()==emptyButton) {
				 /**
				  * If emptyButton is clicked:
				  * Set out equal to:
				  * Is the ArrayHeap empty? (true/false)
				  * Show out in text area  
				  */
				 String out="\n Is the ArrayHeap empty? "+ heap.isEmpty()+"\n";
				 output.append(out);
			 }else if(actEvent.getSource()==rankButton) {
				 /**
				  * Get the input entered by the user and convert the input into an integer
				  * then set out equal to:
				  * Rank at (index or position) is: (rank at the position)
				  * Show out in text area
				  */
				 String  initialPosition= positionInput.getText();
				 position=Integer.parseInt(initialPosition);	
				 String out="\n Rank at "+position+" is: "+ heap.rankAt(position)+"\n";
				 output.append(out);
			 }
			 
			 
		}catch(Exception e) {
			//Error message that will appear if there's an exception
			JOptionPane.showMessageDialog(null, "Invalid Function!");
		}	
				 
	}
			 
			 
				


	 public static void main(String[] args) {

		 	//Create the gui object
			project2GUI gui = new project2GUI();
			
			//Make the GUI visible
			gui.setVisible(true); 
			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
			//Set size and title
			gui.setSize(600,600);  
			gui.setTitle("Ticket Sorter System GUI"); 
			//Do not allow the GUI to be resized
			gui.setResizable(false);
		}

	}


