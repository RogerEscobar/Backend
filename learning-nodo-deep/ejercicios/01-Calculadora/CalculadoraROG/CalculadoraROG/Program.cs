using System;
using System.Numerics;

class Program
{
    static void Main(string[] args)
    {
        // Mensaje inicial
        Console.WriteLine("=================================================");
        Console.WriteLine("Bienvenido a mi primera calculadora por consola");
        Console.WriteLine("=================================================");
        Console.WriteLine("");
        Console.Write("Por favor, ingresa tu nombre: ");
        string nombre = Console.ReadLine() ?? "Usuario";

        // Ciclo principal
        bool continuar = true;
        while (continuar)
        {
            Console.Clear();
            Console.WriteLine($"Hola, {nombre}. ¿Qué operación deseas realizar?");
            Console.WriteLine("");
            Console.WriteLine("Selecciona una operación");
            Console.WriteLine("");
            Console.WriteLine("1. Suma");
            Console.WriteLine("2. Resta");
            Console.WriteLine("3. Multiplicación");
            Console.WriteLine("4. División");
            Console.WriteLine("5. Raíz cuadrada");
            Console.WriteLine("6. Elevar al cuadrado");
            Console.WriteLine("7. Elevar a un número");
            Console.WriteLine("9. Salir");
            Console.WriteLine("");
            Console.Write("Elige una opción (1-9): ");
            string opcion = Console.ReadLine() ?? "";

            // Verificar si el usuario quiere salir de la calculadora
            if (opcion == "9")
            {
                Console.WriteLine("");
                Console.WriteLine("=========================================================");
                Console.WriteLine($"Gracias por usar la calculadora, {nombre}. ¡Hasta luego!");
                Console.WriteLine("=========================================================");
                continuar = false;
                break;
            }

            // Validar opción marcada por el usuario si sea válida
            if (opcion != "1" && opcion != "2" && opcion != "3" && opcion != "4" && opcion != "5" && opcion != "6" && opcion != "7")
            {
                Console.WriteLine("Opción no válida. Presiona cualquier tecla para intentarlo de nuevo...");
                Console.ReadKey();
                continue;
            }

            // Solicitar números al usuario
            Console.Write("Ingresa el primer valor: ");
            if (!double.TryParse(Console.ReadLine(), out double numero1))
            {
                Console.WriteLine("Número inválido. Presiona cualquier tecla para intentarlo de nuevo...");
                Console.ReadKey();
                continue;
            }

            //Números complejos
            double resultadoReal = 0;
            Complex resultadoComplejo = new Complex(0, 0);
            bool usaComplejo = false; //diferenciar el tipo de resultado complejo vs real

            // Operaciones con dos valores
            if (opcion == "1" || opcion == "2" || opcion == "3" || opcion == "4" || opcion == "7")
            {
                Console.Write("Ingresa el segundo valor: ");
                if (!double.TryParse(Console.ReadLine(), out double numero2))
                {
                    Console.WriteLine("Número inválido. Presiona cualquier tecla para intentarlo de nuevo...");
                    Console.ReadKey();
                    continue;
                }

                switch (opcion)
                {
                    case "1": //suma
                        resultadoReal = numero1 + numero2;
                        break;
                    case "2": //resta
                        resultadoReal = numero1 - numero2;
                        break;
                    case "3": //multiplicación
                        resultadoReal = numero1 * numero2;
                        break;
                    case "4": //división
                        if (numero2 == 0)
                        {
                            Console.WriteLine("");
                            Console.WriteLine("No se puede dividir entre cero. Presiona cualquier tecla para continuar...");
                            Console.ReadKey();
                            continue;
                        }
                        resultadoReal = numero1 / numero2;
                        break;
                    case "7": //elevar a un número
                        resultadoReal = Math.Pow(numero1, numero2);
                        break;
                }
            }
            else
            {
                switch (opcion)
                {
                    case "5": //raíz cuadrada
                        if (numero1 >= 0)
                        {
                            resultadoReal = Math.Sqrt(numero1);
                        }
                        else
                        {
                            usaComplejo = true;
                            resultadoComplejo = Complex.Sqrt(new Complex(numero1, 0));
                        }
                        break;
                    case "6": //elevar al cuadrado
                        resultadoReal = Math.Pow(numero1, 2);
                        break;
                }
            }

            // Mostrar resultado
            if (usaComplejo)
            {
                Console.WriteLine("");
                Console.WriteLine("===============================================================");
                Console.WriteLine($"{nombre}, el resultado de tu operación es: {resultadoComplejo}");
                Console.WriteLine("===============================================================");
            }
            else
            {
                Console.WriteLine("");
                Console.WriteLine("===========================================================");
                Console.WriteLine($"{nombre}, el resultado de tu operación es: {resultadoReal}");
                Console.WriteLine("===========================================================");
            }

            Console.WriteLine("");
            Console.WriteLine("Presiona cualquier tecla para realizar otra operación...");
            Console.ReadKey();
        }

    }
}
