import java.util.*;
class Cards{
    private int suit;
    private String flower;
    public Cards(int suit,String flower){
        this.suit=suit;
        this.flower=flower;
    }
    @Override
    public String toString(){
        return String.format("[%d,%s]",suit,flower);
    }
}

class Game{
    private String[] arr={"♠","♥","♣","♦"};
    public Game(){

    }

    public void print(ArrayList<Cards> cards){

        for(int i=0;i<4;i++){
            for(int j=1;j<=13;j++){
                Cards c=new Cards(j,arr[i]);
                cards.add(c);
            }
        }
        for(int i=0;i<52;i++){
            if(i!=0&&i%13==0){
                System.out.println();
            }
            System.out.print(cards.get(i)+" ");
        }
        System.out.println();
    }

    private void swap(ArrayList<Cards> cards,int i,int j){
        Cards tmp=cards.get(i);
        cards.set(i,cards.get(j));
        cards.set(j,tmp);
    }
    public void wash(ArrayList<Cards> cards){
        Random random=new Random();
        for(int i=51;i>1;i--){
            swap(cards,random.nextInt(i),i);
        }
        for(int i=0;i<cards.size();i++){
            if(i!=0&&i%13==0){
                System.out.println();
            }
            System.out.print(cards.get(i)+" ");
        }
        System.out.println();
    }

    public void play(ArrayList<Cards> cards){
        ArrayList<ArrayList<Cards>> res=new ArrayList<>(3);
        for(int i=0;i<3;i++){
            res.add(new ArrayList<Cards>());
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                res.get(j).add(cards.remove(0));
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(res.get(i));
        }
    }
}
public class Test {
    public static void main(String[] args) {
        /*Game game=new Game();
        ArrayList<Cards> cards=new ArrayList<>();
        game.print(cards);
        game.wash(cards);
        game.play(cards);*/
        /*int x=20;
        int y=5;
        System.out.println(x+y+""+x+y+y);*/
        /*int i=7;
        int flag=0;
        do{
            System.out.println(--i);
            --i;
            flag++;
        }while(i!=0);
        System.out.println(i);*/
        /*int res=0;
        int i=2;
        switch(i){
            case 1:
                res=res+i;
            case 2:
                res=res+i*2;
            case 3:
                res=res+i*3;
        }
        System.out.println(res);*/

         class Example{
            String str=new String("hello");
            char[]ch={'a','b'};
            public void change(String str,char ch[]){
                str="test ok";
                ch[0]='c';
            }
        }
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);
    }
}
