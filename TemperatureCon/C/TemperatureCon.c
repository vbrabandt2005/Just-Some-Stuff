/**
 * name: TemperatureCon
 * description:
 * Simple Temperature Converter in C
 * 
 * author: @TheGoogleRider
 * version: 0
 * date: 02/01/2024
**/

#include <stdio.h>
int main() {
    printf("TemperatureCon_1.0-C \n\n");

    int unit;
    printf("Enter '1' for Celsius \n");
    printf("Enter '2' for Fahrenheit \n");
    printf("Enter '3' for Kelvin\n");
    
    scanf("%d", &unit);
    printf("Your number is: %d", unit);

    return 0;}


