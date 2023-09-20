class ChickenThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Курица");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EggThread extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Яйцо");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

