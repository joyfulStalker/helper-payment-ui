package lsl.mint.test;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Desc TODO
 * @Author liuSongLin
 * @Date 2019/6/10 21:46
 * @Version 1.0v
 **/
@Slf4j
public class LambdaTest {

    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setCost(i + 1);
            student.setId(i);
            list.add(student);
        }
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setCost(i + 1);
            student.setId(i);
            list.add(student);
        }

        List<Student> students = list.stream().sorted(Comparator.comparing(Student::getId).reversed()).collect(Collectors.toList());
        log.info(students.toString());

        List<Student> collect = list.stream().distinct().collect(Collectors.toList());
        log.info(collect.toString());

        Map<Integer, List<Student>> map = list.stream().collect(Collectors.groupingBy(Student::getId));
        log.info(map.toString());


    }
}

@Data
class Student {

    private int id;

    private int cost;
}