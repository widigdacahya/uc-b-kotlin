package Composition

/**
 *[diamon hitam penuh]
 *  --------- ---               -------------
 *  |           |               |            |
 *  | User      |  <--> --------- |   Address  |
 *  |           |               |           |
 *  --------------              --------------
 *
 * Bentuk hubungan kedua yaitu komposisi,
 * sebuah hubungan dapat dikatakan komposisi
 * jika sebuah kelas “memiliki” class lainnya.
 * Aturan yang berlaku untuk hubungan ini adalah
 * ketika kelas yang “memiliki” class lainnya
 * dihancurkan maka class yang “dimiliki” oleh kelas tersebut
 * akan hancur juga atau tidak dapat digunakan.
 * Untuk lebih mudah memahaminya mari kita contohkan lewat
 * kasus seperti gambar di atas.Sebuah class User
 * memiliki bentuk hubungan komposisi dengan class
 * Address yang ditandai dengan adanya anak panah
 * dengan ujung diamond hitam penuh, yang mengarah pada class
 * yang “memiliki” objek tersebut. Ketika class User hancur,
 * maka class Address yang memiliki hubungan dengan class User
 * tersebut akan ikut hancur dan tidak bisa digunakan lagi.
 * Agar lebih jelas lagi, mari kita lihat penerapan kodenya
 * dalam kelas-kelas di bawah ini.
 *
 *
 *
 *
 * */

fun main() {

    val user = User(id = "111", name = "widigda", address = Address("99", "Bondowoso"))
    println(user)
    println(user.toString())
    println(user.javaClass.simpleName)
    println(user)
}

class User(
    private val id: String,
    private val name: String,
    private val address: Address
)

class Address(
    private val id: String,
    private val location: String
)