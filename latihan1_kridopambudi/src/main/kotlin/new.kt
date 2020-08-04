import kotlin.random.Random

fun main () {


// Enomu
//val color: Color = Color.GREEN
//
//when( color ) {
//    Color.RED -> println( "Color is Red" )
//    Color.GREEN -> println( "Color is Green" )
//    Color.BLUE -> println( " Color is Blue " )
//}
//
//enum class Color( val value: Int ) {
//    RED( 0xFF0000 ),
//    GREEN( 0x00FF00 ),
//    BLUE( 0x0000FF )
//}

// val colorRed = Color.RED
// val colorGreen = Color.GREEN
// val colorBlue = Color.BLUE
//
// println( colorRed )
// println( colorGreen )
// println( colorBlue )


    // when expression

//    val value = 20
//    when( value ) {
//        6->print("Benar, angkanya 6")
//        7->print("Benar, angkanya 7")
//        8->print("Benar, angkanya 8")
//        else->print("hmm..kayaknya ada yang salah")
//    }

//    val angka = 66
//    val simpan = when( angka ) {
//        33->"Angkanya 33"
//        66->"angkanya 66"
//        99->"angkanya 99"
//        else->"salah semua"
//    }
//    print( simpan )

//    val angka = 66
//    val tampil = when( angka ) {
//        66->{
//            print("angkanya 66")
//            "Value is 66"
//        }
//        33->{
//            print("angkanya 33")
//            "Value is 33"
//        }
//        else->{
//            print("salah")
//            "ups..valuenya salah"
//        }
//    }
//    print( tampil )
//
//    val value = 27
//    val range = 10..50
//    when( value ) {
//        in range->"yeah, values available in range!"
//        !in range->"Something wrong!"
//        else->"Value undefined"
//    }

//    val registernumber = when( val regis = getRegisterNumber() ) {
//        in 1..50-> regis * 50
//        in 51..100-> regis * 100
//        else-> regis
//    }
//}
//
//fun getRegisterNumber() = Random.nextInt(100)


    // expression dan statement

    // expression(if)
//    val buka = 7
//    val sekarang = 10
//    val cek = if( sekarang >= buka )"Office already open" else "office close"
//    print( cek )

    // statement( inisialisasi dari sebuah variabel )
//    val a1 = 10
//    val a2 = 20
//    sum(a1, a2)
//    fun sum(value1: Int, value2: Int) = value1 + value2

    // while and do while

    // while
//    var counter = 1
//    while ( counter <= 7 ) {
//        print( "Hello, kotlin!\n" )
//        counter++
//    }

    // do while
//    var counter = 1
//    do{
//        print("kotlin rocks\n")
//        counter++
//    } while( counter <= 7 )


    // Range
//    val range1 = 1..10
//    print( range1.step ) // step bernilai 1

    // merubah step
//    val range2 = 1..10 step 2
//    range2.forEach{
//        print("$it ")
//    }
//    println(range2.step)

    // fungsi rangeTo()
//    val range3 = 1.rangeTo(100) // dari 1 ke 100
//    val range4 = 100.downTo(1) // dari 100 ke 1
//    val char = 'A'.rangeTo('F') // menggunakan character
//
//    if( 66 in range3 ){ // in dan !in
//        print("66 ada dalam 100 angka")
//    }


    // For loop
    val range = 1.rangeTo(5)
    for (i in range) {
        print("value is $i\n")
    }

    val range2 = 1.rangeTo(5) step 2 // range expression
    for (i in range2) {
        print("value is $i\n")
    }

    val range3 = 1.rangeTo(5) step 3 // akses index untuk setiap elemen
    for ((index, value) in range3.withIndex()) {
        print("value $value and index $index")
    }

    val range4 = 10.rangeTo(100) step 5 // mengambil value dengan for each
    range4.forEach { value ->
        println("value is $value\n")
    }

    val range5 = 10.rangeTo(100) step 10 // for each indexed memiliki 2 argumen(index dan value)
    range5.forEachIndexed { index, value ->
        print("index $index with value $value\n")
    }

    val range6 = 10.rangeTo(100) step 10 // for each indexed bisa hanya menggunakan index dengan menggunakn underscore
    range6.forEachIndexed { index, _ ->
        print("index $index")
    }


    // Break and continue (mengatasi nullExceptionPointer)

    // break digunakan untuk menghentikan proses iterasi
    val listOfInt = listOf(1, 2, 3, 4, null, 6, null)

    for( i in listOfInt ) {
        if( i == null ) break
            print("$i\n")
    }

    // continue digunakan untuk melewatkan proses iterasi dan lanjut ke iterasi selanjutnya
    val listOfInt2 = listOf(1, 2, 3, 4, null, 6, null)

    for( i in listOfInt2 ) {
        if( i == null ) continue
        print("$i\n")
    }

    val listOfInt3 = listOf(1, 2, 3, null, 5, null, 7)
    for( i in listOfInt3 ) {
        if(  i == null ) break
        print( "$i\n" )
    }

    // break and continue label ditandai dengan @
    loop@ for ( i in 1.rangeTo(10) ) {
        print( "Outside Loop" )
        for( j in 1.rangeTo(10)) {
            print("Inside loop")
            if (j > 5) break@loop
        }
    }
}

// end 12:12 am 5/08/20

