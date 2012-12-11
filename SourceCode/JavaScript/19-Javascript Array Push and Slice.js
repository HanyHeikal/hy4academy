function greetings() {
		
		// third way
		var cities = new Array("Cairo", "Alex", "Aswan");
		document.write(cities);
		document.write("<br/>");
		
		// push
		cities.push("Luxur", "Tanta");
		document.write(cities);
		document.write("<br/>");
		
		// slice 
		var temp = cities.slice(1,3);
		document.write(temp);
		document.write("<br/>");
		
} 

