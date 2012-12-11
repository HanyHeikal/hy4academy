#include <stdio.h>

main() {
	char x = 'a';
	int y = 5;
		
	/* switch a character */
	switch(x) {
		case 'a' :
			printf("x equals a \n");
			break;
		case 'b' :
			printf("x equals b \n");
			break;
		case 'c' :
			printf("x equals c \n");
			break;
		default :
			printf("No match for char x \n");
			break;
	}
	getch();	

	
	/* switch an integer */
	switch(y) {
		case 3 :
			printf("y equals 3 \n");
			break;
		case 4 :
			printf("y equals 4 \n");
			break;
		case 5 :
			printf("y equals 5 \n");
			break;
		default :
			printf("No match for int y \n");
			break;
	}
}

