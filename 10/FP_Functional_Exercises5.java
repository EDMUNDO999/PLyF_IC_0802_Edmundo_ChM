import java.util.List;

public class FP_Functional_Exercises5{
	public static void main(String[] args) {
		List<String>courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Azure", "Docker", "Kubernetes");
		
		System.out.println("printCoursesAtLeastFourLetters: ");
		printCoursesAtLeastFourLetters(courses);
		System.out.println("");
	
	}	
	private static void print(String course){
		System.out.print(course + ", ");	
			}
		
	private static void printCoursesAtLeastFourLetters(List<String> courses){
                courses.stream()
        .forEach(course -> System.out.println("El curso" + course + "cuantos" + course.leght()+ "caracteres");
                System.out.println("");
        }
		

}