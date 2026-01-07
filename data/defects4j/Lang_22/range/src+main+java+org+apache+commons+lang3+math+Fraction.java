{
  "filepath": "/tmp/Lang-22b/src/main/java/org/apache/commons/lang3/math/Fraction.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Fraction",
      "is_interface": false,
      "parent_types": [
        "java.lang.Number",
        "java.lang.Comparable\u003corg.apache.commons.lang3.math.Fraction\u003e"
      ],
      "begin_line": 40,
      "end_line": 958,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eFraction\u003c/code\u003e is a \u003ccode\u003eNumber\u003c/code\u003e implementation that\n * stores fractions accurately.\u003c/p\u003e\n *\n * \u003cp\u003eThis class is immutable, and interoperable with most methods that accept\n * a \u003ccode\u003eNumber\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eNote that this class is intended for common use cases, it is \u003ci\u003eint\u003c/i\u003e\n * based and thus suffers from various overflow issues. For a BigInteger based \n * equivalent, please see the Commons Math BigFraction class. \u003c/p\u003e\n *\n * @author Apache Software Foundation\n * @author Travis Reeder\n * @author Tim O\u0027Brien\n * @author Pete Gieser\n * @author C. Scott Ananian\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Required for serialization support. Lang version 2.0.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 0.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_HALF"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1/2.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_THIRD"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1/3.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_THIRDS"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 2/3.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_QUARTER"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1/4.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_QUARTERS"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 2/4.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_QUARTERS"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 3/4.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE_FIFTH"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 1/5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_FIFTHS"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 2/5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THREE_FIFTHS"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 3/5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "FOUR_FIFTHS"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * \u003ccode\u003eFraction\u003c/code\u003e representation of 4/5.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "numerator"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * The numerator number part of the fraction (the three in three sevenths).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "denominator"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * The denominator number part of the fraction (the seven in three sevenths).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hashCode"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * Cached output hashCode (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toString"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Cached output toString (class is immutable).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "toProperString"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * Cached output toProperString (class is immutable).\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.math.Fraction.Fraction(int, int)",
      "begin_line": 128,
      "end_line": 132,
      "comment": "\n     * \u003cp\u003eConstructs a \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 16)",
        "(line 130,col 9)-(line 130,col 35)",
        "(line 131,col 9)-(line 131,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.getFraction(int, int)",
      "begin_line": 146,
      "end_line": 159,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eAny negative signs are resolved to be on the numerator.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     * @return a new fraction instance\n     * @throws ArithmeticException if the denominator is \u003ccode\u003ezero\u003c/code\u003e\n     * or the denominator is {@code negative} and the numerator is {@code Integer#MIN_VALUE}\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.getFraction(int, int, int)",
      "begin_line": 177,
      "end_line": 198,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance with the 3 parts\n     * of a fraction X Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe negative sign must be passed in on the whole number part.\u003c/p\u003e\n     *\n     * @param whole  the whole number, for example the one in \u0027one and three sevenths\u0027\n     * @param numerator  the numerator, for example the three in \u0027one and three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027one and three sevenths\u0027\n     * @return a new fraction instance\n     * @throws ArithmeticException if the denominator is \u003ccode\u003ezero\u003c/code\u003e\n     * @throws ArithmeticException if the denominator is negative\n     * @throws ArithmeticException if the numerator is negative\n     * @throws ArithmeticException if the resulting numerator exceeds \n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 28)",
        "(line 188,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.getReducedFraction(int, int)",
      "begin_line": 214,
      "end_line": 238,
      "comment": "\n     * \u003cp\u003eCreates a reduced \u003ccode\u003eFraction\u003c/code\u003e instance with the 2 parts\n     * of a fraction Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eFor example, if the input parameters represent 2/4, then the created\n     * fraction will be 1/2.\u003c/p\u003e\n     *\n     * \u003cp\u003eAny negative signs are resolved to be on the numerator.\u003c/p\u003e\n     *\n     * @param numerator  the numerator, for example the three in \u0027three sevenths\u0027\n     * @param denominator  the denominator, for example the seven in \u0027three sevenths\u0027\n     * @return a new fraction instance, with the numerator and denominator reduced\n     * @throws ArithmeticException if the denominator is \u003ccode\u003ezero\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 64)",
        "(line 235,col 9)-(line 235,col 25)",
        "(line 236,col 9)-(line 236,col 27)",
        "(line 237,col 9)-(line 237,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.getFraction(double)",
      "begin_line": 254,
      "end_line": 304,
      "comment": "\n     * \u003cp\u003eCreates a \u003ccode\u003eFraction\u003c/code\u003e instance from a \u003ccode\u003edouble\u003c/code\u003e value.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method uses the \u003ca href\u003d\"http://archives.math.utk.edu/articles/atuyl/confrac/\"\u003e\n     *  continued fraction algorithm\u003c/a\u003e, computing a maximum of\n     *  25 convergents and bounding the denominator by 10,000.\u003c/p\u003e\n     *\n     * @param value  the double value to convert\n     * @return a new fraction instance that is close to the value\n     * @throws ArithmeticException if \u003ccode\u003e|value| \u003e Integer.MAX_VALUE\u003c/code\u003e \n     *  or \u003ccode\u003evalue \u003d NaN\u003c/code\u003e\n     * @throws ArithmeticException if the calculated denominator is \u003ccode\u003ezero\u003c/code\u003e\n     * @throws ArithmeticException if the the algorithm does not converge\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 40)",
        "(line 256,col 9)-(line 256,col 32)",
        "(line 257,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 38)",
        "(line 262,col 9)-(line 262,col 29)",
        "(line 264,col 9)-(line 264,col 23)",
        "(line 265,col 9)-(line 265,col 23)",
        "(line 266,col 9)-(line 266,col 23)",
        "(line 267,col 9)-(line 267,col 23)",
        "(line 268,col 9)-(line 268,col 23)",
        "(line 269,col 9)-(line 269,col 23)",
        "(line 270,col 9)-(line 270,col 29)",
        "(line 271,col 9)-(line 271,col 19)",
        "(line 272,col 9)-(line 272,col 22)",
        "(line 273,col 9)-(line 273,col 22)",
        "(line 274,col 9)-(line 274,col 31)",
        "(line 275,col 9)-(line 275,col 22)",
        "(line 276,col 9)-(line 276,col 49)",
        "(line 277,col 9)-(line 277,col 24)",
        "(line 278,col 9)-(line 278,col 18)",
        "(line 280,col 9)-(line 299,col 85)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.getFraction(java.lang.String)",
      "begin_line": 324,
      "end_line": 359,
      "comment": "\n     * \u003cp\u003eCreates a Fraction from a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe formats accepted are:\u003c/p\u003e\n     *\n     * \u003col\u003e\n     *  \u003cli\u003e\u003ccode\u003edouble\u003c/code\u003e String containing a dot\u003c/li\u003e\n     *  \u003cli\u003e\u0027X Y/Z\u0027\u003c/li\u003e\n     *  \u003cli\u003e\u0027Y/Z\u0027\u003c/li\u003e\n     *  \u003cli\u003e\u0027X\u0027 (a simple whole number)\u003c/li\u003e\n     * \u003c/ol\u003e\n     * and a .\u003c/p\u003e\n     *\n     * @param str  the string to parse, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return the new \u003ccode\u003eFraction\u003c/code\u003e instance\n     * @throws IllegalArgumentException if the string is \u003ccode\u003enull\u003c/code\u003e\n     * @throws NumberFormatException if the number format is invalid\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 327,col 9)",
        "(line 329,col 9)-(line 329,col 35)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 335,col 9)-(line 335,col 31)",
        "(line 336,col 9)-(line 347,col 9)",
        "(line 350,col 9)-(line 350,col 31)",
        "(line 351,col 9)-(line 358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.getNumerator()",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\n     * \u003cp\u003eGets the numerator part of the fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method may return a value greater than the denominator, an\n     * improper fraction, such as the seven in 7/4.\u003c/p\u003e\n     *\n     * @return the numerator fraction part\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.getDenominator()",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\n     * \u003cp\u003eGets the denominator part of the fraction.\u003c/p\u003e\n     *\n     * @return the denominator fraction part\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.getProperNumerator()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * \u003cp\u003eGets the proper numerator, always positive.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn improper fraction 7/4 can be resolved into a proper one, 1 3/4.\n     * This method returns the 3 from the proper fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the fraction is negative such as -7/4, it can be resolved into\n     * -1 3/4, so this method returns the positive proper numerator, 3.\u003c/p\u003e\n     *\n     * @return the numerator fraction part of a proper fraction, always positive\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.getProperWhole()",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * \u003cp\u003eGets the proper whole part of the fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eAn improper fraction 7/4 can be resolved into a proper one, 1 3/4.\n     * This method returns the 1 from the proper fraction.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the fraction is negative such as -7/4, it can be resolved into\n     * -1 3/4, so this method returns the positive whole part -1.\u003c/p\u003e\n     *\n     * @return the whole fraction part of a proper fraction, that includes the sign\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.intValue()",
      "begin_line": 424,
      "end_line": 427,
      "comment": "\n     * \u003cp\u003eGets the fraction as an \u003ccode\u003eint\u003c/code\u003e. This returns the whole number\n     * part of the fraction.\u003c/p\u003e\n     *\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.longValue()",
      "begin_line": 435,
      "end_line": 438,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003elong\u003c/code\u003e. This returns the whole number\n     * part of the fraction.\u003c/p\u003e\n     *\n     * @return the whole number fraction part\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.floatValue()",
      "begin_line": 446,
      "end_line": 449,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003efloat\u003c/code\u003e. This calculates the fraction\n     * as the numerator divided by denominator.\u003c/p\u003e\n     *\n     * @return the fraction as a \u003ccode\u003efloat\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.doubleValue()",
      "begin_line": 457,
      "end_line": 460,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003edouble\u003c/code\u003e. This calculates the fraction\n     * as the numerator divided by denominator.\u003c/p\u003e\n     *\n     * @return the fraction as a \u003ccode\u003edouble\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.reduce()",
      "begin_line": 474,
      "end_line": 483,
      "comment": "\n     * \u003cp\u003eReduce the fraction to the smallest values for the numerator and\n     * denominator, returning the result.\u003c/p\u003e\n     * \n     * \u003cp\u003eFor example, if this fraction represents 2/4, then the result\n     * will be 1/2.\u003c/p\u003e\n     *\n     * @return a new reduced fraction instance, or this if no simplification possible\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 74)",
        "(line 479,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 482,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.invert()",
      "begin_line": 494,
      "end_line": 506,
      "comment": "\n     * \u003cp\u003eGets a fraction that is the inverse (1/fraction) of this one.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe returned fraction is not reduced.\u003c/p\u003e\n     *\n     * @return a new fraction instance with the numerator and denominator\n     *         inverted.\n     * @throws ArithmeticException if the fraction represents zero.\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 500,col 9)",
        "(line 501,col 9)-(line 505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.negate()",
      "begin_line": 515,
      "end_line": 521,
      "comment": "\n     * \u003cp\u003eGets a fraction that is the negative (-fraction) of this one.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned fraction is not reduced.\u003c/p\u003e\n     *\n     * @return a new fraction instance with the opposite signed numerator\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.abs()",
      "begin_line": 532,
      "end_line": 537,
      "comment": "\n     * \u003cp\u003eGets a fraction that is the positive equivalent of this one.\u003c/p\u003e\n     * \u003cp\u003eMore precisely: \u003ccode\u003e(fraction \u003e\u003d 0 ? this : -fraction)\u003c/code\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned fraction is not reduced.\u003c/p\u003e\n     *\n     * @return \u003ccode\u003ethis\u003c/code\u003e if it is positive, or a new positive fraction\n     *  instance with the opposite signed numerator\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.pow(int)",
      "begin_line": 551,
      "end_line": 569,
      "comment": "\n     * \u003cp\u003eGets a fraction that is raised to the passed in power.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe returned fraction is in reduced form.\u003c/p\u003e\n     *\n     * @param power  the power to raise the fraction to\n     * @return \u003ccode\u003ethis\u003c/code\u003e if the power is one, \u003ccode\u003eONE\u003c/code\u003e if the power\n     * is zero (even if the fraction equals ZERO) or a new fraction instance \n     * raised to the appropriate power\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 568,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.greatestCommonDivisor(int, int)",
      "begin_line": 581,
      "end_line": 624,
      "comment": "\n     * \u003cp\u003eGets the greatest common divisor of the absolute value of\n     * two numbers, using the \"binary gcd\" method which avoids\n     * division and modulo operations.  See Knuth 4.5.2 algorithm B.\n     * This algorithm is due to Josef Stein (1961).\u003c/p\u003e\n     *\n     * @param u  a non-zero number\n     * @param v  a non-zero number\n     * @return the greatest common divisor, never zero\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 586,col 9)",
        "(line 591,col 9)-(line 591,col 26)",
        "(line 592,col 9)-(line 592,col 26)",
        "(line 594,col 9)-(line 594,col 16)",
        "(line 595,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 600,col 9)",
        "(line 603,col 9)-(line 603,col 46)",
        "(line 606,col 9)-(line 622,col 23)",
        "(line 623,col 9)-(line 623,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.mulAndCheck(int, int)",
      "begin_line": 638,
      "end_line": 645,
      "comment": " \n     * Multiply two integers, checking for overflow.\n     * \n     * @param x a factor\n     * @param y a factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     *                             an int\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 37)",
        "(line 640,col 9)-(line 643,col 9)",
        "(line 644,col 9)-(line 644,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.mulPosAndCheck(int, int)",
      "begin_line": 656,
      "end_line": 663,
      "comment": "\n     *  Multiply two non-negative integers, checking for overflow.\n     * \n     * @param x a non-negative factor\n     * @param y a non-negative factor\n     * @return the product \u003ccode\u003ex*y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     * an int\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 37)",
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.addAndCheck(int, int)",
      "begin_line": 674,
      "end_line": 681,
      "comment": " \n     * Add two integers, checking for overflow.\n     * \n     * @param x an addend\n     * @param y an addend\n     * @return the sum \u003ccode\u003ex+y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     * an int\n     ",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 33)",
        "(line 676,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.subAndCheck(int, int)",
      "begin_line": 692,
      "end_line": 699,
      "comment": " \n     * Subtract two integers, checking for overflow.\n     * \n     * @param x the minuend\n     * @param y the subtrahend\n     * @return the difference \u003ccode\u003ex-y\u003c/code\u003e\n     * @throws ArithmeticException if the result can not be represented as\n     * an int\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 33)",
        "(line 694,col 9)-(line 697,col 9)",
        "(line 698,col 9)-(line 698,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.add(org.apache.commons.lang3.math.Fraction)",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\n     * \u003cp\u003eAdds the value of this fraction to another, returning the result in reduced form.\n     * The algorithm follows Knuth, 4.5.1.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to add, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.subtract(org.apache.commons.lang3.math.Fraction)",
      "begin_line": 725,
      "end_line": 727,
      "comment": "\n     * \u003cp\u003eSubtracts the value of another fraction from the value of this one, \n     * returning the result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.addSub(org.apache.commons.lang3.math.Fraction, boolean)",
      "begin_line": 739,
      "end_line": 783,
      "comment": " \n     * Implement add and subtract using algorithm described in Knuth 4.5.1.\n     * \n     * @param fraction the fraction to subtract, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @param isAdd true to add, false to subtract\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator\n     *   cannot be represented in an \u003ccode\u003eint\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 742,col 9)",
        "(line 744,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 749,col 9)",
        "(line 752,col 9)-(line 752,col 74)",
        "(line 753,col 9)-(line 760,col 9)",
        "(line 764,col 9)-(line 765,col 67)",
        "(line 766,col 9)-(line 767,col 58)",
        "(line 768,col 9)-(line 768,col 64)",
        "(line 771,col 9)-(line 771,col 62)",
        "(line 772,col 9)-(line 772,col 66)",
        "(line 775,col 9)-(line 775,col 56)",
        "(line 776,col 9)-(line 779,col 9)",
        "(line 780,col 9)-(line 782,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.multiplyBy(org.apache.commons.lang3.math.Fraction)",
      "begin_line": 795,
      "end_line": 809,
      "comment": "\n     * \u003cp\u003eMultiplies the value of this fraction by another, returning the \n     * result in reduced form.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to multiply by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 796,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 801,col 9)",
        "(line 804,col 9)-(line 804,col 72)",
        "(line 805,col 9)-(line 805,col 72)",
        "(line 806,col 9)-(line 808,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.divideBy(org.apache.commons.lang3.math.Fraction)",
      "begin_line": 821,
      "end_line": 829,
      "comment": "\n     * \u003cp\u003eDivide the value of this fraction by another.\u003c/p\u003e\n     *\n     * @param fraction  the fraction to divide by, must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return a \u003ccode\u003eFraction\u003c/code\u003e instance with the resulting values\n     * @throws IllegalArgumentException if the fraction is \u003ccode\u003enull\u003c/code\u003e\n     * @throws ArithmeticException if the fraction to divide by is zero\n     * @throws ArithmeticException if the resulting numerator or denominator exceeds\n     *  \u003ccode\u003eInteger.MAX_VALUE\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 827,col 9)",
        "(line 828,col 9)-(line 828,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.equals(java.lang.Object)",
      "begin_line": 842,
      "end_line": 853,
      "comment": "\n     * \u003cp\u003eCompares this fraction to another object to test if they are equal.\u003c/p\u003e.\n     *\n     * \u003cp\u003eTo be equal, both values must be equal. Thus 2/4 is not equal to 1/2.\u003c/p\u003e\n     *\n     * @param obj the reference object with which to compare\n     * @return \u003ccode\u003etrue\u003c/code\u003e if this object is equal\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 846,col 9)",
        "(line 847,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 850,col 40)",
        "(line 851,col 9)-(line 852,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.hashCode()",
      "begin_line": 860,
      "end_line": 867,
      "comment": "\n     * \u003cp\u003eGets a hashCode for the fraction.\u003c/p\u003e\n     *\n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 865,col 9)",
        "(line 866,col 9)-(line 866,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.compareTo(org.apache.commons.lang3.math.Fraction)",
      "begin_line": 881,
      "end_line": 899,
      "comment": "\n     * \u003cp\u003eCompares this object to another based on size.\u003c/p\u003e\n     *\n     * \u003cp\u003eNote: this class has a natural ordering that is inconsistent\n     * with equals, because, for example, equals treats 1/2 and 2/4 as\n     * different, whereas compareTo treats them as equal.\n     *\n     * @param other  the object to compare to\n     * @return -1 if this is less, 0 if equal, +1 if greater\n     * @throws ClassCastException if the object is not a \u003ccode\u003eFraction\u003c/code\u003e\n     * @throws NullPointerException if the object is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 887,col 9)",
        "(line 890,col 9)-(line 890,col 65)",
        "(line 891,col 9)-(line 891,col 66)",
        "(line 892,col 9)-(line 898,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.toString()",
      "begin_line": 908,
      "end_line": 917,
      "comment": "\n     * \u003cp\u003eGets the fraction as a \u003ccode\u003eString\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format used is \u0027\u003ci\u003enumerator\u003c/i\u003e/\u003ci\u003edenominator\u003c/i\u003e\u0027 always.\n     *\n     * @return a \u003ccode\u003eString\u003c/code\u003e form of the fraction\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 915,col 9)",
        "(line 916,col 9)-(line 916,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.math.Fraction.toProperString()",
      "begin_line": 928,
      "end_line": 957,
      "comment": "\n     * \u003cp\u003eGets the fraction as a proper \u003ccode\u003eString\u003c/code\u003e in the format X Y/Z.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe format used in \u0027\u003ci\u003ewholeNumber\u003c/i\u003e \u003ci\u003enumerator\u003c/i\u003e/\u003ci\u003edenominator\u003c/i\u003e\u0027.\n     * If the whole number is zero it will be ommitted. If the numerator is zero,\n     * only the whole number is returned.\u003c/p\u003e\n     *\n     * @return a \u003ccode\u003eString\u003c/code\u003e form of the fraction\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 955,col 9)",
        "(line 956,col 9)-(line 956,col 30)"
      ]
    }
  ]
}