package models;

public enum CharacterClass {
    MAGE,
    WARRIOR,
    ROGUE,
    PRIEST,
    SHAMAN;

    public int getDBIndex(){
        return ordinal() +1;
    }

}
