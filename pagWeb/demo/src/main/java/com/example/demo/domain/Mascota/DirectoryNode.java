package com.example.demo.domain.Mascota;
import java.util.ArrayList;

import java.util.List;



public class DirectoryNode implements FileSystemNode {

    private final String name;

    private final List<FileSystemNode> children = new ArrayList<>();

    public DirectoryNode(String name) { this.name = name; }



    public void add(FileSystemNode node) { children.add(node); }

    public void remove(FileSystemNode node) { children.remove(node); }

    public List<FileSystemNode> getChildren() { return List.copyOf(children); }



    @Override

    public String getName() { return name; }



    @Override

    public void print(String indent) {

        System.out.println(indent + "+ " + name);

        String childIndent = indent + "  ";

        for (FileSystemNode child : children) {

            child.print(childIndent);

        }

    }

}



