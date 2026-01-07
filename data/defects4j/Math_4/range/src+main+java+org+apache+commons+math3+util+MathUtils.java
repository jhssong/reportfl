{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/MathUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 268,
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
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.MathUtils.MathUtils()",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Class contains only static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathUtils.hash(double)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Returns an integer hash code representing the given double value.\n     *\n     * @param value the value to be hashed\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathUtils.hash(double[])",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Returns an integer hash code representing the given double array.\n     *\n     * @param value the value to be hashed (may be null)\n     * @return the hash code\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathUtils.normalizeAngle(double, double)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Normalize an angle in a 2\u0026pi; wide interval around a center value.\n     * \u003cp\u003eThis method has three main uses:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003enormalize an angle between 0 and 2\u0026pi;:\u003cbr/\u003e\n     *       {@code a \u003d MathUtils.normalizeAngle(a, FastMath.PI);}\u003c/li\u003e\n     *   \u003cli\u003enormalize an angle between -\u0026pi; and +\u0026pi;\u003cbr/\u003e\n     *       {@code a \u003d MathUtils.normalizeAngle(a, 0.0);}\u003c/li\u003e\n     *   \u003cli\u003ecompute the angle between two defining angular positions:\u003cbr\u003e\n     *       {@code angle \u003d MathUtils.normalizeAngle(end, start) - start;}\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eNote that due to numerical accuracy and since \u0026pi; cannot be represented\n     * exactly, the result interval is \u003cem\u003eclosed\u003c/em\u003e, it cannot be half-closed\n     * as would be more satisfactory in a purely mathematical view.\u003c/p\u003e\n     * @param a angle to normalize\n     * @param center center of the desired 2\u0026pi; interval for the result\n     * @return a-2k\u0026pi; with integer k and center-\u0026pi; \u0026lt;\u003d a-2k\u0026pi; \u0026lt;\u003d center+\u0026pi;\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 91,col 10)-(line 91,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathUtils.reduce(double, double, double)",
      "begin_line": 110,
      "end_line": 115,
      "comment": "\n     * \u003cp\u003eReduce {@code |a - offset|} to the primary interval\n     * {@code [0, |period|)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eSpecifically, the value returned is \u003cbr/\u003e\n     * {@code a - |period| * floor((a - offset) / |period|) - offset}.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf any of the parameters are {@code NaN} or infinite, the result is\n     * {@code NaN}.\u003c/p\u003e\n     *\n     * @param a Value to reduce.\n     * @param period Period.\n     * @param offset Value that will be mapped to {@code 0}.\n     * @return the value, within the interval {@code [0 |period|)},\n     * that corresponds to {@code a}.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 46)",
        "(line 114,col 9)-(line 114,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathUtils.copySign(byte, byte)",
      "begin_line": 127,
      "end_line": 138,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     *\n     * @param magnitude Magnitude of the returned value.\n     * @param sign Sign of the returned value.\n     * @return a value with magnitude equal to {@code magnitude} and with the\n     * same sign as the {@code sign} argument.\n     * @throws MathArithmeticException if {@code magnitude \u003d\u003d Byte.MIN_VALUE}\n     * and {@code sign \u003e\u003d 0}.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathUtils.copySign(short, short)",
      "begin_line": 150,
      "end_line": 161,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     *\n     * @param magnitude Magnitude of the returned value.\n     * @param sign Sign of the returned value.\n     * @return a value with magnitude equal to {@code magnitude} and with the\n     * same sign as the {@code sign} argument.\n     * @throws MathArithmeticException if {@code magnitude \u003d\u003d Short.MIN_VALUE}\n     * and {@code sign \u003e\u003d 0}.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathUtils.copySign(int, int)",
      "begin_line": 173,
      "end_line": 184,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     *\n     * @param magnitude Magnitude of the returned value.\n     * @param sign Sign of the returned value.\n     * @return a value with magnitude equal to {@code magnitude} and with the\n     * same sign as the {@code sign} argument.\n     * @throws MathArithmeticException if {@code magnitude \u003d\u003d Integer.MIN_VALUE}\n     * and {@code sign \u003e\u003d 0}.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathUtils.copySign(long, long)",
      "begin_line": 196,
      "end_line": 207,
      "comment": "\n     * Returns the first argument with the sign of the second argument.\n     *\n     * @param magnitude Magnitude of the returned value.\n     * @param sign Sign of the returned value.\n     * @return a value with magnitude equal to {@code magnitude} and with the\n     * same sign as the {@code sign} argument.\n     * @throws MathArithmeticException if {@code magnitude \u003d\u003d Long.MIN_VALUE}\n     * and {@code sign \u003e\u003d 0}.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathUtils.checkFinite(double)",
      "begin_line": 215,
      "end_line": 220,
      "comment": "\n     * Check that the argument is a real number.\n     *\n     * @param x Argument.\n     * @throws NotFiniteNumberException if {@code x} is not a\n     * finite real number.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathUtils.checkFinite(double[])",
      "begin_line": 229,
      "end_line": 237,
      "comment": "\n     * Check that all the elements are real numbers.\n     *\n     * @param val Arguments.\n     * @throws NotFiniteNumberException if any values of the array is not a\n     * finite real number.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathUtils.checkNotNull(java.lang.Object, org.apache.commons.math3.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 247,
      "end_line": 254,
      "comment": "\n     * Checks that an object is not null.\n     *\n     * @param o Object to be checked.\n     * @param pattern Message pattern.\n     * @param args Arguments to replace the placeholders in {@code pattern}.\n     * @throws NullArgumentException if {@code o} is {@code null}.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.MathUtils.checkNotNull(java.lang.Object)",
      "begin_line": 262,
      "end_line": 267,
      "comment": "\n     * Checks that an object is not null.\n     *\n     * @param o Object to be checked.\n     * @throws NullArgumentException if {@code o} is {@code null}.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 266,col 9)"
      ]
    }
  ]
}