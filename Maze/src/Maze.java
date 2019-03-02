import java.util.Scanner;
	//Code Developed By: Kyle P. McCoy || KMAC IDE || 01 Mar 2019
public class Maze {

	static Scanner read = new Scanner(System.in);
	
		//Begin Declaring variables
		//movement tracker for maze
	static char myMove = '\0';
		//Cell Position
	static int currentCell = 0;
	static int score = 0;
	static int totalMoves = 0;
	static boolean advance = true;
	static boolean checkThis = false;
		//End Declaration of variables

static void displayMenu() {
	System.out.println("");
	System.out.println("***********************");
	System.out.println("---The Maze Strategy---");
	System.out.println("");
} //end method	
static void  displayMovement() {
	
	if(currentCell == 0) {
		System.out.println("You have entered the maze!!");
		System.out.println("There is no turning back!!");
		System.out.println("");
		System.out.println("BWWAAAHAHAHAHAHAHAHAHAHAHAH");
		currentCell = 1;
		score += 10;
		totalMoves ++;
		mazeStatus();
		
	}// end if statement
	advance = true;
	System.out.println("Make your move (W,A,S,D)");
} //end method
static void makeyourMove() {
	
	myMove = read.next().charAt(0);
	
	switch(myMove) {
	
		case 'W': { MoveUp(); break; }
		case 'A': { MoveLeft(); break; }
		case 'S': { MoveDown(); break; }
		case 'D': { MoveRight(); break; }

	} //End Switch Statement
	//end program menu
} //end method ()
static boolean checkyourMove() {
	
	if(currentCell == 1 && advance == true) {
		if (myMove == 'W' || myMove =='w') {
			
			advance = false;
			System.out.println("Try again!");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
		if (myMove == 'A' || myMove =='a') {
			
			advance = false;
			System.out.println("There is no return!");
			totalMoves ++;
			score -= 5;
			return advance;
		} //end if statement
		if (myMove == 'S' || myMove =='s') {
			
			advance = false;
			System.out.println("Try again!");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
		if (myMove == 'D' || myMove =='d') {
			
			currentCell = 2;
			advance = true;
			System.out.println("Good Job, continue through the maze!");
			totalMoves ++;
			score += 10;
			return advance;
		} //end if statement
	} //end if statement
	
	if(currentCell == 2 && advance == true) {
		if (myMove == 'W' || myMove =='w') {
			
			advance = false;
			System.out.println("Try again!");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
		if (myMove == 'A' || myMove =='a') {
			
			advance = false;
			System.out.println("There is no return!");
			totalMoves ++;
			score -= 5;
			return advance;
		} //end if statement
		if (myMove == 'S' || myMove =='s') {
			
			currentCell = 5;
			advance = true;
			System.out.println("Continue Through The Maze");
			totalMoves ++;
			score += 10;
			return advance;
		} //end if statement
		if (myMove == 'D' || myMove =='d') {
			
			advance = false;
			System.out.println("Sorry, Please try again");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
	} //end if statement
	
	if(currentCell == 3 && advance == true) {
		if (myMove == 'W' || myMove =='w') {
			
			advance = false;
			System.out.println("Try again!");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
		if (myMove == 'A' || myMove =='a') {
			
			advance = false;
			System.out.println("Try Again!");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
		if (myMove == 'S' || myMove =='s') {
			
			currentCell = 6;
			advance = true;
			System.out.println("A Step In the Right Direction!");
			totalMoves ++;
			score += 10;
			return advance;
		} //end if statement
		if (myMove == 'D' || myMove =='d') {
			
			advance = false;
			System.out.println("Sorry, Please try again");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
	} //end if statement
	
	if(currentCell == 4 && advance == true) {
		if (myMove == 'W' || myMove =='w') {
			
			advance = false;
			System.out.println("Try again!");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
		if (myMove == 'A' || myMove =='a') {
			
			advance = false;
			System.out.println("Try Again!");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
		if (myMove == 'S' || myMove =='s') {
			
			currentCell = 7;
			advance = true;
			System.out.println("A Step in the Right Direction!");
			totalMoves ++;
			score += 10;
			return advance;
		} //end if statement
		if (myMove == 'D' || myMove =='d') {
			
			advance = false;
			System.out.println("Sorry, Please try again");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
	} //end if statement
	if(currentCell == 5 && advance == true) {
		if (myMove == 'W' || myMove =='w') {
			
			advance = false;
			System.out.println("There is NO going back");
			totalMoves ++;
			score -= 5;
			return advance;
		} //end if statement
		if (myMove == 'A' || myMove =='a') {
			
			advance = false;
			System.out.println("Try Again!");
			score -= 2;
			totalMoves ++;
			return advance;
		} //end if statement
		if (myMove == 'S' || myMove =='s') {
			
			advance = false;
			System.out.println("Try Again!");
			totalMoves ++;
			return advance;
		} //end if statement
		if (myMove == 'D' || myMove =='d') {
			
			currentCell = 6;
			advance = true;
			System.out.println("Good Job!");
			score += 10;
			totalMoves ++;
			return advance;
		} //end if statement
	} //end if statement
	if(currentCell == 6 && advance == true) {
		if (myMove == 'W' || myMove =='w') {
			
			currentCell = 3;
			advance = true;
			System.out.println("You have reched a dead end!");
			System.out.println("sp00kers!!!");
			totalMoves ++;
			score -= 20;
			return advance;
		} //end if statement
		if (myMove == 'A' || myMove =='a') {
			
			advance = false;
			System.out.println("No going Back!!!");
			totalMoves ++;
			score -= 5;
			return advance;
		} //end if statement
		if (myMove == 'S' || myMove =='s') {
			
			currentCell = 9;
			advance = true;
			System.out.println("Good job, Keep Going!");
			score += 10;
			totalMoves ++;
			return advance;
		} //end if statement
		if (myMove == 'D' || myMove =='d') {
			
			advance = false;
			System.out.println("Try Again!");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
	} //end if statement
	if(currentCell == 7 && advance == true) {
		if (myMove == 'W' || myMove =='w') {
			
			currentCell = 4;
			advance = true;
			System.out.println("You have reached a Dead End!");
			System.out.println("sp00kers!!!");
			totalMoves ++;
			score -= 20;
			return advance;
		} //end if statement
		if (myMove == 'A' || myMove =='a') {
			
			advance = false;
			System.out.println("Try Again!");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
		if (myMove == 'S' || myMove =='s') {
			
			advance = false;
			System.out.println("Try Again!");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
		if (myMove == 'D' || myMove =='d') {
			
			currentCell = 6;
			advance = true;
			System.out.println("A step in the right direction!");
			totalMoves ++;
			score += 10;
			return advance;
		} //end if statement
	} //end if statement
	if(currentCell == 8 && advance == true) {
		if (myMove == 'W' || myMove =='w') {
			
			advance = false;
			System.out.println("Try Again!");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
		if (myMove == 'A' || myMove =='a') {
			
			currentCell = 7;
			advance = true;
			System.out.println("Keep Going!");
			totalMoves ++;
			score -= 3;
			return advance;
		} //end if statement
		if (myMove == 'S' || myMove =='s') {
			
			advance = false;
			System.out.println("Try Again!");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
		if (myMove == 'D' || myMove =='d') {
			
			currentCell = 9;
			advance = true;
			System.out.println("A Step in the right Direction!");
			score += 10;
			totalMoves ++;
			return advance;
		} //end if statement
	} //end if statement
	if(currentCell == 9 && advance == true) {
		if (myMove == 'W' || myMove =='w') {
			
			advance = false;
			System.out.println("There is NO going back");
			totalMoves ++;
			score -= 5;
			return advance;
		} //end if statement
		if (myMove == 'A' || myMove =='a') {
			
			currentCell = 8;
			advance = true;
			System.out.println("Keep Going!");
			totalMoves ++;
			score -= 1;
			return advance;
		} //end if statement
		if (myMove == 'S' || myMove =='s') {
			
			currentCell = 10;
			advance = true;
			System.out.println("Good Job!");
			score += 100;
			totalMoves ++;
			return advance;
		} //end if statement
		if (myMove == 'D' || myMove =='d') {
			
			advance = false;
			System.out.println("Try Again!");
			totalMoves ++;
			score -= 2;
			return advance;
		} //end if statement
	} //end if statement
	return advance;
	//end menu
} //end method
static void MoveLeft() {
	System.out.println("You moved Left!");
} //end Method
static void MoveRight() {
	System.out.println("You moved Right!");
} //end Method
static void MoveUp() {
	System.out.println("You moved Up!");
} //end Method
static void MoveDown() {		
	System.out.println("You moved Down!");
} //end Method
static void mazeStatus() {
	
	if (currentCell <= 9) {
		System.out.println("Current Position: Cell " + currentCell);
	} //end if Statement
	
	if (currentCell == 10) {
		System.out.println("-----CONGRATULATIONS-----");
		System.out.println("");
		System.out.println("You escaped the Maze!!!");
		System.out.println("Here's your stats:");
		System.out.println("");
		System.out.println("");
		System.out.println("Total Moves:" + totalMoves);
		System.out.println("Score:" + score);
		System.out.println("");
		System.out.println("Goodjob!");
	} //end if statement
	
} //end method
public static void main(String args[]) {
		//Begin Declaring Local variables
	char answer = 'Y';
	
	displayMenu();
	
	while ((answer == 'Y' || answer == 'y') && (currentCell <= 9)) {
		
		displayMovement();
		makeyourMove();
		checkThis = checkyourMove();
		mazeStatus();
		
		
		System.out.println("Move again? (Y or N)");
		answer = read.next().charAt(0);
		
	} //end while
	
	System.out.println("*****************");
	
} //End main method

} //End public class
