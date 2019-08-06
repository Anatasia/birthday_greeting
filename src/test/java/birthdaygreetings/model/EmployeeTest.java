package birthdaygreetings.model;

import com.anatasia.birthdaygreetings.model.Employee;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeTest {
    @Test
    public void isBirthdayTest() {
        Employee employee = new Employee("Doe", "John", "1982/08/06",
                "john.doe@foobar.com");
        Assert.assertEquals(employee.isBirthday(), true);
    }
}
