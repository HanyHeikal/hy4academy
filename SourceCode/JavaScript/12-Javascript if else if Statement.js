var x = 8; //Global variable
var y = 3;

var time = 7;
var status = "open"
var day = 10;

function greetings() {
		f1();
		
		
} 

function f1() {
	if (day == 1) {
		document.write("Today is Saturday");
	} else if (day == 2) {
		document.write("Today is Sunday");
	} else if (day == 7) {
		document.write("Today is Friday");
	} else {
		document.write("input is incorrect");
	}
	
	document.write("<br/>");
} 

