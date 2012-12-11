#include <stdio.h>

main() {

	int x;
	int y;
	printf("This is the first example of for loop\n");
	for(x = 0; x < 10; x++) {
		printf("value of x is : %d \n", x);
	}
	getch();
	
	printf("\n This is the second example of for loop\n");
	for(; x > 0; x--) { 
		printf("value of x is : %d \n", x);
	}
	getch();
	
	printf("\n This is the third example of for loop\n");
	for (y = 0; y < 20; y+=2) {
		printf("value of y is : %d \n", y);
	}
	getch();
}

