{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/fraction/Fraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Fraction",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable"
      ],
      "begin_line": 28,
      "end_line": 485,
      "comment": "\n * Representation of a rational number.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " A fraction representing \"1 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " A fraction representing \"0 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "denominator"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The denominator. "
    },
    {
      "type": "field",
      "varNames": [
        "numerator"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The numerator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Create a fraction given the double value.\n     * @param value the double value to convert to a fraction.\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double, double, int)",
      "begin_line": 72,
      "end_line": 123,
      "comment": "\n     * Create a fraction given the double value.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param value the double value to convert to a fraction.\n     * @param epsilon maximum error allowed.  The resulting fraction is within\n     *        \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxIterations maximum number of convergents\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 26)",
        "(line 76,col 9)-(line 76,col 37)",
        "(line 80,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 86,col 19)",
        "(line 87,col 9)-(line 87,col 19)",
        "(line 88,col 9)-(line 88,col 20)",
        "(line 89,col 9)-(line 89,col 19)",
        "(line 91,col 9)-(line 91,col 19)",
        "(line 92,col 9)-(line 92,col 19)",
        "(line 94,col 9)-(line 94,col 18)",
        "(line 95,col 9)-(line 95,col 29)",
        "(line 96,col 9)-(line 114,col 24)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 120,col 28)",
        "(line 121,col 9)-(line 121,col 30)",
        "(line 122,col 9)-(line 122,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(int, int)",
      "begin_line": 132,
      "end_line": 148,
      "comment": "\n     * Create a fraction given the numerator and denominator.  The fraction is\n     * reduced to lowest terms.\n     * @param num the numerator.\n     * @param den the denominator.\n     * @throws ArithmeticException if the denomiator is \u003ccode\u003ezero\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 16)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 29)",
        "(line 146,col 9)-(line 146,col 31)",
        "(line 147,col 9)-(line 147,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.abs()",
      "begin_line": 154,
      "end_line": 162,
      "comment": "\n     * Returns the absolute value of this fraction.\n     * @return the absolute value.\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 21)",
        "(line 156,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.compareTo(java.lang.Object)",
      "begin_line": 170,
      "end_line": 186,
      "comment": "\n     * Compares this object to another based on size.\n     * @param object the object to compare to\n     * @return -1 if this is less than \u003ctt\u003eobject\u003c/tt\u003e, +1 if this is greater\n     *         than \u003ctt\u003eobject\u003c/tt\u003e, 0 if they are equal.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 20)",
        "(line 173,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.doubleValue()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * @return the fraction as a \u003ctt\u003edouble\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.equals(java.lang.Object)",
      "begin_line": 206,
      "end_line": 227,
      "comment": "\n     * Test for the equality of two fractions.  If the lowest term\n     * numerator and denominators are the same for both fractions, the two\n     * fractions are considered to be equal.\n     * @param other fraction to test for equality to this fraction\n     * @return true if two fractions are equal, false if object is\n     *         \u003ctt\u003enull\u003c/tt\u003e, not an instance of {@link Fraction}, or not equal\n     *         to this fraction instance.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 20)",
        "(line 209,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.floatValue()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003efloat\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * @return the fraction as a \u003ctt\u003efloat\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getDenominator()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Access the denominator.\n     * @return the denominator.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getNumerator()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Access the numerator.\n     * @return the numerator.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.hashCode()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Gets a hashCode for the fraction.\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.intValue()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Gets the fraction as an \u003ctt\u003eint\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.longValue()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003elong\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.negate()",
      "begin_line": 284,
      "end_line": 289,
      "comment": "\n     * Return the additive inverse of this fraction.\n     * @return the negation of this fraction.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.reciprocal()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n     * Return the multiplicative inverse of this fraction.\n     * @return the reciprocal fraction\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.add(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * \u003cp\u003eAdds the value of this fraction to another, returning the result in reduced form.\n     * The algorithm follows Knuth, 4.5.1.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to add, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.subtract(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * \u003cp\u003eSubtracts the value of another fraction from the value of this one, \n     * returning the result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.addSub(org.apache.commons.math.fraction.Fraction, boolean)",
      "begin_line": 337,
      "end_line": 382,
      "comment": " \n     * Implement add and subtract using algorithm described in Knuth 4.5.1.\n     * \n     * @param fraction the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param isAdd true to add, false to subtract\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 340,col 9)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 350,col 9)-(line 350,col 66)",
        "(line 351,col 9)-(line 359,col 9)",
        "(line 363,col 9)-(line 364,col 63)",
        "(line 365,col 9)-(line 366,col 54)",
        "(line 367,col 9)-(line 367,col 64)",
        "(line 370,col 9)-(line 370,col 62)",
        "(line 371,col 9)-(line 371,col 58)",
        "(line 374,col 9)-(line 374,col 56)",
        "(line 375,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 381,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.multiply(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 394,
      "end_line": 408,
      "comment": "\n     * \u003cp\u003eMultiplies the value of this fraction by another, returning the \n     * result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to multiply by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 403,col 9)-(line 403,col 64)",
        "(line 404,col 9)-(line 404,col 64)",
        "(line 405,col 9)-(line 407,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.divide(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 420,
      "end_line": 428,
      "comment": "\n     * \u003cp\u003eDivide the value of this fraction by another.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to divide by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the fraction to divide by is zero\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getReducedFraction(int, int)",
      "begin_line": 441,
      "end_line": 465,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eAny negative signs are resolved to be on the numerator.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     * @return a new fraction instance, with the numerator and denominator reduced\n     * @throws ArithmeticException if the denominator is \u003ccode\u003ezero\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 461,col 56)",
        "(line 462,col 9)-(line 462,col 25)",
        "(line 463,col 9)-(line 463,col 27)",
        "(line 464,col 9)-(line 464,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.reduce()",
      "begin_line": 471,
      "end_line": 484,
      "comment": "\n     * Reduce this fraction to lowest terms.  This is accomplished by dividing\n     * both numerator and denominator by their greatest common divisor.\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 54)",
        "(line 474,col 9)-(line 477,col 9)",
        "(line 480,col 9)-(line 483,col 9)"
      ]
    }
  ]
}