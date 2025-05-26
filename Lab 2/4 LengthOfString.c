#include <stdio.h>

int main() {
    char str[100];  // Array to store user input string
    int i = 0;

    printf("Enter a string: ");
    scanf("%[^\n]s", str);  // Read string until newline

    while(str[i] != '\0') {
        i++;
    }

    printf("Length of string = %d\n", i);
    return 0;
}
