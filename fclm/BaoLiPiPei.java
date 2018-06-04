package fclm;

import java.lang.*;
public class BaoLiPiPei {

    public int ViolentMatch(String source,String target){
        if(target==null||source==null)
        {
            return -1;
        }
        else if(target.equals("")&&source.equals(""))
            return 0;
        else if(!target.equals("")&&source.equals(""))
            return -1;
        else if(target.equals("")&&!source.equals(""))
            return 0;
        else if(target.length()>source.length()){
            return -1;
        }
    int Slen=source.length();
    int Tlen=target.length();
    int i=0;
    int j=0;
    while(i<Slen&&j<Tlen){
        if(source.charAt(i)==target.charAt(j)){
            i++;
            j++;
        }else{
            i=i-j+1;
            j=0;
        }
    }
    if(j==Tlen)
        return i-j;
    else
        return -1;

    }
        public static void main(String[] args) {
      String source_="source";
      String target_="target";
        BaoLiPiPei ms=new BaoLiPiPei();
        int s=ms.ViolentMatch(source_,target_);
            System.out.println(s);

    }

}
