#include <stdio.h>

main() {

	int x = 1;
	int y = 2;
	int z = 3;

	/* print variables values */
	printf(" value of x is : %d\n value of y is : %d\n value of z is : %d\n", x, y, z);
	
  	/* (x > y) */
	if (x > y) {
		printf("x value is greater than y \n");
	} else {
		printf("x value is less than y \n");
	}
	getch();
	
	/* (x >= y) */
	if (x >= y) {
		printf("x value is greater than or equals y \n");
	} else {
		printf("x value is less than y \n");
	}
	getch();
	
	/* (z > y && z > x) */
	if (z > y && z > x) {
		printf("z > y && z > x \n");
	} else {
		printf("AND Condition not true \n");
	}
	getch();
	
	/* (z > y || z > x) */
	if (z > y || z > x) {
		printf("z > y || z > x \n");
	} else {
		printf("OR Condition not true \n");
	}
	getch();
}

