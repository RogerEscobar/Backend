using System;
namespace HolaMundo
{
    public static class Logger {
        public static void Log(string message){
            Console.WriteLine(message);
        }
    }
//Ejemplo clase publica
    public class MiEjemploClase {
        public int MiEjemploVariable;
    }
//Se puede usar un metodo para toda la gestión Logger
    class Program{
    static void Main(string [] args){

//Ejemplos variable
        MiEjemploClase miEjemploClase = MiEjemploClase();
        miEjemploClase

        Logger.Log("Como te llamas?");
        string nombre = Console.ReadLine() ?? "Invitado";
        Logger.Log($"Hola, {nombre}");
    }
}
// Esta forma genera alert por el null que se resuelve con "Invitado"
/*     class Program{

        static void Main(string[] args){
            Console.WriteLine("¿Cómo te llamas?");
            string nombre = Console.ReadLine();
            Console.WriteLine($"Hola, {nombre}");
        }
    } */

}