package com.zy.patterns.visitor;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor implements Visitor {

    private String suffix;

    private List<File> rs = new ArrayList<>();

    public FileFindVisitor(String suffix) {
        this.suffix = suffix;
    }

    public Iterator<File> getFoundFiles() {
        return rs.iterator();
    }

    @Override
    public void visit(File file) {
        if (StringUtils.endsWith(file.getName(), suffix)) {
            rs.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.accept(this);
        }
    }

}
