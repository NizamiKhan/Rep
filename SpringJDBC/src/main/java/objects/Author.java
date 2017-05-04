package objects;

public class Author {

    private int id;
    private String fio;
    private String birthday;

    public Author() {
    }

    public Author(int id, String fio, String birthday) {
        this.id = id;
        this.fio = fio;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
