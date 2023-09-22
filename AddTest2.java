package dad.codesignal;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import java.beans.Transient;
import org.junit.Before;

public class AddTest2 {
    private Add add;

    @Before
    public void setup() {
        add = new Add();
    }


    //Nivel 01
    public class Add {
        int solution(int param1, int param2) {
            return param1 + param2;
        }    

    //Nivel 02
    @Test
    public class test01 {
        int solution(int year) {
            int century = (year - 1) / 100 + 1; 
            return century;
        }
    }

    //Nivel 03
    @Test
    boolean solution(String inputString) {
        for (int i = 0; i < inputString.length() / 2; i++) {
    
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1)) {
                return false;
            }
        } 
        return true;
    }


    }
}


   