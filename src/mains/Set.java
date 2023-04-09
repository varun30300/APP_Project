package mains;

import java.util.*;

public class Set<T extends Identifiable> {

    private Map<Integer, T> map; // Use a map to store the elements
    private int size;

    public Set() {
        map = new HashMap<>();
        size = 0;
    }

    public void add(T element) {
        if (!map.containsKey(element.getID())) {
            map.put(element.getID(), element);
            size++;
        }
        else
        	System.out.println("The id of the element is already in the set");
    }

    public T remove(int id) {
        T element = map.get(id);
        if (element != null) {
            map.remove(id);
            size--;
        }
        return element;
    }

    public boolean peek(int id) {
        return map.containsKey(id);
    }

    public int size() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Set) {
            Set<T> other = (Set<T>) o;
            if (size() == other.size()) {
                for (T element : map.values()) {
                    if (!other.peek(element.getID())) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (T element : map.values()) {
            System.out.println(element.toString());
        }
    }
}

interface Identifiable {
    int getID();
}
