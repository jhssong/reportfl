{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/fraction/Fraction.java",
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
      "comment": "\r\n * Representation of a rational number.\r\n *\r\n * @since 1.1\r\n * @version $Revision$ $Date$\r\n "
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
      "begin_line": 40,
      "end_line": 40,
      "comment": " The denominator. "
    },
    {
      "type": "field",
      "varNames": [
        "numerator"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The numerator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\r\n     * Create a fraction given the double value.\r\n     * @param value the double value to convert to a fraction.\r\n     * @throws ConvergenceException if the continued fraction failed to\r\n     *         converge.\r\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double, double, int)",
      "begin_line": 71,
      "end_line": 123,
      "comment": "\r\n     * Create a fraction given the double value.\r\n     * \u003cp\u003e\r\n     * References:\r\n     * \u003cul\u003e\r\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\r\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\r\n     * \u003c/ul\u003e\r\n     * \u003c/p\u003e\r\n     * @param value the double value to convert to a fraction.\r\n     * @param epsilon maximum error allowed.  The resulting fraction is within\r\n     *        \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\r\n     * @param maxIterations maximum number of convergents\r\n     * @throws ConvergenceException if the continued fraction failed to\r\n     *         converge.\r\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 26)",
        "(line 75,col 9)-(line 75,col 37)",
        "(line 79,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 19)",
        "(line 86,col 9)-(line 86,col 19)",
        "(line 87,col 9)-(line 87,col 20)",
        "(line 88,col 9)-(line 88,col 19)",
        "(line 90,col 9)-(line 90,col 19)",
        "(line 91,col 9)-(line 91,col 19)",
        "(line 93,col 9)-(line 93,col 18)",
        "(line 94,col 9)-(line 94,col 29)",
        "(line 95,col 9)-(line 113,col 24)",
        "(line 115,col 9)-(line 118,col 9)",
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
      "comment": "\r\n     * Create a fraction given the numerator and denominator.  The fraction is\r\n     * reduced to lowest terms.\r\n     * @param num the numerator.\r\n     * @param den the denominator.\r\n     * @throws ArithmeticException if the denomiator is \u003ccode\u003ezero\u003c/code\u003e\r\n     ",
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
      "comment": "\r\n     * Returns the absolute value of this fraction.\r\n     * @return the absolute value.\r\n     ",
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
      "comment": "\r\n     * Compares this object to another based on size.\r\n     * @param object the object to compare to\r\n     * @return -1 if this is less than \u003ctt\u003eobject\u003c/tt\u003e, +1 if this is greater\r\n     *         than \u003ctt\u003eobject\u003c/tt\u003e, 0 if they are equal.\r\n     ",
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
      "comment": "\r\n     * Gets the fraction as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the fraction as\r\n     * the numerator divided by denominator.\r\n     * @return the fraction as a \u003ctt\u003edouble\u003c/tt\u003e\r\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.equals(java.lang.Object)",
      "begin_line": 206,
      "end_line": 227,
      "comment": "\r\n     * Test for the equality of two fractions.  If the lowest term\r\n     * numerator and denominators are the same for both fractions, the two\r\n     * fractions are considered to be equal.\r\n     * @param other fraction to test for equality to this fraction\r\n     * @return true if two fractions are equal, false if object is\r\n     *         \u003ctt\u003enull\u003c/tt\u003e, not an instance of {@link Fraction}, or not equal\r\n     *         to this fraction instance.\r\n     ",
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
      "comment": "\r\n     * Gets the fraction as a \u003ctt\u003efloat\u003c/tt\u003e. This calculates the fraction as\r\n     * the numerator divided by denominator.\r\n     * @return the fraction as a \u003ctt\u003efloat\u003c/tt\u003e\r\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getDenominator()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\r\n     * Access the denominator.\r\n     * @return the denominator.\r\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getNumerator()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\r\n     * Access the numerator.\r\n     * @return the numerator.\r\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.hashCode()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\r\n     * Gets a hashCode for the fraction.\r\n     * @return a hash code value for this object\r\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.intValue()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\r\n     * Gets the fraction as an \u003ctt\u003eint\u003c/tt\u003e. This returns the whole number part\r\n     * of the fraction.\r\n     * @return the whole number fraction part\r\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.longValue()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\r\n     * Gets the fraction as a \u003ctt\u003elong\u003c/tt\u003e. This returns the whole number part\r\n     * of the fraction.\r\n     * @return the whole number fraction part\r\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.negate()",
      "begin_line": 284,
      "end_line": 289,
      "comment": "\r\n     * Return the additive inverse of this fraction.\r\n     * @return the negation of this fraction.\r\n     ",
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
      "comment": "\r\n     * Return the multiplicative inverse of this fraction.\r\n     * @return the reciprocal fraction\r\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.add(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\r\n     * \u003cp\u003eAdds the value of this fraction to another, returning the result in reduced form.\r\n     * The algorithm follows Knuth, 4.5.1.\u003c/p\u003e\r\n     *\r\n     * @param fraction  the fraction to add, must not be \u003ccode\u003enull\u003c/code\u003e\r\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\r\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\r\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\r\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\r\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.subtract(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\r\n     * \u003cp\u003eSubtracts the value of another fraction from the value of this one, \r\n     * returning the result in reduced form.\u003c/p\u003e\r\n     *\r\n     * @param fraction  the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\r\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\r\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\r\n     * @throws ArithmeticException if the resulting numerator or denominator\r\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\r\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.addSub(org.apache.commons.math.fraction.Fraction, boolean)",
      "begin_line": 337,
      "end_line": 382,
      "comment": " \r\n     * Implement add and subtract using algorithm described in Knuth 4.5.1.\r\n     * \r\n     * @param fraction the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\r\n     * @param isAdd true to add, false to subtract\r\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\r\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\r\n     * @throws ArithmeticException if the resulting numerator or denominator\r\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\r\n     ",
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
      "comment": "\r\n     * \u003cp\u003eMultiplies the value of this fraction by another, returning the \r\n     * result in reduced form.\u003c/p\u003e\r\n     *\r\n     * @param fraction  the fraction to multiply by, must not be \u003ccode\u003enull\u003c/code\u003e\r\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\r\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\r\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\r\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\r\n     ",
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
      "comment": "\r\n     * \u003cp\u003eDivide the value of this fraction by another.\u003c/p\u003e\r\n     *\r\n     * @param fraction  the fraction to divide by, must not be \u003ccode\u003enull\u003c/code\u003e\r\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\r\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\r\n     * @throws ArithmeticException if the fraction to divide by is zero\r\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\r\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\r\n     ",
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
      "comment": "\r\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\r\n     * of a fraction Y/Z.\u003c/p\u003e\r\n     *\r\n     * \u003cp\u003eAny negative signs are resolved to be on the numerator.\u003c/p\u003e\r\n     *\r\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\r\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\r\n     * @return a new fraction instance, with the numerator and denominator reduced\r\n     * @throws ArithmeticException if the denominator is \u003ccode\u003ezero\u003c/code\u003e\r\n     ",
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
      "comment": "\r\n     * Reduce this fraction to lowest terms.  This is accomplished by dividing\r\n     * both numerator and denominator by their greatest common divisor.\r\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 54)",
        "(line 474,col 9)-(line 477,col 9)",
        "(line 480,col 9)-(line 483,col 9)"
      ]
    }
  ]
}