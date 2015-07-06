package com.github.karmazyn.duplicates;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.LinkedList;
import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.Test;

/**
 * Created by m.karmazyn on 06/07/15.
 */
public class DistinctFilterTest {

    private DistinctFilter distinctFilter = new DistinctFilter();

    @Test
    public void shouldLeaveEmptyList() {
        List<Person> list = new LinkedList<>();
        distinctFilter.filter(list);
        assertThat(list).isEmpty();
    }

    @Test
    public void shouldLeaveSingleElement() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("kacper", 1));
        list.add(new Person("kacper", 1));
        distinctFilter.filter(list);
        assertThat(list).hasSize(1);
    }

    @Test
    public void shouldRemoveNeighbourDuplicate() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        distinctFilter.filter(list);
        assertThat(list).hasSize(1);
    }

    @Test
    public void shouldRemoveFarDuplicate() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        distinctFilter.filter(list);
        assertThat(list).hasSize(2).containsExactly(1, 2);
    }

    @Test
    public void shouldRemoveSeveralDuplicates() {
        List<Integer> list = Lists.newArrayList(1, 2, 2, 1, 1, 1, 3, 1);
        distinctFilter.filter(list);
        assertThat(list).hasSize(3).containsExactly(1, 2, 3);

    }
}