import java.util.ArrayList;

public class Player {
    private int playerSum;
    private int playerAceCount;
    private ArrayList<Card> playerHand;

    public Player() {
        playerHand = new ArrayList<>();
        playerSum = 0;
        playerAceCount = 0;
    }

    public int getPlayerSum() {
        return playerSum;
    }

    public int getPlayerAceCount() {
        return playerAceCount;
    }

    public ArrayList<Card> getPlayerHand() {
        return playerHand;
    }
    public int getSizeOfHand() {
        return playerHand.size();
    }

    public int reducePlayerAce() {
        while (playerSum > 21 && playerAceCount > 0) {
            playerSum -= 10;
            playerAceCount -= 1;
        }
        return playerSum;
    }
    public void increaseSum(int value) {
        playerSum += value;
    }
    public void increaseAceCount(int value) {
        playerAceCount += value;
    }
    public void addCardToHand(Card card) {
        playerHand.add(card);
    }
}
