import java.util.ArrayList;
public class Team
{
    private String nama;
    private ArrayList<Anggota> anggota;

    public Team(String nama)
    {
        this.nama = nama;
        anggota = new ArrayList<>();
    }

    public void addAnggota(Anggota a)
    {
        anggota.add(a);
    }

    public void displayAllMember()
    {
        System.out.println("ANGGOTA TIM " + nama);
        for(Anggota a : anggota)
        {
            a.display();
            System.out.println();
        }
    }

    public void displayAllTraine()
    {
        System.out.println("Trainee TIM " + nama);
        for(Anggota a : anggota)
        {
            if(a instanceof Trainee)
            {
                Trainee trainee = (Trainee) a;
                trainee.display();
                System.out.println();
            }
        }
    }

}
