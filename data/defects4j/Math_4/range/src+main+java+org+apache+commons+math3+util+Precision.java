{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/util/Precision.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Precision",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 555,
      "comment": "\n * Utilities for comparing numbers.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * \u003cp\u003e\n     * Largest double-precision floating-point number such that\n     * {@code 1 + EPSILON} is numerically equal to 1. This value is an upper\n     * bound on the relative error due to rounding real numbers to double\n     * precision floating-point numbers.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * In IEEE 754 arithmetic, this is 2\u003csup\u003e-53\u003c/sup\u003e.\n     * \u003c/p\u003e\n     *\n     * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Machine_epsilon\"\u003eMachine epsilon\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SAFE_MIN"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Safe minimum, such that {@code 1 / SAFE_MIN} does not overflow.\n     * \u003cbr/\u003e\n     * In IEEE 754 arithmetic, this is also the smallest normalized\n     * number 2\u003csup\u003e-1022\u003c/sup\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXPONENT_OFFSET"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Exponent offset in IEEE754 representation. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK_FLOAT"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.Precision.Precision()",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.compareTo(double, double, double)",
      "begin_line": 95,
      "end_line": 102,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     *\n     * @param x the first number\n     * @param y the second number\n     * @param eps the amount of error to allow when checking for equality\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, double) equals(x, y, eps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.compareTo(double, double, int)",
      "begin_line": 121,
      "end_line": 128,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, int) equals(x, y, maxUlps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(float, float)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(float,float,int) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(float, float)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(float,float) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(float, float, float)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(float, float, float)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(float, float, int)",
      "begin_line": 202,
      "end_line": 217,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are fewer than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 43)",
        "(line 204,col 9)-(line 204,col 43)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 69)",
        "(line 216,col 9)-(line 216,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(float, float, int)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(float,float,int) equals(x, y, maxUlps)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(double, double)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(double,double,int) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(double, double)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(double,double) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(double, double, double)",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * Returns {@code true} if there is no double value strictly between the\n     * arguments or the difference between them is within the range of allowed\n     * error (inclusive).\n     *\n     * @param x First value.\n     * @param y Second value.\n     * @param eps Amount of allowed absolute error.\n     * @return {@code true} if the values are two adjacent floating point\n     * numbers or they are within range of each other.\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsWithRelativeTolerance(double, double, double)",
      "begin_line": 287,
      "end_line": 296,
      "comment": "\n     * Returns {@code true} if there is no double value strictly between the\n     * arguments or the reltaive difference between them is smaller or equal\n     * to the given tolerance.\n     *\n     * @param x First value.\n     * @param y Second value.\n     * @param eps Amount of allowed relative error.\n     * @return {@code true} if the values are two adjacent floating point\n     * numbers or they are within range of each other.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 292,col 82)",
        "(line 293,col 9)-(line 293,col 78)",
        "(line 295,col 9)-(line 295,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(double, double, double)",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(double, double, int)",
      "begin_line": 330,
      "end_line": 345,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are fewer than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 47)",
        "(line 332,col 9)-(line 332,col 47)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 338,col 9)-(line 340,col 9)",
        "(line 342,col 9)-(line 342,col 69)",
        "(line 344,col 9)-(line 344,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(double, double, int)",
      "begin_line": 359,
      "end_line": 361,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(double,double,int) equals(x, y, maxUlps)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.round(double, int)",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.round(double, int, int)",
      "begin_line": 393,
      "end_line": 406,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the given method which is any method defined\n     * in {@link BigDecimal}.\n     * If {@code x} is infinite or {@code NaN}, then the value of {@code x} is\n     * returned unchanged, regardless of the other parameters.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @param roundingMethod Rounding method as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @throws ArithmeticException if {@code roundingMethod \u003d\u003d ROUND_UNNECESSARY}\n     * and the specified scaling operation would require rounding.\n     * @throws IllegalArgumentException if {@code roundingMethod} does not\n     * represent a valid rounding mode.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 405,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.round(float, int)",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.round(float, int, int)",
      "begin_line": 434,
      "end_line": 439,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the given method which is any method defined\n     * in {@link BigDecimal}.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @param roundingMethod Rounding method as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     * @throws MathArithmeticException if an exact operation is required but result is not exact\n     * @throws MathIllegalArgumentException if {@code roundingMethod} is not a valid rounding method.\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 52)",
        "(line 437,col 9)-(line 437,col 71)",
        "(line 438,col 9)-(line 438,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.roundUnscaled(double, double, int)",
      "begin_line": 454,
      "end_line": 534,
      "comment": "\n     * Rounds the given non-negative value to the \"nearest\" integer. Nearest is\n     * determined by the rounding method specified. Rounding methods are defined\n     * in {@link BigDecimal}.\n     *\n     * @param unscaled Value to round.\n     * @param sign Sign of the original, scaled value.\n     * @param roundingMethod Rounding method, as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @throws MathArithmeticException if an exact operation is required but result is not exact\n     * @throws MathIllegalArgumentException if {@code roundingMethod} is not a valid rounding method.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.representableDelta(double, double)",
      "begin_line": 551,
      "end_line": 554,
      "comment": "\n     * Computes a number {@code delta} close to {@code originalDelta} with\n     * the property that \u003cpre\u003e\u003ccode\u003e\n     *   x + delta - x\n     * \u003c/code\u003e\u003c/pre\u003e\n     * is exactly machine-representable.\n     * This is useful when computing numerical derivatives, in order to reduce\n     * roundoff errors.\n     *\n     * @param x Value.\n     * @param originalDelta Offset value.\n     * @return a number {@code delta} so that {@code x + delta} and {@code x}\n     * differ by a representable floating number.\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 37)"
      ]
    }
  ]
}