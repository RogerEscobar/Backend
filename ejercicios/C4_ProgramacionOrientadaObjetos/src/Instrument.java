public class Instrument {
    public void play(){
        System.out.println("Tocando un instrumento");
    }
}
class Guitar extends Instrument {
    public void play(){
        System.out.println("Tocando una guitarra");
    }
}

class Piane extends Instrument {
    public void play(){
        System.out.println("Tocando un piano");
    }
}

class Drum extends Instrument {
    public void play(){
        System.out.println("Tocando un tambor");
    }
}