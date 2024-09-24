package org.example.tarea3_20210779.repository;

import org.example.tarea3_20210779.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    // Puedes agregar métodos personalizados aquí si es necesario
}
