//Ketika kita memiliki sebuah null referensi „r‟, kita mungkin akan berpikir jika „r‟ tidak null maka kita gunakan, dengan kata lain kita akan menggunakan nilai non null „x‟ val l: Int = if (b != null) b.length else -1
fun main(args: Array<String>) {
//Elvis Operator ?:
    var maybeWelcome: String? = "Hello world"

    println(maybeWelcome?.length ?: 0)
}