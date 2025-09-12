package com.zane.level01.basic;

public class Circle extends Shape implements Resizable {

    private double radius;   // 반지름 필드 추가

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;  // πr²
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;  // 2πr
    }

    @Override
    public void resize(double factor) {
        this.radius *= factor;
    }
}
