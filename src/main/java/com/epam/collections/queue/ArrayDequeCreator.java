package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> list = new ArrayDeque<>();
        list.addLast(Objects.requireNonNull(firstQueue.poll()));
        list.addLast(Objects.requireNonNull(firstQueue.poll()));
        list.addLast(Objects.requireNonNull(secondQueue.poll()));
        list.addLast(Objects.requireNonNull(secondQueue.poll()));

        while (!(firstQueue.isEmpty() || secondQueue.isEmpty())){
            firstQueue.add(list.pollLast());
            list.addLast(Objects.requireNonNull(firstQueue.poll()));
            list.addLast(Objects.requireNonNull(firstQueue.poll()));
            secondQueue.add(list.pollLast());
            list.addLast(Objects.requireNonNull(secondQueue.poll()));
            list.addLast(Objects.requireNonNull(secondQueue.poll()));
        }
    return list;
    }
}
