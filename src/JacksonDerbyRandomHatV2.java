import java.util.Arrays;
import java.util.Scanner;

public class JacksonDerbyRandomHatV2 {
    public static int teamCountChosen = 0;     //Initializes class variable to keep track of number of teams already chosen(to prevent out of bounds errors)

    public static void main(String[] args) {

        //Step 1: Ask for number of competing teams and create an array to keep track of the teams based on the number of teams it needs to pair
        int numberOfTeams = requestNumberOfTeams();
        int[] teamsChosen = new int[numberOfTeams];

        //Step 2: Repeatedly fill list of chosen teams until the list has been filled out using randomly generated numbers corresponding to the teams competing
        while(teamsChosen[numberOfTeams - 1] == 0) {
            fillTeamArray(teamsChosen, numberOfTeams);
        }

        //Step 3: Print team pairings

        printTeamPairs(teamsChosen, numberOfTeams);

    }

    public static int requestNumberOfTeams() {  //Asks for input and returns it
        Scanner input = new Scanner(System.in);
        System.out.print("How many teams are competing?(Must be an even number) ");
        return input.nextInt();
    }

    public static void printTeamPairs(int[] teamsChosen, int numberOfTeams) { //Separates list of all chosen teams into pairs of two, printing out those pairs as it transverses through the array
        for(int i = 0; i < numberOfTeams; i++) {
            int[] temp = new int[2];
            temp[0] = teamsChosen[i];
            temp[1] = teamsChosen[i + 1];

            System.out.println(Arrays.toString(temp));
            i = i + 1;
        }
    }

    public static boolean checkIfInList(int numberToCheck, int[] teamList) {  //Checks if the randomly picked team has already been chosen and returns boolean result
        boolean numberAlreadyChosen = false;
        for (int i = 0; i <= teamList.length - 1; i++) {
            if(numberToCheck == teamList[i]) {
                numberAlreadyChosen = true;
            }
        }

        return numberAlreadyChosen;
    }

    public static int[] fillTeamArray(int[] teamsChosen, int numberOfTeams) { //Given a list to fill and a number of teams it needs to match, will fill the list with a distinct combination of those teams
        int tempTeam = (int) (Math.random() * (numberOfTeams)) + 1;  //Generates a random number between 1 and the number of teams
        boolean numberAlreadyChosen = checkIfInList(tempTeam, teamsChosen); //Calls on checkIfInList to determine if number has already been chosen

        if (!(numberAlreadyChosen)) {    //If it has not already been chosen, add value to list of chosen teams and increment onto the next value in the list
            teamsChosen[teamCountChosen] = tempTeam;
            teamCountChosen = teamCountChosen + 1;

        }

        return teamsChosen;  //Returns list back to main to check for completion, giving filled array in the process

    }
}
