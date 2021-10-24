package mma.annotations.entities;

import arc.struct.ObjectMap;

class CompData {

    static final ObjectMap<String, String> compMap;

    static final String groupDefs;

    static {
        compMap = new ObjectMap<>();
        compMap.put("AnnotationConfigComponents","package mma.entities.compByAnuke;\r\n"+
"\r\n"+
"import mma.annotations.ModAnnotations;\r\n"+
"\r\n"+
"public class AnnotationConfigComponents {\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface BlockUnitc extends mindustry.gen.BlockUnitc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Boundedc extends mindustry.gen.Boundedc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Builderc extends mindustry.gen.Builderc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Buildingc extends mindustry.gen.Buildingc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Bulletc extends mindustry.gen.Bulletc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Childc extends mindustry.gen.Childc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Commanderc extends mindustry.gen.Commanderc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Damagec extends mindustry.gen.Damagec {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Decalc extends mindustry.gen.Decalc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Drawc extends mindustry.gen.Drawc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface EffectStatec extends mindustry.gen.EffectStatec {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface ElevationMovec extends mindustry.gen.ElevationMovec {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Entityc extends mindustry.gen.Entityc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Firec extends mindustry.gen.Firec {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Flyingc extends mindustry.gen.Flyingc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Healthc extends mindustry.gen.Healthc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Hitboxc extends mindustry.gen.Hitboxc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Itemsc extends mindustry.gen.Itemsc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface LaunchCorec extends mindustry.gen.LaunchCorec {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Legsc extends mindustry.gen.Legsc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Mechc extends mindustry.gen.Mechc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Minerc extends mindustry.gen.Minerc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Ownerc extends mindustry.gen.Ownerc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Payloadc extends mindustry.gen.Payloadc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Physicsc extends mindustry.gen.Physicsc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Playerc extends mindustry.gen.Playerc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Posc extends mindustry.gen.Posc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Puddlec extends mindustry.gen.Puddlec {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Rotc extends mindustry.gen.Rotc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Shieldc extends mindustry.gen.Shieldc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Shielderc extends mindustry.gen.Shielderc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Statusc extends mindustry.gen.Statusc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Syncc extends mindustry.gen.Syncc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Teamc extends mindustry.gen.Teamc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Timedc extends mindustry.gen.Timedc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Timerc extends mindustry.gen.Timerc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Trailc extends mindustry.gen.Trailc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Unitc extends mindustry.gen.Unitc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Velc extends mindustry.gen.Velc {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface WaterMovec extends mindustry.gen.WaterMovec {\r\n"+
"    }\r\n"+
"\r\n"+
"    @ModAnnotations.EntitySuperClass()\r\n"+
"    public interface Weaponsc extends mindustry.gen.Weaponsc {\r\n"+
"    }\r\n"+
"}\r\n"+
"");
        compMap.put("BlockUnitComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.graphics.g2d.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.game.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class BlockUnitComp implements Unitc {\n"+
"\n"+
"    @Import\n"+
"    Team team;\n"+
"\n"+
"    @ReadOnly\n"+
"    transient Building tile;\n"+
"\n"+
"    public void tile(Building tile) {\n"+
"        this.tile = tile;\n"+
"        // sets up block stats\n"+
"        maxHealth(tile.block.health);\n"+
"        health(tile.health());\n"+
"        hitSize(tile.block.size * tilesize * 0.7f);\n"+
"        set(tile);\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        if (tile != null) {\n"+
"            team = tile.team;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    @Override\n"+
"    public TextureRegion icon() {\n"+
"        return tile.block.fullIcon;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void killed() {\n"+
"        tile.kill();\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    public void damage(float v, boolean b) {\n"+
"        tile.damage(v, b);\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    public boolean dead() {\n"+
"        return tile == null || tile.dead();\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    public boolean isValid() {\n"+
"        return tile != null && tile.isValid();\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    public void team(Team team) {\n"+
"        if (tile != null && this.team != team) {\n"+
"            this.team = team;\n"+
"            if (tile.team != team) {\n"+
"                tile.team(team);\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("BoundedComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.math.*;\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class BoundedComp implements Velc, Posc, Healthc, Flyingc {\n"+
"\n"+
"    static final float warpDst = 30f;\n"+
"\n"+
"    @Import\n"+
"    float x, y;\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        if (!net.client() || isLocal()) {\n"+
"            float dx = 0f, dy = 0f;\n"+
"            // repel unit out of bounds\n"+
"            if (x < 0)\n"+
"                dx += (-x / warpDst);\n"+
"            if (y < 0)\n"+
"                dy += (-y / warpDst);\n"+
"            if (x > world.unitWidth())\n"+
"                dx -= (x - world.unitWidth()) / warpDst;\n"+
"            if (y > world.unitHeight())\n"+
"                dy -= (y - world.unitHeight()) / warpDst;\n"+
"            velAddNet(dx * Time.delta, dy * Time.delta);\n"+
"        }\n"+
"        // clamp position if not flying\n"+
"        if (isGrounded()) {\n"+
"            x = Mathf.clamp(x, 0, world.width() * tilesize - tilesize);\n"+
"            y = Mathf.clamp(y, 0, world.height() * tilesize - tilesize);\n"+
"        }\n"+
"        // kill when out of bounds\n"+
"        if (x < -finalWorldBounds || y < -finalWorldBounds || x >= world.width() * tilesize + finalWorldBounds || y >= world.height() * tilesize + finalWorldBounds) {\n"+
"            kill();\n"+
"        }\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("BuilderComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.*;\n"+
"import arc.func.*;\n"+
"import arc.graphics.*;\n"+
"import arc.graphics.g2d.*;\n"+
"import arc.math.*;\n"+
"import arc.math.geom.*;\n"+
"import arc.struct.Queue;\n"+
"import arc.util.*;\n"+
"import mindustry.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.entities.units.*;\n"+
"import mindustry.game.EventType.*;\n"+
"import mindustry.game.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.graphics.*;\n"+
"import mindustry.type.*;\n"+
"import mindustry.world.*;\n"+
"import mindustry.world.blocks.*;\n"+
"import mindustry.world.blocks.ConstructBlock.*;\n"+
"import java.util.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class BuilderComp implements Posc, Statusc, Teamc, Rotc {\n"+
"\n"+
"    static final Vec2[] vecs = new Vec2[] { new Vec2(), new Vec2(), new Vec2(), new Vec2() };\n"+
"\n"+
"    @Import\n"+
"    float x, y, rotation, buildSpeedMultiplier;\n"+
"\n"+
"    @Import\n"+
"    UnitType type;\n"+
"\n"+
"    @Import\n"+
"    Team team;\n"+
"\n"+
"    @SyncLocal\n"+
"    Queue<BuildPlan> plans = new Queue<>(1);\n"+
"\n"+
"    @SyncLocal\n"+
"    boolean updateBuilding = true;\n"+
"\n"+
"    private transient BuildPlan lastActive;\n"+
"\n"+
"    private transient int lastSize;\n"+
"\n"+
"    private transient float buildAlpha = 0f;\n"+
"\n"+
"    public boolean canBuild() {\n"+
"        return type.buildSpeed > 0 && buildSpeedMultiplier > 0;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        if (!headless) {\n"+
"            // visual activity update\n"+
"            if (lastActive != null && buildAlpha <= 0.01f) {\n"+
"                lastActive = null;\n"+
"            }\n"+
"            buildAlpha = Mathf.lerpDelta(buildAlpha, activelyBuilding() ? 1f : 0f, 0.15f);\n"+
"        }\n"+
"        if (!updateBuilding || !canBuild())\n"+
"            return;\n"+
"        float finalPlaceDst = state.rules.infiniteResources ? Float.MAX_VALUE : buildingRange;\n"+
"        boolean infinite = state.rules.infiniteResources || team().rules().infiniteResources;\n"+
"        Iterator<BuildPlan> it = plans.iterator();\n"+
"        while (it.hasNext()) {\n"+
"            BuildPlan req = it.next();\n"+
"            Tile tile = world.tile(req.x, req.y);\n"+
"            if (tile == null || (req.breaking && tile.block() == Blocks.air) || (!req.breaking && ((tile.build != null && tile.build.rotation == req.rotation) || !req.block.rotate) && tile.block() == req.block)) {\n"+
"                it.remove();\n"+
"            }\n"+
"        }\n"+
"        var core = core();\n"+
"        // nothing to build.\n"+
"        if (buildPlan() == null)\n"+
"            return;\n"+
"        // find the next build request\n"+
"        if (plans.size > 1) {\n"+
"            int total = 0;\n"+
"            BuildPlan req;\n"+
"            while ((!within((req = buildPlan()).tile(), finalPlaceDst) || shouldSkip(req, core)) && total < plans.size) {\n"+
"                plans.removeFirst();\n"+
"                plans.addLast(req);\n"+
"                total++;\n"+
"            }\n"+
"        }\n"+
"        BuildPlan current = buildPlan();\n"+
"        Tile tile = current.tile();\n"+
"        lastActive = current;\n"+
"        buildAlpha = 1f;\n"+
"        if (current.breaking)\n"+
"            lastSize = tile.block().size;\n"+
"        if (!within(tile, finalPlaceDst))\n"+
"            return;\n"+
"        if (!headless) {\n"+
"            Vars.control.sound.loop(Sounds.build, tile, 0.51f);\n"+
"        }\n"+
"        ConstructBuild cb;\n"+
"        if (!((tile.build instanceof ConstructBuild && (cb = (ConstructBuild) tile.build) == tile.build))) {\n"+
"            if (!current.initialized && !current.breaking && Build.validPlace(current.block, team, current.x, current.y, current.rotation)) {\n"+
"                boolean hasAll = infinite || current.isRotation(team) || !Structs.contains(current.block.requirements, i -> core != null && !core.items.has(i.item, Math.min(Mathf.round(i.amount * state.rules.buildCostMultiplier), 1)));\n"+
"                if (hasAll) {\n"+
"                    Call.beginPlace(self(), current.block, team, current.x, current.y, current.rotation);\n"+
"                } else {\n"+
"                    current.stuck = true;\n"+
"                }\n"+
"            } else if (!current.initialized && current.breaking && Build.validBreak(team, current.x, current.y)) {\n"+
"                Call.beginBreak(self(), team, current.x, current.y);\n"+
"            } else {\n"+
"                plans.removeFirst();\n"+
"                return;\n"+
"            }\n"+
"        } else if ((tile.team() != team && tile.team() != Team.derelict) || (!current.breaking && (cb.current != current.block || cb.tile != current.tile()))) {\n"+
"            plans.removeFirst();\n"+
"            return;\n"+
"        }\n"+
"        if (tile.build instanceof ConstructBuild && !current.initialized) {\n"+
"            Core.app.post(() -> Events.fire(new BuildSelectEvent(tile, team, self(), current.breaking)));\n"+
"            current.initialized = true;\n"+
"        }\n"+
"        ConstructBuild entity;\n"+
"        // if there is no core to build with or no build entity, stop building!\n"+
"        if ((core == null && !infinite) || !((tile.build instanceof ConstructBuild && (entity = (ConstructBuild) tile.build) == tile.build))) {\n"+
"            return;\n"+
"        }\n"+
"        float bs = 1f / entity.buildCost * Time.delta * type.buildSpeed * buildSpeedMultiplier * state.rules.buildSpeed(team);\n"+
"        // otherwise, update it.\n"+
"        if (current.breaking) {\n"+
"            entity.deconstruct(self(), core, bs);\n"+
"        } else {\n"+
"            entity.construct(self(), core, bs, current.config);\n"+
"        }\n"+
"        current.stuck = Mathf.equal(current.progress, entity.progress);\n"+
"        current.progress = entity.progress;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Draw all current build plans. Does not draw the beam effect, only the positions.\n"+
"     */\n"+
"    void drawBuildPlans() {\n"+
"        Boolf<BuildPlan> skip = plan -> plan.progress > 0.01f || (buildPlan() == plan && plan.initialized && (within(plan.x * tilesize, plan.y * tilesize, buildingRange) || state.isEditor()));\n"+
"        for (int i = 0; i < 2; i++) {\n"+
"            for (BuildPlan plan : plans) {\n"+
"                if (skip.get(plan))\n"+
"                    continue;\n"+
"                if (i == 0) {\n"+
"                    drawPlan(plan, 1f);\n"+
"                } else {\n"+
"                    drawPlanTop(plan, 1f);\n"+
"                }\n"+
"            }\n"+
"        }\n"+
"        Draw.reset();\n"+
"    }\n"+
"\n"+
"    void drawPlan(BuildPlan request, float alpha) {\n"+
"        request.animScale = 1f;\n"+
"        if (request.breaking) {\n"+
"            control.input.drawBreaking(request);\n"+
"        } else {\n"+
"            request.block.drawPlan(request, control.input.allRequests(), Build.validPlace(request.block, team, request.x, request.y, request.rotation) || control.input.requestMatches(request), alpha);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    void drawPlanTop(BuildPlan request, float alpha) {\n"+
"        if (!request.breaking) {\n"+
"            Draw.reset();\n"+
"            Draw.mixcol(Color.white, 0.24f + Mathf.absin(Time.globalTime, 6f, 0.28f));\n"+
"            Draw.alpha(alpha);\n"+
"            request.block.drawRequestConfigTop(request, plans);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return whether this request should be skipped, in favor of the next one.\n"+
"     */\n"+
"    boolean shouldSkip(BuildPlan request, @Nullable Building core) {\n"+
"        // requests that you have at least *started* are considered\n"+
"        if (state.rules.infiniteResources || team.rules().infiniteResources || request.breaking || core == null || request.isRotation(team) || (isBuilding() && !within(plans.last(), buildingRange)))\n"+
"            return false;\n"+
"        return (request.stuck && !core.items.has(request.block.requirements)) || (Structs.contains(request.block.requirements, i -> !core.items.has(i.item, Math.min(i.amount, 15)) && Mathf.round(i.amount * state.rules.buildCostMultiplier) > 0) && !request.initialized);\n"+
"    }\n"+
"\n"+
"    void removeBuild(int x, int y, boolean breaking) {\n"+
"        // remove matching request\n"+
"        int idx = plans.indexOf(req -> req.breaking == breaking && req.x == x && req.y == y);\n"+
"        if (idx != -1) {\n"+
"            plans.removeIndex(idx);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Return whether this builder\'s place queue contains items.\n"+
"     */\n"+
"    boolean isBuilding() {\n"+
"        return plans.size != 0;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Clears the placement queue.\n"+
"     */\n"+
"    void clearBuilding() {\n"+
"        plans.clear();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Add another build requests to the tail of the queue, if it doesn\'t exist there yet.\n"+
"     */\n"+
"    void addBuild(BuildPlan place) {\n"+
"        addBuild(place, true);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Add another build requests to the queue, if it doesn\'t exist there yet.\n"+
"     */\n"+
"    void addBuild(BuildPlan place, boolean tail) {\n"+
"        if (!canBuild())\n"+
"            return;\n"+
"        BuildPlan replace = null;\n"+
"        for (BuildPlan request : plans) {\n"+
"            if (request.x == place.x && request.y == place.y) {\n"+
"                replace = request;\n"+
"                break;\n"+
"            }\n"+
"        }\n"+
"        if (replace != null) {\n"+
"            plans.remove(replace);\n"+
"        }\n"+
"        Tile tile = world.tile(place.x, place.y);\n"+
"        ConstructBuild cons;\n"+
"        if (tile != null && (tile.build instanceof ConstructBuild && (cons = (ConstructBuild) tile.build) == tile.build)) {\n"+
"            place.progress = cons.progress;\n"+
"        }\n"+
"        if (tail) {\n"+
"            plans.addLast(place);\n"+
"        } else {\n"+
"            plans.addFirst(place);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    boolean activelyBuilding() {\n"+
"        // not actively building when not near the build plan\n"+
"        if (isBuilding()) {\n"+
"            if (!state.isEditor() && !within(buildPlan(), state.rules.infiniteResources ? Float.MAX_VALUE : buildingRange)) {\n"+
"                return false;\n"+
"            }\n"+
"        }\n"+
"        return isBuilding() && updateBuilding;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Return the build request currently active, or the one at the top of the queue.\n"+
"     */\n"+
"    @Nullable\n"+
"    BuildPlan buildPlan() {\n"+
"        return plans.size == 0 ? null : plans.first();\n"+
"    }\n"+
"\n"+
"    public void draw() {\n"+
"        boolean active = activelyBuilding();\n"+
"        if (!active && lastActive == null)\n"+
"            return;\n"+
"        Draw.z(Layer.flyingUnit);\n"+
"        BuildPlan plan = active ? buildPlan() : lastActive;\n"+
"        Tile tile = world.tile(plan.x, plan.y);\n"+
"        var core = team.core();\n"+
"        if (tile == null || !within(plan, state.rules.infiniteResources ? Float.MAX_VALUE : buildingRange)) {\n"+
"            return;\n"+
"        }\n"+
"        // draw remote plans.\n"+
"        if (core != null && active && !isLocal() && !(tile.block() instanceof ConstructBlock)) {\n"+
"            Draw.z(Layer.plans - 1f);\n"+
"            drawPlan(plan, 0.5f);\n"+
"            drawPlanTop(plan, 0.5f);\n"+
"            Draw.z(Layer.flyingUnit);\n"+
"        }\n"+
"        int size = plan.breaking ? active ? tile.block().size : lastSize : plan.block.size;\n"+
"        float tx = plan.drawx(), ty = plan.drawy();\n"+
"        Lines.stroke(1f, plan.breaking ? Pal.remove : Pal.accent);\n"+
"        float focusLen = type.buildBeamOffset + Mathf.absin(Time.time, 3f, 0.6f);\n"+
"        float px = x + Angles.trnsx(rotation, focusLen);\n"+
"        float py = y + Angles.trnsy(rotation, focusLen);\n"+
"        float sz = Vars.tilesize * size / 2f;\n"+
"        float ang = angleTo(tx, ty);\n"+
"        vecs[0].set(tx - sz, ty - sz);\n"+
"        vecs[1].set(tx + sz, ty - sz);\n"+
"        vecs[2].set(tx - sz, ty + sz);\n"+
"        vecs[3].set(tx + sz, ty + sz);\n"+
"        Arrays.sort(vecs, Structs.comparingFloat(vec -> -Angles.angleDist(angleTo(vec), ang)));\n"+
"        Vec2 close = Geometry.findClosest(x, y, vecs);\n"+
"        float x1 = vecs[0].x, y1 = vecs[0].y, x2 = close.x, y2 = close.y, x3 = vecs[1].x, y3 = vecs[1].y;\n"+
"        Draw.z(Layer.buildBeam);\n"+
"        Draw.alpha(buildAlpha);\n"+
"        if (!active && !(tile.build instanceof ConstructBuild)) {\n"+
"            Fill.square(plan.drawx(), plan.drawy(), size * tilesize / 2f);\n"+
"        }\n"+
"        if (renderer.animateShields) {\n"+
"            if (close != vecs[0] && close != vecs[1]) {\n"+
"                Fill.tri(px, py, x1, y1, x2, y2);\n"+
"                Fill.tri(px, py, x3, y3, x2, y2);\n"+
"            } else {\n"+
"                Fill.tri(px, py, x1, y1, x3, y3);\n"+
"            }\n"+
"        } else {\n"+
"            Lines.line(px, py, x1, y1);\n"+
"            Lines.line(px, py, x3, y3);\n"+
"        }\n"+
"        Fill.square(px, py, 1.8f + Mathf.absin(Time.time, 2.2f, 1.1f), rotation + 45);\n"+
"        Draw.reset();\n"+
"        Draw.z(Layer.flyingUnit);\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("BuildingComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.*;\n"+
"import arc.Graphics.*;\n"+
"import arc.Graphics.Cursor.*;\n"+
"import arc.func.*;\n"+
"import arc.graphics.*;\n"+
"import arc.graphics.g2d.*;\n"+
"import arc.math.*;\n"+
"import arc.math.geom.*;\n"+
"import arc.math.geom.QuadTree.*;\n"+
"import arc.scene.ui.*;\n"+
"import arc.scene.ui.layout.*;\n"+
"import arc.struct.*;\n"+
"import arc.util.*;\n"+
"import arc.util.io.*;\n"+
"import mindustry.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.audio.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.core.*;\n"+
"import mindustry.ctype.*;\n"+
"import mindustry.entities.*;\n"+
"import mindustry.game.EventType.*;\n"+
"import mindustry.game.*;\n"+
"import mindustry.game.Teams.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.graphics.*;\n"+
"import mindustry.logic.*;\n"+
"import mindustry.type.*;\n"+
"import mindustry.ui.*;\n"+
"import mindustry.world.*;\n"+
"import mindustry.world.blocks.ConstructBlock.*;\n"+
"import mindustry.world.blocks.*;\n"+
"import mindustry.world.blocks.environment.*;\n"+
"import mindustry.world.blocks.logic.LogicBlock.*;\n"+
"import mindustry.world.blocks.payloads.*;\n"+
"import mindustry.world.blocks.power.*;\n"+
"import mindustry.world.consumers.*;\n"+
"import mindustry.world.meta.*;\n"+
"import mindustry.world.modules.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"// @EntityDef(value = { Buildingc.class }, isFinal = false, genio = false, serialize = false)\n"+
"@Component(base = true)\n"+
"abstract class BuildingComp implements Posc, Teamc, Healthc, Buildingc, Timerc, QuadTreeObject, Displayable, Senseable, Controllable, Sized {\n"+
"\n"+
"    // region vars and initialization\n"+
"    static final float timeToSleep = 60f * 1, timeToUncontrol = 60f * 6;\n"+
"\n"+
"    static final ObjectSet<Building> tmpTiles = new ObjectSet<>();\n"+
"\n"+
"    static final Seq<Building> tempBuilds = new Seq<>();\n"+
"\n"+
"    static final BuildTeamChangeEvent teamChangeEvent = new BuildTeamChangeEvent();\n"+
"\n"+
"    static int sleepingEntities = 0;\n"+
"\n"+
"    @Import\n"+
"    float x, y, health, maxHealth;\n"+
"\n"+
"    @Import\n"+
"    Team team;\n"+
"\n"+
"    transient Tile tile;\n"+
"\n"+
"    transient Block block;\n"+
"\n"+
"    transient Seq<Building> proximity = new Seq<>(6);\n"+
"\n"+
"    transient boolean updateFlow;\n"+
"\n"+
"    transient byte cdump;\n"+
"\n"+
"    transient int rotation;\n"+
"\n"+
"    transient boolean enabled = true;\n"+
"\n"+
"    transient float enabledControlTime;\n"+
"\n"+
"    transient String lastAccessed;\n"+
"\n"+
"    // used only by the indexer\n"+
"    transient boolean wasDamaged;\n"+
"\n"+
"    PowerModule power;\n"+
"\n"+
"    ItemModule items;\n"+
"\n"+
"    LiquidModule liquids;\n"+
"\n"+
"    ConsumeModule cons;\n"+
"\n"+
"    private transient float timeScale = 1f, timeScaleDuration;\n"+
"\n"+
"    private transient float dumpAccum;\n"+
"\n"+
"    @Nullable\n"+
"    private transient SoundLoop sound;\n"+
"\n"+
"    private transient boolean sleeping;\n"+
"\n"+
"    private transient float sleepTime;\n"+
"\n"+
"    private transient boolean initialized;\n"+
"\n"+
"    /**\n"+
"     * Sets this tile entity data to this and adds it if necessary.\n"+
"     */\n"+
"    public Building init(Tile tile, Team team, boolean shouldAdd, int rotation) {\n"+
"        if (!initialized) {\n"+
"            create(tile.block(), team);\n"+
"        } else {\n"+
"            if (block.hasPower) {\n"+
"                power.init = false;\n"+
"                // reinit power graph\n"+
"                new PowerGraph().add(self());\n"+
"            }\n"+
"        }\n"+
"        proximity.clear();\n"+
"        this.rotation = rotation;\n"+
"        this.tile = tile;\n"+
"        set(tile.drawx(), tile.drawy());\n"+
"        if (shouldAdd) {\n"+
"            add();\n"+
"        }\n"+
"        created();\n"+
"        return self();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Sets up all the necessary variables, but does not add this entity anywhere.\n"+
"     */\n"+
"    public Building create(Block block, Team team) {\n"+
"        this.block = block;\n"+
"        this.team = team;\n"+
"        if (block.loopSound != Sounds.none) {\n"+
"            sound = new SoundLoop(block.loopSound, block.loopSoundVolume);\n"+
"        }\n"+
"        health = block.health;\n"+
"        maxHealth(block.health);\n"+
"        timer(new Interval(block.timers));\n"+
"        cons = new ConsumeModule(self());\n"+
"        if (block.hasItems)\n"+
"            items = new ItemModule();\n"+
"        if (block.hasLiquids)\n"+
"            liquids = new LiquidModule();\n"+
"        if (block.hasPower) {\n"+
"            power = new PowerModule();\n"+
"            power.graph.add(self());\n"+
"        }\n"+
"        initialized = true;\n"+
"        return self();\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    @Replace\n"+
"    public int tileX() {\n"+
"        return tile.x;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    @Replace\n"+
"    public int tileY() {\n"+
"        return tile.y;\n"+
"    }\n"+
"\n"+
"    // endregion\n"+
"    // region io\n"+
"    public final void writeBase(Writes write) {\n"+
"        write.f(health);\n"+
"        write.b(rotation | 0b10000000);\n"+
"        write.b(team.id);\n"+
"        // version\n"+
"        write.b(1);\n"+
"        write.b(enabled ? 1 : 0);\n"+
"        if (items != null)\n"+
"            items.write(write);\n"+
"        if (power != null)\n"+
"            power.write(write);\n"+
"        if (liquids != null)\n"+
"            liquids.write(write);\n"+
"        if (cons != null)\n"+
"            cons.write(write);\n"+
"    }\n"+
"\n"+
"    public final void readBase(Reads read) {\n"+
"        // cap health by block health in case of nerfs\n"+
"        health = Math.min(read.f(), block.health);\n"+
"        byte rot = read.b();\n"+
"        team = Team.get(read.b());\n"+
"        rotation = rot & 0b01111111;\n"+
"        boolean legacy = true;\n"+
"        if ((rot & 0b10000000) != 0) {\n"+
"            // version of entity save\n"+
"            byte ver = read.b();\n"+
"            if (ver == 1) {\n"+
"                byte on = read.b();\n"+
"                this.enabled = on == 1;\n"+
"                if (!this.enabled) {\n"+
"                    enabledControlTime = timeToUncontrol;\n"+
"                }\n"+
"            }\n"+
"            legacy = false;\n"+
"        }\n"+
"        if (items != null)\n"+
"            items.read(read, legacy);\n"+
"        if (power != null)\n"+
"            power.read(read, legacy);\n"+
"        if (liquids != null)\n"+
"            liquids.read(read, legacy);\n"+
"        if (cons != null)\n"+
"            cons.read(read, legacy);\n"+
"    }\n"+
"\n"+
"    public void writeAll(Writes write) {\n"+
"        writeBase(write);\n"+
"        write(write);\n"+
"    }\n"+
"\n"+
"    public void readAll(Reads read, byte revision) {\n"+
"        readBase(read);\n"+
"        read(read, revision);\n"+
"    }\n"+
"\n"+
"    @CallSuper\n"+
"    public void write(Writes write) {\n"+
"        // overriden by subclasses!\n"+
"    }\n"+
"\n"+
"    @CallSuper\n"+
"    public void read(Reads read, byte revision) {\n"+
"        // overriden by subclasses!\n"+
"    }\n"+
"\n"+
"    // endregion\n"+
"    // region utility methods\n"+
"    public void addPlan(boolean checkPrevious) {\n"+
"        if (!block.rebuildable || (team == state.rules.defaultTeam && state.isCampaign() && !block.isVisible()))\n"+
"            return;\n"+
"        Object overrideConfig = null;\n"+
"        ConstructBuild entity;\n"+
"        if ((self() instanceof ConstructBuild && (entity = (ConstructBuild) self()) == self())) {\n"+
"            // update block to reflect the fact that something was being constructed\n"+
"            if (entity.current != null && entity.current.synthetic() && entity.wasConstructing) {\n"+
"                block = entity.current;\n"+
"                overrideConfig = entity.lastConfig;\n"+
"            } else {\n"+
"                // otherwise this was a deconstruction that was interrupted, don\'t want to rebuild that\n"+
"                return;\n"+
"            }\n"+
"        }\n"+
"        TeamData data = team.data();\n"+
"        if (checkPrevious) {\n"+
"            // remove existing blocks that have been placed here.\n"+
"            // painful O(n) iteration + copy\n"+
"            for (int i = 0; i < data.blocks.size; i++) {\n"+
"                BlockPlan b = data.blocks.get(i);\n"+
"                if (b.x == tile.x && b.y == tile.y) {\n"+
"                    data.blocks.removeIndex(i);\n"+
"                    break;\n"+
"                }\n"+
"            }\n"+
"        }\n"+
"        data.blocks.addFirst(new BlockPlan(tile.x, tile.y, (short) rotation, block.id, overrideConfig == null ? config() : overrideConfig));\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Configure with the current, local player.\n"+
"     */\n"+
"    public void configure(Object value) {\n"+
"        // save last used config\n"+
"        block.lastConfig = value;\n"+
"        Call.tileConfig(player, self(), value);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Configure from a server.\n"+
"     */\n"+
"    public void configureAny(Object value) {\n"+
"        Call.tileConfig(null, self(), value);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Deselect this tile from configuration.\n"+
"     */\n"+
"    public void deselect() {\n"+
"        if (!headless && control.input.frag.config.getSelectedTile() == self()) {\n"+
"            control.input.frag.config.hideConfig();\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called clientside when the client taps a block to config.\n"+
"     * @return whether the configuration UI should be shown.\n"+
"     */\n"+
"    public boolean configTapped() {\n"+
"        return true;\n"+
"    }\n"+
"\n"+
"    public void applyBoost(float intensity, float duration) {\n"+
"        // do not refresh time scale when getting a weaker intensity\n"+
"        if (intensity >= this.timeScale) {\n"+
"            timeScaleDuration = Math.max(timeScaleDuration, duration);\n"+
"        }\n"+
"        timeScale = Math.max(timeScale, intensity);\n"+
"    }\n"+
"\n"+
"    public Building nearby(int dx, int dy) {\n"+
"        return world.build(tile.x + dx, tile.y + dy);\n"+
"    }\n"+
"\n"+
"    public Building nearby(int rotation) {\n"+
"        if (rotation == 0)\n"+
"            return world.build(tile.x + 1, tile.y);\n"+
"        if (rotation == 1)\n"+
"            return world.build(tile.x, tile.y + 1);\n"+
"        if (rotation == 2)\n"+
"            return world.build(tile.x - 1, tile.y);\n"+
"        if (rotation == 3)\n"+
"            return world.build(tile.x, tile.y - 1);\n"+
"        return null;\n"+
"    }\n"+
"\n"+
"    public byte relativeTo(Tile tile) {\n"+
"        return relativeTo(tile.x, tile.y);\n"+
"    }\n"+
"\n"+
"    public byte relativeTo(Building tile) {\n"+
"        return relativeTo(tile.tile());\n"+
"    }\n"+
"\n"+
"    public byte relativeToEdge(Tile other) {\n"+
"        return relativeTo(Edges.getFacingEdge(other, tile));\n"+
"    }\n"+
"\n"+
"    public byte relativeTo(int cx, int cy) {\n"+
"        return tile.absoluteRelativeTo(cx, cy);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Multiblock front.\n"+
"     */\n"+
"    @Nullable\n"+
"    public Building front() {\n"+
"        int trns = block.size / 2 + 1;\n"+
"        return nearby(Geometry.d4(rotation).x * trns, Geometry.d4(rotation).y * trns);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Multiblock back.\n"+
"     */\n"+
"    @Nullable\n"+
"    public Building back() {\n"+
"        int trns = block.size / 2 + 1;\n"+
"        return nearby(Geometry.d4(rotation + 2).x * trns, Geometry.d4(rotation + 2).y * trns);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Multiblock left.\n"+
"     */\n"+
"    @Nullable\n"+
"    public Building left() {\n"+
"        int trns = block.size / 2 + 1;\n"+
"        return nearby(Geometry.d4(rotation + 1).x * trns, Geometry.d4(rotation + 1).y * trns);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Multiblock right.\n"+
"     */\n"+
"    @Nullable\n"+
"    public Building right() {\n"+
"        int trns = block.size / 2 + 1;\n"+
"        return nearby(Geometry.d4(rotation + 3).x * trns, Geometry.d4(rotation + 3).y * trns);\n"+
"    }\n"+
"\n"+
"    public int pos() {\n"+
"        return tile.pos();\n"+
"    }\n"+
"\n"+
"    public float rotdeg() {\n"+
"        return rotation * 90;\n"+
"    }\n"+
"\n"+
"    public Floor floor() {\n"+
"        return tile.floor();\n"+
"    }\n"+
"\n"+
"    public boolean interactable(Team team) {\n"+
"        return state.teams.canInteract(team, team());\n"+
"    }\n"+
"\n"+
"    public float timeScale() {\n"+
"        return timeScale;\n"+
"    }\n"+
"\n"+
"    public boolean consValid() {\n"+
"        return cons.valid();\n"+
"    }\n"+
"\n"+
"    public void consume() {\n"+
"        cons.trigger();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Scaled delta.\n"+
"     */\n"+
"    public float delta() {\n"+
"        return Time.delta * timeScale;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Efficiency * delta.\n"+
"     */\n"+
"    public float edelta() {\n"+
"        return efficiency() * delta();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Base efficiency. If this entity has non-buffered power, returns the power %, otherwise returns 1.\n"+
"     */\n"+
"    public float efficiency() {\n"+
"        // disabled -> 0 efficiency\n"+
"        if (!enabled)\n"+
"            return 0;\n"+
"        return power != null && (block.consumes.has(ConsumeType.power) && !block.consumes.getPower().buffered) ? power.status : 1f;\n"+
"    }\n"+
"\n"+
"    public BlockStatus status() {\n"+
"        return cons.status();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Call when nothing is happening to the entity. This increments the internal sleep timer.\n"+
"     */\n"+
"    public void sleep() {\n"+
"        sleepTime += Time.delta;\n"+
"        if (!sleeping && sleepTime >= timeToSleep) {\n"+
"            remove();\n"+
"            sleeping = true;\n"+
"            sleepingEntities++;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Call when this entity is updating. This wakes it up.\n"+
"     */\n"+
"    public void noSleep() {\n"+
"        sleepTime = 0f;\n"+
"        if (sleeping) {\n"+
"            add();\n"+
"            sleeping = false;\n"+
"            sleepingEntities--;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Returns the version of this Building IO code.\n"+
"     */\n"+
"    public byte version() {\n"+
"        return 0;\n"+
"    }\n"+
"\n"+
"    // endregion\n"+
"    // region handler methods\n"+
"    /**\n"+
"     * @return whether the player can select (but not actually control) this building.\n"+
"     */\n"+
"    public boolean canControlSelect(Unit player) {\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called when a player control-selects this building - not called for ControlBlock subclasses.\n"+
"     */\n"+
"    public void onControlSelect(Unit player) {\n"+
"    }\n"+
"\n"+
"    public void handleUnitPayload(Unit unit, Cons<Payload> grabber) {\n"+
"        Fx.spawn.at(unit);\n"+
"        if (unit.isPlayer()) {\n"+
"            unit.getPlayer().clearUnit();\n"+
"        }\n"+
"        unit.remove();\n"+
"        // needs new ID as it is now a payload\n"+
"        unit.id = EntityGroup.nextId();\n"+
"        grabber.get(new UnitPayload(unit));\n"+
"        Fx.unitDrop.at(unit);\n"+
"    }\n"+
"\n"+
"    public boolean canUnload() {\n"+
"        return block.unloadable;\n"+
"    }\n"+
"\n"+
"    public boolean payloadCheck(int conveyorRotation) {\n"+
"        return block.rotate && (rotation + 2) % 4 == conveyorRotation;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called when an unloader takes an item.\n"+
"     */\n"+
"    public void itemTaken(Item item) {\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called when this block is dropped as a payload.\n"+
"     */\n"+
"    public void dropped() {\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * This is for logic blocks.\n"+
"     */\n"+
"    public void handleString(Object value) {\n"+
"    }\n"+
"\n"+
"    public void created() {\n"+
"    }\n"+
"\n"+
"    public boolean shouldConsume() {\n"+
"        return enabled;\n"+
"    }\n"+
"\n"+
"    public boolean productionValid() {\n"+
"        return true;\n"+
"    }\n"+
"\n"+
"    public float getPowerProduction() {\n"+
"        return 0f;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Returns the amount of items this block can accept.\n"+
"     */\n"+
"    public int acceptStack(Item item, int amount, Teamc source) {\n"+
"        if (acceptItem(self(), item) && block.hasItems && (source == null || source.team() == team)) {\n"+
"            return Math.min(getMaximumAccepted(item) - items.get(item), amount);\n"+
"        } else {\n"+
"            return 0;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public int getMaximumAccepted(Item item) {\n"+
"        return block.itemCapacity;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Remove a stack from this inventory, and return the amount removed.\n"+
"     */\n"+
"    public int removeStack(Item item, int amount) {\n"+
"        if (items == null)\n"+
"            return 0;\n"+
"        amount = Math.min(amount, items.get(item));\n"+
"        noSleep();\n"+
"        items.remove(item, amount);\n"+
"        return amount;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Handle a stack input.\n"+
"     */\n"+
"    public void handleStack(Item item, int amount, @Nullable Teamc source) {\n"+
"        noSleep();\n"+
"        items.add(item, amount);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Returns offset for stack placement.\n"+
"     */\n"+
"    public void getStackOffset(Item item, Vec2 trns) {\n"+
"    }\n"+
"\n"+
"    public boolean acceptPayload(Building source, Payload payload) {\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    public void handlePayload(Building source, Payload payload) {\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Tries moving a payload forwards.\n"+
"     * @param todump payload to dump.\n"+
"     * @return whether the payload was moved successfully\n"+
"     */\n"+
"    public boolean movePayload(Payload todump) {\n"+
"        int trns = block.size / 2 + 1;\n"+
"        Tile next = tile.nearby(Geometry.d4(rotation).x * trns, Geometry.d4(rotation).y * trns);\n"+
"        if (next != null && next.build != null && next.build.team == team && next.build.acceptPayload(self(), todump)) {\n"+
"            next.build.handlePayload(self(), todump);\n"+
"            return true;\n"+
"        }\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Tries dumping a payload to any adjacent block.\n"+
"     * @param todump payload to dump.\n"+
"     * @return whether the payload was moved successfully\n"+
"     */\n"+
"    public boolean dumpPayload(Payload todump) {\n"+
"        if (proximity.size == 0)\n"+
"            return false;\n"+
"        int dump = this.cdump;\n"+
"        for (int i = 0; i < proximity.size; i++) {\n"+
"            Building other = proximity.get((i + dump) % proximity.size);\n"+
"            if (other.team == team && other.acceptPayload(self(), todump)) {\n"+
"                other.handlePayload(self(), todump);\n"+
"                incrementDump(proximity.size);\n"+
"                return true;\n"+
"            }\n"+
"            incrementDump(proximity.size);\n"+
"        }\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    public void handleItem(Building source, Item item) {\n"+
"        items.add(item, 1);\n"+
"    }\n"+
"\n"+
"    public boolean acceptItem(Building source, Item item) {\n"+
"        return block.consumes.itemFilters.get(item.id) && items.get(item) < getMaximumAccepted(item);\n"+
"    }\n"+
"\n"+
"    public boolean acceptLiquid(Building source, Liquid liquid) {\n"+
"        return block.hasLiquids && block.consumes.liquidfilters.get(liquid.id);\n"+
"    }\n"+
"\n"+
"    public void handleLiquid(Building source, Liquid liquid, float amount) {\n"+
"        liquids.add(liquid, amount);\n"+
"    }\n"+
"\n"+
"    public void dumpLiquid(Liquid liquid) {\n"+
"        dumpLiquid(liquid, 2f);\n"+
"    }\n"+
"\n"+
"    public void dumpLiquid(Liquid liquid, float scaling) {\n"+
"        int dump = this.cdump;\n"+
"        if (liquids.get(liquid) <= 0.0001f)\n"+
"            return;\n"+
"        if (!net.client() && state.isCampaign() && team == state.rules.defaultTeam)\n"+
"            liquid.unlock();\n"+
"        for (int i = 0; i < proximity.size; i++) {\n"+
"            incrementDump(proximity.size);\n"+
"            Building other = proximity.get((i + dump) % proximity.size);\n"+
"            other = other.getLiquidDestination(self(), liquid);\n"+
"            if (other != null && other.team == team && other.block.hasLiquids && canDumpLiquid(other, liquid) && other.liquids != null) {\n"+
"                float ofract = other.liquids.get(liquid) / other.block.liquidCapacity;\n"+
"                float fract = liquids.get(liquid) / block.liquidCapacity;\n"+
"                if (ofract < fract)\n"+
"                    transferLiquid(other, (fract - ofract) * block.liquidCapacity / scaling, liquid);\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public boolean canDumpLiquid(Building to, Liquid liquid) {\n"+
"        return true;\n"+
"    }\n"+
"\n"+
"    public void transferLiquid(Building next, float amount, Liquid liquid) {\n"+
"        float flow = Math.min(next.block.liquidCapacity - next.liquids.get(liquid), amount);\n"+
"        if (next.acceptLiquid(self(), liquid)) {\n"+
"            next.handleLiquid(self(), liquid, flow);\n"+
"            liquids.remove(liquid, flow);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public float moveLiquidForward(boolean leaks, Liquid liquid) {\n"+
"        Tile next = tile.nearby(rotation);\n"+
"        if (next == null)\n"+
"            return 0;\n"+
"        if (next.build != null) {\n"+
"            return moveLiquid(next.build, liquid);\n"+
"        } else if (leaks && !next.block().solid && !next.block().hasLiquids) {\n"+
"            float leakAmount = liquids.get(liquid) / 1.5f;\n"+
"            Puddles.deposit(next, tile, liquid, leakAmount);\n"+
"            liquids.remove(liquid, leakAmount);\n"+
"        }\n"+
"        return 0;\n"+
"    }\n"+
"\n"+
"    public float moveLiquid(Building next, Liquid liquid) {\n"+
"        if (next == null)\n"+
"            return 0;\n"+
"        next = next.getLiquidDestination(self(), liquid);\n"+
"        if (next.team == team && next.block.hasLiquids && liquids.get(liquid) > 0f) {\n"+
"            float ofract = next.liquids.get(liquid) / next.block.liquidCapacity;\n"+
"            float fract = liquids.get(liquid) / block.liquidCapacity * block.liquidPressure;\n"+
"            float flow = Math.min(Mathf.clamp((fract - ofract)) * (block.liquidCapacity), liquids.get(liquid));\n"+
"            flow = Math.min(flow, next.block.liquidCapacity - next.liquids.get(liquid));\n"+
"            if (flow > 0f && ofract <= fract && next.acceptLiquid(self(), liquid)) {\n"+
"                next.handleLiquid(self(), liquid, flow);\n"+
"                liquids.remove(liquid, flow);\n"+
"                return flow;\n"+
"            } else if (next.liquids.currentAmount() / next.block.liquidCapacity > 0.1f && fract > 0.1f) {\n"+
"                // TODO these are incorrect effect positions\n"+
"                float fx = (x + next.x) / 2f, fy = (y + next.y) / 2f;\n"+
"                Liquid other = next.liquids.current();\n"+
"                if ((other.flammability > 0.3f && liquid.temperature > 0.7f) || (liquid.flammability > 0.3f && other.temperature > 0.7f)) {\n"+
"                    damage(1 * Time.delta);\n"+
"                    next.damage(1 * Time.delta);\n"+
"                    if (Mathf.chance(0.1 * Time.delta)) {\n"+
"                        Fx.fire.at(fx, fy);\n"+
"                    }\n"+
"                } else if ((liquid.temperature > 0.7f && other.temperature < 0.55f) || (other.temperature > 0.7f && liquid.temperature < 0.55f)) {\n"+
"                    liquids.remove(liquid, Math.min(liquids.get(liquid), 0.7f * Time.delta));\n"+
"                    if (Mathf.chance(0.2f * Time.delta)) {\n"+
"                        Fx.steam.at(fx, fy);\n"+
"                    }\n"+
"                }\n"+
"            }\n"+
"        }\n"+
"        return 0;\n"+
"    }\n"+
"\n"+
"    public Building getLiquidDestination(Building from, Liquid liquid) {\n"+
"        return self();\n"+
"    }\n"+
"\n"+
"    @Nullable\n"+
"    public Payload getPayload() {\n"+
"        return null;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Tries to take the payload. Returns null if no payload is present.\n"+
"     */\n"+
"    @Nullable\n"+
"    public Payload takePayload() {\n"+
"        return null;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Tries to put this item into a nearby container, if there are no available\n"+
"     * containers, it gets added to the block\'s inventory.\n"+
"     */\n"+
"    public void offload(Item item) {\n"+
"        produced(item, 1);\n"+
"        int dump = this.cdump;\n"+
"        if (!net.client() && state.isCampaign() && team == state.rules.defaultTeam)\n"+
"            item.unlock();\n"+
"        for (int i = 0; i < proximity.size; i++) {\n"+
"            incrementDump(proximity.size);\n"+
"            Building other = proximity.get((i + dump) % proximity.size);\n"+
"            if (other.team == team && other.acceptItem(self(), item) && canDump(other, item)) {\n"+
"                other.handleItem(self(), item);\n"+
"                return;\n"+
"            }\n"+
"        }\n"+
"        handleItem(self(), item);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Tries to put this item into a nearby container. Returns success. Unlike #offload(), this method does not change the block inventory.\n"+
"     */\n"+
"    public boolean put(Item item) {\n"+
"        int dump = this.cdump;\n"+
"        for (int i = 0; i < proximity.size; i++) {\n"+
"            incrementDump(proximity.size);\n"+
"            Building other = proximity.get((i + dump) % proximity.size);\n"+
"            if (other.team == team && other.acceptItem(self(), item) && canDump(other, item)) {\n"+
"                other.handleItem(self(), item);\n"+
"                return true;\n"+
"            }\n"+
"        }\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    public void produced(Item item) {\n"+
"        produced(item, 1);\n"+
"    }\n"+
"\n"+
"    public void produced(Item item, int amount) {\n"+
"        if (Vars.state.rules.sector != null && team == state.rules.defaultTeam)\n"+
"            Vars.state.rules.sector.info.handleProduction(item, amount);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Dumps any item with an accumulator. May dump multiple times per frame. Use with care.\n"+
"     */\n"+
"    public void dumpAccumulate() {\n"+
"        dumpAccumulate(null);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Dumps any item with an accumulator. May dump multiple times per frame. Use with care.\n"+
"     */\n"+
"    public void dumpAccumulate(Item item) {\n"+
"        dumpAccum += delta();\n"+
"        while (dumpAccum >= 1f) {\n"+
"            dump(item);\n"+
"            dumpAccum -= 1f;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Try dumping any item near the building.\n"+
"     */\n"+
"    public boolean dump() {\n"+
"        return dump(null);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Try dumping a specific item near the building.\n"+
"     * @param todump Item to dump. Can be null to dump anything.\n"+
"     */\n"+
"    public boolean dump(Item todump) {\n"+
"        if (!block.hasItems || items.total() == 0 || (todump != null && !items.has(todump)))\n"+
"            return false;\n"+
"        int dump = this.cdump;\n"+
"        if (proximity.size == 0)\n"+
"            return false;\n"+
"        for (int i = 0; i < proximity.size; i++) {\n"+
"            Building other = proximity.get((i + dump) % proximity.size);\n"+
"            if (todump == null) {\n"+
"                for (int ii = 0; ii < content.items().size; ii++) {\n"+
"                    Item item = content.item(ii);\n"+
"                    if (other.team == team && items.has(item) && other.acceptItem(self(), item) && canDump(other, item)) {\n"+
"                        other.handleItem(self(), item);\n"+
"                        items.remove(item, 1);\n"+
"                        incrementDump(proximity.size);\n"+
"                        return true;\n"+
"                    }\n"+
"                }\n"+
"            } else {\n"+
"                if (other.team == team && other.acceptItem(self(), todump) && canDump(other, todump)) {\n"+
"                    other.handleItem(self(), todump);\n"+
"                    items.remove(todump, 1);\n"+
"                    incrementDump(proximity.size);\n"+
"                    return true;\n"+
"                }\n"+
"            }\n"+
"            incrementDump(proximity.size);\n"+
"        }\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    public void incrementDump(int prox) {\n"+
"        cdump = (byte) ((cdump + 1) % prox);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Used for dumping items.\n"+
"     */\n"+
"    public boolean canDump(Building to, Item item) {\n"+
"        return true;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Try offloading an item to a nearby container in its facing direction. Returns true if success.\n"+
"     */\n"+
"    public boolean moveForward(Item item) {\n"+
"        Building other = front();\n"+
"        if (other != null && other.team == team && other.acceptItem(self(), item)) {\n"+
"            other.handleItem(self(), item);\n"+
"            return true;\n"+
"        }\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called shortly before this building is removed.\n"+
"     */\n"+
"    public void onProximityRemoved() {\n"+
"        if (power != null) {\n"+
"            powerGraphRemoved();\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called after this building is created in the world. May be called multiple times, or when adjacent buildings change.\n"+
"     */\n"+
"    public void onProximityAdded() {\n"+
"        if (power != null) {\n"+
"            updatePowerGraph();\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called when anything adjacent to this building is placed/removed, including itself.\n"+
"     */\n"+
"    public void onProximityUpdate() {\n"+
"        noSleep();\n"+
"    }\n"+
"\n"+
"    public void updatePowerGraph() {\n"+
"        for (Building other : getPowerConnections(tempBuilds)) {\n"+
"            if (other.power != null) {\n"+
"                other.power.graph.addGraph(power.graph);\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public void powerGraphRemoved() {\n"+
"        if (power == null)\n"+
"            return;\n"+
"        power.graph.remove(self());\n"+
"        for (int i = 0; i < power.links.size; i++) {\n"+
"            Tile other = world.tile(power.links.get(i));\n"+
"            if (other != null && other.build != null && other.build.power != null) {\n"+
"                other.build.power.links.removeValue(pos());\n"+
"            }\n"+
"        }\n"+
"        power.links.clear();\n"+
"    }\n"+
"\n"+
"    public boolean conductsTo(Building other) {\n"+
"        return !block.insulated;\n"+
"    }\n"+
"\n"+
"    public Seq<Building> getPowerConnections(Seq<Building> out) {\n"+
"        out.clear();\n"+
"        if (power == null)\n"+
"            return out;\n"+
"        for (Building other : proximity) {\n"+
"            if (other != null && other.power != null && other.team == team && !(block.consumesPower && other.block.consumesPower && !block.outputsPower && !other.block.outputsPower) && conductsTo(other) && other.conductsTo(self()) && !power.links.contains(other.pos())) {\n"+
"                out.add(other);\n"+
"            }\n"+
"        }\n"+
"        for (int i = 0; i < power.links.size; i++) {\n"+
"            Tile link = world.tile(power.links.get(i));\n"+
"            if (link != null && link.build != null && link.build.power != null && link.build.team == team)\n"+
"                out.add(link.build);\n"+
"        }\n"+
"        return out;\n"+
"    }\n"+
"\n"+
"    public float getProgressIncrease(float baseTime) {\n"+
"        return 1f / baseTime * edelta();\n"+
"    }\n"+
"\n"+
"    public float getDisplayEfficiency() {\n"+
"        return getProgressIncrease(1f) / edelta();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return whether this block should play its active sound.\n"+
"     */\n"+
"    public boolean shouldActiveSound() {\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return whether this block should play its idle sound.\n"+
"     */\n"+
"    public boolean shouldAmbientSound() {\n"+
"        return shouldConsume();\n"+
"    }\n"+
"\n"+
"    public void drawStatus() {\n"+
"        if (block.enableDrawStatus && block.consumes.any()) {\n"+
"            float multiplier = block.size > 1 ? 1 : 0.64f;\n"+
"            float brcx = x + (block.size * tilesize / 2f) - (tilesize * multiplier / 2f);\n"+
"            float brcy = y - (block.size * tilesize / 2f) + (tilesize * multiplier / 2f);\n"+
"            Draw.z(Layer.power + 1);\n"+
"            Draw.color(Pal.gray);\n"+
"            Fill.square(brcx, brcy, 2.5f * multiplier, 45);\n"+
"            Draw.color(status().color);\n"+
"            Fill.square(brcx, brcy, 1.5f * multiplier, 45);\n"+
"            Draw.color();\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public void drawCracks() {\n"+
"        if (!damaged() || block.size > BlockRenderer.maxCrackSize)\n"+
"            return;\n"+
"        int id = pos();\n"+
"        TextureRegion region = renderer.blocks.cracks[block.size - 1][Mathf.clamp((int) ((1f - healthf()) * BlockRenderer.crackRegions), 0, BlockRenderer.crackRegions - 1)];\n"+
"        Draw.colorl(0.2f, 0.1f + (1f - healthf()) * 0.6f);\n"+
"        Draw.rect(region, x, y, (id % 4) * 90);\n"+
"        Draw.color();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Draw the block overlay that is shown when a cursor is over the block.\n"+
"     */\n"+
"    public void drawSelect() {\n"+
"    }\n"+
"\n"+
"    public void drawDisabled() {\n"+
"        Draw.color(Color.scarlet);\n"+
"        Draw.alpha(0.8f);\n"+
"        float size = 6f;\n"+
"        Draw.rect(Icon.cancel.getRegion(), x, y, size, size);\n"+
"        Draw.reset();\n"+
"    }\n"+
"\n"+
"    public void draw() {\n"+
"        if (block.variants == 0) {\n"+
"            Draw.rect(block.region, x, y, block.rotate ? rotdeg() : 0);\n"+
"        } else {\n"+
"            Draw.rect(block.variantRegions[Mathf.randomSeed(tile.pos(), 0, Math.max(0, block.variantRegions.length - 1))], x, y, block.rotate ? rotdeg() : 0);\n"+
"        }\n"+
"        drawTeamTop();\n"+
"    }\n"+
"\n"+
"    public void drawTeamTop() {\n"+
"        if (block.teamRegion.found()) {\n"+
"            if (block.teamRegions[team.id] == block.teamRegion)\n"+
"                Draw.color(team.color);\n"+
"            Draw.rect(block.teamRegions[team.id], x, y);\n"+
"            Draw.color();\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public void drawLight() {\n"+
"        if (block.hasLiquids && block.drawLiquidLight && liquids.current().lightColor.a > 0.001f) {\n"+
"            drawLiquidLight(liquids.current(), liquids.smoothAmount());\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public void drawLiquidLight(Liquid liquid, float amount) {\n"+
"        if (amount > 0.01f) {\n"+
"            Color color = liquid.lightColor;\n"+
"            float fract = 1f;\n"+
"            float opacity = color.a * fract;\n"+
"            if (opacity > 0.001f) {\n"+
"                Drawf.light(team, x, y, block.size * 30f * fract, color, opacity);\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public void drawTeam() {\n"+
"        Draw.color(team.color);\n"+
"        Draw.rect(\"block-border\", x - block.size * tilesize / 2f + 4, y - block.size * tilesize / 2f + 4);\n"+
"        Draw.color();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called after the block is placed by this client.\n"+
"     */\n"+
"    @CallSuper\n"+
"    public void playerPlaced(Object config) {\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called after the block is placed by anyone.\n"+
"     */\n"+
"    @CallSuper\n"+
"    public void placed() {\n"+
"        if (net.client())\n"+
"            return;\n"+
"        if ((block.consumesPower || block.outputsPower) && block.hasPower) {\n"+
"            PowerNode.getNodeLinks(tile, block, team, other -> {\n"+
"                if (!other.power.links.contains(pos())) {\n"+
"                    other.configureAny(pos());\n"+
"                }\n"+
"            });\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called when a block is placed over some other blocks. This seq will always have at least one item.\n"+
"     * Should load some previous state, if necessary.\n"+
"     */\n"+
"    public void overwrote(Seq<Building> previous) {\n"+
"    }\n"+
"\n"+
"    public void onRemoved() {\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called every frame a unit is on this\n"+
"     */\n"+
"    public void unitOn(Unit unit) {\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called when a unit that spawned at this tile is removed.\n"+
"     */\n"+
"    public void unitRemoved(Unit unit) {\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called when arbitrary configuration is applied to a tile.\n"+
"     */\n"+
"    public void configured(@Nullable Unit builder, @Nullable Object value) {\n"+
"        // null is of type void.class; anonymous classes use their superclass.\n"+
"        Class<?> type = value == null ? void.class : value.getClass().isAnonymousClass() ? value.getClass().getSuperclass() : value.getClass();\n"+
"        if (value instanceof Item)\n"+
"            type = Item.class;\n"+
"        if (value instanceof Block)\n"+
"            type = Block.class;\n"+
"        if (value instanceof Liquid)\n"+
"            type = Liquid.class;\n"+
"        if (builder != null && builder.isPlayer()) {\n"+
"            lastAccessed = builder.getPlayer().name;\n"+
"        }\n"+
"        Building build;\n"+
"        if (block.configurations.containsKey(type)) {\n"+
"            block.configurations.get(type).get(this, value);\n"+
"        } else if ((value instanceof Building && (build = (Building) value) == value)) {\n"+
"            // copy config of another building\n"+
"            var conf = build.config();\n"+
"            if (conf != null && !(conf instanceof Building)) {\n"+
"                configured(builder, conf);\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called when the block is tapped by the local player.\n"+
"     */\n"+
"    public void tapped() {\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called *after* the tile has been removed.\n"+
"     */\n"+
"    public void afterDestroyed() {\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return the cap for item amount calculations, used when this block explodes.\n"+
"     */\n"+
"    public int explosionItemCap() {\n"+
"        return block.itemCapacity;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called when the block is destroyed. The tile is still intact at this stage.\n"+
"     */\n"+
"    public void onDestroyed() {\n"+
"        float explosiveness = block.baseExplosiveness;\n"+
"        float flammability = 0f;\n"+
"        float power = 0f;\n"+
"        if (block.hasItems) {\n"+
"            for (Item item : content.items()) {\n"+
"                int amount = Math.min(items.get(item), explosionItemCap());\n"+
"                explosiveness += item.explosiveness * amount;\n"+
"                flammability += item.flammability * amount;\n"+
"                power += item.charge * Mathf.pow(amount, 1.1f) * 150f;\n"+
"            }\n"+
"        }\n"+
"        if (block.hasLiquids) {\n"+
"            flammability += liquids.sum((liquid, amount) -> liquid.flammability * amount / 2f);\n"+
"            explosiveness += liquids.sum((liquid, amount) -> liquid.explosiveness * amount / 2f);\n"+
"        }\n"+
"        if (block.consumes.hasPower() && block.consumes.getPower().buffered) {\n"+
"            power += this.power.status * block.consumes.getPower().capacity;\n"+
"        }\n"+
"        if (block.hasLiquids && state.rules.damageExplosions) {\n"+
"            liquids.each((liquid, amount) -> {\n"+
"                float splash = Mathf.clamp(amount / 4f, 0f, 10f);\n"+
"                for (int i = 0; i < Mathf.clamp(amount / 5, 0, 30); i++) {\n"+
"                    Time.run(i / 2f, () -> {\n"+
"                        Tile other = world.tile(tileX() + Mathf.range(block.size / 2), tileY() + Mathf.range(block.size / 2));\n"+
"                        if (other != null) {\n"+
"                            Puddles.deposit(other, liquid, splash);\n"+
"                        }\n"+
"                    });\n"+
"                }\n"+
"            });\n"+
"        }\n"+
"        Damage.dynamicExplosion(x, y, flammability, explosiveness * 3.5f, power, tilesize * block.size / 2f, state.rules.damageExplosions, block.destroyEffect);\n"+
"        if (!floor().solid && !floor().isLiquid) {\n"+
"            Effect.rubble(x, y, block.size);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public String getDisplayName() {\n"+
"        // derelict team icon currently doesn\'t display\n"+
"        return team == Team.derelict ? block.localizedName + \"\n"+
"\" + Core.bundle.get(\"block.derelict\") : block.localizedName + (team == player.team() || team.emoji.isEmpty() ? \"\" : \" \" + team.emoji);\n"+
"    }\n"+
"\n"+
"    public TextureRegion getDisplayIcon() {\n"+
"        return block.uiIcon;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void display(Table table) {\n"+
"        // display the block stuff\n"+
"        // TODO duplicated code?\n"+
"        table.table(t -> {\n"+
"            t.left();\n"+
"            t.add(new Image(block.getDisplayIcon(tile))).size(8 * 4);\n"+
"            t.labelWrap(block.getDisplayName(tile)).left().width(190f).padLeft(5);\n"+
"        }).growX().left();\n"+
"        table.row();\n"+
"        // only display everything else if the team is the same\n"+
"        if (team == player.team()) {\n"+
"            table.table(bars -> {\n"+
"                bars.defaults().growX().height(18f).pad(4);\n"+
"                displayBars(bars);\n"+
"            }).growX();\n"+
"            table.row();\n"+
"            table.table(this::displayConsumption).growX();\n"+
"            boolean displayFlow = (block.category == Category.distribution || block.category == Category.liquid) && block.displayFlow;\n"+
"            if (displayFlow) {\n"+
"                String ps = \" \" + StatUnit.perSecond.localized();\n"+
"                if (items != null) {\n"+
"                    table.row();\n"+
"                    table.left();\n"+
"                    table.table(l -> {\n"+
"                        Bits current = new Bits();\n"+
"                        Runnable rebuild = () -> {\n"+
"                            l.clearChildren();\n"+
"                            l.left();\n"+
"                            for (Item item : content.items()) {\n"+
"                                if (items.hasFlowItem(item)) {\n"+
"                                    l.image(item.uiIcon).padRight(3f);\n"+
"                                    l.label(() -> items.getFlowRate(item) < 0 ? \"...\" : Strings.fixed(items.getFlowRate(item), 1) + ps).color(Color.lightGray);\n"+
"                                    l.row();\n"+
"                                }\n"+
"                            }\n"+
"                        };\n"+
"                        rebuild.run();\n"+
"                        l.update(() -> {\n"+
"                            for (Item item : content.items()) {\n"+
"                                if (items.hasFlowItem(item) && !current.get(item.id)) {\n"+
"                                    current.set(item.id);\n"+
"                                    rebuild.run();\n"+
"                                }\n"+
"                            }\n"+
"                        });\n"+
"                    }).left();\n"+
"                }\n"+
"                if (liquids != null) {\n"+
"                    table.row();\n"+
"                    table.table(l -> {\n"+
"                        boolean[] had = { false };\n"+
"                        Runnable rebuild = () -> {\n"+
"                            l.clearChildren();\n"+
"                            l.left();\n"+
"                            l.image(() -> liquids.current().uiIcon).padRight(3f);\n"+
"                            l.label(() -> liquids.getFlowRate() < 0 ? \"...\" : Strings.fixed(liquids.getFlowRate(), 2) + ps).color(Color.lightGray);\n"+
"                        };\n"+
"                        l.update(() -> {\n"+
"                            if (!had[0] && liquids.hadFlow()) {\n"+
"                                had[0] = true;\n"+
"                                rebuild.run();\n"+
"                            }\n"+
"                        });\n"+
"                    }).left();\n"+
"                }\n"+
"            }\n"+
"            if (net.active() && lastAccessed != null) {\n"+
"                table.row();\n"+
"                table.add(Core.bundle.format(\"lastaccessed\", lastAccessed)).growX().wrap().left();\n"+
"            }\n"+
"            table.marginBottom(-5);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public void displayConsumption(Table table) {\n"+
"        table.left();\n"+
"        for (Consume cons : block.consumes.all()) {\n"+
"            if (cons.isOptional() && cons.isBoost())\n"+
"                continue;\n"+
"            cons.build(self(), table);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public void displayBars(Table table) {\n"+
"        for (Func<Building, Bar> bar : block.bars.list()) {\n"+
"            // TODO fix conclusively\n"+
"            try {\n"+
"                table.add(bar.get(self())).growX();\n"+
"                table.row();\n"+
"            } catch (ClassCastException e) {\n"+
"                break;\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called when this block is tapped to build a UI on the table.\n"+
"     * configurable must be true for this to be called.\n"+
"     */\n"+
"    public void buildConfiguration(Table table) {\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Update table alignment after configuring.\n"+
"     */\n"+
"    public void updateTableAlign(Table table) {\n"+
"        Vec2 pos = Core.input.mouseScreen(x, y - block.size * tilesize / 2f - 1);\n"+
"        table.setPosition(pos.x, pos.y, Align.top);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Returns whether or not a hand cursor should be shown over this block.\n"+
"     */\n"+
"    public Cursor getCursor() {\n"+
"        return block.configurable && interactable(player.team()) ? SystemCursor.hand : SystemCursor.arrow;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Called when another tile is tapped while this block is selected.\n"+
"     * @return whether or not this block should be deselected.\n"+
"     */\n"+
"    public boolean onConfigureTileTapped(Building other) {\n"+
"        return self() != other;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Returns whether this config menu should show when the specified player taps it.\n"+
"     */\n"+
"    public boolean shouldShowConfigure(Player player) {\n"+
"        return true;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Whether this configuration should be hidden now. Called every frame the config is open.\n"+
"     */\n"+
"    public boolean shouldHideConfigure(Player player) {\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    public void drawConfigure() {\n"+
"        Draw.color(Pal.accent);\n"+
"        Lines.stroke(1f);\n"+
"        Lines.square(x, y, block.size * tilesize / 2f + 1f);\n"+
"        Draw.reset();\n"+
"    }\n"+
"\n"+
"    public boolean checkSolid() {\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    public float handleDamage(float amount) {\n"+
"        return amount;\n"+
"    }\n"+
"\n"+
"    public boolean absorbLasers() {\n"+
"        return block.absorbLasers;\n"+
"    }\n"+
"\n"+
"    public boolean isInsulated() {\n"+
"        return block.insulated;\n"+
"    }\n"+
"\n"+
"    public boolean collide(Bullet other) {\n"+
"        return true;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Handle a bullet collision.\n"+
"     * @return whether the bullet should be removed.\n"+
"     */\n"+
"    public boolean collision(Bullet other) {\n"+
"        damage(other.team, other.damage() * other.type().buildingDamageMultiplier);\n"+
"        return true;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Used to handle damage from splash damage for certain types of blocks.\n"+
"     */\n"+
"    public void damage(@Nullable Team source, float damage) {\n"+
"        damage(damage);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Changes this building\'s team in a safe manner.\n"+
"     */\n"+
"    public void changeTeam(Team next) {\n"+
"        Team last = this.team;\n"+
"        indexer.removeIndex(tile);\n"+
"        this.team = next;\n"+
"        indexer.addIndex(tile);\n"+
"        Events.fire(teamChangeEvent.set(last, self()));\n"+
"    }\n"+
"\n"+
"    public boolean canPickup() {\n"+
"        return true;\n"+
"    }\n"+
"\n"+
"    public void pickedUp() {\n"+
"    }\n"+
"\n"+
"    public void removeFromProximity() {\n"+
"        onProximityRemoved();\n"+
"        tmpTiles.clear();\n"+
"        Point2[] nearby = Edges.getEdges(block.size);\n"+
"        for (Point2 point : nearby) {\n"+
"            Building other = world.build(tile.x + point.x, tile.y + point.y);\n"+
"            // remove this tile from all nearby tile\'s proximities\n"+
"            if (other != null) {\n"+
"                tmpTiles.add(other);\n"+
"            }\n"+
"        }\n"+
"        for (Building other : tmpTiles) {\n"+
"            other.proximity.remove(self(), true);\n"+
"            other.onProximityUpdate();\n"+
"        }\n"+
"        proximity.clear();\n"+
"    }\n"+
"\n"+
"    public void updateProximity() {\n"+
"        tmpTiles.clear();\n"+
"        proximity.clear();\n"+
"        Point2[] nearby = Edges.getEdges(block.size);\n"+
"        for (Point2 point : nearby) {\n"+
"            Building other = world.build(tile.x + point.x, tile.y + point.y);\n"+
"            if (other == null || !(other.tile.interactable(team)))\n"+
"                continue;\n"+
"            // add this tile to proximity of nearby tiles\n"+
"            if (!other.proximity.contains(self(), true)) {\n"+
"                other.proximity.add(self());\n"+
"            }\n"+
"            tmpTiles.add(other);\n"+
"        }\n"+
"        // using a set to prevent duplicates\n"+
"        for (Building tile : tmpTiles) {\n"+
"            proximity.add(tile);\n"+
"        }\n"+
"        onProximityAdded();\n"+
"        onProximityUpdate();\n"+
"        for (Building other : tmpTiles) {\n"+
"            other.onProximityUpdate();\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public void updateTile() {\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return ambient sound volume scale.\n"+
"     */\n"+
"    public float ambientVolume() {\n"+
"        return efficiency();\n"+
"    }\n"+
"\n"+
"    // endregion\n"+
"    // region overrides\n"+
"    /**\n"+
"     * Tile configuration. Defaults to null. Used for block rebuilding.\n"+
"     */\n"+
"    @Nullable\n"+
"    public Object config() {\n"+
"        return null;\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    @Override\n"+
"    public boolean isValid() {\n"+
"        return tile.build == self() && !dead();\n"+
"    }\n"+
"\n"+
"    @MethodPriority(100)\n"+
"    @Override\n"+
"    public void heal() {\n"+
"        indexer.notifyBuildHealed(self());\n"+
"    }\n"+
"\n"+
"    @MethodPriority(100)\n"+
"    @Override\n"+
"    public void heal(float amount) {\n"+
"        indexer.notifyBuildHealed(self());\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public float hitSize() {\n"+
"        return tile.block().size * tilesize;\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    @Override\n"+
"    public void kill() {\n"+
"        Call.tileDestroyed(self());\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    @Override\n"+
"    public void damage(float damage) {\n"+
"        if (dead())\n"+
"            return;\n"+
"        float dm = state.rules.blockHealth(team);\n"+
"        if (Mathf.zero(dm)) {\n"+
"            damage = health + 1;\n"+
"        } else {\n"+
"            damage /= dm;\n"+
"        }\n"+
"        Call.tileDamage(self(), health - handleDamage(damage));\n"+
"        if (health <= 0) {\n"+
"            Call.tileDestroyed(self());\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public double sense(LAccess sensor) {\n"+
"        Ranged r;\n"+
"        ControlBlock c;\n"+
"        switch(sensor) {\n"+
"            case x:\n"+
"                return World.conv(x);\n"+
"            case y:\n"+
"                return World.conv(y);\n"+
"            case dead:\n"+
"                return !isValid() ? 1 : 0;\n"+
"            case team:\n"+
"                return team.id;\n"+
"            case health:\n"+
"                return health;\n"+
"            case maxHealth:\n"+
"                return maxHealth;\n"+
"            case efficiency:\n"+
"                return efficiency();\n"+
"            case timescale:\n"+
"                return timeScale;\n"+
"            case range:\n"+
"                return (this instanceof Ranged && (r = (Ranged) this) == this) ? r.range() / tilesize : 0;\n"+
"            case rotation:\n"+
"                return rotation;\n"+
"            case totalItems:\n"+
"                return items == null ? 0 : items.total();\n"+
"            case totalLiquids:\n"+
"                return liquids == null ? 0 : liquids.total();\n"+
"            case totalPower:\n"+
"                return power == null || !block.consumes.hasPower() ? 0 : power.status * (block.consumes.getPower().buffered ? block.consumes.getPower().capacity : 1f);\n"+
"            case itemCapacity:\n"+
"                return block.hasItems ? block.itemCapacity : 0;\n"+
"            case liquidCapacity:\n"+
"                return block.hasLiquids ? block.liquidCapacity : 0;\n"+
"            case powerCapacity:\n"+
"                return block.consumes.hasPower() ? block.consumes.getPower().capacity : 0f;\n"+
"            case powerNetIn:\n"+
"                return power == null ? 0 : power.graph.getLastScaledPowerIn() * 60;\n"+
"            case powerNetOut:\n"+
"                return power == null ? 0 : power.graph.getLastScaledPowerOut() * 60;\n"+
"            case powerNetStored:\n"+
"                return power == null ? 0 : power.graph.getLastPowerStored();\n"+
"            case powerNetCapacity:\n"+
"                return power == null ? 0 : power.graph.getLastCapacity();\n"+
"            case enabled:\n"+
"                return enabled ? 1 : 0;\n"+
"            case controlled:\n"+
"                return (this instanceof ControlBlock && (c = (ControlBlock) this) == this) && c.isControlled() ? GlobalConstants.ctrlPlayer : 0;\n"+
"            case payloadCount:\n"+
"                return getPayload() != null ? 1 : 0;\n"+
"            case size:\n"+
"                return block.size;\n"+
"            // gets converted to null in logic\n"+
"            default:\n"+
"                return Float.NaN;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public Object senseObject(LAccess sensor) {\n"+
"        UnitPayload p1;\n"+
"        BuildPayload p2;\n"+
"        switch(sensor) {\n"+
"            case type:\n"+
"                return block;\n"+
"            case firstItem:\n"+
"                return items == null ? null : items.first();\n"+
"            case config:\n"+
"                return block.configSenseable() ? config() : null;\n"+
"            case payloadType:\n"+
"                return (getPayload() instanceof UnitPayload && (p1 = (UnitPayload) getPayload()) == getPayload()) ? p1.unit.type : (getPayload() instanceof BuildPayload && (p2 = (BuildPayload) getPayload()) == getPayload()) ? p2.block() : null;\n"+
"            default:\n"+
"                return noSensed;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public double sense(Content content) {\n"+
"        Item i;\n"+
"        if ((content instanceof Item && (i = (Item) content) == content) && items != null)\n"+
"            return items.get(i);\n"+
"        Liquid l;\n"+
"        if ((content instanceof Liquid && (l = (Liquid) content) == content) && liquids != null)\n"+
"            return liquids.get(l);\n"+
"        // invalid sense\n"+
"        return Float.NaN;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void control(LAccess type, double p1, double p2, double p3, double p4) {\n"+
"        if (type == LAccess.enabled) {\n"+
"            enabled = !Mathf.zero((float) p1);\n"+
"            enabledControlTime = timeToUncontrol;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void control(LAccess type, Object p1, double p2, double p3, double p4) {\n"+
"        // don\'t execute configure instructions that copy logic building configures; this can cause extreme lag\n"+
"        if (type == LAccess.config && block.logicConfigurable && !(p1 instanceof LogicBuild)) {\n"+
"            // change config only if it\'s new\n"+
"            configured(null, p1);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void remove() {\n"+
"        if (sound != null) {\n"+
"            sound.stop();\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void killed() {\n"+
"        Events.fire(new BlockDestroyEvent(tile));\n"+
"        block.destroySound.at(tile);\n"+
"        onDestroyed();\n"+
"        tile.remove();\n"+
"        remove();\n"+
"        afterDestroyed();\n"+
"    }\n"+
"\n"+
"    @Final\n"+
"    @Override\n"+
"    public void update() {\n"+
"        if (state.isEditor())\n"+
"            return;\n"+
"        timeScaleDuration -= Time.delta;\n"+
"        if (timeScaleDuration <= 0f || !block.canOverdrive) {\n"+
"            timeScale = 1f;\n"+
"        }\n"+
"        if (!enabled && block.autoResetEnabled) {\n"+
"            noSleep();\n"+
"            enabledControlTime -= Time.delta;\n"+
"            if (enabledControlTime <= 0) {\n"+
"                enabled = true;\n"+
"            }\n"+
"        }\n"+
"        if (team == Team.derelict || !block.supportsEnv(state.rules.environment)) {\n"+
"            enabled = false;\n"+
"        }\n"+
"        if (!headless) {\n"+
"            if (sound != null) {\n"+
"                sound.update(x, y, shouldActiveSound());\n"+
"            }\n"+
"            if (block.ambientSound != Sounds.none && shouldAmbientSound()) {\n"+
"                control.sound.loop(block.ambientSound, self(), block.ambientSoundVolume * ambientVolume());\n"+
"            }\n"+
"        }\n"+
"        if (cons != null) {\n"+
"            cons.update();\n"+
"        }\n"+
"        if (enabled || !block.noUpdateDisabled) {\n"+
"            updateTile();\n"+
"        }\n"+
"        if (items != null) {\n"+
"            items.update(updateFlow);\n"+
"        }\n"+
"        if (liquids != null) {\n"+
"            liquids.update(updateFlow);\n"+
"        }\n"+
"        if (power != null) {\n"+
"            power.graph.update();\n"+
"        }\n"+
"        updateFlow = false;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void hitbox(Rect out) {\n"+
"        out.setCentered(x, y, block.size * tilesize, block.size * tilesize);\n"+
"    }\n"+
"    // endregion\n"+
"}\n"+
"");
        compMap.put("BulletComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.func.*;\n"+
"import arc.graphics.g2d.*;\n"+
"import arc.math.geom.*;\n"+
"import arc.struct.*;\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.core.*;\n"+
"import mindustry.entities.bullet.*;\n"+
"import mindustry.game.*;\n"+
"import mindustry.game.Teams.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.graphics.*;\n"+
"import mindustry.world.*;\n"+
"import mindustry.world.blocks.environment.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"// @EntityDef(value = { Bulletc.class }, pooled = true, serialize = false)\n"+
"@Component(base = true)\n"+
"abstract class BulletComp implements Timedc, Damagec, Hitboxc, Teamc, Posc, Drawc, Shielderc, Ownerc, Velc, Bulletc, Timerc {\n"+
"\n"+
"    @Import\n"+
"    Team team;\n"+
"\n"+
"    @Import\n"+
"    Entityc owner;\n"+
"\n"+
"    @Import\n"+
"    float x, y, damage;\n"+
"\n"+
"    @Import\n"+
"    Vec2 vel;\n"+
"\n"+
"    IntSeq collided = new IntSeq(6);\n"+
"\n"+
"    Object data;\n"+
"\n"+
"    BulletType type;\n"+
"\n"+
"    float fdata;\n"+
"\n"+
"    @ReadOnly\n"+
"    private float rotation;\n"+
"\n"+
"    transient boolean absorbed, hit;\n"+
"\n"+
"    @Nullable\n"+
"    transient Trail trail;\n"+
"\n"+
"    @Override\n"+
"    public void getCollisions(Cons<QuadTree> consumer) {\n"+
"        Seq<TeamData> data = state.teams.present;\n"+
"        for (int i = 0; i < data.size; i++) {\n"+
"            if (data.items[i].team != team) {\n"+
"                consumer.get(data.items[i].tree());\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"\n"+
"    // bullets always considered local\n"+
"    @Override\n"+
"    @Replace\n"+
"    public boolean isLocal() {\n"+
"        return true;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void add() {\n"+
"        type.init(self());\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void remove() {\n"+
"        // \'despawned\' only counts when the bullet is killed externally or reaches the end of life\n"+
"        if (!hit) {\n"+
"            type.despawned(self());\n"+
"        }\n"+
"        type.removed(self());\n"+
"        collided.clear();\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public float damageMultiplier() {\n"+
"        Unit u;\n"+
"        if ((owner instanceof Unit && (u = (Unit) owner) == owner))\n"+
"            return u.damageMultiplier() * state.rules.unitDamage(team);\n"+
"        if (owner instanceof Building)\n"+
"            return state.rules.blockDamage(team);\n"+
"        return 1f;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void absorb() {\n"+
"        absorbed = true;\n"+
"        remove();\n"+
"    }\n"+
"\n"+
"    public boolean hasCollided(int id) {\n"+
"        return collided.size != 0 && collided.contains(id);\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    public float clipSize() {\n"+
"        return type.drawSize;\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    @Override\n"+
"    public boolean collides(Hitboxc other) {\n"+
"        Teamc t;\n"+
"        Flyingc f;\n"+
"        return // prevent multiple collisions\n"+
"        type.collides && ((other instanceof Teamc && (t = (Teamc) other) == other) && t.team() != team) && !((other instanceof Flyingc && (f = (Flyingc) other) == other) && !f.checkTarget(type.collidesAir, type.collidesGround)) && !(type.pierce && hasCollided(other.id()));\n"+
"    }\n"+
"\n"+
"    @MethodPriority(100)\n"+
"    @Override\n"+
"    public void collision(Hitboxc other, float x, float y) {\n"+
"        type.hit(self(), x, y);\n"+
"        // must be last.\n"+
"        if (!type.pierce) {\n"+
"            hit = true;\n"+
"            remove();\n"+
"        } else {\n"+
"            collided.add(other.id());\n"+
"        }\n"+
"        Healthc h;\n"+
"        type.hitEntity(self(), other, (other instanceof Healthc && (h = (Healthc) other) == other) ? h.health() : 0f);\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        type.update(self());\n"+
"        if (type.collidesTiles && type.collides && type.collidesGround) {\n"+
"            tileRaycast(World.toTile(lastX()), World.toTile(lastY()), tileX(), tileY());\n"+
"        }\n"+
"        if (type.pierceCap != -1 && collided.size >= type.pierceCap) {\n"+
"            hit = true;\n"+
"            remove();\n"+
"        }\n"+
"    }\n"+
"\n"+
"    // copy-paste of World#raycastEach, inlined for lambda capture performance.\n"+
"    @Override\n"+
"    public void tileRaycast(int x0f, int y0f, int x1, int y1) {\n"+
"        int x = x0f, dx = Math.abs(x1 - x), sx = x < x1 ? 1 : -1;\n"+
"        int y = y0f, dy = Math.abs(y1 - y), sy = y < y1 ? 1 : -1;\n"+
"        int e2, err = dx - dy;\n"+
"        int ww = world.width(), wh = world.height();\n"+
"        while (x >= 0 && y >= 0 && x < ww && y < wh) {\n"+
"            Building build = world.build(x, y);\n"+
"            if (type.collideFloor || type.collideTerrain) {\n"+
"                Tile tile = world.tile(x, y);\n"+
"                if (type.collideFloor && (tile == null || tile.floor().hasSurface() || tile.block() != Blocks.air) || type.collideTerrain && tile != null && tile.block() instanceof StaticWall) {\n"+
"                    type.despawned(self());\n"+
"                    remove();\n"+
"                    hit = true;\n"+
"                    return;\n"+
"                }\n"+
"            }\n"+
"            if (build != null && isAdded() && build.collide(self()) && type.testCollision(self(), build) && !build.dead() && (type.collidesTeam || build.team != team) && !(type.pierceBuilding && hasCollided(build.id))) {\n"+
"                boolean remove = false;\n"+
"                float health = build.health;\n"+
"                if (build.team != team) {\n"+
"                    remove = build.collision(self());\n"+
"                }\n"+
"                if (remove || type.collidesTeam) {\n"+
"                    if (!type.pierceBuilding) {\n"+
"                        hit = true;\n"+
"                        remove();\n"+
"                    } else {\n"+
"                        collided.add(build.id);\n"+
"                    }\n"+
"                }\n"+
"                type.hitTile(self(), build, health, true);\n"+
"                // stop raycasting when building is hit\n"+
"                if (type.pierceBuilding)\n"+
"                    return;\n"+
"            }\n"+
"            if (x == x1 && y == y1)\n"+
"                break;\n"+
"            e2 = 2 * err;\n"+
"            if (e2 > -dy) {\n"+
"                err -= dy;\n"+
"                x += sx;\n"+
"            }\n"+
"            if (e2 < dx) {\n"+
"                err += dx;\n"+
"                y += sy;\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void draw() {\n"+
"        Draw.z(type.layer);\n"+
"        type.draw(self());\n"+
"        type.drawLight(self());\n"+
"    }\n"+
"\n"+
"    public void initVel(float angle, float amount) {\n"+
"        vel.trns(angle, amount);\n"+
"        rotation = angle;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Sets the bullet\'s rotation in degrees.\n"+
"     */\n"+
"    @Override\n"+
"    public void rotation(float angle) {\n"+
"        vel.setAngle(rotation = angle);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return the bullet\'s rotation.\n"+
"     */\n"+
"    @Override\n"+
"    public float rotation() {\n"+
"        return vel.isZero(0.001f) ? rotation : vel.angle();\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("ChildComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.math.*;\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class ChildComp implements Posc, Rotc {\n"+
"\n"+
"    @Import\n"+
"    float x, y, rotation;\n"+
"\n"+
"    @Nullable\n"+
"    Posc parent;\n"+
"\n"+
"    boolean rotWithParent;\n"+
"\n"+
"    float offsetX, offsetY, offsetPos, offsetRot;\n"+
"\n"+
"    @Override\n"+
"    public void add() {\n"+
"        Rotc r;\n"+
"        if (parent != null) {\n"+
"            offsetX = x - parent.getX();\n"+
"            offsetY = y - parent.getY();\n"+
"            if (rotWithParent && (parent instanceof Rotc && (r = (Rotc) parent) == parent)) {\n"+
"                offsetPos = -r.rotation();\n"+
"                offsetRot = rotation - r.rotation();\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        Rotc r;\n"+
"        if (parent != null) {\n"+
"            if (rotWithParent && (parent instanceof Rotc && (r = (Rotc) parent) == parent)) {\n"+
"                x = parent.getX() + Angles.trnsx(r.rotation() + offsetPos, offsetX, offsetY);\n"+
"                y = parent.getY() + Angles.trnsy(r.rotation() + offsetPos, offsetX, offsetY);\n"+
"                rotation = r.rotation() + offsetRot;\n"+
"            } else {\n"+
"                x = parent.getX() + offsetX;\n"+
"                y = parent.getY() + offsetY;\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("CommanderComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.func.*;\n"+
"import arc.math.geom.*;\n"+
"import arc.struct.*;\n"+
"import arc.util.*;\n"+
"import mindustry.*;\n"+
"import mindustry.ai.formations.*;\n"+
"import mindustry.ai.types.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.entities.*;\n"+
"import mindustry.entities.units.*;\n"+
"import mindustry.game.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.type.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"/**\n"+
" * A unit that can command other units.\n"+
" */\n"+
"@Component\n"+
"abstract class CommanderComp implements Entityc, Posc {\n"+
"\n"+
"    private static final Seq<FormationMember> members = new Seq<>();\n"+
"\n"+
"    private static final Seq<Unit> units = new Seq<>();\n"+
"\n"+
"    @Import\n"+
"    float x, y, rotation, hitSize;\n"+
"\n"+
"    @Import\n"+
"    Team team;\n"+
"\n"+
"    @Import\n"+
"    UnitType type;\n"+
"\n"+
"    @Nullable\n"+
"    transient Formation formation;\n"+
"\n"+
"    transient Seq<Unit> controlling = new Seq<>(10);\n"+
"\n"+
"    /**\n"+
"     * minimum speed of any unit in the formation.\n"+
"     */\n"+
"    transient float minFormationSpeed;\n"+
"\n"+
"    public void update() {\n"+
"        if (controlling.isEmpty() && !Vars.net.client()) {\n"+
"            formation = null;\n"+
"        }\n"+
"        if (formation != null) {\n"+
"            formation.anchor.set(x, y, 0);\n"+
"            formation.updateSlots();\n"+
"            controlling.removeAll(u -> {\n"+
"                FormationAI ai;\n"+
"                return u.dead || !((u.controller() instanceof FormationAI && (ai = (FormationAI) u.controller()) == u.controller()) && ai.leader == self());\n"+
"            });\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public void remove() {\n"+
"        clearCommand();\n"+
"    }\n"+
"\n"+
"    public void killed() {\n"+
"        clearCommand();\n"+
"    }\n"+
"\n"+
"    // make sure to reset command state when the controller is switched\n"+
"    public void controller(UnitController next) {\n"+
"        clearCommand();\n"+
"    }\n"+
"\n"+
"    void commandNearby(FormationPattern pattern) {\n"+
"        commandNearby(pattern, u -> true);\n"+
"    }\n"+
"\n"+
"    void commandNearby(FormationPattern pattern, Boolf<Unit> include) {\n"+
"        Formation formation = new Formation(new Vec3(x, y, rotation), pattern);\n"+
"        formation.slotAssignmentStrategy = new DistanceAssignmentStrategy(pattern);\n"+
"        units.clear();\n"+
"        Units.nearby(team, x, y, type.commandRadius, u -> {\n"+
"            if (u.isAI() && include.get(u) && u != self() && u.type.flying == type.flying && u.hitSize <= hitSize * 1.1f) {\n"+
"                units.add(u);\n"+
"            }\n"+
"        });\n"+
"        if (units.isEmpty())\n"+
"            return;\n"+
"        // sort by hitbox size, then by distance\n"+
"        units.sort(Structs.comps(Structs.comparingFloat(u -> -u.hitSize), Structs.comparingFloat(u -> u.dst2(this))));\n"+
"        units.truncate(type.commandLimit);\n"+
"        command(formation, units);\n"+
"    }\n"+
"\n"+
"    void command(Formation formation, Seq<Unit> units) {\n"+
"        clearCommand();\n"+
"        units.shuffle();\n"+
"        float spacing = hitSize * 0.9f;\n"+
"        minFormationSpeed = type.speed;\n"+
"        controlling.addAll(units);\n"+
"        for (Unit unit : units) {\n"+
"            FormationAI ai;\n"+
"            unit.controller(ai = new FormationAI(self(), formation));\n"+
"            spacing = Math.max(spacing, ai.formationSize());\n"+
"            minFormationSpeed = Math.min(minFormationSpeed, unit.type.speed);\n"+
"        }\n"+
"        this.formation = formation;\n"+
"        // update formation spacing based on max size\n"+
"        formation.pattern.spacing = spacing;\n"+
"        members.clear();\n"+
"        for (Unitc u : units) {\n"+
"            members.add((FormationAI) u.controller());\n"+
"        }\n"+
"        // TODO doesn\'t handle units that don\'t fit a formation\n"+
"        formation.addMembers(members);\n"+
"    }\n"+
"\n"+
"    boolean isCommanding() {\n"+
"        return formation != null;\n"+
"    }\n"+
"\n"+
"    void clearCommand() {\n"+
"        // reset controlled units\n"+
"        for (Unit unit : controlling) {\n"+
"            if (unit.controller().isBeingControlled(self())) {\n"+
"                unit.controller(unit.type.createController());\n"+
"            }\n"+
"        }\n"+
"        controlling.clear();\n"+
"        formation = null;\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("DamageComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class DamageComp {\n"+
"\n"+
"    float damage;\n"+
"}\n"+
"");
        compMap.put("DecalComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.graphics.*;\n"+
"import arc.graphics.g2d.*;\n"+
"import arc.math.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.graphics.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"// @EntityDef(value = { Decalc.class }, pooled = true, serialize = false)\n"+
"@Component(base = true)\n"+
"abstract class DecalComp implements Drawc, Timedc, Rotc, Posc {\n"+
"\n"+
"    @Import\n"+
"    float x, y, rotation;\n"+
"\n"+
"    Color color = new Color(1, 1, 1, 1);\n"+
"\n"+
"    TextureRegion region;\n"+
"\n"+
"    @Override\n"+
"    public void draw() {\n"+
"        Draw.z(Layer.scorch);\n"+
"        Draw.mixcol(color, color.a);\n"+
"        Draw.alpha(1f - Mathf.curve(fin(), 0.98f));\n"+
"        Draw.rect(region, x, y, rotation);\n"+
"        Draw.reset();\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    public float clipSize() {\n"+
"        return region.width * 2;\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("DrawComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class DrawComp implements Posc {\n"+
"\n"+
"    float clipSize() {\n"+
"        return Float.MAX_VALUE;\n"+
"    }\n"+
"\n"+
"    void draw() {\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("EffectStateComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.graphics.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.entities.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"// @EntityDef(value = { EffectStatec.class, Childc.class }, pooled = true, serialize = false)\n"+
"@Component(base = true)\n"+
"abstract class EffectStateComp implements Posc, Drawc, Timedc, Rotc, Childc {\n"+
"\n"+
"    @Import\n"+
"    float time, lifetime, rotation, x, y;\n"+
"\n"+
"    @Import\n"+
"    int id;\n"+
"\n"+
"    Color color = new Color(Color.white);\n"+
"\n"+
"    Effect effect;\n"+
"\n"+
"    Object data;\n"+
"\n"+
"    @Override\n"+
"    public void draw() {\n"+
"        lifetime = effect.render(id, color, time, lifetime, rotation, x, y, data);\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    public float clipSize() {\n"+
"        return effect.clip;\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("ElevationMoveComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.entities.*;\n"+
"import mindustry.entities.EntityCollisions.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class ElevationMoveComp implements Velc, Posc, Flyingc, Hitboxc {\n"+
"\n"+
"    @Import\n"+
"    float x, y;\n"+
"\n"+
"    @Replace\n"+
"    @Override\n"+
"    public SolidPred solidity() {\n"+
"        return isFlying() ? null : EntityCollisions::solid;\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("EntityComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.util.io.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.entities.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"@BaseComponent\n"+
"abstract class EntityComp {\n"+
"\n"+
"    private transient boolean added;\n"+
"\n"+
"    transient int id = EntityGroup.nextId();\n"+
"\n"+
"    boolean isAdded() {\n"+
"        return added;\n"+
"    }\n"+
"\n"+
"    void update() {\n"+
"    }\n"+
"\n"+
"    void remove() {\n"+
"        added = false;\n"+
"    }\n"+
"\n"+
"    void add() {\n"+
"        added = true;\n"+
"    }\n"+
"\n"+
"    boolean isLocal() {\n"+
"        Unitc u;\n"+
"        return ((Object) this) == player || (((Object) this) instanceof Unitc && (u = (Unitc) ((Object) this)) == ((Object) this)) && u.controller() == player;\n"+
"    }\n"+
"\n"+
"    boolean isRemote() {\n"+
"        Unitc u;\n"+
"        return (((Object) this) instanceof Unitc && (u = (Unitc) ((Object) this)) == ((Object) this)) && u.isPlayer() && !isLocal();\n"+
"    }\n"+
"\n"+
"    boolean isNull() {\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Replaced with `this` after code generation.\n"+
"     */\n"+
"    <T extends Entityc> T self() {\n"+
"        return (T) this;\n"+
"    }\n"+
"\n"+
"    <T> T as() {\n"+
"        return (T) this;\n"+
"    }\n"+
"\n"+
"    @InternalImpl\n"+
"    abstract int classId();\n"+
"\n"+
"    @InternalImpl\n"+
"    abstract boolean serialize();\n"+
"\n"+
"    @MethodPriority(1)\n"+
"    void read(Reads read) {\n"+
"        afterRead();\n"+
"    }\n"+
"\n"+
"    void write(Writes write) {\n"+
"    }\n"+
"\n"+
"    void afterRead() {\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("FireComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.*;\n"+
"import arc.graphics.g2d.*;\n"+
"import arc.math.*;\n"+
"import arc.math.geom.*;\n"+
"import arc.util.*;\n"+
"import mindustry.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.entities.*;\n"+
"import mindustry.game.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.graphics.*;\n"+
"import mindustry.world.*;\n"+
"import mindustry.world.meta.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"// @EntityDef(value = { Firec.class }, pooled = true)\n"+
"@Component(base = true)\n"+
"abstract class FireComp implements Timedc, Posc, Syncc, Drawc {\n"+
"\n"+
"    public static final int frames = 40, duration = 90;\n"+
"\n"+
"    private static final float spreadDelay = 22f, fireballDelay = 40f, ticksPerFrame = (float) duration / frames, warmupDuration = 20f, damageDelay = 40f, tileDamage = 1.8f, unitDamage = 3f;\n"+
"\n"+
"    public static final TextureRegion[] regions = new TextureRegion[frames];\n"+
"\n"+
"    @Import\n"+
"    float time, lifetime, x, y;\n"+
"\n"+
"    @Import\n"+
"    int id;\n"+
"\n"+
"    Tile tile;\n"+
"\n"+
"    private transient Block block;\n"+
"\n"+
"    private transient float baseFlammability = -1, puddleFlammability, damageTimer = Mathf.random(40f), spreadTimer = Mathf.random(spreadDelay), fireballTimer = Mathf.random(fireballDelay), warmup = 0f, animation = Mathf.random(frames - 1);\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        animation += Time.delta / ticksPerFrame;\n"+
"        warmup += Time.delta;\n"+
"        animation %= frames;\n"+
"        if (!headless) {\n"+
"            control.sound.loop(Sounds.fire, this, 0.07f);\n"+
"        }\n"+
"        // faster updates -> disappears more quickly\n"+
"        float speedMultiplier = 1f + Math.max(state.envAttrs.get(Attribute.water) * 10f, 0);\n"+
"        time = Mathf.clamp(time + Time.delta * speedMultiplier, 0, lifetime);\n"+
"        if (Vars.net.client()) {\n"+
"            return;\n"+
"        }\n"+
"        if (time >= lifetime || tile == null || Float.isNaN(lifetime)) {\n"+
"            remove();\n"+
"            return;\n"+
"        }\n"+
"        Building entity = tile.build;\n"+
"        boolean damage = entity != null;\n"+
"        if (baseFlammability < 0 || block != tile.block()) {\n"+
"            baseFlammability = tile.getFlammability();\n"+
"            block = tile.block();\n"+
"        }\n"+
"        float flammability = baseFlammability + puddleFlammability;\n"+
"        if (!damage && flammability <= 0) {\n"+
"            time += Time.delta * 8;\n"+
"        }\n"+
"        if (damage) {\n"+
"            lifetime += Mathf.clamp(flammability / 8f, 0f, 0.6f) * Time.delta;\n"+
"        }\n"+
"        if (flammability > 1f && (spreadTimer += Time.delta * Mathf.clamp(flammability / 5f, 0.3f, 2f)) >= spreadDelay) {\n"+
"            spreadTimer = 0f;\n"+
"            Point2 p = Geometry.d4[Mathf.random(3)];\n"+
"            Tile other = world.tile(tile.x + p.x, tile.y + p.y);\n"+
"            Fires.create(other);\n"+
"        }\n"+
"        if (flammability > 0 && (fireballTimer += Time.delta * Mathf.clamp(flammability / 10f, 0f, 0.5f)) >= fireballDelay) {\n"+
"            fireballTimer = 0f;\n"+
"            Bullets.fireball.createNet(Team.derelict, x, y, Mathf.random(360f), -1f, 1, 1);\n"+
"        }\n"+
"        // apply damage to nearby units & building\n"+
"        if ((damageTimer += Time.delta) >= damageDelay) {\n"+
"            damageTimer = 0f;\n"+
"            Puddlec p = Puddles.get(tile);\n"+
"            puddleFlammability = p != null ? p.getFlammability() / 3f : 0;\n"+
"            if (damage) {\n"+
"                entity.damage(tileDamage);\n"+
"            }\n"+
"            Damage.damageUnits(null, tile.worldx(), tile.worldy(), tilesize, unitDamage, unit -> !unit.isFlying() && !unit.isImmune(StatusEffects.burning), unit -> unit.apply(StatusEffects.burning, 60 * 5));\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void draw() {\n"+
"        if (regions[0] == null) {\n"+
"            for (int i = 0; i < frames; i++) {\n"+
"                regions[i] = Core.atlas.find(\"fire\" + i);\n"+
"            }\n"+
"        }\n"+
"        Draw.alpha(Mathf.clamp(warmup / warmupDuration));\n"+
"        Draw.z(Layer.effect);\n"+
"        Draw.rect(regions[Math.min((int) animation, regions.length - 1)], x + Mathf.randomSeedRange((int) y, 2), y + Mathf.randomSeedRange((int) x, 2));\n"+
"        Draw.reset();\n"+
"        Drawf.light(x, y, 50f + Mathf.absin(5f, 5f), Pal.lightFlame, 0.6f * Mathf.clamp(warmup / warmupDuration));\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    @Override\n"+
"    public float clipSize() {\n"+
"        return 25;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void remove() {\n"+
"        Fx.fireRemove.at(x, y, animation);\n"+
"        Fires.remove(tile);\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void afterRead() {\n"+
"        Fires.register(self());\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void afterSync() {\n"+
"        Fires.register(self());\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("FlyingComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.*;\n"+
"import arc.math.*;\n"+
"import arc.math.geom.*;\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.game.EventType.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.type.*;\n"+
"import mindustry.world.blocks.environment.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class FlyingComp implements Posc, Velc, Healthc, Hitboxc {\n"+
"\n"+
"    private static final Vec2 tmp1 = new Vec2(), tmp2 = new Vec2();\n"+
"\n"+
"    @Import\n"+
"    float x, y, speedMultiplier, hitSize;\n"+
"\n"+
"    @Import\n"+
"    Vec2 vel;\n"+
"\n"+
"    @Import\n"+
"    UnitType type;\n"+
"\n"+
"    @SyncLocal\n"+
"    float elevation;\n"+
"\n"+
"    private transient boolean wasFlying;\n"+
"\n"+
"    transient boolean hovering;\n"+
"\n"+
"    transient float drownTime;\n"+
"\n"+
"    transient float splashTimer;\n"+
"\n"+
"    @Nullable\n"+
"    transient Floor lastDrownFloor;\n"+
"\n"+
"    boolean checkTarget(boolean targetAir, boolean targetGround) {\n"+
"        return (isGrounded() && targetGround) || (isFlying() && targetAir);\n"+
"    }\n"+
"\n"+
"    boolean isGrounded() {\n"+
"        return elevation < 0.001f;\n"+
"    }\n"+
"\n"+
"    boolean isFlying() {\n"+
"        return elevation >= 0.09f;\n"+
"    }\n"+
"\n"+
"    boolean canDrown() {\n"+
"        return isGrounded() && !hovering;\n"+
"    }\n"+
"\n"+
"    @Nullable\n"+
"    Floor drownFloor() {\n"+
"        return canDrown() ? floorOn() : null;\n"+
"    }\n"+
"\n"+
"    boolean emitWalkSound() {\n"+
"        return true;\n"+
"    }\n"+
"\n"+
"    void landed() {\n"+
"    }\n"+
"\n"+
"    void wobble() {\n"+
"        x += Mathf.sin(Time.time + (id() % 10) * 12, 25f, 0.05f) * Time.delta * elevation;\n"+
"        y += Mathf.cos(Time.time + (id() % 10) * 12, 25f, 0.05f) * Time.delta * elevation;\n"+
"    }\n"+
"\n"+
"    void moveAt(Vec2 vector, float acceleration) {\n"+
"        // target vector\n"+
"        Vec2 t = tmp1.set(vector);\n"+
"        // delta vector\n"+
"        tmp2.set(t).sub(vel).limit(acceleration * vector.len() * Time.delta);\n"+
"        vel.add(tmp2);\n"+
"    }\n"+
"\n"+
"    float floorSpeedMultiplier() {\n"+
"        Floor on = isFlying() || hovering ? Blocks.air.asFloor() : floorOn();\n"+
"        return on.speedMultiplier * speedMultiplier;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        Floor floor = floorOn();\n"+
"        if (isFlying() != wasFlying) {\n"+
"            if (wasFlying) {\n"+
"                if (tileOn() != null) {\n"+
"                    Fx.unitLand.at(x, y, floorOn().isLiquid ? 1f : 0.5f, tileOn().floor().mapColor);\n"+
"                }\n"+
"            }\n"+
"            wasFlying = isFlying();\n"+
"        }\n"+
"        if (!hovering && isGrounded()) {\n"+
"            if ((splashTimer += Mathf.dst(deltaX(), deltaY())) >= (7f + hitSize() / 8f)) {\n"+
"                floor.walkEffect.at(x, y, hitSize() / 8f, floor.mapColor);\n"+
"                splashTimer = 0f;\n"+
"                if (emitWalkSound()) {\n"+
"                    floor.walkSound.at(x, y, Mathf.random(floor.walkSoundPitchMin, floor.walkSoundPitchMax), floor.walkSoundVolume);\n"+
"                }\n"+
"            }\n"+
"        }\n"+
"        updateDrowning();\n"+
"    }\n"+
"\n"+
"    public void updateDrowning() {\n"+
"        Floor floor = drownFloor();\n"+
"        if (floor != null && floor.isLiquid && floor.drownTime > 0) {\n"+
"            lastDrownFloor = floor;\n"+
"            drownTime += Time.delta / floor.drownTime / type.drownTimeMultiplier;\n"+
"            if (Mathf.chanceDelta(0.05f)) {\n"+
"                floor.drownUpdateEffect.at(x, y, hitSize, floor.mapColor);\n"+
"            }\n"+
"            if (drownTime >= 0.999f && !net.client()) {\n"+
"                kill();\n"+
"                Events.fire(new UnitDrownEvent(self()));\n"+
"            }\n"+
"        } else {\n"+
"            drownTime -= Time.delta / 50f;\n"+
"        }\n"+
"        drownTime = Mathf.clamp(drownTime);\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("HealthComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class HealthComp implements Entityc, Posc {\n"+
"\n"+
"    static final float hitDuration = 9f;\n"+
"\n"+
"    float health;\n"+
"\n"+
"    transient float hitTime;\n"+
"\n"+
"    transient float maxHealth = 1f;\n"+
"\n"+
"    transient boolean dead;\n"+
"\n"+
"    boolean isValid() {\n"+
"        return !dead && isAdded();\n"+
"    }\n"+
"\n"+
"    float healthf() {\n"+
"        return health / maxHealth;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        hitTime -= Time.delta / hitDuration;\n"+
"    }\n"+
"\n"+
"    void killed() {\n"+
"        // implement by other components\n"+
"    }\n"+
"\n"+
"    void kill() {\n"+
"        if (dead)\n"+
"            return;\n"+
"        health = Math.min(health, 0);\n"+
"        dead = true;\n"+
"        killed();\n"+
"        remove();\n"+
"    }\n"+
"\n"+
"    void heal() {\n"+
"        dead = false;\n"+
"        health = maxHealth;\n"+
"    }\n"+
"\n"+
"    boolean damaged() {\n"+
"        return health < maxHealth - 0.001f;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Damage and pierce armor.\n"+
"     */\n"+
"    void damagePierce(float amount, boolean withEffect) {\n"+
"        damage(amount, withEffect);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Damage and pierce armor.\n"+
"     */\n"+
"    void damagePierce(float amount) {\n"+
"        damagePierce(amount, true);\n"+
"    }\n"+
"\n"+
"    void damage(float amount) {\n"+
"        health -= amount;\n"+
"        hitTime = 1f;\n"+
"        if (health <= 0 && !dead) {\n"+
"            kill();\n"+
"        }\n"+
"    }\n"+
"\n"+
"    void damage(float amount, boolean withEffect) {\n"+
"        float pre = hitTime;\n"+
"        damage(amount);\n"+
"        if (!withEffect) {\n"+
"            hitTime = pre;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    void damageContinuous(float amount) {\n"+
"        damage(amount * Time.delta, hitTime <= -10 + hitDuration);\n"+
"    }\n"+
"\n"+
"    void damageContinuousPierce(float amount) {\n"+
"        damagePierce(amount * Time.delta, hitTime <= -20 + hitDuration);\n"+
"    }\n"+
"\n"+
"    void clampHealth() {\n"+
"        health = Math.min(health, maxHealth);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Heals by a flat amount.\n"+
"     */\n"+
"    void heal(float amount) {\n"+
"        health += amount;\n"+
"        clampHealth();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Heals by a 0-1 fraction of max health.\n"+
"     */\n"+
"    void healFract(float amount) {\n"+
"        heal(amount * maxHealth);\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("HitboxComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.func.*;\n"+
"import arc.math.*;\n"+
"import arc.math.geom.*;\n"+
"import arc.math.geom.QuadTree.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.entities.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class HitboxComp implements Posc, Sized, QuadTreeObject {\n"+
"\n"+
"    @Import\n"+
"    float x, y;\n"+
"\n"+
"    transient float lastX, lastY, deltaX, deltaY, hitSize;\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void add() {\n"+
"        updateLastPosition();\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void afterRead() {\n"+
"        updateLastPosition();\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public float hitSize() {\n"+
"        return hitSize;\n"+
"    }\n"+
"\n"+
"    void getCollisions(Cons<QuadTree> consumer) {\n"+
"    }\n"+
"\n"+
"    void updateLastPosition() {\n"+
"        deltaX = x - lastX;\n"+
"        deltaY = y - lastY;\n"+
"        lastX = x;\n"+
"        lastY = y;\n"+
"    }\n"+
"\n"+
"    void collision(Hitboxc other, float x, float y) {\n"+
"    }\n"+
"\n"+
"    float deltaLen() {\n"+
"        return Mathf.len(deltaX, deltaY);\n"+
"    }\n"+
"\n"+
"    float deltaAngle() {\n"+
"        return Mathf.angle(deltaX, deltaY);\n"+
"    }\n"+
"\n"+
"    boolean collides(Hitboxc other) {\n"+
"        return true;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void hitbox(Rect rect) {\n"+
"        rect.setCentered(x, y, hitSize, hitSize);\n"+
"    }\n"+
"\n"+
"    public void hitboxTile(Rect rect) {\n"+
"        // tile hitboxes are never bigger than a tile, otherwise units get stuck\n"+
"        float size = Math.min(hitSize * 0.66f, 7.9f);\n"+
"        rect.setCentered(x, y, size, size);\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("ItemsComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.math.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.type.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class ItemsComp implements Posc {\n"+
"\n"+
"    ItemStack stack = new ItemStack();\n"+
"\n"+
"    transient float itemTime;\n"+
"\n"+
"    abstract int itemCapacity();\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        stack.amount = Mathf.clamp(stack.amount, 0, itemCapacity());\n"+
"        itemTime = Mathf.lerpDelta(itemTime, Mathf.num(hasItem()), 0.05f);\n"+
"    }\n"+
"\n"+
"    Item item() {\n"+
"        return stack.item;\n"+
"    }\n"+
"\n"+
"    void clearItem() {\n"+
"        stack.amount = 0;\n"+
"    }\n"+
"\n"+
"    boolean acceptsItem(Item item) {\n"+
"        return !hasItem() || item == stack.item && stack.amount + 1 <= itemCapacity();\n"+
"    }\n"+
"\n"+
"    boolean hasItem() {\n"+
"        return stack.amount > 0;\n"+
"    }\n"+
"\n"+
"    void addItem(Item item) {\n"+
"        addItem(item, 1);\n"+
"    }\n"+
"\n"+
"    void addItem(Item item, int amount) {\n"+
"        stack.amount = stack.item == item ? stack.amount + amount : amount;\n"+
"        stack.item = item;\n"+
"        stack.amount = Mathf.clamp(stack.amount, 0, itemCapacity());\n"+
"    }\n"+
"\n"+
"    int maxAccepted(Item item) {\n"+
"        return stack.item != item && stack.amount > 0 ? 0 : itemCapacity() - stack.amount;\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("LaunchCoreComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.graphics.g2d.*;\n"+
"import arc.math.*;\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.graphics.*;\n"+
"import mindustry.world.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"// @EntityDef(value = LaunchCorec.class, serialize = false)\n"+
"@Component\n"+
"abstract class LaunchCoreComp implements Drawc, Timedc {\n"+
"\n"+
"    @Import\n"+
"    float x, y;\n"+
"\n"+
"    transient Interval in = new Interval();\n"+
"\n"+
"    Block block;\n"+
"\n"+
"    @Override\n"+
"    public void draw() {\n"+
"        float alpha = fout(Interp.pow5Out);\n"+
"        float scale = (1f - alpha) * 1.4f + 1f;\n"+
"        float cx = cx(), cy = cy();\n"+
"        float rotation = fin() * (140f + Mathf.randomSeedRange(id(), 50f));\n"+
"        Draw.z(Layer.effect + 0.001f);\n"+
"        Draw.color(Pal.engine);\n"+
"        float rad = 0.2f + fslope();\n"+
"        float rscl = (block.size - 1) * 0.85f;\n"+
"        Fill.light(cx, cy, 10, 25f * (rad + scale - 1f) * rscl, Tmp.c2.set(Pal.engine).a(alpha), Tmp.c1.set(Pal.engine).a(0f));\n"+
"        Draw.alpha(alpha);\n"+
"        for (int i = 0; i < 4; i++) {\n"+
"            Drawf.tri(cx, cy, 6f * rscl, 40f * (rad + scale - 1f) * rscl, i * 90f + rotation);\n"+
"        }\n"+
"        Draw.color();\n"+
"        Draw.z(Layer.weather - 1);\n"+
"        TextureRegion region = block.fullIcon;\n"+
"        float rw = region.width * Draw.scl * scale, rh = region.height * Draw.scl * scale;\n"+
"        Draw.alpha(alpha);\n"+
"        Draw.rect(region, cx, cy, rw, rh, rotation - 45);\n"+
"        Tmp.v1.trns(225f, fin(Interp.pow3In) * 250f);\n"+
"        Draw.z(Layer.flyingUnit + 1);\n"+
"        Draw.color(0, 0, 0, 0.22f * alpha);\n"+
"        Draw.rect(region, cx + Tmp.v1.x, cy + Tmp.v1.y, rw, rh, rotation - 45);\n"+
"        Draw.reset();\n"+
"    }\n"+
"\n"+
"    float cx() {\n"+
"        return x + fin(Interp.pow2In) * (12f + Mathf.randomSeedRange(id() + 3, 4f));\n"+
"    }\n"+
"\n"+
"    float cy() {\n"+
"        return y + fin(Interp.pow5In) * (100f + Mathf.randomSeedRange(id() + 2, 30f));\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        float r = 4f;\n"+
"        if (in.get(3f - fin() * 2f)) {\n"+
"            Fx.rocketSmokeLarge.at(cx() + Mathf.range(r), cy() + Mathf.range(r), fin());\n"+
"        }\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("LegsComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.math.*;\n"+
"import arc.math.geom.*;\n"+
"import arc.util.*;\n"+
"import mindustry.*;\n"+
"import mindustry.ai.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.entities.*;\n"+
"import mindustry.entities.EntityCollisions.*;\n"+
"import mindustry.game.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.graphics.*;\n"+
"import mindustry.type.*;\n"+
"import mindustry.world.blocks.environment.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class LegsComp implements Posc, Rotc, Hitboxc, Flyingc, Unitc {\n"+
"\n"+
"    @Import\n"+
"    float x, y;\n"+
"\n"+
"    @Import\n"+
"    UnitType type;\n"+
"\n"+
"    @Import\n"+
"    Team team;\n"+
"\n"+
"    transient Leg[] legs = {};\n"+
"\n"+
"    transient float totalLength;\n"+
"\n"+
"    transient float moveSpace;\n"+
"\n"+
"    transient float baseRotation;\n"+
"\n"+
"    transient Floor lastDeepFloor;\n"+
"\n"+
"    @Replace\n"+
"    @Override\n"+
"    public SolidPred solidity() {\n"+
"        return type.allowLegStep ? EntityCollisions::legsSolid : EntityCollisions::solid;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    @Replace\n"+
"    public int pathType() {\n"+
"        return type.allowLegStep ? Pathfinder.costGround : Pathfinder.costLegs;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    @Replace\n"+
"    public Floor drownFloor() {\n"+
"        return lastDeepFloor;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void add() {\n"+
"        resetLegs();\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void unloaded() {\n"+
"        resetLegs(1f);\n"+
"    }\n"+
"\n"+
"    public void resetLegs() {\n"+
"        resetLegs(type.legLength);\n"+
"    }\n"+
"\n"+
"    public void resetLegs(float legLength) {\n"+
"        float rot = baseRotation;\n"+
"        int count = type.legCount;\n"+
"        this.legs = new Leg[count];\n"+
"        float spacing = 360f / count;\n"+
"        for (int i = 0; i < legs.length; i++) {\n"+
"            Leg l = new Leg();\n"+
"            l.joint.trns(i * spacing + rot, legLength / 2f + type.legBaseOffset).add(x, y);\n"+
"            l.base.trns(i * spacing + rot, legLength + type.legBaseOffset).add(x, y);\n"+
"            legs[i] = l;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        if (Mathf.dst(deltaX(), deltaY()) > 0.001f) {\n"+
"            baseRotation = Angles.moveToward(baseRotation, Mathf.angle(deltaX(), deltaY()), type.rotateSpeed);\n"+
"        }\n"+
"        float rot = baseRotation;\n"+
"        float legLength = type.legLength;\n"+
"        // set up initial leg positions\n"+
"        if (legs.length != type.legCount) {\n"+
"            resetLegs();\n"+
"        }\n"+
"        float moveSpeed = type.legSpeed;\n"+
"        int div = Math.max(legs.length / type.legGroupSize, 2);\n"+
"        moveSpace = legLength / 1.6f / (div / 2f) * type.legMoveSpace;\n"+
"        totalLength += Mathf.dst(deltaX(), deltaY());\n"+
"        float trns = moveSpace * 0.85f * type.legTrns;\n"+
"        // rotation + offset vector\n"+
"        Vec2 moveOffset = Tmp.v4.trns(rot, trns);\n"+
"        boolean moving = moving();\n"+
"        lastDeepFloor = null;\n"+
"        int deeps = 0;\n"+
"        for (int i = 0; i < legs.length; i++) {\n"+
"            float dstRot = legAngle(rot, i);\n"+
"            Vec2 baseOffset = Tmp.v5.trns(dstRot, type.legBaseOffset).add(x, y);\n"+
"            Leg l = legs[i];\n"+
"            l.joint.sub(baseOffset).limit(type.maxStretch * legLength / 2f).add(baseOffset);\n"+
"            l.base.sub(baseOffset).limit(type.maxStretch * legLength).add(baseOffset);\n"+
"            float stageF = (totalLength + i * type.legPairOffset) / moveSpace;\n"+
"            int stage = (int) stageF;\n"+
"            int group = stage % div;\n"+
"            boolean move = i % div == group;\n"+
"            boolean side = i < legs.length / 2;\n"+
"            // back legs have reversed directions\n"+
"            boolean backLeg = Math.abs((i + 0.5f) - legs.length / 2f) <= 0.501f;\n"+
"            if (backLeg && type.flipBackLegs)\n"+
"                side = !side;\n"+
"            l.moving = move;\n"+
"            l.stage = moving ? stageF % 1f : Mathf.lerpDelta(l.stage, 0f, 0.1f);\n"+
"            Floor floor = Vars.world.floorWorld(l.base.x, l.base.y);\n"+
"            if (floor.isDeep()) {\n"+
"                deeps++;\n"+
"                lastDeepFloor = floor;\n"+
"            }\n"+
"            if (l.group != group) {\n"+
"                // create effect when transitioning to a group it can\'t move in\n"+
"                if (!move && i % div == l.group) {\n"+
"                    if (floor.isLiquid) {\n"+
"                        floor.walkEffect.at(l.base.x, l.base.y, type.rippleScale, floor.mapColor);\n"+
"                        floor.walkSound.at(x, y, 1f, floor.walkSoundVolume);\n"+
"                    } else {\n"+
"                        Fx.unitLandSmall.at(l.base.x, l.base.y, type.rippleScale, floor.mapColor);\n"+
"                    }\n"+
"                    // shake when legs contact ground\n"+
"                    if (type.landShake > 0) {\n"+
"                        Effect.shake(type.landShake, type.landShake, l.base);\n"+
"                    }\n"+
"                    if (type.legSplashDamage > 0) {\n"+
"                        Damage.damage(team, l.base.x, l.base.y, type.legSplashRange, type.legSplashDamage, false, true);\n"+
"                    }\n"+
"                }\n"+
"                l.group = group;\n"+
"            }\n"+
"            // leg destination\n"+
"            Vec2 legDest = Tmp.v1.trns(dstRot, legLength * type.legLengthScl).add(baseOffset).add(moveOffset);\n"+
"            // join destination\n"+
"            // .trns(rot2, legLength / 2f + type.legBaseOffset).add(moveOffset);\n"+
"            Vec2 jointDest = Tmp.v2;\n"+
"            InverseKinematics.solve(legLength / 2f, legLength / 2f, Tmp.v6.set(l.base).sub(baseOffset), side, jointDest);\n"+
"            jointDest.add(baseOffset);\n"+
"            // lerp between kinematic and linear\n"+
"            jointDest.lerp(Tmp.v6.set(baseOffset).lerp(l.base, 0.5f), 1f - type.kinematicScl);\n"+
"            if (move) {\n"+
"                float moveFract = stageF % 1f;\n"+
"                l.base.lerpDelta(legDest, moveFract);\n"+
"                l.joint.lerpDelta(jointDest, moveFract / 2f);\n"+
"            }\n"+
"            l.joint.lerpDelta(jointDest, moveSpeed / 4f);\n"+
"        }\n"+
"        // when at least 1 leg is touching land, it can\'t drown\n"+
"        if (deeps != legs.length) {\n"+
"            lastDeepFloor = null;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return outwards facing angle of leg at the specified index.\n"+
"     */\n"+
"    float legAngle(float rotation, int index) {\n"+
"        return rotation + 360f / legs.length * index + (360f / legs.length / 2f);\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("MechComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.graphics.*;\n"+
"import arc.math.*;\n"+
"import arc.math.geom.*;\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.entities.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.type.*;\n"+
"import mindustry.world.*;\n"+
"import mindustry.world.blocks.environment.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class MechComp implements Posc, Flyingc, Hitboxc, Unitc, Mechc, ElevationMovec {\n"+
"\n"+
"    @Import\n"+
"    float x, y, hitSize;\n"+
"\n"+
"    @Import\n"+
"    UnitType type;\n"+
"\n"+
"    @SyncField(false)\n"+
"    @SyncLocal\n"+
"    float baseRotation;\n"+
"\n"+
"    transient float walkTime, walkExtension;\n"+
"\n"+
"    transient private boolean walked;\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        // trigger animation only when walking manually\n"+
"        if (walked || net.client()) {\n"+
"            float len = deltaLen();\n"+
"            baseRotation = Angles.moveToward(baseRotation, deltaAngle(), type().baseRotateSpeed * Mathf.clamp(len / type().speed / Time.delta) * Time.delta);\n"+
"            walkTime += len;\n"+
"            walked = false;\n"+
"        }\n"+
"        // update mech effects\n"+
"        float extend = walkExtend(false);\n"+
"        float base = walkExtend(true);\n"+
"        float extendScl = base % 1f;\n"+
"        float lastExtend = walkExtension;\n"+
"        if (extendScl < lastExtend && base % 2f > 1f && !isFlying()) {\n"+
"            int side = -Mathf.sign(extend);\n"+
"            float width = hitSize / 2f * side, length = type.mechStride * 1.35f;\n"+
"            float cx = x + Angles.trnsx(baseRotation, length, width), cy = y + Angles.trnsy(baseRotation, length, width);\n"+
"            if (type.mechStepShake > 0) {\n"+
"                Effect.shake(type.mechStepShake, type.mechStepShake, cx, cy);\n"+
"            }\n"+
"            if (type.mechStepParticles) {\n"+
"                Tile tile = world.tileWorld(cx, cy);\n"+
"                if (tile != null) {\n"+
"                    Color color = tile.floor().mapColor;\n"+
"                    Fx.unitLand.at(cx, cy, hitSize / 8f, color);\n"+
"                }\n"+
"            }\n"+
"        }\n"+
"        walkExtension = extendScl;\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    @Override\n"+
"    @Nullable\n"+
"    public Floor drownFloor() {\n"+
"        // large mechs can only drown when all the nearby floors are deep\n"+
"        if (hitSize >= 12 && canDrown()) {\n"+
"            for (Point2 p : Geometry.d8) {\n"+
"                Floor f = world.floorWorld(x + p.x * tilesize, y + p.y * tilesize);\n"+
"                if (!f.isDeep()) {\n"+
"                    return null;\n"+
"                }\n"+
"            }\n"+
"        }\n"+
"        return canDrown() ? floorOn() : null;\n"+
"    }\n"+
"\n"+
"    public float walkExtend(boolean scaled) {\n"+
"        // now ranges from -maxExtension to maxExtension*3\n"+
"        float raw = walkTime % (type.mechStride * 4);\n"+
"        if (scaled)\n"+
"            return raw / type.mechStride;\n"+
"        if (raw > type.mechStride * 3)\n"+
"            raw = raw - type.mechStride * 4;\n"+
"        else if (raw > type.mechStride * 2)\n"+
"            raw = type.mechStride * 2 - raw;\n"+
"        else if (raw > type.mechStride)\n"+
"            raw = type.mechStride * 2 - raw;\n"+
"        return raw;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    @Replace\n"+
"    public void rotateMove(Vec2 vec) {\n"+
"        // mechs use baseRotation to rotate, not rotation.\n"+
"        moveAt(Tmp.v2.trns(baseRotation, vec.len()));\n"+
"        if (!vec.isZero()) {\n"+
"            baseRotation = Angles.moveToward(baseRotation, vec.angle(), type.rotateSpeed * Math.max(Time.delta, 1));\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void moveAt(Vec2 vector, float acceleration) {\n"+
"        // mark walking state when moving in a controlled manner\n"+
"        if (!vector.isZero()) {\n"+
"            walked = true;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void approach(Vec2 vector) {\n"+
"        // mark walking state when moving in a controlled manner\n"+
"        if (!vector.isZero(0.001f)) {\n"+
"            walked = true;\n"+
"        }\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("MinerComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.*;\n"+
"import arc.graphics.*;\n"+
"import arc.graphics.g2d.*;\n"+
"import arc.math.*;\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.graphics.*;\n"+
"import mindustry.input.*;\n"+
"import mindustry.type.*;\n"+
"import mindustry.world.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class MinerComp implements Itemsc, Posc, Teamc, Rotc, Drawc {\n"+
"\n"+
"    @Import\n"+
"    float x, y, rotation, hitSize;\n"+
"\n"+
"    @Import\n"+
"    UnitType type;\n"+
"\n"+
"    transient float mineTimer;\n"+
"\n"+
"    @Nullable\n"+
"    @SyncLocal\n"+
"    Tile mineTile;\n"+
"\n"+
"    public boolean canMine(Item item) {\n"+
"        return type.mineTier >= item.hardness;\n"+
"    }\n"+
"\n"+
"    public boolean offloadImmediately() {\n"+
"        return this.<Unit>self().isPlayer();\n"+
"    }\n"+
"\n"+
"    boolean mining() {\n"+
"        return mineTile != null && !this.<Unit>self().activelyBuilding();\n"+
"    }\n"+
"\n"+
"    public boolean validMine(Tile tile, boolean checkDst) {\n"+
"        return !(tile == null || tile.block() != Blocks.air || (!within(tile.worldx(), tile.worldy(), type.miningRange) && checkDst) || tile.drop() == null || !canMine(tile.drop()));\n"+
"    }\n"+
"\n"+
"    public boolean validMine(Tile tile) {\n"+
"        return validMine(tile, true);\n"+
"    }\n"+
"\n"+
"    public boolean canMine() {\n"+
"        return type.mineSpeed > 0 && type.mineTier >= 0;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        Building core = closestCore();\n"+
"        if (core != null && mineTile != null && mineTile.drop() != null && !acceptsItem(mineTile.drop()) && within(core, mineTransferRange) && !offloadImmediately()) {\n"+
"            int accepted = core.acceptStack(item(), stack().amount, this);\n"+
"            if (accepted > 0) {\n"+
"                Call.transferItemTo(self(), item(), accepted, mineTile.worldx() + Mathf.range(tilesize / 2f), mineTile.worldy() + Mathf.range(tilesize / 2f), core);\n"+
"                clearItem();\n"+
"            }\n"+
"        }\n"+
"        if ((!net.client() || isLocal()) && !validMine(mineTile)) {\n"+
"            mineTile = null;\n"+
"            mineTimer = 0f;\n"+
"        } else if (mining()) {\n"+
"            Item item = mineTile.drop();\n"+
"            mineTimer += Time.delta * type.mineSpeed;\n"+
"            if (Mathf.chance(0.06 * Time.delta)) {\n"+
"                Fx.pulverizeSmall.at(mineTile.worldx() + Mathf.range(tilesize / 2f), mineTile.worldy() + Mathf.range(tilesize / 2f), 0f, item.color);\n"+
"            }\n"+
"            if (mineTimer >= 50f + item.hardness * 15f) {\n"+
"                mineTimer = 0;\n"+
"                if (state.rules.sector != null && team() == state.rules.defaultTeam)\n"+
"                    state.rules.sector.info.handleProduction(item, 1);\n"+
"                if (core != null && within(core, mineTransferRange) && core.acceptStack(item, 1, this) == 1 && offloadImmediately()) {\n"+
"                    // add item to inventory before it is transferred\n"+
"                    if (item() == item && !net.client())\n"+
"                        addItem(item);\n"+
"                    Call.transferItemTo(self(), item, 1, mineTile.worldx() + Mathf.range(tilesize / 2f), mineTile.worldy() + Mathf.range(tilesize / 2f), core);\n"+
"                } else if (acceptsItem(item)) {\n"+
"                    // this is clientside, since items are synced anyway\n"+
"                    InputHandler.transferItemToUnit(item, mineTile.worldx() + Mathf.range(tilesize / 2f), mineTile.worldy() + Mathf.range(tilesize / 2f), this);\n"+
"                } else {\n"+
"                    mineTile = null;\n"+
"                    mineTimer = 0f;\n"+
"                }\n"+
"            }\n"+
"            if (!headless) {\n"+
"                control.sound.loop(type.mineSound, this, type.mineSoundVolume);\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void draw() {\n"+
"        if (!mining())\n"+
"            return;\n"+
"        float focusLen = hitSize / 2f + Mathf.absin(Time.time, 1.1f, 0.5f);\n"+
"        float swingScl = 12f, swingMag = tilesize / 8f;\n"+
"        float flashScl = 0.3f;\n"+
"        float px = x + Angles.trnsx(rotation, focusLen);\n"+
"        float py = y + Angles.trnsy(rotation, focusLen);\n"+
"        float ex = mineTile.worldx() + Mathf.sin(Time.time + 48, swingScl, swingMag);\n"+
"        float ey = mineTile.worldy() + Mathf.sin(Time.time + 48, swingScl + 2f, swingMag);\n"+
"        Draw.z(Layer.flyingUnit + 0.1f);\n"+
"        Draw.color(Color.lightGray, Color.white, 1f - flashScl + Mathf.absin(Time.time, 0.5f, flashScl));\n"+
"        Drawf.laser(team(), Core.atlas.find(\"minelaser\"), Core.atlas.find(\"minelaser-end\"), px, py, ex, ey, 0.75f);\n"+
"        if (isLocal()) {\n"+
"            Lines.stroke(1f, Pal.accent);\n"+
"            Lines.poly(mineTile.worldx(), mineTile.worldy(), 4, tilesize / 2f * Mathf.sqrt2, Time.time);\n"+
"        }\n"+
"        Draw.color();\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("OwnerComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"class OwnerComp {\n"+
"\n"+
"    Entityc owner;\n"+
"}\n"+
"");
        compMap.put("PayloadComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.*;\n"+
"import arc.math.*;\n"+
"import arc.scene.ui.layout.*;\n"+
"import arc.struct.*;\n"+
"import arc.util.*;\n"+
"import mindustry.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.core.*;\n"+
"import mindustry.entities.*;\n"+
"import mindustry.game.EventType.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.type.*;\n"+
"import mindustry.world.*;\n"+
"import mindustry.world.blocks.payloads.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"/**\n"+
" * An entity that holds a payload.\n"+
" */\n"+
"@Component\n"+
"abstract class PayloadComp implements Posc, Rotc, Hitboxc, Unitc {\n"+
"\n"+
"    @Import\n"+
"    float x, y, rotation;\n"+
"\n"+
"    @Import\n"+
"    UnitType type;\n"+
"\n"+
"    Seq<Payload> payloads = new Seq<>();\n"+
"\n"+
"    float payloadUsed() {\n"+
"        return payloads.sumf(p -> p.size() * p.size());\n"+
"    }\n"+
"\n"+
"    boolean canPickup(Unit unit) {\n"+
"        return payloadUsed() + unit.hitSize * unit.hitSize <= type.payloadCapacity + 0.001f && unit.team == team() && unit.isAI();\n"+
"    }\n"+
"\n"+
"    boolean canPickup(Building build) {\n"+
"        return payloadUsed() + build.block.size * build.block.size * Vars.tilesize * Vars.tilesize <= type.payloadCapacity + 0.001f && build.canPickup();\n"+
"    }\n"+
"\n"+
"    boolean canPickupPayload(Payload pay) {\n"+
"        return payloadUsed() + pay.size() * pay.size() <= type.payloadCapacity + 0.001f;\n"+
"    }\n"+
"\n"+
"    boolean hasPayload() {\n"+
"        return payloads.size > 0;\n"+
"    }\n"+
"\n"+
"    void addPayload(Payload load) {\n"+
"        payloads.add(load);\n"+
"    }\n"+
"\n"+
"    void pickup(Unit unit) {\n"+
"        unit.remove();\n"+
"        payloads.add(new UnitPayload(unit));\n"+
"        Fx.unitPickup.at(unit);\n"+
"        if (Vars.net.client()) {\n"+
"            Vars.netClient.clearRemovedEntity(unit.id);\n"+
"        }\n"+
"        Events.fire(new PickupEvent(self(), unit));\n"+
"    }\n"+
"\n"+
"    void pickup(Building tile) {\n"+
"        tile.pickedUp();\n"+
"        tile.tile.remove();\n"+
"        payloads.add(new BuildPayload(tile));\n"+
"        Fx.unitPickup.at(tile);\n"+
"        Events.fire(new PickupEvent(self(), tile));\n"+
"    }\n"+
"\n"+
"    boolean dropLastPayload() {\n"+
"        if (payloads.isEmpty())\n"+
"            return false;\n"+
"        Payload load = payloads.peek();\n"+
"        if (tryDropPayload(load)) {\n"+
"            payloads.pop();\n"+
"            return true;\n"+
"        }\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    boolean tryDropPayload(Payload payload) {\n"+
"        Tile on = tileOn();\n"+
"        UnitPayload u;\n"+
"        // clear removed state of unit so it can be synced\n"+
"        if (Vars.net.client() && (payload instanceof UnitPayload && (u = (UnitPayload) payload) == payload)) {\n"+
"            Vars.netClient.clearRemovedEntity(u.unit.id);\n"+
"        }\n"+
"        // drop off payload on an acceptor if possible\n"+
"        if (on != null && on.build != null && on.build.acceptPayload(on.build, payload)) {\n"+
"            Fx.unitDrop.at(on.build);\n"+
"            on.build.handlePayload(on.build, payload);\n"+
"            return true;\n"+
"        }\n"+
"        BuildPayload b;\n"+
"        UnitPayload p;\n"+
"        if ((payload instanceof BuildPayload && (b = (BuildPayload) payload) == payload)) {\n"+
"            return dropBlock(b);\n"+
"        } else if ((payload instanceof UnitPayload && (p = (UnitPayload) payload) == payload)) {\n"+
"            return dropUnit(p);\n"+
"        }\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    boolean dropUnit(UnitPayload payload) {\n"+
"        Unit u = payload.unit;\n"+
"        // can\'t drop ground units\n"+
"        if (!u.canPass(tileX(), tileY()) || Units.count(x, y, u.physicSize(), o -> o.isGrounded()) > 1) {\n"+
"            return false;\n"+
"        }\n"+
"        Fx.unitDrop.at(this);\n"+
"        // clients do not drop payloads\n"+
"        if (Vars.net.client())\n"+
"            return true;\n"+
"        u.set(this);\n"+
"        u.trns(Tmp.v1.rnd(Mathf.random(2f)));\n"+
"        u.rotation(rotation);\n"+
"        // reset the ID to a new value to make sure it\'s synced\n"+
"        u.id = EntityGroup.nextId();\n"+
"        // decrement count to prevent double increment\n"+
"        if (!u.isAdded())\n"+
"            u.team.data().updateCount(u.type, -1);\n"+
"        u.add();\n"+
"        u.unloaded();\n"+
"        return true;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return whether the tile has been successfully placed.\n"+
"     */\n"+
"    boolean dropBlock(BuildPayload payload) {\n"+
"        Building tile = payload.build;\n"+
"        int tx = World.toTile(x - tile.block.offset), ty = World.toTile(y - tile.block.offset);\n"+
"        Tile on = Vars.world.tile(tx, ty);\n"+
"        if (on != null && Build.validPlace(tile.block, tile.team, tx, ty, tile.rotation, false)) {\n"+
"            int rot = (int) ((rotation + 45f) / 90f) % 4;\n"+
"            payload.place(on, rot);\n"+
"            if (getControllerName() != null) {\n"+
"                payload.build.lastAccessed = getControllerName();\n"+
"            }\n"+
"            Fx.unitDrop.at(tile);\n"+
"            Fx.placeBlock.at(on.drawx(), on.drawy(), on.block().size);\n"+
"            return true;\n"+
"        }\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    void contentInfo(Table table, float itemSize, float width) {\n"+
"        table.clear();\n"+
"        table.top().left();\n"+
"        float pad = 0;\n"+
"        float items = payloads.size;\n"+
"        if (itemSize * items + pad * items > width) {\n"+
"            pad = (width - (itemSize) * items) / items;\n"+
"        }\n"+
"        for (Payload p : payloads) {\n"+
"            table.image(p.icon()).size(itemSize).padRight(pad);\n"+
"        }\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("PhysicsComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.math.*;\n"+
"import arc.math.geom.*;\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.async.PhysicsProcess.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"/**\n"+
" * Affected by physics.\n"+
" * Will bounce off of other objects that are at similar elevations.\n"+
" * Has mass.\n"+
" */\n"+
"@Component\n"+
"abstract class PhysicsComp implements Velc, Hitboxc, Flyingc {\n"+
"\n"+
"    @Import\n"+
"    float hitSize, x, y;\n"+
"\n"+
"    @Import\n"+
"    Vec2 vel;\n"+
"\n"+
"    transient PhysicRef physref;\n"+
"\n"+
"    // mass is simply the area of this object\n"+
"    float mass() {\n"+
"        return hitSize * hitSize * Mathf.pi;\n"+
"    }\n"+
"\n"+
"    void impulse(float x, float y) {\n"+
"        float mass = mass();\n"+
"        vel.add(x / mass, y / mass);\n"+
"    }\n"+
"\n"+
"    void impulse(Vec2 v) {\n"+
"        impulse(v.x, v.y);\n"+
"    }\n"+
"\n"+
"    void impulseNet(Vec2 v) {\n"+
"        impulse(v.x, v.y);\n"+
"        // manually move units to simulate velocity for remote players\n"+
"        if (isRemote()) {\n"+
"            float mass = mass();\n"+
"            move(v.x / mass, v.y / mass);\n"+
"        }\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("PlayerComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.*;\n"+
"import arc.graphics.*;\n"+
"import arc.graphics.g2d.*;\n"+
"import arc.math.*;\n"+
"import arc.scene.ui.layout.*;\n"+
"import arc.util.*;\n"+
"import arc.util.pooling.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.entities.units.*;\n"+
"import mindustry.game.EventType.*;\n"+
"import mindustry.game.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.graphics.*;\n"+
"import mindustry.net.Administration.*;\n"+
"import mindustry.net.*;\n"+
"import mindustry.net.Packets.*;\n"+
"import mindustry.ui.*;\n"+
"import mindustry.world.blocks.storage.*;\n"+
"import mindustry.world.blocks.storage.CoreBlock.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"// @EntityDef(value = { Playerc.class }, serialize = false)\n"+
"@Component(base = true)\n"+
"abstract class PlayerComp implements UnitController, Entityc, Syncc, Timerc, Drawc {\n"+
"\n"+
"    static final float deathDelay = 60f;\n"+
"\n"+
"    @Import\n"+
"    float x, y;\n"+
"\n"+
"    @ReadOnly\n"+
"    Unit unit = Nulls.unit;\n"+
"\n"+
"    @Nullable\n"+
"    transient NetConnection con;\n"+
"\n"+
"    @ReadOnly\n"+
"    Team team = Team.sharded;\n"+
"\n"+
"    @SyncLocal\n"+
"    boolean typing, shooting, boosting;\n"+
"\n"+
"    @SyncLocal\n"+
"    float mouseX, mouseY;\n"+
"\n"+
"    boolean admin;\n"+
"\n"+
"    String name = \"frog\";\n"+
"\n"+
"    Color color = new Color();\n"+
"\n"+
"    transient String locale = \"en\";\n"+
"\n"+
"    transient float deathTimer;\n"+
"\n"+
"    transient String lastText = \"\";\n"+
"\n"+
"    transient float textFadeTime;\n"+
"\n"+
"    transient private Unit lastReadUnit = Nulls.unit;\n"+
"\n"+
"    transient private int wrongReadUnits;\n"+
"\n"+
"    @Nullable\n"+
"    transient Unit justSwitchFrom, justSwitchTo;\n"+
"\n"+
"    public boolean isBuilder() {\n"+
"        return unit.canBuild();\n"+
"    }\n"+
"\n"+
"    @Nullable\n"+
"    public CoreBuild closestCore() {\n"+
"        return state.teams.closestCore(x, y, team);\n"+
"    }\n"+
"\n"+
"    @Nullable\n"+
"    public CoreBuild core() {\n"+
"        return team.core();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return largest/closest core, with largest cores getting priority\n"+
"     */\n"+
"    @Nullable\n"+
"    public CoreBuild bestCore() {\n"+
"        return team.cores().min(Structs.comps(Structs.comparingInt(c -> -c.block.size), Structs.comparingFloat(c -> c.dst(x, y))));\n"+
"    }\n"+
"\n"+
"    public TextureRegion icon() {\n"+
"        // display default icon for dead players\n"+
"        if (dead())\n"+
"            return core() == null ? UnitTypes.alpha.fullIcon : ((CoreBlock) bestCore().block).unitType.fullIcon;\n"+
"        return unit.icon();\n"+
"    }\n"+
"\n"+
"    public boolean displayAmmo() {\n"+
"        return unit instanceof BlockUnitc || state.rules.unitAmmo;\n"+
"    }\n"+
"\n"+
"    public void reset() {\n"+
"        team = state.rules.defaultTeam;\n"+
"        admin = typing = false;\n"+
"        textFadeTime = 0f;\n"+
"        x = y = 0f;\n"+
"        if (!dead()) {\n"+
"            unit.controller(unit.type.createController());\n"+
"            unit = Nulls.unit;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public boolean isValidController() {\n"+
"        return isAdded();\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    public float clipSize() {\n"+
"        return unit.isNull() ? 20 : unit.type.hitSize * 2f;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void afterSync() {\n"+
"        // fix rubberbanding:\n"+
"        // when the player recs a unit that they JUST transitioned away from, use the new unit instead\n"+
"        // reason: we know the server is lying here, essentially skip the unit snapshot because we know the client\'s information is more recent\n"+
"        if (isLocal() && unit == justSwitchFrom && justSwitchFrom != null && justSwitchTo != null) {\n"+
"            unit = justSwitchTo;\n"+
"            // if several snapshots have passed and this unit is still incorrect, something\'s wrong\n"+
"            if (++wrongReadUnits >= 2) {\n"+
"                justSwitchFrom = null;\n"+
"                wrongReadUnits = 0;\n"+
"            }\n"+
"        } else {\n"+
"            justSwitchFrom = null;\n"+
"            justSwitchTo = null;\n"+
"            wrongReadUnits = 0;\n"+
"        }\n"+
"        // simulate a unit change after sync\n"+
"        Unit set = unit;\n"+
"        unit = lastReadUnit;\n"+
"        unit(set);\n"+
"        lastReadUnit = unit;\n"+
"        unit.aim(mouseX, mouseY);\n"+
"        // this is only necessary when the thing being controlled isn\'t synced\n"+
"        unit.controlWeapons(shooting, shooting);\n"+
"        // save previous formation to prevent reset\n"+
"        var formation = unit.formation;\n"+
"        // extra precaution, necessary for non-synced things\n"+
"        unit.controller(this);\n"+
"        // keep previous formation\n"+
"        unit.formation = formation;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        if (!unit.isValid()) {\n"+
"            clearUnit();\n"+
"        }\n"+
"        CoreBuild core;\n"+
"        if (!dead()) {\n"+
"            set(unit);\n"+
"            unit.team(team);\n"+
"            deathTimer = 0;\n"+
"            // update some basic state to sync things\n"+
"            if (unit.type.canBoost) {\n"+
"                unit.elevation = Mathf.approachDelta(unit.elevation, unit.onSolid() || boosting || (unit.isFlying() && !unit.canLand()) ? 1f : 0f, unit.type.riseSpeed);\n"+
"            }\n"+
"        } else if ((core = bestCore()) != null) {\n"+
"            // have a small delay before death to prevent the camera from jumping around too quickly\n"+
"            // (this is not for balance, it just looks better this way)\n"+
"            deathTimer += Time.delta;\n"+
"            if (deathTimer >= deathDelay) {\n"+
"                // request spawn - this happens serverside only\n"+
"                core.requestSpawn(self());\n"+
"                deathTimer = 0;\n"+
"            }\n"+
"        }\n"+
"        textFadeTime -= Time.delta / (60 * 5);\n"+
"    }\n"+
"\n"+
"    public void checkSpawn() {\n"+
"        CoreBuild core = bestCore();\n"+
"        if (core != null) {\n"+
"            core.requestSpawn(self());\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void remove() {\n"+
"        // clear unit upon removal\n"+
"        if (!unit.isNull()) {\n"+
"            clearUnit();\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public void team(Team team) {\n"+
"        this.team = team;\n"+
"        unit.team(team);\n"+
"    }\n"+
"\n"+
"    public void clearUnit() {\n"+
"        unit(Nulls.unit);\n"+
"    }\n"+
"\n"+
"    public Unit unit() {\n"+
"        return unit;\n"+
"    }\n"+
"\n"+
"    public void unit(Unit unit) {\n"+
"        // refuse to switch when the unit was just transitioned from\n"+
"        if (isLocal() && unit == justSwitchFrom && justSwitchFrom != null && justSwitchTo != null) {\n"+
"            return;\n"+
"        }\n"+
"        if (unit == null)\n"+
"            throw new IllegalArgumentException(\"Unit cannot be null. Use clearUnit() instead.\");\n"+
"        if (this.unit == unit)\n"+
"            return;\n"+
"        if (this.unit != Nulls.unit) {\n"+
"            // un-control the old unit\n"+
"            this.unit.controller(this.unit.type.createController());\n"+
"        }\n"+
"        this.unit = unit;\n"+
"        if (unit != Nulls.unit) {\n"+
"            unit.team(team);\n"+
"            unit.controller(this);\n"+
"            // this player just became remote, snap the interpolation so it doesn\'t go wild\n"+
"            if (unit.isRemote()) {\n"+
"                unit.snapInterpolation();\n"+
"            }\n"+
"            // reset selected block when switching units\n"+
"            if (!headless && isLocal()) {\n"+
"                control.input.block = null;\n"+
"            }\n"+
"        }\n"+
"        Events.fire(new UnitChangeEvent(self(), unit));\n"+
"    }\n"+
"\n"+
"    boolean dead() {\n"+
"        return unit.isNull() || !unit.isValid();\n"+
"    }\n"+
"\n"+
"    String ip() {\n"+
"        return con == null ? \"localhost\" : con.address;\n"+
"    }\n"+
"\n"+
"    String uuid() {\n"+
"        return con == null ? \"[LOCAL]\" : con.uuid;\n"+
"    }\n"+
"\n"+
"    String usid() {\n"+
"        return con == null ? \"[LOCAL]\" : con.usid;\n"+
"    }\n"+
"\n"+
"    void kick(KickReason reason) {\n"+
"        con.kick(reason);\n"+
"    }\n"+
"\n"+
"    void kick(KickReason reason, long duration) {\n"+
"        con.kick(reason, duration);\n"+
"    }\n"+
"\n"+
"    void kick(String reason) {\n"+
"        con.kick(reason);\n"+
"    }\n"+
"\n"+
"    void kick(String reason, long duration) {\n"+
"        con.kick(reason, duration);\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void draw() {\n"+
"        Draw.z(Layer.playerName);\n"+
"        float z = Drawf.text();\n"+
"        Font font = Fonts.def;\n"+
"        GlyphLayout layout = Pools.obtain(GlyphLayout.class, GlyphLayout::new);\n"+
"        final float nameHeight = 11;\n"+
"        final float textHeight = 15;\n"+
"        boolean ints = font.usesIntegerPositions();\n"+
"        font.setUseIntegerPositions(false);\n"+
"        font.getData().setScale(0.25f / Scl.scl(1f));\n"+
"        layout.setText(font, name);\n"+
"        if (!isLocal()) {\n"+
"            Draw.color(0f, 0f, 0f, 0.3f);\n"+
"            Fill.rect(unit.x, unit.y + nameHeight - layout.height / 2, layout.width + 2, layout.height + 3);\n"+
"            Draw.color();\n"+
"            font.setColor(color);\n"+
"            font.draw(name, unit.x, unit.y + nameHeight, 0, Align.center, false);\n"+
"            if (admin) {\n"+
"                float s = 3f;\n"+
"                Draw.color(color.r * 0.5f, color.g * 0.5f, color.b * 0.5f, 1f);\n"+
"                Draw.rect(Icon.adminSmall.getRegion(), unit.x + layout.width / 2f + 2 + 1, unit.y + nameHeight - 1.5f, s, s);\n"+
"                Draw.color(color);\n"+
"                Draw.rect(Icon.adminSmall.getRegion(), unit.x + layout.width / 2f + 2 + 1, unit.y + nameHeight - 1f, s, s);\n"+
"            }\n"+
"        }\n"+
"        if (Core.settings.getBool(\"playerchat\") && ((textFadeTime > 0 && lastText != null) || typing)) {\n"+
"            String text = textFadeTime <= 0 || lastText == null ? \"[lightgray]\" + Strings.animated(Time.time, 4, 15f, \".\") : lastText;\n"+
"            float width = 100f;\n"+
"            float visualFadeTime = 1f - Mathf.curve(1f - textFadeTime, 0.9f);\n"+
"            font.setColor(1f, 1f, 1f, textFadeTime <= 0 || lastText == null ? 1f : visualFadeTime);\n"+
"            layout.setText(font, text, Color.white, width, Align.bottom, true);\n"+
"            Draw.color(0f, 0f, 0f, 0.3f * (textFadeTime <= 0 || lastText == null ? 1f : visualFadeTime));\n"+
"            Fill.rect(unit.x, unit.y + textHeight + layout.height - layout.height / 2f, layout.width + 2, layout.height + 3);\n"+
"            font.draw(text, unit.x - width / 2f, unit.y + textHeight + layout.height, width, Align.center, true);\n"+
"        }\n"+
"        Draw.reset();\n"+
"        Pools.free(layout);\n"+
"        font.getData().setScale(1f);\n"+
"        font.setColor(Color.white);\n"+
"        font.setUseIntegerPositions(ints);\n"+
"        Draw.z(z);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return name with a markup color prefix\n"+
"     */\n"+
"    String coloredName() {\n"+
"        return \"[#\" + color.toString().toUpperCase() + \"]\" + name;\n"+
"    }\n"+
"\n"+
"    void sendMessage(String text) {\n"+
"        if (isLocal()) {\n"+
"            if (ui != null) {\n"+
"                ui.chatfrag.addMessage(text);\n"+
"            }\n"+
"        } else {\n"+
"            Call.sendMessage(con, text, null, null);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    void sendMessage(String text, Player from) {\n"+
"        sendMessage(text, from, null);\n"+
"    }\n"+
"\n"+
"    void sendMessage(String text, Player from, String unformatted) {\n"+
"        if (isLocal()) {\n"+
"            if (ui != null) {\n"+
"                ui.chatfrag.addMessage(text);\n"+
"            }\n"+
"        } else {\n"+
"            Call.sendMessage(con, text, unformatted, from);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    PlayerInfo getInfo() {\n"+
"        if (isLocal()) {\n"+
"            throw new IllegalArgumentException(\"Local players cannot be traced and do not have info.\");\n"+
"        } else {\n"+
"            return netServer.admins.getInfo(uuid());\n"+
"        }\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("PosComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.math.geom.*;\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.core.*;\n"+
"import mindustry.world.*;\n"+
"import mindustry.world.blocks.environment.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class PosComp implements Position {\n"+
"\n"+
"    @SyncField(true)\n"+
"    @SyncLocal\n"+
"    float x, y;\n"+
"\n"+
"    void set(float x, float y) {\n"+
"        this.x = x;\n"+
"        this.y = y;\n"+
"    }\n"+
"\n"+
"    void set(Position pos) {\n"+
"        set(pos.getX(), pos.getY());\n"+
"    }\n"+
"\n"+
"    void trns(float x, float y) {\n"+
"        set(this.x + x, this.y + y);\n"+
"    }\n"+
"\n"+
"    void trns(Position pos) {\n"+
"        trns(pos.getX(), pos.getY());\n"+
"    }\n"+
"\n"+
"    int tileX() {\n"+
"        return World.toTile(x);\n"+
"    }\n"+
"\n"+
"    int tileY() {\n"+
"        return World.toTile(y);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Returns air if this unit is on a non-air top block.\n"+
"     */\n"+
"    Floor floorOn() {\n"+
"        Tile tile = tileOn();\n"+
"        return tile == null || tile.block() != Blocks.air ? (Floor) Blocks.air : tile.floor();\n"+
"    }\n"+
"\n"+
"    Block blockOn() {\n"+
"        Tile tile = tileOn();\n"+
"        return tile == null ? Blocks.air : tile.block();\n"+
"    }\n"+
"\n"+
"    boolean onSolid() {\n"+
"        Tile tile = tileOn();\n"+
"        return tile == null || tile.solid();\n"+
"    }\n"+
"\n"+
"    @Nullable\n"+
"    Tile tileOn() {\n"+
"        return world.tileWorld(x, y);\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public float getX() {\n"+
"        return x;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public float getY() {\n"+
"        return y;\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("PosTeamDef","package mma.entities.compByAnuke;\n"+
"\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"// dummy target definition\n"+
"// @EntityDef(value = Teamc.class, genio = false, isFinal = false)\n"+
"public class PosTeamDef {\n"+
"}\n"+
"");
        compMap.put("PuddleComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.func.*;\n"+
"import arc.graphics.*;\n"+
"import arc.graphics.g2d.*;\n"+
"import arc.math.*;\n"+
"import arc.math.geom.*;\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.entities.*;\n"+
"import mindustry.game.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.graphics.*;\n"+
"import mindustry.type.*;\n"+
"import mindustry.world.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.entities.Puddles.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"// @EntityDef(value = { Puddlec.class }, pooled = true)\n"+
"@Component(base = true)\n"+
"abstract class PuddleComp implements Posc, Puddlec, Drawc {\n"+
"\n"+
"    private static final Rect rect = new Rect(), rect2 = new Rect();\n"+
"\n"+
"    private static int seeds;\n"+
"\n"+
"    private static Puddle paramPuddle;\n"+
"\n"+
"    private static Cons<Unit> unitCons = unit -> {\n"+
"        if (unit.isGrounded() && !unit.hovering) {\n"+
"            unit.hitbox(rect2);\n"+
"            if (rect.overlaps(rect2)) {\n"+
"                unit.apply(paramPuddle.liquid.effect, 60 * 2);\n"+
"                if (unit.vel.len2() > 0.1f * 0.1f) {\n"+
"                    Fx.ripple.at(unit.x, unit.y, unit.type.rippleScale, paramPuddle.liquid.color);\n"+
"                }\n"+
"            }\n"+
"        }\n"+
"    };\n"+
"\n"+
"    @Import\n"+
"    int id;\n"+
"\n"+
"    @Import\n"+
"    float x, y;\n"+
"\n"+
"    @Import\n"+
"    boolean added;\n"+
"\n"+
"    transient float accepting, updateTime, lastRipple = Time.time + Mathf.random(40f);\n"+
"\n"+
"    float amount;\n"+
"\n"+
"    Tile tile;\n"+
"\n"+
"    Liquid liquid;\n"+
"\n"+
"    public float getFlammability() {\n"+
"        return liquid.flammability * amount;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        float addSpeed = accepting > 0 ? 3f : 0f;\n"+
"        amount -= Time.delta * (1f - liquid.viscosity) / (5f + addSpeed);\n"+
"        amount += accepting;\n"+
"        accepting = 0f;\n"+
"        if (amount >= maxLiquid / 1.5f) {\n"+
"            float deposited = Math.min((amount - maxLiquid / 1.5f) / 4f, 0.3f * Time.delta);\n"+
"            int targets = 0;\n"+
"            for (Point2 point : Geometry.d4) {\n"+
"                Tile other = world.tile(tile.x + point.x, tile.y + point.y);\n"+
"                if (other != null && other.block() == Blocks.air) {\n"+
"                    targets++;\n"+
"                    Puddles.deposit(other, tile, liquid, deposited, false);\n"+
"                }\n"+
"            }\n"+
"            amount -= deposited * targets;\n"+
"        }\n"+
"        amount = Mathf.clamp(amount, 0, maxLiquid);\n"+
"        if (amount <= 0f) {\n"+
"            remove();\n"+
"            return;\n"+
"        }\n"+
"        if (Puddles.get(tile) != self() && added) {\n"+
"            // force removal without pool free\n"+
"            Groups.all.remove(self());\n"+
"            Groups.draw.remove(self());\n"+
"            Groups.puddle.remove(self());\n"+
"            added = false;\n"+
"            return;\n"+
"        }\n"+
"        // effects-only code\n"+
"        if (amount >= maxLiquid / 2f && updateTime <= 0f) {\n"+
"            paramPuddle = self();\n"+
"            Units.nearby(rect.setSize(Mathf.clamp(amount / (maxLiquid / 1.5f)) * 10f).setCenter(x, y), unitCons);\n"+
"            if (liquid.temperature > 0.7f && tile.build != null && Mathf.chance(0.5)) {\n"+
"                Fires.create(tile);\n"+
"            }\n"+
"            updateTime = 40f;\n"+
"        }\n"+
"        updateTime -= Time.delta;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void draw() {\n"+
"        Draw.z(Layer.debris - 1);\n"+
"        seeds = id;\n"+
"        boolean onLiquid = tile.floor().isLiquid;\n"+
"        float f = Mathf.clamp(amount / (maxLiquid / 1.5f));\n"+
"        float smag = onLiquid ? 0.8f : 0f;\n"+
"        float sscl = 25f;\n"+
"        Draw.color(Tmp.c1.set(liquid.color).shiftValue(-0.05f));\n"+
"        Fill.circle(x + Mathf.sin(Time.time + seeds * 532, sscl, smag), y + Mathf.sin(Time.time + seeds * 53, sscl, smag), f * 8f);\n"+
"        Angles.randLenVectors(id(), 3, f * 6f, (ex, ey) -> {\n"+
"            Fill.circle(x + ex + Mathf.sin(Time.time + seeds * 532, sscl, smag), y + ey + Mathf.sin(Time.time + seeds * 53, sscl, smag), f * 5f);\n"+
"            seeds++;\n"+
"        });\n"+
"        Draw.color();\n"+
"        if (liquid.lightColor.a > 0.001f && f > 0) {\n"+
"            Color color = liquid.lightColor;\n"+
"            float opacity = color.a * f;\n"+
"            Drawf.light(Team.derelict, tile.drawx(), tile.drawy(), 30f * f, color, opacity * 0.8f);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    public float clipSize() {\n"+
"        return 20;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void remove() {\n"+
"        Puddles.remove(tile);\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void afterRead() {\n"+
"        Puddles.register(self());\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("RotComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class RotComp implements Entityc {\n"+
"\n"+
"    @SyncField(false)\n"+
"    @SyncLocal\n"+
"    float rotation;\n"+
"}\n"+
"");
        compMap.put("ShieldComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.game.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class ShieldComp implements Healthc, Posc {\n"+
"\n"+
"    @Import\n"+
"    float health, hitTime, x, y, healthMultiplier;\n"+
"\n"+
"    @Import\n"+
"    boolean dead;\n"+
"\n"+
"    @Import\n"+
"    Team team;\n"+
"\n"+
"    /**\n"+
"     * Absorbs health damage.\n"+
"     */\n"+
"    float shield;\n"+
"\n"+
"    /**\n"+
"     * Subtracts an amount from damage. No need to save.\n"+
"     */\n"+
"    transient float armor;\n"+
"\n"+
"    /**\n"+
"     * Shield opacity.\n"+
"     */\n"+
"    transient float shieldAlpha = 0f;\n"+
"\n"+
"    @Replace\n"+
"    @Override\n"+
"    public void damage(float amount) {\n"+
"        // apply armor\n"+
"        amount = Math.max(amount - armor, minArmorDamage * amount);\n"+
"        amount /= healthMultiplier;\n"+
"        rawDamage(amount);\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    @Override\n"+
"    public void damagePierce(float amount, boolean withEffect) {\n"+
"        float pre = hitTime;\n"+
"        rawDamage(amount);\n"+
"        if (!withEffect) {\n"+
"            hitTime = pre;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    private void rawDamage(float amount) {\n"+
"        boolean hadShields = shield > 0.0001f;\n"+
"        if (hadShields) {\n"+
"            shieldAlpha = 1f;\n"+
"        }\n"+
"        float shieldDamage = Math.min(Math.max(shield, 0), amount);\n"+
"        shield -= shieldDamage;\n"+
"        hitTime = 1f;\n"+
"        amount -= shieldDamage;\n"+
"        if (amount > 0) {\n"+
"            health -= amount;\n"+
"            if (health <= 0 && !dead) {\n"+
"                kill();\n"+
"            }\n"+
"            if (hadShields && shield <= 0.0001f) {\n"+
"                Fx.unitShieldBreak.at(x, y, 0, team.color, this);\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        shieldAlpha -= Time.delta / 15f;\n"+
"        if (shieldAlpha < 0)\n"+
"            shieldAlpha = 0f;\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("ShielderComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class ShielderComp implements Damagec, Teamc, Posc {\n"+
"\n"+
"    void absorb() {\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("StatusComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.graphics.*;\n"+
"import arc.struct.*;\n"+
"import arc.util.*;\n"+
"import arc.util.pooling.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.ctype.*;\n"+
"import mindustry.entities.units.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.type.*;\n"+
"import mindustry.world.blocks.environment.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class StatusComp implements Posc, Flyingc {\n"+
"\n"+
"    private Seq<StatusEntry> statuses = new Seq<>();\n"+
"\n"+
"    private transient Bits applied = new Bits(content.getBy(ContentType.status).size);\n"+
"\n"+
"    // these are considered read-only\n"+
"    transient float speedMultiplier = 1, damageMultiplier = 1, healthMultiplier = 1, reloadMultiplier = 1, buildSpeedMultiplier = 1, dragMultiplier = 1;\n"+
"\n"+
"    transient boolean disarmed = false;\n"+
"\n"+
"    @Import\n"+
"    UnitType type;\n"+
"\n"+
"    /**\n"+
"     * Apply a status effect for 1 tick (for permanent effects) *\n"+
"     */\n"+
"    void apply(StatusEffect effect) {\n"+
"        apply(effect, 1);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Adds a status effect to this unit.\n"+
"     */\n"+
"    void apply(StatusEffect effect, float duration) {\n"+
"        // don\'t apply empty or immune effects\n"+
"        if (effect == StatusEffects.none || effect == null || isImmune(effect))\n"+
"            return;\n"+
"        // unlock status effects regardless of whether they were applied to friendly units\n"+
"        if (state.isCampaign()) {\n"+
"            effect.unlock();\n"+
"        }\n"+
"        if (statuses.size > 0) {\n"+
"            // check for opposite effects\n"+
"            for (int i = 0; i < statuses.size; i++) {\n"+
"                StatusEntry entry = statuses.get(i);\n"+
"                // extend effect\n"+
"                if (entry.effect == effect) {\n"+
"                    entry.time = Math.max(entry.time, duration);\n"+
"                    return;\n"+
"                } else if (entry.effect.applyTransition(self(), effect, entry, duration)) {\n"+
"                    // find reaction\n"+
"                    // TODO effect may react with multiple other effects\n"+
"                    // stop looking when one is found\n"+
"                    return;\n"+
"                }\n"+
"            }\n"+
"        }\n"+
"        if (!effect.reactive) {\n"+
"            // otherwise, no opposites found, add direct effect\n"+
"            StatusEntry entry = Pools.obtain(StatusEntry.class, StatusEntry::new);\n"+
"            entry.set(effect, duration);\n"+
"            statuses.add(entry);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    float getDuration(StatusEffect effect) {\n"+
"        var entry = statuses.find(e -> e.effect == effect);\n"+
"        return entry == null ? 0 : entry.time;\n"+
"    }\n"+
"\n"+
"    void clearStatuses() {\n"+
"        statuses.clear();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Removes a status effect.\n"+
"     */\n"+
"    void unapply(StatusEffect effect) {\n"+
"        statuses.remove(e -> {\n"+
"            if (e.effect == effect) {\n"+
"                Pools.free(e);\n"+
"                return true;\n"+
"            }\n"+
"            return false;\n"+
"        });\n"+
"    }\n"+
"\n"+
"    boolean isBoss() {\n"+
"        return hasEffect(StatusEffects.boss);\n"+
"    }\n"+
"\n"+
"    abstract boolean isImmune(StatusEffect effect);\n"+
"\n"+
"    Color statusColor() {\n"+
"        if (statuses.size == 0) {\n"+
"            return Tmp.c1.set(Color.white);\n"+
"        }\n"+
"        float r = 1f, g = 1f, b = 1f, total = 0f;\n"+
"        for (StatusEntry entry : statuses) {\n"+
"            float intensity = entry.time < 10f ? entry.time / 10f : 1f;\n"+
"            r += entry.effect.color.r * intensity;\n"+
"            g += entry.effect.color.g * intensity;\n"+
"            b += entry.effect.color.b * intensity;\n"+
"            total += intensity;\n"+
"        }\n"+
"        float count = statuses.size + total;\n"+
"        return Tmp.c1.set(r / count, g / count, b / count, 1f);\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        Floor floor = floorOn();\n"+
"        if (isGrounded() && !type.hovering) {\n"+
"            // apply effect\n"+
"            apply(floor.status, floor.statusDuration);\n"+
"        }\n"+
"        applied.clear();\n"+
"        speedMultiplier = damageMultiplier = healthMultiplier = reloadMultiplier = buildSpeedMultiplier = dragMultiplier = 1f;\n"+
"        disarmed = false;\n"+
"        if (statuses.isEmpty())\n"+
"            return;\n"+
"        int index = 0;\n"+
"        while (index < statuses.size) {\n"+
"            StatusEntry entry = statuses.get(index++);\n"+
"            entry.time = Math.max(entry.time - Time.delta, 0);\n"+
"            if (entry.effect == null || (entry.time <= 0 && !entry.effect.permanent)) {\n"+
"                Pools.free(entry);\n"+
"                index--;\n"+
"                statuses.remove(index);\n"+
"            } else {\n"+
"                applied.set(entry.effect.id);\n"+
"                speedMultiplier *= entry.effect.speedMultiplier;\n"+
"                healthMultiplier *= entry.effect.healthMultiplier;\n"+
"                damageMultiplier *= entry.effect.damageMultiplier;\n"+
"                reloadMultiplier *= entry.effect.reloadMultiplier;\n"+
"                buildSpeedMultiplier *= entry.effect.buildSpeedMultiplier;\n"+
"                dragMultiplier *= entry.effect.dragMultiplier;\n"+
"                disarmed |= entry.effect.disarm;\n"+
"                entry.effect.update(self(), entry.time);\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public Bits statusBits() {\n"+
"        return applied;\n"+
"    }\n"+
"\n"+
"    public void draw() {\n"+
"        for (StatusEntry e : statuses) {\n"+
"            e.effect.draw(self(), e.time);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    boolean hasEffect(StatusEffect effect) {\n"+
"        return applied.get(effect.id);\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("SyncComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.util.io.*;\n"+
"import mindustry.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.gen.*;\n"+
"import java.nio.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class SyncComp implements Entityc {\n"+
"\n"+
"    transient long lastUpdated, updateSpacing;\n"+
"\n"+
"    // all these method bodies are internally generated\n"+
"    void snapSync() {\n"+
"    }\n"+
"\n"+
"    void snapInterpolation() {\n"+
"    }\n"+
"\n"+
"    void readSync(Reads read) {\n"+
"    }\n"+
"\n"+
"    void writeSync(Writes write) {\n"+
"    }\n"+
"\n"+
"    void readSyncManual(FloatBuffer buffer) {\n"+
"    }\n"+
"\n"+
"    void writeSyncManual(FloatBuffer buffer) {\n"+
"    }\n"+
"\n"+
"    void afterSync() {\n"+
"    }\n"+
"\n"+
"    void interpolate() {\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        // interpolate the player if:\n"+
"        // - this is a client and the entity is everything except the local player\n"+
"        // - this is a server and the entity is a remote player\n"+
"        if ((Vars.net.client() && !isLocal()) || isRemote()) {\n"+
"            interpolate();\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void remove() {\n"+
"        // notify client of removal\n"+
"        if (Vars.net.client()) {\n"+
"            Vars.netClient.addRemovedEntity(id());\n"+
"        }\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("TeamComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.game.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.world.blocks.storage.CoreBlock.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class TeamComp implements Posc {\n"+
"\n"+
"    @Import\n"+
"    float x, y;\n"+
"\n"+
"    Team team = Team.derelict;\n"+
"\n"+
"    public boolean cheating() {\n"+
"        return team.rules().cheat;\n"+
"    }\n"+
"\n"+
"    @Nullable\n"+
"    public CoreBuild core() {\n"+
"        return team.core();\n"+
"    }\n"+
"\n"+
"    @Nullable\n"+
"    public CoreBuild closestCore() {\n"+
"        return state.teams.closestCore(x, y, team);\n"+
"    }\n"+
"\n"+
"    @Nullable\n"+
"    public CoreBuild closestEnemyCore() {\n"+
"        return state.teams.closestEnemyCore(x, y, team);\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("TimedComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.math.*;\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class TimedComp implements Entityc, Scaled {\n"+
"\n"+
"    float time, lifetime;\n"+
"\n"+
"    // called last so pooling and removal happens then.\n"+
"    @MethodPriority(100)\n"+
"    @Override\n"+
"    public void update() {\n"+
"        time = Math.min(time + Time.delta, lifetime);\n"+
"        if (time >= lifetime) {\n"+
"            remove();\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public float fin() {\n"+
"        return time / lifetime;\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("TimerComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class TimerComp {\n"+
"\n"+
"    transient Interval timer = new Interval(6);\n"+
"\n"+
"    public boolean timer(int index, float time) {\n"+
"        if (Float.isInfinite(time))\n"+
"            return false;\n"+
"        return timer.get(index, time);\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("TrailComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.math.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.graphics.*;\n"+
"import mindustry.type.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class TrailComp implements Unitc {\n"+
"\n"+
"    @Import\n"+
"    UnitType type;\n"+
"\n"+
"    @Import\n"+
"    float x, y, rotation;\n"+
"\n"+
"    transient Trail trail = new Trail(6);\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        trail.length = type.trailLength;\n"+
"        float scale = elevation();\n"+
"        float offset = type.engineOffset / 2f + type.engineOffset / 2f * scale;\n"+
"        float cx = x + Angles.trnsx(rotation + 180, offset), cy = y + Angles.trnsy(rotation + 180, offset);\n"+
"        trail.update(cx, cy);\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("UnitComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.*;\n"+
"import arc.func.*;\n"+
"import arc.graphics.g2d.*;\n"+
"import arc.math.*;\n"+
"import arc.math.geom.*;\n"+
"import arc.scene.ui.layout.*;\n"+
"import arc.struct.*;\n"+
"import arc.util.*;\n"+
"import mindustry.ai.*;\n"+
"import mindustry.ai.types.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.core.*;\n"+
"import mindustry.ctype.*;\n"+
"import mindustry.entities.*;\n"+
"import mindustry.entities.abilities.*;\n"+
"import mindustry.entities.units.*;\n"+
"import mindustry.game.EventType.*;\n"+
"import mindustry.game.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.logic.*;\n"+
"import mindustry.type.*;\n"+
"import mindustry.ui.*;\n"+
"import mindustry.world.*;\n"+
"import mindustry.world.blocks.environment.*;\n"+
"import mindustry.world.blocks.payloads.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.GlobalConstants.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component(base = true)\n"+
"abstract class UnitComp implements Healthc, Physicsc, Hitboxc, Statusc, Teamc, Itemsc, Rotc, Unitc, Weaponsc, Drawc, Boundedc, Syncc, Shieldc, Commanderc, Displayable, Senseable, Ranged, Minerc, Builderc {\n"+
"\n"+
"    @Import\n"+
"    boolean hovering, dead, disarmed;\n"+
"\n"+
"    @Import\n"+
"    float x, y, rotation, elevation, maxHealth, drag, armor, hitSize, health, ammo, minFormationSpeed, dragMultiplier;\n"+
"\n"+
"    @Import\n"+
"    Team team;\n"+
"\n"+
"    @Import\n"+
"    int id;\n"+
"\n"+
"    @Import\n"+
"    @Nullable\n"+
"    Tile mineTile;\n"+
"\n"+
"    @Import\n"+
"    Vec2 vel;\n"+
"\n"+
"    @Import\n"+
"    WeaponMount[] mounts;\n"+
"\n"+
"    private UnitController controller;\n"+
"\n"+
"    UnitType type = UnitTypes.alpha;\n"+
"\n"+
"    boolean spawnedByCore;\n"+
"\n"+
"    double flag;\n"+
"\n"+
"    transient float shadowAlpha = -1f;\n"+
"\n"+
"    transient Seq<Ability> abilities = new Seq<>(0);\n"+
"\n"+
"    transient float healTime;\n"+
"\n"+
"    private transient float resupplyTime = Mathf.random(10f);\n"+
"\n"+
"    private transient boolean wasPlayer;\n"+
"\n"+
"    private transient boolean wasHealed;\n"+
"\n"+
"    /**\n"+
"     * Called when this unit was unloaded from a factory or spawn point.\n"+
"     */\n"+
"    public void unloaded() {\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Move based on preferred unit movement type.\n"+
"     */\n"+
"    public void movePref(Vec2 movement) {\n"+
"        if (type.omniMovement) {\n"+
"            moveAt(movement);\n"+
"        } else {\n"+
"            rotateMove(movement);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public void moveAt(Vec2 vector) {\n"+
"        moveAt(vector, type.accel);\n"+
"    }\n"+
"\n"+
"    public void approach(Vec2 vector) {\n"+
"        vel.approachDelta(vector, type.accel * realSpeed());\n"+
"    }\n"+
"\n"+
"    public void rotateMove(Vec2 vec) {\n"+
"        moveAt(Tmp.v2.trns(rotation, vec.len()));\n"+
"        if (!vec.isZero()) {\n"+
"            rotation = Angles.moveToward(rotation, vec.angle(), type.rotateSpeed * Math.max(Time.delta, 1));\n"+
"        }\n"+
"    }\n"+
"\n"+
"    public void aimLook(Position pos) {\n"+
"        aim(pos);\n"+
"        lookAt(pos);\n"+
"    }\n"+
"\n"+
"    public void aimLook(float x, float y) {\n"+
"        aim(x, y);\n"+
"        lookAt(x, y);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return approx. square size of the physical hitbox for physics\n"+
"     */\n"+
"    public float physicSize() {\n"+
"        return hitSize * 0.7f;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return whether there is solid, un-occupied ground under this unit.\n"+
"     */\n"+
"    public boolean canLand() {\n"+
"        return !onSolid() && Units.count(x, y, physicSize(), f -> f != self() && f.isGrounded()) == 0;\n"+
"    }\n"+
"\n"+
"    public boolean inRange(Position other) {\n"+
"        return within(other, type.range);\n"+
"    }\n"+
"\n"+
"    public boolean hasWeapons() {\n"+
"        return type.hasWeapons();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return speed with boost & floor multipliers factored in.\n"+
"     */\n"+
"    public float speed() {\n"+
"        float strafePenalty = isGrounded() || !isPlayer() ? 1f : Mathf.lerp(1f, type.strafePenalty, Angles.angleDist(vel().angle(), rotation) / 180f);\n"+
"        float boost = Mathf.lerp(1f, type.canBoost ? type.boostMultiplier : 1f, elevation);\n"+
"        // limit speed to minimum formation speed to preserve formation\n"+
"        return (isCommanding() ? minFormationSpeed * 0.98f : type.speed) * strafePenalty * boost * floorSpeedMultiplier();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @deprecated use speed() instead\n"+
"     */\n"+
"    @Deprecated\n"+
"    public float realSpeed() {\n"+
"        return speed();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Iterates through this unit and everything it is controlling.\n"+
"     */\n"+
"    public void eachGroup(Cons<Unit> cons) {\n"+
"        cons.get(self());\n"+
"        controlling().each(cons);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return where the unit wants to look at.\n"+
"     */\n"+
"    public float prefRotation() {\n"+
"        if (activelyBuilding()) {\n"+
"            return angleTo(buildPlan());\n"+
"        } else if (mineTile != null) {\n"+
"            return angleTo(mineTile);\n"+
"        } else if (moving() && type.omniMovement) {\n"+
"            return vel().angle();\n"+
"        }\n"+
"        return rotation;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public float range() {\n"+
"        return type.maxRange;\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    public float clipSize() {\n"+
"        if (isBuilding()) {\n"+
"            return state.rules.infiniteResources ? Float.MAX_VALUE : Math.max(type.clipSize, type.region.width) + buildingRange + tilesize * 4f;\n"+
"        }\n"+
"        if (mining()) {\n"+
"            return type.clipSize + type.miningRange;\n"+
"        }\n"+
"        return type.clipSize;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public double sense(LAccess sensor) {\n"+
"        Payloadc pay;\n"+
"        switch(sensor) {\n"+
"            case totalItems:\n"+
"                return stack().amount;\n"+
"            case itemCapacity:\n"+
"                return type.itemCapacity;\n"+
"            case rotation:\n"+
"                return rotation;\n"+
"            case health:\n"+
"                return health;\n"+
"            case maxHealth:\n"+
"                return maxHealth;\n"+
"            case ammo:\n"+
"                return !state.rules.unitAmmo ? type.ammoCapacity : ammo;\n"+
"            case ammoCapacity:\n"+
"                return type.ammoCapacity;\n"+
"            case x:\n"+
"                return World.conv(x);\n"+
"            case y:\n"+
"                return World.conv(y);\n"+
"            case dead:\n"+
"                return dead || !isAdded() ? 1 : 0;\n"+
"            case team:\n"+
"                return team.id;\n"+
"            case shooting:\n"+
"                return isShooting() ? 1 : 0;\n"+
"            case boosting:\n"+
"                return type.canBoost && isFlying() ? 1 : 0;\n"+
"            case range:\n"+
"                return range() / tilesize;\n"+
"            case shootX:\n"+
"                return World.conv(aimX());\n"+
"            case shootY:\n"+
"                return World.conv(aimY());\n"+
"            case mining:\n"+
"                return mining() ? 1 : 0;\n"+
"            case mineX:\n"+
"                return mining() ? mineTile.x : -1;\n"+
"            case mineY:\n"+
"                return mining() ? mineTile.y : -1;\n"+
"            case flag:\n"+
"                return flag;\n"+
"            case controlled:\n"+
"                return !isValid() ? 0 : controller instanceof LogicAI ? ctrlProcessor : controller instanceof Player ? ctrlPlayer : controller instanceof FormationAI ? ctrlFormation : 0;\n"+
"            case commanded:\n"+
"                return controller instanceof FormationAI && isValid() ? 1 : 0;\n"+
"            case payloadCount:\n"+
"                return (((Object) this) instanceof Payloadc && (pay = (Payloadc) ((Object) this)) == ((Object) this)) ? pay.payloads().size : 0;\n"+
"            case size:\n"+
"                return hitSize / tilesize;\n"+
"            default:\n"+
"                return Float.NaN;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public Object senseObject(LAccess sensor) {\n"+
"        Player p;\n"+
"        LogicAI log;\n"+
"        FormationAI form;\n"+
"        Payloadc pay;\n"+
"        UnitPayload p1;\n"+
"        BuildPayload p2;\n"+
"        switch(sensor) {\n"+
"            case type:\n"+
"                return type;\n"+
"            case name:\n"+
"                return (controller instanceof Player && (p = (Player) controller) == controller) ? p.name : null;\n"+
"            case firstItem:\n"+
"                return stack().amount == 0 ? null : item();\n"+
"            case controller:\n"+
"                return !isValid() ? null : (controller instanceof LogicAI && (log = (LogicAI) controller) == controller) ? log.controller : (controller instanceof FormationAI && (form = (FormationAI) controller) == controller) ? form.leader : this;\n"+
"            case payloadType:\n"+
"                return (((Object) this) instanceof Payloadc && (pay = (Payloadc) ((Object) this)) == ((Object) this)) ? (pay.payloads().isEmpty() ? null : (pay.payloads().peek() instanceof UnitPayload && (p1 = (UnitPayload) pay.payloads().peek()) == pay.payloads().peek()) ? p1.unit.type : (pay.payloads().peek() instanceof BuildPayload && (p2 = (BuildPayload) pay.payloads().peek()) == pay.payloads().peek()) ? p2.block() : null) : null;\n"+
"            default:\n"+
"                return noSensed;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public double sense(Content content) {\n"+
"        if (content == stack().item)\n"+
"            return stack().amount;\n"+
"        return Float.NaN;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    @Replace\n"+
"    public boolean canDrown() {\n"+
"        return isGrounded() && !hovering && type.canDrown;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    @Replace\n"+
"    public boolean canShoot() {\n"+
"        // cannot shoot while boosting\n"+
"        return !disarmed && !(type.canBoost && isFlying());\n"+
"    }\n"+
"\n"+
"    public boolean isCounted() {\n"+
"        return type.isCounted;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public int itemCapacity() {\n"+
"        return type.itemCapacity;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public float bounds() {\n"+
"        return hitSize * 2f;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void controller(UnitController next) {\n"+
"        this.controller = next;\n"+
"        if (controller.unit() != self())\n"+
"            controller.unit(self());\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public UnitController controller() {\n"+
"        return controller;\n"+
"    }\n"+
"\n"+
"    public void resetController() {\n"+
"        controller(type.createController());\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void set(UnitType def, UnitController controller) {\n"+
"        if (this.type != def) {\n"+
"            setType(def);\n"+
"        }\n"+
"        controller(controller);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return pathfinder path type for calculating costs\n"+
"     */\n"+
"    public int pathType() {\n"+
"        return Pathfinder.costGround;\n"+
"    }\n"+
"\n"+
"    public void lookAt(float angle) {\n"+
"        rotation = Angles.moveToward(rotation, angle, type.rotateSpeed * Time.delta * speedMultiplier());\n"+
"    }\n"+
"\n"+
"    public void lookAt(Position pos) {\n"+
"        lookAt(angleTo(pos));\n"+
"    }\n"+
"\n"+
"    public void lookAt(float x, float y) {\n"+
"        lookAt(angleTo(x, y));\n"+
"    }\n"+
"\n"+
"    public boolean isAI() {\n"+
"        return controller instanceof AIController;\n"+
"    }\n"+
"\n"+
"    public int count() {\n"+
"        return team.data().countType(type);\n"+
"    }\n"+
"\n"+
"    public int cap() {\n"+
"        return Units.getCap(team);\n"+
"    }\n"+
"\n"+
"    public void setType(UnitType type) {\n"+
"        this.type = type;\n"+
"        this.maxHealth = type.health;\n"+
"        this.drag = type.drag;\n"+
"        this.armor = type.armor;\n"+
"        this.hitSize = type.hitSize;\n"+
"        this.hovering = type.hovering;\n"+
"        if (controller == null)\n"+
"            controller(type.createController());\n"+
"        if (mounts().length != type.weapons.size)\n"+
"            setupWeapons(type);\n"+
"        if (abilities.size != type.abilities.size) {\n"+
"            abilities = type.abilities.map(Ability::copy);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void afterSync() {\n"+
"        // set up type info after reading\n"+
"        setType(this.type);\n"+
"        controller.unit(self());\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void afterRead() {\n"+
"        afterSync();\n"+
"        // reset controller state\n"+
"        controller(type.createController());\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void add() {\n"+
"        team.data().updateCount(type, 1);\n"+
"        // check if over unit cap\n"+
"        if (count() > cap() && !spawnedByCore && !dead && !state.rules.editor) {\n"+
"            Call.unitCapDeath(self());\n"+
"            team.data().updateCount(type, -1);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void remove() {\n"+
"        team.data().updateCount(type, -1);\n"+
"        controller.removed(self());\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void landed() {\n"+
"        if (type.landShake > 0f) {\n"+
"            Effect.shake(type.landShake, type.landShake, this);\n"+
"        }\n"+
"        type.landed(self());\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void heal(float amount) {\n"+
"        if (health < maxHealth && amount > 0) {\n"+
"            wasHealed = true;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        type.update(self());\n"+
"        if (wasHealed && healTime <= -1f) {\n"+
"            healTime = 1f;\n"+
"        }\n"+
"        healTime -= Time.delta / 20f;\n"+
"        wasHealed = false;\n"+
"        // check if environment is unsupported\n"+
"        if (!type.supportsEnv(state.rules.environment) && !dead) {\n"+
"            Call.unitCapDeath(self());\n"+
"            team.data().updateCount(type, -1);\n"+
"        }\n"+
"        if (state.rules.unitAmmo && ammo < type.ammoCapacity - 0.0001f) {\n"+
"            resupplyTime += Time.delta;\n"+
"            // resupply only at a fixed interval to prevent lag\n"+
"            if (resupplyTime > 10f) {\n"+
"                type.ammoType.resupply(self());\n"+
"                resupplyTime = 0f;\n"+
"            }\n"+
"        }\n"+
"        if (abilities.size > 0) {\n"+
"            for (Ability a : abilities) {\n"+
"                a.update(self());\n"+
"            }\n"+
"        }\n"+
"        drag = type.drag * (isGrounded() ? (floorOn().dragMultiplier) : 1f) * dragMultiplier;\n"+
"        // apply knockback based on spawns\n"+
"        if (team != state.rules.waveTeam && state.hasSpawns() && (!net.client() || isLocal())) {\n"+
"            float relativeSize = state.rules.dropZoneRadius + hitSize / 2f + 1f;\n"+
"            for (Tile spawn : spawner.getSpawns()) {\n"+
"                if (within(spawn.worldx(), spawn.worldy(), relativeSize)) {\n"+
"                    velAddNet(Tmp.v1.set(this).sub(spawn.worldx(), spawn.worldy()).setLength(0.1f + 1f - dst(spawn) / relativeSize).scl(0.45f * Time.delta));\n"+
"                }\n"+
"            }\n"+
"        }\n"+
"        // simulate falling down\n"+
"        if (dead || health <= 0) {\n"+
"            // less drag when dead\n"+
"            drag = 0.01f;\n"+
"            // standard fall smoke\n"+
"            if (Mathf.chanceDelta(0.1)) {\n"+
"                Tmp.v1.rnd(Mathf.range(hitSize));\n"+
"                type.fallEffect.at(x + Tmp.v1.x, y + Tmp.v1.y);\n"+
"            }\n"+
"            // thruster fall trail\n"+
"            if (Mathf.chanceDelta(0.2)) {\n"+
"                float offset = type.engineOffset / 2f + type.engineOffset / 2f * elevation;\n"+
"                float range = Mathf.range(type.engineSize);\n"+
"                type.fallThrusterEffect.at(x + Angles.trnsx(rotation + 180, offset) + Mathf.range(range), y + Angles.trnsy(rotation + 180, offset) + Mathf.range(range), Mathf.random());\n"+
"            }\n"+
"            // move down\n"+
"            elevation -= type.fallSpeed * Time.delta;\n"+
"            if (isGrounded() || health <= -maxHealth) {\n"+
"                Call.unitDestroy(id);\n"+
"            }\n"+
"        }\n"+
"        Tile tile = tileOn();\n"+
"        Floor floor = floorOn();\n"+
"        if (tile != null && isGrounded() && !type.hovering) {\n"+
"            // unit block update\n"+
"            if (tile.build != null) {\n"+
"                tile.build.unitOn(self());\n"+
"            }\n"+
"            // apply damage\n"+
"            if (floor.damageTaken > 0f) {\n"+
"                damageContinuous(floor.damageTaken);\n"+
"            }\n"+
"        }\n"+
"        // kill entities on tiles that are solid to them\n"+
"        if (tile != null && !canPassOn()) {\n"+
"            // boost if possible\n"+
"            if (type.canBoost) {\n"+
"                elevation = 1f;\n"+
"            } else if (!net.client()) {\n"+
"                kill();\n"+
"            }\n"+
"        }\n"+
"        // AI only updates on the server\n"+
"        if (!net.client() && !dead) {\n"+
"            controller.updateUnit();\n"+
"        }\n"+
"        // clear controller when it becomes invalid\n"+
"        if (!controller.isValidController()) {\n"+
"            resetController();\n"+
"        }\n"+
"        // remove units spawned by the core\n"+
"        if (spawnedByCore && !isPlayer() && !dead) {\n"+
"            Call.unitDespawn(self());\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return a preview icon for this unit.\n"+
"     */\n"+
"    public TextureRegion icon() {\n"+
"        return type.fullIcon;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Actually destroys the unit, removing it and creating explosions. *\n"+
"     */\n"+
"    public void destroy() {\n"+
"        if (!isAdded())\n"+
"            return;\n"+
"        float explosiveness = 2f + item().explosiveness * stack().amount * 1.53f;\n"+
"        float flammability = item().flammability * stack().amount / 1.9f;\n"+
"        float power = item().charge * Mathf.pow(stack().amount, 1.11f) * 160f;\n"+
"        if (!spawnedByCore) {\n"+
"            Damage.dynamicExplosion(x, y, flammability, explosiveness, power, bounds() / 2f, state.rules.damageExplosions, item().flammability > 1, team, type.deathExplosionEffect);\n"+
"        } else {\n"+
"            type.deathExplosionEffect.at(x, y, bounds() / 2f / 8f);\n"+
"        }\n"+
"        float shake = hitSize / 3f;\n"+
"        Effect.scorch(x, y, (int) (hitSize / 5));\n"+
"        Effect.shake(shake, shake, this);\n"+
"        type.deathSound.at(this);\n"+
"        Events.fire(new UnitDestroyEvent(self()));\n"+
"        if (explosiveness > 7f && (isLocal() || wasPlayer)) {\n"+
"            Events.fire(Trigger.suicideBomb);\n"+
"        }\n"+
"        for (WeaponMount mount : mounts) {\n"+
"            if (mount.weapon.shootOnDeath && !(mount.weapon.bullet.killShooter && mount.shoot)) {\n"+
"                mount.reload = 0f;\n"+
"                mount.shoot = true;\n"+
"                mount.weapon.update(self(), mount);\n"+
"            }\n"+
"        }\n"+
"        // if this unit crash landed (was flying), damage stuff in a radius\n"+
"        if (type.flying && !spawnedByCore) {\n"+
"            Damage.damage(team, x, y, Mathf.pow(hitSize, 0.94f) * 1.25f, Mathf.pow(hitSize, 0.75f) * type.crashDamageMultiplier * 5f, true, false, true);\n"+
"        }\n"+
"        if (!headless) {\n"+
"            for (int i = 0; i < type.wreckRegions.length; i++) {\n"+
"                if (type.wreckRegions[i].found()) {\n"+
"                    float range = type.hitSize / 4f;\n"+
"                    Tmp.v1.rnd(range);\n"+
"                    Effect.decal(type.wreckRegions[i], x + Tmp.v1.x, y + Tmp.v1.y, rotation - 90);\n"+
"                }\n"+
"            }\n"+
"        }\n"+
"        if (abilities.size > 0) {\n"+
"            for (Ability a : abilities) {\n"+
"                a.death(self());\n"+
"            }\n"+
"        }\n"+
"        remove();\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return name of direct or indirect player controller.\n"+
"     */\n"+
"    @Override\n"+
"    @Nullable\n"+
"    public String getControllerName() {\n"+
"        if (isPlayer())\n"+
"            return getPlayer().name;\n"+
"        {\n"+
"            LogicAI ai;\n"+
"            if ((controller instanceof LogicAI && (ai = (LogicAI) controller) == controller) && ai.controller != null)\n"+
"                return ai.controller.lastAccessed;\n"+
"        }\n"+
"        FormationAI ai;\n"+
"        if ((controller instanceof FormationAI && (ai = (FormationAI) controller) == controller) && ai.leader != null && ai.leader.isPlayer())\n"+
"            return ai.leader.getPlayer().name;\n"+
"        return null;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void display(Table table) {\n"+
"        type.display(self(), table);\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public boolean isImmune(StatusEffect effect) {\n"+
"        return type.immunities.contains(effect);\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void draw() {\n"+
"        type.draw(self());\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public boolean isPlayer() {\n"+
"        return controller instanceof Player;\n"+
"    }\n"+
"\n"+
"    @Nullable\n"+
"    public Player getPlayer() {\n"+
"        return isPlayer() ? (Player) controller : null;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void killed() {\n"+
"        wasPlayer = isLocal();\n"+
"        health = Math.min(health, 0);\n"+
"        dead = true;\n"+
"        // don\'t waste time when the unit is already on the ground, just destroy it\n"+
"        if (!type.flying) {\n"+
"            destroy();\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    @Replace\n"+
"    public void kill() {\n"+
"        if (dead || net.client())\n"+
"            return;\n"+
"        // deaths are synced; this calls killed()\n"+
"        Call.unitDeath(id);\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("VelComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.math.*;\n"+
"import arc.math.geom.*;\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.entities.EntityCollisions.*;\n"+
"import mindustry.gen.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class VelComp implements Posc {\n"+
"\n"+
"    @Import\n"+
"    float x, y;\n"+
"\n"+
"    @SyncLocal\n"+
"    Vec2 vel = new Vec2();\n"+
"\n"+
"    transient float drag = 0f;\n"+
"\n"+
"    // velocity needs to be called first, as it affects delta and lastPosition\n"+
"    @MethodPriority(-1)\n"+
"    @Override\n"+
"    public void update() {\n"+
"        // do not update velocity on the client at all, unless it\'s non-interpolated\n"+
"        // velocity conflicts with interpolation.\n"+
"        if (!net.client() || isLocal()) {\n"+
"            float px = x, py = y;\n"+
"            move(vel.x * Time.delta, vel.y * Time.delta);\n"+
"            if (Mathf.equal(px, x))\n"+
"                vel.x = 0;\n"+
"            if (Mathf.equal(py, y))\n"+
"                vel.y = 0;\n"+
"            vel.scl(Math.max(1f - drag * Time.delta, 0));\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return function to use for check solid state. if null, no checking is done.\n"+
"     */\n"+
"    @Nullable\n"+
"    SolidPred solidity() {\n"+
"        return null;\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return whether this entity can move through a location\n"+
"     */\n"+
"    boolean canPass(int tileX, int tileY) {\n"+
"        SolidPred s = solidity();\n"+
"        return s == null || !s.solid(tileX, tileY);\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * @return whether this entity can exist on its current location\n"+
"     */\n"+
"    boolean canPassOn() {\n"+
"        return canPass(tileX(), tileY());\n"+
"    }\n"+
"\n"+
"    boolean moving() {\n"+
"        return !vel.isZero(0.01f);\n"+
"    }\n"+
"\n"+
"    void move(Vec2 v) {\n"+
"        move(v.x, v.y);\n"+
"    }\n"+
"\n"+
"    void move(float cx, float cy) {\n"+
"        SolidPred check = solidity();\n"+
"        if (check != null) {\n"+
"            collisions.move(self(), cx, cy, check);\n"+
"        } else {\n"+
"            x += cx;\n"+
"            y += cy;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    void velAddNet(Vec2 v) {\n"+
"        vel.add(v);\n"+
"        if (isRemote()) {\n"+
"            x += v.x;\n"+
"            y += v.y;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    void velAddNet(float vx, float vy) {\n"+
"        vel.add(vx, vy);\n"+
"        if (isRemote()) {\n"+
"            x += vx;\n"+
"            y += vy;\n"+
"        }\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("WaterMoveComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.graphics.*;\n"+
"import arc.graphics.g2d.*;\n"+
"import arc.math.*;\n"+
"import arc.util.*;\n"+
"import mindustry.ai.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.content.*;\n"+
"import mindustry.entities.*;\n"+
"import mindustry.entities.EntityCollisions.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.graphics.*;\n"+
"import mindustry.type.*;\n"+
"import mindustry.world.*;\n"+
"import mindustry.world.blocks.environment.*;\n"+
"import static mindustry.Vars.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class WaterMoveComp implements Posc, Velc, Hitboxc, Flyingc, Unitc {\n"+
"\n"+
"    @Import\n"+
"    float x, y, rotation, speedMultiplier;\n"+
"\n"+
"    @Import\n"+
"    UnitType type;\n"+
"\n"+
"    private transient Trail tleft = new Trail(1), tright = new Trail(1);\n"+
"\n"+
"    private transient Color trailColor = Blocks.water.mapColor.cpy().mul(1.5f);\n"+
"\n"+
"    @Override\n"+
"    public void update() {\n"+
"        boolean flying = isFlying();\n"+
"        for (int i = 0; i < 2; i++) {\n"+
"            Trail t = i == 0 ? tleft : tright;\n"+
"            t.length = type.trailLength;\n"+
"            int sign = i == 0 ? -1 : 1;\n"+
"            float cx = Angles.trnsx(rotation - 90, type.trailX * sign, type.trailY) + x, cy = Angles.trnsy(rotation - 90, type.trailX * sign, type.trailY) + y;\n"+
"            t.update(cx, cy, world.floorWorld(cx, cy).isLiquid && !flying ? 1 : 0);\n"+
"        }\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    @Replace\n"+
"    public int pathType() {\n"+
"        return Pathfinder.costNaval;\n"+
"    }\n"+
"\n"+
"    // don\'t want obnoxious splashing\n"+
"    @Override\n"+
"    @Replace\n"+
"    public boolean emitWalkSound() {\n"+
"        return false;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void add() {\n"+
"        tleft.clear();\n"+
"        tright.clear();\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void draw() {\n"+
"        float z = Draw.z();\n"+
"        Draw.z(Layer.debris);\n"+
"        Floor floor = tileOn() == null ? Blocks.air.asFloor() : tileOn().floor();\n"+
"        Color color = Tmp.c1.set(floor.mapColor.equals(Color.black) ? Blocks.water.mapColor : floor.mapColor).mul(1.5f);\n"+
"        trailColor.lerp(color, Mathf.clamp(Time.delta * 0.04f));\n"+
"        tleft.draw(trailColor, type.trailScl);\n"+
"        tright.draw(trailColor, type.trailScl);\n"+
"        Draw.z(z);\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    @Override\n"+
"    public SolidPred solidity() {\n"+
"        return isFlying() ? null : EntityCollisions::waterSolid;\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    @Override\n"+
"    public boolean onSolid() {\n"+
"        return EntityCollisions.waterSolid(tileX(), tileY());\n"+
"    }\n"+
"\n"+
"    @Replace\n"+
"    public float floorSpeedMultiplier() {\n"+
"        Floor on = isFlying() ? Blocks.air.asFloor() : floorOn();\n"+
"        return (on.shallow ? 1f : 1.3f) * speedMultiplier;\n"+
"    }\n"+
"\n"+
"    public boolean onLiquid() {\n"+
"        Tile tile = tileOn();\n"+
"        return tile != null && tile.floor().isLiquid;\n"+
"    }\n"+
"}\n"+
"");
        compMap.put("WeaponsComp","package mma.entities.compByAnuke;\n"+
"\n"+
"import arc.math.geom.*;\n"+
"import arc.util.*;\n"+
"import mindustry.annotations.Annotations.*;\n"+
"import mindustry.entities.units.*;\n"+
"import mindustry.gen.*;\n"+
"import mindustry.type.*;\n"+
"import static mindustry.logic.LAccess.*;\n"+
"\n"+
"@Component\n"+
"abstract class WeaponsComp implements Teamc, Posc, Rotc, Velc, Statusc {\n"+
"\n"+
"    @Import\n"+
"    float x, y;\n"+
"\n"+
"    @Import\n"+
"    boolean disarmed;\n"+
"\n"+
"    @Import\n"+
"    UnitType type;\n"+
"\n"+
"    /**\n"+
"     * weapon mount array, never null\n"+
"     */\n"+
"    @SyncLocal\n"+
"    WeaponMount[] mounts = {};\n"+
"\n"+
"    @ReadOnly\n"+
"    transient boolean isRotate;\n"+
"\n"+
"    transient float aimX, aimY;\n"+
"\n"+
"    boolean isShooting;\n"+
"\n"+
"    float ammo;\n"+
"\n"+
"    float ammof() {\n"+
"        return ammo / type.ammoCapacity;\n"+
"    }\n"+
"\n"+
"    void setWeaponRotation(float rotation) {\n"+
"        for (WeaponMount mount : mounts) {\n"+
"            mount.rotation = rotation;\n"+
"        }\n"+
"    }\n"+
"\n"+
"    void setupWeapons(UnitType def) {\n"+
"        mounts = new WeaponMount[def.weapons.size];\n"+
"        for (int i = 0; i < mounts.length; i++) {\n"+
"            mounts[i] = def.weapons.get(i).mountType.get(def.weapons.get(i));\n"+
"        }\n"+
"    }\n"+
"\n"+
"    void controlWeapons(boolean rotateShoot) {\n"+
"        controlWeapons(rotateShoot, rotateShoot);\n"+
"    }\n"+
"\n"+
"    void controlWeapons(boolean rotate, boolean shoot) {\n"+
"        for (WeaponMount mount : mounts) {\n"+
"            if (mount.weapon.controllable) {\n"+
"                mount.rotate = rotate;\n"+
"                mount.shoot = shoot;\n"+
"            }\n"+
"        }\n"+
"        isRotate = rotate;\n"+
"        isShooting = shoot;\n"+
"    }\n"+
"\n"+
"    void aim(Position pos) {\n"+
"        aim(pos.getX(), pos.getY());\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Aim at something. This will make all mounts point at it.\n"+
"     */\n"+
"    void aim(float x, float y) {\n"+
"        Tmp.v1.set(x, y).sub(this.x, this.y);\n"+
"        if (Tmp.v1.len() < type.aimDst)\n"+
"            Tmp.v1.setLength(type.aimDst);\n"+
"        x = Tmp.v1.x + this.x;\n"+
"        y = Tmp.v1.y + this.y;\n"+
"        for (WeaponMount mount : mounts) {\n"+
"            if (mount.weapon.controllable) {\n"+
"                mount.aimX = x;\n"+
"                mount.aimY = y;\n"+
"            }\n"+
"        }\n"+
"        aimX = x;\n"+
"        aimY = y;\n"+
"    }\n"+
"\n"+
"    boolean canShoot() {\n"+
"        return !disarmed;\n"+
"    }\n"+
"\n"+
"    @Override\n"+
"    public void remove() {\n"+
"        for (WeaponMount mount : mounts) {\n"+
"            if (mount.bullet != null && mount.bullet.owner == self()) {\n"+
"                mount.bullet.time = mount.bullet.lifetime - 10f;\n"+
"                mount.bullet = null;\n"+
"            }\n"+
"            if (mount.sound != null) {\n"+
"                mount.sound.stop();\n"+
"            }\n"+
"        }\n"+
"    }\n"+
"\n"+
"    /**\n"+
"     * Update shooting and rotation for this unit.\n"+
"     */\n"+
"    @Override\n"+
"    public void update() {\n"+
"        for (WeaponMount mount : mounts) {\n"+
"            mount.weapon.update(self(), mount);\n"+
"        }\n"+
"    }\n"+
"}\n"+
"");
        groupDefs="package mma.entities;\r\n\r\nimport mindustry.annotations.Annotations.GroupDef;\r\nimport mindustry.gen.*;\r\n\r\nclass GroupDefs<G>{\r\n    @GroupDef(value = Entityc.class) G all;\r\n//    @GroupDef(value = Playerc.class, mapping = true) G player;\r\n//    @GroupDef(value = Bulletc.class, spatial = true, collide = true) G bullet;\r\n    @GroupDef(value = Unitc.class, spatial = true, mapping = true) G unit;\r\n//    @GroupDef(value = Buildingc.class) G build;\r\n    @GroupDef(value = Syncc.class, mapping = true) G sync;\r\n    @GroupDef(value = Drawc.class) G draw;\r\n//    @GroupDef(value = Firec.class) G fire;\r\n//    @GroupDef(value = Puddlec.class) G puddle;\r\n//    @GroupDef(value = WeatherStatec.class) G weather;\r\n}\r\n";
    }
}
