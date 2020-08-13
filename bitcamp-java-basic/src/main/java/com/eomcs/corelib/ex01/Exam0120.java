// Object 클래스 - toString() 메서드에 대하여
package com.eomcs.corelib.ex01;



public class Exam0120 {

  static class My // extends Object
  {

  }

  public static void main(String[] args) {

    My obj = new My();

    // Object에서 상속 받은 메서드
    //
    // 1) toString()
    //    - 클래스 정보를 간단히 출력한다.
    //    - 패키지명.클래스명@16진수해시값
    //    - 예) ch15.My1@1e81f4dc
    //
    System.out.println(obj.toString());
    // 해시값?
    // - 인스턴스 마다 부여된 고유의 식별자이다.
    // - 주의! 주소 아니다!
    // - 인스턴스가 같은지 검사할 때 사용할 수 있다.
    // - toString()을 재정의하지 않고 원래 메서드를 그대로 사용하면
    //   무조건 인스턴스마다 새 해시값이 부여된다.

    My obj2 = new My();
    My obj3 = new My();

    System.out.println(obj2 == obj3);
    System.out.println(obj == obj2);
    System.out.println(obj == obj3);

    System.out.println(obj2.toString());
    System.out.println(obj3.toString());

    System.out.println(obj.toString());

  }

}







