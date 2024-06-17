package stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import student_group.StudentGroup;

public class Stream implements Iterator<StudentGroup> {

    List<StudentGroup> streamGroups;
    int index;
    String name;

    public Stream(String name) {
        streamGroups = new ArrayList<>();
        index = 0;
        this.name = name;

    }

    public void addGroup(StudentGroup group) {
        streamGroups.add(group);
    }
    

    @Override
    public boolean hasNext() {
        return index < streamGroups.size();
    }

    @Override
    public StudentGroup next() {
       return streamGroups.get(index++);
    }

    @Override
    public String toString() {
        return name;
    }


 
}

