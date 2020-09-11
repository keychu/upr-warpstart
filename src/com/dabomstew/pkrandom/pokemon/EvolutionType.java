package com.dabomstew.pkrandom.pokemon;

public enum EvolutionType {
    /* @formatter:off */
    LEVEL(1, 1, 4, 4, 4),
    STONE(2, 2, 7, 7, 8),
    TRADE(3, 3, 5, 5, 5),
    TRADE_ITEM(-1, 3, 6, 6, 6),
    HAPPINESS(-1, 4, 1, 1, 1),
    HAPPINESS_DAY(-1, 4, 2, 2, 2),
    HAPPINESS_NIGHT(-1, 4, 3, 3, 3),
    LEVEL_ATTACK_HIGHER(-1, 5, 8, 8, 9),
    LEVEL_DEFENSE_HIGHER(-1, 5, 10, 10, 11),
    LEVEL_ATK_DEF_SAME(-1, 5, 9, 9, 10),
    LEVEL_LOW_PV(-1, -1, 11, 11, 12),
    LEVEL_HIGH_PV(-1, -1, 12, 12, 13),
    LEVEL_CREATE_EXTRA(-1, -1, 13, 13, 14),
    LEVEL_IS_EXTRA(-1, -1, 14, 14, 15),
    LEVEL_HIGH_BEAUTY(-1, -1, 15, 15, 16), //last in Ruby proper
    STONE_MALE_ONLY(-1, -1, 0x17, 16, 17), //0x17
    STONE_FEMALE_ONLY(-1, -1, 0x18, 17, 18), //0x18
    LEVEL_ITEM_DAY(-1, -1, 0x14, 18, 19), //0x14
    LEVEL_ITEM_NIGHT(-1, -1, 0x15, 19, 20), //0x15
    LEVEL_WITH_MOVE(-1, -1, 0x12, 20, 21), //0x12
    LEVEL_WITH_OTHER(-1, -1, -1, 21, 22), //none
    LEVEL_MALE_ONLY(-1, -1, 0x10, 22, 23), //0x10
    LEVEL_FEMALE_ONLY(-1, -1, 0x11, 23, 24), //0x11
    LEVEL_ELECTRIFIED_AREA(-1, -1, -1, 24, 25), //0x13... (none)
    LEVEL_MOSS_ROCK(-1, -1, -1, 25, 26), //0x13... (none)
    LEVEL_ICY_ROCK(-1, -1, -1, 26, 27), //0x13... (none)
    TRADE_SPECIAL(-1, -1, -1, -1, 7),
    ////////////////////
    LEVEL_MAP(-1, -1, 0x13, -1, -1), //0x13
    LEVEL_WITH_PARTY_SPECIES(-1, -1, 0x16, -1, -1),   //0x16
    LEVEL_WITH_PARTY_TYPE(-1, -1, 0x19, -1, -1),  //0x19
    LEVEL_RAIN(-1, -1, 0x1A, -1, -1), //0x1A
    LEVEL_WITH_MOVE_TYPE(-1, -1, 0x1B, -1, -1), //0x1B
    LEVEL_RARE_CANDY(-1, -1, 0x1C, -1, -1), //0x1C
    LEVEL_DAY(-1, -1, 0x1D, -1, -1), //0x1D
    LEVEL_NIGHT(-1, -1, 0x1E, -1, -1), //0x1E
    NONE(-1, -1, -1, -1, -1);
    /* @formatter:on */

    private int[] indexNumbers;
    private static EvolutionType[][] reverseIndexes = new EvolutionType[5][36]; //NEWWARP CHANGED

    static {
        for (EvolutionType et : EvolutionType.values()) {
            for (int i = 0; i < et.indexNumbers.length; i++) {
                if (et.indexNumbers[i] > 0 && reverseIndexes[i][et.indexNumbers[i]] == null) {
                    reverseIndexes[i][et.indexNumbers[i]] = et;
                }
            }
        }
    }

    private EvolutionType(int... indexes) {
        this.indexNumbers = indexes;
    }

    public int toIndex(int generation) {
        return indexNumbers[generation - 1];
    }

    public static EvolutionType fromIndex(int generation, int index) {
        return reverseIndexes[generation - 1][index];
    }

    public boolean usesLevel() {
        return (this == LEVEL) || (this == LEVEL_ATTACK_HIGHER) || (this == LEVEL_DEFENSE_HIGHER)
                || (this == LEVEL_ATK_DEF_SAME) || (this == LEVEL_LOW_PV) || (this == LEVEL_HIGH_PV)
                || (this == LEVEL_CREATE_EXTRA) || (this == LEVEL_IS_EXTRA) || (this == LEVEL_MALE_ONLY)
                || (this == LEVEL_FEMALE_ONLY) || (this == LEVEL_MAP) || (this == LEVEL_WITH_PARTY_SPECIES)
                || (this == LEVEL_WITH_PARTY_TYPE) || (this == LEVEL_RAIN) || (this == LEVEL_WITH_MOVE_TYPE)
                || (this == LEVEL_RARE_CANDY) || (this == LEVEL_DAY) || (this == LEVEL_NIGHT);
    }
}
