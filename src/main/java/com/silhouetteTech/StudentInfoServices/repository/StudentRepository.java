package com.silhouetteTech.StudentInfoServices.repository;

import com.silhouetteTech.StudentInfoServices.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;


@Repository
public interface StudentRepository extends CrudRepository<Student, Serializable> {

}
