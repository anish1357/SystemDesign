package Structural.Composite;

import java.util.Arrays;
import java.util.List;

public class File implements FileSystem{

    public String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(this.getName());
    }
}
