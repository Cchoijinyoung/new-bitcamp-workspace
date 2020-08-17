//# 캡슐화 문법 사용 후 - 개발자가 특정 필드를 직접 접근하지 못하게 막기
package com.eomcs.oop.ex07.a;

class Score33 {
  String name;
  int kor;
  int eng;
  int math;

  private int sum;
  private float aver;

  public int getSum() {
    return this.sum;

  }

  public float getAver() {
    return this.aver;
  }

  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}

public class Exam210 {
  public static void main(String[] args) {
    Score33 s1 = new Score33();
    s1.name = "ghdrlfehd";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;

    s1.compute();

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        s1.name, s1.kor, s1.eng, s1.math, s1.getSum(), s1.getAver());
  }
}










