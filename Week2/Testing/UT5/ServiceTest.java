package Testing;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
public class ServiceTest {
	@Test
    public void testVerifyInteraction() {
        // Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub method if needed (optional here)
        when(mockApi.getData()).thenReturn("Mock Data");

        // Create service and call fetchData
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Verify that getData() was called once
        verify(mockApi).getData();
    }
}
