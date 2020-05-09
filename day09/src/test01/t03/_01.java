package test01.t03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class _01 {
    public static void main(String[] args) {
        HashMap<Integer, String> pookerMap = new HashMap<Integer, String>();
        ArrayList<Integer> pookerList = new ArrayList<Integer>();
        String[] colors = "♥-♠-♦-♣".split("-");
        String[] nums = "2-A-K-Q-J-10-9-8-7-6-5-4-3".split("-");
        int number=2;
        for (String num:nums
        ) {
            for (String color:colors
            ) {
                String thisPooker = color+num;
                pookerMap.put(number, thisPooker);
                pookerList.add(number);
                number++;
            }
        }
        pookerMap.put(0, "大王");
        pookerMap.put(1, "小王");
        pookerList.add(0);
        pookerList.add(1);
        Collections.shuffle(pookerList);

        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        ArrayList<Integer> diPai = new ArrayList<Integer>();

        ArrayList<Integer> player11 = new ArrayList<Integer>();
        ArrayList<Integer> player22 = new ArrayList<Integer>();
        ArrayList<Integer> player33 = new ArrayList<Integer>();
        ArrayList<Integer> diPai1 = new ArrayList<Integer>();

        ArrayList<Integer> cheatpookerList = new ArrayList<>();




        for (int i=17;i<54;i++){
            cheatpookerList.add(i);
        }



       Collections.shuffle(cheatpookerList);


        deal(pookerMap,pookerList,player1,player2, player3,diPai);
        System.out.println("========================================");
        cheat(pookerMap,cheatpookerList,player11,player22, player33,diPai1);





    }

    private static void cheat(HashMap<Integer, String> pookerMap, ArrayList<Integer> cheatpookerList, ArrayList<Integer> player1, ArrayList<Integer> player2, ArrayList<Integer> player3, ArrayList<Integer> diPai) {
        for (int i=0;i<cheatpookerList.size();i++){
            Integer pookerNum= (Integer) cheatpookerList.get(i);
            if(i>=34){
                diPai.add(pookerNum);
            }else if(i % 2 == 0){
                player1.add(pookerNum);
            }else if(i % 2 == 1){
                player2.add(pookerNum);
            }

        }
        for (int i=0;i<17;i++){
            player3.add(i);
        }



        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);


        show("玩家一",player1,pookerMap);
        show("玩家二",player2,pookerMap);
        show("vip玩家",player3,pookerMap);
        show("底牌",diPai,pookerMap);


    }


    public  static void deal(HashMap pookerMap,ArrayList pookerList,ArrayList player1,ArrayList player2,ArrayList  player3,ArrayList diPai){
        for (int i=0;i<pookerList.size();i++){
            Integer pookerNum= (Integer) pookerList.get(i);
            if(i>=51){
                diPai.add(pookerNum);
            }else if(i % 3 == 0){
                player1.add(pookerNum);
            }else if(i % 3 == 1){
                player2.add(pookerNum);
            }else if(i % 3 == 2){
                player3.add(pookerNum);
            }


        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(diPai);


        show("玩家一",player1,pookerMap);
        show("玩家二",player2,pookerMap);
        show("玩家三：",player3,pookerMap);
        show("底牌",diPai,pookerMap);

    }






    public static void show(String name,ArrayList<Integer> player,HashMap<Integer, String> pookerMap ){
        System.out.print(name+":");
        for(Integer pookerNum : player){
            String thisPooker = pookerMap.get(pookerNum);
            System.out.print(thisPooker+" ");
        }
        System.out.println();
    }
}


