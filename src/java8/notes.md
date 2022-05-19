# Features in Java8

1. Interface Enhancement
2. Functional Interface
3. Lambda Expression
4. Stream API
5. Date & Time API


# 1.Interface Enhancement
---
a. Introduction of deafult methods - Supports backward compatibility
  1. default method is available inside the implementing class 
  2. there can be more than 1 default method interface
  3. default method helps in bringing backward compatibility

b. Introduction of static method
  1. static method is `not` available inside the implementing class
  2. there can be more than 1 static method interface
  3. static method helps in bringing backward compatibility
  4. we cannot override static method 
  5. Java 8 onwards main method can be part of Interface

c. Functional Interface
  1. An interface having one and only one abstract method is a functional
  2. Runnalbe interface had only 1 a method called run() - ex. functional interface
  3. Comparable interface had only 1 a method called compareTo() - ex. functional interface
  4. Functional interface can have any number of default and static method but only 1 abstract method. thats why it is also called as SAM interface

d. Lamda Expression
  1. OOP -> Programming paradigm should adhere to Classes, Objets, Encapsulation, Inheritance, Polymorphirm, Abstraction
  2. Functional Programming - Here implementation of same functionality can be done in clear and consise manner.
     - Code will less, implementation will compact 
 
e. Predicates
  1. Are predefined functional interface
  2. Return boolean value 

f. Double Colon Operator -> can be used as an alternative to Lambda Expression
  1. Method reference - instance and static method
  2. Constructor Reference

 



