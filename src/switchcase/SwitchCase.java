package switchcase;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking =5;
		char medalColor;
		
		switch(ranking) {
		case 1 :medalColor = 'G';
	    break;
		case 2 :medalColor = 'S';
		break;
		case 3 :medalColor = 'B';
		break;
		default:
		medalColor = 'A';
				}
		System.out.println(ranking + "등 메달 색깔은" + medalColor + "입니다");

	}
		
	}


	
