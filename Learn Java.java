/* 1.

1.The text editor has a file, HelloYou.java, that contains a HelloYou class with a main() method.
Inside main(), add a statement which prints Hello someName!, with your name replacing someName.
For example, my program would print Hello Patrick!. 
*/

/* SOLUTION */

public class HelloYou {
  public static void main(String[] args) {
    System.out.println("Hello Hubert");
    
    
  }
}


/* 2.

1.The file Timeline.java has plain text information about Java.
Plain text facts aren’t valid syntax. We’ll use comments to avoid breaking the program.
Use the single-line comment syntax for the first fact.
Change this line into a comment:
Sun Microsystems announced the release of Java in 1995

2.Our program is still broken!
Use the multi-line syntax to make these lines into a single comment:
    James Gosling is a Canadian engineer who created Java while
    working at Sun Microsystems. His favorite number is the
    square root of 2!
You should still see You are a fun language! printed! 
*/

// SOLUTION

public class Timeline {
    public static void main(String[] args) {
      System.out.println("Hello Java!");
      
      System.out.println("You were born in 1995");
  
      // Sun Microsystems announced the release of Java in 1995
      
      System.out.println("You were created by James Gosling");
      
          /* James Gosling is a Canadian engineer who 
          created Java while working at Sun Microsystems. 
          His favorite number is the square root of 2! */
      
      System.out.println("You are a fun language!");
    }
  } 
  


/* 3.

1.The LanguageFacts.java file prints information about Java to the screen.
Unfortunately, the writer of the file has avoided using whitespace.
Make the file easier to read by adding a newline after each statement!

2.Inside main(), add a new statement printing how you feel about coding.
Start the message with: “Programming is… “.
Remember to place a semicolon at the end of the statement! 
*/


// SOLUTION 

public class LanguageFacts {
    public static void main(String[] args) {
      // Press enter or return on your keyboard after each semicolon!
      
      System.out.println("Java is a class-based language.");
      System.out.println("Java classes have a 'main' method.");
      System.out.println("Java statements end with a semicolon.");
      System.out.println("Programming is");
    }
  }

  
/* 4.

1.
Let’s practice compiling and executing a file by entering commands in the terminal!
Our text editor contains a broken program so we can see how compilers help us catch mistakes. Don’t make any corrections!
In the terminal, type this command: javac Compiling.java and press enter or return.
Use the Check Work button to progress through checkpoints.

2.Do you see the error?
The compiler is telling us one of the print statements is missing a semicolon.
In the terminal, type ls and press return or enter.
ls is short for "list" and this command lists all the available files.
There is only one file: Compiling.java, we did not successfully compile the file because of the error.

3.Add the missing semicolon in the text editor.
We’ll compile and execute this file in the next exercise! 
*/

// SOLUTION

public class Compiling {
    public static void main(String[] args) {
      
      System.out.println("Java is a class-based language.");
      System.out.println("Java classes have a 'main' method.");
      System.out.println("Java statements end with a semicolon.");
  
      System.out.println("Programming is... fun!");
      
    }
  }

  
/* STEP1  
print      
    javac Compiling.java  
on bash

You'ill get 
  Compiling.java:6: error: ';' expected 
  System.out.println("Java statements end with a semicolon")
  1 error

  STEP2
print 
  ls
on bash

You'ill get
  Compiling.class Compiling.java

THAT'S IT :) 
*/

/* 5.

1.Let’s compile and execute our program!
Run the ls command in the terminal to see the uncompiled .java file.

2.Compile the file from the terminal!

3.Enter ls again to see the new .class file.
Run the executable file from the terminal!
*/

// SOLUTION

public class Compiling {
    public static void main(String[] args) {
      
      System.out.println("Java is a class-based language.");
      System.out.println("Java classes have a 'main' method.");
      System.out.println("Java statements end with a semicolon.");
  
      System.out.println("Programming is... fun!");
      
    }
  }
  
/* STEP1
print 
  ls
on bash

You'ill get
  Compiling.java

  STEP2
print 
  javac Compiling.java

You'ill get nothing because nothing is wrong

STEP 3
print again
  ls

You'ill get
  Compiling.class Compiling.java

STEP 4
print 
  java Compiling

You'ill get 
    Java is a class-based language.
    Java classes have a 'main' method.
    Java statements end with a semicolon.
    Programming is... fun! 
*/

/* 6.

1.The text editor holds an empty file named Review.java. Fill it in!
Define a public class named Review.
Use opening and closing curly braces for the scope of the class.
Remember, no semicolons for classes or methods!

2.This code produces an error because Java programs need a main() method.
Define the main() method within the curly braces of the Review class.

3.Inside of the curly braces for the main() method, write The main method executes the tasks of the class as a single-line comment.

4.Below the comment, write a statement that prints the following: My first Java program from scratch!.
*/

// SOLUTION 

public class Review {
    public static void main(String[] args) {
          // The main method executes the tasks of the class 
    System.out.println("My first Java program from scratch!.");
    
      
    }
  }
