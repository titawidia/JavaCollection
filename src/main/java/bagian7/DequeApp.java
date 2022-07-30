package bagian7;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>(); // tumpukan

        stack.offerLast("Aera");
        stack.offerLast("Hye");
        stack.offerLast("Ren");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>(); // antrian
        queue.offerLast("Aera");
        queue.offerLast("Hye");
        queue.offerLast("Ren");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
