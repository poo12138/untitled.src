package fclm;

public class Rotate {

    public void rotateString(char[] str, int offset) {
        // write your code here
        //采用的是三步旋转法
        //1.以offset=4 为例将数组看作 abc+defg
        //2.先整体旋转 变为gfed+ cba
        //3.再将两小块分别旋转 defg+abc
        //ps：当数组为空时，offset 实际数字大于数组数组长度时的情况；
        if (str == null || str.length == 0){return ;}
        offset=offset%str.length;
        char temp;
        for (int i = 0; i < str.length / 2; i++) {
            temp = str[str.length - i - 1];
            str[str.length - i - 1] = str[i];
            str[i] = temp;
        }
        for(int i = 0; i < offset/2; i++) {//offset部分翻转
            temp = str[i];
            str[i] = str[offset - 1 - i];
            str[offset - 1 - i] = temp;
        }
        for(int i = 0; i < (str.length - offset + 1)/2; i++) {//剩余部分翻转
            temp= str[offset + i];
            str[offset + i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = temp;
        }

        }

//        public void change(char[] str,int length) {
//            char temp;
//            for (int i = 0; i < str.length / 2; i++) {
//                temp = str[str.length - i - 1];
//                str[str.length - i - 1] = str[i];
//                str[i] = temp;
//            }
//        }
    public static void main(String[] args) {
      char[] str={'a','b','c','d','e','f','g'};


      int n=215;
      int b= (n/100)%10;
      System.out.println(b);
      Rotate m=new Rotate();
      m.rotateString(str,4);
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}


