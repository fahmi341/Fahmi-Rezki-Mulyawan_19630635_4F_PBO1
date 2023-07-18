package PBO;

import java.util.Scanner;
import sun.security.util.Length;

public class SuratIjinMengemudiBeraksi {
    public static void main (String[] args) {
        //objek
        //SuratIjinMengemudi sim = new SuratIjinMengemudi("Fahmi Rezki Mulyawan","19630635");

        //System.out.println(sim.displayInfo());
        //System.out.println(sim.displayInfo("AB"));
        //error handing

        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);

            //array
            SuratIjinMengemudiDetail[] sim = new SuratIjinMengemudiDetail[2];

            //perulangan
            for(int i=0; i<sim.length; i++){
                System.out.print("Masukan Nama Pendaftar "+(i+1)+": ");
                String nama = scanner.nextLine();
                System.out.print("Masukan Nik Pendaftar "+(i+1)+":" );
                String nik = scanner.nextLine();

            //objek
            sim[i] = new SuratIjinMengemudiDetail(nama, nik);
            }
            //perulangan
            for(SuratIjinMengemudiDetail data: sim){
                System.out.println("=========================");
                System.out.println("Data Pendaftar: ");
                System.out.println(data.displayInfo());
            
            }    
            
        } catch (NumberFormatException e){
            System.err.println("Kesalahan Format Pada Nomor: "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format Pada NIK");
        } catch (Exception e) {
            System.out.println("Kesalahan umum: "+e.getMessage());
        }
        
        }
    }
        

        