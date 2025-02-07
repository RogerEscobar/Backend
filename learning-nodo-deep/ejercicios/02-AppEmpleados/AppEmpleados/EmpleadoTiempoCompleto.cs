namespace MiAplicacionEmpleados
{
    public class EmpleadoTiempoCompleto : Empleado
    {
        public decimal SalarioAnual { get; set; }

        public EmpleadoTiempoCompleto(string nombre, decimal salarioAnual) : base(nombre)
        {
            SalarioAnual = salarioAnual;
        }

        public override decimal CalcularSalario()
        {
            return SalarioAnual;
        }

        public override string ToString()
        {
            return $"{base.ToString()} (Tiempo Completo)";
        }
    }
}