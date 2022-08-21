public class Matrix {

public static void PrintLine()
{
    System.out.println("-----------------------------------");
}

public static void PrintSelectDifficultyLevel()
{
    clearConsole();
    PrintLine();
    System.out.println("*** Hello and welcome to Memory Game ***\n\nThere are two levels. In easy you have to uncover 4 pairs of words, in hard 8\n\nWish you luck\n");
    
    System.out.println("For easy level type number 1 on your keyboard");
    System.out.println("For hard level type number 2 on your keyboard\n");
    PrintLine();
}

public static void PrintEnterYourNameScreen()
{
    clearConsole();
    PrintLine();
    System.out.println("Please enter your name\n");
    PrintLine();
}
public static void PrintEndGameScreen(boolean win, int guessChances, int time)
{
    clearConsole();
    PrintLine();
    if (win) System.out.println("***You win!***/n***Congratulations***");
    else System.out.println("***You lost!***/n***Try one more time because practise make genius***");
    System.out.println("It took you "+guessChances+" chances and "+time+" seconds.");
    System.out.println("1. Play again");
    if(win) System.out.println("2. Save your time to leaderboards!");
    else System.out.println("2. View leaderboards!");
    System.out.println("3. Exit\n");
    PrintLine();
}

public static void PrintMatrix_top(int diffLevel, int guessChances)
{
    clearConsole();
    String diffLevelText = "easy";
    if (diffLevel == 2) diffLevelText = "hard";
    PrintLine();
    System.out.println("Level: "+diffLevelText);
    System.out.println("Guess chances: "+guessChances);
    System.out.println("     1    2    3    4");
}

    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            for(int i = 0; i < 50; i++)
                System.out.print("\n");
        }
    } 

}
