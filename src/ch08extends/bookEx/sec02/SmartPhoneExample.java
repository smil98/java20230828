package ch08extends.bookEx.sec02;
//pg. 286~287
public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "레드");

        //Reading Phone's field
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

        //SmartPhone's field
        System.out.println("와이파이 상태: " + myPhone.wifi);

        //Calling method from Phone
        myPhone.bell();
        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        myPhone.sendVoice("아 네, 반갑습니다.");
        myPhone.hangUp();

        //Calling method from SmartPhone
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
