
public class PersonMain {

	public class Person {
	//global variable
		private String name;
		private int age;
		private String address;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public static void main(String[] args) {
		//ClassName objectName = new ClassName();
		
		
		
		Person person1=new Person();
		person1.setName("Rahul");
		person1.setAge(40);
		person1.setAddress("panipat");
		System.out.println("Name: " + getName())
	}
}
