fun toDouble(num: RationalNumber): Double{
    val double: Double = (num.numerator.toDouble()/num.denominator.toDouble())
    return(double)

}

fun add (num1: RationalNumber, num2: RationalNumber): RationalNumber{
    val finalNumerator:Int = num1.numerator * num2.denominator + num1.denominator*num2.numerator
    val finalDenominator:Int = num1.denominator*num2.denominator

    return RationalNumber(finalNumerator, finalDenominator)

}