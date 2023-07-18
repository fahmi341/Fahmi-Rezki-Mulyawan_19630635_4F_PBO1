package PBO;

//inheritance
public class SuratIjinMengemudiDetail extends SuratIjinMengemudi{
    //overriding
    public SuratIjinMengemudiDetail(String nama, String nik) {
        super (nama, nik);
    }

    public int getTahunMendaftar(){
        return Integer.parseInt(getNik().substring(2, 4)) +2000;
    }
    
    public String getKantor(){
        String kodeKan = getNik().substring(2, 4);
        //seleksi if
        if(kodeKan.equals("10")){
            return "Kantor Polisi";
    } else {
            return "Polres";
            }
    }
    
    public String getPekerjaan() {
        String kodeKerjaan = getNik().substring(4, 6);
        //seleksi switch
        switch(kodeKerjaan){
            case "01":
                return"Pelajar";
            case"02":
                return"Pegawai";
            default:
                return "Swasta"; 
        }
    }
    
    public int getNoRegistrasi(){
        return Integer.parseInt(getNik().substring(6));
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nTahun Mendaftar:  "+getTahunMendaftar()+
                "\nKantor: "+getKantor()+
                "\nPekerjaan: "+getPekerjaan()+
                "\nNoRegistras: "+getNoRegistrasi();
    }
}