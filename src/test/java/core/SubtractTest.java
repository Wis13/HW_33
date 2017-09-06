package core;
import org.testng.annotations.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
	public class SubtractTest {
       @Test
       public void subtract_test_instanceOf() {
              assertThat(Calculator.subtract(4, 2), instanceOf(Double.class));}

       @Test
       public void subtract_test_2_param() {
              assertThat(Calculator.subtract(4, 2), equalTo(2.0));}

       @Test
       public void subtract_test_3_param() {
              assertThat(Calculator.subtract(8, 4, 2), equalTo(2.0));}

       @Test
       public void subtract_test_4_param() {
              assertThat(Calculator.subtract(16, 8, 4, 2), equalTo(2.0));}
}