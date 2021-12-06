# Data-Structures-Algorithms-Java
Introduction 
This report will help you understand how to create abstract data structures and data types design specification and it will provide information to help you understand what analysist of algorithms, arrays, sorting algorithms, linked lists are and then we will discuss the stack and Queues before coming to the report. It provides information on each type of principles, operations, and functions. Java programming language to write code to implement this various data structure and algorithms 
P1 - Create a design specification for data structures explaining the valid operations that can be carried out on the structures. 
I. Stack  
1-What is Stack ? 
![image](https://user-images.githubusercontent.com/94780400/144779464-ef13bf15-5d4d-4004-a471-5729b2b73205.png)
A stack is a linear data structure that can be accessed only at one of its ends for storing and retrieving data. It's an abstract type of information that operates with two main operations: push and pop. A stack is a structure based on principles: last in / first out (LIFO). For example: Named as a stack because it acts like a real-life stack, such as a deck of cards or a stack of disks ... In real life, the stack only allows activities at the top position. of the stack. For example, we can only place or add a card or a disk to the top of the stack. Therefore, the abstract data structure of the stack only allows data manipulation at the top position. At any given time, we can only access the top element of the stack. 
2-ADT of Stack 
■ clear()—Clear the stack.  
■ isEmpty()—Check to see if the stack is empty.  
■ push(el)—Put the element el on the top of the stack.  
■ pop()—Take the topmost element from the stack.  
■ topEl()—Return the topmost element in the stack without removing it. (Drake, Peter., 2006) 
![image](https://user-images.githubusercontent.com/94780400/144779484-f8ca4d6c-1258-4cf4-91e2-c97e0bbf906b.png)
Figure 2  (Arnab Chakraborty, 2017) 
 
Figure demonstrates a sequence of push and pop operations. The stack holds only this number after moving number 10 to an empty stack. The number is placed on top of 10 after pressing 5 on the stack so that 5 will be removed from the stack when the popping process is performed because it arrived after 10 and 10 will be left on the stack. Between 15 and 7 drives. The top element is 7, and when performing the popping operation this number is removed, after which the stack includes 10 at the bottom and 15 above. 
3- Applications of Stack 
-	Evaluating arithmetic expressions : 
After converting into prefix or postfix notations, we have to evaluate the expression to get the result. For that purpose, also we need the help of stack data structure. 
-	Backtracking(Keeping track of previous choices) : 
Backtracking is one of the methods used to construct the algorithm. We dive in some direction for that reason, if that route is not successful, we can return to the previous state and go on some other routes. We need to store the previous state in order to get back from the current state. We need stack for this reason. Many backtracking examples are seeking a solution to the problem of Knight Tour or N-Queen dilemma etc. 
-	Call and return process 
-	Keeping track of choices yet to be made (as in creating a maze)  
-	Auxiliary data structure or algorithms  
-	Component of other data structure 
II. Queue 
1-What Is a Queue ? 
A queue is simply a line of waiting that expands by adding elements to the end and shrinks by removing elements from the front. A queue is a system that uses both ends, unlike a stack: one to add new elements and one to delete them. The last element must, therefore, wait until all previous elements on the list are withdrawn. A queue is a system of FIFO: first in / first out. 
2- ADT of Queue 
Operations in queues are similar to operations in stacks. To properly manage a queue, the follo wing operations are required: 
■ clear()—Clear the queue. 
■ isEmpty ()—Check to see if the queue is empty. 
■ enqueue(el)—Put the element el at the end of the queueFigure 3 
Memory stacks are linear data structures (locations) used to store data in a computer's memory. 
We've got a memory like a stack and a heap in java and c++.  
-	Each modern actuation record is set on the best of the run-time stack  
-	When a strategy ends, its actuation record is expelled from the best of the runtime stack - 	 The primary record put on the stack will be the final record erased. 
II. Using memory stack to implement function 
The way the memory stack is used on the machine to render function calls. Stack Memory Operations: Stack Memory is a memory management mechanism that allows the device memory to be used as temporary storage of data which serves as a buffer for first-in, last-out. A register called the stack pointer is one of the essential elements of the stack memory operation. Every time a stack operation is performed, the stack pointer is automatically adjusted. The record's basic information includes: 
-	Return email, the caller's guidance address directly after the message.  
-	The return value for a process that has not declared as void.  
-	Dynamic Link: a reference to the activation log of the caller  
-	Parameters and local variables used in the method called 
C. Using an imperative definition, specify the abstract data type for a software stack  
I- Identify the problem 
For a web service provider page, we provide a practical application of queues. The problem is determined when the client receives some slow requests from the web / HTTP (web service homepage) (some requests are sent from a device with an internet connection or slow processing speed) then the home page of the web provider will have to maintain the connection to that client. The web service company manages such queries in a fairly simple manner: that is, it will identify and grant an I d to those customer requests in a queue list. The web service provider will first process the identification of the request sent from the previous customer. We will use the queue data structure with these requirements add request ids or remove request ids from the waiting list and retrieve customer information when the website is read. 
II- ADTs used for that data structure  
-	clear()—Clear the queue.  
-	isEmpty()—Check to see if the queue is empty.  
-	enqueue(el)—Put the element el at the end of the queue.  
-	dequeue()—Take the first element from the queue.  
III- Implement the ADT, draw flowcharts 
After the problem has been established and the information model used in the problem has been shown. First, we will draw flowcharts to better understand the algorithm used to deal with this issue.  
 Add value algorithm diagram 
![image](https://user-images.githubusercontent.com/94780400/144779559-4b3d8234-93ff-4bce-9d0c-559dfdd72ea5.png)
. 
■ dequeue()—Take the first element from the queue. 
■ firstEl()—Return the first element in the queue without removing it. 
![image](https://user-images.githubusercontent.com/94780400/144779498-3662e24b-82bb-408a-b5b3-749d81012fa3.png)
Figures 3 : (Arnab Chakraborty, 2017) 
for example: In our day-to-day life we are faced with many circumstances where we have to wait for the right service, we have to join the waiting line for our turn to be serviced. A line of waiting can be known as a queue. 
![image](https://user-images.githubusercontent.com/94780400/144779521-d9a4bcf2-e6f4-4173-a930-bdbdd2fd3ac1.png)
3- Applications of Queue 
A queue is used when things don't need to be processed immediately, but in First In First Out order such as Breadth-First Search have to be processed. This Queue property also makes it useful for the following types of scenarios. 
1)	If many customers share a commodity. Types include configuration of the CPU, preparation of the drive. 
2)	When transferring data asynchronously between two processes (data not necessarily received at the same rate as sent). For eg, IO buffers, streams, IO folder, etc. 
Direct applications  
-	Waiting lists, bureaucracy 
-	Access to shared resources (e.g., printer) 
-	Multiprogramming  
-	Simulations 
 Indirect applications 
-	Auxiliary data type for algorithms  - 	Component of other data types. 
B. Determine the operations of a memory stack and how it is used to implement function calls in a computer. 
I. The operation of a Memory Stack 
![image](https://user-images.githubusercontent.com/94780400/144779538-08ad0aed-ccbb-4460-9298-f22dd01a4a4d.png)
Figure 3 
Memory stacks are linear data structures (locations) used to store data in a computer's memory. 
We've got a memory like a stack and a heap in java and c++.  
-	Each modern actuation record is set on the best of the run-time stack  
-	When a strategy ends, its actuation record is expelled from the best of the runtime stack - 	 The primary record put on the stack will be the final record erased. 
II. Using memory stack to implement function 
The way the memory stack is used on the machine to render function calls. Stack Memory Operations: Stack Memory is a memory management mechanism that allows the device memory to be used as temporary storage of data which serves as a buffer for first-in, last-out. A register called the stack pointer is one of the essential elements of the stack memory operation. Every time a stack operation is performed, the stack pointer is automatically adjusted. The record's basic information includes: 
-	Return email, the caller's guidance address directly after the message.  
-	The return value for a process that has not declared as void.  
-	Dynamic Link: a reference to the activation log of the caller  
-	Parameters and local variables used in the method called 
C. Using an imperative definition, specify the abstract data type for a software stack  
I- Identify the problem 
For a web service provider page, we provide a practical application of queues. The problem is determined when the client receives some slow requests from the web / HTTP (web service homepage) (some requests are sent from a device with an internet connection or slow processing speed) then the home page of the web provider will have to maintain the connection to that client. The web service company manages such queries in a fairly simple manner: that is, it will identify and grant an I d to those customer requests in a queue list. The web service provider will first process the identification of the request sent from the previous customer. We will use the queue data structure with these requirements add request ids or remove request ids from the waiting list and retrieve customer information when the website is read. 
II- ADTs used for that data structure  
-	clear()—Clear the queue.  
-	isEmpty()—Check to see if the queue is empty.  
-	enqueue(el)—Put the element el at the end of the queue.  
-	dequeue()—Take the first element from the queue.  
III- Implement the ADT, draw flowcharts 
After the problem has been established and the information model used in the problem has been shown. First, we will draw flowcharts to better understand the algorithm used to deal with this issue.  
 Add value algorithm diagram 
![image](https://user-images.githubusercontent.com/94780400/144779597-b38e5822-4fbd-4d10-adaf-e19692675d7b.png)
Algorithm diagram to delete value: 
![image](https://user-images.githubusercontent.com/94780400/144779611-a1d0049f-08cf-432a-a67b-f150a3e1f5a7.png)
After we got the diagram of the algorithm. Second, we are going to deploy code 
Queue 
![image](https://user-images.githubusercontent.com/94780400/144779625-90e47470-7379-4ead-9aa7-70973f620f74.png)
![image](https://user-images.githubusercontent.com/94780400/144779632-049b13e8-44cf-4263-848a-fe9f98652050.png)
Peek value in list: 
![image](https://user-images.githubusercontent.com/94780400/144779647-48ee1ece-0e57-4c79-a0a5-986b90f89dca.png)
![image](https://user-images.githubusercontent.com/94780400/144779652-1195cc1e-c3c3-40f5-aa87-e83a1967529c.png)
The customer request-id will be withdrawn from the table after being read by the website and shown on the computer. The server handles the consumer request-id attached to the first list and extracts the request-id from the first queue. 
![image](https://user-images.githubusercontent.com/94780400/144779670-4e816b41-e580-41d7-97c7-be590c4b9f36.png)
![image](https://user-images.githubusercontent.com/94780400/144779675-ea40ba2a-43c3-4027-a6c3-acda51c347d3.png)
D. Conclusion 
The study outlined how to construct an information model layout definition, data structures, abstract data types and described the organizational and functional concepts. What's more, which can more efficiently build and evaluate code. 
References 
Arnab Chakraborty, 2017. Applications of Stack in Data Structure. [Online]  Available at: https://techdifferences.com/difference-between-stack-and-queue.html [Accessed 27 July 2017]. 
Drake, Peter., 2006. Data structures and algorithms in Java. Pearson/Prentice Hall.. Anon ed. 
Anon: Anon. 
