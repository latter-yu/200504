import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPriorityQueue {

    public static void main1(String[] args) {
        //Java 内置的优先级队列 PriorityQueue （默认小堆）
        //用 Comparator 实现大堆

        //创建一个匿名内部类（不知道类名，但知道实现了 Comparator 接口）
        // lambda 表达式：相当于一个匿名的方法
        PriorityQueue<Integer> queue = new PriorityQueue<>((Comparator<Integer>) (o1, o2) -> o2 - o1);
        queue.offer(9);
        queue.offer(6);
        queue.offer(3);
        queue.offer(7);
        queue.offer(4);
        queue.offer(1);
        queue.offer(8);

        while (!queue.isEmpty()) {
            Integer cur = queue.poll();
            System.out.println(cur);
        }
    }


}
