package birthdaygreetings.utils;

import com.anatasia.birthdaygreetings.model.Employee;
import com.anatasia.birthdaygreetings.utils.EmployeeParserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeParserUtilsTest {
    @Test
    public void parseStringTest(){
        Employee employee = new Employee("Doe", "John", "1982/08/06",
                "john.doe@foobar.com");
        Assert.assertEquals(employee.getEmail(), EmployeeParserUtils
                .parseString("Doe, John, 1982/08/06, john.doe@foobar.com").getEmail());
    }
}
