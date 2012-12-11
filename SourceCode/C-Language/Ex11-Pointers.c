#include <stdio.h>

main() {
	int c1=5, c2=3, c3=7, c4=6;
	int *p1, *p2, *p3, *p4;
	int x, y;
	int *a, *b;
	int array[20];
	int *pointer;

	printf("%d %d %d %d\n", c1, c2, c3, c4);
	getch();
	
	p1 = &c1;	
	p2 = &c2;
	p3 = &c3;
	p4 = &c4; 

	printf("%d %d %d %d\n", *p1, *p2, *p3, *p4);
	getch();
	
	x = y = 1;
	
	a = &x;
	b = &y;
	
	printf("%d %d\n", *a, *b);
	getch();
	
	x++; y--;
	
	printf("%d %d\n", *a, *b);
	getch();
	
	b = a;
	
	printf("%d %d\n\n", *a, *b);
	getch();

	
	array[0] = 10;
	array[1] = 11;
	array[2] = 12;
	array[3] = 13;
	array[4] = 14;
	
	pointer = array;
	
	printf("%d\n", *pointer);
	pointer++;
	printf("%d\n", *pointer);
	pointer++;
	printf("%d\n", *pointer);
	pointer++;
	printf("%d\n", *pointer);
}

