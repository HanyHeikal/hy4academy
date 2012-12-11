#include <stdio.h>

main() {

	char c;
	float r, area, length;
	
	do {
		system("cls");
		printf("\n\t\t\t Main Menu\n\t\t\t\n");
		printf("[1] Area of a Circle\n");
		printf("[2] Area of a Rectangle\n");
		printf("[3] Area of a Square\n");
		printf("[4] Exit\n");
		
		printf("\n Enter your choice: ");
		
		c = getch();
		
		switch(c) {
			case '1':
				printf("Enter the raduis: ");
				scanf("%f", &r);
				area = 3.14593 * r * r;
				printf("\n Area = %f\n", area);
				getch();
				break;
			case '2':
				printf("Enter the width: ");
				scanf("%f", &r);
				printf("Enter the length: ");
				scanf("%f", &length);
				area = r * length;
				printf("\n Area = %f\n", area);
				getch();
				break;
			case '3':
				printf("Enter the side: ");
				scanf("%f", &r);
				area = r * r;
				printf("\n Area = %f\n", area);
				getch();
				break;
			case '4':
				printf("Wrong Choice.. Try Again");
				getch();
				break;
		}
	} while(c != '4');

}

