package muchahawlucha.necromancymod.common.soul;

public class Soul {

    // This soul's Type (aka the mob it came from)
    EnumSoulType type;

    public Soul() {
        type = EnumSoulType.EMPTY_SOUL;
    }

    public Soul(EnumSoulType initType) {
        type = initType;
    }

    public String getSoulName() {
        switch(type) {

            case EMPTY_SOUL:
                return "empty";
            case SOUL_PIG:
                return "pig";
            case SOUL_COW:
                return "cow";
            case SOUL_CHICKEN:
                return "chicken";
            case SOUL_SHEEP:
                return "sheep";
            case SOUL_HORSE:
                return "horse";
            case SOUL_PARROT:
                return "parrot";
            case SOUL_SQUID:
                return "squid";
            case SOUL_OCELOT:
                return "ocelot";
            case SOUL_WOLF:
                return "wolf";
            case SOUL_SPIDER:
                return "spider";
            case SOUL_ZOMBIE:
                return "zombie";
            case SOUL_SKELETON:
                return "skeleton";
            case SOUL_WITHER_SKELETON:
                return "wither_skeleton";
            case SOUL_ZOMBIE_PIGMAN:
                return "zombie_pigman";
            case SOUL_BLAZE:
                return "blaze";
            case SOUL_GHAST:
                return "ghast";
            case SOUL_CREEPER:
                return "creeper";
            case SOUL_ENDERMAN:
                return "enderman";
            case SOUL_GUARDIAN:
                return "guardian";
            case SOUL_SILVERFISH:
                return "silverfish";
            case SOUL_ENDER_DRAGON:
                return "ender_dragon";
            case SOUL_VILLAGER:
                return "villager";
            case SOUL_ZOMBIE_VILLAGER:
                return "zombie_villager";
            case SOUL_ILLAGER:
                return "illager";
            default:
                return null;
        }
    }

    // Gets the Display Name of this soul.
    public String getSoulDisplayName() {
        switch(type) {

            case EMPTY_SOUL:
                return "Empty";
            case SOUL_PIG:
                return "Pig";
            case SOUL_COW:
                return "Cow";
            case SOUL_CHICKEN:
                return "Chicken";
            case SOUL_SHEEP:
                return "Sheep";
            case SOUL_HORSE:
                return "Horse";
            case SOUL_PARROT:
                return "Parrot";
            case SOUL_SQUID:
                return "Squid";
            case SOUL_OCELOT:
                return "Ocelot";
            case SOUL_WOLF:
                return "Wolf";
            case SOUL_SPIDER:
                return "Spider";
            case SOUL_ZOMBIE:
                return "Zombie";
            case SOUL_SKELETON:
                return "Skeleton";
            case SOUL_WITHER_SKELETON:
                return "Wither Skeleton";
            case SOUL_ZOMBIE_PIGMAN:
                return "Zombie Pigman";
            case SOUL_BLAZE:
                return "Blaze";
            case SOUL_GHAST:
                return "Ghast";
            case SOUL_CREEPER:
                return "Creeper";
            case SOUL_ENDERMAN:
                return "Enderman";
            case SOUL_GUARDIAN:
                return "Guardian";
            case SOUL_SILVERFISH:
                return "Silverfish";
            case SOUL_ENDER_DRAGON:
                return "Ender Dragon";
            case SOUL_VILLAGER:
                return "Villager";
            case SOUL_ZOMBIE_VILLAGER:
                return "Zombie Villager";
            case SOUL_ILLAGER:
                return "Illager";
            default:
                return null;
        }
    }

    // Gets the type enum of this Soul.
    public EnumSoulType getType() {
        return type;
    }
}
