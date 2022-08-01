package LambdaImpl.Data;

/**
 * @author Novin on 04/07/2022
 * @project Learn-Java-Lambda
 */
public class Person {
    public Person(String nama, String address) {
        this.nama = nama;
        this.address = address;
    }

    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;
}
