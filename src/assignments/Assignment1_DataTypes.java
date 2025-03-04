package assignments;

public class Assignment1_DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//To print the statements related to different data types using print methods.
		
		//1. Temperature of a city in degrees Celsius: 25.5
		float temparature = 25.5f;
		System.out.format("1. Temperature of a city in degrees Celsius: %.1f%n",temparature);
		System.out.printf("1. Temperature of a city in degrees Celsius: %.1f%n",temparature);
		
		//2. Whether a customer has placed an order: true
		boolean orderPlacement = true;
		System.out.println("2. Whether a customer has placed an order: "+orderPlacement);
		
		//3. Person's phone number: "123-456-7890"
		String phoneNumber = "123-456-7890";
		System.out.printf("3. Person's phone number: %s%n",phoneNumber);
		
		//4. Amount of money in a customer's bank account: 1000.50
		double balance = 1000.50;
		System.out.format("4. Amount of money in a customer's bank account: %.2f%n",balance);
		
		//5. Person's email address: "john.doe@example.com"
		String email = "john.doe@example.com";
		System.out.printf("5. Person's email address: %s%n",email);
		
		//6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194
		double latitude = 37.7749,longitude = -122.4194;
		System.out.printf("6. Coordinates of a location (latitude, longitude): %.4f, %.4f%n",latitude,longitude);
		
		//7. Person's marital status: true or false
		boolean maritalStatus = false;
		System.out.printf("7. Person's marital status: %s%n",maritalStatus);
		
		//8. Person's occupation: "Software Engineer"
		String occupation = "Software Engineer";
		System.out.printf("8. Person's occupation: %s%n",occupation);
		
		//9. Person's favourite colour: "Blue"
		String colour = "Blue";
		System.out.printf("9. Person's favourite colour: %s%n",colour);
		
		//10.Current year: 2023
		int year = 2023;
		System.out.printf("10.Current year: %d%n",year);
		
		//11.Number of followers on a social media platform: 1,000,000
		int followers =1000000;
		System.out.printf("11.Number of followers on a social media platform: %d%n",followers);
		
		//12.Rating of a movie: 7.5
		float movieRating = 7.5f;
		System.out.printf("12.Rating of a movie: %.1f%n",movieRating);
		
		//13.Person's blood type: 'A'
		char bloodType = 'A';
		System.out.printf("13.Person's blood type: %c%n",bloodType);
		
		//14.Title of a book: "To Kill a Mockingbird"
		String bookTitle = "To Kill a Mockingbird";
		System.out.printf("14.Title of a book: %s%n",bookTitle);
		
		//15.Number of employees in a company: 500
		short employeesCount = 500;
		System.out.println("15.Number of employees in a company: "+employeesCount);
		
		//16.Time of an event: 2:30 PM
		String time = "2:30 PM";
		System.out.println("16.Time of an event: "+time);
		
		//17.Name of a country: "United States"
		String country = "United States";
		System.out.printf("17.Name of a country: %s%n",country);
		
		//18.Person's eye color: "Brown"
		String eyeColor = "Brown";
		System.out.println("18.Person's eye color: "+eyeColor);
		
		//19.Person's birthplace: "New York City"
		String birthPlace = "New York City";
		System.out.println("19.Person's birthplace: "+birthPlace);
		
		//20.Distance between two cities: 200.5
		float distance = 200.5f;
		System.out.printf("20.Distance between two cities: %.1f",distance);

	}

}
