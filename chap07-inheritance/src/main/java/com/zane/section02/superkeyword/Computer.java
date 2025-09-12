package com.zane.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        super();
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    /* Product의 private 필드에는 직접 접근이 불가능하므로 Product의 초기화 생성자를
     * 호출해서 값을 초기화 한다. */
    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        /* 위에서 작성 된 생성자를 this()로 호출한다는 것은 super()를 두 번 호출하는
         * 것과 같으므로 허용 되지 않는다. (명시적 생성자 호출은 1번만 가능) */
//        this(cpu, hdd, ram, operationSystem);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    /* 부모 필드에 직접 접근은 불가능하지만 getter, setter 메소드는 자신의 것처럼
     * 사용 가능하므로 자식 클래스에서 추가 된 필드에 대한 getter, setter만 작성한다. */

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInformation() {
        // this.code, super.code 로 직접 접근 불가 (private)
        // this.getCode(), super.getCode() 와 같이 메소드를 통해 간접 접근 가능 (public)
        // super.getInformation() -> Product에 정의 된 메소드
        // this.getInformation() -> Computer에 재정의 된 메소드
        return super.getInformation() + " "
                + cpu + " " + hdd + " " + ram + " " + operationSystem;
    }
}