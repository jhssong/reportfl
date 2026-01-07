{
  "filepath": "/tmp/Lang-58b/src/java/org/apache/commons/lang/math/Fraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Fraction",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.io.Serializable",
        "java.lang.Comparable"
      ],
      "begin_line": 37,
      "end_line": 941,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eFraction\u003c/code\u003e is a \u003ccode\u003eNumber\u003c/code\u003e implementation that\n * stores fractions accurately.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is immutable, and interoperable with most methods that accept\n * a \u003ccode\u003eNumber\u003c/code\u003e.\u003c/p\u003e\n *\n * @author Travis Reeder\n * @author Stephen Colebourne\n * @author Tim O\u0027Brien\n * @author Pete Gieser\n * @author C. Scott Ananian\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Required for serialization support. Lang version 2.0.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HALF"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1/2.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_THIRD"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1/3.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_THIRDS"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 2/3.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_QUARTER"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1/4.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_QUARTERS"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 2/4.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_QUARTERS"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 3/4.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_FIFTH"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1/5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_FIFTHS"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 2/5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_FIFTHS"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 3/5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_FIFTHS"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 4/5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "numerator"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * The numerator number part of the fraction (the three in three sevenths).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "denominator"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * The denominator number part of the fraction (the seven in three sevenths).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Cached output hashCode (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toString"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Cached output toString (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toProperString"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Cached output toProperString (class is immutable).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.math.Fraction.Fraction(int, int)",
      "begin_line": 125,
      "end_line": 129,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 16)",
        "(line 127,col 9)-(line 127,col 35)",
        "(line 128,col 9)-(line 128,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getFraction(int, int)",
      "begin_line": 142,
      "end_line": 155,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eAny negative signs are resolved to be on the numerator.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     * @return a new fraction instance\n     * @throws ArithmeticException if the denomiator is \u003ccode\u003ezero\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getFraction(int, int, int)",
      "begin_line": 173,
      "end_line": 194,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance with the 3 parts\n     * of a fraction X Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe negative sign must be passed in on the whole number part.\u003c/p\u003e\n     *\n     * @param whole  the whole number, for example the one in \u0027one and three sevenths\u0027\n     * @param numerator  the numerator, for example the three in \u0027one and three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027one and three sevenths\u0027\n     * @return a new fraction instance\n     * @throws ArithmeticException if the denomiator is \u003ccode\u003ezero\u003c/code\u003e\n     * @throws ArithmeticException if the denominator is negative\n     * @throws ArithmeticException if the numerator is negative\n     * @throws ArithmeticException if the resulting numerator exceeds \n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 28)",
        "(line 184,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getReducedFraction(int, int)",
      "begin_line": 210,
      "end_line": 234,
      "comment": "\n     * \u003cp\u003eCreates a reduced \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if the input parameters represent 2/4, then the created\n     * fraction will be 1/2.\u003c/p\u003e\n     *\n     * \u003cp\u003eAny negative signs are resolved to be on the numerator.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     * @return a new fraction instance, with the numerator and denominator reduced\n     * @throws ArithmeticException if the denominator is \u003ccode\u003ezero\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 230,col 64)",
        "(line 231,col 9)-(line 231,col 25)",
        "(line 232,col 9)-(line 232,col 27)",
        "(line 233,col 9)-(line 233,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getFraction(double)",
      "begin_line": 250,
      "end_line": 300,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance from a \u003ccode\u003edouble\u003c/code\u003e value.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method uses the \u003ca href\u003d\"http://archives.math.utk.edu/articles/atuyl/confrac/\"\u003e\n     *  continued fraction algorithm\u003c/a\u003e, computing a maximum of\n     *  25 convergents and bounding the denominator by 10,000.\u003c/p\u003e\n     *\n     * @param value  the double value to convert\n     * @return a new fraction instance that is close to the value\n     * @throws ArithmeticException if \u003ccode\u003e|value| \u003e Integer.MAX_VALUE\u003c/code\u003e \n     *  or \u003ccode\u003evalue \u003d NaN\u003c/code\u003e\n     * @throws ArithmeticException if the calculated denominator is \u003ccode\u003ezero\u003c/code\u003e\n     * @throws ArithmeticException if the the algorithm does not converge\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 40)",
        "(line 252,col 9)-(line 252,col 32)",
        "(line 253,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 38)",
        "(line 258,col 9)-(line 258,col 29)",
        "(line 260,col 9)-(line 260,col 23)",
        "(line 261,col 9)-(line 261,col 23)",
        "(line 262,col 9)-(line 262,col 23)",
        "(line 263,col 9)-(line 263,col 23)",
        "(line 264,col 9)-(line 264,col 23)",
        "(line 265,col 9)-(line 265,col 23)",
        "(line 266,col 9)-(line 266,col 29)",
        "(line 267,col 9)-(line 267,col 19)",
        "(line 268,col 9)-(line 268,col 22)",
        "(line 269,col 9)-(line 269,col 22)",
        "(line 270,col 9)-(line 270,col 31)",
        "(line 271,col 9)-(line 271,col 22)",
        "(line 272,col 9)-(line 272,col 49)",
        "(line 273,col 9)-(line 273,col 24)",
        "(line 274,col 9)-(line 274,col 18)",
        "(line 276,col 9)-(line 295,col 85)",
        "(line 296,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getFraction(java.lang.String)",
      "begin_line": 320,
      "end_line": 355,
      "comment": "\n     * \u003cp\u003eCreates a Fraction from a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe formats accepted are:\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003e\u003ccode\u003edouble\u003c/code\u003e String containing a dot\u003c/li\u003e\n     *  \u003cli\u003e\u0027X Y/Z\u0027\u003c/li\u003e\n     *  \u003cli\u003e\u0027Y/Z\u0027\u003c/li\u003e\n     *  \u003cli\u003e\u0027X\u0027 (a simple whole number)\u003c/li\u003e\n     * \u003c/ol\u003e\n     * and a .\u003c/p\u003e\n     *\n     * @param str  the string to parse, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return the new \u003ccode\u003eFraction\u003c/code\u003e instance\n     * @throws IllegalArgumentException if the string is \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberFormatException if the number format is invalid\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 323,col 9)",
        "(line 325,col 9)-(line 325,col 35)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 331,col 9)-(line 331,col 31)",
        "(line 332,col 9)-(line 343,col 9)",
        "(line 346,col 9)-(line 346,col 31)",
        "(line 347,col 9)-(line 354,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getNumerator()",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * \u003cp\u003eGets the numerator part of the fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method may return a value greater than the denominator, an\n     * improper fraction, such as the seven in 7/4.\u003c/p\u003e\n     *\n     * @return the numerator fraction part\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getDenominator()",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * \u003cp\u003eGets the denominator part of the fraction.\u003c/p\u003e\n     *\n     * @return the denominator fraction part\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getProperNumerator()",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * \u003cp\u003eGets the proper numerator, always positive.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn improper fraction 7/4 can be resolved into a proper one, 1 3/4.\n     * This method returns the 3 from the proper fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the fraction is negative such as -7/4, it can be resolved into\n     * -1 3/4, so this method returns the positive proper numerator, 3.\u003c/p\u003e\n     *\n     * @return the numerator fraction part of a proper fraction, always positive\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.getProperWhole()",
      "begin_line": 407,
      "end_line": 409,
      "comment": "\n     * \u003cp\u003eGets the proper whole part of the fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn improper fraction 7/4 can be resolved into a proper one, 1 3/4.\n     * This method returns the 1 from the proper fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the fraction is negative such as -7/4, it can be resolved into\n     * -1 3/4, so this method returns the positive whole part -1.\u003c/p\u003e\n     *\n     * @return the whole fraction part of a proper fraction, that includes the sign\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.intValue()",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * \u003cp\u003eGets the fraction as an \u003ccode\u003eint\u003c/code\u003e. This returns the whole number\n     * part of the fraction.\u003c/p\u003e\n     *\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.longValue()",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003elong\u003c/code\u003e. This returns the whole number\n     * part of the fraction.\u003c/p\u003e\n     *\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.floatValue()",
      "begin_line": 440,
      "end_line": 442,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003efloat\u003c/code\u003e. This calculates the fraction\n     * as the numerator divided by denominator.\u003c/p\u003e\n     *\n     * @return the fraction as a \u003ccode\u003efloat\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 441,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.doubleValue()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003edouble\u003c/code\u003e. This calculates the fraction\n     * as the numerator divided by denominator.\u003c/p\u003e\n     *\n     * @return the fraction as a \u003ccode\u003edouble\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.reduce()",
      "begin_line": 466,
      "end_line": 472,
      "comment": "\n     * \u003cp\u003eReduce the fraction to the smallest values for the numerator and\n     * denominator, returning the result.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor example, if this fraction represents 2/4, then the result\n     * will be 1/2.\u003c/p\u003e\n     *\n     * @return a new reduced fraction instance, or this if no simplification possible\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 74)",
        "(line 468,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 471,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.invert()",
      "begin_line": 483,
      "end_line": 495,
      "comment": "\n     * \u003cp\u003eGets a fraction that is the inverse (1/fraction) of this one.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe returned fraction is not reduced.\u003c/p\u003e\n     *\n     * @return a new fraction instance with the numerator and denominator\n     *         inverted.\n     * @throws ArithmeticException if the fraction represents zero.\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 494,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.negate()",
      "begin_line": 504,
      "end_line": 510,
      "comment": "\n     * \u003cp\u003eGets a fraction that is the negative (-fraction) of this one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned fraction is not reduced.\u003c/p\u003e\n     *\n     * @return a new fraction instance with the opposite signed numerator\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 509,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.abs()",
      "begin_line": 521,
      "end_line": 526,
      "comment": "\n     * \u003cp\u003eGets a fraction that is the positive equivalent of this one.\u003c/p\u003e\n     * \u003cp\u003eMore precisely: \u003ccode\u003e(fraction \u003e\u003d 0 ? this : -fraction)\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned fraction is not reduced.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003ethis\u003c/code\u003e if it is positive, or a new positive fraction\n     *  instance with the opposite signed numerator\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.pow(int)",
      "begin_line": 540,
      "end_line": 558,
      "comment": "\n     * \u003cp\u003eGets a fraction that is raised to the passed in power.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned fraction is in reduced form.\u003c/p\u003e\n     *\n     * @param power  the power to raise the fraction to\n     * @return \u003ccode\u003ethis\u003c/code\u003e if the power is one, \u003ccode\u003eONE\u003c/code\u003e if the power\n     * is zero (even if the fraction equals ZERO) or a new fraction instance \n     * raised to the appropriate power\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 557,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.greatestCommonDivisor(int, int)",
      "begin_line": 570,
      "end_line": 609,
      "comment": "\n     * \u003cp\u003eGets the greatest common divisor of the absolute value of\n     * two numbers, using the \"binary gcd\" method which avoids\n     * division and modulo operations.  See Knuth 4.5.2 algorithm B.\n     * This algorithm is due to Josef Stein (1961).\u003c/p\u003e\n     *\n     * @param u  a non-zero number\n     * @param v  a non-zero number\n     * @return the greatest common divisor, never zero\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 26)",
        "(line 577,col 9)-(line 577,col 26)",
        "(line 579,col 9)-(line 579,col 16)",
        "(line 580,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 585,col 9)",
        "(line 588,col 9)-(line 588,col 46)",
        "(line 591,col 9)-(line 607,col 23)",
        "(line 608,col 9)-(line 608,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.mulAndCheck(int, int)",
      "begin_line": 623,
      "end_line": 630,
      "comment": " \n     * Multiply two integers, checking for overflow.\n     * \n     * @param x a factor\n     * @param y a factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     *                             an int\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 37)",
        "(line 625,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.mulPosAndCheck(int, int)",
      "begin_line": 641,
      "end_line": 648,
      "comment": "\n     *  Multiply two non-negative integers, checking for overflow.\n     * \n     * @param x a non-negative factor\n     * @param y a non-negative factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     * an int\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 37)",
        "(line 644,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 647,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.addAndCheck(int, int)",
      "begin_line": 659,
      "end_line": 666,
      "comment": " \n     * Add two integers, checking for overflow.\n     * \n     * @param x an addend\n     * @param y an addend\n     * @return the sum \u003ccode\u003ex+y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     * an int\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 33)",
        "(line 661,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.subAndCheck(int, int)",
      "begin_line": 677,
      "end_line": 684,
      "comment": " \n     * Subtract two integers, checking for overflow.\n     * \n     * @param x the minuend\n     * @param y the subtrahend\n     * @return the difference \u003ccode\u003ex-y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     * an int\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 33)",
        "(line 679,col 9)-(line 682,col 9)",
        "(line 683,col 9)-(line 683,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.add(org.apache.commons.lang.math.Fraction)",
      "begin_line": 696,
      "end_line": 698,
      "comment": "\n     * \u003cp\u003eAdds the value of this fraction to another, returning the result in reduced form.\n     * The algorithm follows Knuth, 4.5.1.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to add, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.subtract(org.apache.commons.lang.math.Fraction)",
      "begin_line": 710,
      "end_line": 712,
      "comment": "\n     * \u003cp\u003eSubtracts the value of another fraction from the value of this one, \n     * returning the result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.addSub(org.apache.commons.lang.math.Fraction, boolean)",
      "begin_line": 724,
      "end_line": 768,
      "comment": " \n     * Implement add and subtract using algorithm described in Knuth 4.5.1.\n     * \n     * @param fraction the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param isAdd true to add, false to subtract\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 727,col 9)",
        "(line 729,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 734,col 9)",
        "(line 737,col 9)-(line 737,col 74)",
        "(line 738,col 9)-(line 745,col 9)",
        "(line 749,col 9)-(line 750,col 67)",
        "(line 751,col 9)-(line 752,col 58)",
        "(line 753,col 9)-(line 753,col 64)",
        "(line 756,col 9)-(line 756,col 62)",
        "(line 757,col 9)-(line 757,col 66)",
        "(line 760,col 9)-(line 760,col 56)",
        "(line 761,col 9)-(line 764,col 9)",
        "(line 765,col 9)-(line 767,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.multiplyBy(org.apache.commons.lang.math.Fraction)",
      "begin_line": 780,
      "end_line": 794,
      "comment": "\n     * \u003cp\u003eMultiplies the value of this fraction by another, returning the \n     * result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to multiply by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 786,col 9)",
        "(line 789,col 9)-(line 789,col 72)",
        "(line 790,col 9)-(line 790,col 72)",
        "(line 791,col 9)-(line 793,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.divideBy(org.apache.commons.lang.math.Fraction)",
      "begin_line": 806,
      "end_line": 814,
      "comment": "\n     * \u003cp\u003eDivide the value of this fraction by another.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to divide by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the fraction to divide by is zero\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 813,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.equals(java.lang.Object)",
      "begin_line": 827,
      "end_line": 837,
      "comment": "\n     * \u003cp\u003eCompares this fraction to another object to test if they are equal.\u003c/p\u003e.\n     *\n     * \u003cp\u003eTo be equal, both values must be equal. Thus 2/4 is not equal to 1/2.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 828,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 834,col 40)",
        "(line 835,col 9)-(line 836,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.hashCode()",
      "begin_line": 844,
      "end_line": 850,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the fraction.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.compareTo(java.lang.Object)",
      "begin_line": 864,
      "end_line": 883,
      "comment": "\n     * \u003cp\u003eCompares this object to another based on size.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote: this class has a natural ordering that is inconsistent\n     * with equals, because, for example, equals treats 1/2 and 2/4 as\n     * different, whereas compareTo treats them as equal.\n     *\n     * @param object  the object to compare to\n     * @return -1 if this is less, 0 if equal, +1 if greater\n     * @throws ClassCastException if the object is not a \u003ccode\u003eFraction\u003c/code\u003e\n     * @throws NullPointerException if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 43)",
        "(line 866,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 871,col 9)",
        "(line 874,col 9)-(line 874,col 65)",
        "(line 875,col 9)-(line 875,col 66)",
        "(line 876,col 9)-(line 882,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.toString()",
      "begin_line": 892,
      "end_line": 900,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format used is \u0027\u003ci\u003enumerator\u003c/i\u003e/\u003ci\u003edenominator\u003c/i\u003e\u0027 always.\n     *\n     * @return a \u003ccode\u003eString\u003c/code\u003e form of the fraction\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 899,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.math.Fraction.toProperString()",
      "begin_line": 911,
      "end_line": 940,
      "comment": "\n     * \u003cp\u003eGets the fraction as a proper \u003ccode\u003eString\u003c/code\u003e in the format X Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format used in \u0027\u003ci\u003ewholeNumber\u003c/i\u003e \u003ci\u003enumerator\u003c/i\u003e/\u003ci\u003edenominator\u003c/i\u003e\u0027.\n     * If the whole number is zero it will be ommitted. If the numerator is zero,\n     * only the whole number is returned.\u003c/p\u003e\n     *\n     * @return a \u003ccode\u003eString\u003c/code\u003e form of the fraction\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 938,col 9)",
        "(line 939,col 9)-(line 939,col 30)"
      ]
    }
  ]
}