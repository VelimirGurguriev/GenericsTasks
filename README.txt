SIRMA ACADEMY : Generics

Author: Velimir Gurguriev
Date: 05/07/2024

This repository contains my solutions for the problems given in the Generics exercise.

Within the /src folder, you will find 5 different packages, each containing the code for the given problem.

1. TofJar package: contains the code for Problem 1.
The task is to create a generic Jar class, which has two methods: add() and remove().
add() should add new generic elements on top of the Jar.
remove() should remove the topmost elements from the Jar.
> I have solved this problem using a generic stack of elements. 
I have tested the class by creating two Jar objects of type String and Integer.
-----------------------------------------------------------------------------------------------------------

2. CreatorArrayGeneric package: contains the code for Problem 2.
The task is to create a class called ArrayCreator, which has one method that needs to be overloaded once.
The method should be called "create" and have the following syntax: static T[] create(int length, T item).
The overloaded method should look like: static T[] create(Class<T> class, int length, T item).

The method returns an array with the set length, and every element in the array is set to the given element.
I have tested the class with two arrays of type Integer and type String.
-----------------------------------------------------------------------------------------------------------

3. ScaleGeneric package: contains the code for Problem 3.
The task is to create a generic class called Scale, that holds two elements - left and right.
The elements are set using a constructor. There is also a method getHeavier() which returns the heavier element.
If the elements that we are comparing are equal, the method returns null. 
-----------------------------------------------------------------------------------------------------------

4. BoxGeneric package: contains the code for Problem 4, 5, 6, 7, 8, 9 - each class contains solutions as it follows:
The task is to create a generic Box class that can store any type of element.
The method toString() needs to be overridden so that it prints the class type and the element 
that we add to the box.

->Problem 4&5 solutions: IntegerBox and StringBox classes. 
I have instantiated an object of the generic class of the corresponding
data type and I have tested the functionality of the constructor as well as
the overridden toString() method.

->Problem 6&7:
The Box class needs to have a new generic method that receives a generic list and
swaps the elements at the given indecies.
The execuctable method reads a number of boxes N, given from the user, and then it adds the elements of the
corresponding type to the List, each on a new line.
> Solutions: SwapIntegers and SwapStrings classes.
In order to test the modified Box class, I have instantiated a List of the corresponding data type.
The program requires user input for the number of elements to be added.
After the elements have been added to the list, the user needs to write the indecies of the
two elements that they want to perform the swap on. After the swap has been performed, the program
prints the list, so that the we can see that the swap has been successful.

-> Problem 8&9:
A method has to be created, which receives as an argument a generic type of List and a generic element.
The method has to return the number of elements that are greater than the element, given as an argument.
The execuctable method reads a number of boxes N, given from the user, and then it adds the elements of the
corresponding type to the List, each on a new line.
> Solutions: GenericCountStrings and GenericCountDoubles classes.
In order to test the modified Box class, I have instantiated a List of the corresponding data type.
The program requires user input for the number of elements to be added.
After the elements have been added to the list, the user needs to write the element that they want to
count from. After the countGreater() method is executed and the number of elements within the list that are
greater than the given element is printed on the console.
-----------------------------------------------------------------------------------------------------------

5. ListCustom package: contains the code for Problem 10 - CustomList.
The task is to create a custom list that can store any type and also be comparable.
The custom list contains methods:
●	void add(T element)
●	T remove(int index) 
●	boolean contains(T element) 
●	void swap(int index, int index) 
●	int countGreaterThan(T element) 
●	T getMax() 
●	T getMin() 
●	print() 

> I have implemented a solution in the Main class, instantiated the Generic CustomList with a String class type.
The program processes user input and calls the corresponding methods based on the commands of the user.
User input is not case-sensitive. The switch() operator ignores the cases of the user commands, ensuring that
the program will not break if user input is miss-spelled.

User input registered commands:

●	Add {element} - Adds the given element to the end of the list.
●	Remove {index} - Removes the element at the given index.
●	Contains {element} - Prints if the list contains the given element (true or false).
●	Swap {index1} {index2} - Swaps the elements at the given indexes.
●	Greater {element} - Counts the elements that are greater than the given element and prints their count
●	Max - Prints the maximum element in the list.
●	Min - Prints the minimum element in the list.
●	Print - Prints all elements in the list, each on a separate line.
●	end - stops the reading of commands.


*************************
An example of user input:
-------------------------
Add aa
Add bb
Add cc
Max
Min
Greater aa
Swap 0 2
Contains aa
Print
end