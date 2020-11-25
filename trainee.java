

public class Trainee extends Anggota
{
    private int lamaTraining;

    public Trainee( String nama, int umur, int lamaTraining)
    {
        super(nama,umur);
        this.lamaTraining = lamaTraining;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Lama Training : "+ lamaTraining);
    }
}
