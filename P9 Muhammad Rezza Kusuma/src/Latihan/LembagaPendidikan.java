interface Lembaga {

    // variabel static final
    static final String Province = "Banten";
    static final String District = "Tangerang Selatan";

    // method abstract
    public void setName(String Name);
    public void setAddress(String Address);
    public void setPhone(String Phone);

    public String getName();
    public String getAddress();
    public String getPhone();
}

interface Tingkat {

    public void setLevel(String Level);
    public String getLevel();
}

class University implements Lembaga, Tingkat {

    String Name, Address, Phone, Level;

    // constructor
    public University(String Name, String Address, String Phone, String Level) {
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Level = Level;
    }

    // setter
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    // getter
    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }

    public String getLevel() {
        return Level;
    }

    // method toString
    public String toString() {
        return "Name : " + Name + "\n" +
               "Level : " + Level + "\n" +
               "Address : " + Address + "\n" +
               "Phone : " + Phone + "\n" +
               "District : " + District + "\n" +
               "Province : " + Province;
    }
}

class SMA implements Lembaga, Tingkat {

    String Name, Address, Phone, Level;

    // constructor
    public SMA(String Name, String Address, String Phone, String Level) {
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Level = Level;
    }

    // setter
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    // getter
    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }

    public String getLevel() {
        return Level;
    }

    // method toString
    public String toString() {
        return "Name : " + Name + "\n" +
               "Level : " + Level + "\n" +
               "Address : " + Address + "\n" +
               "Phone : " + Phone + "\n" +
               "District : " + District + "\n" +
               "Province : " + Province;
    }
}

public class LembagaPendidikan {

    public static void main(String[] args) {

        University Unpam = new University(
                "Universitas Pamulang",
                "Jl. Surya Kencana No. 1",
                "+62 21 7412566",
                "Universitas"
        );

        SMA SMAN2 = new SMA(
                "SMAN 2 Kota Tangerang Selatan",
                "Jl. Raya Puspiptek Muncul",
                "+62 21",
                "SLTA"
        );

        System.out.println("Informasi Lembaga Pendidikan :\n");
        System.out.println(Unpam.toString());

        System.out.println();

        System.out.println("Informasi Lembaga Pendidikan :\n");
        System.out.println(SMAN2.toString());
    }
}