import java.util.List;

public class FP_Functional_Exercises1{
	public static void main(String[] args) {
		List<String>courses = List.of("Spring", "Spring Boor", "API","Microservices","AWS", "PCF", "Azure", "Docker", "Kubernetes");
		FP_Functional_Exercises1.all(courses);
	}	
	private static void all(List<String> courses){
		System.out.println(courses);
		
	}	

}