package assignments;

public class Assignment1_DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float temp = 25.5f;
		boolean orderPlacement = true;
		String phoneNumber = "123-456-7890";//dt
		double balance = 1000.50;
		String email = "john.doe@example.com";
		double latitude = 37.7749,longitude = -122.4194;
		boolean maritalStatus = false;
		String occupation = "Software Engineer";
		String colour = "Blue";
		int year = 2023;
		long followers =1000000;
		
		float movieRating = 7.5f;
		char bloodType = 'A';
		String bookTitle = "To Kill a Mockingbird";
		short employeesCount = 500;
		String time = "2:30 PM";
		String country = "United States";
		String eyeColor = "Brown";
		String birthPlace = "New York City";
		float distance = 200.5f;
		
		//To print the statements of different data types using print methods.
		System.out.printf("Temperature of a city in degrees Celsius: %.1f%n",temp);
		System.out.println("Whether a customer has placed an order: "+orderPlacement);
		System.out.printf("Person's phone number: %s%n",phoneNumber);
		System.out.printf("Amount of money in a customer's bank account: %.2f%n",balance);
		System.out.printf("Person's email address: %s%n",email);
		System.out.printf("Coordinates of a location (latitude, longitude): %.4f, %.4f%n",latitude,longitude);
		System.out.printf("Person's marital status: %s%n",maritalStatus);
		System.out.printf("Person's occupation: %s%n",occupation);
		System.out.printf("Person's favourite colour: %s%n",colour);
		System.out.printf("Current year: %d%n",year);
		System.out.printf("Number of followers on a social media platform: %d%n",followers);
		System.out.printf("Rating of a movie: %.1f%n",movieRating);
		System.out.printf("Person's blood type: %c%n",bloodType);
		System.out.printf("Title of a book: %s%n",bookTitle);
		System.out.println("Number of employees in a company: "+employeesCount);
		System.out.println("Time of an event: "+time);
		System.out.printf("Name of a country: %s%n",country);
		System.out.println("Person's eye color: "+eyeColor);
		System.out.println("Person's birthplace: "+birthPlace);
		System.out.printf("Distance between two cities: %.1f",distance);

	}

}
