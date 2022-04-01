package Composition

/**
 *
 *  --------- ---               -------------
 *  |           |               |            |
 *  | shop      |  <> --------- |   seller  |
 *  |           |               |           |
 *  --------------              --------------
 * Bentuk hubungan pertama dari asosiasi adalah
 * agregasi yang digambarkan dengan dengan garis
 * yang tidak putus-putus dengan ujung simbol diamond
 * putih yang mengarah pada class yang memiliki.
 * Meskipun sama-sama berupa hubungan yang “memiliki,”
 * perbedaan dengan bentuk hubungan komposisi adalah
 * bentuk hubungan ini tidak terikat, yang berarti setiap
 * class dapat berdiri sendiri. Seperti contoh pada gambar
 * di atas, meskipun kelas Shop dihancurkan, class Seller masih dapat
 * digunakan. Tapi tidak sebaliknya. Jika class Seller tidak ada, maka class
 * Shop sudah tidak relevan lagi untuk digunakan.
 *
 *
 */
class Shop(
    private val id: String,
    private val name: String
) {
    var seller: Seller
        set(value) {
            seller = value
        }
        get() {
            return seller
        }
    //atau bisa juga late init var seller

   //other thins to do
}

class Seller(
    private val id: String,
    private val name: String
)