{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/math/Fraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Fraction",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable"
      ],
      "begin_line": 36,
      "end_line": 940,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eFraction\u003c/code\u003e is a \u003ccode\u003eNumber\u003c/code\u003e implementation that\n * stores fractions accurately.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is immutable, and interoperable with most methods that accept\n * a \u003ccode\u003eNumber\u003c/code\u003e.\u003c/p\u003e\n *\n * @author Travis Reeder\n * @author Stephen Colebourne\n * @author Tim O\u0027Brien\n * @author Pete Gieser\n * @author C. Scott Ananian\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Required for serialization support. Lang version 2.0.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HALF"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1/2.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_THIRD"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1/3.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_THIRDS"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 2/3.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_QUARTER"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1/4.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_QUARTERS"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 2/4.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_QUARTERS"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 3/4.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_FIFTH"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1/5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_FIFTHS"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 2/5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_FIFTHS"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 3/5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_FIFTHS"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 4/5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "numerator"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * The numerator number part of the fraction (the three in three sevenths).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "denominator"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * The denominator number part of the fraction (the seven in three sevenths).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Cached output hashCode (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toString"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * Cached output toString (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toProperString"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Cached output toProperString (class is immutable).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.Fraction.Fraction(int, int)",
      "begin_line": 124,
      "end_line": 128,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 16)",
        "(line 126,col 9)-(line 126,col 35)",
        "(line 127,col 9)-(line 127,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getFraction(int, int)",
      "begin_line": 141,
      "end_line": 154,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eAny negative signs are resolved to be on the numerator.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     * @return a new fraction instance\n     * @throws ArithmeticException if the denomiator is \u003ccode\u003ezero\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getFraction(int, int, int)",
      "begin_line": 172,
      "end_line": 193,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance with the 3 parts\n     * of a fraction X Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe negative sign must be passed in on the whole number part.\u003c/p\u003e\n     *\n     * @param whole  the whole number, for example the one in \u0027one and three sevenths\u0027\n     * @param numerator  the numerator, for example the three in \u0027one and three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027one and three sevenths\u0027\n     * @return a new fraction instance\n     * @throws ArithmeticException if the denomiator is \u003ccode\u003ezero\u003c/code\u003e\n     * @throws ArithmeticException if the denominator is negative\n     * @throws ArithmeticException if the numerator is negative\n     * @throws ArithmeticException if the resulting numerator exceeds \n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 28)",
        "(line 183,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getReducedFraction(int, int)",
      "begin_line": 209,
      "end_line": 233,
      "comment": "\n     * \u003cp\u003eCreates a reduced \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if the input parameters represent 2/4, then the created\n     * fraction will be 1/2.\u003c/p\u003e\n     *\n     * \u003cp\u003eAny negative signs are resolved to be on the numerator.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     * @return a new fraction instance, with the numerator and denominator reduced\n     * @throws ArithmeticException if the denominator is \u003ccode\u003ezero\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 229,col 64)",
        "(line 230,col 9)-(line 230,col 25)",
        "(line 231,col 9)-(line 231,col 27)",
        "(line 232,col 9)-(line 232,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getFraction(double)",
      "begin_line": 249,
      "end_line": 299,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance from a \u003ccode\u003edouble\u003c/code\u003e value.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method uses the \u003ca href\u003d\"http://archives.math.utk.edu/articles/atuyl/confrac/\"\u003e\n     *  continued fraction algorithm\u003c/a\u003e, computing a maximum of\n     *  25 convergents and bounding the denominator by 10,000.\u003c/p\u003e\n     *\n     * @param value  the double value to convert\n     * @return a new fraction instance that is close to the value\n     * @throws ArithmeticException if \u003ccode\u003e|value| \u003e Integer.MAX_VALUE\u003c/code\u003e \n     *  or \u003ccode\u003evalue \u003d NaN\u003c/code\u003e\n     * @throws ArithmeticException if the calculated denominator is \u003ccode\u003ezero\u003c/code\u003e\n     * @throws ArithmeticException if the the algorithm does not converge\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 40)",
        "(line 251,col 9)-(line 251,col 32)",
        "(line 252,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 38)",
        "(line 257,col 9)-(line 257,col 29)",
        "(line 259,col 9)-(line 259,col 23)",
        "(line 260,col 9)-(line 260,col 23)",
        "(line 261,col 9)-(line 261,col 23)",
        "(line 262,col 9)-(line 262,col 23)",
        "(line 263,col 9)-(line 263,col 23)",
        "(line 264,col 9)-(line 264,col 23)",
        "(line 265,col 9)-(line 265,col 29)",
        "(line 266,col 9)-(line 266,col 19)",
        "(line 267,col 9)-(line 267,col 22)",
        "(line 268,col 9)-(line 268,col 22)",
        "(line 269,col 9)-(line 269,col 31)",
        "(line 270,col 9)-(line 270,col 22)",
        "(line 271,col 9)-(line 271,col 49)",
        "(line 272,col 9)-(line 272,col 24)",
        "(line 273,col 9)-(line 273,col 18)",
        "(line 275,col 9)-(line 294,col 85)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getFraction(java.lang.String)",
      "begin_line": 319,
      "end_line": 354,
      "comment": "\n     * \u003cp\u003eCreates a Fraction from a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe formats accepted are:\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003e\u003ccode\u003edouble\u003c/code\u003e String containing a dot\u003c/li\u003e\n     *  \u003cli\u003e\u0027X Y/Z\u0027\u003c/li\u003e\n     *  \u003cli\u003e\u0027Y/Z\u0027\u003c/li\u003e\n     *  \u003cli\u003e\u0027X\u0027 (a simple whole number)\u003c/li\u003e\n     * \u003c/ol\u003e\n     * and a .\u003c/p\u003e\n     *\n     * @param str  the string to parse, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return the new \u003ccode\u003eFraction\u003c/code\u003e instance\n     * @throws IllegalArgumentException if the string is \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberFormatException if the number format is invalid\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 324,col 35)",
        "(line 325,col 9)-(line 327,col 9)",
        "(line 330,col 9)-(line 330,col 31)",
        "(line 331,col 9)-(line 342,col 9)",
        "(line 345,col 9)-(line 345,col 31)",
        "(line 346,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getNumerator()",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\n     * \u003cp\u003eGets the numerator part of the fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method may return a value greater than the denominator, an\n     * improper fraction, such as the seven in 7/4.\u003c/p\u003e\n     *\n     * @return the numerator fraction part\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getDenominator()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * \u003cp\u003eGets the denominator part of the fraction.\u003c/p\u003e\n     *\n     * @return the denominator fraction part\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getProperNumerator()",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\n     * \u003cp\u003eGets the proper numerator, always positive.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn improper fraction 7/4 can be resolved into a proper one, 1 3/4.\n     * This method returns the 3 from the proper fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the fraction is negative such as -7/4, it can be resolved into\n     * -1 3/4, so this method returns the positive proper numerator, 3.\u003c/p\u003e\n     *\n     * @return the numerator fraction part of a proper fraction, always positive\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getProperWhole()",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\n     * \u003cp\u003eGets the proper whole part of the fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn improper fraction 7/4 can be resolved into a proper one, 1 3/4.\n     * This method returns the 1 from the proper fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the fraction is negative such as -7/4, it can be resolved into\n     * -1 3/4, so this method returns the positive whole part -1.\u003c/p\u003e\n     *\n     * @return the whole fraction part of a proper fraction, that includes the sign\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.intValue()",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\n     * \u003cp\u003eGets the fraction as an \u003ccode\u003eint\u003c/code\u003e. This returns the whole number\n     * part of the fraction.\u003c/p\u003e\n     *\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.longValue()",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003elong\u003c/code\u003e. This returns the whole number\n     * part of the fraction.\u003c/p\u003e\n     *\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.floatValue()",
      "begin_line": 439,
      "end_line": 441,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003efloat\u003c/code\u003e. This calculates the fraction\n     * as the numerator divided by denominator.\u003c/p\u003e\n     *\n     * @return the fraction as a \u003ccode\u003efloat\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.doubleValue()",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003edouble\u003c/code\u003e. This calculates the fraction\n     * as the numerator divided by denominator.\u003c/p\u003e\n     *\n     * @return the fraction as a \u003ccode\u003edouble\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.reduce()",
      "begin_line": 465,
      "end_line": 471,
      "comment": "\n     * \u003cp\u003eReduce the fraction to the smallest values for the numerator and\n     * denominator, returning the result.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor example, if this fraction represents 2/4, then the result\n     * will be 1/2.\u003c/p\u003e\n     *\n     * @return a new reduced fraction instance, or this if no simplification possible\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 74)",
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.invert()",
      "begin_line": 482,
      "end_line": 494,
      "comment": "\n     * \u003cp\u003eGets a fraction that is the inverse (1/fraction) of this one.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe returned fraction is not reduced.\u003c/p\u003e\n     *\n     * @return a new fraction instance with the numerator and denominator\n     *         inverted.\n     * @throws ArithmeticException if the fraction represents zero.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 493,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.negate()",
      "begin_line": 503,
      "end_line": 509,
      "comment": "\n     * \u003cp\u003eGets a fraction that is the negative (-fraction) of this one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned fraction is not reduced.\u003c/p\u003e\n     *\n     * @return a new fraction instance with the opposite signed numerator\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 508,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.abs()",
      "begin_line": 520,
      "end_line": 525,
      "comment": "\n     * \u003cp\u003eGets a fraction that is the positive equivalent of this one.\u003c/p\u003e\n     * \u003cp\u003eMore precisely: \u003ccode\u003e(fraction \u003e\u003d 0 ? this : -fraction)\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned fraction is not reduced.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003ethis\u003c/code\u003e if it is positive, or a new positive fraction\n     *  instance with the opposite signed numerator\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.pow(int)",
      "begin_line": 539,
      "end_line": 557,
      "comment": "\n     * \u003cp\u003eGets a fraction that is raised to the passed in power.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned fraction is in reduced form.\u003c/p\u003e\n     *\n     * @param power  the power to raise the fraction to\n     * @return \u003ccode\u003ethis\u003c/code\u003e if the power is one, \u003ccode\u003eONE\u003c/code\u003e if the power\n     * is zero (even if the fraction equals ZERO) or a new fraction instance \n     * raised to the appropriate power\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 556,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.greatestCommonDivisor(int, int)",
      "begin_line": 569,
      "end_line": 608,
      "comment": "\n     * \u003cp\u003eGets the greatest common divisor of the absolute value of\n     * two numbers, using the \"binary gcd\" method which avoids\n     * division and modulo operations.  See Knuth 4.5.2 algorithm B.\n     * This algorithm is due to Josef Stein (1961).\u003c/p\u003e\n     *\n     * @param u  a non-zero number\n     * @param v  a non-zero number\n     * @return the greatest common divisor, never zero\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 26)",
        "(line 576,col 9)-(line 576,col 26)",
        "(line 578,col 9)-(line 578,col 16)",
        "(line 579,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 587,col 9)-(line 587,col 46)",
        "(line 590,col 9)-(line 606,col 23)",
        "(line 607,col 9)-(line 607,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.mulAndCheck(int, int)",
      "begin_line": 622,
      "end_line": 629,
      "comment": " \n     * Multiply two integers, checking for overflow.\n     * \n     * @param x a factor\n     * @param y a factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     *                             an int\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 37)",
        "(line 624,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 628,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.mulPosAndCheck(int, int)",
      "begin_line": 640,
      "end_line": 647,
      "comment": "\n     *  Multiply two non-negative integers, checking for overflow.\n     * \n     * @param x a non-negative factor\n     * @param y a non-negative factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     * an int\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 37)",
        "(line 643,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.addAndCheck(int, int)",
      "begin_line": 658,
      "end_line": 665,
      "comment": " \n     * Add two integers, checking for overflow.\n     * \n     * @param x an addend\n     * @param y an addend\n     * @return the sum \u003ccode\u003ex+y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     * an int\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 33)",
        "(line 660,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.subAndCheck(int, int)",
      "begin_line": 676,
      "end_line": 683,
      "comment": " \n     * Subtract two integers, checking for overflow.\n     * \n     * @param x the minuend\n     * @param y the subtrahend\n     * @return the difference \u003ccode\u003ex-y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     * an int\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 33)",
        "(line 678,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 682,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.add(org.apache.commons.lang.math.Fraction)",
      "begin_line": 695,
      "end_line": 697,
      "comment": "\n     * \u003cp\u003eAdds the value of this fraction to another, returning the result in reduced form.\n     * The algorithm follows Knuth, 4.5.1.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to add, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.subtract(org.apache.commons.lang.math.Fraction)",
      "begin_line": 709,
      "end_line": 711,
      "comment": "\n     * \u003cp\u003eSubtracts the value of another fraction from the value of this one, \n     * returning the result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.addSub(org.apache.commons.lang.math.Fraction, boolean)",
      "begin_line": 723,
      "end_line": 767,
      "comment": " \n     * Implement add and subtract using algorithm described in Knuth 4.5.1.\n     * \n     * @param fraction the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param isAdd true to add, false to subtract\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 726,col 9)",
        "(line 728,col 9)-(line 730,col 9)",
        "(line 731,col 9)-(line 733,col 9)",
        "(line 736,col 9)-(line 736,col 74)",
        "(line 737,col 9)-(line 744,col 9)",
        "(line 748,col 9)-(line 749,col 67)",
        "(line 750,col 9)-(line 751,col 58)",
        "(line 752,col 9)-(line 752,col 64)",
        "(line 755,col 9)-(line 755,col 62)",
        "(line 756,col 9)-(line 756,col 66)",
        "(line 759,col 9)-(line 759,col 56)",
        "(line 760,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 766,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.multiplyBy(org.apache.commons.lang.math.Fraction)",
      "begin_line": 779,
      "end_line": 793,
      "comment": "\n     * \u003cp\u003eMultiplies the value of this fraction by another, returning the \n     * result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to multiply by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 785,col 9)",
        "(line 788,col 9)-(line 788,col 72)",
        "(line 789,col 9)-(line 789,col 72)",
        "(line 790,col 9)-(line 792,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.divideBy(org.apache.commons.lang.math.Fraction)",
      "begin_line": 805,
      "end_line": 813,
      "comment": "\n     * \u003cp\u003eDivide the value of this fraction by another.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to divide by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the fraction to divide by is zero\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 808,col 9)",
        "(line 809,col 9)-(line 811,col 9)",
        "(line 812,col 9)-(line 812,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.equals(java.lang.Object)",
      "begin_line": 826,
      "end_line": 836,
      "comment": "\n     * \u003cp\u003eCompares this fraction to another object to test if they are equal.\u003c/p\u003e.\n     *\n     * \u003cp\u003eTo be equal, both values must be equal. Thus 2/4 is not equal to 1/2.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 832,col 9)",
        "(line 833,col 9)-(line 833,col 40)",
        "(line 834,col 9)-(line 835,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.hashCode()",
      "begin_line": 843,
      "end_line": 849,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the fraction.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 847,col 9)",
        "(line 848,col 9)-(line 848,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.compareTo(java.lang.Object)",
      "begin_line": 863,
      "end_line": 882,
      "comment": "\n     * \u003cp\u003eCompares this object to another based on size.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote: this class has a natural ordering that is inconsistent\n     * with equals, because, for example, equals treats 1/2 and 2/4 as\n     * different, whereas compareTo treats them as equal.\n     *\n     * @param object  the object to compare to\n     * @return -1 if this is less, 0 if equal, +1 if greater\n     * @throws ClassCastException if the object is not a \u003ccode\u003eFraction\u003c/code\u003e\n     * @throws NullPointerException if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 43)",
        "(line 865,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 870,col 9)",
        "(line 873,col 9)-(line 873,col 65)",
        "(line 874,col 9)-(line 874,col 66)",
        "(line 875,col 9)-(line 881,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.toString()",
      "begin_line": 891,
      "end_line": 899,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format used is \u0027\u003ci\u003enumerator\u003c/i\u003e/\u003ci\u003edenominator\u003c/i\u003e\u0027 always.\n     *\n     * @return a \u003ccode\u003eString\u003c/code\u003e form of the fraction\n     ",
      "child_ranges": [
        "(line 892,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 898,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.toProperString()",
      "begin_line": 910,
      "end_line": 939,
      "comment": "\n     * \u003cp\u003eGets the fraction as a proper \u003ccode\u003eString\u003c/code\u003e in the format X Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format used in \u0027\u003ci\u003ewholeNumber\u003c/i\u003e \u003ci\u003enumerator\u003c/i\u003e/\u003ci\u003edenominator\u003c/i\u003e\u0027.\n     * If the whole number is zero it will be ommitted. If the numerator is zero,\n     * only the whole number is returned.\u003c/p\u003e\n     *\n     * @return a \u003ccode\u003eString\u003c/code\u003e form of the fraction\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 937,col 9)",
        "(line 938,col 9)-(line 938,col 30)"
      ]
    }
  ]
}