package DZ_3;
import java.util.Objects;
public class Adressat {
   private String name;
   private String surname;
   private String status;
   private long numberPhone;

    public Adressat(String name, String surname, String status, long numberPhone) {
        this.name = name;
        this.surname = surname;
        this.status = status;
        this.numberPhone = numberPhone;
    }

    public Adressat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(long numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adressat adressat1 = (Adressat) o;

        if (numberPhone != adressat1.numberPhone) return false;
        if (name != null ? !name.equals(adressat1.name) : adressat1.name != null) return false;
        if (surname != null ? !surname.equals(adressat1.surname) : adressat1.surname != null) return false;
        return status != null ? status.equals(adressat1.status) : adressat1.status == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (int) (numberPhone ^ (numberPhone >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Adressat{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", status='" + status + '\'' +
                ", numberPhone=" + numberPhone +
                '}';
    }
}
