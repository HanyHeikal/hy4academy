function greetings() {
		
		function addWeight(value) {
			this.weight = value;
		}
		
		function Person(name, age) {
			this.name = name;
			this.age = age;
			this.addWeight = addWeight;
		}
		
		var person = new Person("TestName1000", 30);
		person.addWeight(70);
		
		with(person) {
			document.write("Person Name is : " + name + "<br/>");
			document.write("Person age is : " + age + "<br/>");
			document.write("Person weight is : " + weight + "<br/>");
		}
		
} 

