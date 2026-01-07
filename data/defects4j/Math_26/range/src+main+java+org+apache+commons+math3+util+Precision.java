{
  "filepath": "/tmp/Math-26b/src/main/java/org/apache/commons/math3/util/Precision.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Precision",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 519,
      "comment": "\n * Utilities for comparing numbers.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Smallest positive number such that {@code 1 - EPSILON} is not\n     * numerically equal to 1.\n     * \u003cbr/\u003e\n     * In IEEE 754 arithmetic, this is 2\u003csup\u003e-53\u003c/sup\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SAFE_MIN"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Safe minimum, such that {@code 1 / SAFE_MIN} does not overflow.\n     * \u003cbr/\u003e\n     * In IEEE 754 arithmetic, this is also the smallest normalized\n     * number 2\u003csup\u003e-1022\u003c/sup\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXPONENT_OFFSET"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Exponent offset in IEEE754 representation. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK_FLOAT"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.Precision.Precision()",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.compareTo(double, double, double)",
      "begin_line": 87,
      "end_line": 94,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     *\n     * @param x the first number\n     * @param y the second number\n     * @param eps the amount of error to allow when checking for equality\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, double) equals(x, y, eps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.compareTo(double, double, int)",
      "begin_line": 113,
      "end_line": 120,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, int) equals(x, y, maxUlps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(float, float)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(float,float,int) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(float, float)",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(float,float) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(float, float, float)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(float, float, float)",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(float, float, int)",
      "begin_line": 194,
      "end_line": 209,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are fewer than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 43)",
        "(line 196,col 9)-(line 196,col 43)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 206,col 69)",
        "(line 208,col 9)-(line 208,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(float, float, int)",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(float,float,int) equals(x, y, maxUlps)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(double, double)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(double,double,int) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(double, double)",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(double,double) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(double, double, double)",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * Returns {@code true} if there is no double value strictly between the\n     * arguments or the difference between them is within the range of allowed\n     * error (inclusive).\n     *\n     * @param x First value.\n     * @param y Second value.\n     * @param eps Amount of allowed absolute error.\n     * @return {@code true} if the values are two adjacent floating point\n     * numbers or they are within range of each other.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(double, double, double)",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(double, double, int)",
      "begin_line": 299,
      "end_line": 314,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are fewer than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 47)",
        "(line 301,col 9)-(line 301,col 47)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 311,col 69)",
        "(line 313,col 9)-(line 313,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(double, double, int)",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(double,double,int) equals(x, y, maxUlps)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.round(double, int)",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.round(double, int, int)",
      "begin_line": 362,
      "end_line": 375,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the given method which is any method defined\n     * in {@link BigDecimal}.\n     * If {@code x} is infinite or {@code NaN}, then the value of {@code x} is\n     * returned unchanged, regardless of the other parameters.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @param roundingMethod Rounding method as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @throws ArithmeticException if {@code roundingMethod \u003d\u003d ROUND_UNNECESSARY}\n     * and the specified scaling operation would require rounding.\n     * @throws IllegalArgumentException if {@code roundingMethod} does not\n     * represent a valid rounding mode.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 374,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.round(float, int)",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.round(float, int, int)",
      "begin_line": 401,
      "end_line": 405,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the given method which is any method defined\n     * in {@link BigDecimal}.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @param roundingMethod Rounding method as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 52)",
        "(line 403,col 9)-(line 403,col 71)",
        "(line 404,col 9)-(line 404,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.roundUnscaled(double, double, int)",
      "begin_line": 419,
      "end_line": 498,
      "comment": "\n     * Rounds the given non-negative value to the \"nearest\" integer. Nearest is\n     * determined by the rounding method specified. Rounding methods are defined\n     * in {@link BigDecimal}.\n     *\n     * @param unscaled Value to round.\n     * @param sign Sign of the original, scaled value.\n     * @param roundingMethod Rounding method, as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @throws MathIllegalArgumentException if {@code roundingMethod} is not a valid rounding method.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.representableDelta(double, double)",
      "begin_line": 515,
      "end_line": 518,
      "comment": "\n     * Computes a number {@code delta} close to {@code originalDelta} with\n     * the property that \u003cpre\u003e\u003ccode\u003e\n     *   x + delta - x\n     * \u003c/code\u003e\u003c/pre\u003e\n     * is exactly machine-representable.\n     * This is useful when computing numerical derivatives, in order to reduce\n     * roundoff errors.\n     *\n     * @param x Value.\n     * @param originalDelta Offset value.\n     * @return a number {@code delta} so that {@code x + delta} and {@code x}\n     * differ by a representable floating number.\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 37)"
      ]
    }
  ]
}