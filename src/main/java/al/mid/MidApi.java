package al.mid;

import al.mid.service.AttackService;
import al.mid.service.ColourService;
import al.mid.service.MarkerService;

public interface MidApi {
    AttackService attack();
    MarkerService markers();
    ColourService colours();

    void reset();
}