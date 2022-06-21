package com.tello.mutithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestMutiThreadPool implements Callable{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        List<Future> list = new ArrayList<Future>();
        for (int i = 0; i < 5; i++) {
            Callable a = new TestMutiThreadPool(i);
            Future f = pool.submit(a);
            list.add(f);
        }
        pool.shutdown();
        for (Future f:list) {
            System.out.println("get:"+(int)f.get());

        }
    }

    int a;
    TestMutiThreadPool(int a){
          this.a = a;
    }

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 5; i++) {
            a+=i;
            System.out.println(a);
            Thread.sleep(1000);
        }
        return a;
    }
}
