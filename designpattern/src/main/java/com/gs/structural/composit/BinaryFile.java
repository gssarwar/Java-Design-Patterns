package com.gs.structural.composit;

//Leaf node in composite pattern
public class BinaryFile extends File{

    private long size ;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }

    @Override
    public void addFile(File file) {
        throw  new UnsupportedOperationException("leaf node does not supports add operation");
    }

    @Override
    public File[] getFiles() {
        throw  new UnsupportedOperationException("leaf node does not supports add operation");
    }

    @Override
    public boolean removeFile(File file) {
        throw  new UnsupportedOperationException("leaf node does not supports add operation");
    }
}
