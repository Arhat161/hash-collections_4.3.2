package ru.netology;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Student> hashSet = new HashSet<>();

        String input = "";

        while (!input.equals("end")) {
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
            input = scanner.nextLine();
            String[] splitNameGroupId = input.trim().split(",");
            if (splitNameGroupId.length == 3) {
                String name = splitNameGroupId[0].trim();
                String group = splitNameGroupId[1].trim();
                String id = splitNameGroupId[2].trim();
                if (hashSet.add(new Student(name, group, id))) {
                    System.out.println("Студент добавлен!\n");
                } else {
                    System.out.println("\nОшибка добавления студента!");
                }
            }
        }

        if (hashSet.size() > 0) {
            System.out.println("Список студентов: ");
            for (Student student : hashSet) {
                System.out.println(student.getName() + ", " + student.getGroup() + ", " + student.getStudentId());
            }
        } else {
            System.out.println("Нет записей о студентах!");
        }
    }
}
