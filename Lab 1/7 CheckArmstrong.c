#include <stdio.h>
#include <math.h>

int main() {
    int num, original, sum = 0, digit, n = 0, temp;
    printf("Enter a number: ");
    scanf("%d", &num);
    original = num;
    temp = num;

    while (temp != 0) {
        temp /= 10;
        n++;
    }

    temp = num;
    while (temp != 0) {
        digit = temp % 10;

        // Manual   power = 1;
        // for (i = 0; i < n; i++) {
        //     power *= digit;
        // }
        // sum += power;

        // Using pow function
        sum += pow(digit, n);
        temp /= 10;
    }

    if (sum == original)
        printf("Armstrong number.\n");
    else
        printf("Not an Armstrong number.\n");

    return 0;
}
