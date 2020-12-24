#include <stdio.h>

int main() {
	int money;
	int change;
	int count = 0;

	scanf("%d", &money);
	change = 1000 - money;

	count += change / 500;
	change = change % 500;

	count += change / 100;
	change = change % 100;

	count += change / 50;
	change = change % 50;

	count += change / 10;
	change = change % 10;

	count += change / 5;
	change = change % 5;

	count += change / 1;

	printf("%d", count);

	return 0;
}
