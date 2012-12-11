function greetings() {
		
		// third way
		var cities = new Array("Cairo", "Alex", "Aswan");
		document.write(cities);
		document.write("<br/>");
		
		// push
		cities.push("Luxur", "Tanta");
		document.write(cities);
		document.write("<br/>");
		// sort
		var sortedArray = cities.sort();
		document.write(sortedArray);
		document.write("<br/>");
		
		// reverse
		var reverseArray = cities.reverse();
		document.write(reverseArray);
		document.write("<br/>");
		
} 

