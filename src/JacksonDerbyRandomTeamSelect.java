import java.util.Arrays;

public class JacksonDerbyRandomTeamSelect {
    public static void main(String[] args) {

        //Step 1: Initialize
        int[] teamsChosen = new int[8];
        int[] team1 = new int[2];
        int[] team2 = new int[2];
        int[] team3 = new int[2];
        int[] team4 = new int[2];
        int pairCount = 1;

        int teamCountChosen = 0;
        //Step 2: Repeatedly fill pairs until the four pairs have been filled out
        while(team4[1] == 0) {

            //Step 3: Repeat further steps until pair is filled(two numbers)
            int fillCount = 0;


            while(fillCount != 2) {
                //3a: Generate a random number between 1 and 8
                int tempTeam = (int) (Math.random() * (8 - 1)) + 1;

                System.out.println(tempTeam);

                //3b: Check if number has already been chosen
                //3ba: if not, add number to pair and add number to database of chosen teams, else generate another number
                boolean numberAlreadyChosen = false;
                for (int i = 0; i <= teamsChosen.length - 1; i++) {
                    numberAlreadyChosen = (tempTeam == teamsChosen[i]);
                    System.out.println(teamsChosen[i])
                }

                System.out.println(numberAlreadyChosen);

                if (!(numberAlreadyChosen)) {
                    if(pairCount == 1) {
                        team1[fillCount] = tempTeam;
                    }
                    else if(pairCount == 2) {
                        team2[fillCount] = tempTeam;
                    }
                    else if(pairCount == 3) {
                        team3[fillCount] = tempTeam;
                    }
                    else {
                        team4[fillCount] = tempTeam;
                    }
                    fillCount = fillCount + 1;
                    teamsChosen[teamCountChosen] = tempTeam;
                    teamCountChosen = teamCountChosen + 1;

                }

                System.out.println(Arrays.toString(team1));
                System.out.println(Arrays.toString(team2));
                System.out.println(Arrays.toString(team3));
                System.out.println(Arrays.toString(team4));
                System.out.println();

            }

            pairCount = pairCount + 1;






        }


        //Step 4: Print team pairings


    }
}
