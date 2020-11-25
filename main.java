public class main
{
    public static void main(String[] args)
    {
        Team Evos = new Team("Evos Roar");

        Anggota orang_1 = new Anggota("Pranaja", 20);
        Anggota orang_2 = new Anggota("Muhammad", 21);
        Anggota orang_3 = new Anggota("Bima", 22);

        Anggota orang_4 = new Trainee("Bima Aditya", 23, 24);
        Anggota orang_5 = new Trainee("Dedy Purniawan", 26, 27);
        Anggota orang_6 = new Trainee("Ilham Opic", 27, 29);

        Evos.addAnggota(orang_1);
        Evos.addAnggota(orang_2);
        Evos.addAnggota(orang_3);
        Evos.addAnggota(orang_4);
        Evos.addAnggota(orang_5);
        Evos.addAnggota(orang_6);

        Evos.displayAllMember();
        Evos.displayAllTraine();
    }

}
