function greetings() {
		
		var oldString = "I love eating apple. apple is healthy. apple is good";
		
		var myRegExp1 = /apple/g;
		
		var newString = oldString.replace(myRegExp1, "banana");
		
		document.write(oldString + "<br/>");
		document.write(newString + "<br/>");
		
} 

