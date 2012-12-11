function greetings() {
		
		function Person(name, age) {
			this.name = name;
			this.age = age;
		}
		
		var person = new Person("TestName1000", 30);
		
		document.write("Person Name is : " + person.name + "<br/>");
		document.write("Person age is : " + person.age + "<br/>");
		
		
} 

