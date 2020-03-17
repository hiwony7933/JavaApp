package java_study_0103;

public class practice_date_change {

	public static void main(String[] args) {
		int second = 309209;
		int day =  second / 86400 ;
		int hour = (second - (day *86400))/3600;
		int minute = (second - (day*86400) - (hour*3600))/ 60 ;
		int sec = second % 60;
		
		System.out.println(day + "일" + hour + "시간 " + minute + "분" + sec + "초");

	}

}



