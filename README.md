# JAVA
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
  
</pre>
