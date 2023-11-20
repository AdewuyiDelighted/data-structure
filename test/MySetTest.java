import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MySetTest {
    MySet mySet;
    @BeforeEach
    void setUp(){
        mySet = new MySet();
        }

@Test
    public void testThatSetIsNotEmpty(){
        mySet.add(3);
        mySet.add(5);
        mySet.add(8);



}


}