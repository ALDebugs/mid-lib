package al.mid;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class MidTest {

    // shutdown after each test
    @AfterEach
    void tearDown() {
        Mid.shutDown();
    }

    @Test
    void testStartUp() {
        MidApi mockApi = mock(MidApi.class);
        Mid.startUp(mockApi);
        assertSame(mockApi, Mid.api());
    }

    @Test
    void testApi_NotInitialised_ThrowsException() {
        assertThrows(IllegalStateException.class, Mid::api);
    }

    @Test
    void testShutDown() {
        MidApi mockApi = mock(MidApi.class);
        Mid.startUp(mockApi);
        Mid.shutDown();
        assertThrows(IllegalStateException.class, Mid::api);
    }
}
