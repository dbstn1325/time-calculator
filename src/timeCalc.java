import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Date;


public class timeCalc {

	public static void main(String[] args) {
		Calendar time =Calendar.getInstance();
		
		int hour = time.get(Calendar.HOUR_OF_DAY);
		int minute = time.get(Calendar.MINUTE);
		int restHour = 0;
		int restMin = 60 - minute;
		String name;
		String owner = "정윤수";
		
		
		SimpleDateFormat timeHM = new SimpleDateFormat("HH:mm");
		String dateD = timeHM.format(time.getTime());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();
		
		
		if(hour>0) {
			restHour = (24-hour) - 1;
		}else {
			;
		}
		
		if(name.equals(owner)) {
			System.out.println("환영합니다 ♥");
			String separateDay = null;
			if(hour < 12) {
				separateDay = "아침";
			}else if(hour < 19){
				separateDay = "점심";
			}else if(hour < 24) {
				separateDay = "저녁";
			}
			System.out.println(separateDay + " "+ dateD + "분에 오셨네요ㅎㅎ");
			System.out.println("오늘의 남은 시간은 " + restHour + "시간 " + restMin + "분 입니다!");
			
			int morning = 0;						// 00:00 ~ 12:00 (12시간)
			int middle = 0;							// 12:00 ~ 18:00 (6시간)
			int dinner = 0;							// 18:00 ~ 24:00 (6시간)
			
			if(restHour < 6){						//하루 중 저녁시간일때 (하루가 6시간도 안남았을 때)
				dinner = restHour;
				
			}else if(restHour <= 12) {				//하루 중 절반(12시간)도 안남았을 때
				dinner = 6;
				middle = restHour - dinner;
			}else {									//하루가 12시간보다 많이 남았을 때
				dinner = 6;
				middle = 6;
				morning = restHour - (middle + dinner);
			}
			System.out.println("시간대별 남은 시각은 아침 : " + morning + " 점심 : " + middle + " 저녁 : " + dinner + "시간 입니다.");
			
		}else {
			System.out.println("이 프로그램의 개발자님이 아니십니다.");
		}
		
		sc.close();
	
//	Date a = new Date();
//	System.out.println(a);
	
	
	
	
	
	
	
	
	
		
	}
}
