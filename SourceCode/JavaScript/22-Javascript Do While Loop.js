function greetings() {
		
		// third way
		var cities = new Array("Cairo", "Alex", "Aswan");
		document.write(cities);
		document.write("<br/>");
		
		// push
		cities.push("Luxur", "Tanta");
		document.write(cities);
		document.write("<br/>");
		
		var i = 0;
		
		do {
			document.write("counter is : " + i);
			document.write("<br/>");
			document.write(cities[i]);
			document.write("<br/>");
			
			i++;
		} while(i < 0)
		
} 

