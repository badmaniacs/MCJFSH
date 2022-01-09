package homework.day9;

public class Two {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setLocation("space");
        System.out.println(a.getLocation());
        a.setLocation("air");
        System.out.println(a.getLocation());
    }    
}

class Animal {
    private String name;
    private String location;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        if (location.equals("land") || location.equals("sea") || location.equals("air")) {
            this.location = location;
        }
        else {
            System.out.println("잘못된 입력");
        }        
    }
}