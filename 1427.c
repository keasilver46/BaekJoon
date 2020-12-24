#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main() {
	char N[10];
	int temp;

	scanf("%s", N);

	for (int i = 0; i < strlen(N); i++) {
		for (int j = 0; j < strlen(N) - i - 1; j++) {
			if (N[j] < N[j + 1]) {
				temp = N[j];
				N[j] = N[j + 1];
				N[j + 1] = temp;
			}
		}
	}

	printf("%s", N);

	return 0;
}