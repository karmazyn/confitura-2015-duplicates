package com.github.karmazyn.duplicates;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by m.karmazyn on 06/07/15.
 */
public class DistinctFilter {
    public <E> void filter(List<E> list) {
        if(list != null) {
            Iterator<E> iterator = list.iterator();
            Set<E> cache = new HashSet<>();
            while (iterator.hasNext()) {
                E next = iterator.next();
                if(cache.contains(next)) {
                    iterator.remove();
                } else {
                    cache.add(next);
                }
            }
        }
    }
}
