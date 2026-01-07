{
  "filepath": "/tmp/Lang-33b/src/main/java/org/apache/commons/lang3/math/Fraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Fraction",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.lang3.math.Fraction\u003e"
      ],
      "begin_line": 36,
      "end_line": 952,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eFraction\u003c/code\u003e is a \u003ccode\u003eNumber\u003c/code\u003e implementation that\n * stores fractions accurately.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is immutable, and interoperable with most methods that accept\n * a \u003ccode\u003eNumber\u003c/code\u003e.\u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Travis Reeder\n * @author Tim O\u0027Brien\n * @author Pete Gieser\n * @author C. Scott Ananian\n * @since 2.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.lang3.math.Fraction.Fraction(int, int)",
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
      "signature": "org.apache.commons.lang3.math.Fraction.getFraction(int, int)",
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
      "signature": "org.apache.commons.lang3.math.Fraction.getFraction(int, int, int)",
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
      "signature": "org.apache.commons.lang3.math.Fraction.getReducedFraction(int, int)",
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
      "signature": "org.apache.commons.lang3.math.Fraction.getFraction(double)",
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
      "signature": "org.apache.commons.lang3.math.Fraction.getFraction(java.lang.String)",
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
      "signature": "org.apache.commons.lang3.math.Fraction.getNumerator()",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\n     * \u003cp\u003eGets the numerator part of the fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method may return a value greater than the denominator, an\n     * improper fraction, such as the seven in 7/4.\u003c/p\u003e\n     *\n     * @return the numerator fraction part\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.getDenominator()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * \u003cp\u003eGets the denominator part of the fraction.\u003c/p\u003e\n     *\n     * @return the denominator fraction part\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.getProperNumerator()",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\n     * \u003cp\u003eGets the proper numerator, always positive.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn improper fraction 7/4 can be resolved into a proper one, 1 3/4.\n     * This method returns the 3 from the proper fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the fraction is negative such as -7/4, it can be resolved into\n     * -1 3/4, so this method returns the positive proper numerator, 3.\u003c/p\u003e\n     *\n     * @return the numerator fraction part of a proper fraction, always positive\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.getProperWhole()",
      "begin_line": 406,
      "end_line": 408,
      "comment": "\n     * \u003cp\u003eGets the proper whole part of the fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn improper fraction 7/4 can be resolved into a proper one, 1 3/4.\n     * This method returns the 1 from the proper fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the fraction is negative such as -7/4, it can be resolved into\n     * -1 3/4, so this method returns the positive whole part -1.\u003c/p\u003e\n     *\n     * @return the whole fraction part of a proper fraction, that includes the sign\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.intValue()",
      "begin_line": 419,
      "end_line": 422,
      "comment": "\n     * \u003cp\u003eGets the fraction as an \u003ccode\u003eint\u003c/code\u003e. This returns the whole number\n     * part of the fraction.\u003c/p\u003e\n     *\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.longValue()",
      "begin_line": 430,
      "end_line": 433,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003elong\u003c/code\u003e. This returns the whole number\n     * part of the fraction.\u003c/p\u003e\n     *\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.floatValue()",
      "begin_line": 441,
      "end_line": 444,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003efloat\u003c/code\u003e. This calculates the fraction\n     * as the numerator divided by denominator.\u003c/p\u003e\n     *\n     * @return the fraction as a \u003ccode\u003efloat\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.doubleValue()",
      "begin_line": 452,
      "end_line": 455,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003edouble\u003c/code\u003e. This calculates the fraction\n     * as the numerator divided by denominator.\u003c/p\u003e\n     *\n     * @return the fraction as a \u003ccode\u003edouble\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.reduce()",
      "begin_line": 469,
      "end_line": 478,
      "comment": "\n     * \u003cp\u003eReduce the fraction to the smallest values for the numerator and\n     * denominator, returning the result.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor example, if this fraction represents 2/4, then the result\n     * will be 1/2.\u003c/p\u003e\n     *\n     * @return a new reduced fraction instance, or this if no simplification possible\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 74)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.invert()",
      "begin_line": 489,
      "end_line": 501,
      "comment": "\n     * \u003cp\u003eGets a fraction that is the inverse (1/fraction) of this one.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe returned fraction is not reduced.\u003c/p\u003e\n     *\n     * @return a new fraction instance with the numerator and denominator\n     *         inverted.\n     * @throws ArithmeticException if the fraction represents zero.\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 500,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.negate()",
      "begin_line": 510,
      "end_line": 516,
      "comment": "\n     * \u003cp\u003eGets a fraction that is the negative (-fraction) of this one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned fraction is not reduced.\u003c/p\u003e\n     *\n     * @return a new fraction instance with the opposite signed numerator\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.abs()",
      "begin_line": 527,
      "end_line": 532,
      "comment": "\n     * \u003cp\u003eGets a fraction that is the positive equivalent of this one.\u003c/p\u003e\n     * \u003cp\u003eMore precisely: \u003ccode\u003e(fraction \u003e\u003d 0 ? this : -fraction)\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned fraction is not reduced.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003ethis\u003c/code\u003e if it is positive, or a new positive fraction\n     *  instance with the opposite signed numerator\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 531,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.pow(int)",
      "begin_line": 546,
      "end_line": 564,
      "comment": "\n     * \u003cp\u003eGets a fraction that is raised to the passed in power.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned fraction is in reduced form.\u003c/p\u003e\n     *\n     * @param power  the power to raise the fraction to\n     * @return \u003ccode\u003ethis\u003c/code\u003e if the power is one, \u003ccode\u003eONE\u003c/code\u003e if the power\n     * is zero (even if the fraction equals ZERO) or a new fraction instance \n     * raised to the appropriate power\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 563,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(int, int)",
      "begin_line": 576,
      "end_line": 618,
      "comment": "\n     * \u003cp\u003eGets the greatest common divisor of the absolute value of\n     * two numbers, using the \"binary gcd\" method which avoids\n     * division and modulo operations.  See Knuth 4.5.2 algorithm B.\n     * This algorithm is due to Josef Stein (1961).\u003c/p\u003e\n     *\n     * @param u  a non-zero number\n     * @param v  a non-zero number\n     * @return the greatest common divisor, never zero\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 580,col 9)",
        "(line 585,col 9)-(line 585,col 26)",
        "(line 586,col 9)-(line 586,col 26)",
        "(line 588,col 9)-(line 588,col 16)",
        "(line 589,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 594,col 9)",
        "(line 597,col 9)-(line 597,col 46)",
        "(line 600,col 9)-(line 616,col 23)",
        "(line 617,col 9)-(line 617,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.mulAndCheck(int, int)",
      "begin_line": 632,
      "end_line": 639,
      "comment": " \n     * Multiply two integers, checking for overflow.\n     * \n     * @param x a factor\n     * @param y a factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     *                             an int\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 37)",
        "(line 634,col 9)-(line 637,col 9)",
        "(line 638,col 9)-(line 638,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.mulPosAndCheck(int, int)",
      "begin_line": 650,
      "end_line": 657,
      "comment": "\n     *  Multiply two non-negative integers, checking for overflow.\n     * \n     * @param x a non-negative factor\n     * @param y a non-negative factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     * an int\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 37)",
        "(line 653,col 9)-(line 655,col 9)",
        "(line 656,col 9)-(line 656,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.addAndCheck(int, int)",
      "begin_line": 668,
      "end_line": 675,
      "comment": " \n     * Add two integers, checking for overflow.\n     * \n     * @param x an addend\n     * @param y an addend\n     * @return the sum \u003ccode\u003ex+y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     * an int\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 33)",
        "(line 670,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 674,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.subAndCheck(int, int)",
      "begin_line": 686,
      "end_line": 693,
      "comment": " \n     * Subtract two integers, checking for overflow.\n     * \n     * @param x the minuend\n     * @param y the subtrahend\n     * @return the difference \u003ccode\u003ex-y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     * an int\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 33)",
        "(line 688,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.add(org.apache.commons.lang3.math.Fraction)",
      "begin_line": 705,
      "end_line": 707,
      "comment": "\n     * \u003cp\u003eAdds the value of this fraction to another, returning the result in reduced form.\n     * The algorithm follows Knuth, 4.5.1.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to add, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.subtract(org.apache.commons.lang3.math.Fraction)",
      "begin_line": 719,
      "end_line": 721,
      "comment": "\n     * \u003cp\u003eSubtracts the value of another fraction from the value of this one, \n     * returning the result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.addSub(org.apache.commons.lang3.math.Fraction, boolean)",
      "begin_line": 733,
      "end_line": 777,
      "comment": " \n     * Implement add and subtract using algorithm described in Knuth 4.5.1.\n     * \n     * @param fraction the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param isAdd true to add, false to subtract\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 736,col 9)",
        "(line 738,col 9)-(line 740,col 9)",
        "(line 741,col 9)-(line 743,col 9)",
        "(line 746,col 9)-(line 746,col 74)",
        "(line 747,col 9)-(line 754,col 9)",
        "(line 758,col 9)-(line 759,col 67)",
        "(line 760,col 9)-(line 761,col 58)",
        "(line 762,col 9)-(line 762,col 64)",
        "(line 765,col 9)-(line 765,col 62)",
        "(line 766,col 9)-(line 766,col 66)",
        "(line 769,col 9)-(line 769,col 56)",
        "(line 770,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 776,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.multiplyBy(org.apache.commons.lang3.math.Fraction)",
      "begin_line": 789,
      "end_line": 803,
      "comment": "\n     * \u003cp\u003eMultiplies the value of this fraction by another, returning the \n     * result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to multiply by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 795,col 9)",
        "(line 798,col 9)-(line 798,col 72)",
        "(line 799,col 9)-(line 799,col 72)",
        "(line 800,col 9)-(line 802,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.divideBy(org.apache.commons.lang3.math.Fraction)",
      "begin_line": 815,
      "end_line": 823,
      "comment": "\n     * \u003cp\u003eDivide the value of this fraction by another.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to divide by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the fraction to divide by is zero\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 818,col 9)",
        "(line 819,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 822,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.equals(java.lang.Object)",
      "begin_line": 836,
      "end_line": 847,
      "comment": "\n     * \u003cp\u003eCompares this fraction to another object to test if they are equal.\u003c/p\u003e.\n     *\n     * \u003cp\u003eTo be equal, both values must be equal. Thus 2/4 is not equal to 1/2.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 843,col 9)",
        "(line 844,col 9)-(line 844,col 40)",
        "(line 845,col 9)-(line 846,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.hashCode()",
      "begin_line": 854,
      "end_line": 861,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the fraction.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 859,col 9)",
        "(line 860,col 9)-(line 860,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.compareTo(org.apache.commons.lang3.math.Fraction)",
      "begin_line": 875,
      "end_line": 893,
      "comment": "\n     * \u003cp\u003eCompares this object to another based on size.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote: this class has a natural ordering that is inconsistent\n     * with equals, because, for example, equals treats 1/2 and 2/4 as\n     * different, whereas compareTo treats them as equal.\n     *\n     * @param other  the object to compare to\n     * @return -1 if this is less, 0 if equal, +1 if greater\n     * @throws ClassCastException if the object is not a \u003ccode\u003eFraction\u003c/code\u003e\n     * @throws NullPointerException if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 881,col 9)",
        "(line 884,col 9)-(line 884,col 65)",
        "(line 885,col 9)-(line 885,col 66)",
        "(line 886,col 9)-(line 892,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.toString()",
      "begin_line": 902,
      "end_line": 911,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format used is \u0027\u003ci\u003enumerator\u003c/i\u003e/\u003ci\u003edenominator\u003c/i\u003e\u0027 always.\n     *\n     * @return a \u003ccode\u003eString\u003c/code\u003e form of the fraction\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 909,col 9)",
        "(line 910,col 9)-(line 910,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.toProperString()",
      "begin_line": 922,
      "end_line": 951,
      "comment": "\n     * \u003cp\u003eGets the fraction as a proper \u003ccode\u003eString\u003c/code\u003e in the format X Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format used in \u0027\u003ci\u003ewholeNumber\u003c/i\u003e \u003ci\u003enumerator\u003c/i\u003e/\u003ci\u003edenominator\u003c/i\u003e\u0027.\n     * If the whole number is zero it will be ommitted. If the numerator is zero,\n     * only the whole number is returned.\u003c/p\u003e\n     *\n     * @return a \u003ccode\u003eString\u003c/code\u003e form of the fraction\n     ",
      "child_ranges": [
        "(line 923,col 9)-(line 949,col 9)",
        "(line 950,col 9)-(line 950,col 30)"
      ]
    }
  ]
}