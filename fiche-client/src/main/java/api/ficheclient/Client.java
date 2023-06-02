package api.ficheclient;

public class Client {
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String id;
    private String name;
    private int age;

    public Client(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Constructeur, getters, setters
    // ...

    // Exemple de méthode pour vérifier si l'utilisateur est majeur
    public boolean isAdult() {
        return age >= 18;
    }

    public String getId() {
        return id;
    }
}
