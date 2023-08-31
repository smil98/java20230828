package ch07extends.bookEx.sec03;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적: " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적: " + computer.areaCircle(r));
        //Override 통해서 Math의 PI 상수를 이용해 더 정확한 계산으로 면적 계산하는 프로그램
    }
}
