package zane.ex1.poly;


public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();
        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}

//자동차를 운전합니다.
//K3Car.startEngine
//K3Car.pressAccelerator
//K3Car.offEngine