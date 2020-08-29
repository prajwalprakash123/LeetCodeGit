package generateParanthesis;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
     private  static List<String> result = new ArrayList<>();

    public static List<String> generateParenthesis(int n) {

         generateParenthesis_util(result,0, 0, 0, "", n*2);
         return result;

    }
    public static void generateParenthesis_util(List<String> result,int pos, int no, int nc, String St,int max){
        if(pos==max){

            result.add(St);
            return  ;
            }

        if (no < max/2) {

            generateParenthesis_util(result,pos+1, no+1, nc, St+"(", max);
        }
        if (nc<no){
            generateParenthesis_util(result,pos+1, no, nc+1, St+")", max);
        }





    }

    public static void main(String[] args) {
        generateParenthesis(1);
    }

}
