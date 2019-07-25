package com.dabomstew.pkrandom.constants;

public class RubyPrefixes {   
    public static final String PokemonStats = "000000000000000000000000000000000000000000000000000000002D31312D";
    public static final String PokemonMovesets = "2008"; //special check needed
    public static final String PokemonTMHMCompat = "000000000000000020073584081EE40020073584081EE40030473586081EE400";
    public static final String PokemonEvolutions = "000000000000000000000000000000000000000000000000000000000000000000000000000000000400100002000000";
    public static final String StarterPokemon = "150118011B010000A000008000040000";
    public static final String StarterItems = "0022002343F0";
    public static final String TrainerData = "00000000FF000000000000000000000000000000000000000000000000000000000000000000000000020646BBCCBDC2";
    public static final String TrainerClassNames = "535400CECCBBC3C8BFCCFF0000535400CECCBBC3C8BFCCFF0000BBCBCFBB00C6";
    public static final String ItemData = "ACACACACACACACACFF"; //special check needed
    public static final String MoveData = "00000000000000000000000000280064";
    public static final String MoveDescriptions = "3B08"; //special check needed
    public static final String MoveNames = "AEFFFFFFFFFFFFFF0000000000CAC9CF";
    public static final String AbilityNames = "AEAEAEAEAEAEAEFF0000000000CDCEBF";
    public static final String TmMoves = "0801510160015B012E005C0002015301";
    //four intro-related offsets probably shouldn't change. then:
    public static final String PokemonFrontSprites = "2415D008000800008CFDD20800080100";
    public static final String PokemonNormalPalettes = "B419D008000000002400D30801000000";
    public static final String TradeTableOffset = "C7BBC5C3CEFF0000000000004F010505";
    public static final String RunIndoorsTweakOffset = "082803D1012002E028E80202002002BC";
    public static final String CatchingTutorialOpponentMonOffset = "C42149000522B9";
    public static final String CatchingTutorialPlayerMonOffset = "9021490000240094019402940394281C";
    public static final String PCPotionOffset = "0D00010000000000"; //special check needed
    public static final String[] StaticLileepOffset = {"84010F00", "84011400"};
    public static final String[] StaticAnorithOffset = {"86010F00", "86011400"};
    public static final String[] StaticGroudonOffset = {"95010200", "95012D00", "95010200"};
    public static final String[] StaticRegirockOffset = {"91010200", "91012800"};
    public static final String[] StaticRegiceOffset = {"92010200", "92012800"};
    public static final String[] StaticRegisteelOffset = {"93010200", "93012800"};
    public static final String[] StaticLatiasOffset = {"97010000", "970132BF"};
    public static final String[] StaticRayquazaOffset = {"96014600", "96010200"};
    public static final String[] StaticKecleonsOffset = {"3D010200", "3D011E00"};
    public static final String[] StaticKecleonStevenOffset = {"3D010200", "3D011E00"}; //same as last - relies on starting search from old offset and returning first found
    public static final String[] StaticVoltorb1Offset = {"64001900", "64000200"};
    public static final String[] StaticVoltorb2Offset = {"64001900", "64000200"}; //NOT UNIQUE - special check needed
    public static final String[] StaticVoltorb3Offset = {"64001900", "64000200"}; //NOT UNIQUE - special check needed
    public static final String[] StaticElectrode1Offset = {"65001E00", "65000200"};
    public static final String[] StaticElectrode2Offset = {"65001E00", "65000200"}; //NOT UNIQUE - special check needed
    public static final String[] StaticWynautEggOffset = {"68016C02"};
    public static final String[] StaticBeldumOffset = {"8E010500", "8E010F00"};
    public static final String[] StaticCastformOffset = {"810119D1"};
}