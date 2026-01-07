{
  "filepath": "/tmp/Math-29b/src/main/java/org/apache/commons/math3/util/Precision.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Precision",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 520,
      "comment": "\n * Utilities for comparing numbers.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Smallest positive number such that {@code 1 - EPSILON} is not\n     * numerically equal to 1.\n     * \u003cbr/\u003e\n     * In IEEE 754 arithmetic, this is 2\u003csup\u003e-53\u003c/sup\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SAFE_MIN"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Safe minimum, such that {@code 1 / SAFE_MIN} does not overflow.\n     * \u003cbr/\u003e\n     * In IEEE 754 arithmetic, this is also the smallest normalized\n     * number 2\u003csup\u003e-1022\u003c/sup\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EXPONENT_OFFSET"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Exponent offset in IEEE754 representation. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK_FLOAT"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.util.Precision.Precision()",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.compareTo(double, double, double)",
      "begin_line": 88,
      "end_line": 95,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     *\n     * @param x the first number\n     * @param y the second number\n     * @param eps the amount of error to allow when checking for equality\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, double) equals(x, y, eps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.compareTo(double, double, int)",
      "begin_line": 114,
      "end_line": 121,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, int) equals(x, y, maxUlps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(float, float)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(float,float,int) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(float, float)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(float,float) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(float, float, float)",
      "begin_line": 158,
      "end_line": 160,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(float, float, float)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(float, float, int)",
      "begin_line": 195,
      "end_line": 210,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are fewer than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 43)",
        "(line 197,col 9)-(line 197,col 43)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 69)",
        "(line 209,col 9)-(line 209,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(float, float, int)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(float,float,int) equals(x, y, maxUlps)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(double, double)",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(double,double,int) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(double, double)",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(double,double) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(double, double, double)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Returns {@code true} if there is no double value strictly between the\n     * arguments or the difference between them is within the range of allowed\n     * error (inclusive).\n     *\n     * @param x First value.\n     * @param y Second value.\n     * @param eps Amount of allowed absolute error.\n     * @return {@code true} if the values are two adjacent floating point\n     * numbers or they are within range of each other.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(double, double, double)",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equals(double, double, int)",
      "begin_line": 300,
      "end_line": 315,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are fewer than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 47)",
        "(line 302,col 9)-(line 302,col 47)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 312,col 69)",
        "(line 314,col 9)-(line 314,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.equalsIncludingNaN(double, double, int)",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(double,double,int) equals(x, y, maxUlps)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.round(double, int)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.round(double, int, int)",
      "begin_line": 363,
      "end_line": 376,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the given method which is any method defined\n     * in {@link BigDecimal}.\n     * If {@code x} is infinite or {@code NaN}, then the value of {@code x} is\n     * returned unchanged, regardless of the other parameters.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @param roundingMethod Rounding method as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @throws ArithmeticException if {@code roundingMethod \u003d\u003d ROUND_UNNECESSARY}\n     * and the specified scaling operation would require rounding.\n     * @throws IllegalArgumentException if {@code roundingMethod} does not\n     * represent a valid rounding mode.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.round(float, int)",
      "begin_line": 387,
      "end_line": 389,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.round(float, int, int)",
      "begin_line": 402,
      "end_line": 406,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the given method which is any method defined\n     * in {@link BigDecimal}.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @param roundingMethod Rounding method as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 52)",
        "(line 404,col 9)-(line 404,col 71)",
        "(line 405,col 9)-(line 405,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.roundUnscaled(double, double, int)",
      "begin_line": 420,
      "end_line": 499,
      "comment": "\n     * Rounds the given non-negative value to the \"nearest\" integer. Nearest is\n     * determined by the rounding method specified. Rounding methods are defined\n     * in {@link BigDecimal}.\n     *\n     * @param unscaled Value to round.\n     * @param sign Sign of the original, scaled value.\n     * @param roundingMethod Rounding method, as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @throws MathIllegalArgumentException if {@code roundingMethod} is not a valid rounding method.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.Precision.representableDelta(double, double)",
      "begin_line": 516,
      "end_line": 519,
      "comment": "\n     * Computes a number {@code delta} close to {@code originalDelta} with\n     * the property that \u003cpre\u003e\u003ccode\u003e\n     *   x + delta - x\n     * \u003c/code\u003e\u003c/pre\u003e\n     * is exactly machine-representable.\n     * This is useful when computing numerical derivatives, in order to reduce\n     * roundoff errors.\n     *\n     * @param x Value.\n     * @param originalDelta Offset value.\n     * @return a number {@code delta} so that {@code x + delta} and {@code x}\n     * differ by a representable floating number.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 37)"
      ]
    }
  ]
}