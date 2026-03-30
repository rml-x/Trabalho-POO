public class Forno {

    private final int volume;
    private final int tensao;
    private final int potencia;
    private final int largura;
    private final int altura;
    private final int profundidade;
    
    private boolean ligado;
    private int temperatura;
    private int timer; // em minutos (de 1 a 120)

    //forma de bolo
    public Forno(int volume, int tensao, int potencia, int largura, int altura, int profundidade){
        this.volume =  volume;
        this.tensao = tensao;
        this.potencia = potencia;
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
        this.ligado = false;
        this.temperatura = 0;
        this.timer = 0;
    }

    //get
    public boolean ligado(){
        return this.ligado;
    }
    public int temperatura(){
        return this.temperatura;
    }
    public int tempoRestante(){
        return this.timer;
    }

    public void aumentarTemperatura(){
        System.out.println("aumentando temp");
        if(this.ligado == false){
            this.ligado = true;
            this.temperatura = 50;
            System.out.println("ligando");
        }
        else if(this.temperatura < 300){
            if (this.temperatura == 200) {
                this.temperatura = 220;
                System.out.println(this.temperatura);
            } 
            else if (this.temperatura == 220) {
                this.temperatura = 250;
                System.out.println(this.temperatura);

            }
            else if (this.temperatura < 300) {
                this.temperatura += 50;
                System.out.println(this.temperatura);

            }
        } 
    }

    public void desligar(){
        if(this.ligado == true){
            this.ligado = false;
            this.temperatura = 0;
            System.out.println("desligando...");
        }
    }

    public void diminuirTemperatura(){
        System.out.println("diminuindo temperatura");
        if (this.ligado) {
            if (this.temperatura == 50) {
                this.ligado = false;
                this.temperatura = 0;
            } else if (this.temperatura == 220) {
                this.temperatura = 200;
                System.out.println(this.temperatura);
            } else if (this.temperatura == 250) {
                this.temperatura = 220;
                System.out.println(this.temperatura);
            } else if (this.temperatura > 50) {
                this.temperatura -= 50;
                System.out.println(this.temperatura);
            }
        }
    }

    public void setTimer(int minutos){
        System.out.println("set timer.." + minutos);
        if(minutos >= 1 && minutos <= 120){
            this.timer = minutos;
        }
    }

    public void tick(){
        if(this.timer > 0){
            this.timer -= 1;
            //System.out.println("tick");
        }
        if(this.timer == 0 && this.ligado){
            this.desligar();
            System.out.println("time up");
        }
    }
}