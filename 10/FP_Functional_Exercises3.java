import java.util.List;

public class FP_Functional_Exercises3{
	public static void main(String[] args) {
		System.out.println("");
		List<String>courses = List.of("Spring", "Spring Boor", "API","Microservices","AWS", "PCF", "Azure", "Docker", "Kubernetes");
		String course = "Spring,Spring Boor,API,Microservices,AWS,PCF,Azure,Docker,Kubernetes";
		FP_Functional_Exercises3.all(courses);
	}	
	private static void all(List<String> courses){
		
		if (courses <= 3)
			System.out.println(courses);
    
	}	

}