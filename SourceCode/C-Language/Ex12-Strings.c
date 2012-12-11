#include <stdio.h>

main() {

	char *a, *x, *y, *z;
	int l, r;
	
	a = "First Year";
	
	printf("%s\n", a);
	getch();
	
	l = strlen(a);
	printf("Number of character is : %d\n", l);
	getch();
	
	x = "Test";
	y = "Test";
	r = strcmp(x, y);
	printf("%d\n", r);
	getch();
	

}

