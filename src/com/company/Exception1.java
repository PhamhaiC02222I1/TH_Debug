package com.company;

public class Exception1 {
    public void triangle1(int a, int b, int c) throws Exception {
        if (a < 0 && b < 0 && c < 0) {
            throw new Exception("Do dai phai lon hon 0");
        }
        if (a + b < c && a + c < b && b + c < a) {
            throw new Exception("Do dai hai canh phai lon hon canh con lai");
        }
    }
}