package models;

public class Character {

    private long id;
    private String name;
    private CharacterClass characterClass;
    private Race race;
    private byte[] design;
    private String Skill1;
    private String Skill2;
    private String Skill3;

    public Character(String name, CharacterClass characterClass, Race race, String skill1) {
        this.name = name;
        this.characterClass = characterClass;
        this.race = race;
        Skill1 = skill1;

    }

    public Character(long id, String name, CharacterClass characterClass, Race race, String skill1) {
        this.id = id;
        this.name = name;
        this.characterClass = characterClass;
        this.race = race;
        Skill1 = skill1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public byte[] getDesign() {
        return design;
    }

    public void setDesign(byte[] design) {
        this.design = design;
    }

    public String getSkill1() {
        return Skill1;
    }

    public void setSkill1(String skill1) {
        Skill1 = skill1;
    }

    public String getSkill2() {
        return Skill2;
    }

    public void setSkill2(String skill2) {
        Skill2 = skill2;
    }

    public String getSkill3() {
        return Skill3;
    }

    public void setSkill3(String skill3) {
        Skill3 = skill3;
    }

    @Override
    public String toString() {
        return id + " - " +
                name + "," +
                characterClass + "," +
                race +
                Skill1;
    }

}
