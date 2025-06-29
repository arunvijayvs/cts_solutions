package com.example;

import org.junit.jupiter.api.Test;                      // ✅ Correct JUnit 5 import
import static org.junit.jupiter.api.Assertions.*;       // ✅ JUnit 5 assertions
import static org.mockito.Mockito.*;                    // ✅ Mockito stubbing

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}
