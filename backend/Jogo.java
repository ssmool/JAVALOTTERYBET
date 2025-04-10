package jogo.sena.backend;

public class Jogo {
    
    int[] d = new int[3];
    int v = 1;
    
    public void Jogo()
    {
        
    }
    
    public int[] Jogar(int volantes, int dezena1, int dezena2, int dezena3)
    {
        int[] r = new int[6];
        for(int counter=0; counter < volantes; counter++)
        {
            for(int c1=0; c1 < 6; c1++)
            {
               int rnd = (int)(Math.random()*60);
               if(rnd == 0)
                   rnd = (int)(Math.random()*60);
               r[c1] = rnd;
            }
        }
        return r;
    }
    
    public void CarregarDezenas(Object obj)
    {
        javax.swing.JComboBox temp = (javax.swing.JComboBox)(obj);
        temp.addItem("Nenhuma");
        temp.addItem(1);
        for(int counter=1; counter <= 50/10; counter++)
            temp.addItem(counter*10);
    }
    
    public void CarregarVolantes(Object obj)
    {
        javax.swing.JComboBox temp = (javax.swing.JComboBox)(obj);
        for(int counter=1; counter <= 6; counter++)
            temp.addItem(counter);
    }
    
    public void CarregarHistorico()
    {
    }
    
    public void CarregarMeuHistorico()
    {
    }
}
