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
		String owner = "������";
		
		
		SimpleDateFormat timeHM = new SimpleDateFormat("HH:mm");
		String dateD = timeHM.format(time.getTime());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.nextLine();
		
		
		if(hour>0) {
			restHour = (24-hour) - 1;
		}else {
			;
		}
		
		if(name.equals(owner)) {
			System.out.println("ȯ���մϴ� ��");
			String separateDay = null;
			if(hour < 12) {
				separateDay = "��ħ";
			}else if(hour < 19){
				separateDay = "����";
			}else if(hour < 24) {
				separateDay = "����";
			}
			System.out.println(separateDay + " "+ dateD + "�п� ���̳׿䤾��");
			System.out.println("������ ���� �ð��� " + restHour + "�ð� " + restMin + "�� �Դϴ�!");
			
			int morning = 0;						// 00:00 ~ 12:00 (12�ð�)
			int middle = 0;							// 12:00 ~ 18:00 (6�ð�)
			int dinner = 0;							// 18:00 ~ 24:00 (6�ð�)
			
			if(restHour < 6){						//�Ϸ� �� ����ð��϶� (�Ϸ簡 6�ð��� �ȳ����� ��)
				dinner = restHour;
				
			}else if(restHour <= 12) {				//�Ϸ� �� ����(12�ð�)�� �ȳ����� ��
				dinner = 6;
				middle = restHour - dinner;
			}else {									//�Ϸ簡 12�ð����� ���� ������ ��
				dinner = 6;
				middle = 6;
				morning = restHour - (middle + dinner);
			}
			System.out.println("�ð��뺰 ���� �ð��� ��ħ : " + morning + " ���� : " + middle + " ���� : " + dinner + "�ð� �Դϴ�.");
			
		}else {
			System.out.println("�� ���α׷��� �����ڴ��� �ƴϽʴϴ�.");
		}
		
		sc.close();
	
//	Date a = new Date();
//	System.out.println(a);
	
	
	
	
	
	
	
	
	
		
	}
}
