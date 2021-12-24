

public class mainThread implements Runnable{

    Thread monster;
    Thread flower;
    mainThread() {
       monster = new Thread(this);
       flower = new Thread(this);
    }

    public void run() {

        if (Thread.currentThread() == flower) {
          System.out.println("队伍寻找蓝光草");
          monster.start();
            try {
                monster.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("队伍已经收集完所有的蓝光草");
            System.out.println("队伍完成了任务");
        }

        if (Thread.currentThread() == monster) {
            System.out.println("怪物出现，需要杀怪");
            System.out.println("怪物清除完毕");
        }

    }

}
