package DSAQuestions.PriorityQueue;

import java.util.HashMap;
import java.util.List;

public class l2 {

    int window =10;

    class PairMsgTime{
        String msg;
        int time;
        public PairMsgTime(String msg, int time){
            this.msg = msg;
            this.time = time;
        }
    }

    class Pair{
        int lastTime;
        int currTime;

        public Pair(int lastTime, int currTime){
            this.lastTime = lastTime;
            this.currTime = currTime;
        }
    }



    void getUniqueMsgs(List<PairMsgTime> msgs) {

        HashMap<String,Pair> map = new HashMap<>();

        for(int i=0; i< msgs.size(); i++){
            PairMsgTime msgPair = msgs.get(i);
            int currTime = msgPair.time;
            String val = msgPair.msg;

            int lastTime =-1;

            if(map.containsKey(val)){
                Pair p = map.get(val);
                int prevTime = p.lastTime;
                lastTime = p.currTime;

                p.lastTime = p.currTime;
                p.currTime = currTime;
                map.put(val,p);


            }else{
                Pair p = new Pair(-1,currTime);
                map.put(val,p);
            }
        }
    }

    List<Integer> getMsgs(HashMap<String,Pair> map){

      
    }
}
