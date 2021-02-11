package moegaddon.code;

import java.util.*;

public class HashSetNoNulls<E> extends AbstractSet<E> {
    private final transient HashMap<E, Object> map;
    private static final Object OBJECT = new Object();

    public HashSetNoNulls() {
        map = new HashMap<>();
    }

    public HashSetNoNulls(Collection<? extends E> c) {
        map = new HashMap<>(Math.max((int) (c.size() / .75f) + 1, 16));
        addAll(c);
    }

    @SafeVarargs
    public HashSetNoNulls(boolean aDummyParameter, E... aArray) {
        this(Arrays.asList(aArray));
    }

    public HashSetNoNulls(int initialCapacity, float loadFactor) {
        map = new HashMap<>(initialCapacity, loadFactor);
    }

    public HashSetNoNulls(int initialCapacity) {
        map = new HashMap<>(initialCapacity);
    }

    HashSetNoNulls(int initialCapacity, float loadFactor, boolean dummy) {
        map = new LinkedHashMap<>(initialCapacity, loadFactor);
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public boolean add(E e) {
        return e != null && map.put(e, OBJECT) == null;
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == OBJECT;
    }

    @Override
    public void clear() {
        map.clear();
    }
}
