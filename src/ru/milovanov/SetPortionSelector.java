package ru.milovanov;

import java.util.Iterator;
import java.util.Set;

public class SetPortionSelector<T> implements Iterator<T> {
    private final Set<String> mainSet;
    private final int portionSize;
    private int portionNumber=0;
    private boolean hasNext=true;

    public SetPortionSelector(Set<String> mainSet, int portionSize) {
        if(mainSet==null || mainSet.isEmpty())
            hasNext=false;
        this.mainSet = mainSet;
        this.portionSize = portionSize;
    }

    @Override
    public boolean hasNext() {
        return hasNext;
    }

    @Override
    public T next() {
        return null;
    }
}
