import java.util.Scanner;

public class data extends awaldata{

    private String nama; 
    private String alamat;
    private int nohp ;
    private int pil;
    private int harga;
    private int tgl;
    
    Scanner input = new Scanner (System.in);
    
    public void data(){
        System.out.println("----------------MASUKKAN DATA ANDA-------------");
        System.out.print("Masukkan nama anda   : ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat anda : ");
        alamat = input.nextLine();
        System.out.print("Masukkan no HP anda  : ");
        nohp = input.nextInt();
        System.out.print("Masukkan pilihan anda anda  : ");
        pil = input.nextInt();

    }
    
    
    public void harga() {
        switch (pil){
            case 1:
                harga=500000;
                System.out.println("========================================================");
                System.out.println("fasilitas kamar             : AC + kamar mandi dalam ");
                System.out.println("harga kamar                 : "+harga);
                System.out.println("pembayaran setiap tanggal   : "+tgl);
                System.out.println("========================================================");
                break;
                
            case 2:
                harga=400000;
                System.out.println("========================================================");
                System.out.println("fasilitas kamar             : AC + kamar mandi luar ");
                System.out.println("harga kamar                 : "+harga);
                System.out.println("pembayaran setiap tanggal   : "+tgl);
                System.out.println("========================================================");
                break;
                
            case 3:
                harga=300000;
                System.out.println("========================================================");
                System.out.println("fasilitas kamar             :kipas + kamar mandi dalam  ");
                System.out.println("harga kamar                 : "+harga);
                System.out.println("pembayaran setiap tanggal   : "+tgl);
                System.out.println("========================================================");

                break;
                
            case 4:
                harga=250000;
                System.out.println("========================================================");
                System.out.println("fasilitas kamar             : kipas + kamar mandi luar");
                System.out.println("harga kamar                 : "+harga);
                System.out.println("pembayaran setiap tanggal   : "+tgl);
                System.out.println("========================================================");

                break;
            default:
                System.out.println("tidak ada dalam pilihan");
            }
        }
        
    public void output(){
            System.out.println("=============BUKTI SEWA KAMAR KOST====================");
            System.out.println("Nama penyewa    : "+nama);
            System.out.println("Alamat penyewa  : "+alamat);
            System.out.println("No HP penyewa   : "+nohp);
            harga();
        }
    }
    
    
    
