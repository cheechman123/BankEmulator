package Practice2;

public interface MyList {
    void add(Object o);
    void clear();
    boolean remove(Object o);
    Object [] toArray();
    int size();
    boolean contains(Object o);
    boolean ContainsAll(MyList c);
}
