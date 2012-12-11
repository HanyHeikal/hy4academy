#include <stdio.h>

main() {

	int x = 0;
	
	while (x > 10) {
		printf(" value of x is : %d \n", x);
		x++;
	}
	printf("This is the first while() example \n");
	getch();
	
	printf("\nThis is the second while() example \n");
	while (x < 10) {
		printf(" value of x is : %d \n", x);
		x++;
	}
	getch();
	
	
	/* reset x */
	x = 0;
	printf("\nThis is the first do-while() example \n");
	do {
		printf(" value of x is : %d \n", x);
		x++;
	} while (x > 10);
	getch();
	
	/* reset x */
	x = 0;
	printf("\nThis is the second do-while() example \n");
	do {
		printf(" value of x is : %d \n", x);
		x++;
	} while (x < 10);


}

