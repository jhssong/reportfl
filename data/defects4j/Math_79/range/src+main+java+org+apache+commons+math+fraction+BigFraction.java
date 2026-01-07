{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/fraction/BigFraction.java",
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
      "begin_line": 34,
      "end_line": 1132,
      "comment": "\n * Representation of a rational number without any overflow. This class is\n * immutable.\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "TWO"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " A fraction representing \"2 / 1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " A fraction representing \"1\". "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " A fraction representing \"0\". "
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_ONE"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " A fraction representing \"-1 / 1\". "
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
        "serialVersionUID"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HUNDRED_DOUBLE"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " \u003ccode\u003eBigInteger\u003c/code\u003e representation of 100. "
    },
    {
      "type": "field",
      "varNames": [
        "numerator"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The numerator. "
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
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(java.math.BigInteger)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed \u003ctt\u003eBigInteger\u003c/tt\u003e, ie\n     * \"num / 1\".\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 120,
      "end_line": 153,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} given the numerator and denominator as\n     * \u003ccode\u003eBigInteger\u003c/code\u003e. The {@link BigFraction} is reduced to lowest terms.\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @param den\n     *            the denominator, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @throws ArithmeticException\n     *             if the denominator is \u003ccode\u003ezero\u003c/code\u003e.\n     * @throws NullPointerException\n     *             if the numerator or the denominator is \u003ccode\u003ezero\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double)",
      "begin_line": 176,
      "end_line": 210,
      "comment": "\n     * Create a fraction given the double value.\n     * \u003cp\u003e\n     * This constructor behaves \u003cem\u003edifferently\u003c/em\u003e from\n     * {@link #BigFraction(double, double, int)}. It converts the\n     * double value exactly, considering its internal bits representation.\n     * This does work for all values except NaN and infinities and does\n     * not requires any loop or convergence threshold.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Since this conversion is exact and since double numbers are sometimes\n     * approximated, the fraction created may seem strange in some cases. For example\n     * calling \u003ccode\u003enew BigFraction(1.0 / 3.0)\u003c/code\u003e does \u003cem\u003enot\u003c/em\u003e create\n     * the fraction 1/3 but the fraction 6004799503160661 / 18014398509481984\n     * because the double number passed to the constructor is not exactly 1/3\n     * (this number cannot be stored exactly in IEEE754).\n     * \u003c/p\u003e\n     * @see #BigFraction(double, double, int)\n     * @param value the double value to convert to a fraction.\n     * @exception IllegalArgumentException if value is NaN or infinite\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 185,col 9)-(line 185,col 61)",
        "(line 186,col 9)-(line 186,col 57)",
        "(line 187,col 9)-(line 187,col 57)",
        "(line 188,col 9)-(line 188,col 57)",
        "(line 189,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 48)",
        "(line 197,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 208,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double, double, int)",
      "begin_line": 233,
      "end_line": 237,
      "comment": "\n     * Create a fraction given the double value and maximum error allowed.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the double value to convert to a fraction.\n     * @param epsilon\n     *            maximum error allowed. The resulting fraction is within\n     *            \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxIterations\n     *            maximum number of convergents.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     * @see #BigFraction(double)\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double, double, int, int)",
      "begin_line": 273,
      "end_line": 337,
      "comment": "\n     * Create a fraction given the double value and either the maximum error\n     * allowed or the maximum number of denominator digits.\n     * \u003cp\u003e\n     *\n     * NOTE: This constructor is called with EITHER - a valid epsilon value and\n     * the maxDenominator set to Integer.MAX_VALUE (that way the maxDenominator\n     * has no effect). OR - a valid maxDenominator value and the epsilon value\n     * set to zero (that way epsilon only has effect if there is an exact match\n     * before the maxDenominator value is reached).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     *\n     * It has been done this way so that the same code can be (re)used for both\n     * scenarios. However this could be confusing to users if it were part of\n     * the public API and this constructor should therefore remain PRIVATE.\n     * \u003c/p\u003e\n     *\n     * See JIRA issue ticket MATH-181 for more details:\n     *\n     * https://issues.apache.org/jira/browse/MATH-181\n     *\n     * @param value\n     *            the double value to convert to a fraction.\n     * @param epsilon\n     *            maximum error allowed. The resulting fraction is within\n     *            \u003ccode\u003eepsilon\u003c/code\u003e of \u003ccode\u003evalue\u003c/code\u003e, in absolute terms.\n     * @param maxDenominator\n     *            maximum denominator value allowed.\n     * @param maxIterations\n     *            maximum number of convergents.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 42)",
        "(line 277,col 9)-(line 277,col 26)",
        "(line 278,col 9)-(line 278,col 40)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 285,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 291,col 20)",
        "(line 292,col 9)-(line 292,col 20)",
        "(line 293,col 9)-(line 293,col 21)",
        "(line 294,col 9)-(line 294,col 20)",
        "(line 296,col 9)-(line 296,col 20)",
        "(line 297,col 9)-(line 297,col 20)",
        "(line 299,col 9)-(line 299,col 18)",
        "(line 300,col 9)-(line 300,col 29)",
        "(line 301,col 9)-(line 324,col 24)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 330,col 9)-(line 336,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(double, int)",
      "begin_line": 356,
      "end_line": 359,
      "comment": "\n     * Create a fraction given the double value and maximum denominator.\n     * \u003cp\u003e\n     * References:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003ca href\u003d\"http://mathworld.wolfram.com/ContinuedFraction.html\"\u003e\n     * Continued Fraction\u003c/a\u003e equations (11) and (22)-(26)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003c/p\u003e\n     *\n     * @param value\n     *            the double value to convert to a fraction.\n     * @param maxDenominator\n     *            The maximum allowed value for denominator.\n     * @throws FractionConversionException\n     *             if the continued fraction failed to converge.\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(int)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed \u003ctt\u003eint\u003c/tt\u003e, ie\n     * \"num / 1\".\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(int, int)",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} given the numerator and denominator as simple\n     * \u003ctt\u003eint\u003c/tt\u003e. The {@link BigFraction} is reduced to lowest terms.\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     * @param den\n     *            the denominator.\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(long)",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} equivalent to the passed long, ie \"num / 1\".\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.fraction.BigFraction.BigFraction(long, long)",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * \u003cp\u003e\n     * Create a {@link BigFraction} given the numerator and denominator as simple\n     * \u003ctt\u003elong\u003c/tt\u003e. The {@link BigFraction} is reduced to lowest terms.\n     * \u003c/p\u003e\n     *\n     * @param num\n     *            the numerator.\n     * @param den\n     *            the denominator.\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getReducedFraction(int, int)",
      "begin_line": 435,
      "end_line": 442,
      "comment": "\n     * \u003cp\u003e\n     * Creates a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the 2 parts of a fraction\n     * Y/Z.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * Any negative signs are resolved to be on the numerator.\n     * \u003c/p\u003e\n     *\n     * @param numerator\n     *            the numerator, for example the three in \u0027three sevenths\u0027.\n     * @param denominator\n     *            the denominator, for example the seven in \u0027three sevenths\u0027.\n     * @return a new fraction instance, with the numerator and denominator\n     *         reduced.\n     * @throws ArithmeticException\n     *             if the denominator is \u003ccode\u003ezero\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 439,col 9)",
        "(line 441,col 9)-(line 441,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.abs()",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n     * \u003cp\u003e\n     * Returns the absolute value of this {@link BigFraction}.\n     * \u003c/p\u003e\n     *\n     * @return the absolute value as a {@link BigFraction}.\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(java.math.BigInteger)",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed {@link BigInteger},\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg\n     *            the {@link BigInteger} to add, must\u0027nt be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     * @throws NullPointerException\n     *             if the {@link BigInteger} is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(int)",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed \u003ctt\u003einteger\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i\n     *            the \u003ctt\u003einteger\u003c/tt\u003e to add.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(long)",
      "begin_line": 495,
      "end_line": 497,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to the passed \u003ctt\u003elong\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to add.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.add(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 511,
      "end_line": 528,
      "comment": "\n     * \u003cp\u003e\n     * Adds the value of this fraction to another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction\n     *            the {@link BigFraction} to add, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullPointerException\n     *             if the {@link BigFraction} is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 514,col 9)",
        "(line 516,col 9)-(line 516,col 30)",
        "(line 517,col 9)-(line 517,col 30)",
        "(line 519,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.bigDecimalValue()",
      "begin_line": 542,
      "end_line": 544,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e. This calculates the\n     * fraction as the numerator divided by denominator.\n     * \u003c/p\u003e\n     *\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @throws ArithmeticException\n     *             if the exact quotient does not have a terminating decimal\n     *             expansion.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.bigDecimalValue(int)",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e following the passed\n     * rounding mode. This calculates the fraction as the numerator divided by\n     * denominator.\n     * \u003c/p\u003e\n     *\n     * @param roundingMode\n     *            rounding mode to apply. see {@link BigDecimal} constants.\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @throws IllegalArgumentException\n     *             if \u003ctt\u003eroundingMode\u003c/tt\u003e does not represent a valid rounding\n     *             mode.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.bigDecimalValue(int, int)",
      "begin_line": 580,
      "end_line": 582,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e following the passed scale\n     * and rounding mode. This calculates the fraction as the numerator divided\n     * by denominator.\n     * \u003c/p\u003e\n     *\n     * @param scale\n     *            scale of the \u003ccode\u003eBigDecimal\u003c/code\u003e quotient to be returned.\n     *            see {@link BigDecimal} for more information.\n     * @param roundingMode\n     *            rounding mode to apply. see {@link BigDecimal} constants.\n     * @return the fraction as a \u003ccode\u003eBigDecimal\u003c/code\u003e.\n     * @see BigDecimal\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.compareTo(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 595,
      "end_line": 599,
      "comment": "\n     * \u003cp\u003e\n     * Compares this object to another based on size.\n     * \u003c/p\u003e\n     *\n     * @param object\n     *            the object to compare to, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return -1 if this is less than \u003ctt\u003eobject\u003c/tt\u003e, +1 if this is greater\n     *         than \u003ctt\u003eobject\u003c/tt\u003e, 0 if they are equal.\n     * @see java.lang.Comparable#compareTo(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 64)",
        "(line 597,col 9)-(line 597,col 64)",
        "(line 598,col 9)-(line 598,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(java.math.BigInteger)",
      "begin_line": 616,
      "end_line": 621,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed \u003ccode\u003eBigInteger\u003c/code\u003e,\n     * ie \"this * 1 / bg\", returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg\n     *            the \u003ccode\u003eBigInteger\u003c/code\u003e to divide by, must not be\n     *            \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullPointerException\n     *             if the \u003ccode\u003eBigInteger\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * @throws ArithmeticException\n     *             if the fraction to divide by is zero.\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 620,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(int)",
      "begin_line": 635,
      "end_line": 637,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed \u003ctt\u003eint\u003c/tt\u003e, ie\n     * \"this * 1 / i\", returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i\n     *            the \u003ctt\u003eint\u003c/tt\u003e to divide by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws ArithmeticException\n     *             if the fraction to divide by is zero.\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(long)",
      "begin_line": 651,
      "end_line": 653,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by the passed \u003ctt\u003elong\u003c/tt\u003e, ie\n     * \"this * 1 / l\", returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to divide by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws ArithmeticException\n     *             if the fraction to divide by is zero.\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.divide(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 669,
      "end_line": 675,
      "comment": "\n     * \u003cp\u003e\n     * Divide the value of this fraction by another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction\n     *            the fraction to divide by, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullPointerException\n     *             if the fraction is \u003ccode\u003enull\u003c/code\u003e.\n     * @throws ArithmeticException\n     *             if the fraction to divide by is zero.\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 672,col 9)",
        "(line 674,col 9)-(line 674,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.doubleValue()",
      "begin_line": 686,
      "end_line": 689,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * \u003c/p\u003e\n     *\n     * @return the fraction as a \u003ctt\u003edouble\u003c/tt\u003e\n     * @see java.lang.Number#doubleValue()\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.equals(java.lang.Object)",
      "begin_line": 706,
      "end_line": 719,
      "comment": "\n     * \u003cp\u003e\n     * Test for the equality of two fractions. If the lowest term numerator and\n     * denominators are the same for both fractions, the two fractions are\n     * considered to be equal.\n     * \u003c/p\u003e\n     *\n     * @param other\n     *            fraction to test for equality to this fraction, can be\n     *            \u003ccode\u003enull\u003c/code\u003e.\n     * @return true if two fractions are equal, false if object is\n     *         \u003ccode\u003enull\u003c/code\u003e, not an instance of {@link BigFraction}, or not\n     *         equal to this fraction instance.\n     * @see java.lang.Object#equals(java.lang.Object)\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 28)",
        "(line 710,col 9)-(line 716,col 9)",
        "(line 718,col 9)-(line 718,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.floatValue()",
      "begin_line": 730,
      "end_line": 733,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003efloat\u003c/tt\u003e. This calculates the fraction as\n     * the numerator divided by denominator.\n     * \u003c/p\u003e\n     *\n     * @return the fraction as a \u003ctt\u003efloat\u003c/tt\u003e.\n     * @see java.lang.Number#floatValue()\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getDenominator()",
      "begin_line": 742,
      "end_line": 744,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the denominator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getDenominatorAsInt()",
      "begin_line": 753,
      "end_line": 755,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ctt\u003eint\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the denominator as a \u003ctt\u003eint\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getDenominatorAsLong()",
      "begin_line": 764,
      "end_line": 766,
      "comment": "\n     * \u003cp\u003e\n     * Access the denominator as a \u003ctt\u003elong\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the denominator as a \u003ctt\u003elong\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getNumerator()",
      "begin_line": 775,
      "end_line": 777,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the numerator as a \u003ccode\u003eBigInteger\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getNumeratorAsInt()",
      "begin_line": 786,
      "end_line": 788,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ctt\u003eint\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the numerator as a \u003ctt\u003eint\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getNumeratorAsLong()",
      "begin_line": 797,
      "end_line": 799,
      "comment": "\n     * \u003cp\u003e\n     * Access the numerator as a \u003ctt\u003elong\u003c/tt\u003e.\n     * \u003c/p\u003e\n     *\n     * @return the numerator as a \u003ctt\u003elong\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.hashCode()",
      "begin_line": 809,
      "end_line": 812,
      "comment": "\n     * \u003cp\u003e\n     * Gets a hashCode for the fraction.\n     * \u003c/p\u003e\n     *\n     * @return a hash code value for this object.\n     * @see java.lang.Object#hashCode()\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.intValue()",
      "begin_line": 823,
      "end_line": 826,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as an \u003ctt\u003eint\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * \u003c/p\u003e\n     *\n     * @return the whole number fraction part.\n     * @see java.lang.Number#intValue()\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.longValue()",
      "begin_line": 837,
      "end_line": 840,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction as a \u003ctt\u003elong\u003c/tt\u003e. This returns the whole number part\n     * of the fraction.\n     * \u003c/p\u003e\n     *\n     * @return the whole number fraction part.\n     * @see java.lang.Number#longValue()\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(java.math.BigInteger)",
      "begin_line": 854,
      "end_line": 856,
      "comment": "\n     * \u003cp\u003e\n     * Multiplies the value of this fraction by the passed\n     * \u003ccode\u003eBigInteger\u003c/code\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg\n     *            the \u003ccode\u003eBigInteger\u003c/code\u003e to multiply by.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     * @throws NullPointerException\n     *             if the bg is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(int)",
      "begin_line": 868,
      "end_line": 870,
      "comment": "\n     * \u003cp\u003e\n     * Multiply the value of this fraction by the passed \u003ctt\u003eint\u003c/tt\u003e, returning\n     * the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i\n     *            the \u003ctt\u003eint\u003c/tt\u003e to multiply by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 869,col 9)-(line 869,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(long)",
      "begin_line": 882,
      "end_line": 884,
      "comment": "\n     * \u003cp\u003e\n     * Multiply the value of this fraction by the passed \u003ctt\u003elong\u003c/tt\u003e,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to multiply by.\n     * @return a {@link BigFraction} instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.multiply(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 898,
      "end_line": 906,
      "comment": "\n     * \u003cp\u003e\n     * Multiplies the value of this fraction by another, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction\n     *            the fraction to multiply by, must not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values.\n     * @throws NullPointerException\n     *             if the fraction is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 31)",
        "(line 901,col 9)-(line 903,col 9)",
        "(line 905,col 9)-(line 905,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.negate()",
      "begin_line": 916,
      "end_line": 918,
      "comment": "\n     * \u003cp\u003e\n     * Return the additive inverse of this fraction, returning the result in\n     * reduced form.\n     * \u003c/p\u003e\n     *\n     * @return the negation of this fraction.\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.percentageValue()",
      "begin_line": 928,
      "end_line": 930,
      "comment": "\n     * \u003cp\u003e\n     * Gets the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e. This calculates the\n     * fraction as the numerator divided by denominator multiplied by 100.\n     * \u003c/p\u003e\n     *\n     * @return the fraction percentage as a \u003ctt\u003edouble\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(int)",
      "begin_line": 943,
      "end_line": 948,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ctt\u003einteger\u003c/tt\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigInteger\u003c/code\u003e is to be\n     *            raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 944,col 9)-(line 946,col 9)",
        "(line 947,col 9)-(line 947,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(long)",
      "begin_line": 960,
      "end_line": 967,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003eBigFraction\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e as a \u003ccode\u003eBigFraction\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 961,col 9)-(line 964,col 9)",
        "(line 965,col 9)-(line 966,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(java.math.BigInteger)",
      "begin_line": 979,
      "end_line": 987,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003eBigFraction\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e as a \u003ccode\u003eBigFraction\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 984,col 9)",
        "(line 985,col 9)-(line 986,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.pow(double)",
      "begin_line": 999,
      "end_line": 1002,
      "comment": "\n     * \u003cp\u003e\n     * Returns a \u003ccode\u003edouble\u003c/code\u003e whose value is\n     * \u003ctt\u003e(this\u003csup\u003eexponent\u003c/sup\u003e)\u003c/tt\u003e, returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param exponent\n     *            exponent to which this \u003ccode\u003eBigFraction\u003c/code\u003e is to be raised.\n     * @return \u003ctt\u003ethis\u003csup\u003eexponent\u003c/sup\u003e\u003c/tt\u003e.\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1001,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.reciprocal()",
      "begin_line": 1011,
      "end_line": 1013,
      "comment": "\n     * \u003cp\u003e\n     * Return the multiplicative inverse of this fraction.\n     * \u003c/p\u003e\n     *\n     * @return the reciprocal fraction.\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.reduce()",
      "begin_line": 1023,
      "end_line": 1026,
      "comment": "\n     * \u003cp\u003e\n     * Reduce this \u003ccode\u003eBigFraction\u003c/code\u003e to its lowest terms.\n     * \u003c/p\u003e\n     *\n     * @return the reduced \u003ccode\u003eBigFraction\u003c/code\u003e. It doesn\u0027t change anything if\n     *         the fraction can be reduced.\n     ",
      "child_ranges": [
        "(line 1024,col 9)-(line 1024,col 58)",
        "(line 1025,col 9)-(line 1025,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(java.math.BigInteger)",
      "begin_line": 1041,
      "end_line": 1043,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of an {@link BigInteger} from the value of this one,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param bg\n     *            the {@link BigInteger} to subtract, must\u0027nt be\n     *            \u003ccode\u003enull\u003c/code\u003e.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     * @throws NullPointerException\n     *             if the {@link BigInteger} is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1042,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(int)",
      "begin_line": 1055,
      "end_line": 1057,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of an \u003ctt\u003einteger\u003c/tt\u003e from the value of this one,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param i\n     *            the \u003ctt\u003einteger\u003c/tt\u003e to subtract.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values.\n     ",
      "child_ranges": [
        "(line 1056,col 9)-(line 1056,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(long)",
      "begin_line": 1070,
      "end_line": 1072,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of an \u003ctt\u003einteger\u003c/tt\u003e from the value of this one,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param l\n     *            the \u003ctt\u003elong\u003c/tt\u003e to subtract.\n     * @return a \u003ccode\u003eBigFraction\u003c/code\u003e instance with the resulting values, or\n     *         this object if the \u003ctt\u003elong\u003c/tt\u003e is zero.\n     ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1071,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.subtract(org.apache.commons.math.fraction.BigFraction)",
      "begin_line": 1087,
      "end_line": 1103,
      "comment": "\n     * \u003cp\u003e\n     * Subtracts the value of another fraction from the value of this one,\n     * returning the result in reduced form.\n     * \u003c/p\u003e\n     *\n     * @param fraction\n     *            the {@link BigFraction} to subtract, must not be\n     *            \u003ccode\u003enull\u003c/code\u003e.\n     * @return a {@link BigFraction} instance with the resulting values\n     * @throws NullPointerException\n     *             if the fraction is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 1088,col 9)-(line 1090,col 9)",
        "(line 1092,col 9)-(line 1092,col 30)",
        "(line 1093,col 9)-(line 1093,col 30)",
        "(line 1094,col 9)-(line 1100,col 9)",
        "(line 1101,col 9)-(line 1101,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.toString()",
      "begin_line": 1114,
      "end_line": 1125,
      "comment": "\n     * \u003cp\u003e\n     * Returns the \u003ccode\u003eString\u003c/code\u003e representing this fraction, ie\n     * \"num / dem\" or just \"num\" if the denominator is one.\n     * \u003c/p\u003e\n     *\n     * @return a string representation of the fraction.\n     * @see java.lang.Object#toString()\n     ",
      "child_ranges": [
        "(line 1116,col 9)-(line 1116,col 26)",
        "(line 1117,col 9)-(line 1123,col 9)",
        "(line 1124,col 9)-(line 1124,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.fraction.BigFraction.getField()",
      "begin_line": 1128,
      "end_line": 1130,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1129,col 9)-(line 1129,col 46)"
      ]
    }
  ]
}