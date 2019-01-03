import java.util.ArrayList;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;
	private ArrayList<Card> usedCard;
	private ArrayList<Card> openCard;
	public int nUsed;
	
	public Deck(int nDeck)
	{
		cards = new ArrayList<Card>();

		for (int i = 0; i < nDeck; i++) {
			for (Card.Suit x : Card.Suit.values()) {
				for (int y = 1; y < 14; y++) {
					Card card = new Card(x, y);
					cards.add(card);
				}
			}
		}
		shuffle();
	}	
	
	public void printDeck(){
		for(int i =0;i<cards.size();i++)
		{
		Card card= cards.get(i);
		card.printCard();
		}

	}
	public ArrayList<Card> getAllCards()
		{
		return cards;
		}
	
	public Card getOneCard(boolean isOpened)
		{
		if (nUsed == cards.size()&& isOpened) {
			shuffle();
			usedCard.add(cards.get(nUsed));
			openCard.add(cards.get(nUsed));
			nUsed++;
			return cards.get(nUsed-1);

		} else{
		usedCard.add(cards.get(nUsed));
		nUsed++;
		return cards.get(nUsed-1);
		}
		
		}
	
	public ArrayList<Card> getOpenedCard()
	{
		return openCard;
	}
	
	public void shuffle()
	{
		
		for (int i = 0; i < cards.size(); i++) {
			Random rnd = new Random();
			int k = rnd.nextInt(i+1);
			Card temp = cards.get(i);
			cards.set(i, cards.get(k));
			cards.set(k, temp);
		}
		usedCard = new ArrayList<Card>();
		nUsed = 0;
		openCard = new ArrayList<Card>();
	}
	
}
