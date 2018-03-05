public class Mahasiswa2
{
    private int nrp;
    private String nama;
    
    public int getNrp(){
        return nrp;
    }
    public String getNama(){
        return nama;
    }
    
    public void Mahasiswa2(){
        nrp=0;
        nama="";
    }
    public void Mahasiswa2(String nama){
       nrp=0;
       this.nama=nama;
    }
    public void Mahasiswa2(int nrp,String nama){
       this.nrp=nrp;
       this.nama=nama;
    }
}
