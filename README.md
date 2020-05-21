
# JAVA
![java](https://github.com/rohitm17/JAVA/blob/master/java-logs-stk-793x397.jpg)
<pre>
Developed by "JAMES GOSLING AND TEAM" in 1990 and named as OAK, but later it's named is revised to JAVA in 1995.

J2SE: JAVA SECOND STANDARD EDITION
J2ME: JAVA SECOND MOBILE EDITION
J2EE: JAVA SECOND ENTERPRISE EDITION                                    
JRE: JAVA RUNTIME ENVIRONMENT
JDK: JAVA DEVELOPMENT KIT
JVM: JAVA VIRTUAL MACHINE
JSL: JAVA STANDARD LIBRARY
API: APPLICATION PROGRAMMING INTERFACE

The Java codes are first compiled into byte code (machine independent code). Then the byte code is run on Java Virtual Machine (JVM) regardless of the underlying architecture. 
Java is Object Oriented. However it is not considered as pure object oriented as it provides support for primitive data types (like int, char, etc).

Source code--->Compiler--->Bytecode--->Interpretor--->Output.

<b>Operators</b>
1.Arithmetic:
  + - * / %
2.Relational:
  > < >= <= == !=
3.Bitwise:
  & | ^ << >>
4.Logical:
  && || !
5.Assignment:
  =
6.Conditional/Ternary:
  a>b?True:False
  
<b>Access Specifiers</b>
There are four types of access specifiers in java:
public: Accessible to all. Other objects can also access this member variable or function.
private: Not accessible by other objects. Private members can be accessed only by the methods in the same class. Object accessible only in class in which they are declared.
protected: The scope of a protected variable is within the class which declares it and in the class which inherits from the class (Scope is class and subclass).
Default: Scope is Package Level. We do not need to explicitly mention default as when we do not mention any access specifier it is considered as default.

<b>IS-A & HAS-A Relationships</b>

A Car IS-A Vehicle and HAS-A License then the code would look like this:

public class Vehicle{ }
public class Car extends Vehicle{
   private License myCarLicense;
}

  
  
<b>Abstract class in Java</b>  
A class which is declared with the abstract keyword is known as an abstract class in Java. It can have abstract and non-abstract methods (method with the body).
Abstraction is a process of hiding the implementation details and showing only functionality to the user.
    An abstract class must be declared with an abstract keyword.
    It can have abstract and non-abstract methods.
    It cannot be instantiated.
    It can have constructors and static methods also.
    It can have final methods which will force the subclass not to change the body of the method.    
A method which is declared as abstract and does not have implementation is known as an abstract method. 
Example of abstract method:    abstract void printStatus();//no method body and abstract  
    
If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract.

<b>Interfaces in Java</b>

An interface is a blueprint of a class, which can be declared by using interface keyword. Interfaces can contain only constants and abstract methods (methods with only signatures no body).Like abstract classes, Interfaces cannot be instantiated, they can only be implemented by classes or extended by other interfaces. Interface is a common way to achieve full abstraction in Java.

    Java does not support Multiple Inheritance, however a class can implement more than one interfaces
    Interface is similar to an abstract class but it contains only abstract methods.
    Interfaces are created by using interface keyword instead of the keyword class
    We use implements keyword while implementing an interface(similar to extending a class with extends keyword)

Interface: Syntax

class ClassName extends Superclass implements Interface1, Interface2, ....
  
  
    All methods in an interface are implicitly public and abstract. Using the keyword abstract before each method is optional.
    An interface may contain final variables.
    A class can extend only one other class, but it can implement any number of interfaces.
    When a class implements an interface it has to give the definition of all the abstract methods of interface,
    else it can be declared as abstract class
    An interface reference can point to objects of its implementing classes.

 Q.What is difference between Encapsulation And Abstraction?

Ans. 1.Abstraction solves the problem at design level while encapsulation solves the problem at implementation level

2.Abstraction is used for hiding the unwanted data and giving relevant data. while Encapsulation means hiding the code and data into a single unit to protect the data from outside world.

3. Abstraction lets you focus on what the object does instead of how it does it while Encapsulation means hiding the internal details or mechanics of how an object does something.

4.For example: Outer Look of a Television, like it has a display screen and channel buttons to change channel it explains Abstraction but Inner Implementation detail of a Television how CRT and Display Screen are connect with each other using different circuits , it explains Encapsulation.

</pre>
