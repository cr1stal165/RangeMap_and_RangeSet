package vsu.ru.silnov;

public class RangeSet<T>{

    private final Boolean EXIST = true;
    private final RangeMap<Range, Boolean> map = new RangeMap<>();
    private Range range;

    public boolean contains(int o) {
        return range.contains(o);
    }

    public boolean add(T t) {
        if (map.containsKey((Range) t)) {
            return false;
        }
        map.put((Range) t, EXIST);
        return true;
    }

    public boolean remove(T o) {
        if (map.containsKey((Range) o)) {
            map.remove((Range) o);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "" + map.toString();
    }
}