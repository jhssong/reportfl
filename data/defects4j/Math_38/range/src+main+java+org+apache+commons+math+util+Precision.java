{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/util/Precision.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Precision",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 496,
      "comment": "\n * Utilities for comparing numbers.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPSILON"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Smallest positive number such that {@code 1 - EPSILON} is not\n     * numerically equal to 1: {@value}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SAFE_MIN"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Safe minimum, such that {@code 1 / SAFE_MIN} does not overflow.\n     * In IEEE 754 arithmetic, this is also the smallest normalized\n     * number 2\u003csup\u003e-1022\u003c/sup\u003e: {@value}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "field",
      "varNames": [
        "SGN_MASK_FLOAT"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Offset to order signed double numbers lexicographically. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.Precision.Precision()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Private constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.compareTo(double, double, double)",
      "begin_line": 64,
      "end_line": 71,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     *\n     * @param x the first number\n     * @param y the second number\n     * @param eps the amount of error to allow when checking for equality\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, double) equals(x, y, eps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, double) equals(x, y, eps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.compareTo(double, double, int)",
      "begin_line": 90,
      "end_line": 97,
      "comment": "\n     * Compares two numbers given some amount of allowed error.\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return \u003cul\u003e\u003cli\u003e0 if  {@link #equals(double, double, int) equals(x, y, maxUlps)}\u003c/li\u003e\n     *       \u003cli\u003e\u0026lt; 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} \u0026amp;\u0026amp; x \u0026lt; y\u003c/li\u003e\n     *       \u003cli\u003e\u003e 0 if !{@link #equals(double, double, int) equals(x, y, maxUlps)} \u0026amp;\u0026amp; x \u003e y\u003c/li\u003e\u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.equals(float, float)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(float,float,int) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.equalsIncludingNaN(float, float)",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(float,float) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.equals(float, float, float)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.equalsIncludingNaN(float, float, float)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.equals(float, float, int)",
      "begin_line": 171,
      "end_line": 186,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are fewer than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 43)",
        "(line 173,col 9)-(line 173,col 43)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 69)",
        "(line 185,col 9)-(line 185,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.equalsIncludingNaN(float, float, int)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(float,float,int) equals(x, y, maxUlps)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.equals(double, double)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * Returns true iff they are equal as defined by\n     * {@link #equals(double,double,int) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.equalsIncludingNaN(double, double)",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * Returns true if both arguments are NaN or neither is NaN and they are\n     * equal as defined by {@link #equals(double,double) equals(x, y, 1)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @return {@code true} if the values are equal or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.equals(double, double, double)",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * Returns {@code true} if there is no double value strictly between the\n     * arguments or the difference between them is within the range of allowed\n     * error (inclusive).\n     *\n     * @param x First value.\n     * @param y Second value.\n     * @param eps Amount of allowed absolute error.\n     * @return {@code true} if the values are two adjacent floating point\n     * numbers or they are within range of each other.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.equalsIncludingNaN(double, double, double)",
      "begin_line": 255,
      "end_line": 257,
      "comment": "\n     * Returns true if both arguments are NaN or are equal or within the range\n     * of allowed error (inclusive).\n     *\n     * @param x first value\n     * @param y second value\n     * @param eps the amount of absolute error to allow.\n     * @return {@code true} if the values are equal or within range of each other,\n     * or both are NaN.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.equals(double, double, int)",
      "begin_line": 276,
      "end_line": 291,
      "comment": "\n     * Returns true if both arguments are equal or within the range of allowed\n     * error (inclusive).\n     * Two float numbers are considered equal if there are {@code (maxUlps - 1)}\n     * (or fewer) floating point numbers between them, i.e. two adjacent floating\n     * point numbers are considered equal.\n     * Adapted from \u003ca\n     * href\u003d\"http://www.cygnus-software.com/papers/comparingfloats/comparingfloats.htm\"\u003e\n     * Bruce Dawson\u003c/a\u003e\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if there are fewer than {@code maxUlps} floating\n     * point values between {@code x} and {@code y}.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 47)",
        "(line 278,col 9)-(line 278,col 47)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 69)",
        "(line 290,col 9)-(line 290,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.equalsIncludingNaN(double, double, int)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * Returns true if both arguments are NaN or if they are equal as defined\n     * by {@link #equals(double,double,int) equals(x, y, maxUlps)}.\n     *\n     * @param x first value\n     * @param y second value\n     * @param maxUlps {@code (maxUlps - 1)} is the number of floating point\n     * values between {@code x} and {@code y}.\n     * @return {@code true} if both arguments are NaN or if there are less than\n     * {@code maxUlps} floating point values between {@code x} and {@code y}.\n     * @since 2.2\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.round(double, int)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.round(double, int, int)",
      "begin_line": 339,
      "end_line": 352,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the given method which is any method defined\n     * in {@link BigDecimal}.\n     * If {@code x} is infinite or {@code NaN}, then the value of {@code x} is\n     * returned unchanged, regardless of the other parameters.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @param roundingMethod Rounding method as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @throws ArithmeticException if {@code roundingMethod \u003d\u003d ROUND_UNNECESSARY}\n     * and the specified scaling operation would require rounding.\n     * @throws IllegalArgumentException if {@code roundingMethod} does not\n     * represent a valid rounding mode.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.round(float, int)",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the {@link BigDecimal#ROUND_HALF_UP} method.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @return the rounded value.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.round(float, int, int)",
      "begin_line": 378,
      "end_line": 382,
      "comment": "\n     * Rounds the given value to the specified number of decimal places.\n     * The value is rounded using the given method which is any method defined\n     * in {@link BigDecimal}.\n     *\n     * @param x Value to round.\n     * @param scale Number of digits to the right of the decimal point.\n     * @param roundingMethod Rounding method as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 52)",
        "(line 380,col 9)-(line 380,col 71)",
        "(line 381,col 9)-(line 381,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.roundUnscaled(double, double, int)",
      "begin_line": 396,
      "end_line": 475,
      "comment": "\n     * Rounds the given non-negative value to the \"nearest\" integer. Nearest is\n     * determined by the rounding method specified. Rounding methods are defined\n     * in {@link BigDecimal}.\n     *\n     * @param unscaled Value to round.\n     * @param sign Sign of the original, scaled value.\n     * @param roundingMethod Rounding method, as defined in {@link BigDecimal}.\n     * @return the rounded value.\n     * @throws MathIllegalArgumentException if {@code roundingMethod} is not a valid rounding method.\n     * @since 1.1 (previously in {@code MathUtils}, moved as of version 3.0)\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.Precision.representableDelta(double, double)",
      "begin_line": 492,
      "end_line": 495,
      "comment": "\n     * Computes a number {@code delta} close to {@code originalDelta} with\n     * the property that \u003cpre\u003e\u003ccode\u003e\n     *   x + delta - x\n     * \u003c/code\u003e\u003c/pre\u003e\n     * is exactly machine-representable.\n     * This is useful when computing numerical derivatives, in order to reduce\n     * roundoff errors.\n     *\n     * @param x Value.\n     * @param originalDelta Offset value.\n     * @return a number {@code delta} so that {@code x + delta} and {@code x}\n     * differ by a representable floating number.\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 37)"
      ]
    }
  ]
}