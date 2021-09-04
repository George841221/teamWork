package models;

public class Character {

    private long id;
    private String name;
    private Class characterClass;
    private Race race;
    private byte[] design;
    private String Skill1;
    private String Skill2;
    private String Skill3;

    public Character(String name, Class characterClass, Race race, String skill1, String skill2, String skill3) {
        this.name = name;
        this.characterClass = characterClass;
        this.race = race;
        Skill1 = skill1;
        Skill2 = skill2;
        Skill3 = skill3;
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

    public Class getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(Class characterClass) {
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
}
