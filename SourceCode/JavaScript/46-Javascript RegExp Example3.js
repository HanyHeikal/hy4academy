function greetings() {
		
		var oldString = "my mobile number is: 111-222-3333 and my tel is: 222-333-4444";
		
		var myRegExp1 = /[0-9]{3}-[0-9]{3}-[0-9]{4}/g;
		
		var newString = oldString.replace(myRegExp1, "123-456-7890");
		
		document.write(oldString + "<br/>");
		document.write(newString + "<br/>");
		
} 

