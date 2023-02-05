# Topic 5.4/5.5 Accessors/Mutators Assignment

SHOW ALL YOUR WORK. REMEMBER THAT PROGRAM SEGMENTS ARE TO BE WRITTEN IN JAVA.

Assume that the classes listed in the Java Quick Reference have been imported where appropriate.
Unless otherwise noted in the question, assume that parameters in method calls are not null and that methods are called only when their preconditions are satisfied.
In writing solutions for each question, you may use any of the accessible methods that are listed in classes defined in that question. Writing significant amounts of code that can be replaced by a call to one of these methods will not receive full credit.
 
The following class represents an invitation to an event. The variable hostName represents the name of the host of the event and the variable address represents the location of the event. (Shown below and created already in the Files for the project.)
```java
		public class Invitation {
			// instance variables
			private String hostName;
			private String address;

			// constructors

			// accessors / mutators

			// toString() method

		}
```

## Directions

### Update the Invitation class with the following:
1. Write the _constructors_ that are necessary to handle the following cases:
	- default (set host and address to 'Unknown')
	- host name only (set address to 'Unknown')
	- both host name and address are set
2. Write an _accessor/getter_ method for the Invitation class that returns the name of the **host**.
3. Write an _accessor/getter_ method for the Invitation class that returns the **address** of the host.	
4. Write a _mutator/setter_ method for the Invitation class that accepts a parameter and uses it to update the **host** for the event.
5. Write a _mutator/setter_ method for the Invitation class that accepts a parameter and uses it to update the **address** for the event.
6. Write a _toString()_ method that will return the **host** followed by ' is hosting at ' and the **address** (_ie: Karen is hosting at 123 Main St_).
	

### Update the Main.java file to test your code:
1. Create three object instances to test each constructors
2. Use the _accessor/getter_ to print out host name and address
3. Use the _mutator/setter_ to update host name and address
4. Print out each object calling the toString() implicitly:
	- System.out.println(obj);

### Turn in the Main.java and Invitation.java files to the Canvas Assignment


