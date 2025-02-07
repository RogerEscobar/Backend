using System;
using System.Collections.Generic;

namespace MiAplicacionEmpleados
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Empleado> empleados = new List<Empleado>
            {
                new EmpleadoTiempoCompleto("Juan Pérez", 5000000),
                new EmpleadoPorHoras("Ana Gómez", 160000, 48),
                new EmpleadoTiempoCompleto("Carlos López", 6000000),
                new EmpleadoPorHoras("María Rodríguez", 90000, 25)
            };

            foreach (var empleado in empleados)
            {
                Console.WriteLine($"{empleado.ToString()} - Salario: {empleado.CalcularSalario():C}");
            }

            Console.WriteLine("\nPresiona cualquier tecla para salir...");
            Console.ReadKey();
        }
    }
}