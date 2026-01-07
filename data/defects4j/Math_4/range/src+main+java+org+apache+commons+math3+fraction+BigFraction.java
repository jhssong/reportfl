{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/fraction/BigFraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BigFraction",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "org.apache.commons.math3.FieldElement\u003corg.apache.commons.math3.fraction.BigFraction\u003e",
        "java.lang.Comparable\u003corg.apache.commons.math3.fraction.BigFraction\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 1142,
      "comment": "\n * Representation of a rational number without any overflow. This class is\n * immutable.\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "TWO"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " A fraction representing \"2 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " A fraction representing \"1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " A fraction representing \"0\". "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_ONE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " A fraction representing \"-1 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_FIFTHS"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " A fraction representing \"4/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_FIFTH"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " A fraction representing \"1/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HALF"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " A fraction representing \"1/2\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_QUARTER"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " A fraction representing \"1/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_THIRD"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " A fraction representing \"1/3\". "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_FIFTHS"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " A fraction representing \"3/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_QUARTERS"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " A fraction representing \"3/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_FIFTHS"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " A fraction representing \"2/5\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_QUARTERS"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " A fraction representing \"2/4\". "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_THIRDS"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " A fraction representing \"2/3\". "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HUNDRED"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " \u003ccode\u003eBigInteger\u003c/code\u003e representation of 100. "
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
      "type": "field",
      "varNames": [
        "denominator"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The denominator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.BigFraction.BigFraction(java.math.BigInteger)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed \u003ctt\u003eBigInteger\u003c/tt\u003e, ie\n     * \"num / 1\".\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.BigFraction.BigFraction(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 120,
      "end_line": 149,
      "comment": "\n     * Create a {@link BigFraction} given the numerator and denominator as\n     * {@code BigInteger}. The {@link BigFraction} is reduced to lowest terms.\n     *\n     * @param num the numerator, must not be {@code null}.\n     * @param den the denominator, must not be {@code null}.\n     * @throws ZeroException if the denominator is zero.\n     * @throws NullArgumentException if either of the arguments is null\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 64)",
        "(line 122,col 9)-(line 122,col 66)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.BigFraction.BigFraction(double)",
      "begin_line": 172,
      "end_line": 206,
      "comment": "\n     * Create a fraction given the double value.\n     * \u003cp\u003e\n     * This constructor behaves \u003cem\u003edifferently\u003c/em\u003e from\n     * {@link #BigFraction(double, double, int)}. It converts the double value\n     * exactly, considering its internal bits representation. This works for all\n     * values except NaN and infinities and does not requires any loop or\n     * convergence threshold.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Since this conversion is exact and since double numbers are sometimes\n     * approximated, the fraction created may seem strange in some cases. For example,\n     * calling \u003ccode\u003enew BigFraction(1.0 / 3.0)\u003c/code\u003e does \u003cem\u003enot\u003c/em\u003e create\n     * the fraction 1/3, but the fraction 6004799503160661 / 18014398509481984\n     * because the double number passed to the constructor is not exactly 1/3\n     * (this number cannot be stored exactly in IEEE754).\n     * \u003c/p\u003e\n     * @see #BigFraction(double, double, int)\n     * @param value the double value to convert to a fraction.\n     * @exception MathIllegalArgumentException if value is NaN or infinite\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 181,col 9)-(line 181,col 61)",
        "(line 182,col 9)-(line 182,col 57)",
        "(line 183,col 9)-(line 183,col 57)",
        "(line 184,col 9)-(line 184,col 57)",
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 48)",
        "(line 193,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.BigFraction.BigFraction(double, double, int)",
      "begin_line": 229,
      "end_line": 233,
      "comment": "\n     * Create a fraction given the double value and maximum error allowed.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the double value to convert to a fraction.\n     * @param epsilon\n     *            maximum error allowed. The resulting fraction is within\n     *            \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxIterations\n     *            maximum number of convergents.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     * @see #BigFraction(double)\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.BigFraction.BigFraction(double, double, int, int)",
      "begin_line": 269,
      "end_line": 333,
      "comment": "\n     * Create a fraction given the double value and either the maximum error\n     * allowed or the maximum number of denominator digits.\n     * \u003cp\u003e\n     *\n     * NOTE: This constructor is called with EITHER - a valid epsilon value and\n     * the maxDenominator set to Integer.MAX_VALUE (that way the maxDenominator\n     * has no effect). OR - a valid maxDenominator value and the epsilon value\n     * set to zero (that way epsilon only has effect if there is an exact match\n     * before the maxDenominator value is reached).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     *\n     * It has been done this way so that the same code can be (re)used for both\n     * scenarios. However this could be confusing to users if it were part of\n     * the public API and this constructor should therefore remain PRIVATE.\n     * \u003c/p\u003e\n     *\n     * See JIRA issue ticket MATH-181 for more details:\n     *\n     * https://issues.apache.org/jira/browse/MATH-181\n     *\n     * @param value\n     *            the double value to convert to a fraction.\n     * @param epsilon\n     *            maximum error allowed. The resulting fraction is within\n     *            \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxDenominator\n     *            maximum denominator value allowed.\n     * @param maxIterations\n     *            maximum number of convergents.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 42)",
        "(line 273,col 9)-(line 273,col 26)",
        "(line 274,col 9)-(line 274,col 44)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 281,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 20)",
        "(line 288,col 9)-(line 288,col 20)",
        "(line 289,col 9)-(line 289,col 21)",
        "(line 290,col 9)-(line 290,col 20)",
        "(line 292,col 9)-(line 292,col 20)",
        "(line 293,col 9)-(line 293,col 20)",
        "(line 295,col 9)-(line 295,col 18)",
        "(line 296,col 9)-(line 296,col 29)",
        "(line 297,col 9)-(line 320,col 24)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 332,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.BigFraction.BigFraction(double, int)",
      "begin_line": 352,
      "end_line": 355,
      "comment": "\n     * Create a fraction given the double value and maximum denominator.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the double value to convert to a fraction.\n     * @param maxDenominator\n     *            The maximum allowed value for denominator.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.BigFraction.BigFraction(int)",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed \u003ctt\u003eint\u003c/tt\u003e, ie\n     * \"num / 1\".\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.BigFraction.BigFraction(int, int)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} given the numerator and denominator as simple\n     * \u003ctt\u003eint\u003c/tt\u003e. The {@link BigFraction} is reduced to lowest terms.\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     * @param den\n     *            the denominator.\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.BigFraction.BigFraction(long)",
      "begin_line": 393,
      "end_line": 395,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed long, ie \"num / 1\".\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fraction.BigFraction.BigFraction(long, long)",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} given the numerator and denominator as simple\n     * \u003ctt\u003elong\u003c/tt\u003e. The {@link BigFraction} is reduced to lowest terms.\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     * @param den\n     *            the denominator.\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.getReducedFraction(int, int)",
      "begin_line": 431,
      "end_line": 438,
      "comment": "\n     * \u003cp\u003e\n     * Creates a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the 2 parts of a fraction\n     * Y/Z.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Any negative signs are resolved to be on the numerator.\n     * \u003c/p\u003e\n     *\n     * @param numerator\n     *            the numerator, for example the three in \u0027three sevenths\u0027.\n     * @param denominator\n     *            the denominator, for example the seven in \u0027three sevenths\u0027.\n     * @return a new fraction instance, with the numerator and denominator\n     *         reduced.\n     * @throws ArithmeticException\n     *             if the denominator is \u003ccode\u003ezero\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 435,col 9)",
        "(line 437,col 9)-(line 437,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.abs()",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n     * \u003cp\u003e\n     * Returns the absolute value of this {@link BigFraction}.\n     * \u003c/p\u003e\n     *\n     * @return the absolute value as a {@link BigFraction}.\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.add(java.math.BigInteger)",
      "begin_line": 463,
      "end_line": 466,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed {@link BigInteger},\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg\n     *            the {@link BigInteger} to add, must\u0027nt be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     * @throws NullArgumentException\n     *             if the {@link BigInteger} is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 35)",
        "(line 465,col 9)-(line 465,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.add(int)",
      "begin_line": 478,
      "end_line": 480,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed \u003ctt\u003einteger\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i\n     *            the \u003ctt\u003einteger\u003c/tt\u003e to add.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.add(long)",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed \u003ctt\u003elong\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to add.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.add(org.apache.commons.math3.fraction.BigFraction)",
      "begin_line": 507,
      "end_line": 527,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction\n     *            the {@link BigFraction} to add, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if the {@link BigFraction} is {@code null}.\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 513,col 9)",
        "(line 515,col 9)-(line 515,col 30)",
        "(line 516,col 9)-(line 516,col 30)",
        "(line 518,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.bigDecimalValue()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e. This calculates the\n     * fraction as the numerator divided by denominator.\n     * \u003c/p\u003e\n     *\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @throws ArithmeticException\n     *             if the exact quotient does not have a terminating decimal\n     *             expansion.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.bigDecimalValue(int)",
      "begin_line": 560,
      "end_line": 562,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e following the passed\n     * rounding mode. This calculates the fraction as the numerator divided by\n     * denominator.\n     * \u003c/p\u003e\n     *\n     * @param roundingMode\n     *            rounding mode to apply. see {@link BigDecimal} constants.\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @throws IllegalArgumentException\n     *             if \u003ctt\u003eroundingMode\u003c/tt\u003e does not represent a valid rounding\n     *             mode.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.bigDecimalValue(int, int)",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e following the passed scale\n     * and rounding mode. This calculates the fraction as the numerator divided\n     * by denominator.\n     * \u003c/p\u003e\n     *\n     * @param scale\n     *            scale of the \u003ccode\u003eBigDecimal\u003c/code\u003e quotient to be returned.\n     *            see {@link BigDecimal} for more information.\n     * @param roundingMode\n     *            rounding mode to apply. see {@link BigDecimal} constants.\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.compareTo(org.apache.commons.math3.fraction.BigFraction)",
      "begin_line": 594,
      "end_line": 598,
      "comment": "\n     * \u003cp\u003e\n     * Compares this object to another based on size.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the object to compare to, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return -1 if this is less than \u003ctt\u003eobject\u003c/tt\u003e, +1 if this is greater\n     *         than \u003ctt\u003eobject\u003c/tt\u003e, 0 if they are equal.\n     * @see java.lang.Comparable#compareTo(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 64)",
        "(line 596,col 9)-(line 596,col 64)",
        "(line 597,col 9)-(line 597,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.divide(java.math.BigInteger)",
      "begin_line": 611,
      "end_line": 619,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed {@code BigInteger},\n     * ie {@code this * 1 / bg}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg the {@code BigInteger} to divide by, must not be {@code null}\n     * @return a {@link BigFraction} instance with the resulting values\n     * @throws NullArgumentException if the {@code BigInteger} is {@code null}\n     * @throws MathArithmeticException if the fraction to divide by is zero\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 618,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.divide(int)",
      "begin_line": 631,
      "end_line": 633,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed {@code int}, ie\n     * {@code this * 1 / i}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i the {@code int} to divide by\n     * @return a {@link BigFraction} instance with the resulting values\n     * @throws MathArithmeticException if the fraction to divide by is zero\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.divide(long)",
      "begin_line": 645,
      "end_line": 647,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed {@code long}, ie\n     * {@code this * 1 / l}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l the {@code long} to divide by\n     * @return a {@link BigFraction} instance with the resulting values\n     * @throws MathArithmeticException if the fraction to divide by is zero\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.divide(org.apache.commons.math3.fraction.BigFraction)",
      "begin_line": 660,
      "end_line": 669,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction Fraction to divide by, must not be {@code null}.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if the {@code fraction} is {@code null}.\n     * @throws MathArithmeticException if the fraction to divide by is zero\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 666,col 9)",
        "(line 668,col 9)-(line 668,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.doubleValue()",
      "begin_line": 680,
      "end_line": 692,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * \u003c/p\u003e\n     *\n     * @return the fraction as a \u003ctt\u003edouble\u003c/tt\u003e\n     * @see java.lang.Number#doubleValue()\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 76)",
        "(line 683,col 9)-(line 690,col 9)",
        "(line 691,col 9)-(line 691,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.equals(java.lang.Object)",
      "begin_line": 709,
      "end_line": 722,
      "comment": "\n     * \u003cp\u003e\n     * Test for the equality of two fractions. If the lowest term numerator and\n     * denominators are the same for both fractions, the two fractions are\n     * considered to be equal.\n     * \u003c/p\u003e\n     *\n     * @param other\n     *            fraction to test for equality to this fraction, can be\n     *            \u003ccode\u003enull\u003c/code\u003e.\n     * @return true if two fractions are equal, false if object is\n     *         \u003ccode\u003enull\u003c/code\u003e, not an instance of {@link BigFraction}, or not\n     *         equal to this fraction instance.\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 28)",
        "(line 713,col 9)-(line 719,col 9)",
        "(line 721,col 9)-(line 721,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.floatValue()",
      "begin_line": 733,
      "end_line": 745,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003efloat\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * \u003c/p\u003e\n     *\n     * @return the fraction as a \u003ctt\u003efloat\u003c/tt\u003e.\n     * @see java.lang.Number#floatValue()\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 73)",
        "(line 736,col 9)-(line 743,col 9)",
        "(line 744,col 9)-(line 744,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.getDenominator()",
      "begin_line": 754,
      "end_line": 756,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the denominator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.getDenominatorAsInt()",
      "begin_line": 765,
      "end_line": 767,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ctt\u003eint\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the denominator as a \u003ctt\u003eint\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.getDenominatorAsLong()",
      "begin_line": 776,
      "end_line": 778,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ctt\u003elong\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the denominator as a \u003ctt\u003elong\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.getNumerator()",
      "begin_line": 787,
      "end_line": 789,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the numerator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 788,col 9)-(line 788,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.getNumeratorAsInt()",
      "begin_line": 798,
      "end_line": 800,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ctt\u003eint\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the numerator as a \u003ctt\u003eint\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.getNumeratorAsLong()",
      "begin_line": 809,
      "end_line": 811,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ctt\u003elong\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the numerator as a \u003ctt\u003elong\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.hashCode()",
      "begin_line": 821,
      "end_line": 824,
      "comment": "\n     * \u003cp\u003e\n     * Gets a hashCode for the fraction.\n     * \u003c/p\u003e\n     *\n     * @return a hash code value for this object.\n     * @see java.lang.Object#hashCode()\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 823,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.intValue()",
      "begin_line": 835,
      "end_line": 838,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as an \u003ctt\u003eint\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * \u003c/p\u003e\n     *\n     * @return the whole number fraction part.\n     * @see java.lang.Number#intValue()\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.longValue()",
      "begin_line": 849,
      "end_line": 852,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003elong\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * \u003c/p\u003e\n     *\n     * @return the whole number fraction part.\n     * @see java.lang.Number#longValue()\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.multiply(java.math.BigInteger)",
      "begin_line": 864,
      "end_line": 869,
      "comment": "\n     * \u003cp\u003e\n     * Multiplies the value of this fraction by the passed\n     * \u003ccode\u003eBigInteger\u003c/code\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg the {@code BigInteger} to multiply by.\n     * @return a {@code BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if {@code bg} is {@code null}.\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 868,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.multiply(int)",
      "begin_line": 881,
      "end_line": 883,
      "comment": "\n     * \u003cp\u003e\n     * Multiply the value of this fraction by the passed \u003ctt\u003eint\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i\n     *            the \u003ctt\u003eint\u003c/tt\u003e to multiply by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.multiply(long)",
      "begin_line": 895,
      "end_line": 897,
      "comment": "\n     * \u003cp\u003e\n     * Multiply the value of this fraction by the passed \u003ctt\u003elong\u003c/tt\u003e,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to multiply by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.multiply(org.apache.commons.math3.fraction.BigFraction)",
      "begin_line": 909,
      "end_line": 919,
      "comment": "\n     * \u003cp\u003e\n     * Multiplies the value of this fraction by another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction Fraction to multiply by, must not be {@code null}.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if {@code fraction} is {@code null}.\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 912,col 9)",
        "(line 913,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 918,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.negate()",
      "begin_line": 929,
      "end_line": 931,
      "comment": "\n     * \u003cp\u003e\n     * Return the additive inverse of this fraction, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @return the negation of this fraction.\n     ",
      "child_ranges": [
        "(line 930,col 9)-(line 930,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.percentageValue()",
      "begin_line": 941,
      "end_line": 943,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the\n     * fraction as the numerator divided by denominator multiplied by 100.\n     * \u003c/p\u003e\n     *\n     * @return the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 942,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.pow(int)",
      "begin_line": 956,
      "end_line": 961,
      "comment": "\n     * \u003cp\u003e\n     * Returns a {@code BigFraction} whose value is\n     * {@code (this\u003csup\u003eexponent\u003c/sup\u003e)}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this {@code BigFraction} is to be\n     *            raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 959,col 9)",
        "(line 960,col 9)-(line 960,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.pow(long)",
      "begin_line": 973,
      "end_line": 980,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003eBigFraction\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e as a \u003ccode\u003eBigFraction\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 977,col 9)",
        "(line 978,col 9)-(line 979,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.pow(java.math.BigInteger)",
      "begin_line": 992,
      "end_line": 1000,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003eBigFraction\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e as a \u003ccode\u003eBigFraction\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 993,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 999,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.pow(double)",
      "begin_line": 1012,
      "end_line": 1015,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003edouble\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1014,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.reciprocal()",
      "begin_line": 1024,
      "end_line": 1026,
      "comment": "\n     * \u003cp\u003e\n     * Return the multiplicative inverse of this fraction.\n     * \u003c/p\u003e\n     *\n     * @return the reciprocal fraction.\n     ",
      "child_ranges": [
        "(line 1025,col 9)-(line 1025,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.reduce()",
      "begin_line": 1036,
      "end_line": 1039,
      "comment": "\n     * \u003cp\u003e\n     * Reduce this \u003ccode\u003eBigFraction\u003c/code\u003e to its lowest terms.\n     * \u003c/p\u003e\n     *\n     * @return the reduced \u003ccode\u003eBigFraction\u003c/code\u003e. It doesn\u0027t change anything if\n     *         the fraction can be reduced.\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1037,col 58)",
        "(line 1038,col 9)-(line 1038,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.subtract(java.math.BigInteger)",
      "begin_line": 1051,
      "end_line": 1056,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of an {@link BigInteger} from the value of this\n     * {@code BigFraction}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg the {@link BigInteger} to subtract, cannot be {@code null}.\n     * @return a {@code BigFraction} instance with the resulting values.\n     * @throws NullArgumentException if the {@link BigInteger} is {@code null}.\n     ",
      "child_ranges": [
        "(line 1052,col 9)-(line 1054,col 9)",
        "(line 1055,col 9)-(line 1055,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.subtract(int)",
      "begin_line": 1067,
      "end_line": 1069,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of an {@code integer} from the value of this\n     * {@code BigFraction}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i the {@code integer} to subtract.\n     * @return a {@code BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1068,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.subtract(long)",
      "begin_line": 1080,
      "end_line": 1082,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of a {@code long} from the value of this\n     * {@code BigFraction}, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l the {@code long} to subtract.\n     * @return a {@code BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 1081,col 9)-(line 1081,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.subtract(org.apache.commons.math3.fraction.BigFraction)",
      "begin_line": 1094,
      "end_line": 1113,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of another fraction from the value of this one,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction {@link BigFraction} to subtract, must not be {@code null}.\n     * @return a {@link BigFraction} instance with the resulting values\n     * @throws NullArgumentException if the {@code fraction} is {@code null}.\n     ",
      "child_ranges": [
        "(line 1095,col 9)-(line 1097,col 9)",
        "(line 1098,col 9)-(line 1100,col 9)",
        "(line 1102,col 9)-(line 1102,col 30)",
        "(line 1103,col 9)-(line 1103,col 30)",
        "(line 1104,col 9)-(line 1110,col 9)",
        "(line 1111,col 9)-(line 1111,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.toString()",
      "begin_line": 1124,
      "end_line": 1135,
      "comment": "\n     * \u003cp\u003e\n     * Returns the \u003ccode\u003eString\u003c/code\u003e representing this fraction, ie\n     * \"num / dem\" or just \"num\" if the denominator is one.\n     * \u003c/p\u003e\n     *\n     * @return a string representation of the fraction.\n     * @see java.lang.Object#toString()\n     ",
      "child_ranges": [
        "(line 1126,col 9)-(line 1126,col 26)",
        "(line 1127,col 9)-(line 1133,col 9)",
        "(line 1134,col 9)-(line 1134,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fraction.BigFraction.getField()",
      "begin_line": 1138,
      "end_line": 1140,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1139,col 9)-(line 1139,col 46)"
      ]
    }
  ]
}