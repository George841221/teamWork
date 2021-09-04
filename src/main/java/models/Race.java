package models;

public enum Race {
    HUMAN,
    ORC,
    ELF,
    UNDEAD,
    HALFLING;

    public int getDBIndex(){
        return ordinal() +1;
    }

}
