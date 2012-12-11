var day = 1;

function greetings() {
		f1();
} 

function f1() {
	
	switch(day) {
		case 1 : 
			document.write("Today is Saturday");
			break;
		case 2 : 
			document.write("Today is Sunday");
			break;
		case 7 : 
			document.write("Today is Friday");
			break;
		default:
			document.write("input is incorrect");
			break
			
	}
	
	document.write("<br/>");
} 

