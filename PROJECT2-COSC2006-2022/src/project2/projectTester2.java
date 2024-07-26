package project2;

 /**
  * This tester demonstrates the use of the
  * ArrayHeap and ticket class. Here I will add tickets 
  * to an ArrayHeap and the ArrayHeap will sort it so that 
  * the one with the highest priority is always the root. 
  * This is a tester for the ticket sorter system. The tickets
  * in this sorting system system are sorted according to their rank.
  * @author Sahara Karima Mosin Rahimani
 */

public class projectTester2
 {
	 public static void main(String [] args)
	 {
		 	try {
		 		//Testing the methods of the ticket class
		 		//Create a ticket object using its unargumented constructor and try the toString
		 		
		 		ticket ticket1=new ticket();
		 		//Should print a general admission ticket with a random rank 
		 		//For example: First Ticket: ticket [rank= 30, type= General Admission]
		 		
		 		System.out.println("First Ticket: "+ticket1);
		 		
		 		//create a new ticket using the argumented constructor and try the toString
		 		//Should print a general admission ticket with rank 22
		 		//Prints: Second Ticket: ticket [rank= 22, type= General Admission]
		 		
		 		ticket ticket2=new ticket(22);
		 		System.out.println("Second Ticket: "+ticket2);
		 		
		 		//Try getter and setter of rank 
		 		//For example, This prints: Rank of first ticket before changing it: 30
		 		
		 		System.out.println("Rank of first ticket before changing it: "+ticket1.getRank());
		 		
		 		//change/set rank to 60
		 		ticket1.setRank(60);
		 		
		 		//This prints: Rank of first ticket after changing it: 60
		 		System.out.println("Rank of first ticket after changing it: "+ticket1.getRank());
		 		
		 		//Test getter of type
		 		//This prints: Type of ticket 2: General Admission
		 		System.out.println("Type of ticket 2: "+ticket2.getType());
		 		
		 		System.out.println("------------------------------------------------");//Used to separate output
		 		
		 		//Testing the ticket sorting system. 
		 		//Create multiple tickets and create an ArrayHeap
		 		ticket ticket3=new ticket(43);
		 		ticket ticket4=new ticket(32);
		 		ticket ticket5=new ticket(75);
		 		ticket ticket6=new ticket(56);
		 		ticket ticket7=new ticket(3);
		 		ticket ticket8=new ticket(17);
		 		ticket ticket9=new ticket(54);
		 		ticket ticket10=new ticket(45);
		 		ticket ticket11=new ticket(20);
		 		ticket ticket12=new ticket(55);
		 		ticket ticket13=new ticket(43);
		 		ticket ticket14=new ticket(7);
		 		ticket ticket15=new ticket(2);
		 		
		 		
		 		ArrayHeap heap=new ArrayHeap();
		 		
		 		//check if ArrayHeap is empty
		 		//This prints: Is the heap empty? true
		 		System.out.println("Is the heap empty? "+ heap.isEmpty());
		 		
		 		//add all tickets to the heap 
		 		
		 		heap.add(ticket1);
		 		heap.add(ticket2);
		 		heap.add(ticket3);
		 		heap.add(ticket4);
		 		heap.add(ticket5);
		 		heap.add(ticket6);
		 		heap.add(ticket7);
		 		heap.add(ticket8);
		 		heap.add(ticket9);
		 		heap.add(ticket10);
		 		heap.add(ticket11);
		 		heap.add(ticket12);
		 		heap.add(ticket13);
		 		heap.add(ticket14);
		 		heap.add(ticket15);
		 		
		 		//test the toString of ArrayHeap and print heap
		 		
		 		/*
		 		  	For example, This prints:
		 		 	ticket [rank= 75, type= General Admission]-0
					ticket [rank= 60, type= General Admission]-1
					ticket [rank= 56, type= General Admission]-2
					ticket [rank= 54, type= General Admission]-3
					ticket [rank= 45, type= General Admission]-4
					ticket [rank= 55, type= General Admission]-5
					ticket [rank= 7, type= General Admission]-6
					ticket [rank= 17, type= General Admission]-7
					ticket [rank= 22, type= General Admission]-8
					ticket [rank= 32, type= General Admission]-9
					ticket [rank= 20, type= General Admission]-10
					ticket [rank= 43, type= General Admission]-11
					ticket [rank= 43, type= General Admission]-12
					ticket [rank= 3, type= General Admission]-13
					ticket [rank= 2, type= General Admission]-14
		 		 */
		 		System.out.println(heap);
		 		
		 		//This prints: Is the heap empty? false
		 		System.out.println("Is the heap empty? "+ heap.isEmpty());
		 		System.out.println("------------------------------------------------");//Used to separate output
		 		//Test getting the rank at any position
		 		/*
		 		 	For example, These statements print:
		 		 	Rank at index 5: 55
					Rank at index 10: 20
					Rank at index 7: 17
					Rank at index 14: 2
					Rank at index 0: 75
		 		 */
		 		System.out.println("Rank at index 5: "+heap.rankAt(5));
		 		System.out.println("Rank at index 10: "+heap.rankAt(10));
		 		System.out.println("Rank at index 7: "+heap.rankAt(7));
		 		System.out.println("Rank at index 14: "+heap.rankAt(14));
		 		System.out.println("Rank at index 0: "+heap.rankAt(0));
		 		System.out.println("------------------------------------------------");//Used to separate output
		 		
		 		
		 		//Test to remove the root, the root is currently 75
		 		/*
		 		  	For example, These statements print: 
		 		  	Remove root 75: 75
					Heap after removing 75: ticket [rank= 60, type= General Admission]-0
					ticket [rank= 54, type= General Admission]-1
					ticket [rank= 56, type= General Admission]-2
					ticket [rank= 22, type= General Admission]-3
					ticket [rank= 45, type= General Admission]-4
					ticket [rank= 55, type= General Admission]-5
					ticket [rank= 7, type= General Admission]-6
					ticket [rank= 17, type= General Admission]-7
					ticket [rank= 2, type= General Admission]-8
					ticket [rank= 32, type= General Admission]-9
					ticket [rank= 20, type= General Admission]-10
					ticket [rank= 43, type= General Admission]-11
					ticket [rank= 43, type= General Admission]-12
					ticket [rank= 3, type= General Admission]-13
		 		 */
		 		System.out.println("Remove root 75: "+heap.removeMax());
		 		System.out.println("Heap after removing 75: "+heap);
		 		
		 		System.out.println("------------------------------------------------");//Used to separate output
		 		/*
		 		 	For example, These Statements print: 
		 		 	Remove root 60: 60
					Heap after removing 60: ticket [rank= 56, type= General Admission]-0
					ticket [rank= 54, type= General Admission]-1
					ticket [rank= 55, type= General Admission]-2
					ticket [rank= 22, type= General Admission]-3
					ticket [rank= 45, type= General Admission]-4
					ticket [rank= 43, type= General Admission]-5
					ticket [rank= 7, type= General Admission]-6
					ticket [rank= 17, type= General Admission]-7
					ticket [rank= 2, type= General Admission]-8
					ticket [rank= 32, type= General Admission]-9
					ticket [rank= 20, type= General Admission]-10
					ticket [rank= 3, type= General Admission]-11
					ticket [rank= 43, type= General Admission]-12
		 		 */
		 		
		 		System.out.println("Remove root 60: "+heap.removeMax());
		 		System.out.println("Heap after removing 60: "+heap);
		 		
		 		
		 		
		 	}catch(Exception e) {
		 		//catches all exceptions and prints Invalid Operation!
		 		System.out.println("Invalid Operation!");
		 	}
	 }
 }