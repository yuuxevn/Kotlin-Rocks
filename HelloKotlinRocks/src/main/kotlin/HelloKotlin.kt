
fun main () {
    val openHours = 7
    val now = 5
    print(now)
}

//val name = "Krido"
//print( "Hallo! saya " + name )
//println( if(true) "Always true!" else "Always false!" )


//var identyfier: Type = Initialization
//var company: String = "Sekolah koding"
//company = "SMK Negeri 1 Bawang"
//
//val firstWord = "SMKN1"
//val lastWord = "Bawang"
//print( firstWord + lastWord )

//val valueA: Int = 18
//val valueB = 12
//print( valueA + valueB )
//
//val character = 'A'
//val character: Char = 'ABC' // Incorec character literal

// Characters
//var vocal = 'A'
//
//println(  "Vocal " vocal++ )
//println(  "Vocal " vocal++ )
//println(  "Vocal " vocal++ )
//println(  "Vocal " vocal-- )
//println(  "Vocal " vocal-- )
//println(  "Vocal " vocal-- )

// String
//val text = "Kotlin Rocks!"
//val firstChar = text[0]
//
//print( "Huruf pertama dari kata $text adalah $firstchar" )

//val text = "Kotlin"
//for( char in text ) {
//    print( "$char" )
//}

//    val statement = "Kotlin is \"Awesome!\""
//
//    val name = "Unicode test: \u0394"
//    print( name )

//    val line = "line 1\n" +
//                "line 2\n" +
//                "line 3\n" +
//                "line 4\n"

//    val Line = """
//                Line 1
//                Line 2
//                Line 3
//                Line 4
//               """.trim.Indent()
//    print( Line )

//   val intArray = intArrayOf( 1, 2, 3, 4 )
//    print( intArray[2] )

//val intArray = intarrayOf( 18, 32, 23 ) // [ 18, 32, 23 ]
//    intArray[2] = 11 // [ 18, 32, 11 ]
//
//    print( intArray[2] )

//val intArray = Array(4,{ i -> i * i  }  ) // [ 0, 1, 4, 9 ]

//    fun setuser( nama:String, age:Int ) = "Nama kamu adalah $nama & umur kamu $age tahun"
//    setuser()

//    // function
//    val user = setUser("Krido", 17)
//    print( user )
//
//    printUser("Hilman")
//
//
//    fun setUser( name:String, age:Int )= "Your name is $name and yourage is $age year old"
//    fun printUser( name:String ) {
//        print("Your name is $name")
//    }

//    // if expression
//    val openHour = 7
//    val now = 28
//    val office: String
//    office = if ( now > 7 ) {
//         "office already open!"
//    } else if ( now == openHour ) {
//         "wait a minute, ofice will be open"
//    } else {
//        "office is closed"
//    }
//    print(office)

//// boolean !
//    val officeOpen = 7
//    val officeClosed = 16
//    val now = 10
//
//    val isOpen = now > officeOpen
//
//    if ( !isOpen ) {
//        print("Office is closed")
//    }else{
//        print("Office is open")
//    }

//val longNumber = 100L // long
//    val shortNumber: Short = 10
//    val byetnumber = 0b11010010 // 8bit
//    val doubleNumber = 1.3 //64bit
//
//    val maxInt = Int.MAX_VALUE
//    val minInt = Int.MIN_VALUE
//
//    print(maxInt)
//    println(minInt)

//    val maxInt = Int.MAX_VALUE
//    val overRangeInt = Int.MAX_VALUE + 1 // overflow
//
//    print("maxInt: $maxInt")
//    println("overRangeInt: $overRangeInt")

//    val text: String? = null
//    text?.length
//
//    val text: String? = null
//    val textLength = text?.length ?:7
//    val textlength = if ( text !=null ) text?.length else 7

//    // nullable (safe calls & elfis operator)
//    val text: String? = null
//    val textLength = text!!.length // ready

//    // string template
//    val hour = 7
//    print("office ${ if ( hour > 7 ) "Already close" else "is open" }")