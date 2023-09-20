public class ChickenAndEgg {
    public static void main(String[] args) {
        ChickenThread chickenThread = new ChickenThread();
        EggThread eggThread = new EggThread();

        chickenThread.start();
        eggThread.start();

        try {
            chickenThread.join();
            eggThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (chickenThread.getState() == Thread.State.TERMINATED) {
            System.out.println("Последним словом сказала курица!");
        } else if (eggThread.getState() == Thread.State.TERMINATED) {
            System.out.println("Последним словом сказало яйцо!");
        }
    }
}
