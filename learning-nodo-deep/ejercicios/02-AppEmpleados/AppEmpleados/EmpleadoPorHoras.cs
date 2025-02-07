namespace MiAplicacionEmpleados
{
    public class EmpleadoPorHoras : Empleado
    {
        public int HorasTrabajadas { get; set; }
        public decimal TarifaPorHora { get; set; }

        public EmpleadoPorHoras(string nombre, int horasTrabajadas, decimal tarifaPorHora) : base(nombre)
        {
            HorasTrabajadas = horasTrabajadas;
            TarifaPorHora = tarifaPorHora;
        }

        public override decimal CalcularSalario()
        {
            return HorasTrabajadas * TarifaPorHora;
        }

        public override string ToString()
        {
            return $"{base.ToString()} (Por Horas)";
        }
    }
}