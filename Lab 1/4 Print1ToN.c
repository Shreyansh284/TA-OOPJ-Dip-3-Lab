#include <stdio.h>
int main() {
    int i, n;
    printf("Enter N: ");
    scanf("%d", &n);

    printf("Using for loop:\n");
    for(i = 1; i <= n; i++)
        printf("%d ", i);
    printf("\n");

    printf("Using while loop:\n");
    i = 1;
    while(i <= n) {
        printf("%d ", i);
        i++;
    }
    printf("\n");

    printf("Using do-while loop:\n");
    i = 1;
    do {
        printf("%d ", i);
        i++;
    } while(i <= n);
    printf("\n");

    return 0;
}
