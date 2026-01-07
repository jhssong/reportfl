{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/fraction/Fraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Fraction",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.math.fraction.Fraction\u003e"
      ],
      "begin_line": 28,
      "end_line": 544,
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
      "comment": "\n     * Create a fraction given the double value.\n     * @param value the double value to convert to a fraction.\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double, double, int)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * Create a fraction given the double value and maximum error allowed.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param value the double value to convert to a fraction.\n     * @param epsilon maximum error allowed.  The resulting fraction is within\n     *        \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxIterations maximum number of convergents\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double, int)",
      "begin_line": 91,
      "end_line": 95,
      "comment": "\n     * Create a fraction given the double value and maximum denominator.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param value the double value to convert to a fraction.\n     * @param maxDenominator The maximum allowed value for denominator\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge\n     ",
      "child_ranges": [
        "(line 94,col 8)-(line 94,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double, double, int, int)",
      "begin_line": 128,
      "end_line": 191,
      "comment": "\n     * Create a fraction given the double value and either the maximum error\n     * allowed or the maximum number of denominator digits.\n     * \u003cp\u003e\n     *\n     * NOTE: This constructor is called with EITHER\n     *   - a valid epsilon value and the maxDenominator set to Integer.MAX_VALUE\n     *     (that way the maxDenominator has no effect).\n     * OR\n     *   - a valid maxDenominator value and the epsilon value set to zero\n     *     (that way epsilon only has effect if there is an exact match before\n     *     the maxDenominator value is reached).\n     * \u003c/p\u003e\u003cp\u003e\n     *\n     * It has been done this way so that the same code can be (re)used for both\n     * scenarios. However this could be confusing to users if it were part of\n     * the public API and this constructor should therefore remain PRIVATE.\n     * \u003c/p\u003e\n     *\n     * See JIRA issue ticket MATH-181 for more details:\n     *\n     *     https://issues.apache.org/jira/browse/MATH-181\n     *\n     * @param value the double value to convert to a fraction.\n     * @param epsilon maximum error allowed.  The resulting fraction is within\n     *        \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxDenominator maximum denominator value allowed.\n     * @param maxIterations maximum number of convergents\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 42)",
        "(line 132,col 9)-(line 132,col 26)",
        "(line 133,col 9)-(line 133,col 39)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 140,col 9)-(line 144,col 9)",
        "(line 146,col 8)-(line 146,col 19)",
        "(line 147,col 9)-(line 147,col 20)",
        "(line 148,col 9)-(line 148,col 21)",
        "(line 149,col 9)-(line 149,col 20)",
        "(line 151,col 9)-(line 151,col 20)",
        "(line 152,col 9)-(line 152,col 20)",
        "(line 154,col 9)-(line 154,col 18)",
        "(line 155,col 9)-(line 155,col 29)",
        "(line 156,col 9)-(line 177,col 24)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(int, int)",
      "begin_line": 200,
      "end_line": 227,
      "comment": "\n     * Create a fraction given the numerator and denominator.  The fraction is\n     * reduced to lowest terms.\n     * @param num the numerator.\n     * @param den the denominator.\n     * @throws ArithmeticException if the denomiator is \u003ccode\u003ezero\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 16)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 40)",
        "(line 215,col 9)-(line 218,col 9)",
        "(line 221,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 29)",
        "(line 226,col 9)-(line 226,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.abs()",
      "begin_line": 233,
      "end_line": 241,
      "comment": "\n     * Returns the absolute value of this fraction.\n     * @return the absolute value.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 21)",
        "(line 235,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.compareTo(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 249,
      "end_line": 264,
      "comment": "\n     * Compares this object to another based on size.\n     * @param object the object to compare to\n     * @return -1 if this is less than \u003ctt\u003eobject\u003c/tt\u003e, +1 if this is greater\n     *         than \u003ctt\u003eobject\u003c/tt\u003e, 0 if they are equal.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 20)",
        "(line 252,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 263,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.doubleValue()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * @return the fraction as a \u003ctt\u003edouble\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.equals(java.lang.Object)",
      "begin_line": 284,
      "end_line": 305,
      "comment": "\n     * Test for the equality of two fractions.  If the lowest term\n     * numerator and denominators are the same for both fractions, the two\n     * fractions are considered to be equal.\n     * @param other fraction to test for equality to this fraction\n     * @return true if two fractions are equal, false if object is\n     *         \u003ctt\u003enull\u003c/tt\u003e, not an instance of {@link Fraction}, or not equal\n     *         to this fraction instance.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 20)",
        "(line 287,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 304,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.floatValue()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003efloat\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * @return the fraction as a \u003ctt\u003efloat\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getDenominator()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Access the denominator.\n     * @return the denominator.\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getNumerator()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * Access the numerator.\n     * @return the numerator.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.hashCode()",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * Gets a hashCode for the fraction.\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.intValue()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\n     * Gets the fraction as an \u003ctt\u003eint\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.longValue()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003elong\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.negate()",
      "begin_line": 362,
      "end_line": 367,
      "comment": "\n     * Return the additive inverse of this fraction.\n     * @return the negation of this fraction.\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.reciprocal()",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n     * Return the multiplicative inverse of this fraction.\n     * @return the reciprocal fraction\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.add(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\n     * \u003cp\u003eAdds the value of this fraction to another, returning the result in reduced form.\n     * The algorithm follows Knuth, 4.5.1.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to add, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.subtract(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * \u003cp\u003eSubtracts the value of another fraction from the value of this one, \n     * returning the result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.addSub(org.apache.commons.math.fraction.Fraction, boolean)",
      "begin_line": 415,
      "end_line": 460,
      "comment": " \n     * Implement add and subtract using algorithm described in Knuth 4.5.1.\n     * \n     * @param fraction the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param isAdd true to add, false to subtract\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 418,col 9)",
        "(line 420,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 428,col 9)-(line 428,col 66)",
        "(line 429,col 9)-(line 437,col 9)",
        "(line 441,col 9)-(line 442,col 63)",
        "(line 443,col 9)-(line 444,col 54)",
        "(line 445,col 9)-(line 445,col 64)",
        "(line 448,col 9)-(line 448,col 62)",
        "(line 449,col 9)-(line 449,col 58)",
        "(line 452,col 9)-(line 452,col 56)",
        "(line 453,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 459,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.multiply(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 472,
      "end_line": 486,
      "comment": "\n     * \u003cp\u003eMultiplies the value of this fraction by another, returning the \n     * result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to multiply by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 478,col 9)",
        "(line 481,col 9)-(line 481,col 64)",
        "(line 482,col 9)-(line 482,col 64)",
        "(line 483,col 9)-(line 485,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.divide(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 498,
      "end_line": 506,
      "comment": "\n     * \u003cp\u003eDivide the value of this fraction by another.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to divide by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the fraction to divide by is zero\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getReducedFraction(int, int)",
      "begin_line": 519,
      "end_line": 543,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eAny negative signs are resolved to be on the numerator.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     * @return a new fraction instance, with the numerator and denominator reduced\n     * @throws ArithmeticException if the denominator is \u003ccode\u003ezero\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 525,col 9)",
        "(line 527,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 537,col 9)",
        "(line 539,col 9)-(line 539,col 56)",
        "(line 540,col 9)-(line 540,col 25)",
        "(line 541,col 9)-(line 541,col 27)",
        "(line 542,col 9)-(line 542,col 52)"
      ]
    }
  ]
}