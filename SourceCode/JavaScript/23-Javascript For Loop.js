function greetings() {
		
		// third way
		var cities = new Array("Cairo", "Alex", "Aswan");
		document.write(cities);
		document.write("<br/>");
		
		// push
		cities.push("Luxur", "Tanta");
		document.write(cities);
		document.write("<br/>");
		
		for (i = 0; i < cities.length; i++) {
			document.write("counter is : " + i);
			document.write("<br/>");
			document.write(cities[i]);
			document.write("<br/>");
		} 
		
} 

