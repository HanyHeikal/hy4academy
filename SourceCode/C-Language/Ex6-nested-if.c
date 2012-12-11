#include <stdio.h>

main() {

	int x = 3;
	int y = 2;
	int z = 1;
	
	/* print variables values */
	printf(" value of x is : %d\n value of y is : %d\n value of z is : %d\n", x, y, z);
		   
	/* nested 1 */
	if (x > y) {
		if (x > z) {
			printf("x > y and x > z\n");
		} else {
			printf("x > y and x < z\n");
		}
	}
	getch();
	
	/* nested 2 */
	if (x > y) {
		printf("(x > y)");	  
	} else if (x > z) {
		printf("(x > z)");	   
	} else if (z > y) {
		printf("(z > y)");	      
	} else {
		printf("no condition is true for else-if");	   	      
	}
}

