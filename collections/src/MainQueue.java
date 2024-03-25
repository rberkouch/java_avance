import java.util.ArrayDeque;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(3);
        queue.add(2);
        queue.add(1);
        // 3 <- 2 -< 1
        //queue.add(5);
        queue.offer(5);
        // 3 <- 2 <- 1 <- 5
        System.out.println(queue);
        //var result = queue.element();
        var result = queue.peek();
        System.out.println(result);
        //queue.remove(result);
        queue.poll();
        System.out.println(queue);

    }
}
