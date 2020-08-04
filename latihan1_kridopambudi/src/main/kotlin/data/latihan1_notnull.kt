package data

class latihan1_notnull {
    fun calculateResult( valueA: Int, valueB: Int, valueC : Int? ) : Int
    {
        if ( valueC == null ) { return valueA + ( valueB - 50 ) }
        else {  return valueA + ( valueB - valueC ) }
    }
}
fun main () {
    val insert = latihan1_notnull()
    val hasilA = 101
    val hasilB = 52
    val hasilC = 99

    val resultA = insert.calculateResult( hasilA, hasilB, hasilC )
    val resultB = insert.calculateResult( hasilA, hasilB, valueC = null )

    println( resultA )
    print( resultB )
}