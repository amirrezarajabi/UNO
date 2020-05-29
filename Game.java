import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * Game class represent game
 */
public class Game
{
    private int penalty;
    //1:r -1:l
    private int rotation;
    //type of card dropped
    private String type;
    //color of card dropped
    private String color;
    //turn of player
    private int turn;
    //players of the game
    private ArrayList<Player> players;
    //version 0 of map
    private ArrayList<Card> map0;
    //number of players
    private int number;

    /**
     * create new game 3 member
     * @param player1 player 1
     * @param player2 player 2
     * @param player3 player 3
     */
    public Game(Player player1 , Player player2 , Player player3)
    {
        this.penalty = 0;
        this.number = 3;
        Random rand = new Random();
        turn = rand.nextInt(3);
        players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        map0 = new ArrayList<Card>();
        Card c1 = new Card("0","r");
        Card c2 = new Card("1","r");
        Card c3 = new Card("2","r");
        Card c4 = new Card("3","r");
        Card c5 = new Card("4","r");
        Card c6 = new Card("5","r");
        Card c7 = new Card("6","r");
        Card c8 = new Card("7","r");
        Card c9 = new Card("8","r");
        Card c10 = new Card("9","r");
        Card c11 = new Card("1","r");
        Card c12 = new Card("2","r");
        Card c13 = new Card("3","r");
        Card c14 = new Card("4","r");
        Card c15 = new Card("5","r");
        Card c16 = new Card("6","r");
        Card c17 = new Card("7","r");
        Card c18 = new Card("8","r");
        Card c19 = new Card("9","r");
        Card c20 = new Card("r","r");
        Card c21 = new Card("r","r");
        Card c22 = new Card("+2","r");
        Card c23 = new Card("+2","r");
        Card c24 = new Card("s","r");
        Card c25 = new Card("s","r");
        Card c26 = new Card("0","g");
        Card c27 = new Card("1","g");
        Card c28 = new Card("2","g");
        Card c29 = new Card("3","g");
        Card c30 = new Card("4","g");
        Card c31 = new Card("5","g");
        Card c32 = new Card("6","g");
        Card c33 = new Card("7","g");
        Card c34 = new Card("8","g");
        Card c35 = new Card("9","g");
        Card c36 = new Card("1","g");
        Card c37 = new Card("2","g");
        Card c38 = new Card("3","g");
        Card c39 = new Card("4","g");
        Card c40 = new Card("5","g");
        Card c41 = new Card("6","g");
        Card c42 = new Card("7","g");
        Card c43 = new Card("8","g");
        Card c44 = new Card("9","g");
        Card c45 = new Card("r","g");
        Card c46 = new Card("r","g");
        Card c47 = new Card("+2","g");
        Card c48 = new Card("+2","g");
        Card c49 = new Card("s","g");
        Card c50 = new Card("s","g");
        Card c51 = new Card("0","y");
        Card c52 = new Card("1","y");
        Card c53 = new Card("2","y");
        Card c54 = new Card("3","y");
        Card c55 = new Card("4","y");
        Card c56 = new Card("5","y");
        Card c57 = new Card("6","y");
        Card c58 = new Card("7","y");
        Card c59 = new Card("8","y");
        Card c60 = new Card("9","y");
        Card c61 = new Card("1","y");
        Card c62 = new Card("2","y");
        Card c63 = new Card("3","y");
        Card c64 = new Card("4","y");
        Card c65 = new Card("5","y");
        Card c66 = new Card("6","y");
        Card c67 = new Card("7","y");
        Card c68 = new Card("8","y");
        Card c69 = new Card("9","y");
        Card c70 = new Card("r","y");
        Card c71 = new Card("r","y");
        Card c72 = new Card("+2","y");
        Card c73 = new Card("+2","y");
        Card c74 = new Card("s","y");
        Card c75 = new Card("s","y");
        Card c76 = new Card("0","b");
        Card c77 = new Card("1","b");
        Card c78 = new Card("2","b");
        Card c79 = new Card("3","b");
        Card c80 = new Card("4","b");
        Card c81 = new Card("5","b");
        Card c82 = new Card("6","b");
        Card c83 = new Card("7","b");
        Card c84 = new Card("8","b");
        Card c85 = new Card("9","b");
        Card c86 = new Card("1","b");
        Card c87 = new Card("2","b");
        Card c88 = new Card("3","b");
        Card c89 = new Card("4","b");
        Card c90 = new Card("5","b");
        Card c91 = new Card("6","b");
        Card c92 = new Card("7","b");
        Card c93 = new Card("8","b");
        Card c94 = new Card("9","b");
        Card c95 = new Card("r","b");
        Card c96 = new Card("r","b");
        Card c97 = new Card("+2","b");
        Card c98 = new Card("+2","b");
        Card c99 = new Card("s","b");
        Card c100 = new Card("s","b");
        Card c101 = new Card("+4","w");
        Card c102 = new Card("+4","w");
        Card c103 = new Card("+4","w");
        Card c104 = new Card("+4","w");
        Card c105 = new Card("c","w");
        Card c106 = new Card("c","w");
        Card c107 = new Card("c","w");
        Card c108 = new Card("c","w");
        map0.add(c1);
        map0.add(c2);
        map0.add(c3);
        map0.add(c4);
        map0.add(c5);
        map0.add(c6);
        map0.add(c7);
        map0.add(c8);
        map0.add(c9);
        map0.add(c10);
        map0.add(c11);
        map0.add(c12);
        map0.add(c13);
        map0.add(c14);
        map0.add(c15);
        map0.add(c16);
        map0.add(c17);
        map0.add(c18);
        map0.add(c19);
        map0.add(c20);
        map0.add(c21);
        map0.add(c22);
        map0.add(c23);
        map0.add(c24);
        map0.add(c25);
        map0.add(c26);
        map0.add(c27);
        map0.add(c28);
        map0.add(c29);
        map0.add(c30);
        map0.add(c31);
        map0.add(c32);
        map0.add(c33);
        map0.add(c34);
        map0.add(c35);
        map0.add(c36);
        map0.add(c37);
        map0.add(c38);
        map0.add(c39);
        map0.add(c40);
        map0.add(c41);
        map0.add(c42);
        map0.add(c43);
        map0.add(c44);
        map0.add(c45);
        map0.add(c46);
        map0.add(c47);
        map0.add(c48);
        map0.add(c49);
        map0.add(c50);
        map0.add(c51);
        map0.add(c52);
        map0.add(c53);
        map0.add(c54);
        map0.add(c55);
        map0.add(c56);
        map0.add(c57);
        map0.add(c58);
        map0.add(c59);
        map0.add(c60);
        map0.add(c61);
        map0.add(c62);
        map0.add(c63);
        map0.add(c64);
        map0.add(c65);
        map0.add(c66);
        map0.add(c67);
        map0.add(c68);
        map0.add(c69);
        map0.add(c70);
        map0.add(c71);
        map0.add(c72);
        map0.add(c73);
        map0.add(c74);
        map0.add(c75);
        map0.add(c76);
        map0.add(c77);
        map0.add(c78);
        map0.add(c79);
        map0.add(c80);
        map0.add(c81);
        map0.add(c82);
        map0.add(c83);
        map0.add(c84);
        map0.add(c85);
        map0.add(c86);
        map0.add(c87);
        map0.add(c88);
        map0.add(c89);
        map0.add(c90);
        map0.add(c91);
        map0.add(c92);
        map0.add(c93);
        map0.add(c94);
        map0.add(c95);
        map0.add(c96);
        map0.add(c97);
        map0.add(c98);
        map0.add(c99);
        map0.add(c100);
        map0.add(c101);
        map0.add(c102);
        map0.add(c103);
        map0.add(c104);
        map0.add(c105);
        map0.add(c106);
        map0.add(c107);
        map0.add(c108);
        Collections.shuffle(map0);
        for (int i = 0;i < players.size();i++)
        {
            for (int j = 0;j < 7;j++)
            {
                players.get(i).addCard(map0.get(0));
                map0.remove(0);
            }
        }
        while (map0.get(map0.size()-1).getColor().equals("w"))
            Collections.shuffle(map0);
        type = map0.get(map0.size()-1).getType();
        color = map0.get(map0.size()-1).getColor();
        rotation = 1;
        if (map0.get(map0.size()-1).getType().equals("+2"))
        {
            penalty = penalty + 2;
        }
        if (map0.get(map0.size()-1).getType().equals("s"))
        {
            nextTurn();
        }
        if (map0.get(map0.size()-1).getType().equals("r"))
        {
            changeRotation();
            nextTurn();
        }
    }
    /**
     * create new game 4 member
     * @param player1 player 1
     * @param player2 player 2
     * @param player3 player 3
     * @param player4 player 4
     */
    public Game(Player player1 , Player player2 , Player player3 , Player player4)
    {
        this.number = 4;
        this.penalty = 0;
        Random rand = new Random();
        turn = rand.nextInt(4);
        players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        map0 = new ArrayList<Card>();
        Card c1 = new Card("0","r");
        Card c2 = new Card("1","r");
        Card c3 = new Card("2","r");
        Card c4 = new Card("3","r");
        Card c5 = new Card("4","r");
        Card c6 = new Card("5","r");
        Card c7 = new Card("6","r");
        Card c8 = new Card("7","r");
        Card c9 = new Card("8","r");
        Card c10 = new Card("9","r");
        Card c11 = new Card("1","r");
        Card c12 = new Card("2","r");
        Card c13 = new Card("3","r");
        Card c14 = new Card("4","r");
        Card c15 = new Card("5","r");
        Card c16 = new Card("6","r");
        Card c17 = new Card("7","r");
        Card c18 = new Card("8","r");
        Card c19 = new Card("9","r");
        Card c20 = new Card("r","r");
        Card c21 = new Card("r","r");
        Card c22 = new Card("+2","r");
        Card c23 = new Card("+2","r");
        Card c24 = new Card("s","r");
        Card c25 = new Card("s","r");
        Card c26 = new Card("0","g");
        Card c27 = new Card("1","g");
        Card c28 = new Card("2","g");
        Card c29 = new Card("3","g");
        Card c30 = new Card("4","g");
        Card c31 = new Card("5","g");
        Card c32 = new Card("6","g");
        Card c33 = new Card("7","g");
        Card c34 = new Card("8","g");
        Card c35 = new Card("9","g");
        Card c36 = new Card("1","g");
        Card c37 = new Card("2","g");
        Card c38 = new Card("3","g");
        Card c39 = new Card("4","g");
        Card c40 = new Card("5","g");
        Card c41 = new Card("6","g");
        Card c42 = new Card("7","g");
        Card c43 = new Card("8","g");
        Card c44 = new Card("9","g");
        Card c45 = new Card("r","g");
        Card c46 = new Card("r","g");
        Card c47 = new Card("+2","g");
        Card c48 = new Card("+2","g");
        Card c49 = new Card("s","g");
        Card c50 = new Card("s","g");
        Card c51 = new Card("0","y");
        Card c52 = new Card("1","y");
        Card c53 = new Card("2","y");
        Card c54 = new Card("3","y");
        Card c55 = new Card("4","y");
        Card c56 = new Card("5","y");
        Card c57 = new Card("6","y");
        Card c58 = new Card("7","y");
        Card c59 = new Card("8","y");
        Card c60 = new Card("9","y");
        Card c61 = new Card("1","y");
        Card c62 = new Card("2","y");
        Card c63 = new Card("3","y");
        Card c64 = new Card("4","y");
        Card c65 = new Card("5","y");
        Card c66 = new Card("6","y");
        Card c67 = new Card("7","y");
        Card c68 = new Card("8","y");
        Card c69 = new Card("9","y");
        Card c70 = new Card("r","y");
        Card c71 = new Card("r","y");
        Card c72 = new Card("+2","y");
        Card c73 = new Card("+2","y");
        Card c74 = new Card("s","y");
        Card c75 = new Card("s","y");
        Card c76 = new Card("0","b");
        Card c77 = new Card("1","b");
        Card c78 = new Card("2","b");
        Card c79 = new Card("3","b");
        Card c80 = new Card("4","b");
        Card c81 = new Card("5","b");
        Card c82 = new Card("6","b");
        Card c83 = new Card("7","b");
        Card c84 = new Card("8","b");
        Card c85 = new Card("9","b");
        Card c86 = new Card("1","b");
        Card c87 = new Card("2","b");
        Card c88 = new Card("3","b");
        Card c89 = new Card("4","b");
        Card c90 = new Card("5","b");
        Card c91 = new Card("6","b");
        Card c92 = new Card("7","b");
        Card c93 = new Card("8","b");
        Card c94 = new Card("9","b");
        Card c95 = new Card("r","b");
        Card c96 = new Card("r","b");
        Card c97 = new Card("+2","b");
        Card c98 = new Card("+2","b");
        Card c99 = new Card("s","b");
        Card c100 = new Card("s","b");
        Card c101 = new Card("+4","w");
        Card c102 = new Card("+4","w");
        Card c103 = new Card("+4","w");
        Card c104 = new Card("+4","w");
        Card c105 = new Card("c","w");
        Card c106 = new Card("c","w");
        Card c107 = new Card("c","w");
        Card c108 = new Card("c","w");
        map0.add(c1);
        map0.add(c2);
        map0.add(c3);
        map0.add(c4);
        map0.add(c5);
        map0.add(c6);
        map0.add(c7);
        map0.add(c8);
        map0.add(c9);
        map0.add(c10);
        map0.add(c11);
        map0.add(c12);
        map0.add(c13);
        map0.add(c14);
        map0.add(c15);
        map0.add(c16);
        map0.add(c17);
        map0.add(c18);
        map0.add(c19);
        map0.add(c20);
        map0.add(c21);
        map0.add(c22);
        map0.add(c23);
        map0.add(c24);
        map0.add(c25);
        map0.add(c26);
        map0.add(c27);
        map0.add(c28);
        map0.add(c29);
        map0.add(c30);
        map0.add(c31);
        map0.add(c32);
        map0.add(c33);
        map0.add(c34);
        map0.add(c35);
        map0.add(c36);
        map0.add(c37);
        map0.add(c38);
        map0.add(c39);
        map0.add(c40);
        map0.add(c41);
        map0.add(c42);
        map0.add(c43);
        map0.add(c44);
        map0.add(c45);
        map0.add(c46);
        map0.add(c47);
        map0.add(c48);
        map0.add(c49);
        map0.add(c50);
        map0.add(c51);
        map0.add(c52);
        map0.add(c53);
        map0.add(c54);
        map0.add(c55);
        map0.add(c56);
        map0.add(c57);
        map0.add(c58);
        map0.add(c59);
        map0.add(c60);
        map0.add(c61);
        map0.add(c62);
        map0.add(c63);
        map0.add(c64);
        map0.add(c65);
        map0.add(c66);
        map0.add(c67);
        map0.add(c68);
        map0.add(c69);
        map0.add(c70);
        map0.add(c71);
        map0.add(c72);
        map0.add(c73);
        map0.add(c74);
        map0.add(c75);
        map0.add(c76);
        map0.add(c77);
        map0.add(c78);
        map0.add(c79);
        map0.add(c80);
        map0.add(c81);
        map0.add(c82);
        map0.add(c83);
        map0.add(c84);
        map0.add(c85);
        map0.add(c86);
        map0.add(c87);
        map0.add(c88);
        map0.add(c89);
        map0.add(c90);
        map0.add(c91);
        map0.add(c92);
        map0.add(c93);
        map0.add(c94);
        map0.add(c95);
        map0.add(c96);
        map0.add(c97);
        map0.add(c98);
        map0.add(c99);
        map0.add(c100);
        map0.add(c101);
        map0.add(c102);
        map0.add(c103);
        map0.add(c104);
        map0.add(c105);
        map0.add(c106);
        map0.add(c107);
        map0.add(c108);
        Collections.shuffle(map0);
        for (int i = 0;i < players.size();i++)
        {
            for (int j = 0;j < 7;j++)
            {
                players.get(i).addCard(map0.get(0));
                map0.remove(0);
            }
        }
        while (map0.get(map0.size()-1).getColor().equals("w"))
            Collections.shuffle(map0);
        type = map0.get(map0.size()-1).getType();
        color = map0.get(map0.size()-1).getColor();
        rotation = 1;
        if (map0.get(map0.size()-1).getType().equals("+2"))
        {
            penalty = penalty + 2;
        }
        if (map0.get(map0.size()-1).getType().equals("s"))
        {
            nextTurn();
        }
        if (map0.get(map0.size()-1).getType().equals("r"))
        {
            changeRotation();
            nextTurn();
        }
    }
    /**
     * create new game 5 member
     * @param player1 player 1
     * @param player2 player 2
     * @param player3 player 3
     * @param player4 player 4
     * @param player5 player 5
     */
    public Game(Player player1 , Player player2 , Player player3 , Player player4 , Player player5)
    {
        this.number = 5;
        this.penalty = 0;
        Random rand = new Random();
        turn = rand.nextInt(5);
        players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        map0 = new ArrayList<Card>();
        Card c1 = new Card("0","r");
        Card c2 = new Card("1","r");
        Card c3 = new Card("2","r");
        Card c4 = new Card("3","r");
        Card c5 = new Card("4","r");
        Card c6 = new Card("5","r");
        Card c7 = new Card("6","r");
        Card c8 = new Card("7","r");
        Card c9 = new Card("8","r");
        Card c10 = new Card("9","r");
        Card c11 = new Card("1","r");
        Card c12 = new Card("2","r");
        Card c13 = new Card("3","r");
        Card c14 = new Card("4","r");
        Card c15 = new Card("5","r");
        Card c16 = new Card("6","r");
        Card c17 = new Card("7","r");
        Card c18 = new Card("8","r");
        Card c19 = new Card("9","r");
        Card c20 = new Card("r","r");
        Card c21 = new Card("r","r");
        Card c22 = new Card("+2","r");
        Card c23 = new Card("+2","r");
        Card c24 = new Card("s","r");
        Card c25 = new Card("s","r");
        Card c26 = new Card("0","g");
        Card c27 = new Card("1","g");
        Card c28 = new Card("2","g");
        Card c29 = new Card("3","g");
        Card c30 = new Card("4","g");
        Card c31 = new Card("5","g");
        Card c32 = new Card("6","g");
        Card c33 = new Card("7","g");
        Card c34 = new Card("8","g");
        Card c35 = new Card("9","g");
        Card c36 = new Card("1","g");
        Card c37 = new Card("2","g");
        Card c38 = new Card("3","g");
        Card c39 = new Card("4","g");
        Card c40 = new Card("5","g");
        Card c41 = new Card("6","g");
        Card c42 = new Card("7","g");
        Card c43 = new Card("8","g");
        Card c44 = new Card("9","g");
        Card c45 = new Card("r","g");
        Card c46 = new Card("r","g");
        Card c47 = new Card("+2","g");
        Card c48 = new Card("+2","g");
        Card c49 = new Card("s","g");
        Card c50 = new Card("s","g");
        Card c51 = new Card("0","y");
        Card c52 = new Card("1","y");
        Card c53 = new Card("2","y");
        Card c54 = new Card("3","y");
        Card c55 = new Card("4","y");
        Card c56 = new Card("5","y");
        Card c57 = new Card("6","y");
        Card c58 = new Card("7","y");
        Card c59 = new Card("8","y");
        Card c60 = new Card("9","y");
        Card c61 = new Card("1","y");
        Card c62 = new Card("2","y");
        Card c63 = new Card("3","y");
        Card c64 = new Card("4","y");
        Card c65 = new Card("5","y");
        Card c66 = new Card("6","y");
        Card c67 = new Card("7","y");
        Card c68 = new Card("8","y");
        Card c69 = new Card("9","y");
        Card c70 = new Card("r","y");
        Card c71 = new Card("r","y");
        Card c72 = new Card("+2","y");
        Card c73 = new Card("+2","y");
        Card c74 = new Card("s","y");
        Card c75 = new Card("s","y");
        Card c76 = new Card("0","b");
        Card c77 = new Card("1","b");
        Card c78 = new Card("2","b");
        Card c79 = new Card("3","b");
        Card c80 = new Card("4","b");
        Card c81 = new Card("5","b");
        Card c82 = new Card("6","b");
        Card c83 = new Card("7","b");
        Card c84 = new Card("8","b");
        Card c85 = new Card("9","b");
        Card c86 = new Card("1","b");
        Card c87 = new Card("2","b");
        Card c88 = new Card("3","b");
        Card c89 = new Card("4","b");
        Card c90 = new Card("5","b");
        Card c91 = new Card("6","b");
        Card c92 = new Card("7","b");
        Card c93 = new Card("8","b");
        Card c94 = new Card("9","b");
        Card c95 = new Card("r","b");
        Card c96 = new Card("r","b");
        Card c97 = new Card("+2","b");
        Card c98 = new Card("+2","b");
        Card c99 = new Card("s","b");
        Card c100 = new Card("s","b");
        Card c101 = new Card("+4","w");
        Card c102 = new Card("+4","w");
        Card c103 = new Card("+4","w");
        Card c104 = new Card("+4","w");
        Card c105 = new Card("c","w");
        Card c106 = new Card("c","w");
        Card c107 = new Card("c","w");
        Card c108 = new Card("c","w");
        map0.add(c1);
        map0.add(c2);
        map0.add(c3);
        map0.add(c4);
        map0.add(c5);
        map0.add(c6);
        map0.add(c7);
        map0.add(c8);
        map0.add(c9);
        map0.add(c10);
        map0.add(c11);
        map0.add(c12);
        map0.add(c13);
        map0.add(c14);
        map0.add(c15);
        map0.add(c16);
        map0.add(c17);
        map0.add(c18);
        map0.add(c19);
        map0.add(c20);
        map0.add(c21);
        map0.add(c22);
        map0.add(c23);
        map0.add(c24);
        map0.add(c25);
        map0.add(c26);
        map0.add(c27);
        map0.add(c28);
        map0.add(c29);
        map0.add(c30);
        map0.add(c31);
        map0.add(c32);
        map0.add(c33);
        map0.add(c34);
        map0.add(c35);
        map0.add(c36);
        map0.add(c37);
        map0.add(c38);
        map0.add(c39);
        map0.add(c40);
        map0.add(c41);
        map0.add(c42);
        map0.add(c43);
        map0.add(c44);
        map0.add(c45);
        map0.add(c46);
        map0.add(c47);
        map0.add(c48);
        map0.add(c49);
        map0.add(c50);
        map0.add(c51);
        map0.add(c52);
        map0.add(c53);
        map0.add(c54);
        map0.add(c55);
        map0.add(c56);
        map0.add(c57);
        map0.add(c58);
        map0.add(c59);
        map0.add(c60);
        map0.add(c61);
        map0.add(c62);
        map0.add(c63);
        map0.add(c64);
        map0.add(c65);
        map0.add(c66);
        map0.add(c67);
        map0.add(c68);
        map0.add(c69);
        map0.add(c70);
        map0.add(c71);
        map0.add(c72);
        map0.add(c73);
        map0.add(c74);
        map0.add(c75);
        map0.add(c76);
        map0.add(c77);
        map0.add(c78);
        map0.add(c79);
        map0.add(c80);
        map0.add(c81);
        map0.add(c82);
        map0.add(c83);
        map0.add(c84);
        map0.add(c85);
        map0.add(c86);
        map0.add(c87);
        map0.add(c88);
        map0.add(c89);
        map0.add(c90);
        map0.add(c91);
        map0.add(c92);
        map0.add(c93);
        map0.add(c94);
        map0.add(c95);
        map0.add(c96);
        map0.add(c97);
        map0.add(c98);
        map0.add(c99);
        map0.add(c100);
        map0.add(c101);
        map0.add(c102);
        map0.add(c103);
        map0.add(c104);
        map0.add(c105);
        map0.add(c106);
        map0.add(c107);
        map0.add(c108);
        Collections.shuffle(map0);
        for (int i = 0;i < players.size();i++)
        {
            for (int j = 0;j < 7;j++)
            {
                players.get(i).addCard(map0.get(0));
                map0.remove(0);
            }
        }
        while (map0.get(0).getColor().equals("w"))
            Collections.shuffle(map0);
        type = map0.get(map0.size()-1).getType();
        color = map0.get(map0.size()-1).getColor();
        rotation = 1;
        if (map0.get(map0.size()-1).getType().equals("+2"))
        {
            penalty = penalty + 2;
        }
        if (map0.get(map0.size()-1).getType().equals("s"))
        {
            nextTurn();
        }
        if (map0.get(map0.size()-1).getType().equals("r"))
        {
            changeRotation();
            nextTurn();
        }
    }

    /**
     * which one is turn
     */
    public void nextTurn()
    {
        turn = (turn + rotation)  % number;
        turn = turn + number;
        turn = turn % number;
    }

    /**
     * change rotation
     */
    public void changeRotation()
    {
        rotation = rotation * - 1;
    }

    /**
     * do move
     * @param c c is my card
     */
    public void move(Card c)
    {
        if (players.get(turn).canDrop(map0.get(map0.size()-1),color,penalty) != 0)
        {
            if(c.getType().equals("r"))
            {
                changeRotation();
                players.get(turn).removeCard(c);
                map0.add(c);
                nextTurn();
                return;
            }
            if(c.getType().equals("s"))
            {
                players.get(turn).removeCard(c);
                map0.add(c);
                nextTurn();
                nextTurn();
                return;
            }
            if (c.getType().equals("+2"))
            {
                players.get(turn).removeCard(c);
                map0.add(c);
                penalty = penalty + 2;
                nextTurn();
                return;
            }
            if (c.getType().equals("+4"))
            {
                players.get(turn).removeCard(c);
                map0.add(c);
                penalty = penalty + 4;
                nextTurn();
                return;
            }
            if (c.getType().equals("c"))
            {
                players.get(turn).removeCard(c);
                map0.add(c);
                nextTurn();
                return;
            }
            else
            {
                players.get(turn).removeCard(c);
                map0.add(c);
                nextTurn();
                return;
            }
        }
    }

    /**
     * complet move
     * @param c my card
     * @param color color of game
     */
    public void turn(Card c,String color)
    {
        move(c);
        type = c.getType();
        this.color = color;
    }

    /**
     * penalty is exist
     * @return
     */
    public int withPenalty()
    {
        if (players.get(turn).canDrop(map0.get(map0.size()-1),color,penalty) == 0 && penalty == 0)
        {
            return 0;
        }
        if (players.get(turn).canDrop(map0.get(map0.size()-1),color,penalty) == 0 && penalty > 0)
        {
            return 1;
        }
        return 0;
    }

    /**
     * give one penalty
     */
    public void give()
    {
        players.get(turn).addCard(map0.get(0));
        map0.remove(0);
    }

    /**
     * give penalties
     */
    public void givePenalty()
    {
        for (int i = 0;i<penalty;i++) {
            players.get(turn).addCard(map0.get(0));
            map0.remove(0);
        }
        penalty = 0;
        nextTurn();
    }

    /**
     * game is finish
     * @return 1 is 0 not
     */
    public int end()
    {
        int k = 1000;
        int j = 1000;
        for (int i = 0;i < players.size();i++)
        {
            if(players.get(i).getPointPlayer() < k)
                j = i;
        }
            System.out.println(k);
        return 1;
    }

    /**
     * print card can see and players have how many cards
     */
    public void printCard()
    {
        map0.get(map0.size()-1).print();
        System.out.println(this.rotation);
        for (int i = 0;i < players.size();i++)
        {
            System.out.println(players.get(i).getName()+": "+players.get(i).getCards().size());
        }
    }

    /**
     * get players
     * @return players
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * can drop
     * @return 1 can 0 cant
     */
    public int drop()
    {
        if (players.get(turn).canDrop(map0.get(map0.size()-1),color,penalty) == 0) {
            System.out.println("you cant drop");
            return 0;
        }
        System.out.println("you can drop");
        return 1;
    }

    /**
     * print playrt suggestion
     */
    public void prinPlayerCard()
    {
        players.get(turn).print();
        players.get(turn).printSugesstion(map0.get(map0.size()-1),color,penalty);
    }

    /**
     * card with this index
     * @param index index
     * @return card
     */
    public Card playerIndex(int index)
    {
        return players.get(turn).getCards().get(index - 1);
    }

    /**
     * get color
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * get turn
     * @return turn
     */
    public int getTurn() {
        return turn;
    }

    /**
     * get visible card
     * @return last card
     */
    public Card getC()
    {
        return map0.get(map0.size()-1);
    }

    /**
     * get penalty
     * @return penalty
     */
    public int getPenalty() {
        return penalty;
    }
}
