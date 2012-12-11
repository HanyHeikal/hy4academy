function greetings() {
		
		document.write("The page will be redirected to another in 5 sec");
		
		setTimeout('redirect()', 5000);
		
} 

function redirect() {
		window.location = "http://www.hy4academy.com";
}

