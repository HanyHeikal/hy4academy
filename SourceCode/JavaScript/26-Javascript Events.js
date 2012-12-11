function greetings() {
		
		// third way
		var cities = new Array("Cairo", "Alex", "Aswan");
		document.write(cities);
		document.write("<br/>");
		
		// push
		cities.push("Luxur", "Tanta");
		document.write(cities);
		document.write("<br/>");
		
		for(index in cities) {
			document.write(cities[index]);
			document.write("<br/>");
		}
		
		alert("The sum of 2+3 is: " + add(2, 3));
		
} 

function add(a , b) { 
	c = a + b;
	return c;
}
