package com.zy.patterns.visitor;

import com.zy.patterns.iterator.visitor.*;
import org.junit.Test;

import java.util.Iterator;

public class VisitorTest {

    @Test
    public void ListVisitor() {
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

    @Test
    public void FileFindVisitor() {
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");

        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);

        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));

        Directory kala = new Directory("kala");
        Directory luo = new Directory("luo");
        Directory cc = new Directory("cc");
        usrDir.add(kala);
        usrDir.add(luo);
        usrDir.add(cc);

        kala.add(new File("k1.doc", 100));
        kala.add(new File("k2.doc", 200));
        kala.add(new File("k3.doc", 300));
        kala.add(new File("c1.txt", 100));
        kala.add(new File("c2.txt", 200));
        kala.add(new File("c3.txt", 300));

        FileFindVisitor docVisitor = new FileFindVisitor(".doc");
        rootDir.accept(docVisitor);
        Iterator<File> docIterator = docVisitor.getFoundFiles();
        while (docIterator.hasNext()) {
            System.out.println(docIterator.next().toString());
        }

        System.out.println("");

        FileFindVisitor txtVisitor = new FileFindVisitor(".txt");
        rootDir.accept(txtVisitor);
        Iterator<File> txtIterator = txtVisitor.getFoundFiles();
        while (txtIterator.hasNext()) {
            System.out.println(txtIterator.next().toString());
        }
    }
    @Test
    public void SizeVisitor() {
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");

        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);

        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));

        Directory kala = new Directory("kala");
        Directory luo = new Directory("luo");
        Directory cc = new Directory("cc");
        usrDir.add(kala);
        usrDir.add(luo);
        usrDir.add(cc);

        kala.add(new File("k1.doc", 100));
        kala.add(new File("k2.doc", 200));
        kala.add(new File("k3.doc", 300));
        kala.add(new File("c1.txt", 100));
        kala.add(new File("c2.txt", 200));
        kala.add(new File("c3.txt", 300));

        System.out.println(kala.getSize());
        System.out.println(rootDir.getSize());

    }

    @Test
    public void ElementArrayList() {
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");

        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);

        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));

        Directory kala = new Directory("kala");
        Directory luo = new Directory("luo");
        Directory cc = new Directory("cc");
        usrDir.add(kala);
        usrDir.add(luo);
        usrDir.add(cc);

        kala.add(new File("k1.doc", 100));
        kala.add(new File("k2.doc", 200));
        kala.add(new File("k3.doc", 300));
        kala.add(new File("c1.txt", 100));
        kala.add(new File("c2.txt", 200));
        kala.add(new File("c3.txt", 300));

        ElementArrayList list = new ElementArrayList();
        list.add(rootDir);
        list.add(kala);
        list.add(new File("etc", 100));
        list.accept(new ListVisitor());

    }
}
