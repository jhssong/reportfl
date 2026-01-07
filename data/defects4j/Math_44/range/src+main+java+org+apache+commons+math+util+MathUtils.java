{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/util/MathUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 519,
      "comment": "\n * Some useful additions to the built-in functions in {@link Math}.\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Smallest positive number such that 1 - EPSILON is not numerically equal to 1. "
    },
    {
      "type": "field",
      "varNames": [
        "SAFE_MIN"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Safe minimum, such that 1 / SAFE_MIN does not overflow.\n     * \u003cp\u003eIn IEEE 754 arithmetic, this is also the smallest normalized\n     * number 2\u003csup\u003e-1022\u003c/sup\u003e.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_PI"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * 2 \u0026pi;.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NB"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " -1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "NS"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " -1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "PB"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " 1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "PS"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " 1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "ZB"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " 0.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "ZS"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " 0.0 cast as a short. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtils.MathUtils()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Returns an integer hash code representing the given double value.\n     *\n     * @param value the value to be hashed\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double[])",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Returns an integer hash code representing the given double array.\n     *\n     * @param value the value to be hashed (may be null)\n     * @return the hash code\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(byte)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * For a byte value x, this method returns (byte)(+1) if x \u003e\u003d 0 and\n     * (byte)(-1) if x \u003c 0.\n     *\n     * @param x the value, a byte\n     * @return (byte)(+1) or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(double)",
      "begin_line": 116,
      "end_line": 121,
      "comment": "\n     * For a double precision value x, this method returns +1.0 if x \u003e\u003d 0 and\n     * -1.0 if x \u003c 0. Returns {@code NaN} if {@code x} is\n     * {@code NaN}.\n     *\n     * @param x the value, a double\n     * @return +1.0 or -1.0, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(float)",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * For a float value x, this method returns +1.0F if x \u003e\u003d 0 and -1.0F if x \u003c\n     * 0. Returns {@code NaN} if {@code x} is {@code NaN}.\n     *\n     * @param x the value, a float\n     * @return +1.0F or -1.0F, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(int)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * For an int value x, this method returns +1 if x \u003e\u003d 0 and -1 if x \u003c 0.\n     *\n     * @param x the value, an int\n     * @return +1 or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(long)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * For a long value x, this method returns +1L if x \u003e\u003d 0 and -1L if x \u003c 0.\n     *\n     * @param x the value, a long\n     * @return +1L or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.indicator(short)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * For a short value x, this method returns (short)(+1) if x \u003e\u003d 0 and\n     * (short)(-1) if x \u003c 0.\n     *\n     * @param x the value, a short\n     * @return (short)(+1) or (short)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.normalizeAngle(double, double)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * Normalize an angle in a 2\u0026pi wide interval around a center value.\n     * \u003cp\u003eThis method has three main uses:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003enormalize an angle between 0 and 2\u0026pi;:\u003cbr/\u003e\n     *       {@code a \u003d MathUtils.normalizeAngle(a, FastMath.PI);}\u003c/li\u003e\n     *   \u003cli\u003enormalize an angle between -\u0026pi; and +\u0026pi;\u003cbr/\u003e\n     *       {@code a \u003d MathUtils.normalizeAngle(a, 0.0);}\u003c/li\u003e\n     *   \u003cli\u003ecompute the angle between two defining angular positions:\u003cbr\u003e\n     *       {@code angle \u003d MathUtils.normalizeAngle(end, start) - start;}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eNote that due to numerical accuracy and since \u0026pi; cannot be represented\n     * exactly, the result interval is \u003cem\u003eclosed\u003c/em\u003e, it cannot be half-closed\n     * as would be more satisfactory in a purely mathematical view.\u003c/p\u003e\n     * @param a angle to normalize\n     * @param center center of the desired 2\u0026pi; interval for the result\n     * @return a-2k\u0026pi; with integer k and center-\u0026pi; \u0026lt;\u003d a-2k\u0026pi; \u0026lt;\u003d center+\u0026pi;\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 188,col 10)-(line 188,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.reduce(double, double, double)",
      "begin_line": 207,
      "end_line": 212,
      "comment": "\n     * \u003cp\u003eReduce {@code |a - offset|} to the primary interval\n     * {@code [0, |period|)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, the value returned is \u003cbr/\u003e\n     * {@code a - |period| * floor((a - offset) / |period|) - offset}.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf any of the parameters are {@code NaN} or infinite, the result is\n     * {@code NaN}.\u003c/p\u003e\n     *\n     * @param a Value to reduce.\n     * @param period Period.\n     * @param offset Value that will be mapped to {@code 0}.\n     * @return the value, within the interval {@code [0 |period|)},\n     * that corresponds to {@code a}.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 46)",
        "(line 211,col 9)-(line 211,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(byte)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for byte value {@code x}.\n     * \u003cp\u003e\n     * For a byte value x, this method returns (byte)(+1) if x \u003e 0, (byte)(0) if\n     * x \u003d 0, and (byte)(-1) if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a byte\n     * @return (byte)(+1), (byte)(0), or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.copySign(byte, byte)",
      "begin_line": 238,
      "end_line": 248,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     *\n     * @param magnitude Magnitude of the returned value.\n     * @param sign Sign of the returned value.\n     * @return a value with magnitude equal to {@code magnitude} and with the\n     * same sign as the {@code sign} argument.\n     * @throws MathArithmeticException if {@code magnitude \u003d\u003d Byte.MIN_VALUE}\n     * and {@code sign \u003e\u003d 0}.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(int)",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for int value {@code x}.\n     * \u003cp\u003e\n     * For an int value x, this method returns +1 if x \u003e 0, 0 if x \u003d 0, and -1\n     * if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, an int\n     * @return +1, 0, or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(long)",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for long value {@code x}.\n     * \u003cp\u003e\n     * For a long value x, this method returns +1L if x \u003e 0, 0L if x \u003d 0, and\n     * -1L if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a long\n     * @return +1L, 0L, or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(short)",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n     * Compute the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003esign\u003c/a\u003e\n     * of the argument.\n     *\n     * @param x the value, a short\n     * @return 1 if {@code x \u003e 0}, 0 if {@code x \u003d\u003d 0}, and -1 if {@code x \u003c 0}.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, int)",
      "begin_line": 297,
      "end_line": 313,
      "comment": "\n     * Raise an int to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 302,col 23)",
        "(line 303,col 9)-(line 303,col 23)",
        "(line 304,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 312,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(int, long)",
      "begin_line": 323,
      "end_line": 339,
      "comment": "\n     * Raise an int to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 328,col 23)",
        "(line 329,col 9)-(line 329,col 23)",
        "(line 330,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 338,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, int)",
      "begin_line": 349,
      "end_line": 365,
      "comment": "\n     * Raise a long to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 352,col 9)",
        "(line 354,col 9)-(line 354,col 25)",
        "(line 355,col 9)-(line 355,col 24)",
        "(line 356,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 364,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(long, long)",
      "begin_line": 375,
      "end_line": 391,
      "comment": "\n     * Raise a long to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 378,col 9)",
        "(line 380,col 9)-(line 380,col 25)",
        "(line 381,col 9)-(line 381,col 24)",
        "(line 382,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 390,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, int)",
      "begin_line": 401,
      "end_line": 407,
      "comment": "\n     * Raise a BigInteger to an int power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 404,col 9)",
        "(line 406,col 9)-(line 406,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, long)",
      "begin_line": 417,
      "end_line": 434,
      "comment": "\n     * Raise a BigInteger to a long power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 420,col 9)",
        "(line 422,col 9)-(line 422,col 43)",
        "(line 423,col 9)-(line 423,col 30)",
        "(line 424,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 432,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.pow(java.math.BigInteger, java.math.BigInteger)",
      "begin_line": 444,
      "end_line": 460,
      "comment": "\n     * Raise a BigInteger to a BigInteger power.\n     *\n     * @param k Number to raise.\n     * @param e Exponent (must be positive or zero).\n     * @return k\u003csup\u003ee\u003c/sup\u003e\n     * @throws NotPositiveException if {@code e \u003c 0}.\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 447,col 9)",
        "(line 449,col 9)-(line 449,col 43)",
        "(line 450,col 9)-(line 450,col 30)",
        "(line 451,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 459,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkFinite(double)",
      "begin_line": 469,
      "end_line": 473,
      "comment": "\n     * Check that the argument is a real number.\n     *\n     * @param x Argument.\n     * @throws NotFiniteNumberException if {@code x} is not a\n     * finite real number.\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 472,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkFinite(double[])",
      "begin_line": 482,
      "end_line": 489,
      "comment": "\n     * Check that all the elements are real number.\n     *\n     * @param val Arguments.\n     * @throws NotFiniteNumberException if any values of the array is not a\n     * finite real number.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkNotNull(java.lang.Object, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 499,
      "end_line": 505,
      "comment": "\n     * Checks that an object is not null.\n     *\n     * @param o Object to be checked.\n     * @param pattern Message pattern.\n     * @param args Arguments to replace the placeholders in {@code pattern}.\n     * @throws NullArgumentException if {@code o} is {@code null}.\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 504,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkNotNull(java.lang.Object)",
      "begin_line": 513,
      "end_line": 518,
      "comment": "\n     * Checks that an object is not null.\n     *\n     * @param o Object to be checked.\n     * @throws NullArgumentException if {@code o} is {@code null}.\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 517,col 9)"
      ]
    }
  ]
}