package al.mid;


import al.mid.marker.MarkerBuilders;
import al.mid.service.MarkerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class MidApiTest {
    private MidApi api;
    private MarkerService markerService;

    @BeforeEach
    void setUp() {
        markerService = mock(MarkerService.class);
        api = mock(MidApi.class);
        when(api.markers()).thenReturn(markerService);
        Mid.startUp(api);
    }

    @Test
    void testMarkers_ReturnsNonNull() {
        assertNotNull(Mid.api().markers());
    }

    @Test
    void testForPoint_ReturnsNonNull() {
        MarkerBuilders.ForWorldPoint forWp = mock(MarkerBuilders.ForWorldPoint.class);
        when(markerService.forWorldPoint(any())).thenReturn(forWp);
        assertNotNull(Mid.api().markers().forWorldPoint(null));
    }

    @Test
    void testForActor_ReturnsNonNull() {
        MarkerBuilders.ForActor forActor = mock(MarkerBuilders.ForActor.class);
        when(markerService.forActor(any())).thenReturn(forActor);
        assertNotNull(Mid.api().markers().forActor(null));
    }
}
