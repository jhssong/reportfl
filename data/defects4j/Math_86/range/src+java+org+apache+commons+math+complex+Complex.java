{
  "filepath": "/tmp/Math-86b/src/java/org/apache/commons/math/complex/Complex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Complex",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.FieldElement\u003corg.apache.commons.math.complex.Complex\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 46,
      "end_line": 967,
      "comment": "\n * Representation of a Complex number - a number which has both a \n * real and imaginary part.\n * \u003cp\u003e\n * Implementations of arithmetic operations handle \u003ccode\u003eNaN\u003c/code\u003e and\n * infinite values according to the rules for {@link java.lang.Double}\n * arithmetic, applying definitional formulas and returning \u003ccode\u003eNaN\u003c/code\u003e or\n * infinite values in real or imaginary parts as these arise in computation. \n * See individual method javadocs for details.\u003c/p\u003e\n * \u003cp\u003e\n * {@link #equals} identifies all values with \u003ccode\u003eNaN\u003c/code\u003e in either real \n * or imaginary part - e.g., \u003cpre\u003e\n * \u003ccode\u003e1 + NaNi  \u003d\u003d NaN + i \u003d\u003d NaN + NaNi.\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n *\n * implements Serializable since 2.0\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "I"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The square root of -1. A number representing \"0.0 + 1.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "NaN"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " A complex number representing \"NaN + NaNi\" "
    },
    {
      "type": "field",
      "varNames": [
        "INF"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " A complex number representing \"+INF + INFi\" "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " A complex number representing \"1.0 + 0.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " A complex number representing \"0.0 + 0.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "imaginary"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " \n     * The imaginary part \n     "
    },
    {
      "type": "field",
      "varNames": [
        "real"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " \n     * The real part \n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.Complex.Complex(double, double)",
      "begin_line": 84,
      "end_line": 88,
      "comment": "\n     * Create a complex number given the real and imaginary parts.\n     *\n     * @param real the real part\n     * @param imaginary the imaginary part\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 16)",
        "(line 86,col 9)-(line 86,col 25)",
        "(line 87,col 9)-(line 87,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.abs()",
      "begin_line": 100,
      "end_line": 122,
      "comment": "\n     * Return the absolute value of this complex number.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eNaN\u003c/code\u003e if either real or imaginary part is\n     * \u003ccode\u003eNaN\u003c/code\u003e and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e if\n     * neither part is \u003ccode\u003eNaN\u003c/code\u003e, but at least one part takes an infinite\n     * value.\u003c/p\u003e\n     *\n     * @return the absolute value\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.add(org.apache.commons.math.complex.Complex)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * Return the sum of this complex number and the given complex number.\n     * \u003cp\u003e\n     * Uses the definitional formula \n     * \u003cpre\u003e\n     * (a + bi) + (c + di) \u003d (a+c) + (b+d)i\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * If either this or \u003ccode\u003erhs\u003c/code\u003e has a NaN value in either part,\n     * {@link #NaN} is returned; otherwise Inifinite and NaN values are\n     * returned in the parts of the result according to the rules for\n     * {@link java.lang.Double} arithmetic.\u003c/p\u003e \n     *\n     * @param rhs the other complex number\n     * @return the complex number sum\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 143,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.conjugate()",
      "begin_line": 160,
      "end_line": 165,
      "comment": "\n     * Return the conjugate of this complex number. The conjugate of\n     * \"A + Bi\" is \"A - Bi\". \n     * \u003cp\u003e\n     * {@link #NaN} is returned if either the real or imaginary\n     * part of this Complex number equals \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * If the imaginary part is infinite, and the real part is not NaN, \n     * the returned value has infinite imaginary part of the opposite\n     * sign - e.g. the conjugate of \u003ccode\u003e1 + POSITIVE_INFINITY i\u003c/code\u003e\n     * is \u003ccode\u003e1 - NEGATIVE_INFINITY i\u003c/code\u003e\u003c/p\u003e\n     *\n     * @return the conjugate of this Complex object\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.divide(org.apache.commons.math.complex.Complex)",
      "begin_line": 202,
      "end_line": 234,
      "comment": "\n     * Return the quotient of this complex number and the given complex number.\n     * \u003cp\u003e\n     * Implements the definitional formula\n     * \u003cpre\u003e\u003ccode\u003e\n     *    a + bi          ac + bd + (bc - ad)i\n     *    ----------- \u003d -------------------------\n     *    c + di               c\u003csup\u003e2\u003c/sup\u003e + d\u003csup\u003e2\u003c/sup\u003e\n     * \u003c/code\u003e\u003c/pre\u003e\n     * but uses \n     * \u003ca href\u003d\"http://doi.acm.org/10.1145/1039813.1039814\"\u003e\n     * prescaling of operands\u003c/a\u003e to limit the effects of overflows and\n     * underflows in the computation.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite and NaN values are handled / returned according to the\n     * following rules, applied in the order presented:\n     * \u003cul\u003e\n     * \u003cli\u003eIf either this or \u003ccode\u003erhs\u003c/code\u003e has a NaN value in either part,\n     *  {@link #NaN} is returned.\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003erhs\u003c/code\u003e equals {@link #ZERO}, {@link #NaN} is returned.\n     * \u003c/li\u003e\n     * \u003cli\u003eIf this and \u003ccode\u003erhs\u003c/code\u003e are both infinite,\n     * {@link #NaN} is returned.\u003c/li\u003e\n     * \u003cli\u003eIf this is finite (i.e., has no infinite or NaN parts) and\n     *  \u003ccode\u003erhs\u003c/code\u003e is infinite (one or both parts infinite), \n     * {@link #ZERO} is returned.\u003c/li\u003e\n     * \u003cli\u003eIf this is infinite and \u003ccode\u003erhs\u003c/code\u003e is finite, NaN values are\n     * returned in the parts of the result if the {@link java.lang.Double}\n     * rules applied to the definitional formula force NaN results.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param rhs the other complex number\n     * @return the complex number quotient\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 33)",
        "(line 208,col 9)-(line 208,col 38)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 233,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.equals(java.lang.Object)",
      "begin_line": 254,
      "end_line": 277,
      "comment": "\n     * Test for the equality of two Complex objects.\n     * \u003cp\u003e\n     * If both the real and imaginary parts of two Complex numbers\n     * are exactly the same, and neither is \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two\n     * Complex objects are considered to be equal.\u003c/p\u003e\n     * \u003cp\u003e\n     * All \u003ccode\u003eNaN\u003c/code\u003e values are considered to be equal - i.e, if either\n     * (or both) real and imaginary parts of the complex number are equal\n     * to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the complex number is equal to \n     * \u003ccode\u003eComplex.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two Complex objects are equal, false if\n     *         object is null, not an instance of Complex, or\n     *         not equal to this Complex instance\n     * \n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 20)",
        "(line 258,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.hashCode()",
      "begin_line": 286,
      "end_line": 293,
      "comment": "\n     * Get a hashCode for the complex number.\n     * \u003cp\u003e\n     * All NaN values have the same hash code.\u003c/p\u003e\n     * \n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 292,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getImaginary()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * Access the imaginary part.\n     *\n     * @return the imaginary part\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getReal()",
      "begin_line": 309,
      "end_line": 311,
      "comment": "\n     * Access the real part.\n     *\n     * @return the real part\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.isNaN()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Returns true if either or both parts of this complex number is NaN;\n     * false otherwise\n     *\n     * @return  true if either or both parts of this complex number is NaN;\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.isInfinite()",
      "begin_line": 333,
      "end_line": 336,
      "comment": "\n     * Returns true if either the real or imaginary part of this complex number\n     * takes an infinite value (either \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e or \n     * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e) and neither part\n     * is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @return true if one or both parts of this complex number are infinite\n     * and neither part is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 335,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.multiply(org.apache.commons.math.complex.Complex)",
      "begin_line": 365,
      "end_line": 376,
      "comment": "\n     * Return the product of this complex number and the given complex number.\n     * \u003cp\u003e\n     * Implements preliminary checks for NaN and infinity followed by\n     * the definitional formula:\n     * \u003cpre\u003e\u003ccode\u003e\n     * (a + bi)(c + di) \u003d (ac - bd) + (ad + bc)i\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link #NaN} if either this or \u003ccode\u003erhs\u003c/code\u003e has one or more\n     * NaN parts.\n     * \u003c/p\u003e\n     * Returns {@link #INF} if neither this nor \u003ccode\u003erhs\u003c/code\u003e has one or more\n     * NaN parts and if either this or \u003ccode\u003erhs\u003c/code\u003e has one or more\n     * infinite parts (same result is returned regardless of the sign of the\n     * components).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Returns finite values in components of the result per the\n     * definitional formula in all remaining cases.\n     *  \u003c/p\u003e\n     * \n     * @param rhs the other complex number\n     * @return the complex number product\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 375,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.negate()",
      "begin_line": 386,
      "end_line": 392,
      "comment": "\n     * Return the additive inverse of this complex number.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eComplex.NaN\u003c/code\u003e if either real or imaginary\n     * part of this Complex number equals \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the negation of this complex number\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 391,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.subtract(org.apache.commons.math.complex.Complex)",
      "begin_line": 412,
      "end_line": 419,
      "comment": "\n     * Return the difference between this complex number and the given complex\n     * number.\n      * \u003cp\u003e\n     * Uses the definitional formula \n     * \u003cpre\u003e\n     * (a + bi) - (c + di) \u003d (a-c) + (b-d)i\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * If either this or \u003ccode\u003erhs\u003c/code\u003e has a NaN value in either part,\n     * {@link #NaN} is returned; otherwise inifinite and NaN values are\n     * returned in the parts of the result according to the rules for\n     * {@link java.lang.Double} arithmetic. \u003c/p\u003e\n     * \n     * @param rhs the other complex number\n     * @return the complex number difference\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 415,col 9)",
        "(line 417,col 9)-(line 418,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.acos()",
      "begin_line": 435,
      "end_line": 442,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseCosine.html\" TARGET\u003d\"_top\"\u003e\n     * inverse cosine\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e acos(z) \u003d -i (log(z + i (sqrt(1 - z\u003csup\u003e2\u003c/sup\u003e))))\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite.\u003c/p\u003e\n     * \n     * @return the inverse cosine of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 441,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.asin()",
      "begin_line": 458,
      "end_line": 465,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseSine.html\" TARGET\u003d\"_top\"\u003e\n     * inverse sine\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e asin(z) \u003d -i (log(sqrt(1 - z\u003csup\u003e2\u003c/sup\u003e) + iz)) \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite.\u003c/p\u003e\n     * \n     * @return the inverse sine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 461,col 9)",
        "(line 463,col 9)-(line 464,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.atan()",
      "begin_line": 481,
      "end_line": 488,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseTangent.html\" TARGET\u003d\"_top\"\u003e\n     * inverse tangent\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e atan(z) \u003d (i/2) log((i + z)/(i - z)) \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite.\u003c/p\u003e\n     * \n     * @return the inverse tangent of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 487,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.cos()",
      "begin_line": 516,
      "end_line": 523,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Cosine.html\" TARGET\u003d\"_top\"\u003e\n     * cosine\u003c/a\u003e\n     * of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e cos(a + bi) \u003d cos(a)cosh(b) - sin(a)sinh(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * cos(1 \u0026plusmn; INFINITY i) \u003d 1 \u0026#x2213; INFINITY i\n     * cos(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     * cos(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the cosine of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 522,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.cosh()",
      "begin_line": 550,
      "end_line": 557,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e cosh(a + bi) \u003d cosh(a)cos(b) + sinh(a)sin(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * cosh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * cosh(\u0026plusmn;INFINITY + i) \u003d INFINITY \u0026plusmn; INFINITY i\n     * cosh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the hyperbolic cosine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 553,col 9)",
        "(line 555,col 9)-(line 556,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.exp()",
      "begin_line": 585,
      "end_line": 592,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialFunction.html\" TARGET\u003d\"_top\"\u003e\n     * exponential function\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e exp(a + bi) \u003d exp(a)cos(b) + exp(a)sin(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#exp}, {@link java.lang.Math#cos}, and\n     * {@link java.lang.Math#sin}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * exp(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * exp(INFINITY + i) \u003d INFINITY + INFINITY i\n     * exp(-INFINITY + i) \u003d 0 + 0i\n     * exp(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return \u003ci\u003ee\u003c/i\u003e\u003csup\u003e\u003ccode\u003ethis\u003c/code\u003e\u003c/sup\u003e\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 588,col 9)",
        "(line 590,col 9)-(line 590,col 40)",
        "(line 591,col 9)-(line 591,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.log()",
      "begin_line": 623,
      "end_line": 630,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NaturalLogarithm.html\" TARGET\u003d\"_top\"\u003e\n     * natural logarithm\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e log(a + bi) \u003d ln(|a + bi|) + arg(a + bi)i\u003c/code\u003e\u003c/pre\u003e\n     * where ln on the right hand side is {@link java.lang.Math#log},\n     * \u003ccode\u003e|a + bi|\u003c/code\u003e is the modulus, {@link Complex#abs},  and\n     * \u003ccode\u003earg(a + bi) \u003d {@link java.lang.Math#atan2}(b, a)\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite (or critical) values in real or imaginary parts of the input may\n     * result in infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * log(1 \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (\u0026pi;/2)i\n     * log(INFINITY + i) \u003d INFINITY + 0i\n     * log(-INFINITY + i) \u003d INFINITY + \u0026pi;i\n     * log(INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (\u0026pi;/4)i\n     * log(-INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (3\u0026pi;/4)i\n     * log(0 + 0i) \u003d -INFINITY + 0i\n     * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return ln of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 626,col 9)",
        "(line 628,col 9)-(line 629,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.pow(org.apache.commons.math.complex.Complex)",
      "begin_line": 649,
      "end_line": 654,
      "comment": "\n     * Returns of value of this complex number raised to the power of \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e y\u003csup\u003ex\u003c/sup\u003e \u003d exp(x\u0026middot;log(y))\u003c/code\u003e\u003c/pre\u003e \n     * where \u003ccode\u003eexp\u003c/code\u003e and \u003ccode\u003elog\u003c/code\u003e are {@link #exp} and\n     * {@link #log}, respectively.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite, or if \u003ccode\u003ey\u003c/code\u003e\n     * equals {@link Complex#ZERO}.\u003c/p\u003e\n     * \n     * @param x the exponent.\n     * @return \u003ccode\u003ethis\u003c/code\u003e\u003csup\u003e\u003ccode\u003ex\u003c/code\u003e\u003c/sup\u003e\n     * @throws NullPointerException if x is null\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 653,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sin()",
      "begin_line": 682,
      "end_line": 689,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Sine.html\" TARGET\u003d\"_top\"\u003e\n     * sine\u003c/a\u003e\n     * of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e sin(a + bi) \u003d sin(a)cosh(b) - cos(a)sinh(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * sin(1 \u0026plusmn; INFINITY i) \u003d 1 \u0026plusmn; INFINITY i\n     * sin(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     * sin(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the sine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 685,col 9)",
        "(line 687,col 9)-(line 688,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sinh()",
      "begin_line": 716,
      "end_line": 723,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic sine\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e sinh(a + bi) \u003d sinh(a)cos(b)) + cosh(a)sin(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * sinh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * sinh(\u0026plusmn;INFINITY + i) \u003d \u0026plusmn; INFINITY + INFINITY i\n     * sinh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the hyperbolic sine of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 719,col 9)",
        "(line 721,col 9)-(line 722,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sqrt()",
      "begin_line": 758,
      "end_line": 774,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/SquareRoot.html\" TARGET\u003d\"_top\"\u003e\n     * square root\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the following algorithm to compute \u003ccode\u003esqrt(a + bi)\u003c/code\u003e: \n     * \u003col\u003e\u003cli\u003eLet \u003ccode\u003et \u003d sqrt((|a| + |a + bi|) / 2)\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cpre\u003eif \u003ccode\u003e a \u0026#8805; 0\u003c/code\u003e return \u003ccode\u003et + (b/2t)i\u003c/code\u003e\n     *  else return \u003ccode\u003e|b|/2t + sign(b)t i \u003c/code\u003e\u003c/pre\u003e\u003c/li\u003e\n     * \u003c/ol\u003e\n     * where \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e|a| \u003d {@link Math#abs}(a)\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e|a + bi| \u003d {@link Complex#abs}(a + bi) \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003esign(b) \u003d  {@link MathUtils#indicator}(b) \u003c/code\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * sqrt(1 \u0026plusmn; INFINITY i) \u003d INFINITY + NaN i\n     * sqrt(INFINITY + i) \u003d INFINITY + 0i\n     * sqrt(-INFINITY + i) \u003d 0 + INFINITY i\n     * sqrt(INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY + NaN i\n     * sqrt(-INFINITY \u0026plusmn; INFINITY i) \u003d NaN \u0026plusmn; INFINITY i\n     * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the square root of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 761,col 9)",
        "(line 763,col 9)-(line 765,col 9)",
        "(line 767,col 9)-(line 767,col 61)",
        "(line 768,col 9)-(line 773,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sqrt1z()",
      "begin_line": 794,
      "end_line": 796,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/SquareRoot.html\" TARGET\u003d\"_top\"\u003e\n     * square root\u003c/a\u003e of 1 - \u003ccode\u003ethis\u003c/code\u003e\u003csup\u003e2\u003c/sup\u003e for this complex\n     * number.\n     * \u003cp\u003e\n     * Computes the result directly as \n     * \u003ccode\u003esqrt(Complex.ONE.subtract(z.multiply(z)))\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003c/p\u003e\n     * \n     * @return the square root of 1 - \u003ccode\u003ethis\u003c/code\u003e\u003csup\u003e2\u003c/sup\u003e\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.tan()",
      "begin_line": 824,
      "end_line": 834,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Tangent.html\" TARGET\u003d\"_top\"\u003e\n     * tangent\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003etan(a + bi) \u003d sin(2a)/(cos(2a)+cosh(2b)) + [sinh(2b)/(cos(2a)+cosh(2b))]i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite (or critical) values in real or imaginary parts of the input may\n     * result in infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * tan(1 \u0026plusmn; INFINITY i) \u003d 0 + NaN i\n     * tan(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     * tan(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * tan(\u0026plusmn;\u0026pi;/2 + 0 i) \u003d \u0026plusmn;INFINITY + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the tangent of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 827,col 9)",
        "(line 829,col 9)-(line 829,col 34)",
        "(line 830,col 9)-(line 830,col 44)",
        "(line 831,col 9)-(line 831,col 64)",
        "(line 833,col 9)-(line 833,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.tanh()",
      "begin_line": 862,
      "end_line": 872,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicTangent.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic tangent\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003etan(a + bi) \u003d sinh(2a)/(cosh(2a)+cos(2b)) + [sin(2b)/(cosh(2a)+cos(2b))]i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * tanh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * tanh(\u0026plusmn;INFINITY + i) \u003d NaN + 0 i\n     * tanh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * tanh(0 + (\u0026pi;/2)i) \u003d NaN + INFINITY i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return the hyperbolic tangent of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 865,col 9)",
        "(line 867,col 9)-(line 867,col 34)",
        "(line 868,col 9)-(line 868,col 44)",
        "(line 869,col 9)-(line 869,col 64)",
        "(line 871,col 9)-(line 871,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getArgument()",
      "begin_line": 890,
      "end_line": 892,
      "comment": "\n     * \u003cp\u003eCompute the argument of this complex number.\n     * \u003c/p\u003e\n     * \u003cp\u003eThe argument is the angle phi between the positive real axis and the point\n     * representing this number in the complex plane. The value returned is between -PI (not inclusive) \n     * and PI (inclusive), with negative values returned for numbers with negative imaginary parts.\n     * \u003c/p\u003e\n     * \u003cp\u003eIf either real or imaginary part (or both) is NaN, NaN is returned.  Infinite parts are handled\n     * as java.Math.atan2 handles them, essentially treating finite parts as zero in the presence of\n     * an infinite coordinate and returning a multiple of pi/4 depending on the signs of the infinite\n     * parts.  See the javadoc for java.Math.atan2 for full details.\u003c/p\u003e\n     * \n     * @return the argument of this complex number\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.nthRoot(int)",
      "begin_line": 912,
      "end_line": 948,
      "comment": "\n     * \u003cp\u003eComputes the n-th roots of this complex number.\n     * \u003c/p\u003e\n     * \u003cp\u003eThe nth roots are defined by the formula: \u003cpre\u003e\n     * \u003ccode\u003e z\u003csub\u003ek\u003c/sub\u003e \u003d abs\u003csup\u003e 1/n\u003c/sup\u003e (cos(phi + 2\u0026pi;k/n) + i (sin(phi + 2\u0026pi;k/n))\u003c/code\u003e\u003c/pre\u003e\n     * for \u003ci\u003e\u003ccode\u003ek\u003d0, 1, ..., n-1\u003c/code\u003e\u003c/i\u003e, where \u003ccode\u003eabs\u003c/code\u003e and \u003ccode\u003ephi\u003c/code\u003e are\n     * respectively the {@link #abs() modulus} and {@link #getArgument() argument} of this complex number.\n     * \u003c/p\u003e\n     * \u003cp\u003eIf one or both parts of this complex number is NaN, a list with just one element,\n     *  {@link #NaN} is returned.\u003c/p\u003e\n     * \u003cp\u003eif neither part is NaN, but at least one part is infinite, the result is a one-element\n     * list containing {@link #INF}.\u003c/p\u003e\n     * \n     * @param n degree of root\n     * @return List\u003cComplex\u003e all nth roots of this complex number\n     * @throws IllegalArgumentException if parameter n is less than or equal to 0\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 918,col 9)",
        "(line 920,col 9)-(line 920,col 56)",
        "(line 922,col 9)-(line 925,col 9)",
        "(line 927,col 9)-(line 930,col 9)",
        "(line 933,col 9)-(line 933,col 61)",
        "(line 936,col 9)-(line 936,col 46)",
        "(line 937,col 9)-(line 937,col 45)",
        "(line 938,col 9)-(line 938,col 34)",
        "(line 939,col 9)-(line 945,col 9)",
        "(line 947,col 9)-(line 947,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.createComplex(double, double)",
      "begin_line": 958,
      "end_line": 960,
      "comment": "\n     * Create a complex number given the real and imaginary parts.\n     *\n     * @param real the real part\n     * @param imaginary the imaginary part\n     * @return a new complex number instance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 959,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getField()",
      "begin_line": 963,
      "end_line": 965,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 964,col 9)-(line 964,col 42)"
      ]
    }
  ]
}