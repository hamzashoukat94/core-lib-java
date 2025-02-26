package apimatic.core.static_classes;

import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import org.junit.Test;
import io.apimatic.core.utilities.XmlLocalDateTimeHelper;

public class XmlDateTimeHelperTest {
    @Test
    public void testSerializeSimpleDate() {
        LocalDate localDate = LocalDate.of(2000, 7, 13);
        String rootName = "XmlRootName";
        
        // stub
        String expected = "<XmlRootName>2000-07-13</XmlRootName>";
        String actual = XmlLocalDateTimeHelper.serializeSimpleDate(localDate, rootName);

        assertEquals(actual, expected);
    }
    
    @Test
    public void testDeserializeUnixSimpleDate() {
        String dateTime = "<XmlRootName>2000-07-13</XmlRootName>";
        
        // stub
        LocalDate expected = LocalDate.of(2000, 7, 13);
        LocalDate actual = XmlLocalDateTimeHelper.deserializeSimpleDate(dateTime);
        
        assertEquals(actual, expected);
    }
}
