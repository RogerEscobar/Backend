using System;

class Program 
{ 
    static void Main(string[] args)
{
    bool continuar = true;

    while (continuar)
    {
        Console.Clear();
        Console.WriteLine("Calculadora avanzada por consola (.NET 9)");
        Console.WriteLine("=========================================");

        Console.Write("Intruduce el primer número:");
        if (!double.TryParse(Console.ReadLine(), out double numero1))
        {
            Console.WriteLine("Entrada invalida, presiona cualquier tecla para continuar...");
            Console.ReadKey();
            continue;
        }

            Console.Write("Introduce el segundo número:");
            string imputNumero2 = Console.ReadLine() ?? "";
            double numero2 = 0;

            if (!string.IsNullOrWhiteSpace(imputNumero2) && !double.TryParse(imputNumero2, out numero2))
                {
                Console.WriteLine("Entrada invalida, presiona cualquier tecla para continuar...");
                Console.ReadKey();
                continue;
            }
            Console.WriteLine("Selecciona una operación");
            Console.WriteLine("1. Suma");
            Console.WriteLine("2. Resta");
            Console.WriteLine("3. Multiplicación");
            Console.WriteLine("4. División");
            Console.WriteLine("5. Raíz cuadrada");
            Console.WriteLine("6. Elevar al cuadrado");
            Console.WriteLine("7. Elevar a un número");
            Console.WriteLine("8. Salir");
            Console.Write("Tu eleeción: ");

            string operacion = Console.ReadLine() ?? "";
            double resultado;

            switch (operacion)
            {
                case "1": // Suma
                    resultado = numero1 + numero2;
                    Console.WriteLine($"Resultado: {resultado}");
                    break;

                case "2": // Resta
                    resultado = numero1 - numero2;
                    Console.WriteLine($"Resultado: {resultado}");
                    break;

                case "3": // Multiplicación
                    resultado = numero1 * numero2;
                    Console.WriteLine($"Resultado: {resultado}");
                    break;

                case "4": // División
                    if (numero2 != 0)
                    {
                        resultado = numero1 / numero2;
                        Console.WriteLine($"Resultado: {resultado}");
                    }
                    else
                    {
                        Console.WriteLine("Error: División entre cero no permitida.");
                    }
                    break;

                case "5": // Raíz cuadrada
                    if (numero1 >= 0)
                    {
                        resultado = Math.Sqrt(numero1);
                        Console.WriteLine($"Resultado: {resultado}");
                    }
                    else
                    {
                        Console.WriteLine("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    break;

                case "6": // Elevar al cuadrado
                    resultado = Math.Pow(numero1, 2);
                    Console.WriteLine($"Resultado: {resultado}");
                    break;

                case "7": // Elevar a un número
                    Console.Write("Introduce el exponente: ");
                    if (double.TryParse(Console.ReadLine(), out double exponente))
                    {
                        resultado = Math.Pow(numero1, exponente);
                        Console.WriteLine($"Resultado: {resultado}");
                    }
                    else
                    {
                        Console.WriteLine("Entrada inválida.");
                    }
                    break;

                case "8": // Salir
                    continuar = false;
                    Console.WriteLine("Saliendo del programa...");
                    break;

                default:
                    Console.WriteLine("Opción no válida.");
                    break;
            }
            if (continuar)
            {
                Console.WriteLine("Presiona cualquier tecla para continuar...");
                Console.ReadKey();
            }
        }
    }
}