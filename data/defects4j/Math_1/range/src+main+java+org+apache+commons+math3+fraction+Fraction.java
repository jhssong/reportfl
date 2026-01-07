{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/fraction/Fraction.java",
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
      "end_line": 671,
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
        "DEFAULT_EPSILON"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The default epsilon used for convergence. "
    },
    {
      "type": "field",
      "varNames": [
        "denominator"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The denominator. "
    },
    {
      "type": "field",
      "varNames": [
        "numerator"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The numerator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.Fraction.Fraction(double)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Create a fraction given the double value.\n     * @param value the double value to convert to a fraction.\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.Fraction.Fraction(double, double, int)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "\n     * Create a fraction given the double value and maximum error allowed.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param value the double value to convert to a fraction.\n     * @param epsilon maximum error allowed.  The resulting fraction is within\n     *        {@code epsilon} of {@code value}, in absolute terms.\n     * @param maxIterations maximum number of convergents\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.Fraction.Fraction(double, int)",
      "begin_line": 141,
      "end_line": 145,
      "comment": "\n     * Create a fraction given the double value and maximum denominator.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * @param value the double value to convert to a fraction.\n     * @param maxDenominator The maximum allowed value for denominator\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge\n     ",
      "child_ranges": [
        "(line 144,col 8)-(line 144,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.Fraction.Fraction(double, double, int, int)",
      "begin_line": 178,
      "end_line": 243,
      "comment": "\n     * Create a fraction given the double value and either the maximum error\n     * allowed or the maximum number of denominator digits.\n     * \u003cp\u003e\n     *\n     * NOTE: This constructor is called with EITHER\n     *   - a valid epsilon value and the maxDenominator set to Integer.MAX_VALUE\n     *     (that way the maxDenominator has no effect).\n     * OR\n     *   - a valid maxDenominator value and the epsilon value set to zero\n     *     (that way epsilon only has effect if there is an exact match before\n     *     the maxDenominator value is reached).\n     * \u003c/p\u003e\u003cp\u003e\n     *\n     * It has been done this way so that the same code can be (re)used for both\n     * scenarios. However this could be confusing to users if it were part of\n     * the public API and this constructor should therefore remain PRIVATE.\n     * \u003c/p\u003e\n     *\n     * See JIRA issue ticket MATH-181 for more details:\n     *\n     *     https://issues.apache.org/jira/browse/MATH-181\n     *\n     * @param value the double value to convert to a fraction.\n     * @param epsilon maximum error allowed.  The resulting fraction is within\n     *        {@code epsilon} of {@code value}, in absolute terms.\n     * @param maxDenominator maximum denominator value allowed.\n     * @param maxIterations maximum number of convergents\n     * @throws FractionConversionException if the continued fraction failed to\n     *         converge.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 42)",
        "(line 182,col 9)-(line 182,col 26)",
        "(line 183,col 9)-(line 183,col 43)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 189,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 20)",
        "(line 196,col 9)-(line 196,col 20)",
        "(line 197,col 9)-(line 197,col 21)",
        "(line 198,col 9)-(line 198,col 20)",
        "(line 200,col 9)-(line 200,col 20)",
        "(line 201,col 9)-(line 201,col 20)",
        "(line 203,col 9)-(line 203,col 18)",
        "(line 204,col 9)-(line 204,col 29)",
        "(line 205,col 9)-(line 229,col 24)",
        "(line 231,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.Fraction.Fraction(int)",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Create a fraction from an int.\n     * The fraction is num / 1.\n     * @param num the numerator.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.Fraction.Fraction(int, int)",
      "begin_line": 261,
      "end_line": 289,
      "comment": "\n     * Create a fraction given the numerator and denominator.  The fraction is\n     * reduced to lowest terms.\n     * @param num the numerator.\n     * @param den the denominator.\n     * @throws MathArithmeticException if the denominator is {@code zero}\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 52)",
        "(line 277,col 9)-(line 280,col 9)",
        "(line 283,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 287,col 31)",
        "(line 288,col 9)-(line 288,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.abs()",
      "begin_line": 295,
      "end_line": 303,
      "comment": "\n     * Returns the absolute value of this fraction.\n     * @return the absolute value.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 21)",
        "(line 297,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.compareTo(org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 311,
      "end_line": 315,
      "comment": "\n     * Compares this object to another based on size.\n     * @param object the object to compare to\n     * @return -1 if this is less than \u003ctt\u003eobject\u003c/tt\u003e, +1 if this is greater\n     *         than \u003ctt\u003eobject\u003c/tt\u003e, 0 if they are equal.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 59)",
        "(line 313,col 9)-(line 313,col 59)",
        "(line 314,col 9)-(line 314,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.doubleValue()",
      "begin_line": 322,
      "end_line": 325,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * @return the fraction as a \u003ctt\u003edouble\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.equals(java.lang.Object)",
      "begin_line": 336,
      "end_line": 349,
      "comment": "\n     * Test for the equality of two fractions.  If the lowest term\n     * numerator and denominators are the same for both fractions, the two\n     * fractions are considered to be equal.\n     * @param other fraction to test for equality to this fraction\n     * @return true if two fractions are equal, false if object is\n     *         \u003ctt\u003enull\u003c/tt\u003e, not an instance of {@link Fraction}, or not equal\n     *         to this fraction instance.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.floatValue()",
      "begin_line": 356,
      "end_line": 359,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003efloat\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * @return the fraction as a \u003ctt\u003efloat\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.getDenominator()",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * Access the denominator.\n     * @return the denominator.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.getNumerator()",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n     * Access the numerator.\n     * @return the numerator.\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.hashCode()",
      "begin_line": 381,
      "end_line": 384,
      "comment": "\n     * Gets a hashCode for the fraction.\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.intValue()",
      "begin_line": 391,
      "end_line": 394,
      "comment": "\n     * Gets the fraction as an \u003ctt\u003eint\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.longValue()",
      "begin_line": 401,
      "end_line": 404,
      "comment": "\n     * Gets the fraction as a \u003ctt\u003elong\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.negate()",
      "begin_line": 410,
      "end_line": 415,
      "comment": "\n     * Return the additive inverse of this fraction.\n     * @return the negation of this fraction.\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.reciprocal()",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\n     * Return the multiplicative inverse of this fraction.\n     * @return the reciprocal fraction\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.add(org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 435,
      "end_line": 437,
      "comment": "\n     * \u003cp\u003eAdds the value of this fraction to another, returning the result in reduced form.\n     * The algorithm follows Knuth, 4.5.1.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to add, must not be {@code null}\n     * @return a {@code Fraction} instance with the resulting values\n     * @throws NullArgumentException if the fraction is {@code null}\n     * @throws MathArithmeticException if the resulting numerator or denominator exceeds\n     *  {@code Integer.MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.add(int)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n     * Add an integer to the fraction.\n     * @param i the \u003ctt\u003einteger\u003c/tt\u003e to add.\n     * @return this + i\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.subtract(org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 458,
      "end_line": 460,
      "comment": "\n     * \u003cp\u003eSubtracts the value of another fraction from the value of this one,\n     * returning the result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to subtract, must not be {@code null}\n     * @return a {@code Fraction} instance with the resulting values\n     * @throws NullArgumentException if the fraction is {@code null}\n     * @throws MathArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an {@code int}.\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.subtract(int)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * Subtract an integer from the fraction.\n     * @param i the \u003ctt\u003einteger\u003c/tt\u003e to subtract.\n     * @return this - i\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.addSub(org.apache.commons.math3.fraction.Fraction, boolean)",
      "begin_line": 481,
      "end_line": 526,
      "comment": "\n     * Implement add and subtract using algorithm described in Knuth 4.5.1.\n     *\n     * @param fraction the fraction to subtract, must not be {@code null}\n     * @param isAdd true to add, false to subtract\n     * @return a {@code Fraction} instance with the resulting values\n     * @throws NullArgumentException if the fraction is {@code null}\n     * @throws MathArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an {@code int}.\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 491,col 9)",
        "(line 494,col 9)-(line 494,col 72)",
        "(line 495,col 9)-(line 503,col 9)",
        "(line 507,col 9)-(line 508,col 63)",
        "(line 509,col 9)-(line 510,col 54)",
        "(line 511,col 9)-(line 511,col 64)",
        "(line 514,col 9)-(line 514,col 62)",
        "(line 515,col 9)-(line 515,col 64)",
        "(line 518,col 9)-(line 518,col 56)",
        "(line 519,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 525,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.multiply(org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 538,
      "end_line": 552,
      "comment": "\n     * \u003cp\u003eMultiplies the value of this fraction by another, returning the\n     * result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to multiply by, must not be {@code null}\n     * @return a {@code Fraction} instance with the resulting values\n     * @throws NullArgumentException if the fraction is {@code null}\n     * @throws MathArithmeticException if the resulting numerator or denominator exceeds\n     *  {@code Integer.MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 547,col 9)-(line 547,col 70)",
        "(line 548,col 9)-(line 548,col 70)",
        "(line 549,col 9)-(line 551,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.multiply(int)",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\n     * Multiply the fraction by an integer.\n     * @param i the \u003ctt\u003einteger\u003c/tt\u003e to multiply by.\n     * @return this * i\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.divide(org.apache.commons.math3.fraction.Fraction)",
      "begin_line": 573,
      "end_line": 582,
      "comment": "\n     * \u003cp\u003eDivide the value of this fraction by another.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to divide by, must not be {@code null}\n     * @return a {@code Fraction} instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is {@code null}\n     * @throws MathArithmeticException if the fraction to divide by is zero\n     * @throws MathArithmeticException if the resulting numerator or denominator exceeds\n     *  {@code Integer.MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.divide(int)",
      "begin_line": 589,
      "end_line": 591,
      "comment": "\n     * Divide the fraction by an integer.\n     * @param i the \u003ctt\u003einteger\u003c/tt\u003e to divide by.\n     * @return this * i\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.percentageValue()",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the\n     * fraction as the numerator divided by denominator multiplied by 100.\n     * \u003c/p\u003e\n     *\n     * @return the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.getReducedFraction(int, int)",
      "begin_line": 616,
      "end_line": 642,
      "comment": "\n     * \u003cp\u003eCreates a {@code Fraction} instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eAny negative signs are resolved to be on the numerator.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     * @return a new fraction instance, with the numerator and denominator reduced\n     * @throws MathArithmeticException if the denominator is {@code zero}\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 623,col 9)",
        "(line 625,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 636,col 9)",
        "(line 638,col 9)-(line 638,col 62)",
        "(line 639,col 9)-(line 639,col 25)",
        "(line 640,col 9)-(line 640,col 27)",
        "(line 641,col 9)-(line 641,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.toString()",
      "begin_line": 653,
      "end_line": 664,
      "comment": "\n     * \u003cp\u003e\n     * Returns the {@code String} representing this fraction, ie\n     * \"num / dem\" or just \"num\" if the denominator is one.\n     * \u003c/p\u003e\n     *\n     * @return a string representation of the fraction.\n     * @see java.lang.Object#toString()\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 26)",
        "(line 656,col 9)-(line 662,col 9)",
        "(line 663,col 9)-(line 663,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.Fraction.getField()",
      "begin_line": 667,
      "end_line": 669,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 43)"
      ]
    }
  ]
}