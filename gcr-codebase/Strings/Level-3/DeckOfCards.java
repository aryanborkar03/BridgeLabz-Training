public class DeckOfCards {

    //initialize deck
    public static String[] initializeDeck(String[] suits,String[] ranks){
        int index = 0;
        String[] deck = new String[suits.length * ranks.length];

        for(int i=0;i<suits.length;i++){
            for(int j=0;j<ranks.length;j++){
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    //shuffle deck
    public static String[] shuffleDeck(String[] deck){
        int n = deck.length;

        for(int i=0;i<n;i++){
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    //distribute cards to players
    public static String[][] distributeCards(String[] deck,int players,int cards){
        if(players * cards > deck.length)
            return null;

        String[][] result = new String[players][cards];
        int index = 0;

        for(int i=0;i<players;i++){
            for(int j=0;j<cards;j++){
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    //print players and cards
    public static void display(String[][] players){
        for(int i=0;i<players.length;i++){
            System.out.println("Player " + (i+1));
            for(int j=0;j<players[i].length;j++){
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {
            "2","3","4","5","6","7","8","9","10",
            "Jack","Queen","King","Ace"
        };

        String[] deck = initializeDeck(suits,ranks);
        deck = shuffleDeck(deck);

        int players = 4;
        int cardsPerPlayer = 5;

        String[][] distributed = distributeCards(deck,players,cardsPerPlayer);

        if(distributed != null)
            display(distributed);
        else
            System.out.println("Cards cannot be distributed");
    }
}
