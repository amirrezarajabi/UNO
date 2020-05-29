/**
 * Card class reperesent a card
 */
public class Card
{
    //color r:red b:blue y:yellow g:green w:wild
    private String color;
    //type number:0,1,...,9   skip:s   draw2:+2    reverse:r   draw4:+4 color:c
    private String type;
    //point of card:
    private int point;
    /**
     * create new card
     * @param type type of card
     * @param color color of card
     */
    public Card(String type , String color)
    {
        this.type = type;
        this.color = color;
        if (type.equals("0"))
            this.point = 0;
        if (type.equals("1"))
            this.point = 1;
        if (type.equals("2"))
            this.point = 2;
        if (type.equals("3"))
            this.point = 3;
        if (type.equals("4"))
            this.point = 4;
        if (type.equals("5"))
            this.point = 5;
        if (type.equals("6"))
            this.point = 6;
        if (type.equals("7"))
            this.point = 7;
        if (type.equals("8"))
            this.point = 8;
        if (type.equals("9"))
            this.point = 9;
        if (type.equals("s"))
            this.point = 20;
        if (type.equals("+2"))
            this.point = 20;
        if (type.equals("r"))
            this.point = 20;
        if (type.equals("+4"))
            this.point = 50;
        if (type.equals("c"))
            this.point = 50;
    }

    /**
     * print card
     */
    public void print()
    {
        if (color.equals("w"))
        {
            if (type.equals("+4"))
            {
                System.out.println("****************");
                System.out.println("*              *");
                System.out.println("*      +4      *");
                System.out.println("*              *");
                System.out.println("****************");
            }
            if (type.equals("c"))
            {
                System.out.println("****************");
                System.out.println("*              *");
                System.out.println("*    color     *");
                System.out.println("*              *");
                System.out.println("****************");
            }
        }
        if (color.equals("r"))
        {
            int flag = 0;
            if (flag == 0 && type.equals("r"))
            {
                System.out.println("\033[0;31m"+"****************");
                System.out.println("*              *");
                System.out.println("*   reverse    *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
            if (flag == 0 && type.equals("s"))
            {
                System.out.println("\033[0;31m"+"****************");
                System.out.println("*              *");
                System.out.println("*     skip     *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
            if (flag == 0 && type.equals("+2"))
            {
                System.out.println("\033[0;31m"+"****************");
                System.out.println("*              *");
                System.out.println("*     +2       *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
            if (flag == 0)
            {
                System.out.println("\033[0;31m"+"****************");
                System.out.println("*              *");
                System.out.println("*      "+type+"       *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
        }
        if (color.equals("b"))
        {
            int flag = 0;
            if (flag == 0 && type.equals("r"))
            {
                System.out.println("\033[0;34m"+"****************");
                System.out.println("*              *");
                System.out.println("*   reverse    *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
            if (flag == 0 && type.equals("s"))
            {
                System.out.println("\033[0;34m"+"****************");
                System.out.println("*              *");
                System.out.println("*     skip     *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
            if (flag == 0 && type.equals("+2"))
            {
                System.out.println("\033[0;34m"+"****************");
                System.out.println("*              *");
                System.out.println("*     +2       *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
            if (flag == 0)
            {
                System.out.println("\033[0;34m"+"****************");
                System.out.println("*              *");
                System.out.println("*      "+type+"       *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
        }
        if (color.equals("g"))
        {
            int flag = 0;
            if (flag == 0 && type.equals("r"))
            {
                System.out.println("\033[0;32m"+"****************");
                System.out.println("*              *");
                System.out.println("*   reverse    *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
            if (flag == 0 && type.equals("s"))
            {
                System.out.println("\033[0;32m"+"****************");
                System.out.println("*              *");
                System.out.println("*     skip     *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
            if (flag == 0 && type.equals("+2"))
            {
                System.out.println("\033[0;32m"+"****************");
                System.out.println("*              *");
                System.out.println("*     +2       *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
            if (flag == 0)
            {
                System.out.println("\033[0;32m"+"****************");
                System.out.println("*              *");
                System.out.println("*      "+type+"       *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
        }
        if (color.equals("y"))
        {
            int flag = 0;
            if (flag == 0 && type.equals("r"))
            {
                System.out.println("\033[0;33m"+"****************");
                System.out.println("*              *");
                System.out.println("*   reverse    *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
            if (flag == 0 && type.equals("s"))
            {
                System.out.println("\033[0;33m"+"****************");
                System.out.println("*              *");
                System.out.println("*     skip     *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
            if (flag == 0 && type.equals("+2"))
            {
                System.out.println("\033[0;33m"+"****************");
                System.out.println("*              *");
                System.out.println("*     +2       *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
            if (flag == 0)
            {
                System.out.println("\033[0;33m"+"****************");
                System.out.println("*              *");
                System.out.println("*      "+type+"       *");
                System.out.println("*              *");
                System.out.println("****************"+"\033[0;0m");
                flag = 1;
            }
        }
    }

    /**
     * get type of card
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * get type
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * point of card
     * @return point
     */
    public int getPoint() {
        return point;
    }

    /**
     * card can drop
     * @param type type of card be
     * @param color color of card be
     * @return 1 can 0 cant
     */
    public int canBe(String type , String color)
    {
        if (this.color.equals(color) || this.type.equals(type))
            return 1;
        return 0;
    }
}
