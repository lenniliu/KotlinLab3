const val EPS = 0.0000001 // used in equals comparison
class Complex( val real: Double, val imaginary: Double) {

    constructor(real: Int, imaginary: Int) : this(real.toDouble(), imaginary.toDouble())

    operator fun plus(other: Complex): Complex {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    operator fun minus(other: Complex):  Complex {
        return Complex(real - other.real, imaginary - other.imaginary)
    }
    override operator fun equals(other: Any?): Boolean {
        if (other is Complex) {
            return (real == other.real) && (imaginary == other.imaginary)
        }
        return false
    }

    operator fun times(other: Complex): Complex {
        return Complex(real * other.real - imaginary * other.imaginary, real * other.imaginary + imaginary * other.real)
    }

    val abs: Double
        get() = Math.sqrt(real * real + imaginary * imaginary)
}
