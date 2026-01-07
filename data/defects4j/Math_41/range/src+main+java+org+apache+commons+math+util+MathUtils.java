{
  "filepath": "/tmp/Math-41b/src/main/java/org/apache/commons/math/util/MathUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 334,
      "comment": "\n * Miscellaneous utility functions.\n *\n * @see ArithmeticUtils\n * @see Precision\n * @see MathArrays\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_PI"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * 2 \u0026pi;.\n     * @since 2.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "NB"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " -1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "NS"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " -1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "PB"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " 1.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "PS"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " 1.0 cast as a short. "
    },
    {
      "type": "field",
      "varNames": [
        "ZB"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " 0.0 cast as a byte. "
    },
    {
      "type": "field",
      "varNames": [
        "ZS"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " 0.0 cast as a short. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtils.MathUtils()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Private Constructor\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Returns an integer hash code representing the given double value.\n     *\n     * @param value the value to be hashed\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.hash(double[])",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Returns an integer hash code representing the given double array.\n     *\n     * @param value the value to be hashed (may be null)\n     * @return the hash code\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.normalizeAngle(double, double)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Normalize an angle in a 2\u0026pi wide interval around a center value.\n     * \u003cp\u003eThis method has three main uses:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003enormalize an angle between 0 and 2\u0026pi;:\u003cbr/\u003e\n     *       {@code a \u003d MathUtils.normalizeAngle(a, FastMath.PI);}\u003c/li\u003e\n     *   \u003cli\u003enormalize an angle between -\u0026pi; and +\u0026pi;\u003cbr/\u003e\n     *       {@code a \u003d MathUtils.normalizeAngle(a, 0.0);}\u003c/li\u003e\n     *   \u003cli\u003ecompute the angle between two defining angular positions:\u003cbr\u003e\n     *       {@code angle \u003d MathUtils.normalizeAngle(end, start) - start;}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eNote that due to numerical accuracy and since \u0026pi; cannot be represented\n     * exactly, the result interval is \u003cem\u003eclosed\u003c/em\u003e, it cannot be half-closed\n     * as would be more satisfactory in a purely mathematical view.\u003c/p\u003e\n     * @param a angle to normalize\n     * @param center center of the desired 2\u0026pi; interval for the result\n     * @return a-2k\u0026pi; with integer k and center-\u0026pi; \u0026lt;\u003d a-2k\u0026pi; \u0026lt;\u003d center+\u0026pi;\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 110,col 10)-(line 110,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.reduce(double, double, double)",
      "begin_line": 129,
      "end_line": 134,
      "comment": "\n     * \u003cp\u003eReduce {@code |a - offset|} to the primary interval\n     * {@code [0, |period|)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, the value returned is \u003cbr/\u003e\n     * {@code a - |period| * floor((a - offset) / |period|) - offset}.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf any of the parameters are {@code NaN} or infinite, the result is\n     * {@code NaN}.\u003c/p\u003e\n     *\n     * @param a Value to reduce.\n     * @param period Period.\n     * @param offset Value that will be mapped to {@code 0}.\n     * @return the value, within the interval {@code [0 |period|)},\n     * that corresponds to {@code a}.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 46)",
        "(line 133,col 9)-(line 133,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(byte)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for byte value {@code x}.\n     * \u003cp\u003e\n     * For a byte value x, this method returns (byte)(+1) if x \u003e 0, (byte)(0) if\n     * x \u003d 0, and (byte)(-1) if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a byte\n     * @return (byte)(+1), (byte)(0), or (byte)(-1), depending on the sign of x\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.copySign(byte, byte)",
      "begin_line": 160,
      "end_line": 170,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     *\n     * @param magnitude Magnitude of the returned value.\n     * @param sign Sign of the returned value.\n     * @return a value with magnitude equal to {@code magnitude} and with the\n     * same sign as the {@code sign} argument.\n     * @throws MathArithmeticException if {@code magnitude \u003d\u003d Byte.MIN_VALUE}\n     * and {@code sign \u003e\u003d 0}.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.copySign(short, short)",
      "begin_line": 182,
      "end_line": 192,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     *\n     * @param magnitude Magnitude of the returned value.\n     * @param sign Sign of the returned value.\n     * @return a value with magnitude equal to {@code magnitude} and with the\n     * same sign as the {@code sign} argument.\n     * @throws MathArithmeticException if {@code magnitude \u003d\u003d Short.MIN_VALUE}\n     * and {@code sign \u003e\u003d 0}.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.copySign(int, int)",
      "begin_line": 204,
      "end_line": 214,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     *\n     * @param magnitude Magnitude of the returned value.\n     * @param sign Sign of the returned value.\n     * @return a value with magnitude equal to {@code magnitude} and with the\n     * same sign as the {@code sign} argument.\n     * @throws MathArithmeticException if {@code magnitude \u003d\u003d Integer.MIN_VALUE}\n     * and {@code sign \u003e\u003d 0}.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.copySign(long, long)",
      "begin_line": 226,
      "end_line": 236,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     *\n     * @param magnitude Magnitude of the returned value.\n     * @param sign Sign of the returned value.\n     * @return a value with magnitude equal to {@code magnitude} and with the\n     * same sign as the {@code sign} argument.\n     * @throws MathArithmeticException if {@code magnitude \u003d\u003d Long.MIN_VALUE}\n     * and {@code sign \u003e\u003d 0}.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(int)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for int value {@code x}.\n     * \u003cp\u003e\n     * For an int value x, this method returns +1 if x \u003e 0, 0 if x \u003d 0, and -1\n     * if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, an int\n     * @return +1, 0, or -1, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(long)",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003e sign\u003c/a\u003e\n     * for long value {@code x}.\n     * \u003cp\u003e\n     * For a long value x, this method returns +1L if x \u003e 0, 0L if x \u003d 0, and\n     * -1L if x \u003c 0.\u003c/p\u003e\n     *\n     * @param x the value, a long\n     * @return +1L, 0L, or -1L, depending on the sign of x\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.sign(short)",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Compute the \u003ca href\u003d\"http://mathworld.wolfram.com/Sign.html\"\u003esign\u003c/a\u003e\n     * of the argument.\n     *\n     * @param x the value, a short\n     * @return 1 if {@code x \u003e 0}, 0 if {@code x \u003d\u003d 0}, and -1 if {@code x \u003c 0}.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkFinite(double)",
      "begin_line": 284,
      "end_line": 288,
      "comment": "\n     * Check that the argument is a real number.\n     *\n     * @param x Argument.\n     * @throws NotFiniteNumberException if {@code x} is not a\n     * finite real number.\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkFinite(double[])",
      "begin_line": 297,
      "end_line": 304,
      "comment": "\n     * Check that all the elements are real numbers.\n     *\n     * @param val Arguments.\n     * @throws NotFiniteNumberException if any values of the array is not a\n     * finite real number.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 303,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkNotNull(java.lang.Object, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 314,
      "end_line": 320,
      "comment": "\n     * Checks that an object is not null.\n     *\n     * @param o Object to be checked.\n     * @param pattern Message pattern.\n     * @param args Arguments to replace the placeholders in {@code pattern}.\n     * @throws NullArgumentException if {@code o} is {@code null}.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 319,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtils.checkNotNull(java.lang.Object)",
      "begin_line": 328,
      "end_line": 333,
      "comment": "\n     * Checks that an object is not null.\n     *\n     * @param o Object to be checked.\n     * @throws NullArgumentException if {@code o} is {@code null}.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 332,col 9)"
      ]
    }
  ]
}