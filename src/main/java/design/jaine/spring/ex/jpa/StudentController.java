package design.jaine.spring.ex.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import design.jaine.spring.ex.jpa.domain.Student;
import design.jaine.spring.ex.jpa.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	// C, U, D
	@GetMapping("/jpa/student/create")
	@ResponseBody
	public Student createStudent() {
		Student student = studentService.addStudent("김인규", "010-1111-2222", "lec@hagulu.com", "개발자");
		return student;
	}
	
	@GetMapping("/jpa/lombok/test")
	@ResponseBody
	public Student lombokTest() {
//		Student student = new Student(10, "김인규", "010-1111-2222", "lecture@hagulu.com", "프로그래머", null, null);
//		student.setPhoneNumber("010-4444-9999");
		
		Student student = Student.builder()
				.name("김인규")
				.phoneNumber("010-1111-2222")
				.dreamJob("프로그래머")
				.email("lecture@hagulu.com")
				.build();
		
		return student;
	}
}
