import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int index = (int)(Math.random() * 3);
        return choices[index];
    }

    public static String findWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "Draw";
        }
        if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
            (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    public static void displayResults(String[][] gameLog, int playerWins, int computerWins, int draws) {
        System.out.println("\n--- Game Log ---");
        System.out.printf("%-8s | %-10s | %-10s | %s%n", "Round", "Player", "Computer", "Winner");
        System.out.println("--------------------------------------------");
        for (String[] round : gameLog) {
            System.out.printf("%-8s | %-10s | %-10s | %s%n", round[0], round[1], round[2], round[3]);
        }

        System.out.println("\n--- Final Score ---");
        int totalGames = playerWins + computerWins + draws;
        double playerWinPct = (totalGames == 0) ? 0 : ((double)playerWins / totalGames) * 100;
        double computerWinPct = (totalGames == 0) ? 0 : ((double)computerWins / totalGames) * 100;

        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Draws: " + draws);
        System.out.printf("Player Win Percentage: %.2f%%%n", playerWinPct);
        System.out.printf("Computer Win Percentage: %.2f%%%n", computerWinPct);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rounds of Rock-Paper-Scissors do you want to play? ");
        int numGames = scanner.nextInt();

        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;
        String[][] gameLog = new String[numGames][4];

        for (int i = 0; i < numGames; i++) {
            System.out.print("\nRound " + (i + 1) + ": Enter your choice (rock, paper, or scissors): ");
            String playerChoice = scanner.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);

            gameLog[i][0] = String.valueOf(i + 1);
            gameLog[i][1] = playerChoice;
            gameLog[i][2] = computerChoice;
            gameLog[i][3] = winner;
            
            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Winner: " + winner);
            
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        displayResults(gameLog, playerWins, computerWins, draws);
        scanner.close();
    }
}