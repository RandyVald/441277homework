import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import stream.Stream;
import stream.StreamComporator;
import stream.StreamService;
import student.Student;
import student_group.StudentGroup;

public class program {

    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup();

        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);

        studentGroup.addStudent(van);
        studentGroup.addStudent(igor);
        studentGroup.addStudent(alex);
        studentGroup.addStudent(alexey);

        StudentGroup studentGroup2 = new StudentGroup();

        Student van2 = new Student("Van2", 4);
        Student igor2 = new Student("Igorechick2", 1);
        Student alex2 = new Student("Alex2", 2);
        Student alexey2 = new Student("Alexey2", 3);

        studentGroup2.addStudent(van2);
        studentGroup2.addStudent(igor2);
        studentGroup2.addStudent(alex2);
        studentGroup2.addStudent(alexey2);

        // System.out.println("студенты " + studentGroup.students);
        // Iterator<Student> iterator = new StudentGroupIterator(studentGroup);

        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }

        for (Student student : studentGroup) {
            System.out.println(student);
        }

        ArrayList<Student> arrayList = new ArrayList<>(List.of(van, igor, alex, alexey));

        System.out.println(arrayList);

        // public int compare(Student o1, Student o2) {
        // return o1.id - o2.id;
        // }
        Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id); // лямда выражение

        // Collections.sort(arrayList, new StudentComparator()); // сортировка, второй
        // аргумент обратная сортировка
        System.out.println(arrayList);

        // Реализация ДЗ
        System.out.println();
        System.out.println(" =================== Реализация дз =======================");
        System.out.println(" =================== task1 ===============================");
        System.out.println();

        Stream stream = new Stream("Поток 1");
        stream.addGroup(studentGroup);
        stream.addGroup(studentGroup2);

        Iterator<StudentGroup> iteratorGroup = stream;

        while (iteratorGroup.hasNext()) {
            System.out.println(iteratorGroup.next());
        }

        // task2
        System.out.println();
        System.out.println(" ==================== task2 ==============================");
        System.out.println();

        Stream stream2 = new Stream("Поток 2");
        stream2.addGroup(studentGroup);
        // stream2.addGroup(studentGroup2);
        // stream2.addGroup(studentGroup);

        List<Stream> listStream = new ArrayList<>();
        listStream.add(stream);
        listStream.add(stream2);
        System.out.println(listStream);
        listStream.sort(new StreamComporator());
        System.out.println(listStream);

        // task3
        System.out.println();
        System.out.println(" ==================== task3 ==============================");
        System.out.println();

        List<Stream> listStream2 = new ArrayList<>();
        listStream2.add(stream);
        listStream2.add(stream2);
        listStream2.add(stream);
        System.out.println(listStream2);
        StreamService.StremSort(listStream2);
        System.out.println(listStream2);

        System.out.println();

    }

}