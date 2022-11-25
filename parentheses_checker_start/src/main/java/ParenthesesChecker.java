package src.main.java;

import java.io.*;
import java.util.*;

public class ParenthesesChecker {

    private static char character;

    static <character> boolean ParenthesesChecker(String string){
        Stack stack = new Stack();
        for (int i = 0; i < string.length();i++){
            char currentChar = string.charAt(i);

            if (currentChar == '('){
                stack.push(currentChar);
            } else if (currentChar == ')') {
                if(stack.peek().equals('(')){
                    stack.pop();
                }
                else{
                    return false;
                }
            } else {
                continue;
            }
        }
        return stack.isEmpty();
    }
}