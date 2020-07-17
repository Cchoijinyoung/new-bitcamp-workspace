

//주제 : 메모리 크기에 따른 부동소수점의 크기

package com.eomcs.basic.ex03;

class Exam0340 { 
    public static void main(String[] args) {
        // 4바이트 메모리에 부동소수점 저장하기
        System.out.println(999.9999f);
        System.out.println(999999.9f);
        System.out.println(9.999999f);
        // 4바이트 메모리는 최대 7자리의 부동소수점을 저장할 수 있다.
        System.out.println(999.99994f);
        System.out.println(9999999.4f);
        System.out.println(9.9999994f);     
        //메모리 크기를 넘는 값은 반올림 처리되어 저장된다.
        System.out.println(987654321.1234567f);
        System.out.println(987654321123456.7f);
        System.out.println(9.876543211234567f);   
        // 8바이트 메모리에 부동소수점 저장하기
        // 8바이트 메모리에는 최대 16자리의 부동소수점을 저장할 수 있다.
        // 초과하면 잘린다.
        System.out.println(987654321.12345678);
        System.out.println(9876543211234567.8);
        System.out.println(9.8765432112345678); 

        //유효자릿수
        // - 소수점을 제외한 숫자의 갯수

        // 4바이트 메모리에는 최대 7자리, 8바이트는 16자리, 초과하면 반올림 or 잘림.
        // 유효자릿수라 하더라도 100% 정확하지는 않다.
        // 왜? IEEE 754 규격에 따라 2진수로 전환할 때 일부 값은 정확하게 변환되지 않는 경우도 있기 때문.

        //부동소수점의 일부는 2진수를 정확하게 변환할 수 없다.
        System.out.println(7 * 0.1); //예상 값 = 0.7  -------> 0.700000000000001



        
    }
} 

