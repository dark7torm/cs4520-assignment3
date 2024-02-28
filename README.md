Assignment 3 : Favorite Calculator 
Author: Ren Taguchi
Due Wednesday by 11:59pm Points 10 Submitting a file upload File Types zip Available Feb 15 at 8:50am - Feb 28 at 11:59pm

Favorite calculator


Create a single activity calculator app. It contains a “HomeFragment”. 


This “HomeFragment” will be the first fragment users sees when they open the app. 


This fragment will have two buttons : MVP and MVVM at the centre of the screen stacked vertically. 
Clicking MVP open MVPFragment
Clicking MVVM opens MVVMFragment

 


Part 1 : MVP Architecture



Create a MVPFragment that will contain : 


2 number input fields 
A result field. 
Buttons for add, sub, multiply and divide operations
If its invalid/missing input, display a toast message.
Background for this fragment will be #c4b8e1Links to an external site.

Screenshots included in the starter app. Clicking each of the above buttons should perform the respected operation and the output of the calculation should be displayed in the result field.  



Remember : 


Use MVP architecture to implement the business logic.
Clear inputs after clicking any operation.
Fragments should depend on presenter abstraction and presenter should depend on view abstractions as discussed in class.
When the outcome of any operation is invalid due to incorrect input, display a toast message.

 


Part 2 : MVVM Architecture


Create a MVPFragment that will contain : 


2 number input fields 
A result field. 
Buttons for add, sub, multiply and divide operations
Background for this fragment will be #ffb3baLinks to an external site.

Screenshots included in the starter app. Click each of the above buttons should perform the respected operation and the output of the calculation should be displayed in the result field.  



Remember : 


Use MVVM architecture to implement the business logic.
Clear inputs after clicking any operation.
If its invalid/missing input, display a toast message.
When the outcome of any operation is invalid due to incorrect input, display a toast message.
The result displayed should survive orientation change without saving it to disk.

 

