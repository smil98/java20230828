package ch09nested.book.exam13;

public class Chatting {
    class Chat {
        void start() {}
        void sendMessage(String message) {}
    }

    void startChat(String chatId) {
        String nickName = chatId;
//        nickName = charId(); local variable is effectively final

        Chat chat = new Chat() {
            @Override
            void start() {
                String inputData = "hi";
                String message = "[" + "nickname" + "]" + inputData;
                sendMessage(message);
            }
        };

        chat.start();
    }
}
