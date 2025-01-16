package Structural.Composite;

import java.util.ArrayList;
import java.util.List;


public class Directory implements FileSystem{
    public String name;
    public List<FileSystem> resourceList ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(FileSystem fs){
        resourceList.add(fs);
    }
    public Directory(String name) {
        this.name = name;
        this.resourceList = new ArrayList<>();
    }

    @Override
    public void ls() {
        System.out.println(this.getName());
        resourceList.forEach(resource -> resource.ls());
    }
}
