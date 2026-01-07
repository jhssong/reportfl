{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/fraction/Fraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Fraction",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.math.fraction.Fraction\u003e"
      ],
      "begin_line": 30,
      "end_line": 557,
      "comment": "\n * Representation of a rational number.\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "TWO"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " A fraction representing \"2 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " A fraction representing \"1 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " A fraction representing \"0 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_ONE"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " A fraction representing \"-1 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "denominator"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " The denominator. "
    },
    {
      "type": "field",
      "varNames": [
        "numerator"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The numerator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Create a fraction given the double value.\n     * @param value the double value to convert to a fraction.\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double, double, int)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * Create a fraction given the double value and maximum error allowed.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param value the double value to convert to a fraction.\n     * @param epsilon maximum error allowed.  The resulting fraction is within\n     *        \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxIterations maximum number of convergents\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double, int)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n     * Create a fraction given the double value and maximum denominator.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param value the double value to convert to a fraction.\n     * @param maxDenominator The maximum allowed value for denominator\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge\n     ",
      "child_ranges": [
        "(line 102,col 8)-(line 102,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double, double, int, int)",
      "begin_line": 136,
      "end_line": 199,
      "comment": "\n     * Create a fraction given the double value and either the maximum error\n     * allowed or the maximum number of denominator digits.\n     * \u003cp\u003e\n     *\n     * NOTE: This constructor is called with EITHER\n     *   - a valid epsilon value and the maxDenominator set to Integer.MAX_VALUE\n     *     (that way the maxDenominator has no effect).\n     * OR\n     *   - a valid maxDenominator value and the epsilon value set to zero\n     *     (that way epsilon only has effect if there is an exact match before\n     *     the maxDenominator value is reached).\n     * \u003c/p\u003e\u003cp\u003e\n     *\n     * It has been done this way so that the same code can be (re)used for both\n     * scenarios. However this could be confusing to users if it were part of\n     * the public API and this constructor should therefore remain PRIVATE.\n     * \u003c/p\u003e\n     *\n     * See JIRA issue ticket MATH-181 for more details:\n     *\n     *     https://issues.apache.org/jira/browse/MATH-181\n     *\n     * @param value the double value to convert to a fraction.\n     * @param epsilon maximum error allowed.  The resulting fraction is within\n     *        \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxDenominator maximum denominator value allowed.\n     * @param maxIterations maximum number of convergents\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 42)",
        "(line 140,col 9)-(line 140,col 26)",
        "(line 141,col 9)-(line 141,col 39)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 148,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 154,col 20)",
        "(line 155,col 9)-(line 155,col 20)",
        "(line 156,col 9)-(line 156,col 21)",
        "(line 157,col 9)-(line 157,col 20)",
        "(line 159,col 9)-(line 159,col 20)",
        "(line 160,col 9)-(line 160,col 20)",
        "(line 162,col 9)-(line 162,col 18)",
        "(line 163,col 9)-(line 163,col 29)",
        "(line 164,col 9)-(line 185,col 24)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 197,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(int, int)",
      "begin_line": 208,
      "end_line": 236,
      "comment": "\n     * Create a fraction given the numerator and denominator.  The fraction is\n     * reduced to lowest terms.\n     * @param num the numerator.\n     * @param den the denominator.\n     * @throws ArithmeticException if the denominator is \u003ccode\u003ezero\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 16)",
        "(line 210,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 40)",
        "(line 224,col 9)-(line 227,col 9)",
        "(line 230,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 234,col 29)",
        "(line 235,col 9)-(line 235,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.abs()",
      "begin_line": 242,
      "end_line": 250,
      "comment": "\n     * Returns the absolute value of this fraction.\n     * @return the absolute value.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 21)",
        "(line 244,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.compareTo(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 258,
      "end_line": 273,
      "comment": "\n     * Compares this object to another based on size.\n     * @param object the object to compare to\n     * @return -1 if this is less than \u003ctt\u003eobject\u003c/tt\u003e, +1 if this is greater\n     *         than \u003ctt\u003eobject\u003c/tt\u003e, 0 if they are equal.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 20)",
        "(line 261,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 272,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.doubleValue()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * @return the fraction as a \u003ctt\u003edouble\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.equals(java.lang.Object)",
      "begin_line": 293,
      "end_line": 314,
      "comment": "\n     * Test for the equality of two fractions.  If the lowest term\n     * numerator and denominators are the same for both fractions, the two\n     * fractions are considered to be equal.\n     * @param other fraction to test for equality to this fraction\n     * @return true if two fractions are equal, false if object is\n     *         \u003ctt\u003enull\u003c/tt\u003e, not an instance of {@link Fraction}, or not equal\n     *         to this fraction instance.\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 20)",
        "(line 296,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 313,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.floatValue()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003efloat\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * @return the fraction as a \u003ctt\u003efloat\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getDenominator()",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * Access the denominator.\n     * @return the denominator.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getNumerator()",
      "begin_line": 337,
      "end_line": 339,
      "comment": "\n     * Access the numerator.\n     * @return the numerator.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.hashCode()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\n     * Gets a hashCode for the fraction.\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.intValue()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Gets the fraction as an \u003ctt\u003eint\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.longValue()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003elong\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.negate()",
      "begin_line": 371,
      "end_line": 377,
      "comment": "\n     * Return the additive inverse of this fraction.\n     * @return the negation of this fraction.\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.reciprocal()",
      "begin_line": 383,
      "end_line": 385,
      "comment": "\n     * Return the multiplicative inverse of this fraction.\n     * @return the reciprocal fraction\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.add(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\n     * \u003cp\u003eAdds the value of this fraction to another, returning the result in reduced form.\n     * The algorithm follows Knuth, 4.5.1.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to add, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.subtract(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * \u003cp\u003eSubtracts the value of another fraction from the value of this one, \n     * returning the result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.addSub(org.apache.commons.math.fraction.Fraction, boolean)",
      "begin_line": 425,
      "end_line": 470,
      "comment": " \n     * Implement add and subtract using algorithm described in Knuth 4.5.1.\n     * \n     * @param fraction the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param isAdd true to add, false to subtract\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 428,col 9)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 438,col 9)-(line 438,col 66)",
        "(line 439,col 9)-(line 447,col 9)",
        "(line 451,col 9)-(line 452,col 63)",
        "(line 453,col 9)-(line 454,col 54)",
        "(line 455,col 9)-(line 455,col 64)",
        "(line 458,col 9)-(line 458,col 62)",
        "(line 459,col 9)-(line 459,col 58)",
        "(line 462,col 9)-(line 462,col 56)",
        "(line 463,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 469,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.multiply(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 482,
      "end_line": 496,
      "comment": "\n     * \u003cp\u003eMultiplies the value of this fraction by another, returning the \n     * result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to multiply by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 488,col 9)",
        "(line 491,col 9)-(line 491,col 64)",
        "(line 492,col 9)-(line 492,col 64)",
        "(line 493,col 9)-(line 495,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.divide(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 508,
      "end_line": 517,
      "comment": "\n     * \u003cp\u003eDivide the value of this fraction by another.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to divide by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the fraction to divide by is zero\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getReducedFraction(int, int)",
      "begin_line": 530,
      "end_line": 556,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eAny negative signs are resolved to be on the numerator.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     * @return a new fraction instance, with the numerator and denominator reduced\n     * @throws ArithmeticException if the denominator is \u003ccode\u003ezero\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 537,col 9)",
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 550,col 9)",
        "(line 552,col 9)-(line 552,col 56)",
        "(line 553,col 9)-(line 553,col 25)",
        "(line 554,col 9)-(line 554,col 27)",
        "(line 555,col 9)-(line 555,col 52)"
      ]
    }
  ]
}