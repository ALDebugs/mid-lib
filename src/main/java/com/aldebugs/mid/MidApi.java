package com.aldebugs.mid;

import com.aldebugs.mid.attack.AttackHandle;
import com.aldebugs.mid.marker.MarkerHandle;
import com.aldebugs.mid.service.AttackService;
import com.aldebugs.mid.service.ColourService;
import com.aldebugs.mid.service.MarkerService;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldPoint;

public interface MidApi {
    AttackService attack();
    MarkerService markers();
    ColourService colours();

    /** Convenience **/
    MarkerHandle dangerTile(WorldPoint worldPoint, int ticksLeft);
    MarkerHandle dangerFilledTile(WorldPoint worldPoint, int ticksLeft);
    AttackHandle timedAttack(Prayer prayer,  int ticksLeft);
    AttackHandle stickyAttack(Prayer prayer);

    // data
    int getData(NPC npc);

    void reset();
}