import java.util.concurrent.*;

class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("做一些耗时的任务...");
        Thread.sleep(5000);
        return "OK";
    }
}

class MyCallable1 implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("做一些耗时的任务...");
        Thread.sleep(9000);
        return "OK";
    }
}

public class FutureSimpleDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(new MyCallable());
        Future<String> future1 = executorService.submit(new MyCallable1());

        System.out.println("dosomething...");

        System.out.println("得到异步任务返回结果1：" + future.get());
        System.out.println("得到异步任务返回结果2：" + future1.get());
        System.out.println("Completed!");
    }
}