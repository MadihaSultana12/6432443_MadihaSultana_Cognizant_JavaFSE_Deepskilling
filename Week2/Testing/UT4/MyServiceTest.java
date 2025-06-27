package Testing;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
public class MyServiceTest {
	 @Test
	    public void testExternalApi() {
	        // Create a mock object for ExternalApi
	        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

	        // Stub the method to return predefined value
	        when(mockApi.getData()).thenReturn("Mock Data");

	        // Inject mock into MyService
	        MyService service = new MyService(mockApi);

	        // Call method and assert result
	        String result = service.fetchData();
	        assertEquals("Mock Data", result);
	    }
}
