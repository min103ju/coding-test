package Parentheses;

public class Solution {
    
    public String solution(String p){

        if(p.isEmpty()) return p;

        return getV(p);

    }

    public String getV(String v){
        String result = "";

        if(v.isEmpty()) return v;

        int seperateIndex = getSeperateCorrectStringIdeString(v);
        String u = v.substring(0, seperateIndex);
        v = v.substring(seperateIndex);
        
        //올바른 문자열이라면
        if(validateCorrectString(u)){
            result += u;
            result += getV(v);
        }
        //올바르지 않은 문자열이라면
        else {
            result += "(";
            result += getV(v);
            result += ")";

            result += reverseU(u);
        }

        return result;
    }

    public String reverseU(String u) {
        String reverseU = "";

        //첫번째 문자와 마지막 문자 제거
        u = u.substring(1, u.length() - 1);

        for(char c : u.toCharArray()) {
            if(c=='(') reverseU += ")";
            if(c==')') reverseU += "(";
        }

        return reverseU;
    }

    public int getSeperateCorrectStringIdeString(String p) {

        int openParentheses = 0, closeParentheses = 0;

        for(int i=0; i < p.length(); i++) {
            if(p.charAt(i) == '(') openParentheses++;
            if(p.charAt(i) == ')') closeParentheses++;

            //'('와 ')'의 갯수가 같아지는 순간 더 이상 분리할 수 없는 "균형잡힌 괄호 문자열"
            if(openParentheses == closeParentheses) return i+1;
        }

        return 0;
    }

    public boolean validateCorrectString(String u) {

        char firstCharacter = u.charAt(0);
        char lastCharacter = u.charAt(u.length()-1);

        int openParentheses = 0, closeParentheses = 0;

        //1. 올바른 문자열이 아닐 경우
        if(firstCharacter != '(' && lastCharacter != ')') return false;

        for(int i=1; i < u.length()-1 ; i++){
            if(u.charAt(i) == '(') openParentheses++;
            if(u.charAt(i) == ')') closeParentheses++;

            //2. ')'의 갯수가 더 많아지는 순간 올바른 문자열이 아님.
            if(openParentheses < closeParentheses) return false;
        }

        //3. 올바른 문자열의 경우
        return true;
    }

}