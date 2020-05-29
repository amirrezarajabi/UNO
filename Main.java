import java.util.*;

public class Main {
    /**
     * create random color for bot(wild)
     * @param n random number
     * @return colorString
     */
    public static String randomColor(int n)
    {
        if (n == 0)
            return "r";
        if (n == 1)
            return "g";
        if (n == 2)
            return "b";
        else
            return "y";
    }
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("1:with bot 2:with human");
        int mod = input.nextInt();
        //mode of game
        if(mod == 2)
        {
            //create player
            Player p1 = new Player("player1",0);
            Player p2 = new Player("player2",0);
            Player p3 = new Player("player3",0);
            //how many number of player
            System.out.println("3,4,5 gamer");
            int number = input.nextInt();
            if(number == 3)
            {
                //create game
                Game g = new Game(p1,p2,p3);
                String color;
                color = g.getColor();
                while (g.end() == 0)
                {
                    //player move
                    g.prinPlayerCard();
                    if (g.drop() == 1)
                    {
                        g.prinPlayerCard();
                        int n = input.nextInt();
                        color = g.playerIndex(n).getColor();
                        if(g.playerIndex(n).getType().equals("w"))
                        {
                            color = input.nextLine();
                        }
                        g.turn(g.playerIndex(n),color);
                        g.printCard();
                    }
                    else
                    {
                        if(g.withPenalty() == 1)
                        {
                            g.givePenalty();
                        }
                        else
                        {
                            g.prinPlayerCard();
                            g.give();
                            g.prinPlayerCard();
                            g.prinPlayerCard();
                            if(g.drop()==1)
                            {
                                int n = input.nextInt();
                                color = g.playerIndex(n).getColor();
                                if(g.playerIndex(n).getType().equals("w"))
                                {
                                    color = input.next();
                                }
                                g.turn(g.playerIndex(n),color);
                                g.printCard();
                            }
                            else
                            {
                                g.nextTurn();
                            }
                        }
                    }
                }
            }
            if(number == 4)
            {
                //create player
                Player p4 = new Player("player4",0);
                //create game
                Game g = new Game(p1,p2,p3,p4);
                String color;
                color = g.getColor();
                while (g.end() == 0)
                {
                    //move player
                    g.prinPlayerCard();
                    if (g.drop() == 1)
                    {
                        g.prinPlayerCard();
                        int n = input.nextInt();
                        color = g.playerIndex(n).getColor();
                        if(g.playerIndex(n).getType().equals("w"))
                        {
                            color = input.nextLine();
                        }
                        g.turn(g.playerIndex(n),color);
                        g.printCard();
                    }
                    else
                    {
                        if(g.withPenalty() == 1)
                        {
                            g.givePenalty();
                        }
                        else
                        {
                            g.prinPlayerCard();
                            g.give();
                            g.prinPlayerCard();
                            g.prinPlayerCard();
                            if(g.drop()==1)
                            {
                                int n = input.nextInt();
                                color = g.playerIndex(n).getColor();
                                if(g.playerIndex(n).getType().equals("w"))
                                {
                                    color = input.next();
                                }
                                g.turn(g.playerIndex(n),color);
                                g.printCard();
                            }
                            else
                            {
                                g.nextTurn();
                            }
                        }
                    }
                }
            }
            if(number == 5)
            {
                //create player
                Player p4 = new Player("player4",0);
                Player p5 = new Player("player5",0);
                //create game
                Game g = new Game(p1,p2,p3,p4,p5);
                String color;
                color = g.getColor();
                while (g.end() == 0)
                {
                    //move player
                    g.prinPlayerCard();
                    if (g.drop() == 1)
                    {
                        g.prinPlayerCard();
                        int n = input.nextInt();
                        color = g.playerIndex(n).getColor();
                        if(g.playerIndex(n).getType().equals("w"))
                        {
                            color = input.nextLine();
                        }
                        g.turn(g.playerIndex(n),color);
                        g.printCard();
                    }
                    else
                    {
                        if(g.withPenalty() == 1)
                        {
                            g.givePenalty();
                        }
                        else
                        {
                            g.prinPlayerCard();
                            g.give();
                            g.prinPlayerCard();
                            g.prinPlayerCard();
                            if(g.drop()==1)
                            {
                                int n = input.nextInt();
                                color = g.playerIndex(n).getColor();
                                if(g.playerIndex(n).getType().equals("w"))
                                {
                                    color = input.next();
                                }
                                g.turn(g.playerIndex(n),color);
                                g.printCard();
                            }
                            else
                            {
                                g.nextTurn();
                            }
                        }
                    }
                }
            }
        }
        //1 player with bot
        if(mod == 1)
        {
            //create player
            Player p1 = new Player("player1",1);
            //create bot
            Player p2 = new Player("player2",0);
            Player p3 = new Player("player3",0);
            System.out.println("3,4,5 gamer");
            int number = input.nextInt();
            if(number == 3)
            {
                //create game
                Game g = new Game(p1,p2,p3);
                String color;
                color = g.getColor();
                while (g.end() == 0)
                {
                    g.printCard();
                    //move player
                    if (g.getTurn() == 0) {
                        g.prinPlayerCard();
                        if (g.drop() == 1) {
                            g.prinPlayerCard();
                            int n = input.nextInt();
                            color = g.playerIndex(n).getColor();
                            if (g.playerIndex(n).getType().equals("w")) {
                                color = input.nextLine();
                            }
                            g.turn(g.playerIndex(n), color);
                            g.printCard();
                        } else {
                            if (g.withPenalty() == 1) {
                                g.givePenalty();
                            } else {
                                g.prinPlayerCard();
                                g.give();
                                g.prinPlayerCard();
                                g.prinPlayerCard();
                                if (g.drop() == 1) {
                                    int n = input.nextInt();
                                    color = g.playerIndex(n).getColor();
                                    if (g.playerIndex(n).getType().equals("w")) {
                                        color = input.next();
                                    }
                                    g.turn(g.playerIndex(n), color);
                                    g.printCard();
                                } else {
                                    g.nextTurn();
                                }
                            }
                        }
                    }
                    //move bot
                    g.printCard();
                    if(g.getTurn() != 0)
                    {
                        g.prinPlayerCard();
                        if (g.drop() == 1) {
                            int n = g.getPlayers().get(g.getTurn()).indexDrop(g.getC(),g.getColor(),g.getPenalty())+1;
                            color = g.playerIndex(n).getColor();
                            if (g.playerIndex(n).getType().equals("w")) {
                                color = "y";
                            }
                            g.turn(g.playerIndex(n), color);
                            g.printCard();
                        } else {
                            if (g.withPenalty() == 1) {
                                g.givePenalty();
                            } else {
                                g.give();
                                if (g.drop() == 1) {
                                    int n = g.getPlayers().get(g.getTurn()).indexDrop(g.getC(),g.getColor(),g.getPenalty());
                                    color = g.playerIndex(n).getColor();
                                    if (g.playerIndex(n).getType().equals("w")) {
                                        int nnn = random.nextInt(4);
                                        color = randomColor(nnn);
                                    }
                                    g.turn(g.playerIndex(n), color);
                                    g.printCard();
                                } else {
                                    g.nextTurn();
                                }
                            }
                        }
                    }
                }
            }
            if(number == 4)
            {
                //create bot
                Player p4 = new Player("player4",0);
                //create game
                Game g = new Game(p1,p2,p3,p4);
                String color;
                color = g.getColor();
                while (g.end() == 0)
                {
                    //move player
                    if (g.getTurn() == 0) {
                        g.prinPlayerCard();
                        if (g.drop() == 1) {
                            g.prinPlayerCard();
                            int n = input.nextInt();
                            color = g.playerIndex(n).getColor();
                            if (g.playerIndex(n).getType().equals("w")) {
                                color = input.nextLine();
                            }
                            g.turn(g.playerIndex(n), color);
                            g.printCard();
                        } else {
                            if (g.withPenalty() == 1) {
                                g.givePenalty();
                            } else {
                                g.prinPlayerCard();
                                g.give();
                                g.prinPlayerCard();
                                g.prinPlayerCard();
                                if (g.drop() == 1) {
                                    int n = input.nextInt();
                                    color = g.playerIndex(n).getColor();
                                    if (g.playerIndex(n).getType().equals("w")) {
                                        color = input.next();
                                    }
                                    g.turn(g.playerIndex(n), color);
                                    g.printCard();
                                } else {
                                    g.nextTurn();
                                }
                            }
                        }
                    }
                    //move bot
                    if(g.getTurn() != 0)
                    {
                        g.prinPlayerCard();
                        if (g.drop() == 1) {
                            int n = g.getPlayers().get(g.getTurn()).indexDrop(g.getC(),g.getColor(),g.getPenalty());
                            color = g.playerIndex(n).getColor();
                            if (g.playerIndex(n).getType().equals("w")) {
                                color = "y";
                            }
                            g.turn(g.playerIndex(n), color);
                            g.printCard();
                        } else {
                            if (g.withPenalty() == 1) {
                                g.givePenalty();
                            } else {
                                g.give();
                                if (g.drop() == 1) {
                                    int n = g.getPlayers().get(g.getTurn()).indexDrop(g.getC(),g.getColor(),g.getPenalty());
                                    color = g.playerIndex(n).getColor();
                                    if (g.playerIndex(n).getType().equals("w")) {
                                        int nnn = random.nextInt(4);
                                        color = randomColor(nnn);
                                    }
                                    g.turn(g.playerIndex(n), color);
                                    g.printCard();
                                } else {
                                    g.nextTurn();
                                }
                            }
                        }
                    }
                }
            }
            if(number == 5)
            {
                //create bots
                Player p4 = new Player("player4",0);
                Player p5 = new Player("player5",0);
                //create game
                Game g = new Game(p1,p2,p3,p4,p5);
                String color;
                color = g.getColor();
                while (g.end() == 0)
                {
                    //move player
                    if (g.getTurn() == 0) {
                        g.prinPlayerCard();
                        if (g.drop() == 1) {
                            g.prinPlayerCard();
                            int n = input.nextInt();
                            color = g.playerIndex(n).getColor();
                            if (g.playerIndex(n).getType().equals("w")) {
                                color = input.nextLine();
                            }
                            g.turn(g.playerIndex(n), color);
                            g.printCard();
                        } else {
                            if (g.withPenalty() == 1) {
                                g.givePenalty();
                            } else {
                                g.prinPlayerCard();
                                g.give();
                                g.prinPlayerCard();
                                g.prinPlayerCard();
                                if (g.drop() == 1) {
                                    int n = input.nextInt();
                                    color = g.playerIndex(n).getColor();
                                    if (g.playerIndex(n).getType().equals("w")) {
                                        color = input.next();
                                    }
                                    g.turn(g.playerIndex(n), color);
                                    g.printCard();
                                } else {
                                    g.nextTurn();
                                }
                            }
                        }
                    }
                    //move bot
                    if(g.getTurn() != 0)
                    {
                        g.prinPlayerCard();
                        if (g.drop() == 1) {
                            int n = g.getPlayers().get(g.getTurn()).indexDrop(g.getC(),g.getColor(),g.getPenalty());
                            color = g.playerIndex(n).getColor();
                            if (g.playerIndex(n).getType().equals("w")) {
                                color = "y";
                            }
                            g.turn(g.playerIndex(n), color);
                            g.printCard();
                        } else {
                            if (g.withPenalty() == 1) {
                                g.givePenalty();
                            } else {
                                g.give();
                                if (g.drop() == 1) {
                                    int n = g.getPlayers().get(g.getTurn()).indexDrop(g.getC(),g.getColor(),g.getPenalty());
                                    color = g.playerIndex(n).getColor();
                                    if (g.playerIndex(n).getType().equals("w")) {
                                        int nnn = random.nextInt(4);
                                        color = randomColor(nnn);
                                    }
                                    g.turn(g.playerIndex(n), color);
                                    g.printCard();
                                } else {
                                    g.nextTurn();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}