{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/complex/Complex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Complex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.FieldElement\u003corg.apache.commons.math.complex.Complex\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 50,
      "end_line": 1170,
      "comment": "\n * Representation of a Complex number, i.e. a number which has both a\n * real and imaginary part.\n * Implementations of arithmetic operations handle {@code NaN} and\n * infinite values according to the rules for {@link java.lang.Double}\n * arithmetic, applying definitional formulas and returning {@code NaN} or\n * infinite values in real or imaginary parts as these arise in computation.\n * See individual method javadocs for details.\n * \u003cbr/\u003e\n * {@link #equals} identifies all values with {@code NaN} in either real\n * or imaginary part, e.g.\n * \u003cpre\u003e\n *  {@code 1 + NaNi  \u003d\u003d NaN + i \u003d\u003d NaN + NaNi.}\n * \u003c/pre\u003e\n *\n * Implements Serializable since 2.0\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "I"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The square root of -1. A number representing \"0.0 + 1.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "NaN"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " A complex number representing \"NaN + NaNi\" "
    },
    {
      "type": "field",
      "varNames": [
        "INF"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " A complex number representing \"+INF + INFi\" "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " A complex number representing \"1.0 + 0.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " A complex number representing \"0.0 + 0.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "imaginary"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " The imaginary part. "
    },
    {
      "type": "field",
      "varNames": [
        "real"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The real part. "
    },
    {
      "type": "field",
      "varNames": [
        "isNaN"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Record whether this complex number is equal to NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "isInfinite"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Record whether this complex number is infinite. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.Complex.Complex(double)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Create a complex number given only the real part.\n     *\n     * @param real Real part.\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.Complex.Complex(double, double)",
      "begin_line": 91,
      "end_line": 98,
      "comment": "\n     * Create a complex number given the real and imaginary parts.\n     *\n     * @param real Real part.\n     * @param imaginary Imaginary part.\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 25)",
        "(line 93,col 9)-(line 93,col 35)",
        "(line 95,col 9)-(line 95,col 62)",
        "(line 96,col 9)-(line 97,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.abs()",
      "begin_line": 108,
      "end_line": 128,
      "comment": "\n     * Return the absolute value of this complex number.\n     * Returns {@code NaN} if either real or imaginary part is {@code NaN}\n     * and {@code Double.POSITIVE_INFINITY} if neither part is {@code NaN},\n     * but at least one part is infinite.\n     *\n     * @return the absolute value.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 115,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.add(org.apache.commons.math.complex.Complex)",
      "begin_line": 149,
      "end_line": 157,
      "comment": "\n     * Returns a {@code Complex} whose value is\n     * {@code (this + addend)}.\n     * Uses the definitional formula\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   (a + bi) + (c + di) \u003d (a+c) + (b+d)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * \u003cbr/\u003e\n     * If either {@code this} or {@code addend} has a {@code NaN} value in\n     * either part, {@link #NaN} is returned; otherwise {@code Infinite}\n     * and {@code NaN} values are returned in the parts of the result\n     * according to the rules for {@link java.lang.Double} arithmetic.\n     *\n     * @param  addend Value to be added to this {@code Complex}.\n     * @return {@code this + addend}.\n     * @throws NullArgumentException if {@code addend} is {@code null}.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 39)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 156,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.add(double)",
      "begin_line": 167,
      "end_line": 173,
      "comment": "\n     * Returns a {@code Complex} whose value is {@code (this + addend)},\n     * with {@code addend} interpreted as a real number.\n     *\n     * @param addend Value to be added to this {@code Complex}.\n     * @return {@code this + addend}.\n     * @see #add(Complex)\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.conjugate()",
      "begin_line": 189,
      "end_line": 195,
      "comment": "\n     * Return the conjugate of this complex number.\n     * The conjugate of {@code a + bi} is {@code a - bi}.\n     * \u003cbr/\u003e\n     * {@link #NaN} is returned if either the real or imaginary\n     * part of this Complex number equals {@code Double.NaN}.\n     * \u003cbr/\u003e\n     * If the imaginary part is infinite, and the real part is not\n     * {@code NaN}, the returned value has infinite imaginary part\n     * of the opposite sign, e.g. the conjugate of\n     * {@code 1 + POSITIVE_INFINITY i} is {@code 1 - NEGATIVE_INFINITY i}.\n     *\n     * @return the conjugate of this Complex object.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.divide(org.apache.commons.math.complex.Complex)",
      "begin_line": 239,
      "end_line": 267,
      "comment": "\n     * Returns a {@code Complex} whose value is\n     * {@code (this / divisor)}.\n     * Implements the definitional formula\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *    a + bi          ac + bd + (bc - ad)i\n     *    ----------- \u003d -------------------------\n     *    c + di         c\u003csup\u003e2\u003c/sup\u003e + d\u003csup\u003e2\u003c/sup\u003e\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * but uses\n     * \u003ca href\u003d\"http://doi.acm.org/10.1145/1039813.1039814\"\u003e\n     * prescaling of operands\u003c/a\u003e to limit the effects of overflows and\n     * underflows in the computation.\n     * \u003cbr/\u003e\n     * {@code Infinite} and {@code NaN} values are handled according to the\n     * following rules, applied in the order presented:\n     * \u003cul\u003e\n     *  \u003cli\u003eIf either {@code this} or {@code divisor} has a {@code NaN} value\n     *   in either part, {@link #NaN} is returned.\n     *  \u003c/li\u003e\n     *  \u003cli\u003eIf {@code divisor} equals {@link #ZERO}, {@link #NaN} is returned.\n     *  \u003c/li\u003e\n     *  \u003cli\u003eIf {@code this} and {@code divisor} are both infinite,\n     *   {@link #NaN} is returned.\n     *  \u003c/li\u003e\n     *  \u003cli\u003eIf {@code this} is finite (i.e., has no {@code Infinite} or\n     *   {@code NaN} parts) and {@code divisor} is infinite (one or both parts\n     *   infinite), {@link #ZERO} is returned.\n     *  \u003c/li\u003e\n     *  \u003cli\u003eIf {@code this} is infinite and {@code divisor} is finite,\n     *   {@code NaN} values are returned in the parts of the result if the\n     *   {@link java.lang.Double} rules applied to the definitional formula\n     *   force {@code NaN} results.\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param divisor Value by which this {@code Complex} is to be divided.\n     * @return {@code this / divisor}.\n     * @throws NullArgumentException if {@code divisor} is {@code null}.\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 40)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 43)",
        "(line 247,col 9)-(line 247,col 48)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.divide(double)",
      "begin_line": 277,
      "end_line": 289,
      "comment": "\n     * Returns a {@code Complex} whose value is {@code (this / divisor)},\n     * with {@code divisor} interpreted as a real number.\n     *\n     * @param  divisor Value by which this {@code Complex} is to be divided.\n     * @return {@code this / divisor}.\n     * @see #divide(Complex)\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 288,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.equals(java.lang.Object)",
      "begin_line": 306,
      "end_line": 320,
      "comment": "\n     * Test for the equality of two Complex objects.\n     * If both the real and imaginary parts of two complex numbers\n     * are exactly the same, and neither is {@code Double.NaN}, the two\n     * Complex objects are considered to be equal.\n     * All {@code NaN} values are considered to be equal - i.e, if either\n     * (or both) real and imaginary parts of the complex number are equal\n     * to {@code Double.NaN}, the complex number is equal to\n     * {@code NaN}.\n     *\n     * @param other Object to test for equality to this\n     * @return true if two Complex objects are equal, false if object is\n     * {@code null}, not an instance of Complex, or not equal to this Complex\n     * instance.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 318,col 9)",
        "(line 319,col 9)-(line 319,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.hashCode()",
      "begin_line": 329,
      "end_line": 336,
      "comment": "\n     * Get a hashCode for the complex number.\n     * Any {@code Double.NaN} value in real or imaginary part produces\n     * the same hash code {@code 7}.\n     *\n     * @return a hash code value for this object.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 335,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getImaginary()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Access the imaginary part.\n     *\n     * @return the imaginary part.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getReal()",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * Access the real part.\n     *\n     * @return the real part.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.isNaN()",
      "begin_line": 363,
      "end_line": 365,
      "comment": "\n     * Checks whether either or both parts of this complex number is\n     * {@code NaN}.\n     *\n     * @return true if either or both parts of this complex number is\n     * {@code NaN}; false otherwise.\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.isInfinite()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * Checks whether either the real or imaginary part of this complex number\n     * takes an infinite value (either {@code Double.POSITIVE_INFINITY} or\n     * {@code Double.NEGATIVE_INFINITY}) and neither part\n     * is {@code NaN}.\n     *\n     * @return true if one or both parts of this complex number are infinite\n     * and neither part is {@code NaN}.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.multiply(org.apache.commons.math.complex.Complex)",
      "begin_line": 404,
      "end_line": 419,
      "comment": "\n     * Returns a {@code Complex} whose value is {@code this * factor}.\n     * Implements preliminary checks for {@code NaN} and infinity followed by\n     * the definitional formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   (a + bi)(c + di) \u003d (ac - bd) + (ad + bc)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * Returns {@link #NaN} if either {@code this} or {@code factor} has one or\n     * more {@code NaN} parts.\n     * \u003cbr/\u003e\n     * Returns {@link #INF} if neither {@code this} nor {@code factor} has one\n     * or more {@code NaN} parts and if either {@code this} or {@code factor}\n     * has one or more infinite parts (same result is returned regardless of\n     * the sign of the components).\n     * \u003cbr/\u003e\n     * Returns finite values in components of the result per the definitional\n     * formula in all remaining cases.\n     *\n     * @param  factor value to be multiplied by this {@code Complex}.\n     * @return {@code this * factor}.\n     * @throws NullArgumentException if {@code factor} is {@code null}.\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 39)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 418,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.multiply(double)",
      "begin_line": 429,
      "end_line": 440,
      "comment": "\n     * Returns a {@code Complex} whose value is {@code this * factor}, with {@code factor}\n     * interpreted as a real number.\n     *\n     * @param  factor value to be multiplied by this {@code Complex}.\n     * @return {@code this * factor}.\n     * @see #multiply(Complex)\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.negate()",
      "begin_line": 449,
      "end_line": 455,
      "comment": "\n     * Returns a {@code Complex} whose value is {@code (-this)}.\n     * Returns {@code NaN} if either real or imaginary\n     * part of this Complex number equals {@code Double.NaN}.\n     *\n     * @return {@code -this}.\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 454,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.subtract(org.apache.commons.math.complex.Complex)",
      "begin_line": 475,
      "end_line": 484,
      "comment": "\n     * Returns a {@code Complex} whose value is\n     * {@code (this - subtrahend)}.\n     * Uses the definitional formula\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   (a + bi) - (c + di) \u003d (a-c) + (b-d)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * If either {@code this} or {@code subtrahend} has a {@code NaN]} value in either part,\n     * {@link #NaN} is returned; otherwise infinite and {@code NaN} values are\n     * returned in the parts of the result according to the rules for\n     * {@link java.lang.Double} arithmetic.\n     *\n     * @param  subtrahend value to be subtracted from this {@code Complex}.\n     * @return {@code this - subtrahend}.\n     * @throws NullArgumentException if {@code subtrahend} is {@code null}.\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 43)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 483,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.subtract(double)",
      "begin_line": 494,
      "end_line": 499,
      "comment": "\n     * Returns a {@code Complex} whose value is\n     * {@code (this - subtrahend)}.\n     *\n     * @param  subtrahend value to be subtracted from this {@code Complex}.\n     * @return {@code this - subtrahend}.\n     * @see #subtract(Complex)\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.acos()",
      "begin_line": 517,
      "end_line": 524,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseCosine.html\" TARGET\u003d\"_top\"\u003e\n     * inverse cosine\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   acos(z) \u003d -i (log(z + i (sqrt(1 - z\u003csup\u003e2\u003c/sup\u003e))))\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN} or infinite.\n     *\n     * @return the inverse cosine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 520,col 9)",
        "(line 522,col 9)-(line 523,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.asin()",
      "begin_line": 542,
      "end_line": 549,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseSine.html\" TARGET\u003d\"_top\"\u003e\n     * inverse sine\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   asin(z) \u003d -i (log(sqrt(1 - z\u003csup\u003e2\u003c/sup\u003e) + iz))\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN} or infinite.\n     *\n     * @return the inverse sine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 545,col 9)",
        "(line 547,col 9)-(line 548,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.atan()",
      "begin_line": 567,
      "end_line": 574,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseTangent.html\" TARGET\u003d\"_top\"\u003e\n     * inverse tangent\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   atan(z) \u003d (i/2) log((i + z)/(i - z))\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN} or infinite.\n     *\n     * @return the inverse tangent of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 570,col 9)",
        "(line 572,col 9)-(line 573,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.cos()",
      "begin_line": 608,
      "end_line": 615,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Cosine.html\" TARGET\u003d\"_top\"\u003e\n     * cosine\u003c/a\u003e\n     * of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   cos(a + bi) \u003d cos(a)cosh(b) - sin(a)sinh(b)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},\n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   cos(1 \u0026plusmn; INFINITY i) \u003d 1 \u0026#x2213; INFINITY i\n     *   cos(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     *   cos(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the cosine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 611,col 9)",
        "(line 613,col 9)-(line 614,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.cosh()",
      "begin_line": 648,
      "end_line": 655,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   cosh(a + bi) \u003d cosh(a)cos(b) + sinh(a)sin(b)i}\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},\n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   cosh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *   cosh(\u0026plusmn;INFINITY + i) \u003d INFINITY \u0026plusmn; INFINITY i\n     *   cosh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the hyperbolic cosine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 651,col 9)",
        "(line 653,col 9)-(line 654,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.exp()",
      "begin_line": 689,
      "end_line": 697,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialFunction.html\" TARGET\u003d\"_top\"\u003e\n     * exponential function\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   exp(a + bi) \u003d exp(a)cos(b) + exp(a)sin(b)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#exp}, {@link java.lang.Math#cos}, and\n     * {@link java.lang.Math#sin}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   exp(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *   exp(INFINITY + i) \u003d INFINITY + INFINITY i\n     *   exp(-INFINITY + i) \u003d 0 + 0i\n     *   exp(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return \u003ccode\u003e\u003ci\u003ee\u003c/i\u003e\u003csup\u003ethis\u003c/sup\u003e\u003c/code\u003e.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 692,col 9)",
        "(line 694,col 9)-(line 694,col 44)",
        "(line 695,col 9)-(line 696,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.log()",
      "begin_line": 734,
      "end_line": 741,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NaturalLogarithm.html\" TARGET\u003d\"_top\"\u003e\n     * natural logarithm\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   log(a + bi) \u003d ln(|a + bi|) + arg(a + bi)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where ln on the right hand side is {@link java.lang.Math#log},\n     * {@code |a + bi|} is the modulus, {@link Complex#abs},  and\n     * {@code arg(a + bi) \u003d }{@link java.lang.Math#atan2}(b, a).\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite (or critical) values in real or imaginary parts of the input may\n     * result in infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   log(1 \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (\u0026pi;/2)i\n     *   log(INFINITY + i) \u003d INFINITY + 0i\n     *   log(-INFINITY + i) \u003d INFINITY + \u0026pi;i\n     *   log(INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (\u0026pi;/4)i\n     *   log(-INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (3\u0026pi;/4)i\n     *   log(0 + 0i) \u003d -INFINITY + 0i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the value \u003ccode\u003eln \u0026nbsp; this\u003c/code\u003e, the natural logarithm\n     * of {@code this}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 737,col 9)",
        "(line 739,col 9)-(line 740,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.pow(org.apache.commons.math.complex.Complex)",
      "begin_line": 763,
      "end_line": 767,
      "comment": "\n     * Returns of value of this complex number raised to the power of {@code x}.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   y\u003csup\u003ex\u003c/sup\u003e \u003d exp(x\u0026middot;log(y))\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where {@code exp} and {@code log} are {@link #exp} and\n     * {@link #log}, respectively.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN} or infinite, or if {@code y}\n     * equals {@link Complex#ZERO}.\n     *\n     * @param  x exponent to which this {@code Complex} is to be raised.\n     * @return \u003ccode\u003e this\u003csup\u003e{@code x}\u003c/sup\u003e\u003c/code\u003e.\n     * @throws NullArgumentException if x is {@code null}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 34)",
        "(line 766,col 9)-(line 766,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.pow(double)",
      "begin_line": 776,
      "end_line": 778,
      "comment": "\n     * Returns of value of this complex number raised to the power of {@code x}.\n     *\n     * @param  x exponent to which this {@code Complex} is to be raised.\n     * @return \u003ccode\u003ethis\u003csup\u003ex\u003c/sup\u003e\u003c/code\u003e.\n     * @see #pow(Complex)\n     ",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sin()",
      "begin_line": 812,
      "end_line": 819,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Sine.html\" TARGET\u003d\"_top\"\u003e\n     * sine\u003c/a\u003e\n     * of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   sin(a + bi) \u003d sin(a)cosh(b) - cos(a)sinh(b)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},\n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or {@code NaN} values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   sin(1 \u0026plusmn; INFINITY i) \u003d 1 \u0026plusmn; INFINITY i\n     *   sin(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     *   sin(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the sine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 815,col 9)",
        "(line 817,col 9)-(line 818,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sinh()",
      "begin_line": 852,
      "end_line": 859,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic sine\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   sinh(a + bi) \u003d sinh(a)cos(b)) + cosh(a)sin(b)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},\n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   sinh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *   sinh(\u0026plusmn;INFINITY + i) \u003d \u0026plusmn; INFINITY + INFINITY i\n     *   sinh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the hyperbolic sine of {@code this}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 853,col 9)-(line 855,col 9)",
        "(line 857,col 9)-(line 858,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sqrt()",
      "begin_line": 895,
      "end_line": 911,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/SquareRoot.html\" TARGET\u003d\"_top\"\u003e\n     * square root\u003c/a\u003e of this complex number.\n     * Implements the following algorithm to compute {@code sqrt(a + bi)}:\n     * \u003col\u003e\u003cli\u003eLet {@code t \u003d sqrt((|a| + |a + bi|) / 2)}\u003c/li\u003e\n     * \u003cli\u003e\u003cpre\u003eif {@code  a \u0026#8805; 0} return {@code t + (b/2t)i}\n     *  else return {@code |b|/2t + sign(b)t i }\u003c/pre\u003e\u003c/li\u003e\n     * \u003c/ol\u003e\n     * where \u003cul\u003e\n     * \u003cli\u003e{@code |a| \u003d }{@link Math#abs}(a)\u003c/li\u003e\n     * \u003cli\u003e{@code |a + bi| \u003d }{@link Complex#abs}(a + bi)\u003c/li\u003e\n     * \u003cli\u003e{@code sign(b) \u003d  }{@link MathUtils#indicator}(b)\n     * \u003c/ul\u003e\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   sqrt(1 \u0026plusmn; INFINITY i) \u003d INFINITY + NaN i\n     *   sqrt(INFINITY + i) \u003d INFINITY + 0i\n     *   sqrt(-INFINITY + i) \u003d 0 + INFINITY i\n     *   sqrt(INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY + NaN i\n     *   sqrt(-INFINITY \u0026plusmn; INFINITY i) \u003d NaN \u0026plusmn; INFINITY i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the square root of {@code this}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 898,col 9)",
        "(line 900,col 9)-(line 902,col 9)",
        "(line 904,col 9)-(line 904,col 69)",
        "(line 905,col 9)-(line 910,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sqrt1z()",
      "begin_line": 930,
      "end_line": 932,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/SquareRoot.html\" TARGET\u003d\"_top\"\u003e\n     * square root\u003c/a\u003e of \u003ccode\u003e1 - this\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e for this complex\n     * number.\n     * Computes the result directly as\n     * {@code sqrt(ONE.subtract(z.multiply(z)))}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     *\n     * @return the square root of \u003ccode\u003e1 - this\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 931,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.tan()",
      "begin_line": 966,
      "end_line": 977,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Tangent.html\" TARGET\u003d\"_top\"\u003e\n     * tangent\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   tan(a + bi) \u003d sin(2a)/(cos(2a)+cosh(2b)) + [sinh(2b)/(cos(2a)+cosh(2b))]i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},\n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite (or critical) values in real or imaginary parts of the input may\n     * result in infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   tan(1 \u0026plusmn; INFINITY i) \u003d 0 + NaN i\n     *   tan(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     *   tan(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *   tan(\u0026plusmn;\u0026pi;/2 + 0 i) \u003d \u0026plusmn;INFINITY + NaN i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the tangent of {@code this}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 967,col 9)-(line 969,col 9)",
        "(line 971,col 9)-(line 971,col 34)",
        "(line 972,col 9)-(line 972,col 44)",
        "(line 973,col 9)-(line 973,col 68)",
        "(line 975,col 9)-(line 976,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.tanh()",
      "begin_line": 1011,
      "end_line": 1022,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicTangent.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic tangent\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   tan(a + bi) \u003d sinh(2a)/(cosh(2a)+cos(2b)) + [sin(2b)/(cosh(2a)+cos(2b))]i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},\n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   tanh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *   tanh(\u0026plusmn;INFINITY + i) \u003d NaN + 0 i\n     *   tanh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *   tanh(0 + (\u0026pi;/2)i) \u003d NaN + INFINITY i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the hyperbolic tangent of {@code this}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1012,col 9)-(line 1014,col 9)",
        "(line 1016,col 9)-(line 1016,col 34)",
        "(line 1017,col 9)-(line 1017,col 44)",
        "(line 1018,col 9)-(line 1018,col 68)",
        "(line 1020,col 9)-(line 1021,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getArgument()",
      "begin_line": 1043,
      "end_line": 1045,
      "comment": "\n     * Compute the argument of this complex number.\n     * The argument is the angle phi between the positive real axis and\n     * the point representing this number in the complex plane.\n     * The value returned is between -PI (not inclusive)\n     * and PI (inclusive), with negative values returned for numbers with\n     * negative imaginary parts.\n     * \u003cbr/\u003e\n     * If either real or imaginary part (or both) is NaN, NaN is returned.\n     * Infinite parts are handled as {@code Math.atan2} handles them,\n     * essentially treating finite parts as zero in the presence of an\n     * infinite coordinate and returning a multiple of pi/4 depending on\n     * the signs of the infinite parts.\n     * See the javadoc for {@code Math.atan2} for full details.\n     *\n     * @return the argument of {@code this}.\n     ",
      "child_ranges": [
        "(line 1044,col 9)-(line 1044,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.nthRoot(int)",
      "begin_line": 1069,
      "end_line": 1103,
      "comment": "\n     * Computes the n-th roots of this complex number.\n     * The nth roots are defined by the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   z\u003csub\u003ek\u003c/sub\u003e \u003d abs\u003csup\u003e1/n\u003c/sup\u003e (cos(phi + 2\u0026pi;k/n) + i (sin(phi + 2\u0026pi;k/n))\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * for \u003ci\u003e{@code k\u003d0, 1, ..., n-1}\u003c/i\u003e, where {@code abs} and {@code phi}\n     * are respectively the {@link #abs() modulus} and\n     * {@link #getArgument() argument} of this complex number.\n     * \u003cbr/\u003e\n     * If one or both parts of this complex number is NaN, a list with just\n     * one element, {@link #NaN} is returned.\n     * if neither part is NaN, but at least one part is infinite, the result\n     * is a one-element list containing {@link #INF}.\n     *\n     * @param n Degree of root.\n     * @return a List\u003cComplex\u003e of all {@code n}-th roots of {@code this}.\n     * @throws NotPositiveException if {@code n \u003c\u003d 0}.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1071,col 9)-(line 1074,col 9)",
        "(line 1076,col 9)-(line 1076,col 62)",
        "(line 1078,col 9)-(line 1081,col 9)",
        "(line 1082,col 9)-(line 1085,col 9)",
        "(line 1088,col 9)-(line 1088,col 65)",
        "(line 1091,col 9)-(line 1091,col 48)",
        "(line 1092,col 9)-(line 1092,col 49)",
        "(line 1093,col 9)-(line 1093,col 34)",
        "(line 1094,col 9)-(line 1100,col 9)",
        "(line 1102,col 9)-(line 1102,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.createComplex(double, double)",
      "begin_line": 1114,
      "end_line": 1117,
      "comment": "\n     * Create a complex number given the real and imaginary parts.\n     *\n     * @param realPart Real part.\n     * @param imaginaryPart Imaginary part.\n     * @return a new complex number instance.\n     * @since 1.2\n     * @see #valueOf(double, double)\n     ",
      "child_ranges": [
        "(line 1116,col 9)-(line 1116,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.valueOf(double, double)",
      "begin_line": 1126,
      "end_line": 1133,
      "comment": "\n     * Create a complex number given the real and imaginary parts.\n     *\n     * @param realPart Real part.\n     * @param imaginaryPart Imaginary part.\n     * @return a Complex instance.\n     ",
      "child_ranges": [
        "(line 1128,col 9)-(line 1131,col 9)",
        "(line 1132,col 9)-(line 1132,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.valueOf(double)",
      "begin_line": 1141,
      "end_line": 1146,
      "comment": "\n     * Create a complex number given only the real part.\n     *\n     * @param realPart Real part.\n     * @return a Complex instance.\n     ",
      "child_ranges": [
        "(line 1142,col 9)-(line 1144,col 9)",
        "(line 1145,col 9)-(line 1145,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.readResolve()",
      "begin_line": 1156,
      "end_line": 1158,
      "comment": "\n     * Resolve the transient fields in a deserialized Complex Object.\n     * Subclasses will need to override {@link #createComplex} to\n     * deserialize properly.\n     *\n     * @return A Complex instance with all fields resolved.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1157,col 9)-(line 1157,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getField()",
      "begin_line": 1161,
      "end_line": 1163,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1162,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.toString()",
      "begin_line": 1166,
      "end_line": 1169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1168,col 9)-(line 1168,col 51)"
      ]
    }
  ]
}