package PBO;

//class
public class SuratIjinMengemudi {

    //atribut dan encapsulation
    private String nama;
    private String nik;

    //construktor

    public SuratIjinMengemudi(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }


    //mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    //accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }
    
    public String displayInfo() {
        return "Nama: "+getNama()+
                "\nNIK: "+getNik();
    }
    
    //py
    public String displayInfo(String Gender){
        return displayInfo() + "\nGender: "+Gender;
    }
}
