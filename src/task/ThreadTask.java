package task;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class ThreadTask {
    public static void main(String[] args) throws InterruptedException {

        int[] arr = {1,2,4,3,15,6,7,21,9,10};
        MyThread t1 = new MyThread(arr);
        MyThread t2 = new MyThread(arr);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t1.getMax());
        System.out.println(t2.getMin());

    }
}

class MyThread extends Thread {

    private int[] arr;

    private int max;

    private int min;

    public MyThread(int[] arr) {
        this.arr = arr;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    @Override
    public void run() {
        this.max = stream(arr).max().getAsInt();
        this.min = stream(arr).min().getAsInt();
    }
}