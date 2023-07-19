# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Daftar Surat Ijin Mengemudi menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NIK tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `SuratIjinMengemudi`, `SuratIjinMengemudiDetail`, dan `SuratIjinMengemudiBeraksi` adalah contoh dari class.

```bash
//class
public class SuratIjinMengemudi {

    ...
}

public class SuratIjinMengemudiDetail extends SuratIjinMengemudi {
    ...
}

public class SuratIjinMengemudi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new SuratIjinMengemudiDetail(nama, nik);` adalah contoh pembuatan object.

```bash
mhs[i] = new SuratIjinMengemudiDetail(nama, nik);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `nik` adalah contoh atribut.

```bash
    private String nama;
    private String nik;


4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `SuratIjinMengemudi` dan `SuratIjinMengemudiDetail`.

//constructor
public SuratIjinMengemudi(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }

public SuratIjinMengemudiDetail(String nama, String nik) {
        super (nama, nik);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNik` adalah contoh method mutator.

```bash
    //mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNik`, `getTahunMendaftar`, `getKantor`, `getPekerjaan`, dan `getNoRegistrasi` adalah contoh method accessor.

```bash
//accessor (getter)
public String getNama() {
   return nama;
}

public String getNik() {
    return nik;
 }

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `nik` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 encapsulation
    private String nama;
    private String nik;

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SuratIjinMengemudiDetail` mewarisi `SuratIjinMengemudi` dengan sintaks `extends`.

```bash
//inheritance
public class SuratIjinMengemudiDetail extends SuratIjinMengemudi{
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `SuratIjinmengemudiDetail` merupakan override dari method `displayInfo` di `SuratIjinMengemudi`.

```bash
    //polymophism
    public String displayInfo(String Gender){
        return displayInfo() + "\nGender: "+Gender;
    }

    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nTahun Mendaftar:  "+getTahunMendaftar()+
                "\nKantor: "+getKantor()+
                "\nPekerjaan: "+getPekerjaan()+
                "\nNoRegistras: "+getNoRegistrasi();

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
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
    
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
 //perulangan
             for(SuratIjinMengemudiDetail data: sim){
                System.out.println("=========================");
                System.out.println("Data Pendaftar: ");
                System.out.println(data.displayInfo());
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
 Scanner scanner = new Scanner(System.in);
System.out.print("Masukan Nama Pendaftar "+(i+1)+": ");
 String nama = scanner.nextLine();

    System.out.print("Masukan Nik Pendaftar "+(i+1)+":" );
                String nik = scanner.nextLine();

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
//array
            SuratIjinMengemudiDetail[] sim = new SuratIjinMengemudiDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
        } catch (NumberFormatException e){
            System.err.println("Kesalahan Format Pada Nomor: "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format Pada NIK");
        } catch (Exception e) {
            System.out.println("Kesalahan umum: "+e.getMessage());
        }
```

## Usulan nilai


| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Fahmi Rezki Mulyawan
NPM: 19630635
Kelas: 4F

Selamat Berlibur bapa Sehat Selalu
