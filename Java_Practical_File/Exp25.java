public class Exp25 {
    public static void main(String[] args) {
        final Data data = new Data();

        
        Thread producerThread = new Thread(new Producer(data));
        Thread consumerThread = new Thread(new Consumer(data));

        producerThread.start();
        consumerThread.start();
    }
    static class Data {
        private boolean flag = false; 
        private int value;
        public synchronized void produce(int num) {
            while (flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            value = num; 
            System.out.println("Produced: " + value);
            flag = true; 
            notify(); 
        }
        public synchronized int consume() {
            while (!flag) {
                try {
                    wait(); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Consumed: " + value);
            flag = false; 
            notify(); 
            return value;
        }
    }
    static class Producer implements Runnable {
        private final Data data;

        public Producer(Data data) {
            this.data = data;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                data.produce(i);
            }
        }
    }
    static class Consumer implements Runnable {
        private final Data data;

        public Consumer(Data data) {
            this.data = data;
        }
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                data.consume();
        
            }
        System.out.println("Sahib Preet Singh 00713211621 AI_ML");
        }
    }
}
