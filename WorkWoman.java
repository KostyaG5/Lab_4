package Lab4;


/**
 * Фамилия
 * Возраст
 * Должность
 * Образование
 */


public class WorkWoman {
	
	private String surname ;
	private int age ;
	private String post ;
	private String еducation ;
	
	
	
public WorkWoman(String surname, int age, String post, String еducation) {
		
		this.surname = DateBase.getSurnames();
		this.age = ((int) ((Math.random() * 27)+18));
		this.post = DateBase.getPosts();
		this.еducation = DateBase.getEducations();
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = DateBase.getSurnames();
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = ((int) ((Math.random() * 27)+18)) ;
	}
	
	public String getPost() {
		return post;
	}
	
	public void setPost(String post) {
		this.post = DateBase.getPosts();
	}
	
	public String getЕducation() {
		return еducation;
	}
	
	public void setЕducation(String еducation) {
		this.еducation = DateBase.getEducations();
	}
	
	
	@Override
	public String toString() {
		return "WorkWoman : Surname = " + surname + " , age = " + age + " , post = " + post + " , еducation = " + еducation + " ! ";
	} 

	
	
	
	
	
}
