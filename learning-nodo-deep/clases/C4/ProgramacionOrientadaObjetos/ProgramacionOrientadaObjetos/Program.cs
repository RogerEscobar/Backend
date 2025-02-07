//Clase = Plantilla donde se definen atributos y métodos para modelar un objeto

public abstract class Vehiculo
{
    public string Marca { get; set; }
    public string Modelo { get; set; }
    public abstract void Conducir ();
    public virtual void Detener ()
    {
        Console.WriteLine("El vehículo se detuvo");
    }
 }
//Herencia de clases ejemplo 1
public class Coche : Vehiculo 
{
    public override void Conducir()
    {
        Console.WriteLine ($"Estoy conduciendo un coche {Marca} que es del año {Modelo}");
    }
    //sobreescribir el metodo detener
    public override void Detener()
    {
        /*No se utiliza la base para usar el console
        base.Detener();*/
        Console.WriteLine ("El coche se detuvo de forma segura");
    }
}

//Herencia de clases ejemplo 2
public class Bicicleta : Vehiculo 
{
    public override void Conducir()
    {
        Console.WriteLine ($"Pedaleando la bicicleta {Marca} del año {Modelo}");
    }
}