package design.jaine.spring.ex.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import design.jaine.spring.ex.jpa.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	// 1행 insert 
}
