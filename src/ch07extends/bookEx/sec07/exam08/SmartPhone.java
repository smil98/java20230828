package ch07extends.bookEx.sec07.exam08;

public class SmartPhone extends Phone{
    SmartPhone(String owner) {
        super(owner);
    }

    void internetSearch() {
        System.out.println("인터넷으로 검색합니다.");
    }
}


