package ch07extends.bookEx.sec07.exam11;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }
    /*
    * public void stop() {
    * sout("스포츠카를 멈춤");
    * speed =0;
    * }
    * */
}
