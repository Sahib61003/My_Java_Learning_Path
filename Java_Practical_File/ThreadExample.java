class NameThread implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Sahib Preet Singh is my name.");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class EnrollmentThread implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("My Enrollment number is 00713211621");
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SubjectThread implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("My Favorite subject is Mathematics");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread nameThread = new Thread(new NameThread());
        Thread enrollmentThread = new Thread(new EnrollmentThread());
        Thread subjectThread = new Thread(new SubjectThread());

        nameThread.start();
        enrollmentThread.start();
        subjectThread.start();

        try {
            Thread.sleep(10000); // Run the threads for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the threads after 10 seconds
        nameThread.interrupt();
        enrollmentThread.interrupt();
        subjectThread.interrupt();

        System.out.println("Done");
    }
}
