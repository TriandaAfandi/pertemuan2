//Untuk membuat sebuah array bisa menggunakan fungsi arrayOf() dan melewatkan nilai item kepada array tersebut, jadi arrayOf(1,2,3) berarti membuat array dengan item [1,2,3].
//Alternative lain untuk membuat array dengan ukuran tertentu bisa dilakukan dengan fungsi arrayOfNulls()..
fun main(args: Array<String>) {

//Array
    var arrA = arrayOf<Int>()
    arrA += 34
    println(arrA[0])
    var arrB = arrayOf<Int>()
    for (i in 1..10) {
        arrB += i
    }
    for (i in arrB) {
        print("$i ")
    }

    //pembuatan array berdasarkan template Array standard Kotlin
    // Creates an Array<String> with sizes 5 and values ["0", "1", "4", "9", "16"]
    val asc = Array(5) {
            i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}