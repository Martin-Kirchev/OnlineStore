package Roles;

public class Role {

    private int id;
    private String name;

    Role(int id, String name){

        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
