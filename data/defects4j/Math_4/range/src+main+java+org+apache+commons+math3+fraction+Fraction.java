{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/fraction/Fraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Fraction",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "org.apache.commons.math3.FieldElement\u003corg.apache.commons.math3.fraction.Fraction\u003e",
        "java.lang.Comparable\u003corg.apache.commons.math3.fraction.Fraction\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 37,
      "end_line": 666,
      "comment": "\n * Representation of a rational number.\n *\n * implements Serializable since 2.0\n *\n * @since 1.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "TWO"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " A fraction representing \"2 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " A fraction representing \"1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " A fraction representing \"0\". "
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_FIFTHS"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " A fraction representing \"4/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_FIFTH"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " A fraction representing \"1/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HALF"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " A fraction representing \"1/2\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_QUARTER"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " A fraction representing \"1/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_THIRD"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " A fraction representing \"1/3\". "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_FIFTHS"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " A fraction representing \"3/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_QUARTERS"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " A fraction representing \"3/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_FIFTHS"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " A fraction representing \"2/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_QUARTERS"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " A fraction representing \"2/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_THIRDS"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " A fraction representing \"2/3\". "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_ONE"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " A fraction representing \"-1 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "denominator"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The denominator. "
    },
    {
      "type": "field",
      "varNames": [
        "numerator"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The numerator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.Fraction.Fraction(double)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Create a fraction given the double value.\n     * @param value the double value to convert to a fraction.\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.Fraction.Fraction(double, double, int)",
      "begin_line": 118,
      "end_line": 122,
      "comment": "\n     * Create a fraction given the double value and maximum error allowed.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param value the double value to convert to a fraction.\n     * @param epsilon maximum error allowed.  The resulting fraction is within\n     *        {@code epsilon} of {@code value}, in absolute terms.\n     * @param maxIterations maximum number of convergents\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.Fraction.Fraction(double, int)",
      "begin_line": 138,
      "end_line": 142,
      "comment": "\n     * Create a fraction given the double value and maximum denominator.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param value the double value to convert to a fraction.\n     * @param maxDenominator The maximum allowed value for denominator\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge\n     ",
      "child_ranges": [
        "(line 141,col 8)-(line 141,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.Fraction.Fraction(double, double, int, int)",
      "begin_line": 175,
      "end_line": 238,
      "comment": "\n     * Create a fraction given the double value and either the maximum error\n     * allowed or the maximum number of denominator digits.\n     * \u003cp\u003e\n     *\n     * NOTE: This constructor is called with EITHER\n     *   - a valid epsilon value and the maxDenominator set to Integer.MAX_VALUE\n     *     (that way the maxDenominator has no effect).\n     * OR\n     *   - a valid maxDenominator value and the epsilon value set to zero\n     *     (that way epsilon only has effect if there is an exact match before\n     *     the maxDenominator value is reached).\n     * \u003c/p\u003e\u003cp\u003e\n     *\n     * It has been done this way so that the same code can be (re)used for both\n     * scenarios. However this could be confusing to users if it were part of\n     * the public API and this constructor should therefore remain PRIVATE.\n     * \u003c/p\u003e\n     *\n     * See JIRA issue ticket MATH-181 for more details:\n     *\n     *     https://issues.apache.org/jira/browse/MATH-181\n     *\n     * @param value the double value to convert to a fraction.\n     * @param epsilon maximum error allowed.  The resulting fraction is within\n     *        {@code epsilon} of {@code value}, in absolute terms.\n     * @param maxDenominator maximum denominator value allowed.\n     * @param maxIterations maximum number of convergents\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 42)",
        "(line 179,col 9)-(line 179,col 26)",
        "(line 180,col 9)-(line 180,col 43)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 187,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 20)",
        "(line 194,col 9)-(line 194,col 20)",
        "(line 195,col 9)-(line 195,col 21)",
        "(line 196,col 9)-(line 196,col 20)",
        "(line 198,col 9)-(line 198,col 20)",
        "(line 199,col 9)-(line 199,col 20)",
        "(line 201,col 9)-(line 201,col 18)",
        "(line 202,col 9)-(line 202,col 29)",
        "(line 203,col 9)-(line 224,col 24)",
        "(line 226,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.Fraction.Fraction(int)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Create a fraction from an int.\n     * The fraction is num / 1.\n     * @param num the numerator.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.Fraction.Fraction(int, int)",
      "begin_line": 256,
      "end_line": 284,
      "comment": "\n     * Create a fraction given the numerator and denominator.  The fraction is\n     * reduced to lowest terms.\n     * @param num the numerator.\n     * @param den the denominator.\n     * @throws MathArithmeticException if the denominator is {@code zero}\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 52)",
        "(line 272,col 9)-(line 275,col 9)",
        "(line 278,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 31)",
        "(line 283,col 9)-(line 283,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.abs()",
      "begin_line": 290,
      "end_line": 298,
      "comment": "\n     * Returns the absolute value of this fraction.\n     * @return the absolute value.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 21)",
        "(line 292,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.compareTo(org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 306,
      "end_line": 310,
      "comment": "\n     * Compares this object to another based on size.\n     * @param object the object to compare to\n     * @return -1 if this is less than \u003ctt\u003eobject\u003c/tt\u003e, +1 if this is greater\n     *         than \u003ctt\u003eobject\u003c/tt\u003e, 0 if they are equal.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 59)",
        "(line 308,col 9)-(line 308,col 59)",
        "(line 309,col 9)-(line 309,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.doubleValue()",
      "begin_line": 317,
      "end_line": 320,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * @return the fraction as a \u003ctt\u003edouble\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.equals(java.lang.Object)",
      "begin_line": 331,
      "end_line": 344,
      "comment": "\n     * Test for the equality of two fractions.  If the lowest term\n     * numerator and denominators are the same for both fractions, the two\n     * fractions are considered to be equal.\n     * @param other fraction to test for equality to this fraction\n     * @return true if two fractions are equal, false if object is\n     *         \u003ctt\u003enull\u003c/tt\u003e, not an instance of {@link Fraction}, or not equal\n     *         to this fraction instance.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.floatValue()",
      "begin_line": 351,
      "end_line": 354,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003efloat\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * @return the fraction as a \u003ctt\u003efloat\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.getDenominator()",
      "begin_line": 360,
      "end_line": 362,
      "comment": "\n     * Access the denominator.\n     * @return the denominator.\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.getNumerator()",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * Access the numerator.\n     * @return the numerator.\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.hashCode()",
      "begin_line": 376,
      "end_line": 379,
      "comment": "\n     * Gets a hashCode for the fraction.\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.intValue()",
      "begin_line": 386,
      "end_line": 389,
      "comment": "\n     * Gets the fraction as an \u003ctt\u003eint\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.longValue()",
      "begin_line": 396,
      "end_line": 399,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003elong\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.negate()",
      "begin_line": 405,
      "end_line": 410,
      "comment": "\n     * Return the additive inverse of this fraction.\n     * @return the negation of this fraction.\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.reciprocal()",
      "begin_line": 416,
      "end_line": 418,
      "comment": "\n     * Return the multiplicative inverse of this fraction.\n     * @return the reciprocal fraction\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.add(org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\n     * \u003cp\u003eAdds the value of this fraction to another, returning the result in reduced form.\n     * The algorithm follows Knuth, 4.5.1.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to add, must not be {@code null}\n     * @return a {@code Fraction} instance with the resulting values\n     * @throws NullArgumentException if the fraction is {@code null}\n     * @throws MathArithmeticException if the resulting numerator or denominator exceeds\n     *  {@code Integer.MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.add(int)",
      "begin_line": 439,
      "end_line": 441,
      "comment": "\n     * Add an integer to the fraction.\n     * @param i the \u003ctt\u003einteger\u003c/tt\u003e to add.\n     * @return this + i\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.subtract(org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\n     * \u003cp\u003eSubtracts the value of another fraction from the value of this one,\n     * returning the result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to subtract, must not be {@code null}\n     * @return a {@code Fraction} instance with the resulting values\n     * @throws NullArgumentException if the fraction is {@code null}\n     * @throws MathArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an {@code int}.\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.subtract(int)",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\n     * Subtract an integer from the fraction.\n     * @param i the \u003ctt\u003einteger\u003c/tt\u003e to subtract.\n     * @return this - i\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.addSub(org.apache.commons.math3.fraction.Fraction, boolean)",
      "begin_line": 476,
      "end_line": 521,
      "comment": "\n     * Implement add and subtract using algorithm described in Knuth 4.5.1.\n     *\n     * @param fraction the fraction to subtract, must not be {@code null}\n     * @param isAdd true to add, false to subtract\n     * @return a {@code Fraction} instance with the resulting values\n     * @throws NullArgumentException if the fraction is {@code null}\n     * @throws MathArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an {@code int}.\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 479,col 9)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 489,col 9)-(line 489,col 72)",
        "(line 490,col 9)-(line 498,col 9)",
        "(line 502,col 9)-(line 503,col 63)",
        "(line 504,col 9)-(line 505,col 54)",
        "(line 506,col 9)-(line 506,col 64)",
        "(line 509,col 9)-(line 509,col 62)",
        "(line 510,col 9)-(line 510,col 64)",
        "(line 513,col 9)-(line 513,col 56)",
        "(line 514,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 520,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.multiply(org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 533,
      "end_line": 547,
      "comment": "\n     * \u003cp\u003eMultiplies the value of this fraction by another, returning the\n     * result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to multiply by, must not be {@code null}\n     * @return a {@code Fraction} instance with the resulting values\n     * @throws NullArgumentException if the fraction is {@code null}\n     * @throws MathArithmeticException if the resulting numerator or denominator exceeds\n     *  {@code Integer.MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 542,col 9)-(line 542,col 70)",
        "(line 543,col 9)-(line 543,col 70)",
        "(line 544,col 9)-(line 546,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.multiply(int)",
      "begin_line": 554,
      "end_line": 556,
      "comment": "\n     * Multiply the fraction by an integer.\n     * @param i the \u003ctt\u003einteger\u003c/tt\u003e to multiply by.\n     * @return this * i\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.divide(org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 568,
      "end_line": 577,
      "comment": "\n     * \u003cp\u003eDivide the value of this fraction by another.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to divide by, must not be {@code null}\n     * @return a {@code Fraction} instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is {@code null}\n     * @throws MathArithmeticException if the fraction to divide by is zero\n     * @throws MathArithmeticException if the resulting numerator or denominator exceeds\n     *  {@code Integer.MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.divide(int)",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\n     * Divide the fraction by an integer.\n     * @param i the \u003ctt\u003einteger\u003c/tt\u003e to divide by.\n     * @return this * i\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.percentageValue()",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the\n     * fraction as the numerator divided by denominator multiplied by 100.\n     * \u003c/p\u003e\n     *\n     * @return the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.getReducedFraction(int, int)",
      "begin_line": 611,
      "end_line": 637,
      "comment": "\n     * \u003cp\u003eCreates a {@code Fraction} instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eAny negative signs are resolved to be on the numerator.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     * @return a new fraction instance, with the numerator and denominator reduced\n     * @throws MathArithmeticException if the denominator is {@code zero}\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 615,col 9)",
        "(line 616,col 9)-(line 618,col 9)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 631,col 9)",
        "(line 633,col 9)-(line 633,col 62)",
        "(line 634,col 9)-(line 634,col 25)",
        "(line 635,col 9)-(line 635,col 27)",
        "(line 636,col 9)-(line 636,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.toString()",
      "begin_line": 648,
      "end_line": 659,
      "comment": "\n     * \u003cp\u003e\n     * Returns the {@code String} representing this fraction, ie\n     * \"num / dem\" or just \"num\" if the denominator is one.\n     * \u003c/p\u003e\n     *\n     * @return a string representation of the fraction.\n     * @see java.lang.Object#toString()\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 26)",
        "(line 651,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.getField()",
      "begin_line": 662,
      "end_line": 664,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 43)"
      ]
    }
  ]
}