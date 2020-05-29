import java.util.ArrayList;

/**
 * player class represent  bots and player
 */
public class Player
{
    //list of private card
    private ArrayList<Card> cards;
    //name
    private String name;
    //bot or player
    private int isbot;

    /**
     * create a player or bot
     * @param name name
     * @param isbot 1 player 0 bot or player if(game has bots 0:bot)
     */
    public Player(String name,int isbot)
    {
        cards = new ArrayList<Card>();
        this.name = name;
        this.isbot = isbot;
    }

    /**
     * get card with index
     * @param i index
     * @return card[i]
     */
    public Card getCard(int i) {
        return cards.get(i);
    }

    /**
     * get cards
     * @return list of cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * ger points of player
     * @return points
     */
    public int getPointPlayer()
    {
        int j = 0;
        for (int i = 0;i < cards.size();i++)
            j = j + cards.get(i).getPoint();
        return j;
    }

    /**
     * add card to cards
     * @param cardToAdd card to add
     */
    public void addCard(Card cardToAdd)
    {
        cards.add(cardToAdd);
    }

    /**
     * remove card of cards
     * @param cardToRemove card to remove
     */
    public void removeCard(Card cardToRemove)
    {
        int j = -1;
        for (int i = 0;i < cards.size();i++)
        {
            if (cardToRemove.getColor().equals(cards.get(i).getColor()) && cardToRemove.getType().equals(cards.get(i).getType()))
            {
                j = i;
            }
        }
        if (j > -1)
            cards.remove(j);
    }

    /**
     * print card informations with index
     * @param index index
     */
    public void printExample(int index)
    {
        System.out.println(index + 1 +":" + cards.get(index).getType() + " " + cards.get(index).getColor());
    }

    public int getIsbot() {
        return isbot;
    }

    /**
     * player can drop card
     * @param c card
     * @param color color of card be
     * @param penalty penaylty
     * @return 0< can 0 cant
     */
    public int canDrop(Card c ,String color ,int penalty)
    {
        int k = 0;
        int q = 0;
        if (c.getType().equals("+4") && penalty == 0)
        {
            int j = 0;
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getColor().equals(color))
                {
                    k = k + 1;
                }
                if (cards.get(i).getType().equals("+4"))
                {
                    q = q + 1;
                }
            }
            if(k == 0)
            {
                return q;
            }
            return k;
        }
        if (c.getType().equals("+4") && penalty > 0)
        {
            int j = 0;
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getType().equals("+4"))
                {
                    q = q + 1;
                }
            }
            return q;
        }
        if (c.getType().equals("c"))
        {
            int j = 0;
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getColor().equals(color) || cards.get(i).getType().equals("c"))
                {
                    q = q + 1;
                }
            }
            return q;
        }
        if (c.getType().equals("+2") && penalty == 0)
        {
            int j = 0;
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getColor().equals(color))
                {
                    q = q + 1;
                }
            }
            return q;
        }
        if (c.getType().equals("+2") && penalty > 0)
        {
            int j = 0;
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getType().equals("+2"))
                {
                    q = q + 1;
                }
            }
            return q;
        }
        else
        {
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).canBe(c.getType(),c.getColor()) == 1)
                    q = q + 1;
            }
            return q;
        }
    }

    /**
     * print all of card can drop
     * @param c type of card be
     * @param color color of card be
     * @param penalty penalty
     */
    public void printSugesstion(Card c , String color,int penalty)
    {
        System.out.println("card can you drop");
        int k = 0;
        int q = 0;
        if (c.getType().equals("+4") && penalty == 0)
        {
            int j = 0;
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getColor().equals(color))
                {
                    k = k + 1;
                }
                if (cards.get(i).getType().equals("+4"))
                {
                    q = q + 1;
                }
            }
            if(k == 0)
            {
                for (int i = 0;i < cards.size();i++)
                {
                    if (cards.get(i).getType().equals("+4"))
                    {
                        printExample(i);
                    }
                }
            }
            if (k != 0)
            {
                for (int i = 0;i < cards.size();i++)
                {
                    if (cards.get(i).getColor().equals(color))
                    {
                        printExample(i);
                    }
                }
            }
            return;
        }
        if (c.getType().equals("+4") && penalty > 0)
        {
            int j = 0;
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getType().equals("+4"))
                {
                    q = q + 1;
                }
            }
            if (q > 0)
            {
                for (int i = 0;i < cards.size();i++)
                {
                    if (cards.get(i).getType().equals("+4"))
                    {
                        printExample(i);
                    }
                }
            }
            return;
        }
        if (c.getType().equals("c"))
        {
            int j = 0;
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getColor().equals(color)|| cards.get(i).getType().equals("c"))
                {
                    q = q + 1;
                }
            }
            if(q > 0)
            {
                for (int i = 0;i < cards.size();i++)
                {
                    if (cards.get(i).getColor().equals(color))
                    {
                        printExample(i);
                    }
                }
            }
            return;
        }
        if (c.getType().equals("+2") && penalty == 0)
        {
            int j = 0;
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getColor().equals(color))
                {
                    q = q + 1;
                }
            }
            if (q > 0)
            {
                for (int i = 0;i < cards.size();i++)
                {
                    if (cards.get(i).getColor().equals(color))
                    {
                        printExample(i);
                    }
                }
            }
            return;
        }
        if (c.getType().equals("+2") && penalty > 0)
        {
            int j = 0;
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getType().equals("+2"))
                {
                    q = q + 1;
                }
            }
            if (q > 0)
            {
                for (int i = 0;i < cards.size();i++)
                {
                    if (cards.get(i).getType().equals("+2"))
                    {
                        printExample(i);
                    }
                }
            }
            return;
        }
        else
        {
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).canBe(c.getType(),c.getColor()) == 0)
                    q = q + 1;
            }
            if (q > 0)
            {
                for (int i = 0;i < cards.size();i++)
                {
                    if (cards.get(i).canBe(c.getType(),c.getColor()) == 1)
                        printExample(i);
                }
            }
            return;
        }
    }

    /**
     * print another way
     */
    public void print()
    {
        System.out.println(name);
        for (int i = 0;i < cards.size();i++)
            cards.get(i).print();
    }

    /**
     * get name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * index the firs card can drop
     * @param c card is visible
     * @param color color of game
     * @param penality penalty of game
     * @return
     */
    public int indexDrop(Card c , String color , int penality)
    {
        int q = 0;
        int k = 0;
        if (c.getType().equals("+4") && penality == 0)
        {
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getColor().equals(color))
                {
                    q = i;
                    return q;
                }
            }
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getType().equals("+4"))
                {
                    q = i;
                    return q;
                }
            }
        }
        if (c.getType().equals("+4") && penality > 0)
        {
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getType().equals("+4"))
                {
                    q = i;
                    return q;
                }
            }
        }
        if (c.getType().equals("+2") && penality > 0)
        {
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getType().equals("+2"))
                {
                    q = i;
                    return q;
                }
            }
        }
        if (c.getType().equals("+2") && penality == 0)
        {
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getColor().equals(color))
                {
                    q = i;
                    return q;
                }
            }
            for (int i = 0;i < cards.size();i++)
            {
                if (cards.get(i).getType().equals("+2"))
                {
                    q = i;
                    return q;
                }
            }
        }
        if (c.getType().equals("c"))
        {
            for (int i = 0;i < cards.size();i++)
            {
                if(cards.get(i).getColor().equals(color)|| cards.get(i).getType().equals("c"))
                {
                    q = i;
                    return q;
                }
            }
        }
        else
        {
            for (int i = 0;i < cards.size();i++) {
                if (cards.get(i).canBe(c.getType(), c.getColor()) == 1) {
                    q = i;
                    return q;
                }
            }
        }
        return -1;
    }
}
