var x = 30.75; //Global variable

function greetings() {
		f1();
		f2();
		f3();
} 

function f1() {
	document.write("The value of x is : " + x);
	document.write("<br/>");
} 

function f2() {
	var x = 10;  // Local variable
	document.write("The value of x is : " + x);
	document.write("<br/>");
} 

function f3() {
	document.write("The value of x is : " + x);
	document.write("<br/>");
} 