package Lab4;
import java.time.LocalDate;
public class Main {

	private static final int NUMBER_OF_FOOTBALLERS = 5;
	private static final int NUMBER_OF_EMPLOYEES = 5;

	public static void main(String[] args) {
		
		//Task1();
		//Task2();
	}

	public static void Task1() {
		
		/**
		    Вывести данные о работниках старших 30-ти лет, не
            имеющих высшего образования.
		 */
		
		
		WorkWoman[] workwomans = new WorkWoman[NUMBER_OF_EMPLOYEES];
		for(int i = 0 ; i < NUMBER_OF_EMPLOYEES ; i++) {
			WorkWoman workwoman = new WorkWoman(DateBase.getSurnames() , ((int) ((Math.random() * 27)+18)) , DateBase.getPosts() , DateBase.getEducations());
			workwomans[i] = workwoman ;
		//	System.out.println(workwomans[i]);
			
		}
		for(int i = 0 ; i < workwomans.length ; i++) {
			if(workwomans[i].getAge() > 30 && !workwomans[i].getЕducation().equals("Secondary") ) {
				System.out.println(workwomans[i]);
			}
			
		}
	
	}
	
	public static void Task2() {
		
		/**
	    Вывести сведения о футболистах, старших 20 лет и
        получающих не более 1 карточки за 10 игр.
	 */
		
		
		FootBaller[] footBallers = new FootBaller[NUMBER_OF_EMPLOYEES];
		for(int i = 0 ; i < NUMBER_OF_FOOTBALLERS ; i++) {
			FootBaller footBaller = new FootBaller(DateBase.getSurnames() , LocalDate.now().minusYears((int)((Math.random() * 14)+16)) , DateBase.getBirthPlaces() , DateBase.getRoles() , ((int)((Math.random()*20)+10)) , ((int)(Math.random()*200)));
			footBallers[i] = footBaller ;
			
		//System.out.println(footBallers[i]);
		
		}
		
		for(int i = 0 ; i < footBallers.length ; i++) {
			if(LocalDate.now().getYear() - footBallers[i].getBirthdate().getYear() > 20 && ((Math.ceil(footBallers[i].getAmountOfEllowCard()))/(10)/10) < 1) {
				System.out.println(footBallers[i]);
			}
		
		
	}
	
	}	
}
