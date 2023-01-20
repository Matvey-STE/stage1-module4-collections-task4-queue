package com.epam.collections.queue;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        int i;
        for (i = 1; i <= numberOfDishes; i++) {
            list.add(i);
        }
        LinkedList<Integer> queue = new LinkedList<>();
        int step = everyDishNumberToEat - 1;
        int j = 0;
        while (!list.isEmpty()) {
            j = (j + step) % list.size();
            int n = list.remove(j);
            queue.add(n);
        }
        return queue;
    }
}
