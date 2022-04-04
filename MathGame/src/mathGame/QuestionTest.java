
package mathGame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *	Test class
 */
public class QuestionTest {
    
    public QuestionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of evaluateAnswer method, of class Question.
     */
    @Test
    public void testEvaluateAnswer() {
        System.out.println("evaluateAnswer");
        
        Question instance = new Question();
        
       
        double result = instance.evaluateAnswer("What is 4 + 5 ?");
        
        if(result == 9.0)
        {
            System.out.println("Tastcase for (+) passed ");
                   
        }
        result = instance.evaluateAnswer("What is 31 - 2 ?");
        
        if(result == 29.0)
        {
            System.out.println("Tastcase for (-) passed ");
                   
        }
        result = instance.evaluateAnswer("What is 3 * 9 ?");
        
        if(result == 27.0)
        {
            System.out.println("Tastcase for (*) passed ");
                   
        }
        result = instance.evaluateAnswer("What is 24 / 10 ?");
        
        if(result == 2.4)
        {
            System.out.println("Tastcase for (/) passed ");
                   
        }
        
    }
    
}
