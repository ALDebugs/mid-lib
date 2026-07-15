package com.aldebugs.mid.service;

import com.aldebugs.mid.marker.MarkerStepBuilders;
import net.runelite.api.Actor;
import net.runelite.api.GameObject;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Projectile;
import net.runelite.api.coords.WorldPoint;

public interface MarkerService {
    MarkerStepBuilders.ActorStep actor(Actor actor);
    MarkerStepBuilders.GroundStep ground(WorldPoint wp);
    MarkerStepBuilders.GameObjStep gameObj(GameObject gameObj);
    MarkerStepBuilders.GfxObjStep gfxObj(GraphicsObject gfxObj);
    MarkerStepBuilders.ProjectileStep projectile(Projectile projectile);

    void clearAll();
}