package com.aldebugs.mid.service;

import com.aldebugs.mid.marker.MarkerBuilders;
import net.runelite.api.Actor;
import net.runelite.api.GameObject;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldPoint;

public interface MarkerService {

    MarkerBuilders.ForWorldPoint forWorldPoint(WorldPoint worldPoint);
    MarkerBuilders.ForActor forActor(Actor actor);
    MarkerBuilders.ForGameObj forGameObj(GameObject gameObj);
    MarkerBuilders.ForGfxObj forGfxObj(GraphicsObject gfxObj);
    MarkerBuilders.ForProjectile forProjectile(Projectile projectile);

    void onGameTick();
    void clearAll();


}