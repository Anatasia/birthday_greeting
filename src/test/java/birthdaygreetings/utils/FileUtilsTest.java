package birthdaygreetings.utils;

import com.anatasia.birthdaygreetings.App;
import com.anatasia.birthdaygreetings.utils.FileUtils;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class FileUtilsTest {
    @Test
    public void readFileTest() {
        List<String> list = FileUtils.readFile("employee_records.txt");
        assertEquals(list.get(0), "Doe, John, 1982/08/06, john.doe@foobar.com");
    }
}
