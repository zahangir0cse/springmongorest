package com.zahangir.springmongorest.service;
import com.zahangir.springmongorest.model.Student;
import com.zahangir.springmongorest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(String id) {
        studentRepository.delete(id);
    }

    @Override
    public Student getStudentByName(String name) {
        return studentRepository.findStudentByName(name);
    }
}
