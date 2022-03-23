/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11211100076;

/**
 *
 * @author alunocmc
 */
public class corpo_humano {
    public float massa;
    private float densidade;
    private float volume;
    private float altura;
    
    public corpo_humano(float massa,float volume, float altura)
    {        
        this.massa = massa;
        this.volume = volume;
        this.altura = altura;
        densidade = massa / volume;
    }

    corpo_humano(int i, float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public float GetMassa()
    {
        return massa;
    }
    public float GetVolume()
    {
        return volume;
    }
    public float GetDensidade()
    {
        return densidade;
    }
    
    public void SetMassa(float massa)
    {
        this.massa = massa;
        densidade = massa / volume;
        
    }
    private void SetVolume(float volume)
    {
        this.volume = volume;
        densidade = massa / volume;
    }
    public float calcIMC()
    {
        float imc = massa/(altura*altura);
        return imc;
    }
}

/*
Respondendo as questões:
1- é apontado um erro dizendo que e preciso tornar a classe pública, e a conclusão é que não rodou quando era privada, mas rodou quando se tornou pública

2- quando é public roda de forma normal, isso demonstra que quando está privado a main não consegue acessar a massa

3- não é possível acessar pelo fato de estar privado 
*/