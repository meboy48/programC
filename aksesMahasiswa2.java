public class aksesMahasiswa2
{
    public static void main(String[]args){
        Mahasiswa2 mhs=new Mahasiswa2();
        System.out.println("Nama : "+mhs.getNama()+"\nNRP : "+mhs.getNrp());
        mhs.Mahasiswa2("Muhammad Nabil");
        System.out.println("Nama : "+mhs.getNama()+"\nNRP : "+mhs.getNrp());
        mhs.Mahasiswa2(400633,"Muhammad Nabil");
        System.out.println("Nama : "+mhs.getNama());
        System.out.println("NRP  : "+mhs.getNrp());
    }
}
