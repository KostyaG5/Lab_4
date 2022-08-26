package Lab4;
import java.time.LocalDate;
/**
 * Фамилия
 * Дата рождения
 * Место рождения
 * Амплуа
 * Количество игр
 * Количество желтых карточек 
 */


public class FootBaller {
	
	private String surname ;
	private LocalDate birthdate;
	private String birthPlace;
	private String role;
	private int amountOfGames;
	private double amountOfEllowCard;

	
	public FootBaller(String surname, LocalDate birthdate, String birthPlace, String role, int amountOfGames,
			double amountOfEllowCard) {
		
		this.surname = DateBase.getSurnames();
		this.birthdate = LocalDate.now().minusYears((int)((Math.random() * 14)+16));
		this.birthPlace = DateBase.getBirthPlaces();
		this.role = DateBase.getRoles();
		this.amountOfGames = ((int)((Math.random()*20)+10));
		this.amountOfEllowCard = ((int)(Math.random()*200));
	}
	
	

	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = DateBase.getSurnames();
	}
	
	public LocalDate getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = LocalDate.now().minusYears((int)((Math.random() * 14)+16));
	}
	
	public String getBirthPlace() {
		return birthPlace;
	}
	
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = DateBase.getBirthPlaces();
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = DateBase.getRoles();
	}
	
	public int getAmountOfGames() {
		return amountOfGames;
	}
	
	public void setAmountOfGames(int amountOfGames) {
		this.amountOfGames = ((int)((Math.random()*20)+10));
	}
	
	public double getAmountOfEllowCard() {
		return amountOfEllowCard;
	}
	
	public void setAmountOfEllowCard(double amountOfEllowCard) {
		this.amountOfEllowCard = ((int)(Math.random()*200));
	}

	@Override
	public String toString() {
		return "FootBaller : surname = " + surname + " , birthdate = " + birthdate + " , birthBplace = " + birthPlace
				+ " , role = " + role + " , amountOfGames = " + amountOfGames + " , amountOfEllowCard = " + (Math.ceil((amountOfEllowCard/amountOfGames))/10)
				+ " !";
	}
	
	
	
	
}
