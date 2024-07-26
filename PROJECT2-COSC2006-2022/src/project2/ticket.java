package project2;
/**
 * This is a ticket class/object
 * The movie class has two fields
 * type: is the type of ticket in this case all
 * tickets will be general admission tickets,
 * this field is a string.
 * rank: this is the rank or level of priority of this
 * ticket. This filed is an int the level of priority 
 * can be from 1 to 100. 100 being the highest level 
 * of priority and 1 being the lowest level of priority.
 * @author Sahara Karima Mosin Rahimani
 */
	public class ticket {
		
		 int rank;
		 String type;
		 
		
		 /**
		  * This is an argumented constructor.
		  * The constructor sets rank equal to the 
		  * argument and type is set as General Admission 
		  * @param rank is the rank or level of priority 
		  * of the ticket. 
		  */
		 
		public ticket(int rank) {
		
			this.rank = rank;
			this.type = "General Admission";
		} 
		/**
		 * This is an unargumented constructor
		 * it calls the argumented constructor
		 * and sets rank equal to a random number 
		 * from 10 to 100. And sets the type as 
		 * General Admission. 
		 */
		public ticket() {
			this(10 +  (int)(Math.random()*(91)));
		}
		
		/**
		 * This is a getter for the rank 
		 * @return the rank or priority level of the ticket
		 */
		public int getRank() {
			return rank;
		}
		
		/**
		 * This is a setter for the rank
		 * @param rank the rank to set, the priority level of the
		 * ticket.
		 */
		public void setRank(int rank) {
			this.rank = rank;
		}
		
		/**
		 * This is a getter for the name
		 * @return the name of the type of ticket
		 * the ticket is general admission
		 */
		public String getType() {
			return type;
		}
		
		/**
		 * This is a toString for simple printing of the information of the ticket
		 * it returns a string that shows the type and ranks of the ticket. 
		 * For example: ticket [rank= 10, type= type= General Admission];
		 */
		public String toString() {
			return "ticket [rank= " + rank + ", type= " + type + "]";
		} 
		
		
		 
	}
