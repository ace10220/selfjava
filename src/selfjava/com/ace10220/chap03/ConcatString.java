package com.ace10220.chap03;

public class ConcatString {
    public static void main(String[] args) {
        var result = "";
        for (var i = 0; i < 100000; i++) {
            result += "いろは";
        }
    }
}
