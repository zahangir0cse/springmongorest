package com.zahangir.springmongorest.repository;

import com.zahangir.springmongorest.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findStudentByName(String name);
}
