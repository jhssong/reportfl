{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/fraction/BigFraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigFraction",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "org.apache.commons.math.FieldElement\u003corg.apache.commons.math.fraction.BigFraction\u003e",
        "java.lang.Comparable\u003corg.apache.commons.math.fraction.BigFraction\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 1126,
      "comment": "\n * Representation of a rational number without any overflow. This class is\n * immutable.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "TWO"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " A fraction representing \"2 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " A fraction representing \"1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " A fraction representing \"0\". "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_ONE"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " A fraction representing \"-1 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_FIFTHS"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " A fraction representing \"4/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_FIFTH"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " A fraction representing \"1/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HALF"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " A fraction representing \"1/2\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_QUARTER"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " A fraction representing \"1/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_THIRD"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " A fraction representing \"1/3\". "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_FIFTHS"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " A fraction representing \"3/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_QUARTERS"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " A fraction representing \"3/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_FIFTHS"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " A fraction representing \"2/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_QUARTERS"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " A fraction representing \"2/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_THIRDS"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " A fraction representing \"2/3\". "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HUNDRED_DOUBLE"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " \u003ccode\u003eBigInteger\u003c/code\u003e representation of 100. "
    },
    {
      "type": "field",
      "varNames": [
        "numerator"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The numerator. "
    },
    {
      "type": "field",
      "varNames": [
        "denominator"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The denominator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(java.math.BigInteger)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed \u003ctt\u003eBigInteger\u003c/tt\u003e, ie\n     * \"num / 1\".\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 118,
      "end_line": 147,
      "comment": "\n     * Create a {@link BigFraction} given the numerator and denominator as\n     * {@code BigInteger}. The {@link BigFraction} is reduced to lowest terms.\n     *\n     * @param num the numerator, must not be {@code null}.\n     * @param den the denominator, must not be {@code null}.\n     * @throws ZeroException if the denominator is zero.\n     * @throws NullArgumentException if either of the arguments is null\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 64)",
        "(line 120,col 9)-(line 120,col 66)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double)",
      "begin_line": 170,
      "end_line": 204,
      "comment": "\n     * Create a fraction given the double value.\n     * \u003cp\u003e\n     * This constructor behaves \u003cem\u003edifferently\u003c/em\u003e from\n     * {@link #BigFraction(double, double, int)}. It converts the double value\n     * exactly, considering its internal bits representation. This works for all\n     * values except NaN and infinities and does not requires any loop or\n     * convergence threshold.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Since this conversion is exact and since double numbers are sometimes\n     * approximated, the fraction created may seem strange in some cases. For example,\n     * calling \u003ccode\u003enew BigFraction(1.0 / 3.0)\u003c/code\u003e does \u003cem\u003enot\u003c/em\u003e create\n     * the fraction 1/3, but the fraction 6004799503160661 / 18014398509481984\n     * because the double number passed to the constructor is not exactly 1/3\n     * (this number cannot be stored exactly in IEEE754).\n     * \u003c/p\u003e\n     * @see #BigFraction(double, double, int)\n     * @param value the double value to convert to a fraction.\n     * @exception MathIllegalArgumentException if value is NaN or infinite\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 179,col 9)-(line 179,col 61)",
        "(line 180,col 9)-(line 180,col 57)",
        "(line 181,col 9)-(line 181,col 57)",
        "(line 182,col 9)-(line 182,col 57)",
        "(line 183,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 48)",
        "(line 191,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double, double, int)",
      "begin_line": 227,
      "end_line": 231,
      "comment": "\n     * Create a fraction given the double value and maximum error allowed.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the double value to convert to a fraction.\n     * @param epsilon\n     *            maximum error allowed. The resulting fraction is within\n     *            \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxIterations\n     *            maximum number of convergents.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     * @see #BigFraction(double)\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double, double, int, int)",
      "begin_line": 267,
      "end_line": 331,
      "comment": "\n     * Create a fraction given the double value and either the maximum error\n     * allowed or the maximum number of denominator digits.\n     * \u003cp\u003e\n     *\n     * NOTE: This constructor is called with EITHER - a valid epsilon value and\n     * the maxDenominator set to Integer.MAX_VALUE (that way the maxDenominator\n     * has no effect). OR - a valid maxDenominator value and the epsilon value\n     * set to zero (that way epsilon only has effect if there is an exact match\n     * before the maxDenominator value is reached).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     *\n     * It has been done this way so that the same code can be (re)used for both\n     * scenarios. However this could be confusing to users if it were part of\n     * the public API and this constructor should therefore remain PRIVATE.\n     * \u003c/p\u003e\n     *\n     * See JIRA issue ticket MATH-181 for more details:\n     *\n     * https://issues.apache.org/jira/browse/MATH-181\n     *\n     * @param value\n     *            the double value to convert to a fraction.\n     * @param epsilon\n     *            maximum error allowed. The resulting fraction is within\n     *            \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxDenominator\n     *            maximum denominator value allowed.\n     * @param maxIterations\n     *            maximum number of convergents.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 42)",
        "(line 271,col 9)-(line 271,col 26)",
        "(line 272,col 9)-(line 272,col 44)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 279,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 20)",
        "(line 286,col 9)-(line 286,col 20)",
        "(line 287,col 9)-(line 287,col 21)",
        "(line 288,col 9)-(line 288,col 20)",
        "(line 290,col 9)-(line 290,col 20)",
        "(line 291,col 9)-(line 291,col 20)",
        "(line 293,col 9)-(line 293,col 18)",
        "(line 294,col 9)-(line 294,col 29)",
        "(line 295,col 9)-(line 318,col 24)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double, int)",
      "begin_line": 350,
      "end_line": 353,
      "comment": "\n     * Create a fraction given the double value and maximum denominator.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the double value to convert to a fraction.\n     * @param maxDenominator\n     *            The maximum allowed value for denominator.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     ",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(int)",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed \u003ctt\u003eint\u003c/tt\u003e, ie\n     * \"num / 1\".\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(int, int)",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} given the numerator and denominator as simple\n     * \u003ctt\u003eint\u003c/tt\u003e. The {@link BigFraction} is reduced to lowest terms.\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     * @param den\n     *            the denominator.\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(long)",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed long, ie \"num / 1\".\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(long, long)",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} given the numerator and denominator as simple\n     * \u003ctt\u003elong\u003c/tt\u003e. The {@link BigFraction} is reduced to lowest terms.\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     * @param den\n     *            the denominator.\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getReducedFraction(int, int)",
      "begin_line": 429,
      "end_line": 436,
      "comment": "\n     * \u003cp\u003e\n     * Creates a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the 2 parts of a fraction\n     * Y/Z.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Any negative signs are resolved to be on the numerator.\n     * \u003c/p\u003e\n     *\n     * @param numerator\n     *            the numerator, for example the three in \u0027three sevenths\u0027.\n     * @param denominator\n     *            the denominator, for example the seven in \u0027three sevenths\u0027.\n     * @return a new fraction instance, with the numerator and denominator\n     *         reduced.\n     * @throws ArithmeticException\n     *             if the denominator is \u003ccode\u003ezero\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 435,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.abs()",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\n     * \u003cp\u003e\n     * Returns the absolute value of this {@link BigFraction}.\n     * \u003c/p\u003e\n     *\n     * @return the absolute value as a {@link BigFraction}.\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(java.math.BigInteger)",
      "begin_line": 461,
      "end_line": 464,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed {@link BigInteger},\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg\n     *            the {@link BigInteger} to add, must\u0027nt be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     * @throws NullArgumentException\n     *             if the {@link BigInteger} is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 35)",
        "(line 463,col 9)-(line 463,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(int)",
      "begin_line": 476,
      "end_line": 478,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed \u003ctt\u003einteger\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i\n     *            the \u003ctt\u003einteger\u003c/tt\u003e to add.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(long)",
      "begin_line": 490,
      "end_line": 492,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed \u003ctt\u003elong\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to add.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 505,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction\n     *            the {@link BigFraction} to add, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if the {@link BigFraction} is {@code null}.\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 513,col 9)-(line 513,col 30)",
        "(line 514,col 9)-(line 514,col 30)",
        "(line 516,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.bigDecimalValue()",
      "begin_line": 539,
      "end_line": 541,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e. This calculates the\n     * fraction as the numerator divided by denominator.\n     * \u003c/p\u003e\n     *\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @throws ArithmeticException\n     *             if the exact quotient does not have a terminating decimal\n     *             expansion.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.bigDecimalValue(int)",
      "begin_line": 558,
      "end_line": 560,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e following the passed\n     * rounding mode. This calculates the fraction as the numerator divided by\n     * denominator.\n     * \u003c/p\u003e\n     *\n     * @param roundingMode\n     *            rounding mode to apply. see {@link BigDecimal} constants.\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @throws IllegalArgumentException\n     *             if \u003ctt\u003eroundingMode\u003c/tt\u003e does not represent a valid rounding\n     *             mode.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.bigDecimalValue(int, int)",
      "begin_line": 577,
      "end_line": 579,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e following the passed scale\n     * and rounding mode. This calculates the fraction as the numerator divided\n     * by denominator.\n     * \u003c/p\u003e\n     *\n     * @param scale\n     *            scale of the \u003ccode\u003eBigDecimal\u003c/code\u003e quotient to be returned.\n     *            see {@link BigDecimal} for more information.\n     * @param roundingMode\n     *            rounding mode to apply. see {@link BigDecimal} constants.\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.compareTo(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 592,
      "end_line": 596,
      "comment": "\n     * \u003cp\u003e\n     * Compares this object to another based on size.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the object to compare to, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return -1 if this is less than \u003ctt\u003eobject\u003c/tt\u003e, +1 if this is greater\n     *         than \u003ctt\u003eobject\u003c/tt\u003e, 0 if they are equal.\n     * @see java.lang.Comparable#compareTo(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 64)",
        "(line 594,col 9)-(line 594,col 64)",
        "(line 595,col 9)-(line 595,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(java.math.BigInteger)",
      "begin_line": 612,
      "end_line": 617,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed \u003ccode\u003eBigInteger\u003c/code\u003e,\n     * ie \"this * 1 / bg\", returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg\n     *            the \u003ccode\u003eBigInteger\u003c/code\u003e to divide by, must not be\n     *            \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if the {@code BigInteger} is {@code null}.\n     * @throws ZeroException\n     *             if the fraction to divide by is zero.\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 615,col 9)",
        "(line 616,col 9)-(line 616,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(int)",
      "begin_line": 631,
      "end_line": 633,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed \u003ctt\u003eint\u003c/tt\u003e, ie\n     * \"this * 1 / i\", returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i\n     *            the \u003ctt\u003eint\u003c/tt\u003e to divide by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws ArithmeticException\n     *             if the fraction to divide by is zero.\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(long)",
      "begin_line": 647,
      "end_line": 649,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed \u003ctt\u003elong\u003c/tt\u003e, ie\n     * \"this * 1 / l\", returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to divide by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws ArithmeticException\n     *             if the fraction to divide by is zero.\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 662,
      "end_line": 671,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction Fraction to divide by, must not be {@code null}.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if the {@code fraction} is {@code null}.\n     * @throws ZeroException if the fraction to divide by is zero.\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 668,col 9)",
        "(line 670,col 9)-(line 670,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.doubleValue()",
      "begin_line": 682,
      "end_line": 685,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * \u003c/p\u003e\n     *\n     * @return the fraction as a \u003ctt\u003edouble\u003c/tt\u003e\n     * @see java.lang.Number#doubleValue()\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.equals(java.lang.Object)",
      "begin_line": 702,
      "end_line": 715,
      "comment": "\n     * \u003cp\u003e\n     * Test for the equality of two fractions. If the lowest term numerator and\n     * denominators are the same for both fractions, the two fractions are\n     * considered to be equal.\n     * \u003c/p\u003e\n     *\n     * @param other\n     *            fraction to test for equality to this fraction, can be\n     *            \u003ccode\u003enull\u003c/code\u003e.\n     * @return true if two fractions are equal, false if object is\n     *         \u003ccode\u003enull\u003c/code\u003e, not an instance of {@link BigFraction}, or not\n     *         equal to this fraction instance.\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 28)",
        "(line 706,col 9)-(line 712,col 9)",
        "(line 714,col 9)-(line 714,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.floatValue()",
      "begin_line": 726,
      "end_line": 729,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003efloat\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * \u003c/p\u003e\n     *\n     * @return the fraction as a \u003ctt\u003efloat\u003c/tt\u003e.\n     * @see java.lang.Number#floatValue()\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getDenominator()",
      "begin_line": 738,
      "end_line": 740,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the denominator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getDenominatorAsInt()",
      "begin_line": 749,
      "end_line": 751,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ctt\u003eint\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the denominator as a \u003ctt\u003eint\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getDenominatorAsLong()",
      "begin_line": 760,
      "end_line": 762,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ctt\u003elong\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the denominator as a \u003ctt\u003elong\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getNumerator()",
      "begin_line": 771,
      "end_line": 773,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the numerator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getNumeratorAsInt()",
      "begin_line": 782,
      "end_line": 784,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ctt\u003eint\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the numerator as a \u003ctt\u003eint\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getNumeratorAsLong()",
      "begin_line": 793,
      "end_line": 795,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ctt\u003elong\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the numerator as a \u003ctt\u003elong\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.hashCode()",
      "begin_line": 805,
      "end_line": 808,
      "comment": "\n     * \u003cp\u003e\n     * Gets a hashCode for the fraction.\n     * \u003c/p\u003e\n     *\n     * @return a hash code value for this object.\n     * @see java.lang.Object#hashCode()\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.intValue()",
      "begin_line": 819,
      "end_line": 822,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as an \u003ctt\u003eint\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * \u003c/p\u003e\n     *\n     * @return the whole number fraction part.\n     * @see java.lang.Number#intValue()\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.longValue()",
      "begin_line": 833,
      "end_line": 836,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003elong\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * \u003c/p\u003e\n     *\n     * @return the whole number fraction part.\n     * @see java.lang.Number#longValue()\n     ",
      "child_ranges": [
        "(line 835,col 9)-(line 835,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(java.math.BigInteger)",
      "begin_line": 848,
      "end_line": 853,
      "comment": "\n     * \u003cp\u003e\n     * Multiplies the value of this fraction by the passed\n     * \u003ccode\u003eBigInteger\u003c/code\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg the {@code BigInteger} to multiply by.\n     * @return a {@code BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if {@code bg} is {@code null}.\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 851,col 9)",
        "(line 852,col 9)-(line 852,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(int)",
      "begin_line": 865,
      "end_line": 867,
      "comment": "\n     * \u003cp\u003e\n     * Multiply the value of this fraction by the passed \u003ctt\u003eint\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i\n     *            the \u003ctt\u003eint\u003c/tt\u003e to multiply by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(long)",
      "begin_line": 879,
      "end_line": 881,
      "comment": "\n     * \u003cp\u003e\n     * Multiply the value of this fraction by the passed \u003ctt\u003elong\u003c/tt\u003e,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to multiply by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 893,
      "end_line": 903,
      "comment": "\n     * \u003cp\u003e\n     * Multiplies the value of this fraction by another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction Fraction to multiply by, must not be {@code null}.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if {@code fraction} is {@code null}.\n     ",
      "child_ranges": [
        "(line 894,col 9)-(line 896,col 9)",
        "(line 897,col 9)-(line 900,col 9)",
        "(line 901,col 9)-(line 902,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.negate()",
      "begin_line": 913,
      "end_line": 915,
      "comment": "\n     * \u003cp\u003e\n     * Return the additive inverse of this fraction, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @return the negation of this fraction.\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.percentageValue()",
      "begin_line": 925,
      "end_line": 927,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the\n     * fraction as the numerator divided by denominator multiplied by 100.\n     * \u003c/p\u003e\n     *\n     * @return the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(int)",
      "begin_line": 940,
      "end_line": 945,
      "comment": "\n     * \u003cp\u003e\n     * Returns a {@code BigFraction} whose value is\n     * {@code (this\u003csup\u003eexponent\u003c/sup\u003e)}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this {@code BigFraction} is to be\n     *            raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 944,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(long)",
      "begin_line": 957,
      "end_line": 964,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003eBigFraction\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e as a \u003ccode\u003eBigFraction\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 961,col 9)",
        "(line 962,col 9)-(line 963,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(java.math.BigInteger)",
      "begin_line": 976,
      "end_line": 984,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003eBigFraction\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e as a \u003ccode\u003eBigFraction\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 981,col 9)",
        "(line 982,col 9)-(line 983,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(double)",
      "begin_line": 996,
      "end_line": 999,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003edouble\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 997,col 9)-(line 998,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.reciprocal()",
      "begin_line": 1008,
      "end_line": 1010,
      "comment": "\n     * \u003cp\u003e\n     * Return the multiplicative inverse of this fraction.\n     * \u003c/p\u003e\n     *\n     * @return the reciprocal fraction.\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.reduce()",
      "begin_line": 1020,
      "end_line": 1023,
      "comment": "\n     * \u003cp\u003e\n     * Reduce this \u003ccode\u003eBigFraction\u003c/code\u003e to its lowest terms.\n     * \u003c/p\u003e\n     *\n     * @return the reduced \u003ccode\u003eBigFraction\u003c/code\u003e. It doesn\u0027t change anything if\n     *         the fraction can be reduced.\n     ",
      "child_ranges": [
        "(line 1021,col 9)-(line 1021,col 58)",
        "(line 1022,col 9)-(line 1022,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(java.math.BigInteger)",
      "begin_line": 1035,
      "end_line": 1040,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of an {@link BigInteger} from the value of this\n     * {@code BigFraction}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg the {@link BigInteger} to subtract, cannot be {@code null}.\n     * @return a {@code BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if the {@link BigInteger} is {@code null}.\n     ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1038,col 9)",
        "(line 1039,col 9)-(line 1039,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(int)",
      "begin_line": 1051,
      "end_line": 1053,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of an {@code integer} from the value of this\n     * {@code BigFraction}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i the {@code integer} to subtract.\n     * @return a {@code BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 1052,col 9)-(line 1052,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(long)",
      "begin_line": 1064,
      "end_line": 1066,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of a {@code long} from the value of this\n     * {@code BigFraction}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l the {@code long} to subtract.\n     * @return a {@code BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1065,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 1078,
      "end_line": 1097,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of another fraction from the value of this one,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction {@link BigFraction} to subtract, must not be {@code null}.\n     * @return a {@link BigFraction} instance with the resulting values\n     * @throws NullArgumentException if the {@code fraction} is {@code null}.\n     ",
      "child_ranges": [
        "(line 1079,col 9)-(line 1081,col 9)",
        "(line 1082,col 9)-(line 1084,col 9)",
        "(line 1086,col 9)-(line 1086,col 30)",
        "(line 1087,col 9)-(line 1087,col 30)",
        "(line 1088,col 9)-(line 1094,col 9)",
        "(line 1095,col 9)-(line 1095,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.toString()",
      "begin_line": 1108,
      "end_line": 1119,
      "comment": "\n     * \u003cp\u003e\n     * Returns the \u003ccode\u003eString\u003c/code\u003e representing this fraction, ie\n     * \"num / dem\" or just \"num\" if the denominator is one.\n     * \u003c/p\u003e\n     *\n     * @return a string representation of the fraction.\n     * @see java.lang.Object#toString()\n     ",
      "child_ranges": [
        "(line 1110,col 9)-(line 1110,col 26)",
        "(line 1111,col 9)-(line 1117,col 9)",
        "(line 1118,col 9)-(line 1118,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getField()",
      "begin_line": 1122,
      "end_line": 1124,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1123,col 9)-(line 1123,col 46)"
      ]
    }
  ]
}