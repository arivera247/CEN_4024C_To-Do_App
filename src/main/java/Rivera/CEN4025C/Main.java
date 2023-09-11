package Rivera.CEN4025C;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("To-Do List");
        //Outputs "To-Do List" in console as the title of the program. Originally part of sample code.

        List<String> todoList = new ArrayList<>();
        //Declares `todoList` variable as an ArrayList.
        //Reference [1]


        todoList.add("Item 1");
        todoList.add("Item 2");
        todoList.add("Item 3");
        todoList.add("Item 4");
        todoList.add("Item 5");
        //Adds item to todoList array using the add() method.
        //Reference [2]

        todoList.remove("Item 2");
        todoList.remove("Item 4");
        //Removes item from todoList array using the remove() method.
        //Reference [3]

        for (String todoItem : todoList) {
            System.out.println("To-Do = " + todoItem);
        }
        //Allows user to view all To-Do list items.
        //Reference [2]

        //FIXME - add standalone methods to add and remove items from todo list.


    }
}


/*

GitHub:
https://github.com/arivera247/CEN_4024C_To-Do_App

References:
[1] “List Interface in Java with Examples,” GeeksforGeeks, Oct. 27, 2016. https://www.geeksforgeeks.org/list-interface-java-examples/ (accessed Sep. 10, 2023).
[2] “Java.util.ArrayList.add() Method in Java,” GeeksforGeeks, Sep. 28, 2017. https://www.geeksforgeeks.org/java-util-arraylist-add-method-java/ (accessed Sep. 10, 2023).
[3] “Remove an Element at Specific Index from an Array in Java,” GeeksforGeeks, Oct. 17, 2018. https://www.geeksforgeeks.org/remove-an-element-at-specific-index-from-an-array-in-java/ (accessed Sep. 10, 2023).
*/