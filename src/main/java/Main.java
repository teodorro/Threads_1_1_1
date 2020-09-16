public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Создаю потоки...");

        MyThread thread1 = new MyThread();
        thread1.setName("thread 1");
        MyThread thread2 = new MyThread();
        thread2.setName("thread 2");
        MyThread thread3 = new MyThread();
        thread3.setName("thread 3");
        MyThread thread4 = new MyThread();
        thread4.setName("thread 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(15000);

        System.out.println("Завершаю потоки...");
        thread1.interrupt();
        thread2.interrupt();
        thread3.interrupt();
        thread4.interrupt();
    }
}
