function greetings() {
		
		var testString = "This is for Test";
		
		var resultArray = testString.split(" ");
		
		for (i in resultArray) { 
			document.write(resultArray[i] + "<br/>");
		}
		
} 

