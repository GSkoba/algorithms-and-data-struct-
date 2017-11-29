package seminar;

import org.junit.Test;
import static seminar.ParenthesesSequence.isBalanced;

import static org.junit.Assert.*;

public class ParenthesesSequenceTest {

    @Test
    public void Test1(){
        String str = "(())";
        assertEquals(true,isBalanced(str));
    }

    @Test
    public void Test2(){
        String str = "))((";
        assertEquals(false,isBalanced(str));
    }

    @Test
    public void Test3(){
        String str = "(()";
        assertEquals(false,isBalanced(str));
    }

    @Test
    public void Test4(){
        String str = "((()";
        assertEquals(false,isBalanced(str));
    }

    @Test
    public void Test5(){
        String str = "(()()(())((())))";
        assertEquals(true,isBalanced(str));
    }


}