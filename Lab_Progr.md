# All Lab Programs


---

## Lab 1


**1 NoIsPostiveOrNot.c**

```c
#include <stdio.h>
int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    if (num > 0)
        printf("Positive number.\n");
    else if (num < 0)
        printf("Negative number.\n");
    else
        printf("Zero.\n");

    return 0;
}
```


**2 MaxOfThree.c**

```c
#include <stdio.h>
int main() {
    int a, b, c;
    printf("Enter three numbers: ");
    scanf("%d %d %d", &a, &b, &c);

    if (a >= b && a >= c)
        printf("Maximum is: %d\n", a);
    else if (b >= a && b >= c)
        printf("Maximum is: %d\n", b);
    else
        printf("Maximum is: %d\n", c);

    return 0;
}
```


**3 GetDay.c**

```c
#include <stdio.h>
int main() {
    int day;
    printf("Enter day number (1 to 7): ");
    scanf("%d", &day);

    switch(day) {
        case 1: printf("Sunday\n"); break;
        case 2: printf("Monday\n"); break;
        case 3: printf("Tuesday\n"); break;
        case 4: printf("Wednesday\n"); break;
        case 5: printf("Thursday\n"); break;
        case 6: printf("Friday\n"); break;
        case 7: printf("Saturday\n"); break;
        default: printf("Invalid input\n");
    }

    return 0;
}
```


**4 Print1ToN.c**

```c
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
```


**5 PrimeOrNot.c**

```c
#include <stdio.h>
int main() {
    int num, i, isPrime = 1;
    printf("Enter a number: ");
    scanf("%d", &num);

    if (num <= 1)
        isPrime = 0;
    else {
        for(i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                isPrime = 0;
                break;
            }
        }
    }

    if (isPrime)
        printf("Prime number.\n");
    else
        printf("Not a prime number.\n");

    return 0;
}
```


**6 CheckPalindrome.c**

```c
#include <stdio.h>
int main() {
    int num, reversed = 0, original, remainder;
    printf("Enter a number: ");
    scanf("%d", &num);
    original = num;

    while(num != 0) {
        remainder = num % 10;
        reversed = reversed * 10 + remainder;
        num /= 10;
    }

    if (original == reversed)
        printf("Palindrome number.\n");
    else
        printf("Not a palindrome.\n");

    return 0;
}
```


**7 CheckArmstrong.c**

```c
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
```


---

## Lab 2


**1 ReadnNoAndPrint.c**

```c
#include <stdio.h>

int main() {
    int n, i;
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d numbers:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Normal Order:\n");
    for(i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    printf("\nReverse Order:\n");
    for(i = n - 1; i >= 0; i--) {
        printf("%d ", arr[i]);
    }

    return 0;
}
```


**2 Sum&Avg.c**

```c
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
```


**3 Multiply2Matrics.c**

```c
#include <stdio.h>

int main() {
    int a[10][10], b[10][10], axb[10][10];
    int r1, c1, r2, c2, i, j, k;

    printf("Enter rows and columns of matrix A: ");
    scanf("%d %d", &r1, &c1);
    printf("Enter rows and columns of matrix B: ");
    scanf("%d %d", &r2, &c2);

    if(c1 != r2) {
        printf("Matrix multiplication not possible.\n");
        return 0;
    }

    printf("Enter elements of matrix A:\n");
    for(i = 0; i < r1; i++)
        for(j = 0; j < c1; j++)
            scanf("%d", &a[i][j]);

    printf("Enter elements of matrix B:\n");
    for(i = 0; i < r2; i++)
        for(j = 0; j < c2; j++)
            scanf("%d", &b[i][j]);

    // Multiplication
    for(i = 0; i < r1; i++) {
        for(j = 0; j < c2; j++) {
            axb[i][j] = 0;
            for(k = 0; k < c1; k++) {
                axb[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    printf("Resultant Matrix:\n");
    for(i = 0; i < r1; i++) {
        for(j = 0; j < c2; j++) {
            printf("%d ", axb[i][j]);
        }
        printf("\n");
    }

    return 0;
}
```


**4 LengthOfString.c**

```c
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
```


**5 Max&Min.c**

```c
#include <stdio.h>

int main() {
    int n, i, max, min;
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d numbers:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    max = min = arr[0];

    for(i = 1; i < n; i++) {
        if(arr[i] > max)
            max = arr[i];
        if(arr[i] < min)
            min = arr[i];
    }

    printf("Maximum = %d\n", max);
    printf("Minimum = %d\n", min);

    return 0;
}
```


**6 CopyString.c**

```c
#include <stdio.h>

int main() {
    char str1[100], str2[100];
    int i = 0;

    printf("Enter a string: ");
    fgets(str1, sizeof(str1), stdin);
    while(str1[i] != '\0') {
        str2[i] = str1[i];
        i++;
    }

    str2[i] = '\0';

    printf("Copied string: %s\n", str2);
    return 0;
}
```


---

## Lab 3


**Address.java**

```java
public class Address {
    public static void main(String[] args) {
   
        System.out.print("123 str, Jaipur, Rajasthan, India");

        System.out.println(); 

        System.out.println("123 Main Street");
        System.out.println("Jaipur");
        System.out.println("Rajasthan");
        System.out.println("India");
    }
}
```


**CircleArea.java**

```java
public class CircleArea{
    public static void main(String[] args) {
        double r = 5.0;
        double area = 3.14 * r * r;
        System.out.println("Area of Circle: " + area);
    }
}
```


**SimpleInterest.java**

```java
public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000;
        double roi = 5;
        double time = 2;
        double interest = (principal * roi * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}
```


**Welcome.java**

```java
public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to Java");
    }
}
```


---

## Lab 4


**Addition.java**

```java
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        sc.close();
    }
}
```


**BMI.java**

```java
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pounds = sc.nextDouble();
        double inches = sc.nextDouble();
        double weightKg = pounds * 0.45359237;
        double heightM = inches * 0.0254;
        double bmi = weightKg / (heightM * heightM);
        System.out.println(bmi);
        sc.close();
    }
}
```


**FahrenheitToCelsius.java**

```java
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println(c);
        sc.close();
    }
}
```


**MetersToFeet.java**

```java
import java.util.Scanner;

public class MetersToFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double meters = sc.nextDouble();
        double feet = meters * 3.28084;
        System.out.println(feet);
        sc.close();
    }
}
```


---

## Lab 5


**BitwiseOperator.java**

```java
import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 1);
        System.out.println(a >> 1);
    }
}
```


**MaxOfThree.java**

```java
import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);
    }
}
```


**OddOrEven.java**

```java
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
```


**PositiveOrNegative.java**

```java
import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String result = (num >= 0) ? "Positive" : "Negative";
        System.out.println(result);
    }
}
```


**TypeCasting.java**

```java
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = i;
        double pi = sc.nextDouble();
        int x = (int) pi;
        System.out.println(d);
        System.out.println(x);
    }
}
```


---

## Lab 6


**GradeCalculator.java**

```java
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += sc.nextInt();
        }
        double percentage = total / 5.0;
        if(percentage<0 || percentage > 100) {
            System.out.println("Invalid percentage");
            return;
        }
        else if (percentage < 35) {
            System.out.println("Fail");
        } else if (percentage < 45) {
            System.out.println("Pass Class");
        } else if (percentage < 60) {
            System.out.println("Second Class");
        } else if (percentage < 70) {
            System.out.println("First Class");
        } else {
            System.out.println("Distinction");
        }
    }
}
```


**LargestNumber.java**

```java
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}
```


**LeapYear.java**

```java
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
```


**SimpleCalculator.java**

```java
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b != 0) System.out.println(a / b);
                else System.out.println("Cannot divide by zero");
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
```


**VowelOrConsonant.java**

```java
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
```


---

## Lab 7


**Factorial.java**

```java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
```


**Pattern1.java**

```java
public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```


**Pattern2.java**

```java
public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
```


**Pattern3.java**

```java
public class Pattern3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
```


**Pattern4.java**

```java
public class Pattern4 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
```


**PrimeCheck.java**

```java
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}
```


**PrintNumbers1to10.java**

```java
public class PrintNumbers1to10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 10);
    }
}
```


**ReverseNumber.java**

```java
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(rev);
    }
}
```


**SumOfNNumbers.java**

```java
import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }
        System.out.println(sumFor);

        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }
        System.out.println(sumWhile);
    }
}
```


---

## Lab 8


**BreakAtFive.java**

```java
public class BreakAtFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.println(i);
        }
    }
}
```


**BreakOnDivisibleBySeven.java**

```java
import java.util.Scanner;

public class BreakOnDivisibleBySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n % 7 == 0) break;
            System.out.println(n);
        }
    }
}
```


**ContinueAtFive.java**

```java
public class ContinueAtFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) continue;
            System.out.println(i);
        }
    }
}
```


**ContinueAtFiveAndEight.java**

```java
public class ContinueAtFiveAndEight {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 8) continue;
            System.out.println(i);
        }
    }
}
```


---

## Lab 9


**FactorialRecursion.java**

```java
import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
```


**FibonacciSeries.java**

```java
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateFibonacci(n);
    }

    static void generateFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
```


**MaxOfThreeMethod.java**

```java
import java.util.Scanner;

public class MaxOfThreeMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = findMax(a, b, c);
        System.out.println(max);
    }

    static int findMax(int a, int b, int c) {
        if (a > b && a > c) return a;
        else if (b > c) return b;
        else return c;
    }
}
```


**PrimeCheckMethod.java**

```java
import java.util.Scanner;

public class PrimeCheckMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = check(n);
        if (result == 1) System.out.println("Prime");
        else System.out.println("Not Prime");
    }

    static int check(int n) {
        if (n <= 1) return 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return 0;
        }
        return 1;
    }
}
```


**SimpleInterestMethod.java**

```java
import java.util.Scanner;

public class SimpleInterestMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double si = calculateSI(p, r, t);
        System.out.println(si);
    }

    static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}
```


---

## Lab 10


**ArrayInputOutput.java**

```java
import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```


**CountEvenOdd.java**

```java
import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
```


**MatrixAddition.java**

```java
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```


**MatrixInputOutput.java**

```java
import java.util.Scanner;

public class MatrixInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```


**MatrixMultiplication.java**

```java
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```


**RemoveDuplicates.java**

```java
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[j++] = arr[i];
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
```


**SecondMinMax.java**

```java
import java.util.Scanner;

public class SecondMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");

        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

         for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        if (arr.length==2) {
            System.out.println("Array has only two elements.");
            System.out.println(" Smallest: " + arr[0]);
            System.out.println(" Largest: " + arr[1]);
            return;
        }
        System.out.println("Second Smallest: " + arr[1]);
        System.out.println("Second Largest: " + arr[n - 2]);
    }
}
```


---

## Lab 11


**BinarySearch.java**

```java
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int low = 0, high = n - 1, mid, index = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index " + index);
        }
    }
}
```


**LinearSearch.java**

```java
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
```


**SortArray.java**

```java
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```


---

## Lab 12


**BankAccountDetails.java**

```java
import java.util.Scanner;

class Bank_Account {
    int Account_No;
    String User_Name;
    String Email;
    String Account_Type;
    double Account_Balance;

    void GetAccountDetails() {
        Scanner sc = new Scanner(System.in);
        Account_No = sc.nextInt();
        sc.nextLine();
        User_Name = sc.nextLine();
        Email = sc.nextLine();
        Account_Type = sc.nextLine();
        Account_Balance = sc.nextDouble();
    }

    void DisplayAccountDetails() {
        System.out.println(Account_No);
        System.out.println(User_Name);
        System.out.println(Email);
        System.out.println(Account_Type);
        System.out.println(Account_Balance);
    }
}

public class BankAccountDetails {
    public static void main(String[] args) {
        Bank_Account b = new Bank_Account();
        b.GetAccountDetails();
        b.DisplayAccountDetails();
    }
}
```


**CandidatDetails.java**

```java
import java.util.Scanner;

class Candidate {
    int Candidate_ID;
    String Candidate_Name;
    int Candidate_Age;
    double Candidate_Weight;
    double Candidate_Height;

    void GetCandidateDetails() {
        Scanner sc = new Scanner(System.in);
        Candidate_ID = sc.nextInt();
        sc.nextLine();
        Candidate_Name = sc.nextLine();
        Candidate_Age = sc.nextInt();
        Candidate_Weight = sc.nextDouble();
        Candidate_Height = sc.nextDouble();
    }

    void DisplayCandidateDetails() {
        System.out.println(Candidate_ID);
        System.out.println(Candidate_Name);
        System.out.println(Candidate_Age);
        System.out.println(Candidate_Weight);
        System.out.println(Candidate_Height);
    }
}

public class CandidatDetails {
    public static void main(String[] args) {
        Candidate c = new Candidate();
        c.GetCandidateDetails();
        c.DisplayCandidateDetails();
    }
}
```


**StudentDetails.java**

```java
import java.util.Scanner;

class Student {
    String name;
    int roll;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        roll = sc.nextInt();
    }

    void showDetails() {
        System.out.println(name);
        System.out.println(roll);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student s = new Student();
        s.getDetails();
        s.showDetails();
    }
}
```


---

## Lab 13


**CircleTest.java**

```java
import java.util.Scanner;

class Circle {
    double radius;

    void getRadius() {
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
    }

    void area() {
        double a = Math.PI * radius * radius;
        System.out.println(a);
    }

    void perimeter() {
        double p = 2 * Math.PI * radius;
        System.out.println(p);
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getRadius();
        c.area();
        c.perimeter();
    }
}
```


**EmployeeTest.java**

```java
import java.util.Scanner;

class Employee {
    int Employee_ID;
    String Employee_Name;
    String Designation;
    int Age;
    double Salary;

    void GetEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        Employee_ID = sc.nextInt();
        sc.nextLine();
        Employee_Name = sc.nextLine();
        Designation = sc.nextLine();
        Age = sc.nextInt();
        Salary = sc.nextDouble();
    }

    void DisplayEmployeeDetails() {
        System.out.println(Employee_ID);
        System.out.println(Employee_Name);
        System.out.println(Designation);
        System.out.println(Age);
        System.out.println(Salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.GetEmployeeDetails();
        e.DisplayEmployeeDetails();
    }
}
```


**StudentTest.java**

```java
import java.util.Scanner;

class Student {
    int Enrollment_No;
    String Student_Name;
    int Semester;
    double CPI;
    double SPI;

    void GetStudentDetails() {
        Scanner sc = new Scanner(System.in);
        Enrollment_No = sc.nextInt();
        sc.nextLine();
        Student_Name = sc.nextLine();
        Semester = sc.nextInt();
        CPI = sc.nextDouble();
        SPI = sc.nextDouble();
    }

    void DisplayStudentDetails() {
        System.out.println(Enrollment_No);
        System.out.println(Student_Name);
        System.out.println(Semester);
        System.out.println(CPI);
        System.out.println(SPI);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.GetStudentDetails();
        s.DisplayStudentDetails();
    }
}
```


---

## Lab 14


**EvenLengthWords.java**

```java
public class EvenLengthWords {
    public static void main(String[] args) {
        String sentence = "Java is an awesome language";
        String[] words = sentence.split(" ");

        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
```


**PalindromeCheck.java**

```java
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
```


**StringBufferTest.java**

```java
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, " Java");
        System.out.println(sb);

        sb.delete(5, 10);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.charAt(3));
        System.out.println(sb.capacity());
        System.out.println(sb.toString());

        sb.replace(0, 5, "Test");
        System.out.println(sb);
    }
}
```


**StringFunctionsTest.java**

```java
public class StringFunctionsTest {
    public static void main(String[] args) {
        String str = " Hello Java ";
        String str2 = "World";

        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.concat(str2));
        System.out.println(str.indexOf('J'));
        System.out.println(str.equals(str2));
        System.out.println(String.valueOf(123));
        System.out.println(str.toString());
        System.out.println(str.trim());
        System.out.println(str.substring(1, 6));
    }
}
```


---

## Lab 15


**ArmstrongNumber.java**

```java
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;
        int digits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
```


**LargestOfThree.java**

```java
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maxAB = Math.max(a, b);
        int maxABC = Math.max(maxAB, c);

        System.out.println(maxABC);
    }
}
```


**MathFunctionsTest.java**

```java
public class MathFunctionsTest {
    public static void main(String[] args) {
        System.out.println(Math.min(5, 10));
        System.out.println(Math.max(5, 10));
        System.out.println(Math.random());
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.round(4.6));
        System.out.println(Math.ceil(4.2));
        System.out.println(Math.floor(4.8));
        System.out.println(Math.abs(-9));
    }
}
```


---

## Lab 16


**AnonymousInnerClass.java**

```java
class Animal {
   void sound(){System.out.println("Hi I am Normal");};
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal obj = new Animal() {
            void sound() {
                System.out.println("Hi I am Anonymous");
            }
        };
        obj.sound();
    }
}
```


**OuterClass.java**

```java
public class OuterClass {
    int x = 5;

    static class NestedClass {
        void display() {
            System.out.println("This is a static nested class.");
        }
    }

    public static void main(String[] args) {
        NestedClass obj = new NestedClass();
        obj.display();
    }
}
```


**WrapperExample.java**

```java
public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a;
        int b = obj;
        System.out.println(obj);
        System.out.println(b);
    }
}
```


---

## Lab 17


**AreaCalculator.java**

```java
//  Area of Circle, Triangle, and Square using Method Overloading (A)
public class AreaCalculator {
    void area(double r) {
        System.out.println(3.14 * r * r);
    }

    void area(int b, int h) {
        System.out.println(0.5 * b * h);
    }

    void area(int a) {
        System.out.println(a * a);
    }

    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        obj.area(5.0);
        obj.area(4, 6);
        obj.area(4);
    }
}
```


**Book.java**

```java
// Copy Constructor (B)
public class Book {
    String title;

    Book(String t) {
        title = t;
    }

    Book(Book b) {
        title = b.title;
    }

    void display() {
        System.out.println(title);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book(b1);
        b1.display();
        b2.display();
    }
}
```


**Employee.java**

```java
//  Constructor Overloading (C)
public class Employee {
    String name;
    int age;

    Employee() {
        name = "None";
        age = 0;
    }

    Employee(String n) {
        name = n;
        age = 0;
    }

    Employee(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alice");
        Employee e3 = new Employee("Bob", 30);
        e1.display();
        e2.display();
        e3.display();
    }
}
```


**Student.java**

```java
// Default and Parameterized Constructor (A)
public class Student {
    String name;
    int age;

    Student() {
        name = "Default";
        age = 0;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("John", 22);
        s1.display();
        s2.display();
    }
}
```


---

## Lab 18


**StaticBlockExample.java**

```java
public class StaticBlockExample {
    static {
        System.out.println("Static block executed");
    }

    static void show() {
        System.out.println("Static method called");
    }

    public static void main(String[] args) {
        show();
    }
}
```


**StaticExample.java**

```java
public class StaticExample {
    static int count = 0;

    StaticExample() {
        count++;
    }

    void display() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        StaticExample a = new StaticExample();
        StaticExample b = new StaticExample();
        StaticExample c = new StaticExample();
        c.display();
    }
}
```


**ThisExample.java**

```java
public class ThisExample {
    int a;

    ThisExample(int a) {
        this.a = a;
    }

    void display() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        ThisExample obj = new ThisExample(10);
        obj.display();
    }
}
```


**ThisStaticCheck.java**

```java
public class ThisStaticCheck {
    static int x = 100;

    void display() {
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        ThisStaticCheck obj = new ThisStaticCheck();
        ThisStaticCheck obj2 = new ThisStaticCheck();
        obj.display();
        obj2.display();
    }
}
```


---

## Lab 19


**InheritanceDemo.java**

```java
// Single Inheritance
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Multilevel Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class SportsCar extends Car {
    void turbo() {
        System.out.println("Sports car turbo mode ON.");
    }
}

// Hierarchical Inheritance
class Person {
    void walk() {
        System.out.println("Person is walking.");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher is teaching.");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Single Inheritance
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println();

        // Multilevel Inheritance
        SportsCar sportsCar = new SportsCar();
        sportsCar.start();
        sportsCar.drive();
        sportsCar.turbo();

        System.out.println();

        // Hierarchical Inheritance
        Teacher teacher = new Teacher();
        teacher.walk();
        teacher.teach();

        Student student = new Student();
        student.walk();
        student.study();
    }
}
```


**InterestDemo.java**

```java
import java.util.Scanner;

class AccountDetails {
    String name;
    double principal;
    double rate;
    int time;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        name = sc.nextLine();
        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();
        System.out.print("Enter rate of interest (%): ");
        rate = sc.nextDouble();
        System.out.print("Enter time (years): ");
        time = sc.nextInt();
    }
}

class Interest extends AccountDetails {
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }

    void displayInterest() {
        double interest = calculateInterest();
        System.out.println("Account Holder: " + name);
        System.out.println("Total Interest: " + interest);
    }
}

public class InterestDemo {
    public static void main(String[] args) {
        Interest interest = new Interest();
        interest.getDetails();
        interest.displayInterest();
    }
}
```


**ShapeAreaDemo.java**

```java
class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    void area() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

public class ShapeAreaDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.area();

        Triangle triangle = new Triangle(4, 6);
        triangle.area();

        Square square = new Square(3);
        square.area();
    }
}
```


---

## Lab 20


**FinalKeywordDemo.java**

```java
final class FinalClass {
    final int finalVar = 50;

    final void finalMethod() {
        System.out.println("This is a final method.");
    }
}


class TestFinal {
    final int CONSTANT = 10;

}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.finalMethod();
        
        TestFinal test = new TestFinal();
        System.out.println("Final variable: " + test.CONSTANT);
    }
}
```


**MemberDemo.java**

```java
class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    void printEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}

class Manager extends Member {
    String department;

    void printManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class MemberDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Alice";
        emp.age = 28;
        emp.phoneNumber = "1234567890";
        emp.address = "123 Main St";
        emp.salary = 50000;
        emp.specialization = "Software Development";

        Manager mgr = new Manager();
        mgr.name = "Bob";
        mgr.age = 35;
        mgr.phoneNumber = "0987654321";
        mgr.address = "456 Park Ave";
        mgr.salary = 80000;
        mgr.department = "IT";

        emp.printEmployeeDetails();
        mgr.printManagerDetails();
    }
}
```


**MethodOverridingDemo.java**

```java
class Parent {
    void show() {
        System.out.println("Parent's show method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's overridden show method");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();

        Child c = new Child();
        c.show();

        Parent p2 = new Child();
        p2.show();  // runtime polymorphism
    }
}
```


**SuperKeywordDemo.java**

```java
class Parent {
    int num = 100;

    Parent() {
        System.out.println("Parent constructor called");
    }

    void display() {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    int num = 200;

    Child() {
        super(); // calling parent constructor
        System.out.println("Child constructor called");
    }

    void display() {
        super.display(); // calling parent method
        System.out.println("Child display method");
    }

    void printNum() {
        System.out.println("Child num: " + num);
        System.out.println("Parent num: " + super.num); // accessing parent variable
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.printNum();
    }
}
```


---

## Lab 21


**AbstractShapeDemo.java**

```java
abstract class Shape {
    abstract double area();  // abstract method
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractShapeDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        Circle circle = new Circle(4);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
```


**VegetableDemo.java**

```java
abstract class Vegetable {
    String color;

    Vegetable(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " color: " + color;
    }
}

class Potato extends Vegetable {
    Potato(String color) {
        super(color);
    }
}

class Brinjal extends Vegetable {
    Brinjal(String color) {
        super(color);
    }
}

class Tomato extends Vegetable {
    Tomato(String color) {
        super(color);
    }
}

public class VegetableDemo {
    public static void main(String[] args) {
        Potato potato = new Potato("Brown");
        Brinjal brinjal = new Brinjal("Purple");
        Tomato tomato = new Tomato("Red");

        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}
```


---

## Lab 22


**MultipleInheritanceDemo.java**

```java
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Demo implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void show() {
        System.out.println("Showing...");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.print();
        obj.show();
    }
}
```


**PublicationDemo.java**

```java
class Book {
    private String author_name;

    Book(String author_name) {
        this.author_name = author_name;
    }

    public void display() {
        System.out.println("Author: " + author_name);
    }
}

class BookPublication extends Book {
    private String title;

    BookPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Book Publication Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;

    PaperPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Paper Publication Title: " + title);
    }
}

public class PublicationDemo {
    public static void main(String[] args) {
        Book b1 = new BookPublication("J.K. Rowling", "Harry Potter");
        Book b2 = new PaperPublication("Albert Einstein", "Theory of Relativity");

        b1.display();
        System.out.println();
        b2.display();
    }
}
```


**TransportDemo.java**

```java
interface Transport {
    void deliver();
}

abstract class Animal {
    abstract void sound();
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Tiger roars");
    }
}

class Camel extends Animal implements Transport {
    @Override
    void sound() {
        System.out.println("Camel grunts");
    }

    @Override
    public void deliver() {
        System.out.println("Camel is delivering goods");
    }
}

class Deer extends Animal {
    @Override
    void sound() {
        System.out.println("Deer makes a sound");
    }
}

class Donkey extends Animal implements Transport {
    @Override
    void sound() {
        System.out.println("Donkey brays");
    }

    @Override
    public void deliver() {
        System.out.println("Donkey is delivering goods");
    }
}

public class TransportDemo {
    public static void main(String[] args) {
        Animal[] animals = {new Tiger(), new Camel(), new Deer(), new Donkey()};

        for (Animal a : animals) {
            a.sound();
            if (a instanceof Transport) {
                ((Transport) a).deliver();
            }
            System.out.println();
        }
    }
}
```


---

## Lab_23


## Q1


**AccessDemo.java**

```java
package Lab_23.Q1;
import Lab_23.Q1.pkg2.*;

public class AccessDemo {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.show();
    }
}
```


### pkg1


**Base.java**

```java
package Lab_23.Q1.pkg1;

public class Base {
    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;

    public void display() {
        System.out.println("privateVar: " + privateVar);
        System.out.println("defaultVar: " + defaultVar);
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("publicVar: " + publicVar);
    }
}
```


### pkg2


**Derived.java**

```java
package Lab_23.Q1.pkg2;
import Lab_23.Q1.pkg1.Base;

public class Derived extends Base {
    public void show() {
        // System.out.println(privateVar); // Not accessible
        // System.out.println(defaultVar); // Not accessible
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}
```


## Q2


### Exam


**Result.java**

```java
package Lab_23.Q2.Exam;

import Lab_23.Q2.Student.Student;

public class Result extends Student {
    int marks1, marks2;

    public Result(String name, int roll, int marks1, int marks2) {
        super(name, roll);
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Total Marks: " + (marks1 + marks2));
    }
}
```


**MarksheetDemo.java**

```java
package Lab_23.Q2;
import Lab_23.Q2.Exam.Result;

public class MarksheetDemo {
    public static void main(String[] args) {
        Result r = new Result("Ankit", 101, 85, 90);
        r.display();
    }
}
```


### Student


**Student.java**

```java
package Lab_23.Q2.Student;

public class Student {
    public String name;
    public int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}
```


## Q3


### Calculater


**MathOperation.java**

```java
package Lab_23.Q3.Calculater;

public class MathOperation {
    public int add(int a, int b) { return a + b; }
    public int sub(int a, int b) { return a - b; }
    public int mul(int a, int b) { return a * b; }
    public int div(int a, int b) { return b != 0 ? a / b : 0; }
}
```


**DemoOperation.java**

```java
package Lab_23.Q3;

import Lab_23.Q3.Calculater.MathOperation;

public class DemoOperation {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println("Add: " + mo.add(10, 5));
        System.out.println("Sub: " + mo.sub(10, 5));
        System.out.println("Mul: " + mo.mul(10, 5));
        System.out.println("Div: " + mo.div(10, 5));
    }
}
```


## Q4


### Pkg1


**A.java**

```java
package Lab_23.Q4.Pkg1 ;

public class A {
    protected int protectedVar = 10;
    private int privateVar = 20;
    public int publicVar = 30;
}
```


### Pkg2


**B.java**

```java
package Lab_23.Q4.Pkg2;

import Lab_23.Q4.Pkg1.A;

public class B extends A {
    public void display() {
        System.out.println(protectedVar);
        System.out.println(publicVar);
        // System.out.println(privateVar); 
    }
}
```


### Pkg3


**C.java**

```java
package Lab_23.Q4.Pkg3;

import Lab_23.Q4.Pkg1.A;

public class C {
    public void display() {
        A a = new A();
        System.out.println(a.publicVar);
        // System.out.println(a.protectedVar); 
        // System.out.println(a.privateVar);  
    }
}
```


### Pkg4


**ProtectedDemo.java**

```java
package Lab_23.Q4.Pkg4;

import Lab_23.Q4.Pkg2.B;
import Lab_23.Q4.Pkg3.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        b.display();
        c.display();
    }
}
```


---

## Lab 24


**BankAccountDemo.java**

```java
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Account {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance.");
        }
        balance -= amount;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(1000);
        try {
            acc.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```


**CustomExceptionDemo.java**

```java
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom exception.");
        } catch (MyException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
```


**CustomValidation.java**

```java
public class CustomValidation {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);

                if (num < 0) throw new Exception("Negative number");
                if (num % 10 == 0) throw new Exception("Divisible by 10");
                if (num > 1000 && num < 2000) throw new Exception("Between 1000 and 2000");
                if (num > 7000) throw new Exception("Greater than 7000");

                sum += num;
            } catch (Exception e) {
                System.out.println("Skipped: " + arg + " (" + e.getMessage() + ")");
            }
        }

        System.out.println("Sum = " + sum);
    }
}
```


**MultipleExceptionDemo.java**

```java
public class MultipleExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 10;
            int result = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        }
    }
}
```


**ThrowThrowsDemo.java**

```java
public class ThrowThrowsDemo {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }
        System.out.println("Eligible.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
```


**TryCatchFinallyDemo.java**

```java
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
```


---

## Lab 25


**CopyFileDemo.java**

```java
import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("copy.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
                System.out.print((char) ch);
            }
            fr.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```


**CopyToMultiple.java**

```java
import java.io.*;

public class CopyToMultiple {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("original.txt");
            FileWriter fw1 = new FileWriter("copy1.txt");
            FileWriter fw2 = new FileWriter("copy2.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                fw1.write(ch);
                fw2.write(ch);
            }

            fr.close();
            fw1.close();
            fw2.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```


**CreateFileDemo.java**

```java
import java.io.*;

public class CreateFileDemo {
    public static void main(String[] args) {
        File file = new File("created_file.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```


**MergeFiles.java**

```java
import java.io.*;

public class MergeFiles {
    public static void main(String[] args) {
        try {
            FileReader fr1 = new FileReader("file1.txt");
            FileReader fr2 = new FileReader("file2.txt");
            FileWriter fw = new FileWriter("merged.txt");

            int ch;
            while ((ch = fr1.read()) != -1) fw.write(ch);
            while ((ch = fr2.read()) != -1) fw.write(ch);

            fr1.close();
            fr2.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```


---

## Lab 26


**BufferedReaderWriterDemo.java**

```java
import java.io.*;

public class BufferedReaderWriterDemo {
    public static void main(String[] args) {
        String text = "BufferedReader and BufferedWriter demo.";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("demo2.txt"));
            writer.write(text);
            writer.newLine();
            writer.write("Second line of text.");
            writer.close();
            System.out.println("Data written using BufferedWriter.");

            BufferedReader reader = new BufferedReader(new FileReader("demo2.txt"));
            String line;
            System.out.println("Data read using BufferedReader:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```


**BufferedStreamDemo.java**

```java
import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) {
        String data = "BufferedInputStream and BufferedOutputStream demo.";

        try {
            // Writing using BufferedOutputStream
            FileOutputStream fos = new FileOutputStream("demo3.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(data.getBytes());
            bos.close();
            System.out.println("Data written using BufferedOutputStream.");

            // Reading using BufferedInputStream
            FileInputStream fis = new FileInputStream("demo3.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int ch;
            System.out.print("Data read using BufferedInputStream: ");
            while ((ch = bis.read()) != -1) {
                System.out.print((char) ch);
            }
            bis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```


**FileIOStreamDemo.java**

```java
import java.io.*;

public class FileIOStreamDemo {
    public static void main(String[] args) {
        String data = "This is a demo of FileOutputStream and FileInputStream.";

        try {
            FileOutputStream fos = new FileOutputStream("demo1.txt");
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written to file using FileOutputStream.");

            FileInputStream fis = new FileInputStream("demo1.txt");
            int ch;
            System.out.print("Data read from file: ");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```


---

## .git


**COMMIT_EDITMSG**

```
Lab 23-24-25-26 Added
```


**HEAD**

```
ref: refs/heads/main
```


**config**

```
[core]
	repositoryformatversion = 0
	filemode = false
	bare = false
	logallrefupdates = true
	symlinks = false
	ignorecase = true
[remote "origin"]
	url = https://github.com/Shreyansh284/TA-OOPJ-Dip-3-Lab
	fetch = +refs/heads/*:refs/remotes/origin/*
[branch "main"]
	remote = origin
	merge = refs/heads/main
```


**description**

```
Unnamed repository; edit this file 'description' to name the repository.
```


## hooks


**applypatch-msg.sample**

```
#!/bin/sh
#
# An example hook script to check the commit log message taken by
# applypatch from an e-mail message.
#
# The hook should exit with non-zero status after issuing an
# appropriate message if it wants to stop the commit.  The hook is
# allowed to edit the commit message file.
#
# To enable this hook, rename this file to "applypatch-msg".

. git-sh-setup
commitmsg="$(git rev-parse --git-path hooks/commit-msg)"
test -x "$commitmsg" && exec "$commitmsg" ${1+"$@"}
:
```


**commit-msg.sample**

```
#!/bin/sh
#
# An example hook script to check the commit log message.
# Called by "git commit" with one argument, the name of the file
# that has the commit message.  The hook should exit with non-zero
# status after issuing an appropriate message if it wants to stop the
# commit.  The hook is allowed to edit the commit message file.
#
# To enable this hook, rename this file to "commit-msg".

# Uncomment the below to add a Signed-off-by line to the message.
# Doing this in a hook is a bad idea in general, but the prepare-commit-msg
# hook is more suited to it.
#
# SOB=$(git var GIT_AUTHOR_IDENT | sed -n 's/^\(.*>\).*$/Signed-off-by: \1/p')
# grep -qs "^$SOB" "$1" || echo "$SOB" >> "$1"

# This example catches duplicate Signed-off-by lines.

test "" = "$(grep '^Signed-off-by: ' "$1" |
	 sort | uniq -c | sed -e '/^[ 	]*1[ 	]/d')" || {
	echo >&2 Duplicate Signed-off-by lines.
	exit 1
}
```


**fsmonitor-watchman.sample**

```
#!/usr/bin/perl

use strict;
use warnings;
use IPC::Open2;

# An example hook script to integrate Watchman
# (https://facebook.github.io/watchman/) with git to speed up detecting
# new and modified files.
#
# The hook is passed a version (currently 2) and last update token
# formatted as a string and outputs to stdout a new update token and
# all files that have been modified since the update token. Paths must
# be relative to the root of the working tree and separated by a single NUL.
#
# To enable this hook, rename this file to "query-watchman" and set
# 'git config core.fsmonitor .git/hooks/query-watchman'
#
my ($version, $last_update_token) = @ARGV;

# Uncomment for debugging
# print STDERR "$0 $version $last_update_token\n";

# Check the hook interface version
if ($version ne 2) {
	die "Unsupported query-fsmonitor hook version '$version'.\n" .
	    "Falling back to scanning...\n";
}

my $git_work_tree = get_working_dir();

my $retry = 1;

my $json_pkg;
eval {
	require JSON::XS;
	$json_pkg = "JSON::XS";
	1;
} or do {
	require JSON::PP;
	$json_pkg = "JSON::PP";
};

launch_watchman();

sub launch_watchman {
	my $o = watchman_query();
	if (is_work_tree_watched($o)) {
		output_result($o->{clock}, @{$o->{files}});
	}
}

sub output_result {
	my ($clockid, @files) = @_;

	# Uncomment for debugging watchman output
	# open (my $fh, ">", ".git/watchman-output.out");
	# binmode $fh, ":utf8";
	# print $fh "$clockid\n@files\n";
	# close $fh;

	binmode STDOUT, ":utf8";
	print $clockid;
	print "\0";
	local $, = "\0";
	print @files;
}

sub watchman_clock {
	my $response = qx/watchman clock "$git_work_tree"/;
	die "Failed to get clock id on '$git_work_tree'.\n" .
		"Falling back to scanning...\n" if $? != 0;

	return $json_pkg->new->utf8->decode($response);
}

sub watchman_query {
	my $pid = open2(\*CHLD_OUT, \*CHLD_IN, 'watchman -j --no-pretty')
	or die "open2() failed: $!\n" .
	"Falling back to scanning...\n";

	# In the query expression below we're asking for names of files that
	# changed since $last_update_token but not from the .git folder.
	#
	# To accomplish this, we're using the "since" generator to use the
	# recency index to select candidate nodes and "fields" to limit the
	# output to file names only. Then we're using the "expression" term to
	# further constrain the results.
	my $last_update_line = "";
	if (substr($last_update_token, 0, 1) eq "c") {
		$last_update_token = "\"$last_update_token\"";
		$last_update_line = qq[\n"since": $last_update_token,];
	}
	my $query = <<"	END";
		["query", "$git_work_tree", {$last_update_line
			"fields": ["name"],
			"expression": ["not", ["dirname", ".git"]]
		}]
	END

	# Uncomment for debugging the watchman query
	# open (my $fh, ">", ".git/watchman-query.json");
	# print $fh $query;
	# close $fh;

	print CHLD_IN $query;
	close CHLD_IN;
	my $response = do {local $/; <CHLD_OUT>};

	# Uncomment for debugging the watch response
	# open ($fh, ">", ".git/watchman-response.json");
	# print $fh $response;
	# close $fh;

	die "Watchman: command returned no output.\n" .
	"Falling back to scanning...\n" if $response eq "";
	die "Watchman: command returned invalid output: $response\n" .
	"Falling back to scanning...\n" unless $response =~ /^\{/;

	return $json_pkg->new->utf8->decode($response);
}

sub is_work_tree_watched {
	my ($output) = @_;
	my $error = $output->{error};
	if ($retry > 0 and $error and $error =~ m/unable to resolve root .* directory (.*) is not watched/) {
		$retry--;
		my $response = qx/watchman watch "$git_work_tree"/;
		die "Failed to make watchman watch '$git_work_tree'.\n" .
		    "Falling back to scanning...\n" if $? != 0;
		$output = $json_pkg->new->utf8->decode($response);
		$error = $output->{error};
		die "Watchman: $error.\n" .
		"Falling back to scanning...\n" if $error;

		# Uncomment for debugging watchman output
		# open (my $fh, ">", ".git/watchman-output.out");
		# close $fh;

		# Watchman will always return all files on the first query so
		# return the fast "everything is dirty" flag to git and do the
		# Watchman query just to get it over with now so we won't pay
		# the cost in git to look up each individual file.
		my $o = watchman_clock();
		$error = $output->{error};

		die "Watchman: $error.\n" .
		"Falling back to scanning...\n" if $error;

		output_result($o->{clock}, ("/"));
		$last_update_token = $o->{clock};

		eval { launch_watchman() };
		return 0;
	}

	die "Watchman: $error.\n" .
	"Falling back to scanning...\n" if $error;

	return 1;
}

sub get_working_dir {
	my $working_dir;
	if ($^O =~ 'msys' || $^O =~ 'cygwin') {
		$working_dir = Win32::GetCwd();
		$working_dir =~ tr/\\/\//;
	} else {
		require Cwd;
		$working_dir = Cwd::cwd();
	}

	return $working_dir;
}
```


**post-update.sample**

```
#!/bin/sh
#
# An example hook script to prepare a packed repository for use over
# dumb transports.
#
# To enable this hook, rename this file to "post-update".

exec git update-server-info
```


**pre-applypatch.sample**

```
#!/bin/sh
#
# An example hook script to verify what is about to be committed
# by applypatch from an e-mail message.
#
# The hook should exit with non-zero status after issuing an
# appropriate message if it wants to stop the commit.
#
# To enable this hook, rename this file to "pre-applypatch".

. git-sh-setup
precommit="$(git rev-parse --git-path hooks/pre-commit)"
test -x "$precommit" && exec "$precommit" ${1+"$@"}
:
```


**pre-commit.sample**

```
#!/bin/sh
#
# An example hook script to verify what is about to be committed.
# Called by "git commit" with no arguments.  The hook should
# exit with non-zero status after issuing an appropriate message if
# it wants to stop the commit.
#
# To enable this hook, rename this file to "pre-commit".

if git rev-parse --verify HEAD >/dev/null 2>&1
then
	against=HEAD
else
	# Initial commit: diff against an empty tree object
	against=$(git hash-object -t tree /dev/null)
fi

# If you want to allow non-ASCII filenames set this variable to true.
allownonascii=$(git config --type=bool hooks.allownonascii)

# Redirect output to stderr.
exec 1>&2

# Cross platform projects tend to avoid non-ASCII filenames; prevent
# them from being added to the repository. We exploit the fact that the
# printable range starts at the space character and ends with tilde.
if [ "$allownonascii" != "true" ] &&
	# Note that the use of brackets around a tr range is ok here, (it's
	# even required, for portability to Solaris 10's /usr/bin/tr), since
	# the square bracket bytes happen to fall in the designated range.
	test $(git diff-index --cached --name-only --diff-filter=A -z $against |
	  LC_ALL=C tr -d '[ -~]\0' | wc -c) != 0
then
	cat <<\EOF
Error: Attempt to add a non-ASCII file name.

This can cause problems if you want to work with people on other platforms.

To be portable it is advisable to rename the file.

If you know what you are doing you can disable this check using:

  git config hooks.allownonascii true
EOF
	exit 1
fi

# If there are whitespace errors, print the offending file names and fail.
exec git diff-index --check --cached $against --
```


**pre-merge-commit.sample**

```
#!/bin/sh
#
# An example hook script to verify what is about to be committed.
# Called by "git merge" with no arguments.  The hook should
# exit with non-zero status after issuing an appropriate message to
# stderr if it wants to stop the merge commit.
#
# To enable this hook, rename this file to "pre-merge-commit".

. git-sh-setup
test -x "$GIT_DIR/hooks/pre-commit" &&
        exec "$GIT_DIR/hooks/pre-commit"
:
```


**pre-push.sample**

```
#!/bin/sh

# An example hook script to verify what is about to be pushed.  Called by "git
# push" after it has checked the remote status, but before anything has been
# pushed.  If this script exits with a non-zero status nothing will be pushed.
#
# This hook is called with the following parameters:
#
# $1 -- Name of the remote to which the push is being done
# $2 -- URL to which the push is being done
#
# If pushing without using a named remote those arguments will be equal.
#
# Information about the commits which are being pushed is supplied as lines to
# the standard input in the form:
#
#   <local ref> <local oid> <remote ref> <remote oid>
#
# This sample shows how to prevent push of commits where the log message starts
# with "WIP" (work in progress).

remote="$1"
url="$2"

zero=$(git hash-object --stdin </dev/null | tr '[0-9a-f]' '0')

while read local_ref local_oid remote_ref remote_oid
do
	if test "$local_oid" = "$zero"
	then
		# Handle delete
		:
	else
		if test "$remote_oid" = "$zero"
		then
			# New branch, examine all commits
			range="$local_oid"
		else
			# Update to existing branch, examine new commits
			range="$remote_oid..$local_oid"
		fi

		# Check for WIP commit
		commit=$(git rev-list -n 1 --grep '^WIP' "$range")
		if test -n "$commit"
		then
			echo >&2 "Found WIP commit in $local_ref, not pushing"
			exit 1
		fi
	fi
done

exit 0
```


**pre-rebase.sample**

```
#!/bin/sh
#
# Copyright (c) 2006, 2008 Junio C Hamano
#
# The "pre-rebase" hook is run just before "git rebase" starts doing
# its job, and can prevent the command from running by exiting with
# non-zero status.
#
# The hook is called with the following parameters:
#
# $1 -- the upstream the series was forked from.
# $2 -- the branch being rebased (or empty when rebasing the current branch).
#
# This sample shows how to prevent topic branches that are already
# merged to 'next' branch from getting rebased, because allowing it
# would result in rebasing already published history.

publish=next
basebranch="$1"
if test "$#" = 2
then
	topic="refs/heads/$2"
else
	topic=`git symbolic-ref HEAD` ||
	exit 0 ;# we do not interrupt rebasing detached HEAD
fi

case "$topic" in
refs/heads/??/*)
	;;
*)
	exit 0 ;# we do not interrupt others.
	;;
esac

# Now we are dealing with a topic branch being rebased
# on top of master.  Is it OK to rebase it?

# Does the topic really exist?
git show-ref -q "$topic" || {
	echo >&2 "No such branch $topic"
	exit 1
}

# Is topic fully merged to master?
not_in_master=`git rev-list --pretty=oneline ^master "$topic"`
if test -z "$not_in_master"
then
	echo >&2 "$topic is fully merged to master; better remove it."
	exit 1 ;# we could allow it, but there is no point.
fi

# Is topic ever merged to next?  If so you should not be rebasing it.
only_next_1=`git rev-list ^master "^$topic" ${publish} | sort`
only_next_2=`git rev-list ^master           ${publish} | sort`
if test "$only_next_1" = "$only_next_2"
then
	not_in_topic=`git rev-list "^$topic" master`
	if test -z "$not_in_topic"
	then
		echo >&2 "$topic is already up to date with master"
		exit 1 ;# we could allow it, but there is no point.
	else
		exit 0
	fi
else
	not_in_next=`git rev-list --pretty=oneline ^${publish} "$topic"`
	/usr/bin/perl -e '
		my $topic = $ARGV[0];
		my $msg = "* $topic has commits already merged to public branch:\n";
		my (%not_in_next) = map {
			/^([0-9a-f]+) /;
			($1 => 1);
		} split(/\n/, $ARGV[1]);
		for my $elem (map {
				/^([0-9a-f]+) (.*)$/;
				[$1 => $2];
			} split(/\n/, $ARGV[2])) {
			if (!exists $not_in_next{$elem->[0]}) {
				if ($msg) {
					print STDERR $msg;
					undef $msg;
				}
				print STDERR " $elem->[1]\n";
			}
		}
	' "$topic" "$not_in_next" "$not_in_master"
	exit 1
fi

<<\DOC_END

This sample hook safeguards topic branches that have been
published from being rewound.

The workflow assumed here is:

 * Once a topic branch forks from "master", "master" is never
   merged into it again (either directly or indirectly).

 * Once a topic branch is fully cooked and merged into "master",
   it is deleted.  If you need to build on top of it to correct
   earlier mistakes, a new topic branch is created by forking at
   the tip of the "master".  This is not strictly necessary, but
   it makes it easier to keep your history simple.

 * Whenever you need to test or publish your changes to topic
   branches, merge them into "next" branch.

The script, being an example, hardcodes the publish branch name
to be "next", but it is trivial to make it configurable via
$GIT_DIR/config mechanism.

With this workflow, you would want to know:

(1) ... if a topic branch has ever been merged to "next".  Young
    topic branches can have stupid mistakes you would rather
    clean up before publishing, and things that have not been
    merged into other branches can be easily rebased without
    affecting other people.  But once it is published, you would
    not want to rewind it.

(2) ... if a topic branch has been fully merged to "master".
    Then you can delete it.  More importantly, you should not
    build on top of it -- other people may already want to
    change things related to the topic as patches against your
    "master", so if you need further changes, it is better to
    fork the topic (perhaps with the same name) afresh from the
    tip of "master".

Let's look at this example:

		   o---o---o---o---o---o---o---o---o---o "next"
		  /       /           /           /
		 /   a---a---b A     /           /
		/   /               /           /
	       /   /   c---c---c---c B         /
	      /   /   /             \         /
	     /   /   /   b---b C     \       /
	    /   /   /   /             \     /
    ---o---o---o---o---o---o---o---o---o---o---o "master"


A, B and C are topic branches.

 * A has one fix since it was merged up to "next".

 * B has finished.  It has been fully merged up to "master" and "next",
   and is ready to be deleted.

 * C has not merged to "next" at all.

We would want to allow C to be rebased, refuse A, and encourage
B to be deleted.

To compute (1):

	git rev-list ^master ^topic next
	git rev-list ^master        next

	if these match, topic has not merged in next at all.

To compute (2):

	git rev-list master..topic

	if this is empty, it is fully merged to "master".

DOC_END
```


**pre-receive.sample**

```
#!/bin/sh
#
# An example hook script to make use of push options.
# The example simply echoes all push options that start with 'echoback='
# and rejects all pushes when the "reject" push option is used.
#
# To enable this hook, rename this file to "pre-receive".

if test -n "$GIT_PUSH_OPTION_COUNT"
then
	i=0
	while test "$i" -lt "$GIT_PUSH_OPTION_COUNT"
	do
		eval "value=\$GIT_PUSH_OPTION_$i"
		case "$value" in
		echoback=*)
			echo "echo from the pre-receive-hook: ${value#*=}" >&2
			;;
		reject)
			exit 1
		esac
		i=$((i + 1))
	done
fi
```


**prepare-commit-msg.sample**

```
#!/bin/sh
#
# An example hook script to prepare the commit log message.
# Called by "git commit" with the name of the file that has the
# commit message, followed by the description of the commit
# message's source.  The hook's purpose is to edit the commit
# message file.  If the hook fails with a non-zero status,
# the commit is aborted.
#
# To enable this hook, rename this file to "prepare-commit-msg".

# This hook includes three examples. The first one removes the
# "# Please enter the commit message..." help message.
#
# The second includes the output of "git diff --name-status -r"
# into the message, just before the "git status" output.  It is
# commented because it doesn't cope with --amend or with squashed
# commits.
#
# The third example adds a Signed-off-by line to the message, that can
# still be edited.  This is rarely a good idea.

COMMIT_MSG_FILE=$1
COMMIT_SOURCE=$2
SHA1=$3

/usr/bin/perl -i.bak -ne 'print unless(m/^. Please enter the commit message/..m/^#$/)' "$COMMIT_MSG_FILE"

# case "$COMMIT_SOURCE,$SHA1" in
#  ,|template,)
#    /usr/bin/perl -i.bak -pe '
#       print "\n" . `git diff --cached --name-status -r`
# 	 if /^#/ && $first++ == 0' "$COMMIT_MSG_FILE" ;;
#  *) ;;
# esac

# SOB=$(git var GIT_COMMITTER_IDENT | sed -n 's/^\(.*>\).*$/Signed-off-by: \1/p')
# git interpret-trailers --in-place --trailer "$SOB" "$COMMIT_MSG_FILE"
# if test -z "$COMMIT_SOURCE"
# then
#   /usr/bin/perl -i.bak -pe 'print "\n" if !$first_line++' "$COMMIT_MSG_FILE"
# fi
```


**push-to-checkout.sample**

```
#!/bin/sh

# An example hook script to update a checked-out tree on a git push.
#
# This hook is invoked by git-receive-pack(1) when it reacts to git
# push and updates reference(s) in its repository, and when the push
# tries to update the branch that is currently checked out and the
# receive.denyCurrentBranch configuration variable is set to
# updateInstead.
#
# By default, such a push is refused if the working tree and the index
# of the remote repository has any difference from the currently
# checked out commit; when both the working tree and the index match
# the current commit, they are updated to match the newly pushed tip
# of the branch. This hook is to be used to override the default
# behaviour; however the code below reimplements the default behaviour
# as a starting point for convenient modification.
#
# The hook receives the commit with which the tip of the current
# branch is going to be updated:
commit=$1

# It can exit with a non-zero status to refuse the push (when it does
# so, it must not modify the index or the working tree).
die () {
	echo >&2 "$*"
	exit 1
}

# Or it can make any necessary changes to the working tree and to the
# index to bring them to the desired state when the tip of the current
# branch is updated to the new commit, and exit with a zero status.
#
# For example, the hook can simply run git read-tree -u -m HEAD "$1"
# in order to emulate git fetch that is run in the reverse direction
# with git push, as the two-tree form of git read-tree -u -m is
# essentially the same as git switch or git checkout that switches
# branches while keeping the local changes in the working tree that do
# not interfere with the difference between the branches.

# The below is a more-or-less exact translation to shell of the C code
# for the default behaviour for git's push-to-checkout hook defined in
# the push_to_deploy() function in builtin/receive-pack.c.
#
# Note that the hook will be executed from the repository directory,
# not from the working tree, so if you want to perform operations on
# the working tree, you will have to adapt your code accordingly, e.g.
# by adding "cd .." or using relative paths.

if ! git update-index -q --ignore-submodules --refresh
then
	die "Up-to-date check failed"
fi

if ! git diff-files --quiet --ignore-submodules --
then
	die "Working directory has unstaged changes"
fi

# This is a rough translation of:
#
#   head_has_history() ? "HEAD" : EMPTY_TREE_SHA1_HEX
if git cat-file -e HEAD 2>/dev/null
then
	head=HEAD
else
	head=$(git hash-object -t tree --stdin </dev/null)
fi

if ! git diff-index --quiet --cached --ignore-submodules $head --
then
	die "Working directory has staged changes"
fi

if ! git read-tree -u -m "$commit"
then
	die "Could not update working tree to new HEAD"
fi
```


**sendemail-validate.sample**

```
#!/bin/sh

# An example hook script to validate a patch (and/or patch series) before
# sending it via email.
#
# The hook should exit with non-zero status after issuing an appropriate
# message if it wants to prevent the email(s) from being sent.
#
# To enable this hook, rename this file to "sendemail-validate".
#
# By default, it will only check that the patch(es) can be applied on top of
# the default upstream branch without conflicts in a secondary worktree. After
# validation (successful or not) of the last patch of a series, the worktree
# will be deleted.
#
# The following config variables can be set to change the default remote and
# remote ref that are used to apply the patches against:
#
#   sendemail.validateRemote (default: origin)
#   sendemail.validateRemoteRef (default: HEAD)
#
# Replace the TODO placeholders with appropriate checks according to your
# needs.

validate_cover_letter () {
	file="$1"
	# TODO: Replace with appropriate checks (e.g. spell checking).
	true
}

validate_patch () {
	file="$1"
	# Ensure that the patch applies without conflicts.
	git am -3 "$file" || return
	# TODO: Replace with appropriate checks for this patch
	# (e.g. checkpatch.pl).
	true
}

validate_series () {
	# TODO: Replace with appropriate checks for the whole series
	# (e.g. quick build, coding style checks, etc.).
	true
}

# main -------------------------------------------------------------------------

if test "$GIT_SENDEMAIL_FILE_COUNTER" = 1
then
	remote=$(git config --default origin --get sendemail.validateRemote) &&
	ref=$(git config --default HEAD --get sendemail.validateRemoteRef) &&
	worktree=$(mktemp --tmpdir -d sendemail-validate.XXXXXXX) &&
	git worktree add -fd --checkout "$worktree" "refs/remotes/$remote/$ref" &&
	git config --replace-all sendemail.validateWorktree "$worktree"
else
	worktree=$(git config --get sendemail.validateWorktree)
fi || {
	echo "sendemail-validate: error: failed to prepare worktree" >&2
	exit 1
}

unset GIT_DIR GIT_WORK_TREE
cd "$worktree" &&

if grep -q "^diff --git " "$1"
then
	validate_patch "$1"
else
	validate_cover_letter "$1"
fi &&

if test "$GIT_SENDEMAIL_FILE_COUNTER" = "$GIT_SENDEMAIL_FILE_TOTAL"
then
	git config --unset-all sendemail.validateWorktree &&
	trap 'git worktree remove -ff "$worktree"' EXIT &&
	validate_series
fi
```


**update.sample**

```
#!/bin/sh
#
# An example hook script to block unannotated tags from entering.
# Called by "git receive-pack" with arguments: refname sha1-old sha1-new
#
# To enable this hook, rename this file to "update".
#
# Config
# ------
# hooks.allowunannotated
#   This boolean sets whether unannotated tags will be allowed into the
#   repository.  By default they won't be.
# hooks.allowdeletetag
#   This boolean sets whether deleting tags will be allowed in the
#   repository.  By default they won't be.
# hooks.allowmodifytag
#   This boolean sets whether a tag may be modified after creation. By default
#   it won't be.
# hooks.allowdeletebranch
#   This boolean sets whether deleting branches will be allowed in the
#   repository.  By default they won't be.
# hooks.denycreatebranch
#   This boolean sets whether remotely creating branches will be denied
#   in the repository.  By default this is allowed.
#

# --- Command line
refname="$1"
oldrev="$2"
newrev="$3"

# --- Safety check
if [ -z "$GIT_DIR" ]; then
	echo "Don't run this script from the command line." >&2
	echo " (if you want, you could supply GIT_DIR then run" >&2
	echo "  $0 <ref> <oldrev> <newrev>)" >&2
	exit 1
fi

if [ -z "$refname" -o -z "$oldrev" -o -z "$newrev" ]; then
	echo "usage: $0 <ref> <oldrev> <newrev>" >&2
	exit 1
fi

# --- Config
allowunannotated=$(git config --type=bool hooks.allowunannotated)
allowdeletebranch=$(git config --type=bool hooks.allowdeletebranch)
denycreatebranch=$(git config --type=bool hooks.denycreatebranch)
allowdeletetag=$(git config --type=bool hooks.allowdeletetag)
allowmodifytag=$(git config --type=bool hooks.allowmodifytag)

# check for no description
projectdesc=$(sed -e '1q' "$GIT_DIR/description")
case "$projectdesc" in
"Unnamed repository"* | "")
	echo "*** Project description file hasn't been set" >&2
	exit 1
	;;
esac

# --- Check types
# if $newrev is 0000...0000, it's a commit to delete a ref.
zero=$(git hash-object --stdin </dev/null | tr '[0-9a-f]' '0')
if [ "$newrev" = "$zero" ]; then
	newrev_type=delete
else
	newrev_type=$(git cat-file -t $newrev)
fi

case "$refname","$newrev_type" in
	refs/tags/*,commit)
		# un-annotated tag
		short_refname=${refname##refs/tags/}
		if [ "$allowunannotated" != "true" ]; then
			echo "*** The un-annotated tag, $short_refname, is not allowed in this repository" >&2
			echo "*** Use 'git tag [ -a | -s ]' for tags you want to propagate." >&2
			exit 1
		fi
		;;
	refs/tags/*,delete)
		# delete tag
		if [ "$allowdeletetag" != "true" ]; then
			echo "*** Deleting a tag is not allowed in this repository" >&2
			exit 1
		fi
		;;
	refs/tags/*,tag)
		# annotated tag
		if [ "$allowmodifytag" != "true" ] && git rev-parse $refname > /dev/null 2>&1
		then
			echo "*** Tag '$refname' already exists." >&2
			echo "*** Modifying a tag is not allowed in this repository." >&2
			exit 1
		fi
		;;
	refs/heads/*,commit)
		# branch
		if [ "$oldrev" = "$zero" -a "$denycreatebranch" = "true" ]; then
			echo "*** Creating a branch is not allowed in this repository" >&2
			exit 1
		fi
		;;
	refs/heads/*,delete)
		# delete branch
		if [ "$allowdeletebranch" != "true" ]; then
			echo "*** Deleting a branch is not allowed in this repository" >&2
			exit 1
		fi
		;;
	refs/remotes/*,commit)
		# tracking branch
		;;
	refs/remotes/*,delete)
		# delete tracking branch
		if [ "$allowdeletebranch" != "true" ]; then
			echo "*** Deleting a tracking branch is not allowed in this repository" >&2
			exit 1
		fi
		;;
	*)
		# Anything else (is there anything else?)
		echo "*** Update hook: unknown type of update to ref $refname of type $newrev_type" >&2
		exit 1
		;;
esac

# --- Finished
exit 0
```


**index**

```
DIRC      xh(	ذh(	Ij|                    &5Sr{@ˊ/ Lab 1/1 NoIsPostiveOrNot.c        h(
5Љh(
"s                    Q;kw
7r5" Lab 1/2 MaxOfThree.c      h(
p?h(
`                     
i2QJ)F`f Lab 1/3 GetDay.c  h(
h(T                    #MͽNJ# Lab 1/4 Print1ToN.c       h(+)h([lG                    em$XW
h#p::3F Lab 1/5 PrimeOrNot.c      h(qh(/~(                    Q܂HK)ZDn Lab 1/6 CheckPalindrome.c h(	h(
V
N                    !L7|<_x~ Lab 1/7 CheckArmstrong.c  h1U,+<
h1U2)VS                     Yr^ )SiR Lab 10/ArrayInputOutput.java      h1U?nxh1UF                     ||%WfY Lab 10/CountEvenOdd.java  h1Uf
Zxh1Uk                    '[Inxx#R, Lab 10/MatrixAddition.java        h1UT8X h1UY9x|                    %_6FIa#|{)[F'  Lab 10/MatrixInputOutput.java     h1Uw7`$h1U}<W                    kH$ӳB  Lab 10/MatrixMultiplication.java  h1U5<h1UEZ                    +\cyP5s6\@ Lab 10/RemoveDuplicates.java      h1U%Mh1\                     <*@4! ^Ur Lab 10/SecondMinMax.java  h1Zh1ZL	                    iW|q<hɌ
: Lab 11/BinarySearch.java  h1Z
Hh1Z3.@                    L2DD_D<z  Lab 11/LinearSearch.java  h1Z
%)@h1[#
َ                    ǘ
qɫQ]P_ Lab 11/SortArray.java     h1]4`Uh1]4                    mqvGa_ao Lab 12/BankAccountDetails.java    h1]%FPh1]                    ֆĎѕn@14
D;Рl Lab 12/CandidatDetails.java       h1]yrvh1]4vd                    WS$77M7})H< Lab 12/StudentDetails.java        h1^f$U8h1^jkp                    FAL3}v Lab 13/CircleTest.java    h1^F9Th1^MH                    y۔ҳp~VT-a Lab 13/EmployeeTest.java  h1^R.Xh1^Z:                    d?h0W2O>߫ Lab 13/StudentTest.java   h1^y(h1^4                    X5";Oip@c|) Lab 14/EvenLengthWords.java       h1^'	h1^#!                    ,5Ov Lab 14/PalindromeCheck.java       h1^h1^%_|                    V+IlU*AsI/ Lab 14/StringBufferTest.java      h1^2-h1^3T                    B^(zt1Y?HZɍj6 Lab 14/StringFunctionsTest.java   h1_5Jh1_(ƀ                    lTP}}ٗ=*  Lab 15/ArmstrongNumber.java       h1_
+ƌh1_8                    w'B2)F+ Lab 15/LargestOfThree.java        h1_!h1_T                    "4ax%  Lab 15/MathFunctionsTest.java     h1_\bF`h1_^!꿘                    C	(w)`)gB Lab 16/AnonymousInnerClass.java   h1_O*T/Hh1_Sδ                    <H ӈ3ijv۶ Lab 16/OuterClass.java    h1_F&dh1_I8                     ^ȺgnϘ]zV7lp Lab 16/WrapperExample.java        h1`l$h1aG]d                    k(>jE Lab 17/AreaCalculator.java        h1`"K(h1a_5޴                    /*s٨Wg|C Lab 17/Book.java  h1as:h1a'|                    ?Ȱ@ b9qyb[ Lab 17/Employee.java      h1`/_\h1a68OH                    UW^蜿XTo/W Lab 17/Student.java       h1a5]h1az5<                    o>
: ԏ>tAP Lab 18/StaticBlockExample.java    h1a"Uh1a/id                    /[vuJ/Jtd[ Lab 18/StaticExample.java h1a	th1a2t                    !넆7zLQ:Ӻk Lab 18/ThisExample.java   h1a#hh1a#                    oe8BI& Lab 18/ThisStaticCheck.java       h1bD
QTh1bc                    :Ē+mv̰/ÅN Lab 19/InheritanceDemo.java       h1b8h1b6                    Qٝ)aj|Kyx/ Lab 19/InterestDemo.java  h1b;[h1b5d                    ]>nn Lab 19/ShapeAreaDemo.java h(
<h(
#&                    ܛWd,.X} Lab 2/1 ReadnNoAndPrint.c h(wh(_Z0                    Z,,ƙ7:K Lab 2/2 Sum&Avg.c h({,h1D'
k|                    f#y^@2d
8Q- Lab 2/3 Multiply2Matrics.c        h(	¬h1EJX                    =583Iaw~? Lab 2/4 LengthOfString.c  h( ʘh(IŤ                    1҉`&uRs. Lab 2/5 Max&Min.c h1G
|h1G
|                    BvUo[Y?ᾓ^"[J Lab 2/6 CopyString.c      h1cN۸h1c;                    q4-]vX Lab 20/FinalKeywordDemo.java      h1ch1cL                    dj`HI
l/DW Lab 20/MemberDemo.java    h1c6"h1c;5R`                    o^rrVx!  Lab 20/MethodOverridingDemo.java  h1cBDph1cG                     ^![vrV  Lab 20/SuperKeywordDemo.java      h1cXh1c T                    Y(rZ{n"5 Lab 21/AbstractShapeDemo.java     h1d"J h1d[<                    ptkk[6wQC Lab 21/VegetableDemo.java h1f4ohh1fX                    l_r`HUrJA #Lab 22/MultipleInheritanceDemo.java       h1g5h1gT(                    A5_Icŵki=6g Lab 22/PublicationDemo.java       h1f8>!|h1f                    ۏl5o*s Lab 22/TransportDemo.java h6;h6fh                    )7C4^yἝR/u Lab 24/BankAccountDemo.java       h608h6H                    6~@4=kfM Lab 24/CustomExceptionDemo.java   h63Ph6?                    ?bV;	g Lab 24/CustomValidation.java      h6$HXh6                    2䪫Uj, !Lab 24/MultipleExceptionDemo.java h6 Y(h6 P                    JУ v"UؤTj  Lab 24/ThrowThrowsDemo.java       h6#Xh6;I                    U5_VGrNG,ju-V] Lab 24/TryCatchFinallyDemo.java   h67
w\h688                    )	'ǈDxAq Lab 25/CopyFileDemo.java  h6HSh6I.                     | +u=3Aw1 Lab 25/CopyToMultiple.java        h63h61                    C$bGz^>HaCl: Lab 25/CreateFileDemo.java        h6@%h6A;1(                    oЄ;Tj5>h6 Lab 25/MergeFiles.java    h6Hh6W                    sLhsjdP$8 $Lab 26/BufferedReaderWriterDemo.java      h6Bh61sTH                    +9`'#TH40A Lab 26/BufferedStreamDemo.java    h6~7e@h6ǃH                    1oG#P^l$L$ȧa= Lab 26/FileIOStreamDemo.java      h1Gd>h1H!Kq                    `jdaδ>La; Lab 3/Address.java        h1H\
3h1HyB2                     m,ce=.c"Ub Lab 3/CircleArea.java     h1H	h1HXH                    %4v0AӼ+>ߒL Lab 3/SimpleInterest.java h1GVyh1G]
y                      !MUO, Lab 3/Welcome.java        h1IQ	*h1Iw9O                    +^kIUnYE1i* Lab 4/Addition.java       h1I	$h1Iศ                    zt<=^sـ nx Lab 4/BMI.java    h1I
N<h1IT                    'X?½Dcj Lab 4/FahrenheitToCelsius.java    h1I.ٸh1I%                    +*Oǆd^R`U Lab 4/MetersToFeet.java   h1Kb1h1Kg"g`                    /S޸qqbC Lab 5/BitwiseOperator.java        h1K@Hh1KD                    ];8J':높8 Lab 5/MaxOfThree.java     h1Ku 
h1KxG                    ʉ2
לh Lab 5/OddOrEven.java      h1K.$h1K3
                    +;?tAM Lab 5/PositiveOrNegative.java     h1KT/^h1KW                    VfHFC
nqqU Lab 5/TypeCasting.java    h1K
0Lh1K$z                    F;[rذG^! Lab 6/GradeCalculator.java        h1K	tAh1LK<                    OAq7F* Lab 6/LargestNumber.java  h1L	+Uh1L
\<                    `лQwէZz^-+? Lab 6/LeapYear.java       h1K(h1K,<                    B/aԟ;vNP Lab 6/SimpleCalculator.java       h1K.h1K~P                    G\c3[E~246 Lab 6/VowelOrConsonant.java       h1L-ch1L{                    AE(s
U0fG7 Lab 7/Factorial.java      h1L$h1MK                    
el^DlvRg Lab 7/Pattern1.java       h1M,6ƌh1M5,                    0u=np_iCAh Lab 7/Pattern2.java       h1M>t4h1MPqq                    O+.>)?* Lab 7/Pattern3.java       h1M=G$h1MWNpD                    >g{V	ꯛ Ç Lab 7/Pattern4.java       h1L"h1L,                    %p>U*0Oz{_ Lab 7/PrimeCheck.java     h1Lkmh1Lx                    _,.L2j_] Lab 7/PrintNumbers1to10.java      h1L 'h1L                    YpkM_~pYu Lab 7/ReverseNumber.java  h1L3Dh1L^3                    3@{ Lab 7/SumOfNNumbers.java  h1N8/zh1NC)@                     k*NZug+	 \wJ Lab 8/BreakAtFive.java    h1NHh1N;                    9'?̡:"U "Lab 8/BreakOnDivisibleBySeven.java        h1NR*ɼ@h1NW.q                     pLR6Nm+m/uT Lab 8/ContinueAtFive.java h1N~-尴h1NN(                     à";j4v( !Lab 8/ContinueAtFiveAndEight.java h1O *Wh1O!                    }|7(?KmGwm Lab 9/FactorialRecursion.java     h1Oj݈h1Oj                    9&)9es"Ntو"` Lab 9/FibonacciSeries.java        h1OCnh1].6ݸL                    AQ#ͬ)tdBk# Lab 9/MaxOfThreeMethod.java       h1Oh1O!b                    i\,<- Lab 9/PrimeCheckMethod.java       h1O.Qh1O3D                    *Z	fr9" Lab 9/SimpleInterestMethod.java   h6gh6 [L                     UM$=>͓gk(| Lab_23/Q1/AccessDemo.java h6,h61l                     V|~ Lab_23/Q1/pkg1/Base.java  h62aVh6*ŭ                    Py. 8d7P컃{R Lab_23/Q1/pkg2/Derived.java       h6 Ώ@h6VU                    Dx%
 r#r \ Lab_23/Q2/Exam/Result.java        h6\8`h6                     !N*c ( Lab_23/Q2/MarksheetDemo.java      h6h6'e                     |ީN;~E6 Lab_23/Q2/Student/Student.java    h69Lh6;                    0E7y"v:(S 'Lab_23/Q3/Calculater/MathOperation.java   h6 !h6\!2                    6tlIg Lab_23/Q3/DemoOperation.java      h6_<h6e                     1'KTS/ Lab_23/Q4/Pkg1/A.java     h643 h6[m                      z!V̃Ӹ Lab_23/Q4/Pkg2/B.java     h6f/8h6%-`                     (nf}zw! Lab_23/Q4/Pkg3/C.java     h6	h6$Ǯt                    j"̉3ec" !Lab_23/Q4/Pkg4/ProtectedDemo.java TREE   120 26
!t3|^]aVWLab 1 7 0
CH
:kD79Lab 2 6 0
?]V
 T0ݪLab 3 4 0
VV});.eA1/pAkLab 4 4 0
b0:m:ٝhxLab 5 5 0
pXtg-ͯB1G粇Lab 6 5 0
Fɛ^51m5ۙLab 7 9 0
ؓyK!CvLab 8 4 0
 ySK7#Lab 9 5 0
',e9)CWDy
u>Lab 10 7 0
2fy6'Q#ZYxGJLab 11 3 0
Æ~v|OLab 12 3 0
ʝpY֪͗Lab 13 3 0
a,W:'`*Ը`Lab 14 4 0
d<"?}iHjLab 15 3 0
߷ו,/n^򠸸B
Lab 16 3 0
8H8^%w-j&1Lab 17 4 0
gĆ_Z|/Lab 18 4 0
rr>gif'
@.Lab 19 3 0
&fԖ)ҽW7Lab 20 4 0
z cF8乢+Lab 21 2 0
Itjp834~Lab 22 3 0
ǒvYֹLab 24 6 0
gJkPėf燐_YoLab 25 4 0
G*◥AG)RLab 26 3 0
FĒ@JIU/{Lab_23 12 4
C#+FguHޮ<VQ1 3 2
k
5>'yQ&pkg1 1 0
}hMC	Ҧpkg2 1 0
QeG@ܜ'ۊ;D&Q2 3 2
􂆜5>Pf![O]nExam 1 0
(pȪJcStudent 1 0
dD7X	TJ˶1Q3 2 1
"R3PNsCalculater 1 0
Fbt?!1I/Q4 4 4
2&sb0ғ6kiPkg1 1 0
fL DPkg2 1 0
͟]MpHTRPkg3 1 0
2j<<z̡{s&THPkg4 1 0
OUR|xJB
#j.
EQy	w1¯b
```


## info


**exclude**

```
# git ls-files --others --exclude-from=.git/info/exclude
# Lines that start with '#' are comments.
# For a project mostly in C, the following would be a good set of
# exclude patterns (uncomment them if you want to use them):
# *.[oa]
# *~
```


## logs


**HEAD**

```
0000000000000000000000000000000000000000 1f1ca7cac8fc8aa8c9ee8c815a18ae51c75a1e0e Shreyansh284 <shreyanshranpariya@gmail.com> 1748250884 +0530	commit (initial): First 21 Lab Performed
1f1ca7cac8fc8aa8c9ee8c815a18ae51c75a1e0e 0000000000000000000000000000000000000000 Shreyansh284 <shreyanshranpariya@gmail.com> 1748251224 +0530	Branch: renamed refs/heads/master to refs/heads/main
0000000000000000000000000000000000000000 1f1ca7cac8fc8aa8c9ee8c815a18ae51c75a1e0e Shreyansh284 <shreyanshranpariya@gmail.com> 1748251224 +0530	Branch: renamed refs/heads/master to refs/heads/main
1f1ca7cac8fc8aa8c9ee8c815a18ae51c75a1e0e 31239224d312fed650cb0977609fad00f41144db Shreyansh284 <shreyanshranpariya@gmail.com> 1748409766 +0530	commit: Lab 23-24-25-26 Added
```


### refs


#### heads


**main**

```
0000000000000000000000000000000000000000 1f1ca7cac8fc8aa8c9ee8c815a18ae51c75a1e0e Shreyansh284 <shreyanshranpariya@gmail.com> 1748250884 +0530	commit (initial): First 21 Lab Performed
1f1ca7cac8fc8aa8c9ee8c815a18ae51c75a1e0e 1f1ca7cac8fc8aa8c9ee8c815a18ae51c75a1e0e Shreyansh284 <shreyanshranpariya@gmail.com> 1748251224 +0530	Branch: renamed refs/heads/master to refs/heads/main
1f1ca7cac8fc8aa8c9ee8c815a18ae51c75a1e0e 31239224d312fed650cb0977609fad00f41144db Shreyansh284 <shreyanshranpariya@gmail.com> 1748409766 +0530	commit: Lab 23-24-25-26 Added
```


#### remotes


##### origin


**main**

```
0000000000000000000000000000000000000000 1f1ca7cac8fc8aa8c9ee8c815a18ae51c75a1e0e Shreyansh284 <shreyanshranpariya@gmail.com> 1748251277 +0530	update by push
1f1ca7cac8fc8aa8c9ee8c815a18ae51c75a1e0e 31239224d312fed650cb0977609fad00f41144db Shreyansh284 <shreyanshranpariya@gmail.com> 1748409773 +0530	update by push
```


## objects


### 04


**ac7a743cad923d5e73b7d9802017a76edf78ea**

```
xN07LIbA,uʈJ9( wǉT)w
Ti4BcЀq:x>xR9zXCdRzh&SC2B0d/KA߁m6<S-~:D>E_\H/ߚL-T^C\-)iD"_U߃\zn7k~dbG2
n8*}D
```


### 05


**b1c1ab97f3d767b1c486d15f5a977c2faca9d3**

```
x+)JMU043e040031Qp,JMtNI.I,/J,Kd'GvuHu@;gC6?5
5s\sr+SS!
OlpPH,\{.Oy
KJSRJ ~N7Ŝ"#Bog B
```


### 09


**28b3f37729929091be600c97d22967421cb3bf**

```
xM10+NR'qr(I[J4\7iC
}=゜孃Vq"\Xmdd<v:(F/l6n:@qYEsqVp U-9f{#p?Lm(U3um2KkiR,a Rb	y\*
```


### 0e


**21fb4cdf370c977c3c0e5f788e7ea0b3c00789**

```
x}1O0+EE)ڰ6HZJΕn/|j
ՍuWWNOYjߊht|DaRMoQQsPy9tB^;(W=b4nj㖃Gyv,T1{5FkbSz
}a(Pqmn6ë^5{~'=pmRrğ,엓Dq'sʘ];C	i퍥wa]qsb!iryZ8lٵwN?hXn:+z(XHwx`!]
```


### 0f


**09fc27d50c97c78897bb44789b419571f37fff**

```
xm1O0+LKX:A^$ΗL;o>w+홫[O_fgb$mW΂LUλ
5j!;i$& `	
JȢ=]D;9~<Tj>04/%mI4RYK.p@uՊk;֭`C`gd#T3Gz~]-|8:/R5*]y.u!Bט5+
```


### 13


**7aeee505bb2107b3d156f2b17fcc8313e8d3b8**

```
xu?0G)nFp1L8;hL\OHCM{ị
{/u([l4\P<ߎ6EŘ^5EWjx3Xnţ3
+Iw
}0=>C^?3jtR!%g6L
```


### 14


**64c54437c3580f09544ab5cbb6a00b31aaa5af**

```
x+)JMU01`040031Q.)MI+J,Kd+ۑ~?Msp eH
```


### 16


**0580efc72f2a9b73d9a817ef576703187c439d**

```
xm ENtiӺhK\Ԧ!Rhʫ1wA#y\jvpd/epk*%ȥ='jfGȽ<
c={̳BM4&MzTԧӯ.ڕ|YǄ
5qbWXu<49;KBS[2fx"/6.Lfm=
```


**b8f99f9800219183f318e0ef4d85554f9c2cf7**

```
xKOR042f((MLVHI,.VOIMUR TqIb	PEY~fBnbfFpIQf^ztBbQz&T1HCpeqIj^~i^PIINȒ|ĲD%Mkٵ\\ ;u)
```


### 18


**02d893790bfc0c804bb721154376afb694b5b9**

```
x+)JMU04d040031QpKL./LJ,KdZ<Yl
CU$BJ9r.'nK΄A<GE0*4(4(}o0G^ٛ39;f@UhQ]	vk޲o)Bi˯Wˇ*)jlӮe:g&gCL;:ksoPWWZTlXoh Rg|Ȳ;#(6`liߦ=
"..OZ Q-[fMcuh=v k
```


**3f1b81a16256bf043b1287170967a8d61ec4f1**

```
x}OO@=)&$6&xK/Bt#,dwhm
Z۽vI^&pyquRISHsՎUzH<iq1egP(m)YmwP6sa'6.`":/-tqh'*Td	Ѵ'C*e&`TsFώ9C-l+xLlZ>Szs!pÄ@v:5Kn{`9PoVfcPfj/-*B˽PD'2D
t)=U0l'?@6eH05+6?*gfx
Vd
```


### 1a


**326679a13627fbc751235ab15978bfe047144a**

```
x+)JMU06`040031Qp,*J+(-/-zYeE~bܔp?P
y%ey))Okk|Nm?k	UXRYᘒYQybysv$E9k⏛ջu{&*״Wӌv{s>Ҝ̂D5g7xx?	jMPjn~YK)DGj1]{69\ݴ,g:ߠSR|3|+ h_`L`^E"b !Ջi
```


**a44503932807730dd41d559effd130e2664737**

```
x]M0=W1*իG4[e$dZ]MJV\31
|nz8-2RGV| t 7tHk	ė`eBno]Di;Cfp5Ȣ߶'OYH<}Tׯ=,^큞]ALn:%RYq
```


### 1c


**36cac41d7ecb40343d6bd2f00fe484664d029c**

```
xU=O0+^ercةlqOĎ|g4'{?7xz~y0fa_b]܉S QG	ֵYTa%HA}]'b.165Xv7wcX$mݦZ%LbApt\~t[京VtPY^E\BCcBzʝm'([ZF~ yv
```


### 1e


**1369d9035c912cea3c0896c8e2b119c8dcfa2d**

```
xm?O0ř)NU
-B&&RFnkpΑ}) 8Pxݻ5Lwu(ʁ))h	N|St[`Nf<	
-tB#oi?>p{_d86dyj@:ݓJE# enS~0;suy;2)DT%-MK%9z:yHO#`:ypθx!e@"\ry*V#]êrm=
>g
```


**a7d7c19333b49a961e0540837b1dc6cac1b8a1**

```
x1O0+nt))tEb)C	nʾDw.i/'ݽն]z>"2ڢj4eu@cuPEn𝁼$Yti$UG:J!42߆W 1y#1BSgb%8Dzζ4EK)KjE6${eCj#|-qc,AfKyT	
͔OC~ %
```


### 1f


**1ca7cac8fc8aa8c9ee8c815a18ae51c75a1e0e**

```
xA E]s
&h)Cb+W.L<3Eo/OJΩJ2vF9cV`cBsav\@//1o1-PEj׃
yTSM^qKZqX8$E
```


### 21


**0fe05b76b00872c956000682fa0ef40e8c9de3**

```
xKK@]W\JZ\"d).&!GGkweB5ν眯gfHk@?7a9v[TuxY7kCx#i&fʴKH1FnÞs\wtꉡ֥I끲ȷ!bX[,ϵ6p6#L1Q@!S8YvJk@moE
zP½#CaOaL="EQHu:ٞQ7NT2a4 GTTq@_ԨsfS=mANdz'8K~	G>?/x@
```


**a4d774fa337cfd5e86fb5d8d96618c8956e657**

```
x+)JMU0d01 $C3Nz*ۥz=2HRFiTYCه6,|EY^/1qjn+>>͛=;}M$tٶY'̓њreG$&)6J^v-Z YH
LoTy>-رc39[Z5Cps֍WO|=}㑶Qk׬aƢEvx6!)dxxjiWi.wlFOľ^ƻawW-G7`W0I':,'}zs6C76,*h8nuǑ14gu3|^vZk;;0{ue`>2=u#%2]4Yݛ5d	BR`v$k^;{nx(T_2cZMzL;wnAț0|Xdз\mo=%!oP4gg;?΃rL&kL9Ӎɕx+:6eNS
[W{O}lVyuV%:S-5÷Tr	>,]h'	72fpdRӣ}_لM  0L
```


### 22


**f1bfaf34a1dd05b882d661aa78cd258b00f58f**

```
x̻@akb%A"cogX.&^bxwWS/5J*$n0+4thۄ%;{CUC'[e	m)P<.ƁF|qNEnX>Nt{4e}"p(l>kDpeIb17/
```


### 23


**d8795e808840ea3285640dc638ad8d512da1b1**

```
xSn0왯ئJD@NU\zM9yؑ1j*5"֒e`ٙYo <}xbfeP!Wb\ANc.<ہ{$eݦJ[.HHVqۣw"	R|@xTde1VmA-(8q8r`+LWG<'tFFlS1ATy)v%	\(8`A?yC^(#UJsr"ʢ<@i3"0؀ͦ[]AO0N1\uNkHFq#ʹenu2O&Y,`yÂP׽YV+ZԸ.@d@ԇgTj:5U?2s]wu߇%7	޷vvl$
```


### 27


**dccf2cb36539294357b644790a11e175a13e19**

```
x+)JMU025`040031QpKL./L	JM.-*J,KdV[ca;W}AyaZ23S2S!-4-+Mk*~CiPi!@}SK2S .9*M;vM_N٧2sS3R5	gdʆcډG%O[WZZ\I+$g*n"O	p(u2[
 _
```


### 28


**b572d45a7b6e22888bb21ea3bf7f35a9b1bfc1**

```
xRN0ܯv` 6&Sn Mnizi??/M7'"wdEAP9XTb }H6Eg > UF&$	oX%P!edQTM`$UW_xqlk*w3OG}c~/kVI:r鐧lq\R.

+<s,^H;QmͭxGCx'<bc<"ȑ ƮY%ۣt:eOӫ	\C,,8Na^_LKيSќ	cO~#8e`ڃBB:weY
```


### 2a


**5ac90966aa0b127239a7e4c610082289019eab**

```
x1k1;WhtnY2t:|"uƖr]bI=v/nL1|QWښ0H΂z<ސ> ?5!/
0&˦mRQ7x!1Z
EY|Cw01dB}&J% kI=ZݲR,M2RdG\|8/ࡉQ
```


### 2b


**7ff449ad036cf555e2ab2a13180f4173d0492f**

```
xAK1=*Z<H$^+ &iH])M[DE;f&
oRg`=2RnJ,p`eѵCY7\>}xU3y:()QhU
}[Qjg4)>(6hjx-y*tL=e&5Kn1/D5Fi	.x$t0<ShIM'Pl+ǵȱ:Vת
```


**f718cec82ef03eb3e729da3f9ee0088ea5042a**

```
xm
@>Ň9xkicỷesTa٭.StEIcpyx:3K^$-RnINgf	n!H3	!ަ-GZbK:p* Ga
a8㠱/p#^~~h}&W&y>S
```


### 2c


**c2929ed0e7bbfc35ea4f98c3c4769f1ef4c7da**

```
x]J0=)READ(+WG񐦳hdZ黛v)-:w9ȬgY1(R"5TAXYr K(ؑ_@'<;x;0u<ŏgl32I>gxg`2DE`!:U xUA&L	p\=MSN/AH61ڋc89.ϴ=g]ZmjF-ğ-o~D14Fc\
```


### 2f


**53caebdeb8db71e58a71ebf5b0078962948643**

```
xα0`<'THtC'9!BFS%n9tN
BT6>FTV!
A]y]Xdv1W'cJ"9Pr_(!zM-HwKw}:$`w5ĕx_;L,KV5K45o}^EW/9CyxI9Е>ry7'uR
```


**be998e18959dac61d49f3bf076169e074ec950**

```
xN0G:vQu@eaΈΎ;/)ݱ@#ϟǵpQee6դt4FeT5J=rZ:J ƪJTپO[8^hO'Yfʤ˓9
%HzAOeء[]f1{$^UX@/a<?xڲmMYZ&mxG{~i.glwvw2;;
0+X3!ulG밅P*$|JgGæZ
֚}4J7>&Ԍ
```


### 30


**75ef3db3c3086e7017c19bb35f69be434168b8**

```
x]
09VDa2O=ء:'JcK7j.?!_Hjmkaj
4ZyWE:G 2FVt;(haiH4%ǥ#gنLp.9xOޞ!#'G05o=Fb_ɓD 
```


### 31


**239224d312fed650cb0977609fad00f41144db**

```
x1n0E;,R4P-'`(6Pۅ}xxzl  jK)"Ӕd4ry&<#arRmoWI*EYu6G,^SO6K%pUٻp}{>E㜈44^Ը/AC ٲQ
```


**d289938eec6026f21375527308fef881e12ee4**

```
xuP͊0sbti,
{Q=֤8L%MA}gRa3W]
@{y[!e9\6cxdy[5`Zc
~
I6SE꤀w擷r@ǿR)71N`\J UY	?#t
\e`	?jl@;"Q)/Іy*_H)/Dh`hDueUAG@
```


### 32


**6a3cd63c7acca10c7b732654ee02beec9d4817**

```
x+)JMU06a040031QpJ,Kdp7W_~W\Ux ;
```


**ace4aaabff55c3fb1cc5ffa96a17a4f7dc2c13**

```
xPN0eW<uJ@	:PuXep#ؑ}F(m6wX./_+٠Q9lb9(z9644zNDǂ:߱WsŉlY'RsY#cZX]7׿ %&W&4b|-oO}v1\V:_%7(/l3kɇww4lʦC
```


**fd9726736230d29336fdaaf08f0c876b69a2a9**

```
x+)JMU042a01 tCi;Y:)d:WPqK1:;?ַcMȃc"yFY6l,.VyǴ\q	Р^%9vr<{pW 1Z
```


### 34


**bb8d76d930a14115d3bceb102b3eb6df929e4c**

```
xe
@E[Wj`%Q]FQy0Έ"fR1-sRRQJ	kQP)y,{i ne4T{76sJt.
9{7ׯr.Z6^c1v,^eSOQ8Bl1 _WH
```


### 35


**223b4f9169a8701040a46391bb7cd8f09f29a0**

```
x]=k@S+^6it)RYXg=Bg]	jyޏi|hp<EIOgV?^p|e!#ŋ;hRn"Xj5i"81f$t؎dM~J)xKnQI95Z$W.X+n+J〺25]FxzNlfkOa-
```


**b51efdb438de06d4ebb1334961be7702847e3f**

```
xUn0{SLS!Q n
Co=JR$d?BUŻN¡ۙك6lqCs'2	Aqy_AZ8ol+`ƻocSėG|FYqD}匾"+Qw(/
.{N@1})<{`ujrU*R˦\ۧh"n|*>x4w鄛X
```


**bf5f568447724e472c6a751d2d839756e55dc6**

```
xm10+:Bb@m7qۉ!
H*qOTwPf{m,i$u[RFh0Ĉy<VPe;e#+}:a]7BE#j9>ڡCc$ip_%5M}<Sٖfgm/cJo^ewPh+/+ɖS	}G7c0
```


### 38


**481d9c8db41ec3cf385ed225772d6a982631b8**

```
x+)JMU041b040031Qpϫ/-K-rI,.J,Kd\s҄x_LwټǿESB2Wgm^pamPEE9&>ktzUaB_s
 Q:M
```


### 39


**262939d66573224e968274d7d98822bfe66098**

```
xe1O0+r*8	PNw Nz
X_g{F>$׭Efd#<R
[$QP
$֭
_;_↚x,&ऋf)/,z3\DqW2};b/.[L*yLcojkPc:h
vp_H/̺+O3şV&7Xs8Y }
```


**f06027a223fb5448e134d2f630410cfbb607ed**

```
xR=O0eί82 	*H	$(#BP;w[!<dȻ{ݻ+jWm:	>̧qu}Qڄ 7dh[l|go]:[Aclжӷw0~FbiXP2p
zZiSO@ź:goB$"?-6Ah/rqpxO->XP
zQI>zt j]@ /@hדxT*#-#
f,TYF4H'!2b˳1B$)PΆJY\%DWy>Ar7¾~NCے#̽Ə`z9RwVK;LUSE9;qPC0S2[f?6
```


### 3b


**384aed2790acf73a9d85a4eb8692b39897e438**

```
x}N0DS:+"tbmal"{sFHHZ͛}=6ˋ4Lcс,)>s,;c2Պ;Z_^K0h5^JkBF
`*qp9y5'jpeo;Т;|MAzeOVvMQl5u;}gb
```


### 3f


**c8b0402062397179a8bbaeba1062e7e5805b0c**

```
x1o0;+N.U6NȒmR^@(C{Cz4VUϨb%c5m.x`k!w;Y1j|X44y?ax$anʩA=+>[;ŉ͖9+^BM#X7t:QMW dilXf]f\!'0]Sבį;7xK<'D
g-dZ8VlQ ^
```


**e5945deba0560db40090e18754bf30ddaaa61f**

```
x+)JMU023d040031Q0TJMLwK	(+Kf~,Egt=ؖn?q@H!4Wͱ,,J:Zu~|U+Pe
9%9F%E@7*:^Xp#TOj^zIZ0PutӭrXczgr:{jS
5<2K$}.
*23JeS_F1
?79W) 
d
```


### 41


**e0a308d6db355f8fd14963d8c5b56b693d3667**

```
xݓOK@=S9X`(,mo"ivq6 mz5{;73`p6,Z7
#jhZp͋b9v|v[(>f܊*bXմ)牮0)*FvMZ
#WSqQAHޖѶ˪&&vtri$DknX0L"
 CcfPD	(S0DtsPR]r&TYtnk8&z-F=1
5"7`om&d
­PrVKKn-q~Ue/w5?>p
```


### 43


**8902239c8c2bd8effd4667759748deae3c5690**

```
x+)JMU044c01 @CݼΊڽ6KOSA%41HSln_?6%1C/AYzDvC%MNW+N24<ٙV \/
```


**d0480d98c9dae9f53a6b448ddc3739af19bc1c**

```
x+)JMU060a040031Q0T,/.,K//KfGT`Qp}Ow7RMO Ty^y^3/i:CivJcJ3Ō:Y6-!	D!(30$p{'
MYDn=/P p'>KU~V7crnJ3Ĝ̼\;\yVo(y_<
UnQX[\RTͧ9w 3ut
```


### 44


**78c825dd1ab2b40a1020722372c8005c100185**

```
xmAk!{W9${k^]I%:-eyߛ766pxD{G	/w썳wg5NdFV-ZxFgPTM ez1&W(5^n&fZەuUN6>89%MʳLS	nO/:wZ\|r}({f2ã6t,˒fKwBkвܺlUd$?3Œ
```


### 46


**98ecb46214743fde08ae069210213149c0c72f**

```
x+)JMU01c040031QM,/H-J,J,KdxmzZJY 
```


**c99bbea0b35e35069131ba8e846dbef635db99**

```
x+)JMU026f040031Qp/JLIuNI.I,/J,Kdxf=w);-s'(=į47)ˇ>.)4saS"S
]򨪸=
3sr0ܡofԹk̷P&6d TCX~yjs~^q~^b^	c׳H0ڵna#f _
```


**dbc49240d64ab910af49b0ece2552f1a7be1a6**

```
x+)JMU045g040031Qp*MKK-JM	JMLI-
/,I-rIJ,Kdt>+2?dLb1(51C"!M.}3p-T[fN?|w剝Mq9'UX  ?
```


### 48


**00d388ca12339669ab6a76b3a0c1838097dbb6**

```
xMO v).BƩqrC݌b(4ipp183)Zh%5_BYNocWn,rxft%$,2=[2N^\*\ܞo
))*:KQ+'T(X/@y\^*?vDJC[
```


### 4a


**a98ea5d0a320760422e655d8a454ca6a201995**

```
xmJ0=)~zJ
"Ep{Zo!cLLw]nRmB2ͯWYoA9MOz|HYrj9xݐx4$lǐ*pf"z;CXV7a8L(!Reu?dp~u:kr32Sy*s"+d0qjԁ9OpY7׿yݡ56;1%I, |N
```


### 4f


**f48a55527ccb784a9118ce420d8908e6e0dd23**

```
x+)JMU01c040031Q(/IM.IMqIJ,KdȚl:3g:0hOMV 7
```


### 51


**65f1479440d1dc9cc5e227db8a3b1abd448626**

```
x+)JMU01`040031QpI-,KMJ,KdaEj#nt {)
```


### 54


**50d1defd7dbbdd7d11e8bed997853d2ac1201e**

```
xmRMK0_1,YDdуGvm$d*nҏݶ8{oޛIM
OW%5)͓L JN 9x#k0?e*-Fk8䑍QG(BU|ێ@evz`ɏ#Yr}
	p{GMHl1V
=zp]r9е|?ZbNZեPmϰ
`v6p%Bs{ÛWe=vYbIFc65+6[nf;٩C߰PvQ
```


### 55


**eb4d24f23d8ea23ecd93bd676ba1b528f97c8b**

```
xE?0ĝ)M80GcJ
mwPT!hhQ<5.	)f,Eo%"&jahk)aZ[R? |Ag,+8'37
```


### 56


**567d293bfb2e65418531022fb9fb70bf416b84**

```
x+)JMU047`040031QpLI)J-.J,KdȚ2+>~'Z9(9'ձ(54W̖˩wm_(Ο483 '3$hr	D޲E/y-my>P9ub;~Ο8ăst cH
```


### 59


**72ff5ee5f2008d2989f4538269e5c3520bd3fc**

```
xN0M9U`Aƛ:VPNFS9	I ǀDXJ|~=^4Qx#4# 1sGGv"x1i@^c'6*ćCx}P=< _9E&G&VExx=}{bt `We8lhA?,ㄤn_dT,zp*
```


### 5a


**12d3c1932ce0852cfac699a78037a5d53a4ba1**

```
xUPAj0Y\\lҒ^Jrzlsc9ث"ɹ+.X̶i{xtN|(&Qj*6 +iD:`]k?}W4-_ԨȻ=MR$&]V#sbnt/b]pq e$հϳ4rA=bhBg6][ȻݒtSV^gʷ>kii,i_
```


### 5e


**28837a7431593feb485a10c98de59d6ae536b5**

```
xj03),,!CthCpGpɴ{:-t?;5[ճSljЄ(>:-;~2,Q@zW%у-h/
)  y0_BH=@mwW>JuJ	9Q/>b؊sP4ϡkA-9G$qOkh~YfO9&"R|7p>
```


**90bbc8ba9e1b676e1ccf985d7a5612f5376c70**

```
x}0 ۥ0"F.QPUǻM.&MR1%O/i(Y>G
z̦K\l`@8B=Tv!WQc$bû]K]hķZfG9@
```


### 5f


**c7367f468b4961237c877bbc16295b46ea2700**

```
xj0;)M9 tJ 7MG|R4	-j%ħ_:}y3Gd\Qk؍ClѠ
v!s$~C 
٫7/+Y8^	jEG0xl"NRݠW?Bu0̜*Pr$v&Ldyhcdc%A茔%jZn:-+򑊁Kf1lvl~+
```


**e92c9a1ab42ed8d64c326af41d075f9df05d9e**

```
x
0)^MXхSdEޖ"jAnazմR(GIk}h+KjtR:ц	A3$P ہ.02egj`eyVG0z["-a^#ÍV|KW+9wSJtn21%y 9Sto
```


### 60


**df12d0bb51ee777fd5a75a7a5ebc2d2b3fdf10**

```
xuJ0=)]%>xICZI'%.n$[ 8gZZnL?8xW'%G6V6"~_Zӡ**XqDNμWDC9iaEP@4}VN!9Ց?X,7
vUFUr0^u6*QP9ߍ,-u*vmЋJm?:NT|sk
```


### 61


**fa82802c8e5706b63a27609e1c2a94d4b860f4**

```
x+)JMU046b040031Qp,JI
I-.J,KdQƿvm.PyBTknAN~e*S.m]a3CtYKJSRJOdq HQ F8
```


### 64


**183c228d9a06ea3f7d8aa2a7e069c6e848e76a**

```
x+)JMU04g040031Qp-KIK//J)J,Kd0U@aI57>\ UR꜑
QshҼw1}?r_߂.)Kw*MKK-
I-.hЮ⹖9kZ<Q4%d#i4WFڿ8tnS P
```


**e0b404bcfacd6a9460954849b10dbe6c2f4457**

```
xUn0Y_1AK$A.CʚBER inP$Jn|@t̛R0]͗%vST7
`jC!xa,jl<%f%SNvEU0Im]u6`5n!>ӕ=GJyBmPd'+,0SHqNcWp^"rOu4h/7/@pq.n\.ktrS]қg&:{o 	"^4Ê)Q3=}[lin)*VE.{6{g;ux}C^'i4Eޱ/qnf58ͯf2v1^@f1_lD0OL!ݑ#.[0yni{KȚ-2
yZz\\gatǙL1֒^I[_z,BzV4b;ewA&
```


### 65


**199cc4ce6c5ebe446c9076d3520cc46715d403**

```
xe
0}Nc9Iq0vz-/$B|'VqD9#qiG
]0j
ǥgnَʅ@Oo^!3e?N,>I2CͻwAi񋝣9 1C
```


### 67


**4a8e8a6b995003c4976689efa7ae5faf59186f**

```
x+)JMU060f040031QpJvLN/+qIJ,KdlιIܴʇ{p޹$?׵"9$3?Gٺ&ٗ>?iIe',1'3%	bt¤,B+[SY5OVz+ė|#Q_&Zٷb2g7R
S_TXᖙSc?>Ž]'TVyzc BfxO
```


### 69


**a5577c71ef3c9ae00ebfb368c98c0ae504dd3a**

```
xuR=o0̯8e""M"ڡR.('1vd|(	Є{=sR!;78-T%λR䨓 69gh
LuL)QE }mANjD:[Qk=`K3A A0=jC똉q-	q=/a~
P^	љXz_I1Gu
[D-
b9H.v*&`
	Ԭ%=`m:.Z|HCcHECDW
0ym3Wl(XW}~OuAgA+uNm~>$K/k։O8ѿ/٘xoplD9n?-wsm
```


### 6a


**94649a61ceb43ebf888f4cfcfb613bffb3f58e**

```
x
@)B!z-w w7JA%C?R,ۭ4ʠ)/\'$&РqANrtO&xP)8l3pDxGO7k8X1Jr3olw>^8RP:.<r	17i
```


**9e22e6970301b9cfcc89f7d833088765632213**

```
xm10`a ąs-MҦc1mv(]+
	QYM7(i;O܍iŁk:oQ{a,̗
!b{wz0eSy4`x@-Upk8IGF
```


### 6b


**bb0ddecd14353eecf69a27c1ec79f294a75126**

```
x+)JMU040e040031QpLNN-.vIJ,Kd}ɶo{ӳnYmb 
xEnyΧ8_\Z.m};s>Re-ץM
 ġ/;
```


**d02aa64eaa5a75672b0907cf00e85c9277034a**

```
xM
0D{+R-=<4&B)&"sy˓Hnj;!XpCOtڰ%=vpǇXez<"K}@Q8dQ]84oX)X锲W'>*s7[
```


### 6d


**1eda2c998463d365dd3d2e63e822559f9a62e1**

```
xM
0D=+Z`T<УxؤҦ$ wk7#(5
RxM<"EfhtY䛐c'C8N㌽؞!wdJQfTu+EvY:U{,ŎH៚6&cS:n
```


### 6f


**472391898950825e6cc924b74c24c8a7e0613d**

```
x}OO@=)FNMF^Lk҃ތ-,X;OݙҴN{y)oLY[J+AP7{x3^*纴 SGԺ&RJP/P.ѩ$
 ȍ$,jӣѪTt	;\fI֓Yww"qa4=k

ɝ3L}qaQ6(kJJsޛUQWRBSV#4@=
.)ZK埭⼿IN u<R0]B9K,('* 7kn!VHbZc]Бop:ZAYߵ*]At mD.
```


**a93eb40a3af40295a9cc20cbd48f1f3e744150**

```
x0VvO1OmTEN}w$]7H
 2
ס7yb+quz	}Ynh@F)&=,P4(/	%Ys蛸Y&-RR
```


### 70


**4c885206dc36c54e6d2b176d07a3f52f857554**

```
xMA
@Ю=_*X+hUDތm6?~m"/Nji=jkNkOCxV,p¤
;2	F8<!& T8W\4w UKh/p
Ӽ=Sff)dmbJ~dm:
```


**933ec4559abed1cecf2a81a7304fb57a7b945f**

```
x}QJ0ܯ
BУxHcNJ2]鿛vK޼46p:Me10VH21@=<:ݫV; Yr -@'DimjG$^A炨?=@ZI9(*H=Xtk蓭c7ApS@=0Zi2݈n`)4	y-ѧQ_m<Bx}6$n!Op
ͧll̾SΉ
```


**a55806fba07467e6012dcdaf423147e7b2870c**

```
x+)JMU02`040031Qp,),N/H-J,/J,Kd>ގۅO
_ޙ47?-$h
D[	k[m]mӟX@AT<i&~9l2>BUgd'X-Y_.9~#.5溺]% 9$3/vﺱ9w.
 _
```


### 76


**55956f5be9591601133fe1be935e808d225b4a**

```
x]0D=+V1E=x1~p )	SjL45dh6|;R%vJ
ey&Wk%ْʽ3oTwZ(ȩށ~Ug)ʚKc`+l`"&IE)4yn(/OnIw%鼁Ue
```


### 79


**952ee200b23864ab37c450d7ecbb837bd752c5**

```
x10+nKn(rIN
MhUwRA{߻S+gI@]`v&Cqra/Wy%FʅrVv#
Si"<t3r_(b.,CeKv
2JxԚbk_c=f2V	i
```


### 7c


**dea9dc0506c4d74ef9f6913b7e45f0c70b36c4**

```
xKOR020d(HLNLOUIL724.)MI+*(MLVHI,.V
+Ts) T*(3/]!/17Y<3D(?'hjHt`J5&ԗddUE2.2( $ZU O*?
```


### 7d


**68cfdc0498eff41e964df69e43ca09e8d2a6ba**

```
x+)JMU06g040031QpJ,NJ,Kdp+6;5ҳO	\ U
```


### 7f


**1d22fa0411a152ee8e3305508d804e1a14bb73**

```
x+)JMU0f01 ĜҜĒ"o$X6I@q}C3|ԢĒ<ĲD{?o$]L e%>
```


**5e6b490b55de16a4c76e59be4531f6c969012a**

```
x}
1O.
|8"^z\S*w(fbr\fvW86+E[{dƘ.H|D5
)%2#E-ʐZ{؟d>ʯ18\EUDCkwK&V≷g~K%#,}BǢvI\+$L]0OW
```


### 84


**2f5b7675ccc84a2fe3fc4ad6e3f4087464d85b**

```
x
 E;o4BK!td,F`T
%^cmS\߹LC)Ɂ+tz^'<H큛#IUlDuE_`*\
_Sco(MS*Y4&>fpݷCai^)8p|[	|s
```


### 85


**c7929cbdf4ae98a0f3a606cc76d659b3d6b988**

```
x+)JMU045`040031Q-),IH-,IKNuIJ,Kd_Ķ1#tEfypPXP`1ǵۦ=oݚikURW\_TPݿ5gǟNJ,uǜb ?
```


### 86


**c48ed1956e40888d3115340d44da3bd0a09b6c**

```
xJ0=)r^rDbAKDd:KfȾimB{||
 'T<I"@XI0Pe۱S^%W'Opvhde I7=vǴ:hHOv!4|ˡw9t/sA	s>';=K)	244fV3[t:VPĻ'kYd-꼬OC.5x%ǸՀ:u){gU&ۤ6U|6!/
~o(J
```


### 87


**47f5a2932ae297a518ee4147832906bda90452**

```
x+)JMU00b040031Qp/tIuIJ,Kd~g]*f;N-\IqHoiNIfAN*D%E;7(5n(_n8{!LyQjbI*_$wjk؞|&
7(b?/`e]I J_
```


**70b099896b1b4d825f7e85f88cb67059c6cb75**

```
x]N1DK$JPp%UX;{gIpaYofm[l7
}xwPtM̘c)@>gx	SǱk1=EW<m$_C^Vj6 ;`<
̂#^nO&`rpg	'ΖEpC+>1<O؏DV+f6]
```


### 89


**1515d99d189c29b610616a95997c4b79782fcf**

```
xSMK1b(ZzP<՛xfcd%7V{x\9NdKK{qZ˪
kMi*rQfd^V\@c0EeRMkidQ88Wdblr$ZqST
F7LŨ04wlͣnl8xt
3%wc?V3;/_`]
|42	loRv^
RGc8֜F4u
W{1`YX^?Ei6F9G`RQhM|;Beqf 
`l#
zxl[96oWXWJ
```


**5b49c0fbf899166e9cbac47878921823522ce3**

```
x=k0;W&C<
3X4We4-P*;I5F<t`l\KϢTt#'=e-7aYOKh%R; 6>  TqjjSma$.	?׈3~lz=en[d[Zz"뉬IOEQZRuGxUgƥn~/xOz
Ci~ǳ6І֯0}
```


**8b6fc95e1f72b7a772fc569d7801f4219f95b3**

```
xAk1{ίt ^
z<JͰH2!J񿻛"-[y}j`zj>d@-`|G
bOj^*SukcY=
'5ӔozmSޏVO4r4,W*c1ծۢE<'VjWy>A.)<SaX2_gkM-W7#_D R Wv
```


### 8a


**cc699f1632518aced84ac1297f469660667f02**

```
x=0` WT\\&`J>Vd͔;8czFSbY.`
y7]x
 tgYY\_hsLנ&I8?Nlqm.#M$
{B1%aZ@
[$Hi+NUt
];rv/8ёӻԪ+%k_1qtˌU0Gf3,bMrjJPBo=~[
```


### 8d


**f16c5f7206b1604855b3ba9b72e09a4ac041bf**

```
x?k0;S(B!C(tҡ4d?F:';!T֫;Ӈn8
xC/zUu6x+3&at>Cfގc'"j2Wq U\܆N)`T1|vq1ι/;Oc/ɒ-c4k&mbr6OxR*ad1|x_Dg~ +
```


### 8f


**b56c9bd3e3f2ca073518a4de6f2acd0ef89c73**

```
xT=k0_qdJC;$[pFD$
,-J{
z}wå%]`F(Ms9*CNIxQ3@cY
Ep|QCT%iOK2_>v4ٝ*QMje-$[Z6.Cֺ<{H,yUHZ?P<|:1&<[tB=87(,T*1o- TīNmϔj<pVKSk=fK
Ƣ]!lg-ui{!(p~Y|0n,	MdP(
,a :7LF:s8 eWHT .dfێ99ON_]9h
```


**db94d2b394ab70ee7ec1f85699542d61060704**

```
x}1k0;W,Z(]ܭ8"K:5%R$JH(Ǉ;z30|˝#u#aYK+3!_#GkU-bvd''Zjd2:7mf(Z*9Ln3W4Bl{x&
',c'H/4mWˌ45_>2!gz><C.i}LEWrJ]'d`F{VL 3úz÷m
njA
-sˮXMhL'I I_$}QP\\$_@
```


### 91


**28a18870e2ea04c8aa044a63b4878a81f9c9d8**

```
x+)JMU0d040031QJ-.)J,Kdp8zWj."1 Y
```


### 92


**c2e3fa73914ca8687387f06a0e6450959d2438**

```
x}RN0䜯X|rAzA-8 nM\7}߱Pi+ݙ̵ٙͅZ#)W,[Wsrȵo(tN	,|gNIRXUJ*g)?>A8
@#;ic"	dx/H;mDtNǧG1r
EM(x_ ﯦi6܆thh"֟p%lEb|%m8HHBnwvmNV)e	S|j?
4vj#oGqyQqV\+^<=c{}PF'B!/?Nw9IYeadSk@Q"	H~ 
```


### 94


**f2273f971e811fcca1bf3a2287e1a6e055eeff**

```
xM=O0+)]C.'&!	0n=N*OO79;*G'BXU#r)zG8t42题z~CXL
ι"R]fβչiG9(d
}듨	WFp4
5|y߻ [f?\/-YX
```


### 95


**74166b820fa592996b5b8a08367751cb4398c0**

```
xRMO0_a	.$48!m&Un NRS$)Ki\	ٙ*yUTF ARA@<knr:@qq*
^t(X}Ww[^ӵ]it5"Ǥ#u2mw"^׺i
ުc9d<2^οy#E?Bעզ^~r^F^9-?n.Z
6N@ŌN(me3(	ޖ]^һķJ1M٪1q@eCI@dlΪF~  >'
```


### 96


**067d7c37283fe1054b6d1047a0776df8f8819b**

```
x]AK0=Wc*X\<,
^Q<1LW7-oaSws2,fJMzgg(0T#>zhu/
p9H}
tč-q_L,%۲'o{b(꧷52NYG<ֈE=UT]R6I[ũîAt2Gb\'M&ӿТor)
```


**a7d6677b1f56f8d51d0914eaaf9b20c38796d5**

```
xeO@;)O+Rb~ctXbDwew"\{&jZ9'ETZW ~&ϑ"<^QEF|e.`>@MR$C7cA1}(vV#Z1	T(QĦn	!ѷAIϏZbF
W.NH
```


**d8023f68db30570cdb148d32814f3edfaba1be**

```
xj0EWhlɦK	PPwAEcӆ,5s2{u[e[r^H=;?r:Tu1nS9`UIz0UJcqPf0Js"6<τH?Sg8ZٓGF իv$#wĈKf'HSiVquw5J'iD^NKEQILj^(n>g4
teB~&8Y$xB >z
0#E^0:SBL4{}#|<"&))yGHڜGx7o
```


### 98


**8d0d71edc9ab16515d0fe2cf5099905f199718**

```
xMO0=WL
	j3G¡ iiߝ~
33C^n%"lӼƪ5ԭ0r'`@'c/_ynCQK`jxl޾>dlӥWvDHSlZ=Dt咽5p'!	z +I
:BBhUa;*8P2dK'=pH)H`W4Pw\4JeϨ!/i^Ѧ4NH`u2'ר|
```


### 9b


**57c6642cb39708bc8ddb2e06a5b7cf58c01b7d**

```
xOk@{OHD4^zBCNB2[f7߽)-{f~oj|bvut:1qD[:8K­>WѾγ$஭PKٸuqd)nXn3ٳeXXuI2^r{ܭkLi,YzCl($1.zM"H
aK6EEIB0'h-y
```


**c3867efc0f1582c5f313d2e8767cbd13f49e4f**

```
x+)JMU046b040031QpK,NM,JJ,Kd\^Sf3Np=ekU쓙Tx)pU*ǢJ3zyߞ\-|	% |6
```


### 9e


**a2150f6b804824f891d4d3b3dfc7f2feb7f742**

```
x͓n0;LH(RT4!#`42axj0꒡w&5A4,TB
*UvY=8Qۉ멗V.J
>#pcuA-^BŹP f;0T>زIfߕ,}kL'ި;]+{7%R;J
dʓ՚Dq*ExqAdpyNg7MLյm5fL咣w&ݘ;UPp6o]6mb 6}̟R-ߓ>DC
```


### a3


**a0f9d084fd97803b546a3586e7f63e6836b819**

```
x}N09)LO)i!q؁␦n6㭛Pߝd-w64%OWXynFsA*+cžioM22| EK`:^!ƽʑ~q'˓hBL^"pGONM3%'eH_y ,$H^"jaL''FC1YPz{e}ر-b᧷GHcr݊xMdb%Sw33}w
```


### a6


**b172e50185723e677f699e6627100d40b32e1e**

```
x+)JMU0d040031Q.I,LvOvH-IJ,Kd_iԕgN_闷+q@тE?	/=Qr#:$#E6s*?O6]#{B䜑
qw/IĲ2>2 &Q
```


### a8


**4c32ca4444a3df5fe044bdd0c3f63cd5187a20**

```
xOk0wΧzJ	]^K%u:\lkgI
5齟kU{ci-Ӭ@feQsMwb6_	?םx*$3nݼ\K`=<ɉRubb:WW ;y;u_q /yX_I2hW?45oDHt{"KS\"~et-k~(ި# ,3 '|]
 
w#vxg}tIه.v6̚~ڬ
```


### ac


**b56d93c07176c847a9618eaa5f6195a16f8ed8**

```
xAO0=+zd/xl<=CJT+UbBŸ('2ھNtE//d;2ڡT@$Cv[uHb?iRz;hوY-]ͤZ(aSxtJS]N?j'L=Ф?M'7GҢ7(j*a3Np}-l8ixQ'2=v|3
9NQ>4bZFcCBi&בwYMױ:ntG<|JƖEr2WtSZx(m"cY_^	k&.Ѣ
)CDs*zAF
MC
```


### b0


**475c6333af041acdf6e15b457ebcc33234a836**

```
xu?O0ř)N],Bʀ"1DR1\isd_Zw1,{==aO&NuL
1Na=S% Г0%qtؿ CWx)XC !fPm!}Z`Y{dy{%M>j6AJˆXp
MVpIRRRLUyH>gg?ӽHnrPbESD__W9Y}
```


### b1


**172078959aff50a938e8d6a7c91ff89ae86a8c**

```
x+)JMU074g01 $C3Nz*ۥz=2HRFiTYCه6,|EY^/1qjn+>>͛=;}M$tٶY'̓њreG$&)6J^v-Z YH
LoTy>-رc39[Z5Cps֍WO|=}㑶Qk׬aƢEvx6!)dxxjiWi.wlFOľ^ƻawW-G7`W0I':,'}zs6C76,*h8nuǑ14gu3|^vZk;;
j5:2]1!oaMArI,9ؗ
)CJҟ1]d|S;Bތ}6ǙM4גys	+4xoWu.[m֝yݧ*|6yK;u6Zj:os|XN 
```


### b3


**37ee438c0be7345e9679e1bc9d52c62fe0cb75**

```
x1o0;+NLd"5JFСSƪ1
6)n	}wiSl6w«$DE{^r%pX
L2wwHCerWb
sۡEuQ4ZxB78MZ"m4 Z[I+x7|
,w0^NO=ZIEfx{݄
ha	<MNC#.i!KHbO5owGYԤ螫OO+z%Nr@Zq?܆1p!`7D',_&d֫*"s	6%p;D,$AxUJ~T,>#İLr7[UB
```


**94b4a2c22a4fc7869f645e52601ab916ed55f9**

```
xe0EC
C%
1
1TAyTC'ZG[PC^3dJ+1nh
*"#cC!2ĊvNUo'PHC	"`sHnM<iaX9XɼXp	6dǔ"
-AZZ
```


### b5


**fc414ce287f49d33fabab58cb7107d80f39076**

```
x}1O0+nL<:UL0TBb8`8}iA(KP*<=׶a2;Q
l4:GaWbpo_jCQ,vM-,dR-i32uʸn1bZ9U&ǘ0⤶P#\غ/P<S_ܿCi$i4!(rJ/FFqƕK+`hcu5帆7ūUG6Z̕lEc
```


### b9


**8bca207953b5a90f4b95e337ad23ab860ca585**

```
x+)JMU020b040031Qp*JMv,q,KJ,KdȾoUTi6'y1ʙdeg&:UAMn?]QVJ=}9?$34ٚ ;fGrso-
1/53=bJDyYgI/[jsQL, ?L
```


### ba


**1b234da3cdbd911294a8e41ebf4ede4a23f00f**

```
x@y	FA#hgkgg#&G]@1ngٽ0!yO|J
!rEzrX9Gb݂RدH;`։tda"6HNWnDrk|`@V%
d0`ZB](>Y5.͢ݸ2#E-\ǿL(:dl?͈0Qc|J
```


### bc


**9851a9dc8248fea0054b295a44936e9be8e49b**

```
xePn08RQ%Qn]Qb9Sw9Nr߿xٽ><:^#u^g<PQom?ja[cmHp||WŹ?#
yyH+xp<O~.C6x.b!ЩQhB#FJ3;?TC2-TVkqi-	\l<F3gcw
```


**b2ef5cc563790b50b73573365c0cbeae40a8f6**

```
xRn0MWLb4DK6°fe1Mh=c`90ޛ#u/i!(Q:s(Mym*§lQw-I11Џ(<$)s`sʯs,&TzfVHy>u0#LW9Ϥ@
NC1)
 X:vF1J:9=Ju-B;3I!j+z,WlЪ l}w"Н*BtdFjǥǞMRs>3_SCڸQm$1bw g
```


### be


**0baf66b748f1dd4606438b0d6e8e7171a0b555**

```
xm0Eߜ.BL0mOi!ԉ@GX31:KǍRi:pw63	
8e.{,nyv<P!;{[f?fj^`$.;C~>nziեxO˥Te8I/\z'd
```


**31be270690b4f64b54bd11cf53cd2f98ad1d80**

```
xKOR041c(HLNLOUIL724N7T*(MLVHI,.VpTR ̼/,HV(,$̆(0)
6̄Hk /
```


### c1


**98ca9d70ea0e0e128f59b3b2d6aa8dcd9798d9**

```
x+)JMU041c040031QpJvLN/+qI-I)J,KdX5w²+V'N]w91/%3%U}ۑS:z
EMx]nY_X0;>4%o*'}kW/l8a ?;q
```


### c3


**138acd9f5d4d7048ac54e0c6141803b152030c**

```
x+)JMU06a040031QpJ,Kdzu"a6֟i~qy 
```


**66b9be9ca59cf7ca4cefb01c89a8c808201c44**

```
x+)JMU06a040031QpJ,KdgOmo!{՟V 
```


**a022e0150cc63b0f6a1ba6a5340cd1107628cd**

```
xM
@>wT1!̃Dm`w"}vE|s}̔RH0L
47oԽvviX-̚j_H{<!;vVI1.aRdNXWpPι)ކ>G=RȺ[/?
```


**f36ffbbba46538bb4204b7fea649f7e126f102**

```
x]0yҠq1G8ii	=bxwKp}Im%M7H
AW TRwx%ǅ
!,˓pxX,Di14~/D19Zn]9mh>y c~HkVD_ܵ7/dڜŢE?N M
```


### c4


**41cbd3c2f1a47137d70c0446e7f3892a9fb8a1**

```
x=O0+<l H	dU NRTUb?ipyu}A8d<2Ǽ7f| !c>Fч1Ç2 Z|Gbi&>dd5кA ׯEcw$8ozj7U7~>Ef[N6!l*6aR74PuYL6lߏm_ە
```


**71fc91ba34e5dd2d8bd5135df6b4e976d558c2**

```
xmOK1=S{"Exv"&FIIҖ"NАð/Vŷ2a{x,dQtwWSV[,ɰC;9r	|툣M+.x3&cP/}H
g>yO~YoV:ʫh=MGT[~~TXC3rW1+<<D))Phk.WEPh 
\BcUm
```


**92fa2becef6dc0c8f9d676ccb02f12c385ba4e**

```
xT=o0_q,22K!hfHR@A%]m"iӠ?d#ݽ{*/54Roޢ^N	NA(W={#{@W)yj3zgJ.^ҁ1}}qy|TUjo6=~u[p;OG=b?q+;\0s^en0d,oNrz[E^܄t94;c+wGۚE:
0]"N3jRQ3T_Pt$iX3>
5~QOe/>
Nvcd>`&S
Sf ^5ܶݸҐvfvsm\ɇtPGPMSt$8tR5%ɣGVsGňΪ=2 Z
B"mS>%r<|s
0&SIoivG
```


### c9


**ca89320615a70a7f9f13d79c06de68818182f1**

```
xM1k0;W<y!P

&SN<,|6I{}z?ؾq[/Z%v^uFٰbNwC>K	)ad͙Y&7`ԎdpXx=(^DdϿ]#Q9w?vĠ4f2E__`c)¯آiGV*ٔX͹({OI]< U
```


### cd


**c93bbd12d86bc0770de1d63772d9359822bcb7**

```
xA0/CA"c6'tƜDocw;ُlUh&ߘqXAx2	( *wGQ%뵃ְ HeiRN ޤ ',rL>CsI%~kay!=mn()aHAA:E)kZvb_{yCV
```


### cf


**214efe94f4adb1d02a63a2fb19202804d81b18**

```
xE=0+^:PB[Q 覃:ț64	Ino;&5,O5VvȮٔh	>GZsBLˤ(ƹFÛ@p}ݵ(ABU\4C7
VcaVAiưŰL0,-3_v#@"
```


### d0


**20d8f5f6286ee3d5e8668df79e7d837a7721d5**

```
xu0FwD0.ā:hL\miHCi`/FxιSAzvygہ^*	5.=-Fc[${8Ûx+,*xu/ Z|~A4ԴZ'uP:Bl=I:so z2koP
```


### d2


**4151230696cdacee1eb7290e7464fa426bcb23**

```
x}1o ;+nd1E]fupÁqBW{%jewоװy<n;Q켪
ٰbwaKz
->S	=ɚ
0yC4d/ׁ?"N9Zo;bENL,T{)魣&XDjHmؓL+ŒAFKjɞ~kA"@j, [-dT"Qx
```


### da


**c0d927ae428a8bd9f011322946eaef1695852b**

```
x}=k0;WܨB!HlIQls>]%z=s&0cUeȆR0ck* U&"#'ظ-HV6_Bq!
m Kd[+Gr4#L\4왗a7ى-!{#'mMǪMgO7mk
```


### de


**7a0096e316cf6392c94688380b92f2e4b9a22b**

```
x+)JMU04a040031QpKN,/JqIJ,Kd8Rg.wu
~j!ܤ"Ҕ[X:5%aF}9.p%)eEE)yM'䋶//6KR0 lG0_|_z> )P
```


**d1e6cfcf36fb746cc749b3f711d3fed1679ab3**

```
xMK1`COXBmb=5/ɊwS)+{s|}f
n뫈{
O(ޗ+2f\"V#}<GLF30MG
0=O`\{k7}gҎB<֓d}3{Pj3Rbw?+bDоb/C;3Ha~ "{
```


### df


**b7d9f88ed7952cd32f6eb35ef2a0b8b896420a**

```
x+)JMU041e040031Qp,-.)K+MJ-J,Kd	xo/ݜjuPA'(=?-$hD79uu hVmrĒҼFכ,˺Z⪊_ޖ>^
```


### e1


**d7f2dbff1f2666d49629a1d2bd9ba1db570637**

```
x+)JMU04d040031QH-,IKNuIJ,Kd82NVvf]~p%E%ŝ7J&5ufweyĂTǢD[~g[a׺Cdы+ ;%
```


### e2


**3c2adf0fab4034e610adbd21005e5572049716**

```
xT=O0eί8u
h$J`Xep:rΕ}*9q~~%Km0NnT5_"H$(VKrȵpRP!~7~¾#A2J0N*\/2vnjp9w;GLjܬ-x$-FV_
Dr֊㈙:*#]7 	R/)xPV @Km:5IJ,kn7`V^m1OZ@1~ a^bP>Q$;w袑Px	VMEq.ś%<{ߋ0NU E[>#h!~T3^a%z~vT0hk貍p`P7P@Z
Go>;iwd8c1 wHJ<fڊGJ
```


**a4ff1588002bb1f8753d33849d411f77319ba1**

```
xJ1@=W{*v"XxHt;&dmw¶8̛yCO᡼e[D/oY֬5hB'lxek'c
0?@QCsW<5oF`δ=aNY΋nmR$ۖ=xduȣX]DB/9I!ܕސte#rrTjեre`ɔB:/tGy:h0zT|
lүX6:<=B`dmxlBPut;._]
```


### e4


**463b5b95fb8f72c9d8b047119c5e219ecb1cc5**

```
xMO09WX;uT&ö7/&̩w;I[|I%yc;;cw/X[''!
[&I)P[ޠQAKRG$NKqćG@w^z:xk`HW/O-9
}>wñb	eC芳uYK:?*zPk4t wŗPoC:P`^4;uN'[$3:6^/(}\&ez6慥V(ꖜnvq䜼!
```


### e5


**7c8f7c9ecbf3ce2503ed57b6fcac66e1fbd359**

```
xmj0wS!%Xar98[\9J13oMHcx|~,'M^Q"I1HՎHI{w|bޓ$&;FQxj|{@'b`ȜosT$V[:AA/q^ YlH*]3u"b=+ĳ@e
^;R>ɠ؄?j[0/9Q
```


### e6


**656d2417fb5857cd1d0d68bd23703a3a3346bb**

```
x]PM0̯h0~^Ìq2watY}Efs/9*'&Gx{@G'DDtĆCĀ/IpP\BGw\(RڊV))&cZMk[뎏chj%CjM u))tnXGw3SH?.=Lsh2b7l{Mj{i9H?20%W@^nz
```


**8b3045d4f1ad103779f0228de7a3763aad2853**

```
xuλ@P
Xj_`]6q¿4IMHIMI-Ndd0̈́-!
9ǵVJ4]~]zPϾB_<G|%Kpd=H^ {08v7`/[vX
```


### eb


**8486371d7a4cfc51e53ab2d3baf86b9df6a5a0**

```
xU0E-CQX8~tT :1U=Q)w+?(+AytzbMxi ټO^|/PG%1<}2wk5yHbt
AیE3
Xp.P[Qo)LIlˈhȈ}'O8Q0
```


### ec


**e6b01c9e49746a708638c733f734f3d4d57ec7**

```
x+)JMU4c040031QpL*.)JL.	H,HuIJ,KdZt%:O{+7?ZzjXvI38O;8  W'>
```


### f0


**26fc1d3510a25372eb7bb98e40bbcb8aed2f8d**

```
xu10+.
$gRKjb&NUK؆Tz/^	}Cё-jT%#7dWM%-.B	Y
oege'[zYAi[ڞ&o^]PF;h,ořL
```


**ac62308eb43ac7ea6d3ab618a3d99dc6f46878**

```
x+)JMU047a040031QpLI,J,Kd'x^>Wo'3
|=!jXTجdWfj3R2R3KBSs3K!zJEo<WN9.'ٛ&gA以@oe!-mSv
	 _EZ
```


### f4


**82869c353e50662111815b87a9aa4f5d6efcd2**

```
x+)JMU044d01 ׊\;
b9+yK{Wϓ7
LL|3RSK\Rs+eZɋ~K*hܐ\RW rp?gpZ .
```


### f5


**43fe2462b97f477a835e3e8348b76143cc6c3a**

```
x}P;k0_qx[Д4t(mY8
esbSSLcB
rrX.L8OW%$i
ڪѣ"\OX9N`	H<8S@L-6M]~|e&0[>cTG$uf('+YUdsl@XIגlHdk2&;H&%Cm	Fs m,z(;*z
r*
v@+;oNcCՀ}S	/*33$C`
```


### f6


**575324378fc907374d377daba12980cb483cbc**

```
xm1o ;WHJUuRǨ&Ƚ
wNZU,
޻oaǧE"]ga^#%"@frɟK3N^LPT&t(39'$[M[ޑjԜxWH6pG9m#TNkB#'VǭK)2xcTb$W0ARLyǧ
Ooe*[wZw!z
```


**9e3bd43f1374c2ef904101ba4dacef94adaca2**

```
xMN0DTNc!*tP RJD+Z#{@s[f∫v38A\99fZSz6|+iT*:0[b=H"^^aӔo- ,~6y\Jfgw? \TJo=;ܢ{w-11Km+٩%I ag\
```


### f7


**5db4fbaf028ea6083e85b814a2e86ed4d1076e**

```
xTMO@̯DkC^<xX`M(Tv#ݙJCC^hf=潙!,֐b#7 }6*JN]ɏ6r56MU;,4'ӥom0jJ6_7]V"<K[0#`RsFz"=	SFϏ0s?=ьIoa֣V
-PJUƉ0/K\\9jP=.1 s.=cxc%cl-Q){W(1(A'
Y{L sXwZe;)n!m:k01xRTe|H+3QÜhC[(K>^ˆLnfG,n4W=} EJ
```


### fa


**5590fb57fd5ee89cbf14d358546fdf2fb65704**

```
xmPMO0̯
+ċ1ɓ	Gaf5wu!޼yƕpwpR^cHy$
今)ڮ4`PP'%5X~!gGrae#Za9?v++O%HZ畟H5(m9w WJi#26m<Y|}u6T2ga</|Ê=;d%_o}G/
```


### fd


**1a583fb1c2bd1e18d1c4169c44c90782a1636a**

```
xeAK1=WcV0Oztڦd'Kf*nlQp};,b?8w.ŀ^)k~$q|ԛ1Q>A#VK;|I3Sa 	x%(.r:'x
¶ӧωL:
n
qE<:LQ!edN)V
```


**8b00da56edb60edc7c1b9bc97e12b9ad8186fa**

```
xO=0_q8)K.еI*)FK{WȺ<w
K,i_XHj)(PZ5[2sN`I#>b+ۧnpj8L?8:4v&iw`V0Fkqݚغ۵~e9rKG\
/Js	Ec{iۊ)
```


**b58c6b7fe010f118e128c33e6ab9450e881a88**

```
xAK0=Wc+%[+xX,M<Ll&kwR7yO'QWW6XkUk}z|Ơm'yqԥV*(n
a­ɴ<3;݁9w
'i|Q켶VԸOU<LCvb%dt
pX2Ir
@)r-i7oQ>NV}kR>SxKQk%z~ %`
```


### info


### pack


## refs


### heads


**main**

```
31239224d312fed650cb0977609fad00f41144db
```


### remotes


#### origin


**main**

```
31239224d312fed650cb0977609fad00f41144db
```


### tags
