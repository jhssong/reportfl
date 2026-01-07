{
  "filepath": "/tmp/Math-64b/src/main/java/org/apache/commons/math/fraction/Fraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Fraction",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "org.apache.commons.math.FieldElement\u003corg.apache.commons.math.fraction.Fraction\u003e",
        "java.lang.Comparable\u003corg.apache.commons.math.fraction.Fraction\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 36,
      "end_line": 654,
      "comment": "\n * Representation of a rational number.\n *\n * implements Serializable since 2.0\n *\n * @since 1.1\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "TWO"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " A fraction representing \"2 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " A fraction representing \"1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " A fraction representing \"0\". "
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_FIFTHS"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " A fraction representing \"4/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_FIFTH"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " A fraction representing \"1/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HALF"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " A fraction representing \"1/2\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_QUARTER"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " A fraction representing \"1/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_THIRD"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " A fraction representing \"1/3\". "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_FIFTHS"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " A fraction representing \"3/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_QUARTERS"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " A fraction representing \"3/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_FIFTHS"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " A fraction representing \"2/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_QUARTERS"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " A fraction representing \"2/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_THIRDS"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " A fraction representing \"2/3\". "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_ONE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " A fraction representing \"-1 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "denominator"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The denominator. "
    },
    {
      "type": "field",
      "varNames": [
        "numerator"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The numerator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Create a fraction given the double value.\n     * @param value the double value to convert to a fraction.\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double, double, int)",
      "begin_line": 117,
      "end_line": 121,
      "comment": "\n     * Create a fraction given the double value and maximum error allowed.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param value the double value to convert to a fraction.\n     * @param epsilon maximum error allowed.  The resulting fraction is within\n     *        \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxIterations maximum number of convergents\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double, int)",
      "begin_line": 137,
      "end_line": 141,
      "comment": "\n     * Create a fraction given the double value and maximum denominator.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param value the double value to convert to a fraction.\n     * @param maxDenominator The maximum allowed value for denominator\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge\n     ",
      "child_ranges": [
        "(line 140,col 8)-(line 140,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(double, double, int, int)",
      "begin_line": 174,
      "end_line": 237,
      "comment": "\n     * Create a fraction given the double value and either the maximum error\n     * allowed or the maximum number of denominator digits.\n     * \u003cp\u003e\n     *\n     * NOTE: This constructor is called with EITHER\n     *   - a valid epsilon value and the maxDenominator set to Integer.MAX_VALUE\n     *     (that way the maxDenominator has no effect).\n     * OR\n     *   - a valid maxDenominator value and the epsilon value set to zero\n     *     (that way epsilon only has effect if there is an exact match before\n     *     the maxDenominator value is reached).\n     * \u003c/p\u003e\u003cp\u003e\n     *\n     * It has been done this way so that the same code can be (re)used for both\n     * scenarios. However this could be confusing to users if it were part of\n     * the public API and this constructor should therefore remain PRIVATE.\n     * \u003c/p\u003e\n     *\n     * See JIRA issue ticket MATH-181 for more details:\n     *\n     *     https://issues.apache.org/jira/browse/MATH-181\n     *\n     * @param value the double value to convert to a fraction.\n     * @param epsilon maximum error allowed.  The resulting fraction is within\n     *        \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxDenominator maximum denominator value allowed.\n     * @param maxIterations maximum number of convergents\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 42)",
        "(line 178,col 9)-(line 178,col 26)",
        "(line 179,col 9)-(line 179,col 39)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 186,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 20)",
        "(line 193,col 9)-(line 193,col 20)",
        "(line 194,col 9)-(line 194,col 21)",
        "(line 195,col 9)-(line 195,col 20)",
        "(line 197,col 9)-(line 197,col 20)",
        "(line 198,col 9)-(line 198,col 20)",
        "(line 200,col 9)-(line 200,col 18)",
        "(line 201,col 9)-(line 201,col 29)",
        "(line 202,col 9)-(line 223,col 24)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(int)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "\n     * Create a fraction from an int.\n     * The fraction is num / 1.\n     * @param num the numerator.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.Fraction.Fraction(int, int)",
      "begin_line": 255,
      "end_line": 282,
      "comment": "\n     * Create a fraction given the numerator and denominator.  The fraction is\n     * reduced to lowest terms.\n     * @param num the numerator.\n     * @param den the denominator.\n     * @throws ArithmeticException if the denominator is \u003ccode\u003ezero\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 269,col 46)",
        "(line 270,col 9)-(line 273,col 9)",
        "(line 276,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 31)",
        "(line 281,col 9)-(line 281,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.abs()",
      "begin_line": 288,
      "end_line": 296,
      "comment": "\n     * Returns the absolute value of this fraction.\n     * @return the absolute value.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 21)",
        "(line 290,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.compareTo(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 304,
      "end_line": 308,
      "comment": "\n     * Compares this object to another based on size.\n     * @param object the object to compare to\n     * @return -1 if this is less than \u003ctt\u003eobject\u003c/tt\u003e, +1 if this is greater\n     *         than \u003ctt\u003eobject\u003c/tt\u003e, 0 if they are equal.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 59)",
        "(line 306,col 9)-(line 306,col 59)",
        "(line 307,col 9)-(line 307,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.doubleValue()",
      "begin_line": 315,
      "end_line": 318,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * @return the fraction as a \u003ctt\u003edouble\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.equals(java.lang.Object)",
      "begin_line": 329,
      "end_line": 342,
      "comment": "\n     * Test for the equality of two fractions.  If the lowest term\n     * numerator and denominators are the same for both fractions, the two\n     * fractions are considered to be equal.\n     * @param other fraction to test for equality to this fraction\n     * @return true if two fractions are equal, false if object is\n     *         \u003ctt\u003enull\u003c/tt\u003e, not an instance of {@link Fraction}, or not equal\n     *         to this fraction instance.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.floatValue()",
      "begin_line": 349,
      "end_line": 352,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003efloat\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * @return the fraction as a \u003ctt\u003efloat\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getDenominator()",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\n     * Access the denominator.\n     * @return the denominator.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getNumerator()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n     * Access the numerator.\n     * @return the numerator.\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.hashCode()",
      "begin_line": 374,
      "end_line": 377,
      "comment": "\n     * Gets a hashCode for the fraction.\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.intValue()",
      "begin_line": 384,
      "end_line": 387,
      "comment": "\n     * Gets the fraction as an \u003ctt\u003eint\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.longValue()",
      "begin_line": 394,
      "end_line": 397,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003elong\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.negate()",
      "begin_line": 403,
      "end_line": 409,
      "comment": "\n     * Return the additive inverse of this fraction.\n     * @return the negation of this fraction.\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.reciprocal()",
      "begin_line": 415,
      "end_line": 417,
      "comment": "\n     * Return the multiplicative inverse of this fraction.\n     * @return the reciprocal fraction\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.add(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * \u003cp\u003eAdds the value of this fraction to another, returning the result in reduced form.\n     * The algorithm follows Knuth, 4.5.1.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to add, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.add(int)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n     * Add an integer to the fraction.\n     * @param i the \u003ctt\u003einteger\u003c/tt\u003e to add.\n     * @return this + i\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.subtract(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 452,
      "end_line": 454,
      "comment": "\n     * \u003cp\u003eSubtracts the value of another fraction from the value of this one,\n     * returning the result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.subtract(int)",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\n     * Subtract an integer from the fraction.\n     * @param i the \u003ctt\u003einteger\u003c/tt\u003e to subtract.\n     * @return this - i\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.addSub(org.apache.commons.math.fraction.Fraction, boolean)",
      "begin_line": 475,
      "end_line": 520,
      "comment": "\n     * Implement add and subtract using algorithm described in Knuth 4.5.1.\n     *\n     * @param fraction the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param isAdd true to add, false to subtract\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 488,col 9)-(line 488,col 66)",
        "(line 489,col 9)-(line 497,col 9)",
        "(line 501,col 9)-(line 502,col 63)",
        "(line 503,col 9)-(line 504,col 54)",
        "(line 505,col 9)-(line 505,col 64)",
        "(line 508,col 9)-(line 508,col 62)",
        "(line 509,col 9)-(line 509,col 58)",
        "(line 512,col 9)-(line 512,col 56)",
        "(line 513,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 519,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.multiply(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 532,
      "end_line": 546,
      "comment": "\n     * \u003cp\u003eMultiplies the value of this fraction by another, returning the\n     * result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to multiply by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 538,col 9)",
        "(line 541,col 9)-(line 541,col 64)",
        "(line 542,col 9)-(line 542,col 64)",
        "(line 543,col 9)-(line 545,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.multiply(int)",
      "begin_line": 553,
      "end_line": 555,
      "comment": "\n     * Multiply the fraction by an integer.\n     * @param i the \u003ctt\u003einteger\u003c/tt\u003e to multiply by.\n     * @return this * i\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.divide(org.apache.commons.math.fraction.Fraction)",
      "begin_line": 567,
      "end_line": 577,
      "comment": "\n     * \u003cp\u003eDivide the value of this fraction by another.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to divide by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the fraction to divide by is zero\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.divide(int)",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\n     * Divide the fraction by an integer.\n     * @param i the \u003ctt\u003einteger\u003c/tt\u003e to divide by.\n     * @return this * i\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getReducedFraction(int, int)",
      "begin_line": 599,
      "end_line": 625,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eAny negative signs are resolved to be on the numerator.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     * @return a new fraction instance, with the numerator and denominator reduced\n     * @throws ArithmeticException if the denominator is \u003ccode\u003ezero\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 606,col 9)",
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 619,col 9)",
        "(line 621,col 9)-(line 621,col 56)",
        "(line 622,col 9)-(line 622,col 25)",
        "(line 623,col 9)-(line 623,col 27)",
        "(line 624,col 9)-(line 624,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.toString()",
      "begin_line": 636,
      "end_line": 647,
      "comment": "\n     * \u003cp\u003e\n     * Returns the \u003ccode\u003eString\u003c/code\u003e representing this fraction, ie\n     * \"num / dem\" or just \"num\" if the denominator is one.\n     * \u003c/p\u003e\n     *\n     * @return a string representation of the fraction.\n     * @see java.lang.Object#toString()\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 26)",
        "(line 639,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.Fraction.getField()",
      "begin_line": 650,
      "end_line": 652,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 43)"
      ]
    }
  ]
}