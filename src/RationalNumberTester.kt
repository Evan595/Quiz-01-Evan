fun toDouble(Numerator: Int, Denominator:Int): Double{
    val double: Double = (Numerator.toDouble()/Denominator.toDouble())
    return(double)

}

fun add (num1: Int, den1:Int, num2:Int, den2:Int): RationalNumber{
    val numer1 = num1 * den2
    val numer2 = num2 * den1
    val deno = den1 * den2
    return RationalNumber(numer1 + numer2, deno)

}