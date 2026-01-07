{
  "filepath": "/tmp/Math-49b/src/main/java/org/apache/commons/math/complex/Complex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Complex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.FieldElement\u003corg.apache.commons.math.complex.Complex\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 1176,
      "comment": "\n * Representation of a Complex number, i.e. a number which has both a\n * real and imaginary part.\n * \u003cbr/\u003e\n * Implementations of arithmetic operations handle {@code NaN} and\n * infinite values according to the rules for {@link java.lang.Double}, i.e.\n * {@link #equals} is an equivalence relation for all instances that have\n * a {@code NaN} in either real or imaginary part, e.g. the following are\n * considered equal:\n * \u003cul\u003e\n *  \u003cli\u003e{@code 1 + NaNi}\u003c/li\u003e\n *  \u003cli\u003e{@code NaN + i}\u003c/li\u003e\n *  \u003cli\u003e{@code NaN + NaNi}\u003c/li\u003e\n * \u003c/ul\u003e\n * Note that this is in contradiction with the IEEE-754 standard for floating\n * point numbers (according to which the test {@code x \u003d\u003d x} must fail if\n * {@code x} is {@code NaN}). The method\n * {@link MathUtils#equals(double,double,int) equals for primitive double} in\n * {@link MathUtils} conforms with IEEE-754 while this class conforms with\n * the standard behavior for Java object types.\n * \u003cbr/\u003e\n * Implements Serializable since 2.0\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "I"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The square root of -1. A number representing \"0.0 + 1.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "NaN"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " A complex number representing \"NaN + NaNi\" "
    },
    {
      "type": "field",
      "varNames": [
        "INF"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " A complex number representing \"+INF + INFi\" "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " A complex number representing \"1.0 + 0.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " A complex number representing \"0.0 + 0.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "imaginary"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " The imaginary part. "
    },
    {
      "type": "field",
      "varNames": [
        "real"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " The real part. "
    },
    {
      "type": "field",
      "varNames": [
        "isNaN"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Record whether this complex number is equal to NaN. "
    },
    {
      "type": "field",
      "varNames": [
        "isInfinite"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Record whether this complex number is infinite. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.Complex.Complex(double)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Create a complex number given only the real part.\n     *\n     * @param real Real part.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.Complex.Complex(double, double)",
      "begin_line": 97,
      "end_line": 104,
      "comment": "\n     * Create a complex number given the real and imaginary parts.\n     *\n     * @param real Real part.\n     * @param imaginary Imaginary part.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 25)",
        "(line 99,col 9)-(line 99,col 35)",
        "(line 101,col 9)-(line 101,col 62)",
        "(line 102,col 9)-(line 103,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.abs()",
      "begin_line": 114,
      "end_line": 134,
      "comment": "\n     * Return the absolute value of this complex number.\n     * Returns {@code NaN} if either real or imaginary part is {@code NaN}\n     * and {@code Double.POSITIVE_INFINITY} if neither part is {@code NaN},\n     * but at least one part is infinite.\n     *\n     * @return the absolute value.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.add(org.apache.commons.math.complex.Complex)",
      "begin_line": 155,
      "end_line": 163,
      "comment": "\n     * Returns a {@code Complex} whose value is\n     * {@code (this + addend)}.\n     * Uses the definitional formula\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   (a + bi) + (c + di) \u003d (a+c) + (b+d)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * \u003cbr/\u003e\n     * If either {@code this} or {@code addend} has a {@code NaN} value in\n     * either part, {@link #NaN} is returned; otherwise {@code Infinite}\n     * and {@code NaN} values are returned in the parts of the result\n     * according to the rules for {@link java.lang.Double} arithmetic.\n     *\n     * @param  addend Value to be added to this {@code Complex}.\n     * @return {@code this + addend}.\n     * @throws NullArgumentException if {@code addend} is {@code null}.\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 39)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 162,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.add(double)",
      "begin_line": 173,
      "end_line": 179,
      "comment": "\n     * Returns a {@code Complex} whose value is {@code (this + addend)},\n     * with {@code addend} interpreted as a real number.\n     *\n     * @param addend Value to be added to this {@code Complex}.\n     * @return {@code this + addend}.\n     * @see #add(Complex)\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.conjugate()",
      "begin_line": 195,
      "end_line": 201,
      "comment": "\n     * Return the conjugate of this complex number.\n     * The conjugate of {@code a + bi} is {@code a - bi}.\n     * \u003cbr/\u003e\n     * {@link #NaN} is returned if either the real or imaginary\n     * part of this Complex number equals {@code Double.NaN}.\n     * \u003cbr/\u003e\n     * If the imaginary part is infinite, and the real part is not\n     * {@code NaN}, the returned value has infinite imaginary part\n     * of the opposite sign, e.g. the conjugate of\n     * {@code 1 + POSITIVE_INFINITY i} is {@code 1 - NEGATIVE_INFINITY i}.\n     *\n     * @return the conjugate of this Complex object.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.divide(org.apache.commons.math.complex.Complex)",
      "begin_line": 245,
      "end_line": 273,
      "comment": "\n     * Returns a {@code Complex} whose value is\n     * {@code (this / divisor)}.\n     * Implements the definitional formula\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *    a + bi          ac + bd + (bc - ad)i\n     *    ----------- \u003d -------------------------\n     *    c + di         c\u003csup\u003e2\u003c/sup\u003e + d\u003csup\u003e2\u003c/sup\u003e\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * but uses\n     * \u003ca href\u003d\"http://doi.acm.org/10.1145/1039813.1039814\"\u003e\n     * prescaling of operands\u003c/a\u003e to limit the effects of overflows and\n     * underflows in the computation.\n     * \u003cbr/\u003e\n     * {@code Infinite} and {@code NaN} values are handled according to the\n     * following rules, applied in the order presented:\n     * \u003cul\u003e\n     *  \u003cli\u003eIf either {@code this} or {@code divisor} has a {@code NaN} value\n     *   in either part, {@link #NaN} is returned.\n     *  \u003c/li\u003e\n     *  \u003cli\u003eIf {@code divisor} equals {@link #ZERO}, {@link #NaN} is returned.\n     *  \u003c/li\u003e\n     *  \u003cli\u003eIf {@code this} and {@code divisor} are both infinite,\n     *   {@link #NaN} is returned.\n     *  \u003c/li\u003e\n     *  \u003cli\u003eIf {@code this} is finite (i.e., has no {@code Infinite} or\n     *   {@code NaN} parts) and {@code divisor} is infinite (one or both parts\n     *   infinite), {@link #ZERO} is returned.\n     *  \u003c/li\u003e\n     *  \u003cli\u003eIf {@code this} is infinite and {@code divisor} is finite,\n     *   {@code NaN} values are returned in the parts of the result if the\n     *   {@link java.lang.Double} rules applied to the definitional formula\n     *   force {@code NaN} results.\n     *  \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param divisor Value by which this {@code Complex} is to be divided.\n     * @return {@code this / divisor}.\n     * @throws NullArgumentException if {@code divisor} is {@code null}.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 40)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 43)",
        "(line 253,col 9)-(line 253,col 48)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.divide(double)",
      "begin_line": 283,
      "end_line": 295,
      "comment": "\n     * Returns a {@code Complex} whose value is {@code (this / divisor)},\n     * with {@code divisor} interpreted as a real number.\n     *\n     * @param  divisor Value by which this {@code Complex} is to be divided.\n     * @return {@code this / divisor}.\n     * @see #divide(Complex)\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 294,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.equals(java.lang.Object)",
      "begin_line": 312,
      "end_line": 326,
      "comment": "\n     * Test for the equality of two Complex objects.\n     * If both the real and imaginary parts of two complex numbers\n     * are exactly the same, and neither is {@code Double.NaN}, the two\n     * Complex objects are considered to be equal.\n     * All {@code NaN} values are considered to be equal - i.e, if either\n     * (or both) real and imaginary parts of the complex number are equal\n     * to {@code Double.NaN}, the complex number is equal to\n     * {@code NaN}.\n     *\n     * @param other Object to test for equality to this\n     * @return true if two Complex objects are equal, false if object is\n     * {@code null}, not an instance of Complex, or not equal to this Complex\n     * instance.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.hashCode()",
      "begin_line": 335,
      "end_line": 342,
      "comment": "\n     * Get a hashCode for the complex number.\n     * Any {@code Double.NaN} value in real or imaginary part produces\n     * the same hash code {@code 7}.\n     *\n     * @return a hash code value for this object.\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 341,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getImaginary()",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * Access the imaginary part.\n     *\n     * @return the imaginary part.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getReal()",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\n     * Access the real part.\n     *\n     * @return the real part.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.isNaN()",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\n     * Checks whether either or both parts of this complex number is\n     * {@code NaN}.\n     *\n     * @return true if either or both parts of this complex number is\n     * {@code NaN}; false otherwise.\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.isInfinite()",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * Checks whether either the real or imaginary part of this complex number\n     * takes an infinite value (either {@code Double.POSITIVE_INFINITY} or\n     * {@code Double.NEGATIVE_INFINITY}) and neither part\n     * is {@code NaN}.\n     *\n     * @return true if one or both parts of this complex number are infinite\n     * and neither part is {@code NaN}.\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.multiply(org.apache.commons.math.complex.Complex)",
      "begin_line": 410,
      "end_line": 425,
      "comment": "\n     * Returns a {@code Complex} whose value is {@code this * factor}.\n     * Implements preliminary checks for {@code NaN} and infinity followed by\n     * the definitional formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   (a + bi)(c + di) \u003d (ac - bd) + (ad + bc)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * Returns {@link #NaN} if either {@code this} or {@code factor} has one or\n     * more {@code NaN} parts.\n     * \u003cbr/\u003e\n     * Returns {@link #INF} if neither {@code this} nor {@code factor} has one\n     * or more {@code NaN} parts and if either {@code this} or {@code factor}\n     * has one or more infinite parts (same result is returned regardless of\n     * the sign of the components).\n     * \u003cbr/\u003e\n     * Returns finite values in components of the result per the definitional\n     * formula in all remaining cases.\n     *\n     * @param  factor value to be multiplied by this {@code Complex}.\n     * @return {@code this * factor}.\n     * @throws NullArgumentException if {@code factor} is {@code null}.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 39)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 422,col 9)",
        "(line 423,col 9)-(line 424,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.multiply(double)",
      "begin_line": 435,
      "end_line": 446,
      "comment": "\n     * Returns a {@code Complex} whose value is {@code this * factor}, with {@code factor}\n     * interpreted as a real number.\n     *\n     * @param  factor value to be multiplied by this {@code Complex}.\n     * @return {@code this * factor}.\n     * @see #multiply(Complex)\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.negate()",
      "begin_line": 455,
      "end_line": 461,
      "comment": "\n     * Returns a {@code Complex} whose value is {@code (-this)}.\n     * Returns {@code NaN} if either real or imaginary\n     * part of this Complex number equals {@code Double.NaN}.\n     *\n     * @return {@code -this}.\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 460,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.subtract(org.apache.commons.math.complex.Complex)",
      "begin_line": 481,
      "end_line": 490,
      "comment": "\n     * Returns a {@code Complex} whose value is\n     * {@code (this - subtrahend)}.\n     * Uses the definitional formula\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   (a + bi) - (c + di) \u003d (a-c) + (b-d)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * If either {@code this} or {@code subtrahend} has a {@code NaN]} value in either part,\n     * {@link #NaN} is returned; otherwise infinite and {@code NaN} values are\n     * returned in the parts of the result according to the rules for\n     * {@link java.lang.Double} arithmetic.\n     *\n     * @param  subtrahend value to be subtracted from this {@code Complex}.\n     * @return {@code this - subtrahend}.\n     * @throws NullArgumentException if {@code subtrahend} is {@code null}.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 43)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 488,col 9)-(line 489,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.subtract(double)",
      "begin_line": 500,
      "end_line": 505,
      "comment": "\n     * Returns a {@code Complex} whose value is\n     * {@code (this - subtrahend)}.\n     *\n     * @param  subtrahend value to be subtracted from this {@code Complex}.\n     * @return {@code this - subtrahend}.\n     * @see #subtract(Complex)\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.acos()",
      "begin_line": 523,
      "end_line": 530,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseCosine.html\" TARGET\u003d\"_top\"\u003e\n     * inverse cosine\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   acos(z) \u003d -i (log(z + i (sqrt(1 - z\u003csup\u003e2\u003c/sup\u003e))))\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN} or infinite.\n     *\n     * @return the inverse cosine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 526,col 9)",
        "(line 528,col 9)-(line 529,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.asin()",
      "begin_line": 548,
      "end_line": 555,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseSine.html\" TARGET\u003d\"_top\"\u003e\n     * inverse sine\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   asin(z) \u003d -i (log(sqrt(1 - z\u003csup\u003e2\u003c/sup\u003e) + iz))\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN} or infinite.\n     *\n     * @return the inverse sine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 551,col 9)",
        "(line 553,col 9)-(line 554,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.atan()",
      "begin_line": 573,
      "end_line": 580,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseTangent.html\" TARGET\u003d\"_top\"\u003e\n     * inverse tangent\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   atan(z) \u003d (i/2) log((i + z)/(i - z))\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN} or infinite.\n     *\n     * @return the inverse tangent of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 576,col 9)",
        "(line 578,col 9)-(line 579,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.cos()",
      "begin_line": 614,
      "end_line": 621,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Cosine.html\" TARGET\u003d\"_top\"\u003e\n     * cosine\u003c/a\u003e\n     * of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   cos(a + bi) \u003d cos(a)cosh(b) - sin(a)sinh(b)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},\n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   cos(1 \u0026plusmn; INFINITY i) \u003d 1 \u0026#x2213; INFINITY i\n     *   cos(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     *   cos(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the cosine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 617,col 9)",
        "(line 619,col 9)-(line 620,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.cosh()",
      "begin_line": 654,
      "end_line": 661,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   cosh(a + bi) \u003d cosh(a)cos(b) + sinh(a)sin(b)i}\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},\n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   cosh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *   cosh(\u0026plusmn;INFINITY + i) \u003d INFINITY \u0026plusmn; INFINITY i\n     *   cosh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the hyperbolic cosine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 657,col 9)",
        "(line 659,col 9)-(line 660,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.exp()",
      "begin_line": 695,
      "end_line": 703,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialFunction.html\" TARGET\u003d\"_top\"\u003e\n     * exponential function\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   exp(a + bi) \u003d exp(a)cos(b) + exp(a)sin(b)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#exp}, {@link java.lang.Math#cos}, and\n     * {@link java.lang.Math#sin}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   exp(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *   exp(INFINITY + i) \u003d INFINITY + INFINITY i\n     *   exp(-INFINITY + i) \u003d 0 + 0i\n     *   exp(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return \u003ccode\u003e\u003ci\u003ee\u003c/i\u003e\u003csup\u003ethis\u003c/sup\u003e\u003c/code\u003e.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 698,col 9)",
        "(line 700,col 9)-(line 700,col 44)",
        "(line 701,col 9)-(line 702,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.log()",
      "begin_line": 740,
      "end_line": 747,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NaturalLogarithm.html\" TARGET\u003d\"_top\"\u003e\n     * natural logarithm\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   log(a + bi) \u003d ln(|a + bi|) + arg(a + bi)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where ln on the right hand side is {@link java.lang.Math#log},\n     * {@code |a + bi|} is the modulus, {@link Complex#abs},  and\n     * {@code arg(a + bi) \u003d }{@link java.lang.Math#atan2}(b, a).\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite (or critical) values in real or imaginary parts of the input may\n     * result in infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   log(1 \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (\u0026pi;/2)i\n     *   log(INFINITY + i) \u003d INFINITY + 0i\n     *   log(-INFINITY + i) \u003d INFINITY + \u0026pi;i\n     *   log(INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (\u0026pi;/4)i\n     *   log(-INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (3\u0026pi;/4)i\n     *   log(0 + 0i) \u003d -INFINITY + 0i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the value \u003ccode\u003eln \u0026nbsp; this\u003c/code\u003e, the natural logarithm\n     * of {@code this}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 743,col 9)",
        "(line 745,col 9)-(line 746,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.pow(org.apache.commons.math.complex.Complex)",
      "begin_line": 769,
      "end_line": 773,
      "comment": "\n     * Returns of value of this complex number raised to the power of {@code x}.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   y\u003csup\u003ex\u003c/sup\u003e \u003d exp(x\u0026middot;log(y))\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where {@code exp} and {@code log} are {@link #exp} and\n     * {@link #log}, respectively.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN} or infinite, or if {@code y}\n     * equals {@link Complex#ZERO}.\n     *\n     * @param  x exponent to which this {@code Complex} is to be raised.\n     * @return \u003ccode\u003e this\u003csup\u003e{@code x}\u003c/sup\u003e\u003c/code\u003e.\n     * @throws NullArgumentException if x is {@code null}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 34)",
        "(line 772,col 9)-(line 772,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.pow(double)",
      "begin_line": 782,
      "end_line": 784,
      "comment": "\n     * Returns of value of this complex number raised to the power of {@code x}.\n     *\n     * @param  x exponent to which this {@code Complex} is to be raised.\n     * @return \u003ccode\u003ethis\u003csup\u003ex\u003c/sup\u003e\u003c/code\u003e.\n     * @see #pow(Complex)\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sin()",
      "begin_line": 818,
      "end_line": 825,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Sine.html\" TARGET\u003d\"_top\"\u003e\n     * sine\u003c/a\u003e\n     * of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   sin(a + bi) \u003d sin(a)cosh(b) - cos(a)sinh(b)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},\n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or {@code NaN} values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   sin(1 \u0026plusmn; INFINITY i) \u003d 1 \u0026plusmn; INFINITY i\n     *   sin(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     *   sin(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the sine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 821,col 9)",
        "(line 823,col 9)-(line 824,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sinh()",
      "begin_line": 858,
      "end_line": 865,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic sine\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   sinh(a + bi) \u003d sinh(a)cos(b)) + cosh(a)sin(b)i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},\n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   sinh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *   sinh(\u0026plusmn;INFINITY + i) \u003d \u0026plusmn; INFINITY + INFINITY i\n     *   sinh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the hyperbolic sine of {@code this}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 861,col 9)",
        "(line 863,col 9)-(line 864,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sqrt()",
      "begin_line": 901,
      "end_line": 917,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/SquareRoot.html\" TARGET\u003d\"_top\"\u003e\n     * square root\u003c/a\u003e of this complex number.\n     * Implements the following algorithm to compute {@code sqrt(a + bi)}:\n     * \u003col\u003e\u003cli\u003eLet {@code t \u003d sqrt((|a| + |a + bi|) / 2)}\u003c/li\u003e\n     * \u003cli\u003e\u003cpre\u003eif {@code  a \u0026#8805; 0} return {@code t + (b/2t)i}\n     *  else return {@code |b|/2t + sign(b)t i }\u003c/pre\u003e\u003c/li\u003e\n     * \u003c/ol\u003e\n     * where \u003cul\u003e\n     * \u003cli\u003e{@code |a| \u003d }{@link Math#abs}(a)\u003c/li\u003e\n     * \u003cli\u003e{@code |a + bi| \u003d }{@link Complex#abs}(a + bi)\u003c/li\u003e\n     * \u003cli\u003e{@code sign(b) \u003d  }{@link MathUtils#indicator}(b)\n     * \u003c/ul\u003e\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   sqrt(1 \u0026plusmn; INFINITY i) \u003d INFINITY + NaN i\n     *   sqrt(INFINITY + i) \u003d INFINITY + 0i\n     *   sqrt(-INFINITY + i) \u003d 0 + INFINITY i\n     *   sqrt(INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY + NaN i\n     *   sqrt(-INFINITY \u0026plusmn; INFINITY i) \u003d NaN \u0026plusmn; INFINITY i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the square root of {@code this}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 902,col 9)-(line 904,col 9)",
        "(line 906,col 9)-(line 908,col 9)",
        "(line 910,col 9)-(line 910,col 69)",
        "(line 911,col 9)-(line 916,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sqrt1z()",
      "begin_line": 936,
      "end_line": 938,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/SquareRoot.html\" TARGET\u003d\"_top\"\u003e\n     * square root\u003c/a\u003e of \u003ccode\u003e1 - this\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e for this complex\n     * number.\n     * Computes the result directly as\n     * {@code sqrt(ONE.subtract(z.multiply(z)))}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     *\n     * @return the square root of \u003ccode\u003e1 - this\u003csup\u003e2\u003c/sup\u003e\u003c/code\u003e.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.tan()",
      "begin_line": 972,
      "end_line": 983,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Tangent.html\" TARGET\u003d\"_top\"\u003e\n     * tangent\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   tan(a + bi) \u003d sin(2a)/(cos(2a)+cosh(2b)) + [sinh(2b)/(cos(2a)+cosh(2b))]i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},\n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite (or critical) values in real or imaginary parts of the input may\n     * result in infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   tan(1 \u0026plusmn; INFINITY i) \u003d 0 + NaN i\n     *   tan(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     *   tan(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *   tan(\u0026plusmn;\u0026pi;/2 + 0 i) \u003d \u0026plusmn;INFINITY + NaN i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the tangent of {@code this}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 975,col 9)",
        "(line 977,col 9)-(line 977,col 34)",
        "(line 978,col 9)-(line 978,col 44)",
        "(line 979,col 9)-(line 979,col 68)",
        "(line 981,col 9)-(line 982,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.tanh()",
      "begin_line": 1017,
      "end_line": 1028,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicTangent.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic tangent\u003c/a\u003e of this complex number.\n     * Implements the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   tan(a + bi) \u003d sinh(2a)/(cosh(2a)+cos(2b)) + [sin(2b)/(cosh(2a)+cos(2b))]i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos},\n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cbr/\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the\n     * input argument is {@code NaN}.\n     * \u003cbr/\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\n     * \u003cpre\u003e\n     *  Examples:\n     *  \u003ccode\u003e\n     *   tanh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *   tanh(\u0026plusmn;INFINITY + i) \u003d NaN + 0 i\n     *   tanh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     *   tanh(0 + (\u0026pi;/2)i) \u003d NaN + INFINITY i\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @return the hyperbolic tangent of {@code this}.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1020,col 9)",
        "(line 1022,col 9)-(line 1022,col 34)",
        "(line 1023,col 9)-(line 1023,col 44)",
        "(line 1024,col 9)-(line 1024,col 68)",
        "(line 1026,col 9)-(line 1027,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getArgument()",
      "begin_line": 1049,
      "end_line": 1051,
      "comment": "\n     * Compute the argument of this complex number.\n     * The argument is the angle phi between the positive real axis and\n     * the point representing this number in the complex plane.\n     * The value returned is between -PI (not inclusive)\n     * and PI (inclusive), with negative values returned for numbers with\n     * negative imaginary parts.\n     * \u003cbr/\u003e\n     * If either real or imaginary part (or both) is NaN, NaN is returned.\n     * Infinite parts are handled as {@code Math.atan2} handles them,\n     * essentially treating finite parts as zero in the presence of an\n     * infinite coordinate and returning a multiple of pi/4 depending on\n     * the signs of the infinite parts.\n     * See the javadoc for {@code Math.atan2} for full details.\n     *\n     * @return the argument of {@code this}.\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1050,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.nthRoot(int)",
      "begin_line": 1075,
      "end_line": 1109,
      "comment": "\n     * Computes the n-th roots of this complex number.\n     * The nth roots are defined by the formula:\n     * \u003cpre\u003e\n     *  \u003ccode\u003e\n     *   z\u003csub\u003ek\u003c/sub\u003e \u003d abs\u003csup\u003e1/n\u003c/sup\u003e (cos(phi + 2\u0026pi;k/n) + i (sin(phi + 2\u0026pi;k/n))\n     *  \u003c/code\u003e\n     * \u003c/pre\u003e\n     * for \u003ci\u003e{@code k\u003d0, 1, ..., n-1}\u003c/i\u003e, where {@code abs} and {@code phi}\n     * are respectively the {@link #abs() modulus} and\n     * {@link #getArgument() argument} of this complex number.\n     * \u003cbr/\u003e\n     * If one or both parts of this complex number is NaN, a list with just\n     * one element, {@link #NaN} is returned.\n     * if neither part is NaN, but at least one part is infinite, the result\n     * is a one-element list containing {@link #INF}.\n     *\n     * @param n Degree of root.\n     * @return a List\u003cComplex\u003e of all {@code n}-th roots of {@code this}.\n     * @throws NotPositiveException if {@code n \u003c\u003d 0}.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1080,col 9)",
        "(line 1082,col 9)-(line 1082,col 62)",
        "(line 1084,col 9)-(line 1087,col 9)",
        "(line 1088,col 9)-(line 1091,col 9)",
        "(line 1094,col 9)-(line 1094,col 65)",
        "(line 1097,col 9)-(line 1097,col 48)",
        "(line 1098,col 9)-(line 1098,col 49)",
        "(line 1099,col 9)-(line 1099,col 34)",
        "(line 1100,col 9)-(line 1106,col 9)",
        "(line 1108,col 9)-(line 1108,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.createComplex(double, double)",
      "begin_line": 1120,
      "end_line": 1123,
      "comment": "\n     * Create a complex number given the real and imaginary parts.\n     *\n     * @param realPart Real part.\n     * @param imaginaryPart Imaginary part.\n     * @return a new complex number instance.\n     * @since 1.2\n     * @see #valueOf(double, double)\n     ",
      "child_ranges": [
        "(line 1122,col 9)-(line 1122,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.valueOf(double, double)",
      "begin_line": 1132,
      "end_line": 1139,
      "comment": "\n     * Create a complex number given the real and imaginary parts.\n     *\n     * @param realPart Real part.\n     * @param imaginaryPart Imaginary part.\n     * @return a Complex instance.\n     ",
      "child_ranges": [
        "(line 1134,col 9)-(line 1137,col 9)",
        "(line 1138,col 9)-(line 1138,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.valueOf(double)",
      "begin_line": 1147,
      "end_line": 1152,
      "comment": "\n     * Create a complex number given only the real part.\n     *\n     * @param realPart Real part.\n     * @return a Complex instance.\n     ",
      "child_ranges": [
        "(line 1148,col 9)-(line 1150,col 9)",
        "(line 1151,col 9)-(line 1151,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.readResolve()",
      "begin_line": 1162,
      "end_line": 1164,
      "comment": "\n     * Resolve the transient fields in a deserialized Complex Object.\n     * Subclasses will need to override {@link #createComplex} to\n     * deserialize properly.\n     *\n     * @return A Complex instance with all fields resolved.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1163,col 9)-(line 1163,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getField()",
      "begin_line": 1167,
      "end_line": 1169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1168,col 9)-(line 1168,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.toString()",
      "begin_line": 1172,
      "end_line": 1175,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1174,col 9)-(line 1174,col 51)"
      ]
    }
  ]
}