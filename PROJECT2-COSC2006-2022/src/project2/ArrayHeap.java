package project2;
/**
 * Import required statements
 */
import java.util.*;
/**
 * This class is a Heap that is implemented 
 * using an ArrayList. This class has one field
 * arrayheap: which is an ArrayList that stores tickets. 
 * A heap is a type of complete binary tree and it fulfills
 * the following properties: 
 * Every level but the lowest has all possible nodes. 
 * The entry in a node is greater than the entries of its children.
 * If the lowest level isn't full, all nodes are as far left as possible.
 * In this case the root of the ArrayHeap is always the ticket with the highest
 * rank. 
 * @author Sahara Karima Mosin Rahimani
 *
 */
public class ArrayHeap{
	
	ArrayList<ticket> arrayheap;
	/**
	 * This is an unargumented constructor that inializes the ArrayList.
	 */
	public ArrayHeap() {
	//Initialize the ArrayList arrayheap
	 arrayheap=new ArrayList<>();
	}
	/**
	* This method pushes a ticket upward to reestablish the heap property
	*/	
	public void heapifyUp() {
		//position that will be heapified upwards
		 int position=arrayheap.size()-1;
		 //while position is not equal to 0
		 while(position!=0) {
			 //the parent of position is position-1/2
			 int par=(position-1)/2;
			 //check if the rank at parent is less or equal to the rank at position
			 if(rankAt(par)<=rankAt(position)) {
				 //swap by doing the following:
				 //if it is store the ticket in the parent index in a temporal ticket
				 ticket temporal=arrayheap.get(par);
				 //set the ticket in the index position in the parent index
				 arrayheap.set(par, arrayheap.get(position));
				 //set the temporal ticket in the position index
				 arrayheap.set(position, temporal);
				 //make position equal to the parent index
				 position=par;
			//if rank at parent is greater than the rank at position	 
			 }else {
				 //break
				 break;
			 }
			 
		 }
	 }

	/**
	 * This method pushes a ticket downward to reestablish the heap property
	 */
	 public void heapifyDown() {
		 //position that will be heapified downward
		 int position=0;
		 //size of ArrayList
		 int size=arrayheap.size();
		 //repeat while 2*position+1 is less than size
		 while(2*position+1<size) {
			 //the position of the left child
			 int leftChild = 2*position+1;
			 //position of the right child
			 int rightChild = leftChild + 1;
			 //set the position of the max child/the child with the highest rank equal to the position of the left child
			 int maxChild = leftChild; 
			 //check if there is a right child if there is
			 if (rightChild < size) {
				 // Check if the rank of the right child is greater than the rank of the left child 
				if(rankAt(rightChild) > rankAt(leftChild)) {
					//if it is then change the maxChild to the position of the right child
					maxChild = rightChild;
				 }
			 }
			//check if the rank at position is less of equal to the rank at maxChild
			 if (rankAt(position) <= rankAt(maxChild)) {
				 //if it is then create a temporal ticket and make it equal to the ticket at position
				 ticket temporal = arrayheap.get(position);
				 //set the ticket at maxChild in the index position
				 arrayheap.set(position, arrayheap.get(maxChild));
				 //set temporal at the maxChild index
				 arrayheap.set(maxChild, temporal);
			 }else {//if not then:
			  //Break
				 break;
			 }
			 // set index position equal to maxChild
			 position = maxChild;
			  }
		 }
	 
	 /**
	  * This method adds tickets in the next available position in
	  * the arrayheap and heapifies upward as needed to restore the heap property.
	  * @param tix is the ticket that will be added to the arrayheap
	  * @return true after the ticket is added to the arrayheap
	  */
	 public boolean add(ticket tix) {
		 //add the ticket x to the ArrayList
		  arrayheap.add(tix);
		  //Heapify up
		  heapifyUp();
		  //return true after adding and heapifying up as needed
		  return true;
	 }
	 /**
	  * Removes the root(ticket with highest ranking) from the ArrayHeap
	  * and replace it with the last leaf or ticket. The new root is then 
	  * heapified downward if needed. 
	  * @return the rank of the previous root that was removed 
	  */
	 public int removeMax() {
		 //check if the ArrayList is empty 
		 if (isEmpty()) {
			 //string with message that will be shown if arrayheap is empty
			 String msg = "ArrayHeap is empty.";
			 //exception that will be thrown if empty
			 throw new RuntimeException(msg);
		 }else{//if it is not empty
			  //get the rank of the root and store in rank
			  int rank = arrayheap.get(0).rank;
			  //Store the position of the last leaf in lastLeaf
			  int lastLeaf = arrayheap.size()-1;
			  //Replace the root by last the leaf
			  arrayheap.set(0, arrayheap.get(lastLeaf));
			 
			  // Remove the last leaf
			  arrayheap.remove(arrayheap.size()-1);
			  //heapify down as needed
			  heapifyDown();
			  //return the rank of the previous root that was removed
			  return rank;
		}
	 }
	 /**
	  * This method checks if the ArrayList is empty, 
	  * it does this by checking if the size of the 
	  * ArrayList is 0. 
	  * @return it returns a boolean if it is empty 
	  * it returns true, if it is not empty it returns false.
	  */
	public boolean isEmpty() {
		//checks if the size is equal to 0
		return arrayheap.size() == 0;
	}
	/**
	 * This method gets the rank in a specific 
	 * position or index of the ArrayList
	 * @param index is the position in which the rank is 
	 * @return rank of the ticket in the position that was entered
	 */
	public int rankAt(int index) {
		//arrayheap.get(index) gets the ticket in that position and .rank gets the rank of the ticket in that position
		return arrayheap.get(index).rank;
	}
	/**
	 * This is a simple toString for easy printing
	 * @return a string with all the information of each ticket in arrayheap
	 * if the arrayheap is empty it shows a message that states "Empty ArrayHeap!"
	 */
	public String toString() {
		//create a StringBuilder
		StringBuilder out= new StringBuilder();
		//if empty it will append Empty ArrayHeap
		if(isEmpty()) {
			out.append("Empty ArrayHeap!"+"\n");
		}else {//if not empty
			//for loop that will loop from 0 up to size()-1 of the arraylist to get all tickets in arrayheap
			for(int i=0;i<arrayheap.size(); i++) {
				//append all tickets in each position, alongside with it's position in the ArrayList
				out.append(arrayheap.get(i)+"-"+i+"\n");
			}
		}
		//convert out into a string and return
		return out.toString();
	
	}
}
