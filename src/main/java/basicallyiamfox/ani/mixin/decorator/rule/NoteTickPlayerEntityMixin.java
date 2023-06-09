package basicallyiamfox.ani.mixin.decorator.rule;

import basicallyiamfox.ani.decorator.rule.NoteTickRuleDecorator;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(PlayerEntity.class)
public abstract class NoteTickPlayerEntityMixin extends LivingEntity implements NoteTickRuleDecorator.NoteTickPlayerEntity {
    @Unique
    private int noteType;
    @Unique
    private int noteTick;

    protected NoteTickPlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

    @Unique
    @Override
    public int getNoteType() {
        return noteType;
    }
    @Unique
    @Override
    public void setNoteType(int i) {
        noteType = i;
    }

    @Unique
    @Override
    public int getNoteTick() {
        return noteTick;
    }
    @Unique
    @Override
    public void setNoteTick(int i) {
        noteTick = i;
    }
}
