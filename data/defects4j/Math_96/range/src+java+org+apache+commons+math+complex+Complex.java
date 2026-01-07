{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/complex/Complex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Complex",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 874,
      "comment": "\n * Representation of a Complex number - a number which has both a \n * real and imaginary part.\n * \u003cp\u003e\n * Implementations of arithmetic operations handle \u003ccode\u003eNaN\u003c/code\u003e and\n * infinite values according to the rules for {@link java.lang.Double}\n * arithmetic, applying definitional formulas and returning \u003ccode\u003eNaN\u003c/code\u003e or\n * infinite values in real or imaginary parts as these arise in computation. \n * See individual method javadocs for details.\u003c/p\u003e\n * \u003cp\u003e\n * {@link #equals} identifies all values with \u003ccode\u003eNaN\u003c/code\u003e in either real \n * or imaginary part - e.g., \u003cpre\u003e\n * \u003ccode\u003e1 + NaNi  \u003d\u003d NaN + i \u003d\u003d NaN + NaNi.\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "I"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " The square root of -1. A number representing \"0.0 + 1.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "NaN"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " A complex number representing \"NaN + NaNi\" "
    },
    {
      "type": "field",
      "varNames": [
        "INF"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " A complex number representing \"+INF + INFi\" "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " A complex number representing \"1.0 + 0.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " A complex number representing \"0.0 + 0.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "imaginary"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " \n     * The imaginary part \n     "
    },
    {
      "type": "field",
      "varNames": [
        "real"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " \n     * The real part \n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.Complex.Complex(double, double)",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n     * Create a complex number given the real and imaginary parts.\n     *\n     * @param real the real part\n     * @param imaginary the imaginary part\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 16)",
        "(line 77,col 9)-(line 77,col 25)",
        "(line 78,col 9)-(line 78,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.abs()",
      "begin_line": 91,
      "end_line": 113,
      "comment": "\n     * Return the absolute value of this complex number.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eNaN\u003c/code\u003e if either real or imaginary part is\n     * \u003ccode\u003eNaN\u003c/code\u003e and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e if\n     * neither part is \u003ccode\u003eNaN\u003c/code\u003e, but at least one part takes an infinite\n     * value.\u003c/p\u003e\n     *\n     * @return the absolute value\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.add(org.apache.commons.math.complex.Complex)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * Return the sum of this complex number and the given complex number.\n     * \u003cp\u003e\n     * Uses the definitional formula \n     * \u003cpre\u003e\n     * (a + bi) + (c + di) \u003d (a+c) + (b+d)i\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * If either this or \u003ccode\u003erhs\u003c/code\u003e has a NaN value in either part,\n     * {@link #NaN} is returned; otherwise Inifinite and NaN values are\n     * returned in the parts of the result according to the rules for\n     * {@link java.lang.Double} arithmetic.\u003c/p\u003e \n     *\n     * @param rhs the other complex number\n     * @return the complex number sum\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 134,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.conjugate()",
      "begin_line": 151,
      "end_line": 156,
      "comment": "\n     * Return the conjugate of this complex number. The conjugate of\n     * \"A + Bi\" is \"A - Bi\". \n     * \u003cp\u003e\n     * {@link #NaN} is returned if either the real or imaginary\n     * part of this Complex number equals \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * If the imaginary part is infinite, and the real part is not NaN, \n     * the returned value has infinite imaginary part of the opposite\n     * sign - e.g. the conjugate of \u003ccode\u003e1 + POSITIVE_INFINITY i\u003c/code\u003e\n     * is \u003ccode\u003e1 - NEGATIVE_INFINITY i\u003c/code\u003e\u003c/p\u003e\n     *\n     * @return the conjugate of this Complex object\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.divide(org.apache.commons.math.complex.Complex)",
      "begin_line": 193,
      "end_line": 225,
      "comment": "\n     * Return the quotient of this complex number and the given complex number.\n     * \u003cp\u003e\n     * Implements the definitional formula\n     * \u003cpre\u003e\u003ccode\u003e\n     *    a + bi          ac + bd + (bc - ad)i\n     *    ----------- \u003d -------------------------\n     *    c + di               c\u003csup\u003e2\u003c/sup\u003e + d\u003csup\u003e2\u003c/sup\u003e\n     * \u003c/code\u003e\u003c/pre\u003e\n     * but uses \n     * \u003ca href\u003d\"http://doi.acm.org/10.1145/1039813.1039814\"\u003e\n     * prescaling of operands\u003c/a\u003e to limit the effects of overflows and\n     * underflows in the computation.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite and NaN values are handled / returned according to the\n     * following rules, applied in the order presented:\n     * \u003cul\u003e\n     * \u003cli\u003eIf either this or \u003ccode\u003erhs\u003c/code\u003e has a NaN value in either part,\n     *  {@link #NaN} is returned.\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003erhs\u003c/code\u003e equals {@link #ZERO}, {@link #NaN} is returned.\n     * \u003c/li\u003e\n     * \u003cli\u003eIf this and \u003ccode\u003erhs\u003c/code\u003e are both infinite,\n     * {@link #NaN} is returned.\u003c/li\u003e\n     * \u003cli\u003eIf this is finite (i.e., has no infinite or NaN parts) and\n     *  \u003ccode\u003erhs\u003c/code\u003e is infinite (one or both parts infinite), \n     * {@link #ZERO} is returned.\u003c/li\u003e\n     * \u003cli\u003eIf this is infinite and \u003ccode\u003erhs\u003c/code\u003e is finite, NaN values are\n     * returned in the parts of the result if the {@link java.lang.Double}\n     * rules applied to the definitional formula force NaN results.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param rhs the other complex number\n     * @return the complex number quotient\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 33)",
        "(line 199,col 9)-(line 199,col 38)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.equals(java.lang.Object)",
      "begin_line": 245,
      "end_line": 267,
      "comment": "\n     * Test for the equality of two Complex objects.\n     * \u003cp\u003e\n     * If both the real and imaginary parts of two Complex numbers\n     * are exactly the same, and neither is \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two\n     * Complex objects are considered to be equal.\u003c/p\u003e\n     * \u003cp\u003e\n     * All \u003ccode\u003eNaN\u003c/code\u003e values are considered to be equal - i.e, if either\n     * (or both) real and imaginary parts of the complex number are equal\n     * to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the complex number is equal to \n     * \u003ccode\u003eComplex.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two Complex objects are equal, false if\n     *         object is null, not an instance of Complex, or\n     *         not equal to this Complex instance\n     * \n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 20)",
        "(line 248,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 266,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.hashCode()",
      "begin_line": 276,
      "end_line": 282,
      "comment": "\n     * Get a hashCode for the complex number.\n     * \u003cp\u003e\n     * All NaN values have the same hash code.\u003c/p\u003e\n     * \n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 281,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getImaginary()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Access the imaginary part.\n     *\n     * @return the imaginary part\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getReal()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Access the real part.\n     *\n     * @return the real part\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.isNaN()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Returns true if either or both parts of this complex number is NaN;\n     * false otherwise\n     *\n     * @return  true if either or both parts of this complex number is NaN;\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.isInfinite()",
      "begin_line": 322,
      "end_line": 325,
      "comment": "\n     * Returns true if either the real or imaginary part of this complex number\n     * takes an infinite value (either \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e or \n     * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e) and neither part\n     * is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @return true if one or both parts of this complex number are infinite\n     * and neither part is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 324,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.multiply(org.apache.commons.math.complex.Complex)",
      "begin_line": 354,
      "end_line": 365,
      "comment": "\n     * Return the product of this complex number and the given complex number.\n     * \u003cp\u003e\n     * Implements preliminary checks for NaN and infinity followed by\n     * the definitional formula:\n     * \u003cpre\u003e\u003ccode\u003e\n     * (a + bi)(c + di) \u003d (ac - bd) + (ad + bc)i\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link #NaN} if either this or \u003ccode\u003erhs\u003c/code\u003e has one or more\n     * NaN parts.\n     * \u003c/p\u003e\n     * Returns {@link #INF} if neither this nor \u003ccode\u003erhs\u003c/code\u003e has one or more\n     * NaN parts and if either this or \u003ccode\u003erhs\u003c/code\u003e has one or more\n     * infinite parts (same result is returned regardless of the sign of the\n     * components).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Returns finite values in components of the result per the\n     * definitional formula in all remaining cases.\n     *  \u003c/p\u003e\n     * \n     * @param rhs the other complex number\n     * @return the complex number product\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 364,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.negate()",
      "begin_line": 375,
      "end_line": 381,
      "comment": "\n     * Return the additive inverse of this complex number.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eComplex.NaN\u003c/code\u003e if either real or imaginary\n     * part of this Complex number equals \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the negation of this complex number\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 378,col 9)",
        "(line 380,col 9)-(line 380,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.subtract(org.apache.commons.math.complex.Complex)",
      "begin_line": 401,
      "end_line": 408,
      "comment": "\n     * Return the difference between this complex number and the given complex\n     * number.\n      * \u003cp\u003e\n     * Uses the definitional formula \n     * \u003cpre\u003e\n     * (a + bi) - (c + di) \u003d (a-c) + (b-d)i\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * If either this or \u003ccode\u003erhs\u003c/code\u003e has a NaN value in either part,\n     * {@link #NaN} is returned; otherwise inifinite and NaN values are\n     * returned in the parts of the result according to the rules for\n     * {@link java.lang.Double} arithmetic. \u003c/p\u003e\n     * \n     * @param rhs the other complex number\n     * @return the complex number difference\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 404,col 9)",
        "(line 406,col 9)-(line 407,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.acos()",
      "begin_line": 424,
      "end_line": 431,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseCosine.html\" TARGET\u003d\"_top\"\u003e\n     * inverse cosine\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e acos(z) \u003d -i (log(z + i (sqrt(1 - z\u003csup\u003e2\u003c/sup\u003e))))\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite.\u003c/p\u003e\n     * \n     * @return the inverse cosine of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 427,col 9)",
        "(line 429,col 9)-(line 430,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.asin()",
      "begin_line": 447,
      "end_line": 454,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseSine.html\" TARGET\u003d\"_top\"\u003e\n     * inverse sine\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e asin(z) \u003d -i (log(sqrt(1 - z\u003csup\u003e2\u003c/sup\u003e) + iz)) \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite.\u003c/p\u003e\n     * \n     * @return the inverse sine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 453,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.atan()",
      "begin_line": 470,
      "end_line": 477,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseTangent.html\" TARGET\u003d\"_top\"\u003e\n     * inverse tangent\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e atan(z) \u003d (i/2) log((i + z)/(i - z)) \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite.\u003c/p\u003e\n     * \n     * @return the inverse tangent of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 473,col 9)",
        "(line 475,col 9)-(line 476,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.cos()",
      "begin_line": 505,
      "end_line": 512,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Cosine.html\" TARGET\u003d\"_top\"\u003e\n     * cosine\u003c/a\u003e\n     * of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e cos(a + bi) \u003d cos(a)cosh(b) - sin(a)sinh(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * cos(1 \u0026plusmn; INFINITY i) \u003d 1 \u0026#x2213; INFINITY i\n     * cos(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     * cos(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the cosine of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 508,col 9)",
        "(line 510,col 9)-(line 511,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.cosh()",
      "begin_line": 539,
      "end_line": 546,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e cosh(a + bi) \u003d cosh(a)cos(b) + sinh(a)sin(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * cosh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * cosh(\u0026plusmn;INFINITY + i) \u003d INFINITY \u0026plusmn; INFINITY i\n     * cosh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the hyperbolic cosine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 542,col 9)",
        "(line 544,col 9)-(line 545,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.exp()",
      "begin_line": 574,
      "end_line": 581,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialFunction.html\" TARGET\u003d\"_top\"\u003e\n     * exponential function\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e exp(a + bi) \u003d exp(a)cos(b) + exp(a)sin(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#exp}, {@link java.lang.Math#cos}, and\n     * {@link java.lang.Math#sin}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * exp(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * exp(INFINITY + i) \u003d INFINITY + INFINITY i\n     * exp(-INFINITY + i) \u003d 0 + 0i\n     * exp(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return \u003ci\u003ee\u003c/i\u003e\u003csup\u003e\u003ccode\u003ethis\u003c/code\u003e\u003c/sup\u003e\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 577,col 9)",
        "(line 579,col 9)-(line 579,col 40)",
        "(line 580,col 9)-(line 580,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.log()",
      "begin_line": 612,
      "end_line": 619,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NaturalLogarithm.html\" TARGET\u003d\"_top\"\u003e\n     * natural logarithm\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e log(a + bi) \u003d ln(|a + bi|) + arg(a + bi)i\u003c/code\u003e\u003c/pre\u003e\n     * where ln on the right hand side is {@link java.lang.Math#log},\n     * \u003ccode\u003e|a + bi|\u003c/code\u003e is the modulus, {@link Complex#abs},  and\n     * \u003ccode\u003earg(a + bi) \u003d {@link java.lang.Math#atan2}(b, a)\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite (or critical) values in real or imaginary parts of the input may\n     * result in infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * log(1 \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (\u0026pi;/2)i\n     * log(INFINITY + i) \u003d INFINITY + 0i\n     * log(-INFINITY + i) \u003d INFINITY + \u0026pi;i\n     * log(INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (\u0026pi;/4)i\n     * log(-INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (3\u0026pi;/4)i\n     * log(0 + 0i) \u003d -INFINITY + 0i\n     * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return ln of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 615,col 9)",
        "(line 617,col 9)-(line 618,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.pow(org.apache.commons.math.complex.Complex)",
      "begin_line": 638,
      "end_line": 643,
      "comment": "\n     * Returns of value of this complex number raised to the power of \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e y\u003csup\u003ex\u003c/sup\u003e \u003d exp(x\u0026middot;log(y))\u003c/code\u003e\u003c/pre\u003e \n     * where \u003ccode\u003eexp\u003c/code\u003e and \u003ccode\u003elog\u003c/code\u003e are {@link #exp} and\n     * {@link #log}, respectively.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite, or if \u003ccode\u003ey\u003c/code\u003e\n     * equals {@link Complex#ZERO}.\u003c/p\u003e\n     * \n     * @param x the exponent.\n     * @return \u003ccode\u003ethis\u003c/code\u003e\u003csup\u003e\u003ccode\u003ex\u003c/code\u003e\u003c/sup\u003e\n     * @throws NullPointerException if x is null\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 641,col 9)",
        "(line 642,col 9)-(line 642,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sin()",
      "begin_line": 671,
      "end_line": 678,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Sine.html\" TARGET\u003d\"_top\"\u003e\n     * sine\u003c/a\u003e\n     * of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e sin(a + bi) \u003d sin(a)cosh(b) - cos(a)sinh(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * sin(1 \u0026plusmn; INFINITY i) \u003d 1 \u0026plusmn; INFINITY i\n     * sin(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     * sin(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the sine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 674,col 9)",
        "(line 676,col 9)-(line 677,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sinh()",
      "begin_line": 705,
      "end_line": 712,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic sine\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e sinh(a + bi) \u003d sinh(a)cos(b)) + cosh(a)sin(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * sinh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * sinh(\u0026plusmn;INFINITY + i) \u003d \u0026plusmn; INFINITY + INFINITY i\n     * sinh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the hyperbolic sine of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 708,col 9)",
        "(line 710,col 9)-(line 711,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sqrt()",
      "begin_line": 747,
      "end_line": 763,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/SquareRoot.html\" TARGET\u003d\"_top\"\u003e\n     * square root\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the following algorithm to compute \u003ccode\u003esqrt(a + bi)\u003c/code\u003e: \n     * \u003col\u003e\u003cli\u003eLet \u003ccode\u003et \u003d sqrt((|a| + |a + bi|) / 2)\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cpre\u003eif \u003ccode\u003e a \u0026#8805; 0\u003c/code\u003e return \u003ccode\u003et + (b/2t)i\u003c/code\u003e\n     *  else return \u003ccode\u003e|b|/2t + sign(b)t i \u003c/code\u003e\u003c/pre\u003e\u003c/li\u003e\n     * \u003c/ol\u003e\n     * where \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e|a| \u003d {@link Math#abs}(a)\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e|a + bi| \u003d {@link Complex#abs}(a + bi) \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003esign(b) \u003d  {@link MathUtils#indicator}(b) \u003c/code\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * sqrt(1 \u0026plusmn; INFINITY i) \u003d INFINITY + NaN i\n     * sqrt(INFINITY + i) \u003d INFINITY + 0i\n     * sqrt(-INFINITY + i) \u003d 0 + INFINITY i\n     * sqrt(INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY + NaN i\n     * sqrt(-INFINITY \u0026plusmn; INFINITY i) \u003d NaN \u0026plusmn; INFINITY i\n     * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the square root of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 750,col 9)",
        "(line 752,col 9)-(line 754,col 9)",
        "(line 756,col 9)-(line 756,col 61)",
        "(line 757,col 9)-(line 762,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sqrt1z()",
      "begin_line": 783,
      "end_line": 785,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/SquareRoot.html\" TARGET\u003d\"_top\"\u003e\n     * square root\u003c/a\u003e of 1 - \u003ccode\u003ethis\u003c/code\u003e\u003csup\u003e2\u003c/sup\u003e for this complex\n     * number.\n     * \u003cp\u003e\n     * Computes the result directly as \n     * \u003ccode\u003esqrt(Complex.ONE.subtract(z.multiply(z)))\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003c/p\u003e\n     * \n     * @return the square root of 1 - \u003ccode\u003ethis\u003c/code\u003e\u003csup\u003e2\u003c/sup\u003e\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.tan()",
      "begin_line": 813,
      "end_line": 823,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Tangent.html\" TARGET\u003d\"_top\"\u003e\n     * tangent\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003etan(a + bi) \u003d sin(2a)/(cos(2a)+cosh(2b)) + [sinh(2b)/(cos(2a)+cosh(2b))]i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite (or critical) values in real or imaginary parts of the input may\n     * result in infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * tan(1 \u0026plusmn; INFINITY i) \u003d 0 + NaN i\n     * tan(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     * tan(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * tan(\u0026plusmn;\u0026pi;/2 + 0 i) \u003d \u0026plusmn;INFINITY + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the tangent of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 816,col 9)",
        "(line 818,col 9)-(line 818,col 34)",
        "(line 819,col 9)-(line 819,col 44)",
        "(line 820,col 9)-(line 820,col 64)",
        "(line 822,col 9)-(line 822,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.tanh()",
      "begin_line": 851,
      "end_line": 861,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicTangent.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic tangent\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003etan(a + bi) \u003d sinh(2a)/(cosh(2a)+cos(2b)) + [sin(2b)/(cosh(2a)+cos(2b))]i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * tanh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * tanh(\u0026plusmn;INFINITY + i) \u003d NaN + 0 i\n     * tanh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * tanh(0 + (\u0026pi;/2)i) \u003d NaN + INFINITY i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return the hyperbolic tangent of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 854,col 9)",
        "(line 856,col 9)-(line 856,col 34)",
        "(line 857,col 9)-(line 857,col 44)",
        "(line 858,col 9)-(line 858,col 64)",
        "(line 860,col 9)-(line 860,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.createComplex(double, double)",
      "begin_line": 871,
      "end_line": 873,
      "comment": "\n     * Create a complex number given the real and imaginary parts.\n     *\n     * @param real the real part\n     * @param imaginary the imaginary part\n     * @return a new complex number instance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 44)"
      ]
    }
  ]
}