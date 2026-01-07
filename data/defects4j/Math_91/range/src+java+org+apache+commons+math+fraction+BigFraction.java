{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/fraction/BigFraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigFraction",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.math.fraction.BigFraction\u003e"
      ],
      "begin_line": 31,
      "end_line": 1104,
      "comment": "\n * Representation of a rational number without any overflow. This class is\n * immutable.\n * \n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " A fraction representing \"1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " A fraction representing \"0\". "
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_FIFTHS"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " A fraction representing \"4/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_FIFTH"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " A fraction representing \"1/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HALF"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " A fraction representing \"1/2\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_QUARTER"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " A fraction representing \"1/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_THIRD"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " A fraction representing \"1/3\". "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_FIFTHS"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " A fraction representing \"3/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_QUARTERS"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " A fraction representing \"3/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_FIFTHS"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " A fraction representing \"4/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_QUARTERS"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " A fraction representing \"2/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_THIRDS"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " A fraction representing \"2/3\". "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_ONE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " A fraction representing \"-1 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HUNDRED_DOUBLE"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " \u003ccode\u003eBigInteger\u003c/code\u003e representation of 100. "
    },
    {
      "type": "field",
      "varNames": [
        "numerator"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The numerator. "
    },
    {
      "type": "field",
      "varNames": [
        "denominator"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The denominator. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getReducedFraction(int, int)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "\n     * \u003cp\u003e\n     * Creates a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the 2 parts of a fraction\n     * Y/Z.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * Any negative signs are resolved to be on the numerator.\n     * \u003c/p\u003e\n     * \n     * @param numerator\n     *            the numerator, for example the three in \u0027three sevenths\u0027.\n     * @param denominator\n     *            the denominator, for example the seven in \u0027three sevenths\u0027.\n     * @return a new fraction instance, with the numerator and denominator\n     *         reduced.\n     * @throws ArithmeticException\n     *             if the denominator is \u003ccode\u003ezero\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 109,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(java.math.BigInteger)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed \u003ctt\u003eBigInteger\u003c/tt\u003e, ie\n     * \"num / 1\".\n     * \u003c/p\u003e\n     * \n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 140,
      "end_line": 173,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} given the numerator and denominator as\n     * \u003ccode\u003eBigInteger\u003c/code\u003e. The {@link BigFraction} is reduced to lowest terms.\n     * \u003c/p\u003e\n     * \n     * @param num\n     *            the numerator, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @param den\n     *            the denominator, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @throws ArithmeticException\n     *             if the denominator is \u003ccode\u003ezero\u003c/code\u003e.\n     * @throws NullPointerException\n     *             if the numerator or the denominator is \u003ccode\u003ezero\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 172,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double)",
      "begin_line": 196,
      "end_line": 230,
      "comment": "\n     * Create a fraction given the double value.\n     * \u003cp\u003e\n     * This constructor behaves \u003cem\u003edifferently\u003c/em\u003e from\n     * {@link #BigFraction(double, double, int)}. It converts the\n     * double value exactly, considering its internal bits representation.\n     * This does work for all values except NaN and infinities and does\n     * not requires any loop or convergence threshold.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Since this conversion is exact and since double numbers are sometimes\n     * approximated, the fraction created may seem strange in some cases. For example\n     * calling \u003ccode\u003enew BigFraction(1.0 / 3.0)\u003c/code\u003e does \u003cem\u003enot\u003c/em\u003e create\n     * the fraction 1/3 but the fraction 6004799503160661 / 18014398509481984\n     * because the double number passed to the constructor is not exactly 1/3\n     * (this number cannot be stored exactly in IEEE754).\n     * \u003c/p\u003e\n     * @see #BigFraction(double, double, int)\n     * @param value the double value to convert to a fraction.\n     * @exception IllegalArgumentException if value is NaN or infinite\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 205,col 9)-(line 205,col 61)",
        "(line 206,col 9)-(line 206,col 57)",
        "(line 207,col 9)-(line 207,col 57)",
        "(line 208,col 9)-(line 208,col 57)",
        "(line 209,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 48)",
        "(line 217,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double, double, int)",
      "begin_line": 253,
      "end_line": 257,
      "comment": "\n     * Create a fraction given the double value and maximum error allowed.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the double value to convert to a fraction.\n     * @param epsilon\n     *            maximum error allowed. The resulting fraction is within\n     *            \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxIterations\n     *            maximum number of convergents.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     * @see #BigFraction(double)\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double, double, int, int)",
      "begin_line": 293,
      "end_line": 357,
      "comment": "\n     * Create a fraction given the double value and either the maximum error\n     * allowed or the maximum number of denominator digits.\n     * \u003cp\u003e\n     * \n     * NOTE: This constructor is called with EITHER - a valid epsilon value and\n     * the maxDenominator set to Integer.MAX_VALUE (that way the maxDenominator\n     * has no effect). OR - a valid maxDenominator value and the epsilon value\n     * set to zero (that way epsilon only has effect if there is an exact match\n     * before the maxDenominator value is reached).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * \n     * It has been done this way so that the same code can be (re)used for both\n     * scenarios. However this could be confusing to users if it were part of\n     * the public API and this constructor should therefore remain PRIVATE.\n     * \u003c/p\u003e\n     * \n     * See JIRA issue ticket MATH-181 for more details:\n     * \n     * https://issues.apache.org/jira/browse/MATH-181\n     * \n     * @param value\n     *            the double value to convert to a fraction.\n     * @param epsilon\n     *            maximum error allowed. The resulting fraction is within\n     *            \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxDenominator\n     *            maximum denominator value allowed.\n     * @param maxIterations\n     *            maximum number of convergents.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 42)",
        "(line 297,col 9)-(line 297,col 26)",
        "(line 298,col 9)-(line 298,col 40)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 305,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 311,col 20)",
        "(line 312,col 9)-(line 312,col 20)",
        "(line 313,col 9)-(line 313,col 21)",
        "(line 314,col 9)-(line 314,col 20)",
        "(line 316,col 9)-(line 316,col 20)",
        "(line 317,col 9)-(line 317,col 20)",
        "(line 319,col 9)-(line 319,col 18)",
        "(line 320,col 9)-(line 320,col 29)",
        "(line 321,col 9)-(line 344,col 24)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 356,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double, int)",
      "begin_line": 376,
      "end_line": 379,
      "comment": "\n     * Create a fraction given the double value and maximum denominator.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \n     * @param value\n     *            the double value to convert to a fraction.\n     * @param maxDenominator\n     *            The maximum allowed value for denominator.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(int)",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed \u003ctt\u003eint\u003c/tt\u003e, ie\n     * \"num / 1\".\n     * \u003c/p\u003e\n     * \n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(int, int)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} given the numerator and denominator as simple\n     * \u003ctt\u003eint\u003c/tt\u003e. The {@link BigFraction} is reduced to lowest terms.\n     * \u003c/p\u003e\n     * \n     * @param num\n     *            the numerator.\n     * @param den\n     *            the denominator.\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(long)",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed long, ie \"num / 1\".\n     * \u003c/p\u003e\n     * \n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(long, long)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} given the numerator and denominator as simple\n     * \u003ctt\u003elong\u003c/tt\u003e. The {@link BigFraction} is reduced to lowest terms.\n     * \u003c/p\u003e\n     * \n     * @param num\n     *            the numerator.\n     * @param den\n     *            the denominator.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.abs()",
      "begin_line": 443,
      "end_line": 445,
      "comment": "\n     * \u003cp\u003e\n     * Returns the absolute value of this {@link BigFraction}.\n     * \u003c/p\u003e\n     * \n     * @return the absolute value as a {@link BigFraction}.\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(java.math.BigInteger)",
      "begin_line": 459,
      "end_line": 461,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed {@link BigInteger},\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param bg\n     *            the {@link BigInteger} to add, must\u0027nt be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     * @throws NullPointerException\n     *             if the {@link BigInteger} is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 475,
      "end_line": 492,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     * \n     * @param fraction\n     *            the {@link BigFraction} to add, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullPointerException\n     *             if the {@link BigFraction} is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 478,col 9)",
        "(line 480,col 9)-(line 480,col 30)",
        "(line 481,col 9)-(line 481,col 30)",
        "(line 483,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(int)",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed \u003ctt\u003einteger\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param i\n     *            the \u003ctt\u003einteger\u003c/tt\u003e to add.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(long)",
      "begin_line": 518,
      "end_line": 520,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed \u003ctt\u003elong\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to add.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.bigDecimalValue()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e. This calculates the\n     * fraction as the numerator divided by denominator.\n     * \u003c/p\u003e\n     * \n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @throws ArithmeticException\n     *             if the exact quotient does not have a terminating decimal\n     *             expansion.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.bigDecimalValue(int)",
      "begin_line": 553,
      "end_line": 555,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e following the passed\n     * rounding mode. This calculates the fraction as the numerator divided by\n     * denominator.\n     * \u003c/p\u003e\n     * \n     * @param roundingMode\n     *            rounding mode to apply. see {@link BigDecimal} constants.\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @throws IllegalArgumentException\n     *             if \u003ctt\u003eroundingMode\u003c/tt\u003e does not represent a valid rounding\n     *             mode.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.bigDecimalValue(int, int)",
      "begin_line": 572,
      "end_line": 574,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e following the passed scale\n     * and rounding mode. This calculates the fraction as the numerator divided\n     * by denominator.\n     * \u003c/p\u003e\n     * \n     * @param scale\n     *            scale of the \u003ccode\u003eBigDecimal\u003c/code\u003e quotient to be returned.\n     *            see {@link BigDecimal} for more information.\n     * @param roundingMode\n     *            rounding mode to apply. see {@link BigDecimal} constants.\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.compareTo(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 587,
      "end_line": 591,
      "comment": "\n     * \u003cp\u003e\n     * Compares this object to another based on size.\n     * \u003c/p\u003e\n     * \n     * @param object\n     *            the object to compare to, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return -1 if this is less than \u003ctt\u003eobject\u003c/tt\u003e, +1 if this is greater\n     *         than \u003ctt\u003eobject\u003c/tt\u003e, 0 if they are equal.\n     * @see java.lang.Comparable#compareTo(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 64)",
        "(line 589,col 9)-(line 589,col 64)",
        "(line 590,col 9)-(line 590,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(java.math.BigInteger)",
      "begin_line": 606,
      "end_line": 608,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed \u003ccode\u003eBigInteger\u003c/code\u003e,\n     * ie \"this * 1 / bg\", returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param bg\n     *            the \u003ccode\u003eBigInteger\u003c/code\u003e to divide by, must not be\n     *            \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullPointerException\n     *             if the \u003ccode\u003eBigInteger\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 624,
      "end_line": 630,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     * \n     * @param fraction\n     *            the fraction to divide by, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullPointerException\n     *             if the fraction is \u003ccode\u003enull\u003c/code\u003e.\n     * @throws ArithmeticException\n     *             if the fraction to divide by is zero.\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 627,col 9)",
        "(line 629,col 9)-(line 629,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(int)",
      "begin_line": 642,
      "end_line": 644,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed \u003ctt\u003eint\u003c/tt\u003e, ie\n     * \"this * 1 / i\", returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param i\n     *            the \u003ctt\u003eint\u003c/tt\u003e to divide by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(long)",
      "begin_line": 656,
      "end_line": 658,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed \u003ctt\u003elong\u003c/tt\u003e, ie\n     * \"this * 1 / l\", returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to divide by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.doubleValue()",
      "begin_line": 669,
      "end_line": 672,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * \u003c/p\u003e\n     * \n     * @return the fraction as a \u003ctt\u003edouble\u003c/tt\u003e\n     * @see java.lang.Number#doubleValue()\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.equals(java.lang.Object)",
      "begin_line": 689,
      "end_line": 702,
      "comment": "\n     * \u003cp\u003e\n     * Test for the equality of two fractions. If the lowest term numerator and\n     * denominators are the same for both fractions, the two fractions are\n     * considered to be equal.\n     * \u003c/p\u003e\n     * \n     * @param other\n     *            fraction to test for equality to this fraction, can be\n     *            \u003ccode\u003enull\u003c/code\u003e.\n     * @return true if two fractions are equal, false if object is\n     *         \u003ccode\u003enull\u003c/code\u003e, not an instance of {@link BigFraction}, or not\n     *         equal to this fraction instance.\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 28)",
        "(line 693,col 9)-(line 699,col 9)",
        "(line 701,col 9)-(line 701,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.floatValue()",
      "begin_line": 713,
      "end_line": 716,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003efloat\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * \u003c/p\u003e\n     * \n     * @return the fraction as a \u003ctt\u003efloat\u003c/tt\u003e.\n     * @see java.lang.Number#floatValue()\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getDenominator()",
      "begin_line": 725,
      "end_line": 727,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return the denominator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getDenominatorAsInt()",
      "begin_line": 736,
      "end_line": 738,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ctt\u003eint\u003c/tt\u003e.\n     * \u003c/p\u003e\n     * \n     * @return the denominator as a \u003ctt\u003eint\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getDenominatorAsLong()",
      "begin_line": 747,
      "end_line": 749,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ctt\u003elong\u003c/tt\u003e.\n     * \u003c/p\u003e\n     * \n     * @return the denominator as a \u003ctt\u003elong\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getNumerator()",
      "begin_line": 758,
      "end_line": 760,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     * \u003c/p\u003e\n     * \n     * @return the numerator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getNumeratorAsInt()",
      "begin_line": 769,
      "end_line": 771,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ctt\u003eint\u003c/tt\u003e.\n     * \u003c/p\u003e\n     * \n     * @return the numerator as a \u003ctt\u003eint\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getNumeratorAsLong()",
      "begin_line": 780,
      "end_line": 782,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ctt\u003elong\u003c/tt\u003e.\n     * \u003c/p\u003e\n     * \n     * @return the numerator as a \u003ctt\u003elong\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.hashCode()",
      "begin_line": 792,
      "end_line": 795,
      "comment": "\n     * \u003cp\u003e\n     * Gets a hashCode for the fraction.\n     * \u003c/p\u003e\n     * \n     * @return a hash code value for this object.\n     * @see java.lang.Object#hashCode()\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.intValue()",
      "begin_line": 806,
      "end_line": 809,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as an \u003ctt\u003eint\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * \u003c/p\u003e\n     * \n     * @return the whole number fraction part.\n     * @see java.lang.Number#intValue()\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 808,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.longValue()",
      "begin_line": 820,
      "end_line": 823,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003elong\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * \u003c/p\u003e\n     * \n     * @return the whole number fraction part.\n     * @see java.lang.Number#longValue()\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(java.math.BigInteger)",
      "begin_line": 837,
      "end_line": 839,
      "comment": "\n     * \u003cp\u003e\n     * Multiplies the value of this fraction by the passed\n     * \u003ccode\u003eBigInteger\u003c/code\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param bg\n     *            the \u003ccode\u003eBigInteger\u003c/code\u003e to multiply by.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     * @throws NullPointerException\n     *             if the bg is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 853,
      "end_line": 861,
      "comment": "\n     * \u003cp\u003e\n     * Multiplies the value of this fraction by another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     * \n     * @param fraction\n     *            the fraction to multiply by, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullPointerException\n     *             if the fraction is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 31)",
        "(line 856,col 9)-(line 858,col 9)",
        "(line 860,col 9)-(line 860,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(int)",
      "begin_line": 873,
      "end_line": 875,
      "comment": "\n     * \u003cp\u003e\n     * Multiply the value of this fraction by the passed \u003ctt\u003eint\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param i\n     *            the \u003ctt\u003eint\u003c/tt\u003e to multiply by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(long)",
      "begin_line": 887,
      "end_line": 889,
      "comment": "\n     * \u003cp\u003e\n     * Multiply the value of this fraction by the passed \u003ctt\u003elong\u003c/tt\u003e,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to multiply by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.negate()",
      "begin_line": 899,
      "end_line": 901,
      "comment": "\n     * \u003cp\u003e\n     * Return the additive inverse of this fraction, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     * \n     * @return the negation of this fraction.\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 900,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.percentageValue()",
      "begin_line": 911,
      "end_line": 913,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the\n     * fraction as the numerator divided by denominator multiplied by 100.\n     * \u003c/p\u003e\n     * \n     * @return the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(java.math.BigInteger)",
      "begin_line": 925,
      "end_line": 937,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003eBigFraction\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e as a \u003ccode\u003eBigFraction\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 31)",
        "(line 927,col 9)-(line 934,col 9)",
        "(line 936,col 9)-(line 936,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 949,
      "end_line": 951,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003eBigFraction\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 950,col 135)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(int)",
      "begin_line": 964,
      "end_line": 966,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ctt\u003einteger\u003c/tt\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigInteger\u003c/code\u003e is to be\n     *            raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 965,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(long)",
      "begin_line": 978,
      "end_line": 980,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003eBigFraction\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e as a \u003ccode\u003eBigFraction\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.reciprocal()",
      "begin_line": 989,
      "end_line": 991,
      "comment": "\n     * \u003cp\u003e\n     * Return the multiplicative inverse of this fraction.\n     * \u003c/p\u003e\n     * \n     * @return the reciprocal fraction.\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.reduce()",
      "begin_line": 1001,
      "end_line": 1004,
      "comment": "\n     * \u003cp\u003e\n     * Reduce this \u003ccode\u003eBigFraction\u003c/code\u003e to its lowest terms.\n     * \u003c/p\u003e\n     * \n     * @return the reduced \u003ccode\u003eBigFraction\u003c/code\u003e. It doesn\u0027t change anything if\n     *         the fraction can be reduced.\n     ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 58)",
        "(line 1003,col 9)-(line 1003,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(java.math.BigInteger)",
      "begin_line": 1019,
      "end_line": 1021,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of an {@link BigInteger} from the value of this one,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param bg\n     *            the {@link BigInteger} to subtract, must\u0027nt be\n     *            \u003ccode\u003enull\u003c/code\u003e.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     * @throws NullPointerException\n     *             if the {@link BigInteger} is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 1036,
      "end_line": 1052,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of another fraction from the value of this one,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param fraction\n     *            the {@link BigFraction} to subtract, must not be\n     *            \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values\n     * @throws NullPointerException\n     *             if the fraction is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1039,col 9)",
        "(line 1041,col 9)-(line 1041,col 30)",
        "(line 1042,col 9)-(line 1042,col 30)",
        "(line 1043,col 9)-(line 1049,col 9)",
        "(line 1050,col 9)-(line 1050,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(int)",
      "begin_line": 1064,
      "end_line": 1066,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of an \u003ctt\u003einteger\u003c/tt\u003e from the value of this one,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param i\n     *            the \u003ctt\u003einteger\u003c/tt\u003e to subtract.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1065,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(long)",
      "begin_line": 1079,
      "end_line": 1081,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of an \u003ctt\u003einteger\u003c/tt\u003e from the value of this one,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     * \n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to subtract.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values, or\n     *         this object if the \u003ctt\u003elong\u003c/tt\u003e is zero.\n     ",
      "child_ranges": [
        "(line 1080,col 9)-(line 1080,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.toString()",
      "begin_line": 1092,
      "end_line": 1103,
      "comment": "\n     * \u003cp\u003e\n     * Returns the \u003ccode\u003eString\u003c/code\u003e representing this fraction, ie\n     * \"num / dem\" or just \"num\" if the denominator is one.\n     * \u003c/p\u003e\n     * \n     * @return a string representation of the fraction.\n     * @see java.lang.Object#toString()\n     ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1094,col 26)",
        "(line 1095,col 9)-(line 1101,col 9)",
        "(line 1102,col 9)-(line 1102,col 19)"
      ]
    }
  ]
}