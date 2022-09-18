package vsu.ru.silnov;

import java.util.ArrayList;

public class Range {

    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int newEnd) {
        this.end = newEnd;
    }

    public void setStart(int newStart) {
        this.start = newStart;
    }

    public boolean contains(int i) {
        return start <= i & i <= end;
    }

    @Override
    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = getStart(); i <= getEnd(); i++){
            list.add(i);
        }
        return "" + list;
    }
}