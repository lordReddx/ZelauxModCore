package mma.entities.compByAnuke;

import arc.math.*;
import arc.math.geom.*;
import mindustry.async.PhysicsProcess.*;
import mindustry.gen.*;
import mma.annotations.ModAnnotations;

/** Affected by physics.
 * Will bounce off of other objects that are at similar elevations.
 * Has mass.*/

/**
 * Affected by physics.
 * Will bounce off of other objects that are at similar elevations.
 * Has mass.
 */
@ModAnnotations.Component
abstract class PhysicsComp implements Velc, Hitboxc, Flyingc {

    @ModAnnotations.Import
    float hitSize, x, y;

    @ModAnnotations.Import
    Vec2 vel;

    transient PhysicRef physref;

    // mass is simply the area of this object
    float mass() {
        return hitSize * hitSize * Mathf.pi;
    }

    void impulse(float x, float y) {
        float mass = mass();
        vel.add(x / mass, y / mass);
    }

    void impulse(Vec2 v) {
        impulse(v.x, v.y);
    }

    void impulseNet(Vec2 v) {
        impulse(v.x, v.y);
        // manually move units to simulate velocity for remote players
        if (isRemote()) {
            float mass = mass();
            move(v.x / mass, v.y / mass);
        }
    }
}