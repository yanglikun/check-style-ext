package com.puppycrawl.tools.checkstyle.checks.design.visibilitymodifier;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class StringEntrySet {
    private final Set<Map.Entry<Integer,Integer>> s;
    public StringEntrySet(Set<Map.Entry<Integer,Integer>> s) {this.s = s;}
    public Iterator<Map.Entry<String,String>> iterator() {
        return new Iterator<Map.Entry<String,String>>() {
            Iterator<Map.Entry<Integer,Integer>> i = s.iterator();
            public boolean hasNext() {return i.hasNext();}
            public Map.Entry<String,String> next() {
                return null;
            }
            public void remove() {i.remove();}
        };
    }
}
    

