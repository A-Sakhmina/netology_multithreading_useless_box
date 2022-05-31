import box.Box;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Box box = new Box();

        Thread user = new Thread(null, box::openUp, "Пользователь");
        user.start();
        Thread.sleep(2000);

        Thread toy = new Thread(null, box::close, "Вредная игрушка");
        toy.start();

        user.join();
        toy.interrupt();
    }
}
