object Ej1 {

    case class Producto(nombre: String, precio: Double, stock: Int)

    def clasificar(producto: Producto): String = producto match
        case Producto(_, _, 0) => "Sin stock"
        case Producto(_, precio, _) if precio >= 1000 => "Producto premium"
        case _ => "Producto estándar"

    def main(args: Array[String]): Unit = {
        println(clasificar(Producto("Mouse", 50.0, 0)))
        println(clasificar(Producto("Laptop", 3500.0, 5)))
        println(clasificar(Producto("Cuaderno", 15.0, 100)))
    }
}