public class Anggota
{
    protected String nama;
    protected int umur;

    public Anggota(String nama, int umur)
    {
        this.nama = nama;
        this.umur = umur;
    }

    public void display()
    {
        System.out.println("Nama : "+ nama);
        System.out.println("Umur : "+ umur);
    }

}
