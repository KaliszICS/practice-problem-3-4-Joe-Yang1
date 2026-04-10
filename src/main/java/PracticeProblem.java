/**
	* Lesson: Nested Ifs
	* Author: Joe Yang
	* Date Created: March 23, 2023
	* Date Last Modified: March 26, 2026
	*/

public class PracticeProblem {

	public static void main(String args[]){
	}

	public static int min(int num, int num2, int num3){
	if (num >= num2 && num3 >= num2){
		return num2;
	}

	else if (num >= num3 && num2 >= num3){
			return num3;
	}

	else {
		return num;
	}
	}
	public static Boolean isLeapYear(int num){
		if (num % 4 == 0 ){

			if (num % 100 == 0){

				if (num % 400 == 0){
				return true;

				} else {
					return false;
				}

			} else {
				return true;
			}

		} else {
			return false;
		}
	}
}



	
	


