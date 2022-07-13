class first{
    protected int Kamay;
    
    public void gwapo(){
        System.out.println(Kamay);
    }
}
class second extends first{
    second(){
        Kamay=5;
        
    }
}

class Main{
    public static void main (String[]args){
        second d=new second();
        d.gwapo();
    }
}

//output (5)