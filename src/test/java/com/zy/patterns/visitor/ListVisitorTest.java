package com.zy.patterns.visitor;

import com.zy.patterns.iterator.visitor.Directory;
import com.zy.patterns.iterator.visitor.File;
import com.zy.patterns.iterator.visitor.ListVisitor;
import org.junit.Test;

public class ListVisitorTest {

    @Test
    public void visit() {
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");

        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);

        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));

        rootDir.accept(new ListVisitor());

        System.out.println("");

        Directory kala = new Directory("kala");
        Directory luo = new Directory("luo");
        Directory cc = new Directory("cc");
        usrDir.add(kala);
        usrDir.add(luo);
        usrDir.add(cc);

        kala.add(new File("k1.doc", 100));
        kala.add(new File("k2.doc", 200));
        kala.add(new File("k3.doc", 300));

        rootDir.accept(new ListVisitor());
    }

}
