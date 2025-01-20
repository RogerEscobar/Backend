using System;

class Program
{
    static void Main(string[] args)
    {
        // Mensaje inicial
        Console.WriteLine("Bienvenido a mi primera calculadora por consola");
        Console.Write("Por favor, ingresa tu nombre: ");
        string nombre = Console.ReadLine() ?? "Usuario";

        // Ciclo principal
        bool continuar = true;
        while (continuar)
        {
            Console.Clear();
            Console.WriteLine($"Hola, {nombre}. ¿Qué operación deseas realizar?");
            Console.WriteLine("1. Suma");
            Console.WriteLine("2. Resta");
            Console.WriteLine("3. Multiplicación");
            Console.WriteLine("4. División");
            Console.WriteLine("5. Salir");
            Console.Write("Elige una opción (1-5): ");
            string opcion = Console.ReadLine() ?? "";

            // Verificar si el usuario quiere salir
            if (opcion == "5")
            {
                Console.WriteLine($"Gracias por usar la calculadora, {nombre}. ¡Hasta luego!");
                continuar = false;
                break;
            }

            // Validar opción válida
            if (opcion != "1" && opcion != "2" && opcion != "3" && opcion != "4")
            {
                Console.WriteLine("Opción no válida. Presiona cualquier tecla para intentarlo de nuevo...");
                Console.ReadKey();
                continue;
            }

            // Solicitar números
            Console.Write("Ingresa el primer valor: ");
            if (!double.TryParse(Console.ReadLine(), out double numero1))
            {
                Console.WriteLine("Número inválido. Presiona cualquier tecla para intentarlo de nuevo...");
                Console.ReadKey();
                continue;
            }

            Console.Write("Ingresa el segundo valor: ");
            if (!double.TryParse(Console.ReadLine(), out double numero2))
            {
                Console.WriteLine("Número inválido. Presiona cualquier tecla para intentarlo de nuevo...");
                Console.ReadKey();
                continue;
            }

            // Realizar la operación
            double resultado = 0;
            switch (opcion)
            {
                case "1":
                    resultado = numero1 + numero2;
                    break;
                case "2":
                    resultado = numero1 - numero2;
                    break;
                case "3":
                    resultado = numero1 * numero2;
                    break;
                case "4":
                    if (numero2 == 0)
                    {
                        Console.WriteLine("No se puede dividir entre cero. Presiona cualquier tecla para continuar...");
                        Console.ReadKey();
                        continue;
                    }
                    resultado = numero1 / numero2;
                    break;
            }

            // Mostrar resultado
            Console.WriteLine($"{nombre}, el resultado de tu operación es: {resultado}");
            Console.WriteLine("Presiona cualquier tecla para realizar otra operación...");
            Console.ReadKey();
        }
    }
}
