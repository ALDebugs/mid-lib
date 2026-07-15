package com.aldebugs.mid;

import com.aldebugs.mid.attack.AttackHandle;
import com.aldebugs.mid.marker.MarkerHandle;
import com.aldebugs.mid.service.AttackService;
import com.aldebugs.mid.service.ColourService;
import com.aldebugs.mid.service.MarkerService;

public interface MidApi {
    AttackService attack();
    MarkerService markers();
    ColourService colours();

    /** Convenience **/
    MarkerHandle dangerTile();
    AttackHandle timedAttack();

    void reset();
}