package primeiroJava;
import java.util.Calendar;


public class olaHora {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR);
		int minutes = c.get(Calendar.MINUTE);
		String periodo = "";
		if (hour >= 6 && hour < 12) {
			periodo = "Bom dia";
		} else if (hour <= 12 && hour > 18) {
			periodo = "Boa tarde";
		} else {
			periodo = "Boa noite";
		}
		
		
		System.out.printf("%s, no momento são %d:%d.",periodo, hour, minutes);

	}

}
