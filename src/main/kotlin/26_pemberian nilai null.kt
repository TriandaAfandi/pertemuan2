//Salah satu kesalahan yang banyak ditemukan pada bahasa pemrograman adalah pengaksesan terhadap anggota referensi null dan akan menghasilkan pesan kesalahan null reference exception, di Java sering disebut dengan Null Pointer Exception (NPE).
fun main(args: Array<String>){
//Nullable types
    var maybeNumber: Int? = 15
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}