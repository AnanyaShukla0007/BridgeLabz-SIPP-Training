import java.util.*;

class FindMedianFromStream {
    PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> large = new PriorityQueue<>();

    public void addNum(int num) {
        small.add(num);
        large.add(small.poll());
        if (small.size() < large.size()) small.add(large.poll());
    }

    public double findMedian() {
        if (small.size() == large.size()) return (small.peek() + large.peek()) / 2.0;
        return small.peek();
    }

    public static void main(String[] args) {
        FindMedianFromStream medianFinder = new FindMedianFromStream();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian()); // 1.5
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian()); // 2.0
    }
}