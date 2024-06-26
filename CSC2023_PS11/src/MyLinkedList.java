import java.util.AbstractList;
import java.util.Random;

public class MyLinkedList<E extends Comparable<E>> extends AbstractList<E> {

    private Node first, last;

    private Node getNode(int index) {
        Node current = first;
        for (int i = 1; i <= index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public E get(int index) {
        return (E) getNode(index).value;
    }

    @Override
    public int size() {
        Node current = first;
        int sizeCount = 0;
        while (current != null) {
            sizeCount++;
            current = current.next;
        }

        return sizeCount;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public boolean add(E val) {
        if (isEmpty()) {
            first = last = new Node(val);
        }
        else {
            last.next = new Node(val);
            last = last.next;
        }

        return true;
    }

    public E set(int index, E val) {
        Node current = getNode(index);
        current.value = val;

        return val;
    }

    public void swap(int idx) {
        if (idx < size()) {
            swap(idx + 1);
            E current = get(idx - 1);
            E last = get(idx);
            set(idx - 1, last);
            set(idx, current);
        }
    }

    public void add(int index, E val) {
        last.next = new Node(val);
        last = last.next;

        swap(index + 1);


    }

    public E remove(int index) {
        E save = get(index);

        if (index == 0) {
            first = first.next;
        } else if (index == size() - 1) {
            Node secondToLast = getNode(size() - 2);
            secondToLast.next = null;
            last = secondToLast;
        } else {
            Node prev = getNode(index - 1);
            prev.next = prev.next.next;
            last = prev;
        }
        return save;
    }

    public int indexOf(Object o) {
        Node current = first;
        Object currentVal = current.value;
        int count = 0;

        while (!(currentVal.equals(o)) && count < size()) {
            current = current.next;
            if (current == null) {
                count = -1;
                break;
            }
            else {
                currentVal = current.value;
                count++;
            }
        }

            return count;
    }

    public int lastIndexOf(Object o) {
        Node current = first;
        Object currentVal = current.value;
        int count = -1;

        for (int i = 0; i < size() - 1; i++) {
            if (o.equals(currentVal)) {
                count = i;
            }

            current = current.next;
            currentVal = current.value;
        }

        if (o.equals(get(size() - 1))) {
            count = size() - 1;
        }

        return count;
    }

    public void clear() {
        while (size() > 0) {
            remove(0);
        }

    }

    public String toString() {
        if (isEmpty()) {
            return "[ ]";
        }

        else {
            String list = "[";
            for (int i = 0; i < size() - 1; i++) {
                list += get(i) + ", ";
            }
            list += get(size() - 1) + "]";

            return list;
        }
    }

    public void swap(int idx1, int idx2) {
        Object current = (E) get(idx2);
        set(idx2, (E) get(idx1));
        set(idx1, (E) current);
    }

    public void shuffle(long seed) {
        Random rng = new Random(seed);
        for (int idx = 0; idx <= size() - 1; idx++) {
            int randomNum = rng.nextInt(size());
            swap(idx, randomNum);
        }
    }

    public void sort() {
        for (int i = 0; i < size() - 1; i++) {
            if (get(i + 1).compareTo(get(i)) < 0) {
                swap(i, i + 1);
                sort();
            }
        }
    }

    public void reverse() {
        int halfNum = size() / 2;
        for (int i = 0; i < halfNum; i++) {
            swap(i, size() - (i + 1));
        }
    }

    public int search() {
        E low = get(0);
        for (int i = 0; i < size() - 1; i++) {
            if (get(i).compareTo(low) < 0)
                low = get(i);
        }
        int lowIdx = indexOf(low);

        return lowIdx;
    }

    public E removeMinimum() {
        if (isEmpty()) {
            return null;
        }
        else {
            int idx = search();
            E removed = get(idx);
            remove(idx);

            return removed;
        }
    }

    public boolean containsMultiple(Object o) {
        int count = 0;
        for (Object obj : this) {
            if (obj.equals(o)) {
                count++;
                if (count > 1) {
                    return true;
                }
            }
        }

        return false;
    }

    public void removeDuplicates() {
        for (Object o : this) {
            while (containsMultiple(o)) {
                remove(lastIndexOf(o));
            }
        }
    }
}
