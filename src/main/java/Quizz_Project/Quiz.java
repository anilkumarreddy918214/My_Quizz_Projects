package Quizz_Project;

import java.util.Scanner;


public class Quiz {

	static boolean lifeLineUsed = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" ----------------Welcome to Quiz--------------");
		System.out.println("------------>Note<--------------");
		System.out.println("> In your exam if any question wrong the exam will terminate");
		System.out.println("> For correct answer you got some reward");
		System.out.println("> Then you have an one life line you can use an one question");
		System.out.println("> you choosed life line in you have an two options");
		System.out.println("> 50-50");
		System.out.println("> Audience poll");
		System.out.println("> you can only once use in life line");
		System.out.println("> if you want 50-50 enter =1 ");
		System.out.println("> if you want Auidence pool enter =2 ");
		System.out.println("> if enter the exam you can type 1");
		System.out.println("________All the best your exam___________");
		System.out.println("-----------------------------------------");
		System.out.println("              ********                   ");
		System.out.println("-----------------------------------------");

		System.out.println("1.Start");
		System.out.println("2.Exit");

		int k = sc.nextInt();

		if (k == 1) {
			System.out.println("Enter the Exam");
		} else {
			System.out.println("if want to enter the exam enter Y");
			System.exit(0);
		}

		int d = 0;

		Q1 q1 = new Q1();
		q1.question();
		d += 1;
		System.out.println("Your Score=" + d);

		Q2 q2 = new Q2();
		q2.question();
		d += 1;
		System.out.println("Your Score=" + d);

		Q3 q3 = new Q3();
		q3.question();
		d += 1;
		System.out.println("Your Score=" + d);

		Q4 q4 = new Q4();
		q4.question();
		d += 1;
		System.out.println("Your Score=" + d);

		Q5 q5 = new Q5();
		q5.question();
		d += 1;
		System.out.println("Your Score=" + d);

		Q6 q6 = new Q6();
		q6.question();
		d += 1;
		System.out.println("Your Score=" + d);

		Q7 q7 = new Q7();
		q7.question();
		d += 1;
		System.out.println("Your Score=" + d);

		Q8 q8 = new Q8();
		q8.question();
		d += 1;
		System.out.println("Your Score=" + d);

		Q9 q9 = new Q9();
		q9.question();
		d += 1;
		System.out.println("Your Score=" + d);

		Q10 q10 = new Q10();
		q10.question();
		d += 1;

		System.out.println("Your Score=" + d);
	}
}

class Q1 {
	void question() {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------");
		System.out.println("1) How many pillars in java");
		System.out.println("1) 2");
		System.out.println("2) 4");
		System.out.println("3) 5");
		System.out.println("4) 6");

		if (!Quiz.lifeLineUsed) {
			System.out.println("5) Lifeline");
		}

		int i = sc.nextInt();

		if (i == 2) {

			System.out.println("----------------------------------------");
			System.out.println("Correct Answer");
			System.out.println("Congratulations! You earned 100 rupees");

		} else if (i == 5 && !Quiz.lifeLineUsed) {

			System.out.println("Enter into Lifeline");
			System.out.println("----------------------------------------");
			System.out.println("1) 50-50");
			System.out.println("2) Audience Poll");

			int m = sc.nextInt();

			if (m == 1) {

				System.out.println("You entered 50-50");
				System.out.println("----------------------------------------");
				System.out.println("1) 2");
				System.out.println("2) 4");

				int x = sc.nextInt();

				if (x == 2) {

					Quiz.lifeLineUsed = true;

					System.out.println("----------------------------------------");
					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("----------------------------------------");
					System.out.println("Wrong Answer");
					System.out.println("you score is 0");
					System.exit(0);
				}

			} else if (m == 2) {

				System.out.println("----------------------------------------");
				System.out.println("You entered Audience Poll");
				System.out.println("1) 2 == 20%");
				System.out.println("2) 4 == 80%");

				int x = sc.nextInt();

				if (x == 1) {

					Quiz.lifeLineUsed = true;

					System.out.println("----------------------------------------");
					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("Wrong Answer");
					System.out.println("you score is 0");
					System.exit(0);
				}

			} else {

				System.out.println("Invalid Lifeline choice");
			}

		} else {

			System.out.println("Wrong Answer");
			System.out.println("you score is 0");
			System.exit(0);
		}
	}
}

class Q2 {
	void question() {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------");
		System.out.println("2) How many data types in java");
		System.out.println("1) 2");
		System.out.println("2) 4");
		System.out.println("3) 5");
		System.out.println("4) 6");

		if (!Quiz.lifeLineUsed) {
			System.out.println("5) Lifeline");
		}

		int i = sc.nextInt();

		if (i == 1) {

			System.out.println("----------------------------------------");
			System.out.println("Correct Answer");
			System.out.println("Congratulations! You earned 100 rupees");

		} else if (i == 5 && !Quiz.lifeLineUsed) {

			System.out.println("Enter into Lifeline");
			System.out.println("----------------------------------------");
			System.out.println("1) 50-50");
			System.out.println("2) Audience Poll");

			int m = sc.nextInt();

			if (m == 1) {

				System.out.println("----------------------------------------");
				System.out.println("You entered 50-50");
				System.out.println("1) 2");
				System.out.println("2) 4");

				int x = sc.nextInt();

				if (x == 1) {

					Quiz.lifeLineUsed = true;

					System.out.println("----------------------------------------");
					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("Wrong Answer");
					System.out.println("you score is 0");
					System.exit(0);
				}

			} else if (m == 2) {

				System.out.println("----------------------------------------");
				System.out.println("You entered Audience Poll");
				System.out.println("1) 2 == 80%");
				System.out.println("2) 4 == 20%");

				int x = sc.nextInt();

				if (x == 1) {

					Quiz.lifeLineUsed = true;

					System.out.println("----------------------------------------");
					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("Wrong Answer");
					System.out.println("you score is 0");
					System.exit(0);
				}

			} else {

				System.out.println("Invalid Lifeline choice");
			}

		} else {

			System.out.println("Wrong Answer");
			System.out.println("you score is 0");
			System.exit(0);
		}
	}
}

class Q3 {
	void question() {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------");
		System.out.println("3) How many variables in java");
		System.out.println("1) 2");
		System.out.println("2) 4");
		System.out.println("3) 3");
		System.out.println("4) 6");

		if (!Quiz.lifeLineUsed) {
			System.out.println("5) Lifeline");
		}

		int i = sc.nextInt();

		if (i == 3) {

			System.out.println("----------------------------------------");
			System.out.println("Correct Answer");
			System.out.println("Congratulations! You earned 100 rupees");

		} else if (i == 5 && !Quiz.lifeLineUsed) {

			System.out.println("Enter into Lifeline");
			System.out.println("----------------------------------------");
			System.out.println("1) 50-50");
			System.out.println("2) Audience Poll");

			int m = sc.nextInt();

			if (m == 1) {

				System.out.println("----------------------------------------");
				System.out.println("You entered 50-50");
				System.out.println("3) 3");
				System.out.println("4) 6");

				int x = sc.nextInt();

				if (x == 1) {

					Quiz.lifeLineUsed = true;

					System.out.println("----------------------------------------");
					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("Wrong Answer");
					System.out.println("you score is 0");
					System.exit(0);
				}

			} else if (m == 2) {

				System.out.println("----------------------------------------");
				System.out.println("You entered Audience Poll");
				System.out.println("1) 3 == 80%");
				System.out.println("2) 4 == 20%");

				int x = sc.nextInt();

				if (x == 1) {

					Quiz.lifeLineUsed = true;

					System.out.println("----------------------------------------");
					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("Wrong Answer");
					System.out.println("you score is 0");
					System.exit(0);
				}

			} else {

				System.out.println("Invalid Lifeline choice");
			}

		} else {

			System.out.println("Wrong Answer");
			System.out.println("you score is 0");
			System.exit(0);
		}
	}
}

class Q4 {
	void question() {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------");
		System.out.println("4) Which one is wrong");
		System.out.println("1) local");
		System.out.println("2) static");
		System.out.println("3) cow");
		System.out.println("4) instance");

		if (!Quiz.lifeLineUsed) {
			System.out.println("5) Lifeline");
		}

		int i = sc.nextInt();

		if (i == 3) {

			System.out.println("----------------------------------------");
			System.out.println("Correct Answer");
			System.out.println("Congratulations! You earned 100 rupees");

		} else if (i == 5 && !Quiz.lifeLineUsed) {

			System.out.println("Enter into Lifeline");
			System.out.println("----------------------------------------");
			System.out.println("1) 50-50");
			System.out.println("2) Audience Poll");

			int m = sc.nextInt();

			if (m == 1) {

				System.out.println("----------------------------------------");
				System.out.println("You entered 50-50");
				System.out.println("3) cow");
				System.out.println("2) instance");

				int x = sc.nextInt();

				if (x == 1) {

					Quiz.lifeLineUsed = true;

					System.out.println("----------------------------------------");
					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("Wrong Answer");
					System.out.println("you score is 0");
					System.exit(0);
				}

			} else if (m == 2) {

				System.out.println("----------------------------------------");
				System.out.println("You entered Audience Poll");
				System.out.println("3) cow == 80%");
				System.out.println("4) instance == 20%");

				int x = sc.nextInt();

				if (x == 1) {

					Quiz.lifeLineUsed = true;

					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("Wrong Answer");
					System.out.println("you score is 0");
					System.exit(0);
				}

			} else {

				System.out.println("Invalid Lifeline choice");
			}

		} else {

			System.out.println("Wrong Answer");
			System.out.println("you score is 0");
			System.exit(0);
		}
	}
}

class Q5 {
	void question() {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------");
		System.out.println("5) How many types of applications in java");
		System.out.println("1) 2");
		System.out.println("2) 4");
		System.out.println("3) 3");
		System.out.println("4) 6");

		if (!Quiz.lifeLineUsed) {
			System.out.println("5) Lifeline");
		}

		int i = sc.nextInt();

		if (i == 1) {

			System.out.println("----------------------------------------");
			System.out.println("Correct Answer");
			System.out.println("Congratulations! You earned 100 rupees");

		} else if (i == 5 && !Quiz.lifeLineUsed) {

			System.out.println("Enter into Lifeline");
			System.out.println("----------------------------------------");
			System.out.println("1) 50-50");
			System.out.println("2) Audience Poll");

			int m = sc.nextInt();

			if (m == 1) {

				System.out.println("----------------------------------------");
				System.out.println("You entered 50-50");
				System.out.println("1) 2");
				System.out.println("2) 4");

				int x = sc.nextInt();

				if (x == 1) {

					Quiz.lifeLineUsed = true;

					System.out.println("----------------------------------------");
					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("Wrong Answer");
					System.exit(0);
				}

			} else if (m == 2) {

				System.out.println("----------------------------------------");
				System.out.println("You entered Audience Poll");
				System.out.println("1) 2 == 80%");
				System.out.println("2) 4 == 20%");

				int x = sc.nextInt();

				if (x == 1) {

					Quiz.lifeLineUsed = true;

					System.out.println("----------------------------------------");
					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("Wrong Answer");
					System.exit(0);
				}

			} else {

				System.out.println("Invalid Lifeline choice");
			}

		} else {

			System.out.println("Wrong Answer");
			System.exit(0);
		}
	}
}

class Q6 {
	void question() {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------");
		System.out.println("6) How many methods in java");
		System.out.println("1) 2");
		System.out.println("2) 4");
		System.out.println("3) 3");
		System.out.println("4) 6");

		if (!Quiz.lifeLineUsed) {
			System.out.println("5) Lifeline");
		}

		int i = sc.nextInt();

		if (i == 2) {

			System.out.println("----------------------------------------");
			System.out.println("Correct Answer");
			System.out.println("Congratulations! You earned 100 rupees");

		} else if (i == 5 && !Quiz.lifeLineUsed) {

			System.out.println("Enter into Lifeline");
			System.out.println("----------------------------------------");
			System.out.println("1) 50-50");
			System.out.println("2) Audience Poll");

			int m = sc.nextInt();

			if (m == 1) {

				System.out.println("----------------------------------------");
				System.out.println("You entered 50-50");
				System.out.println("1) 2");
				System.out.println("2) 4");

				int x = sc.nextInt();

				if (x == 1) {

					Quiz.lifeLineUsed = true;

					System.out.println("----------------------------------------");
					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("Wrong Answer");
					System.exit(0);
				}

			} else if (m == 2) {

				System.out.println("----------------------------------------");
				System.out.println("You entered Audience Poll");
				System.out.println("1) 2 == 20%");
				System.out.println("2) 4 == 80%");

				int x = sc.nextInt();

				if (x == 1) {

					Quiz.lifeLineUsed = true;

					System.out.println("----------------------------------------");
					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("Wrong Answer");
					System.exit(0);
				}

			} else {

				System.out.println("Invalid Lifeline choice");
			}

		} else {

			System.out.println("Wrong Answer");
			System.exit(0);
		}
	}
}

class Q7 {
	void question() {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------");
		System.out.println("7) How many types of type casting in java");
		System.out.println("1) 2");
		System.out.println("2) 4");
		System.out.println("3) 3");
		System.out.println("4) 6");

		if (!Quiz.lifeLineUsed) {
			System.out.println("5) Lifeline");
		}

		int i = sc.nextInt();

		if (i == 1) {

			System.out.println("----------------------------------------");
			System.out.println("Correct Answer");
			System.out.println("Congratulations! You earned 100 rupees");

		} else if (i == 5 && !Quiz.lifeLineUsed) {

			System.out.println("Enter into Lifeline");
			System.out.println("----------------------------------------");
			System.out.println("1) 50-50");
			System.out.println("2) Audience Poll");

			int m = sc.nextInt();

			if (m == 1) {

				System.out.println("----------------------------------------");
				System.out.println("You entered 50-50");
				System.out.println("1) 2");
				System.out.println("2) 4");

				int x = sc.nextInt();

				if (x == 1) {

					Quiz.lifeLineUsed = true;

					System.out.println("----------------------------------------");
					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("Wrong Answer");
					System.exit(0);
				}

			} else if (m == 2) {

				System.out.println("----------------------------------------");
				System.out.println("You entered Audience Poll");
				System.out.println("1) 2 == 80%");
				System.out.println("2) 4 == 20%");

				int x = sc.nextInt();

				if (x == 1) {

					Quiz.lifeLineUsed = true;

					System.out.println("----------------------------------------");
					System.out.println("Correct Answer");
					System.out.println("Congratulations! You earned 100 rupees");

				} else {

					System.out.println("Wrong Answer");
					System.exit(0);
				}

			} else {

				System.out.println("Invalid Lifeline choice");
			}

		} else {

			System.out.println("Wrong Answer");
			System.exit(0);
		}
	}
}

class Q8 {
	void question() {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------");
		System.out.println("8) How many types of Strings in java");
		System.out.println("1) 2");
		System.out.println("2) 4");
		System.out.println("3) 3");
		System.out.println("4) 6");

		int j = sc.nextInt();

		if (j == 1) {

			System.out.println("----------------------------------------");
			System.out.println("Correct Answer");
			System.out.println("Congratulations! You earned 100 rupees");

		} else {

			System.out.println("Wrong Answer");
			System.exit(0);
		}
	}
}

class Q9 {
	void question() {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------");
		System.out.println("9) How many types of arrays in java");
		System.out.println("1) 2");
		System.out.println("2) 4");
		System.out.println("3) 3");
		System.out.println("4) 6");

		int j = sc.nextInt();

		if (j == 1) {

			System.out.println("----------------------------------------");
			System.out.println("Correct Answer");
			System.out.println("Congratulations! You earned 100 rupees");

		} else {

			System.out.println("Wrong Answer");
			System.exit(0);
		}
	}
}

class Q10 {
	void question() {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------------");
		System.out.println("10) How many types of memory in java");
		System.out.println("1) 2");
		System.out.println("2) 4");
		System.out.println("3) 3");
		System.out.println("4) 6");

		int j = sc.nextInt();

		if (j == 1) {

			System.out.println("Correct Answer");
			System.out.println("Congratulations! You earned 100 rupees");

		} else {

			System.out.println("Wrong Answer");
			System.exit(0);
		}
	}
	
}
