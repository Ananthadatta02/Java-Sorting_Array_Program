# Sorting Array in Java

## Description
This repository contains a Java program that sorts an array in **descending order** using nested loops. The program allows users to input an array size and elements, then sorts the elements using a basic sorting algorithm.

## How the Code Works

1. **User Input:** The program prompts the user to enter the size of the array and then takes input elements.
2. **Sorting Logic:** A nested `for` loop is used to sort the array in descending order.
3. **Output:** The sorted array is displayed using `Arrays.toString()`.

## Code Explanation

### Import Statements
```java
import java.util.Arrays;
import java.util.Scanner;
```
- `Scanner` is used to take user input.
- `Arrays` is used to print the sorted array in a readable format.

### Variables Used
- `size`: Stores the user-defined array size.
- `arr[]`: Stores user-input numbers.
- `temp`: A temporary variable used for swapping values.
- `i, j`: Loop variables for iteration.

### Code Walkthrough

#### 1. Taking User Input
```java
Scanner s = new Scanner(System.in);
System.out.println("Enter the Array Size");
int size = s.nextInt();
int arr[] = new int[size];
System.out.println("Enter the Elements");
for(int i = 0; i <= arr.length - 1; i++)
{
    arr[i] = s.nextInt();
}
```
- The user enters the size of the array.
- The `for` loop iterates from `0` to `size-1`, storing user-input values in the array.

#### 2. Sorting Logic (Descending Order)
```java
for(int i = 0; i <= arr.length - 1; i++)
{
    for(int j = 0; j <= i - 1; j++)
    {
        if(arr[j] < arr[i]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
```
- The **outer loop** (`i`) iterates through each element.
- The **inner loop** (`j`) compares elements before `i` to sort them.
- If `arr[j] < arr[i]`, a swap occurs to arrange elements in descending order.
- `temp` temporarily holds the value to facilitate swapping.

#### 3. Printing the Sorted Array
```java
System.out.println(Arrays.toString(arr));
```
- Displays the sorted array in a readable format.

## Example Execution
```
Enter the Array Size
5
Enter the Elements
10 5 8 3 1
[10, 8, 5, 3, 1]
```

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Sorting_Array_Program.git
```
