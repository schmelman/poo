import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe Baralho
 */
public class Baralho
{
    private List<Carta> baralho = new ArrayList<Carta>();

	/**
	 * Construtor
	 */
    public Baralho()
    {
        Carta c;
        char naipe = 'o';
        int numCarta;
        String nome;

        for(int i = 0; i < 4; i++)
        {
            switch(i)
            {
                case 0:
                {
                    naipe = 'o';
                break;
                }
                case 1:
                {
                    naipe = 'e';
                break;
                }
                case 2:
                {
                    naipe = 'c';
                break;
                }
                case 3:
                {
                    naipe = 'p';
                break;
                }
            }// Switch i

            for(numCarta = 1; numCarta <= 13; numCarta++)
            {
                nome = String.format("%d-%c.png", numCarta, naipe);
                c = new Carta(nome, numCarta, naipe);
                baralho.add(c);
            }// for numCarta
        }// for naipe
    }// Construtor


	/**
	 * setBaralho
	 * @param x
	 */
    public void setBaralho(List<Carta> x)
    {
        this.baralho = x;
    }

	/**
	 * zeraBaralho
	 */
    public void zeraBaralho()
    {
        baralho.clear();
    }

	/**
	 * adiciona
	 * @param c
	 */
    public void adiciona(Carta c)
    {
        baralho.add(c);
    }

	/**
	 * embaralha
	 */
    public void embaralha()
    {
        Collections.shuffle(baralho);
    }

	/**
	 * qtdCartas
	 * @return
	 */
    public int qtdCartas()
    {
        return baralho.size();
    }

	/**
	 * getCarta
	 * @param pos
	 * @return
	 */
	public Carta getCarta(int pos)
	{
		Carta c = baralho.get(pos);
		baralho.remove(pos);
		return c;
	}

	/**
	 * toString
	 */
	public String toString()
	{
		String frase = "----- Baralho -----\n";
		for(Carta c:baralho)
			frase += c.toString();
		return frase;
	}
}