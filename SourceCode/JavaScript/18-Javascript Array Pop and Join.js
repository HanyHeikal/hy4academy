function greetings() {
		
		// second way
		var fruits = new Array();
		fruits[0] = "Orange";
		fruits[1] = "Apple";
		fruits[2] = "Banana";
		
		document.write(fruits);
		document.write("<br/>");
		
		// third way
		var cities = new Array("Cairo", "Alex", "Aswan");
		document.write(cities);
		document.write("<br/>");
		
		var fruitsCities = fruits.concat(cities);
		document.write(fruitsCities);
		document.write("<br/>");
		fruitsCities.pop();
		document.write(fruitsCities[5]);
		// join
		var test = fruitsCities.join(" - ");
		document.write("<br/>");
		document.write(test);
		
} 

