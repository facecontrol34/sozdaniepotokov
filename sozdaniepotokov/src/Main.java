
public class Main extends Thread{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            (new myThread()).start();
        }
        (new Main()).start();
    }

    @Override
    public void run() {
        System.out.println("Main current");
    }
}

