package Department;

import java.util.HashMap;
import java.util.Map;

import Person.Person;
import Teacher.Teacher;

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.FileSystemAlreadyExistsException;

public class Department {
    private String id;
    private String name;
    private Map<String, Person> members;
    private Teacher dean;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
        this.members = new HashMap<>();
    }

    // Getters and setters for instance variables

    public void addMember(Person person){
        if (this.id != null) {
            
        }

        if (members.containsKey(((Person) person).getId())) {
            
        }

        members.put(person.getId(), person);
    }

    public void setDean(Teacher dean) throws DeanNotInDepartmentException {
        if (!members.containsKey(dean.getId())) {
            throw new DeanNotInDepartmentException();
        }
        this.dean = dean;
    }

    public void saveMembersToFile(String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            for (Person member : members.values()) {
                writer.write(member.toString() + "\n");
            }
        }
    }
}


