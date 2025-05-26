#include <stdio.h>

int main() {
    int n, i, sum = 0;
    float avg;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d numbers:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        sum += arr[i];
    }

    avg =sum / n;
    printf("Sum = %d\n", sum);
    printf("Average = %.2f\n", avg);

    return 0;
}
