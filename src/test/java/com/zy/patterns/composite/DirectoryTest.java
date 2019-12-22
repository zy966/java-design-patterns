package com.zy.patterns.composite;

import org.junit.Test;

public class DirectoryTest {

    @Test
    public void printList() {
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

        rootDir.printList();
    }

    @Test
    public void getFullName() {
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory usrDir = new Directory("usr");

        rootDir.add(usrDir);
        rootDir.add(binDir);

        File vi = new File("vi", 10000);
        binDir.add(vi);

        System.out.println(vi.getFullName());

        Directory kala = new Directory("kala");
        usrDir.add(kala);

        File k1 = new File("k1.doc", 100);
        kala.add(k1);

        System.out.println(kala.getFullName());
        System.out.println(k1.getFullName());
    }

}
