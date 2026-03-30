public class MaquinaAgua {

    private int agua;
    private int copos200;
    private int copos300;

    //getters
    public int agua(){
        return this.agua;
    }
    public int copos200(){
        return this.copos200;
    } 
    public int copos300(){
        return this.copos300;
    }   

    //setters
    public void abastecerAgua(){
        this.agua = 20000;
        System.out.println("tanque cheio!");
    }
    public void abastecerCopo200(){
        this.copos200 = 100;
        System.out.println("copos 200ml - cheio");
    }
    public void abastecerCopo300(){
        this.copos300 = 100;
        System.out.println("copos 200ml - cheio");
    }

    public void servirCopo200(){
        if(this.copos200 > 0 && this.agua >= 200){
            this.copos200 -= 1;
            this.agua -= 200;
        }
        else{
            System.out.println("200ml - copos ou água insuficiente");
        }
    }
    public void servirCopo300(){
        if(this.copos300 > 0 && this.agua >= 300){
            this.copos300 -= 1;
            this.agua -= 300;
        }
        else{
            System.out.println("300ml - copos ou água insuficiente");
        }
    }
}

