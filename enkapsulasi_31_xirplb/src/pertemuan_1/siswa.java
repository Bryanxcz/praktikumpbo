package pertemuan_1;

/**
 *
 * @author Bryanxcz_
 */
public class siswa {
    
    private String nama;
    private int nilai = 0;
    private String kelas;
    private int nisn = 0;
    private String alamat;
    
    public void isiData(){
        nama = "Bryamxcz";
        nilai = 100;
        kelas = "XI RPL B";
        nisn = 21421123;
        alamat = "Jl.albro, Everywhere";
    }
    
    public void cetak (){
        System.out.println("Nama    : " + nama);
        System.out.println("Nilai   : " + nilai);
        System.out.println("Kelas   : " + kelas);
        System.out.println("NISN   : " + nisn);
        System.out.println("Alamat   : " + alamat);
}
}