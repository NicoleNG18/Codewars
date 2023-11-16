package com.company;

public class NumberOfTrailingZerosOfN {
        public static int zeros(int n) {
            long number =1L;
            int count=0;

            while(n>1){
                number*=n;
                n--;
            }

            while(number%10 == 0){
                number/=10;
                count++;
            }

            return count;
        }
    }

