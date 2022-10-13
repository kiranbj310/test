1.What is platform independece ?
the compiled code can run in any hardwear / operating system called palatform independece
java is a platform independece language by useing independece language we can devlop a softwear 


2.what is the difference between primitive and non primitive data types ?

primitive data types
int,char,boolean,short,long ,byte,float,double

non primitive data types
className , string, arreys

3.explain class and its members with an example ?

class name is the identity of a file. it start with upper case .its a case sensitive

class member is object

6. example main method with the memorey it executes in ?

in main method we create a two class file. we write a veriable in 1st class file and calling the veriable in 2nd class file .
compile 2nd class file it executes the out put.

7. program to find reverse of a number ?

class ReverseNumber {

 public static void main(String a[]){

     int i=123456,reverse=0;
	 
	 int remainder;
	 
	 while(i>0){
     remainder= i%10;
	 i=i/10;
	 reverse=(reverse*10)+remainder;
	 }
	 System.out.println(reverse);
 }
 
}

8.Program to find into seconds ?

class Time{

public static void main(String a[]){

 int hours = 4;
 int minutes = 60;
 int seconds = 60;
 
 System.out.println(hours*minutes*seconds);
 
 }
 }


