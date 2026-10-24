object Ej4 {

    case class Inventario(producto: String, cantidad: Int)

    def agregar(inventario: Inventario, cantidad: Int): Inventario = inventario.copy(cantidad = inventario.cantidad + cantidad)

    def main(args: Array[String]): Unit = {

        val original = Inventario("Teclado", 10)

        val actualizado = agregar(original, 5)

        println(original)
        println(actualizado)
        println(original)
    }
}