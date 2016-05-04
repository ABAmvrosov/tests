package net.aab.TestApps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsCheckedList {
    @SuppressWarnings("all")
    public static void main(String[] args) {
//        List list = new ArrayList();
        List list = Collections.checkedList(new ArrayList(), String.class);
        list.add("Hello");
        list.add(new Integer(0));
    }
}
