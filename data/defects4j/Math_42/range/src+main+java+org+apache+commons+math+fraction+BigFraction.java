{
  "filepath": "/tmp/Math-42b/src/main/java/org/apache/commons/math/fraction/BigFraction.java",
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
      "begin_line": 39,
      "end_line": 1127,
      "comment": "\n * Representation of a rational number without any overflow. This class is\n * immutable.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "TWO"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " A fraction representing \"2 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " A fraction representing \"1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " A fraction representing \"0\". "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_ONE"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " A fraction representing \"-1 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_FIFTHS"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " A fraction representing \"4/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_FIFTH"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " A fraction representing \"1/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HALF"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " A fraction representing \"1/2\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_QUARTER"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " A fraction representing \"1/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_THIRD"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " A fraction representing \"1/3\". "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_FIFTHS"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " A fraction representing \"3/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_QUARTERS"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " A fraction representing \"3/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_FIFTHS"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " A fraction representing \"2/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_QUARTERS"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " A fraction representing \"2/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_THIRDS"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " A fraction representing \"2/3\". "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HUNDRED"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " \u003ccode\u003eBigInteger\u003c/code\u003e representation of 100. "
    },
    {
      "type": "field",
      "varNames": [
        "numerator"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The numerator. "
    },
    {
      "type": "field",
      "varNames": [
        "denominator"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The denominator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(java.math.BigInteger)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed \u003ctt\u003eBigInteger\u003c/tt\u003e, ie\n     * \"num / 1\".\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 119,
      "end_line": 148,
      "comment": "\n     * Create a {@link BigFraction} given the numerator and denominator as\n     * {@code BigInteger}. The {@link BigFraction} is reduced to lowest terms.\n     *\n     * @param num the numerator, must not be {@code null}.\n     * @param den the denominator, must not be {@code null}.\n     * @throws ZeroException if the denominator is zero.\n     * @throws NullArgumentException if either of the arguments is null\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 64)",
        "(line 121,col 9)-(line 121,col 66)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double)",
      "begin_line": 171,
      "end_line": 205,
      "comment": "\n     * Create a fraction given the double value.\n     * \u003cp\u003e\n     * This constructor behaves \u003cem\u003edifferently\u003c/em\u003e from\n     * {@link #BigFraction(double, double, int)}. It converts the double value\n     * exactly, considering its internal bits representation. This works for all\n     * values except NaN and infinities and does not requires any loop or\n     * convergence threshold.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Since this conversion is exact and since double numbers are sometimes\n     * approximated, the fraction created may seem strange in some cases. For example,\n     * calling \u003ccode\u003enew BigFraction(1.0 / 3.0)\u003c/code\u003e does \u003cem\u003enot\u003c/em\u003e create\n     * the fraction 1/3, but the fraction 6004799503160661 / 18014398509481984\n     * because the double number passed to the constructor is not exactly 1/3\n     * (this number cannot be stored exactly in IEEE754).\n     * \u003c/p\u003e\n     * @see #BigFraction(double, double, int)\n     * @param value the double value to convert to a fraction.\n     * @exception MathIllegalArgumentException if value is NaN or infinite\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 180,col 9)-(line 180,col 61)",
        "(line 181,col 9)-(line 181,col 57)",
        "(line 182,col 9)-(line 182,col 57)",
        "(line 183,col 9)-(line 183,col 57)",
        "(line 184,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 48)",
        "(line 192,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double, double, int)",
      "begin_line": 228,
      "end_line": 232,
      "comment": "\n     * Create a fraction given the double value and maximum error allowed.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the double value to convert to a fraction.\n     * @param epsilon\n     *            maximum error allowed. The resulting fraction is within\n     *            \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxIterations\n     *            maximum number of convergents.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     * @see #BigFraction(double)\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double, double, int, int)",
      "begin_line": 268,
      "end_line": 332,
      "comment": "\n     * Create a fraction given the double value and either the maximum error\n     * allowed or the maximum number of denominator digits.\n     * \u003cp\u003e\n     *\n     * NOTE: This constructor is called with EITHER - a valid epsilon value and\n     * the maxDenominator set to Integer.MAX_VALUE (that way the maxDenominator\n     * has no effect). OR - a valid maxDenominator value and the epsilon value\n     * set to zero (that way epsilon only has effect if there is an exact match\n     * before the maxDenominator value is reached).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     *\n     * It has been done this way so that the same code can be (re)used for both\n     * scenarios. However this could be confusing to users if it were part of\n     * the public API and this constructor should therefore remain PRIVATE.\n     * \u003c/p\u003e\n     *\n     * See JIRA issue ticket MATH-181 for more details:\n     *\n     * https://issues.apache.org/jira/browse/MATH-181\n     *\n     * @param value\n     *            the double value to convert to a fraction.\n     * @param epsilon\n     *            maximum error allowed. The resulting fraction is within\n     *            \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxDenominator\n     *            maximum denominator value allowed.\n     * @param maxIterations\n     *            maximum number of convergents.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 42)",
        "(line 272,col 9)-(line 272,col 26)",
        "(line 273,col 9)-(line 273,col 44)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 280,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 20)",
        "(line 287,col 9)-(line 287,col 20)",
        "(line 288,col 9)-(line 288,col 21)",
        "(line 289,col 9)-(line 289,col 20)",
        "(line 291,col 9)-(line 291,col 20)",
        "(line 292,col 9)-(line 292,col 20)",
        "(line 294,col 9)-(line 294,col 18)",
        "(line 295,col 9)-(line 295,col 29)",
        "(line 296,col 9)-(line 319,col 24)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 331,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double, int)",
      "begin_line": 351,
      "end_line": 354,
      "comment": "\n     * Create a fraction given the double value and maximum denominator.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the double value to convert to a fraction.\n     * @param maxDenominator\n     *            The maximum allowed value for denominator.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(int)",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed \u003ctt\u003eint\u003c/tt\u003e, ie\n     * \"num / 1\".\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(int, int)",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} given the numerator and denominator as simple\n     * \u003ctt\u003eint\u003c/tt\u003e. The {@link BigFraction} is reduced to lowest terms.\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     * @param den\n     *            the denominator.\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(long)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed long, ie \"num / 1\".\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(long, long)",
      "begin_line": 407,
      "end_line": 409,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} given the numerator and denominator as simple\n     * \u003ctt\u003elong\u003c/tt\u003e. The {@link BigFraction} is reduced to lowest terms.\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     * @param den\n     *            the denominator.\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getReducedFraction(int, int)",
      "begin_line": 430,
      "end_line": 437,
      "comment": "\n     * \u003cp\u003e\n     * Creates a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the 2 parts of a fraction\n     * Y/Z.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Any negative signs are resolved to be on the numerator.\n     * \u003c/p\u003e\n     *\n     * @param numerator\n     *            the numerator, for example the three in \u0027three sevenths\u0027.\n     * @param denominator\n     *            the denominator, for example the seven in \u0027three sevenths\u0027.\n     * @return a new fraction instance, with the numerator and denominator\n     *         reduced.\n     * @throws ArithmeticException\n     *             if the denominator is \u003ccode\u003ezero\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 436,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.abs()",
      "begin_line": 446,
      "end_line": 448,
      "comment": "\n     * \u003cp\u003e\n     * Returns the absolute value of this {@link BigFraction}.\n     * \u003c/p\u003e\n     *\n     * @return the absolute value as a {@link BigFraction}.\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(java.math.BigInteger)",
      "begin_line": 462,
      "end_line": 465,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed {@link BigInteger},\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg\n     *            the {@link BigInteger} to add, must\u0027nt be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     * @throws NullArgumentException\n     *             if the {@link BigInteger} is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 35)",
        "(line 464,col 9)-(line 464,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(int)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed \u003ctt\u003einteger\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i\n     *            the \u003ctt\u003einteger\u003c/tt\u003e to add.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(long)",
      "begin_line": 491,
      "end_line": 493,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed \u003ctt\u003elong\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to add.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 506,
      "end_line": 526,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction\n     *            the {@link BigFraction} to add, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if the {@link BigFraction} is {@code null}.\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 512,col 9)",
        "(line 514,col 9)-(line 514,col 30)",
        "(line 515,col 9)-(line 515,col 30)",
        "(line 517,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.bigDecimalValue()",
      "begin_line": 540,
      "end_line": 542,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e. This calculates the\n     * fraction as the numerator divided by denominator.\n     * \u003c/p\u003e\n     *\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @throws ArithmeticException\n     *             if the exact quotient does not have a terminating decimal\n     *             expansion.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.bigDecimalValue(int)",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e following the passed\n     * rounding mode. This calculates the fraction as the numerator divided by\n     * denominator.\n     * \u003c/p\u003e\n     *\n     * @param roundingMode\n     *            rounding mode to apply. see {@link BigDecimal} constants.\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @throws IllegalArgumentException\n     *             if \u003ctt\u003eroundingMode\u003c/tt\u003e does not represent a valid rounding\n     *             mode.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.bigDecimalValue(int, int)",
      "begin_line": 578,
      "end_line": 580,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e following the passed scale\n     * and rounding mode. This calculates the fraction as the numerator divided\n     * by denominator.\n     * \u003c/p\u003e\n     *\n     * @param scale\n     *            scale of the \u003ccode\u003eBigDecimal\u003c/code\u003e quotient to be returned.\n     *            see {@link BigDecimal} for more information.\n     * @param roundingMode\n     *            rounding mode to apply. see {@link BigDecimal} constants.\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.compareTo(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 593,
      "end_line": 597,
      "comment": "\n     * \u003cp\u003e\n     * Compares this object to another based on size.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the object to compare to, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return -1 if this is less than \u003ctt\u003eobject\u003c/tt\u003e, +1 if this is greater\n     *         than \u003ctt\u003eobject\u003c/tt\u003e, 0 if they are equal.\n     * @see java.lang.Comparable#compareTo(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 64)",
        "(line 595,col 9)-(line 595,col 64)",
        "(line 596,col 9)-(line 596,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(java.math.BigInteger)",
      "begin_line": 613,
      "end_line": 618,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed \u003ccode\u003eBigInteger\u003c/code\u003e,\n     * ie \"this * 1 / bg\", returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg\n     *            the \u003ccode\u003eBigInteger\u003c/code\u003e to divide by, must not be\n     *            \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if the {@code BigInteger} is {@code null}.\n     * @throws ZeroException\n     *             if the fraction to divide by is zero.\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(int)",
      "begin_line": 632,
      "end_line": 634,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed \u003ctt\u003eint\u003c/tt\u003e, ie\n     * \"this * 1 / i\", returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i\n     *            the \u003ctt\u003eint\u003c/tt\u003e to divide by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws ArithmeticException\n     *             if the fraction to divide by is zero.\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(long)",
      "begin_line": 648,
      "end_line": 650,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed \u003ctt\u003elong\u003c/tt\u003e, ie\n     * \"this * 1 / l\", returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to divide by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws ArithmeticException\n     *             if the fraction to divide by is zero.\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 663,
      "end_line": 672,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction Fraction to divide by, must not be {@code null}.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if the {@code fraction} is {@code null}.\n     * @throws ZeroException if the fraction to divide by is zero.\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 669,col 9)",
        "(line 671,col 9)-(line 671,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.doubleValue()",
      "begin_line": 683,
      "end_line": 686,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * \u003c/p\u003e\n     *\n     * @return the fraction as a \u003ctt\u003edouble\u003c/tt\u003e\n     * @see java.lang.Number#doubleValue()\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.equals(java.lang.Object)",
      "begin_line": 703,
      "end_line": 716,
      "comment": "\n     * \u003cp\u003e\n     * Test for the equality of two fractions. If the lowest term numerator and\n     * denominators are the same for both fractions, the two fractions are\n     * considered to be equal.\n     * \u003c/p\u003e\n     *\n     * @param other\n     *            fraction to test for equality to this fraction, can be\n     *            \u003ccode\u003enull\u003c/code\u003e.\n     * @return true if two fractions are equal, false if object is\n     *         \u003ccode\u003enull\u003c/code\u003e, not an instance of {@link BigFraction}, or not\n     *         equal to this fraction instance.\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 28)",
        "(line 707,col 9)-(line 713,col 9)",
        "(line 715,col 9)-(line 715,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.floatValue()",
      "begin_line": 727,
      "end_line": 730,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003efloat\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * \u003c/p\u003e\n     *\n     * @return the fraction as a \u003ctt\u003efloat\u003c/tt\u003e.\n     * @see java.lang.Number#floatValue()\n     ",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getDenominator()",
      "begin_line": 739,
      "end_line": 741,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the denominator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getDenominatorAsInt()",
      "begin_line": 750,
      "end_line": 752,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ctt\u003eint\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the denominator as a \u003ctt\u003eint\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getDenominatorAsLong()",
      "begin_line": 761,
      "end_line": 763,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ctt\u003elong\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the denominator as a \u003ctt\u003elong\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getNumerator()",
      "begin_line": 772,
      "end_line": 774,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the numerator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getNumeratorAsInt()",
      "begin_line": 783,
      "end_line": 785,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ctt\u003eint\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the numerator as a \u003ctt\u003eint\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getNumeratorAsLong()",
      "begin_line": 794,
      "end_line": 796,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ctt\u003elong\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the numerator as a \u003ctt\u003elong\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.hashCode()",
      "begin_line": 806,
      "end_line": 809,
      "comment": "\n     * \u003cp\u003e\n     * Gets a hashCode for the fraction.\n     * \u003c/p\u003e\n     *\n     * @return a hash code value for this object.\n     * @see java.lang.Object#hashCode()\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 808,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.intValue()",
      "begin_line": 820,
      "end_line": 823,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as an \u003ctt\u003eint\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * \u003c/p\u003e\n     *\n     * @return the whole number fraction part.\n     * @see java.lang.Number#intValue()\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.longValue()",
      "begin_line": 834,
      "end_line": 837,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003elong\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * \u003c/p\u003e\n     *\n     * @return the whole number fraction part.\n     * @see java.lang.Number#longValue()\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(java.math.BigInteger)",
      "begin_line": 849,
      "end_line": 854,
      "comment": "\n     * \u003cp\u003e\n     * Multiplies the value of this fraction by the passed\n     * \u003ccode\u003eBigInteger\u003c/code\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg the {@code BigInteger} to multiply by.\n     * @return a {@code BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if {@code bg} is {@code null}.\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(int)",
      "begin_line": 866,
      "end_line": 868,
      "comment": "\n     * \u003cp\u003e\n     * Multiply the value of this fraction by the passed \u003ctt\u003eint\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i\n     *            the \u003ctt\u003eint\u003c/tt\u003e to multiply by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(long)",
      "begin_line": 880,
      "end_line": 882,
      "comment": "\n     * \u003cp\u003e\n     * Multiply the value of this fraction by the passed \u003ctt\u003elong\u003c/tt\u003e,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to multiply by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 894,
      "end_line": 904,
      "comment": "\n     * \u003cp\u003e\n     * Multiplies the value of this fraction by another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction Fraction to multiply by, must not be {@code null}.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if {@code fraction} is {@code null}.\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 901,col 9)",
        "(line 902,col 9)-(line 903,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.negate()",
      "begin_line": 914,
      "end_line": 916,
      "comment": "\n     * \u003cp\u003e\n     * Return the additive inverse of this fraction, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @return the negation of this fraction.\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.percentageValue()",
      "begin_line": 926,
      "end_line": 928,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the\n     * fraction as the numerator divided by denominator multiplied by 100.\n     * \u003c/p\u003e\n     *\n     * @return the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(int)",
      "begin_line": 941,
      "end_line": 946,
      "comment": "\n     * \u003cp\u003e\n     * Returns a {@code BigFraction} whose value is\n     * {@code (this\u003csup\u003eexponent\u003c/sup\u003e)}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this {@code BigFraction} is to be\n     *            raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 945,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(long)",
      "begin_line": 958,
      "end_line": 965,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003eBigFraction\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e as a \u003ccode\u003eBigFraction\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 962,col 9)",
        "(line 963,col 9)-(line 964,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(java.math.BigInteger)",
      "begin_line": 977,
      "end_line": 985,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003eBigFraction\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e as a \u003ccode\u003eBigFraction\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 978,col 9)-(line 982,col 9)",
        "(line 983,col 9)-(line 984,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(double)",
      "begin_line": 997,
      "end_line": 1000,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003edouble\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 998,col 9)-(line 999,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.reciprocal()",
      "begin_line": 1009,
      "end_line": 1011,
      "comment": "\n     * \u003cp\u003e\n     * Return the multiplicative inverse of this fraction.\n     * \u003c/p\u003e\n     *\n     * @return the reciprocal fraction.\n     ",
      "child_ranges": [
        "(line 1010,col 9)-(line 1010,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.reduce()",
      "begin_line": 1021,
      "end_line": 1024,
      "comment": "\n     * \u003cp\u003e\n     * Reduce this \u003ccode\u003eBigFraction\u003c/code\u003e to its lowest terms.\n     * \u003c/p\u003e\n     *\n     * @return the reduced \u003ccode\u003eBigFraction\u003c/code\u003e. It doesn\u0027t change anything if\n     *         the fraction can be reduced.\n     ",
      "child_ranges": [
        "(line 1022,col 9)-(line 1022,col 58)",
        "(line 1023,col 9)-(line 1023,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(java.math.BigInteger)",
      "begin_line": 1036,
      "end_line": 1041,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of an {@link BigInteger} from the value of this\n     * {@code BigFraction}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg the {@link BigInteger} to subtract, cannot be {@code null}.\n     * @return a {@code BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if the {@link BigInteger} is {@code null}.\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1039,col 9)",
        "(line 1040,col 9)-(line 1040,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(int)",
      "begin_line": 1052,
      "end_line": 1054,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of an {@code integer} from the value of this\n     * {@code BigFraction}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i the {@code integer} to subtract.\n     * @return a {@code BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 1053,col 9)-(line 1053,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(long)",
      "begin_line": 1065,
      "end_line": 1067,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of a {@code long} from the value of this\n     * {@code BigFraction}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l the {@code long} to subtract.\n     * @return a {@code BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 1066,col 9)-(line 1066,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 1079,
      "end_line": 1098,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of another fraction from the value of this one,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction {@link BigFraction} to subtract, must not be {@code null}.\n     * @return a {@link BigFraction} instance with the resulting values\n     * @throws NullArgumentException if the {@code fraction} is {@code null}.\n     ",
      "child_ranges": [
        "(line 1080,col 9)-(line 1082,col 9)",
        "(line 1083,col 9)-(line 1085,col 9)",
        "(line 1087,col 9)-(line 1087,col 30)",
        "(line 1088,col 9)-(line 1088,col 30)",
        "(line 1089,col 9)-(line 1095,col 9)",
        "(line 1096,col 9)-(line 1096,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.toString()",
      "begin_line": 1109,
      "end_line": 1120,
      "comment": "\n     * \u003cp\u003e\n     * Returns the \u003ccode\u003eString\u003c/code\u003e representing this fraction, ie\n     * \"num / dem\" or just \"num\" if the denominator is one.\n     * \u003c/p\u003e\n     *\n     * @return a string representation of the fraction.\n     * @see java.lang.Object#toString()\n     ",
      "child_ranges": [
        "(line 1111,col 9)-(line 1111,col 26)",
        "(line 1112,col 9)-(line 1118,col 9)",
        "(line 1119,col 9)-(line 1119,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getField()",
      "begin_line": 1123,
      "end_line": 1125,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1124,col 46)"
      ]
    }
  ]
}