{
  "filepath": "/tmp/Math-83b/src/main/java/org/apache/commons/math/complex/Complex.java",
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
      "end_line": 1026,
      "comment": "\n * Representation of a Complex number - a number which has both a \n * real and imaginary part.\n * \u003cp\u003e\n * Implementations of arithmetic operations handle \u003ccode\u003eNaN\u003c/code\u003e and\n * infinite values according to the rules for {@link java.lang.Double}\n * arithmetic, applying definitional formulas and returning \u003ccode\u003eNaN\u003c/code\u003e or\n * infinite values in real or imaginary parts as these arise in computation. \n * See individual method javadocs for details.\u003c/p\u003e\n * \u003cp\u003e\n * {@link #equals} identifies all values with \u003ccode\u003eNaN\u003c/code\u003e in either real \n * or imaginary part - e.g., \u003cpre\u003e\n * \u003ccode\u003e1 + NaNi  \u003d\u003d NaN + i \u003d\u003d NaN + NaNi.\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n *\n * implements Serializable since 2.0\n * \n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serializable version identifier "
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
      "begin_line": 61,
      "end_line": 61,
      "comment": " A complex number representing \"1.0 + 0.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " A complex number representing \"0.0 + 0.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "imaginary"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " \n     * The imaginary part \n     "
    },
    {
      "type": "field",
      "varNames": [
        "real"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " \n     * The real part \n     "
    },
    {
      "type": "field",
      "varNames": [
        "isNaN"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Record whether this complex number is equal to NaN\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isInfinite"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Record whether this complex number is infinite\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.Complex.Complex(double, double)",
      "begin_line": 92,
      "end_line": 100,
      "comment": "\n     * Create a complex number given the real and imaginary parts.\n     *\n     * @param real the real part\n     * @param imaginary the imaginary part\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 16)",
        "(line 94,col 9)-(line 94,col 25)",
        "(line 95,col 9)-(line 95,col 35)",
        "(line 97,col 9)-(line 97,col 62)",
        "(line 98,col 9)-(line 99,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.abs()",
      "begin_line": 112,
      "end_line": 134,
      "comment": "\n     * Return the absolute value of this complex number.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eNaN\u003c/code\u003e if either real or imaginary part is\n     * \u003ccode\u003eNaN\u003c/code\u003e and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e if\n     * neither part is \u003ccode\u003eNaN\u003c/code\u003e, but at least one part takes an infinite\n     * value.\u003c/p\u003e\n     *\n     * @return the absolute value\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.add(org.apache.commons.math.complex.Complex)",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\n     * Return the sum of this complex number and the given complex number.\n     * \u003cp\u003e\n     * Uses the definitional formula \n     * \u003cpre\u003e\n     * (a + bi) + (c + di) \u003d (a+c) + (b+d)i\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * If either this or \u003ccode\u003erhs\u003c/code\u003e has a NaN value in either part,\n     * {@link #NaN} is returned; otherwise Inifinite and NaN values are\n     * returned in the parts of the result according to the rules for\n     * {@link java.lang.Double} arithmetic.\u003c/p\u003e \n     *\n     * @param rhs the other complex number\n     * @return the complex number sum\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 155,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.conjugate()",
      "begin_line": 172,
      "end_line": 177,
      "comment": "\n     * Return the conjugate of this complex number. The conjugate of\n     * \"A + Bi\" is \"A - Bi\". \n     * \u003cp\u003e\n     * {@link #NaN} is returned if either the real or imaginary\n     * part of this Complex number equals \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * If the imaginary part is infinite, and the real part is not NaN, \n     * the returned value has infinite imaginary part of the opposite\n     * sign - e.g. the conjugate of \u003ccode\u003e1 + POSITIVE_INFINITY i\u003c/code\u003e\n     * is \u003ccode\u003e1 - NEGATIVE_INFINITY i\u003c/code\u003e\u003c/p\u003e\n     *\n     * @return the conjugate of this Complex object\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.divide(org.apache.commons.math.complex.Complex)",
      "begin_line": 214,
      "end_line": 246,
      "comment": "\n     * Return the quotient of this complex number and the given complex number.\n     * \u003cp\u003e\n     * Implements the definitional formula\n     * \u003cpre\u003e\u003ccode\u003e\n     *    a + bi          ac + bd + (bc - ad)i\n     *    ----------- \u003d -------------------------\n     *    c + di               c\u003csup\u003e2\u003c/sup\u003e + d\u003csup\u003e2\u003c/sup\u003e\n     * \u003c/code\u003e\u003c/pre\u003e\n     * but uses \n     * \u003ca href\u003d\"http://doi.acm.org/10.1145/1039813.1039814\"\u003e\n     * prescaling of operands\u003c/a\u003e to limit the effects of overflows and\n     * underflows in the computation.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite and NaN values are handled / returned according to the\n     * following rules, applied in the order presented:\n     * \u003cul\u003e\n     * \u003cli\u003eIf either this or \u003ccode\u003erhs\u003c/code\u003e has a NaN value in either part,\n     *  {@link #NaN} is returned.\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003erhs\u003c/code\u003e equals {@link #ZERO}, {@link #NaN} is returned.\n     * \u003c/li\u003e\n     * \u003cli\u003eIf this and \u003ccode\u003erhs\u003c/code\u003e are both infinite,\n     * {@link #NaN} is returned.\u003c/li\u003e\n     * \u003cli\u003eIf this is finite (i.e., has no infinite or NaN parts) and\n     *  \u003ccode\u003erhs\u003c/code\u003e is infinite (one or both parts infinite), \n     * {@link #ZERO} is returned.\u003c/li\u003e\n     * \u003cli\u003eIf this is infinite and \u003ccode\u003erhs\u003c/code\u003e is finite, NaN values are\n     * returned in the parts of the result if the {@link java.lang.Double}\n     * rules applied to the definitional formula force NaN results.\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param rhs the other complex number\n     * @return the complex number quotient\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 33)",
        "(line 220,col 9)-(line 220,col 38)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.equals(java.lang.Object)",
      "begin_line": 266,
      "end_line": 289,
      "comment": "\n     * Test for the equality of two Complex objects.\n     * \u003cp\u003e\n     * If both the real and imaginary parts of two Complex numbers\n     * are exactly the same, and neither is \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two\n     * Complex objects are considered to be equal.\u003c/p\u003e\n     * \u003cp\u003e\n     * All \u003ccode\u003eNaN\u003c/code\u003e values are considered to be equal - i.e, if either\n     * (or both) real and imaginary parts of the complex number are equal\n     * to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the complex number is equal to \n     * \u003ccode\u003eComplex.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param other Object to test for equality to this\n     * @return true if two Complex objects are equal, false if\n     *         object is null, not an instance of Complex, or\n     *         not equal to this Complex instance\n     * \n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 20)",
        "(line 270,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.hashCode()",
      "begin_line": 298,
      "end_line": 305,
      "comment": "\n     * Get a hashCode for the complex number.\n     * \u003cp\u003e\n     * All NaN values have the same hash code.\u003c/p\u003e\n     * \n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 304,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getImaginary()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Access the imaginary part.\n     *\n     * @return the imaginary part\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getReal()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * Access the real part.\n     *\n     * @return the real part\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.isNaN()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Returns true if either or both parts of this complex number is NaN;\n     * false otherwise\n     *\n     * @return  true if either or both parts of this complex number is NaN;\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.isInfinite()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\n     * Returns true if either the real or imaginary part of this complex number\n     * takes an infinite value (either \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e or \n     * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e) and neither part\n     * is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @return true if one or both parts of this complex number are infinite\n     * and neither part is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.multiply(org.apache.commons.math.complex.Complex)",
      "begin_line": 376,
      "end_line": 387,
      "comment": "\n     * Return the product of this complex number and the given complex number.\n     * \u003cp\u003e\n     * Implements preliminary checks for NaN and infinity followed by\n     * the definitional formula:\n     * \u003cpre\u003e\u003ccode\u003e\n     * (a + bi)(c + di) \u003d (ac - bd) + (ad + bc)i\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link #NaN} if either this or \u003ccode\u003erhs\u003c/code\u003e has one or more\n     * NaN parts.\n     * \u003c/p\u003e\n     * Returns {@link #INF} if neither this nor \u003ccode\u003erhs\u003c/code\u003e has one or more\n     * NaN parts and if either this or \u003ccode\u003erhs\u003c/code\u003e has one or more\n     * infinite parts (same result is returned regardless of the sign of the\n     * components).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Returns finite values in components of the result per the\n     * definitional formula in all remaining cases.\n     *  \u003c/p\u003e\n     * \n     * @param rhs the other complex number\n     * @return the complex number product\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 386,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.multiply(double)",
      "begin_line": 415,
      "end_line": 425,
      "comment": "\n     * Return the product of this complex number and the given scalar number.\n     * \u003cp\u003e\n     * Implements preliminary checks for NaN and infinity followed by\n     * the definitional formula:\n     * \u003cpre\u003e\u003ccode\u003e\n     * c(a + bi) \u003d (ca) + (cb)i\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link #NaN} if either this or \u003ccode\u003erhs\u003c/code\u003e has one or more\n     * NaN parts.\n     * \u003c/p\u003e\n     * Returns {@link #INF} if neither this nor \u003ccode\u003erhs\u003c/code\u003e has one or more\n     * NaN parts and if either this or \u003ccode\u003erhs\u003c/code\u003e has one or more\n     * infinite parts (same result is returned regardless of the sign of the\n     * components).\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Returns finite values in components of the result per the\n     * definitional formula in all remaining cases.\n     *  \u003c/p\u003e\n     * \n     * @param rhs the scalar number\n     * @return the complex number product\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 423,col 9)",
        "(line 424,col 9)-(line 424,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.negate()",
      "begin_line": 435,
      "end_line": 441,
      "comment": "\n     * Return the additive inverse of this complex number.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eComplex.NaN\u003c/code\u003e if either real or imaginary\n     * part of this Complex number equals \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return the negation of this complex number\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 440,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.subtract(org.apache.commons.math.complex.Complex)",
      "begin_line": 461,
      "end_line": 468,
      "comment": "\n     * Return the difference between this complex number and the given complex\n     * number.\n      * \u003cp\u003e\n     * Uses the definitional formula \n     * \u003cpre\u003e\n     * (a + bi) - (c + di) \u003d (a-c) + (b-d)i\n     * \u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * If either this or \u003ccode\u003erhs\u003c/code\u003e has a NaN value in either part,\n     * {@link #NaN} is returned; otherwise inifinite and NaN values are\n     * returned in the parts of the result according to the rules for\n     * {@link java.lang.Double} arithmetic. \u003c/p\u003e\n     * \n     * @param rhs the other complex number\n     * @return the complex number difference\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 464,col 9)",
        "(line 466,col 9)-(line 467,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.acos()",
      "begin_line": 484,
      "end_line": 491,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseCosine.html\" TARGET\u003d\"_top\"\u003e\n     * inverse cosine\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e acos(z) \u003d -i (log(z + i (sqrt(1 - z\u003csup\u003e2\u003c/sup\u003e))))\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite.\u003c/p\u003e\n     * \n     * @return the inverse cosine of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 487,col 9)",
        "(line 489,col 9)-(line 490,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.asin()",
      "begin_line": 507,
      "end_line": 514,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseSine.html\" TARGET\u003d\"_top\"\u003e\n     * inverse sine\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e asin(z) \u003d -i (log(sqrt(1 - z\u003csup\u003e2\u003c/sup\u003e) + iz)) \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite.\u003c/p\u003e\n     * \n     * @return the inverse sine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 510,col 9)",
        "(line 512,col 9)-(line 513,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.atan()",
      "begin_line": 530,
      "end_line": 537,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseTangent.html\" TARGET\u003d\"_top\"\u003e\n     * inverse tangent\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e atan(z) \u003d (i/2) log((i + z)/(i - z)) \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite.\u003c/p\u003e\n     * \n     * @return the inverse tangent of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 533,col 9)",
        "(line 535,col 9)-(line 536,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.cos()",
      "begin_line": 565,
      "end_line": 572,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Cosine.html\" TARGET\u003d\"_top\"\u003e\n     * cosine\u003c/a\u003e\n     * of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e cos(a + bi) \u003d cos(a)cosh(b) - sin(a)sinh(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * cos(1 \u0026plusmn; INFINITY i) \u003d 1 \u0026#x2213; INFINITY i\n     * cos(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     * cos(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the cosine of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 568,col 9)",
        "(line 570,col 9)-(line 571,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.cosh()",
      "begin_line": 599,
      "end_line": 606,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic cosine\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e cosh(a + bi) \u003d cosh(a)cos(b) + sinh(a)sin(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * cosh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * cosh(\u0026plusmn;INFINITY + i) \u003d INFINITY \u0026plusmn; INFINITY i\n     * cosh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the hyperbolic cosine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 602,col 9)",
        "(line 604,col 9)-(line 605,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.exp()",
      "begin_line": 634,
      "end_line": 641,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialFunction.html\" TARGET\u003d\"_top\"\u003e\n     * exponential function\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e exp(a + bi) \u003d exp(a)cos(b) + exp(a)sin(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#exp}, {@link java.lang.Math#cos}, and\n     * {@link java.lang.Math#sin}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * exp(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * exp(INFINITY + i) \u003d INFINITY + INFINITY i\n     * exp(-INFINITY + i) \u003d 0 + 0i\n     * exp(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return \u003ci\u003ee\u003c/i\u003e\u003csup\u003e\u003ccode\u003ethis\u003c/code\u003e\u003c/sup\u003e\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 637,col 9)",
        "(line 639,col 9)-(line 639,col 40)",
        "(line 640,col 9)-(line 640,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.log()",
      "begin_line": 672,
      "end_line": 679,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NaturalLogarithm.html\" TARGET\u003d\"_top\"\u003e\n     * natural logarithm\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e log(a + bi) \u003d ln(|a + bi|) + arg(a + bi)i\u003c/code\u003e\u003c/pre\u003e\n     * where ln on the right hand side is {@link java.lang.Math#log},\n     * \u003ccode\u003e|a + bi|\u003c/code\u003e is the modulus, {@link Complex#abs},  and\n     * \u003ccode\u003earg(a + bi) \u003d {@link java.lang.Math#atan2}(b, a)\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite (or critical) values in real or imaginary parts of the input may\n     * result in infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * log(1 \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (\u0026pi;/2)i\n     * log(INFINITY + i) \u003d INFINITY + 0i\n     * log(-INFINITY + i) \u003d INFINITY + \u0026pi;i\n     * log(INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (\u0026pi;/4)i\n     * log(-INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (3\u0026pi;/4)i\n     * log(0 + 0i) \u003d -INFINITY + 0i\n     * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return ln of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 675,col 9)",
        "(line 677,col 9)-(line 678,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.pow(org.apache.commons.math.complex.Complex)",
      "begin_line": 698,
      "end_line": 703,
      "comment": "\n     * Returns of value of this complex number raised to the power of \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e y\u003csup\u003ex\u003c/sup\u003e \u003d exp(x\u0026middot;log(y))\u003c/code\u003e\u003c/pre\u003e \n     * where \u003ccode\u003eexp\u003c/code\u003e and \u003ccode\u003elog\u003c/code\u003e are {@link #exp} and\n     * {@link #log}, respectively.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite, or if \u003ccode\u003ey\u003c/code\u003e\n     * equals {@link Complex#ZERO}.\u003c/p\u003e\n     * \n     * @param x the exponent.\n     * @return \u003ccode\u003ethis\u003c/code\u003e\u003csup\u003e\u003ccode\u003ex\u003c/code\u003e\u003c/sup\u003e\n     * @throws NullPointerException if x is null\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 702,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sin()",
      "begin_line": 731,
      "end_line": 738,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Sine.html\" TARGET\u003d\"_top\"\u003e\n     * sine\u003c/a\u003e\n     * of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e sin(a + bi) \u003d sin(a)cosh(b) - cos(a)sinh(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * sin(1 \u0026plusmn; INFINITY i) \u003d 1 \u0026plusmn; INFINITY i\n     * sin(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     * sin(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the sine of this complex number.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 734,col 9)",
        "(line 736,col 9)-(line 737,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sinh()",
      "begin_line": 765,
      "end_line": 772,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic sine\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e sinh(a + bi) \u003d sinh(a)cos(b)) + cosh(a)sin(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * sinh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * sinh(\u0026plusmn;INFINITY + i) \u003d \u0026plusmn; INFINITY + INFINITY i\n     * sinh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the hyperbolic sine of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 768,col 9)",
        "(line 770,col 9)-(line 771,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sqrt()",
      "begin_line": 807,
      "end_line": 823,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/SquareRoot.html\" TARGET\u003d\"_top\"\u003e\n     * square root\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the following algorithm to compute \u003ccode\u003esqrt(a + bi)\u003c/code\u003e: \n     * \u003col\u003e\u003cli\u003eLet \u003ccode\u003et \u003d sqrt((|a| + |a + bi|) / 2)\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cpre\u003eif \u003ccode\u003e a \u0026#8805; 0\u003c/code\u003e return \u003ccode\u003et + (b/2t)i\u003c/code\u003e\n     *  else return \u003ccode\u003e|b|/2t + sign(b)t i \u003c/code\u003e\u003c/pre\u003e\u003c/li\u003e\n     * \u003c/ol\u003e\n     * where \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e|a| \u003d {@link Math#abs}(a)\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e|a + bi| \u003d {@link Complex#abs}(a + bi) \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003esign(b) \u003d  {@link MathUtils#indicator}(b) \u003c/code\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * sqrt(1 \u0026plusmn; INFINITY i) \u003d INFINITY + NaN i\n     * sqrt(INFINITY + i) \u003d INFINITY + 0i\n     * sqrt(-INFINITY + i) \u003d 0 + INFINITY i\n     * sqrt(INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY + NaN i\n     * sqrt(-INFINITY \u0026plusmn; INFINITY i) \u003d NaN \u0026plusmn; INFINITY i\n     * \u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the square root of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 810,col 9)",
        "(line 812,col 9)-(line 814,col 9)",
        "(line 816,col 9)-(line 816,col 61)",
        "(line 817,col 9)-(line 822,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.sqrt1z()",
      "begin_line": 843,
      "end_line": 845,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/SquareRoot.html\" TARGET\u003d\"_top\"\u003e\n     * square root\u003c/a\u003e of 1 - \u003ccode\u003ethis\u003c/code\u003e\u003csup\u003e2\u003c/sup\u003e for this complex\n     * number.\n     * \u003cp\u003e\n     * Computes the result directly as \n     * \u003ccode\u003esqrt(Complex.ONE.subtract(z.multiply(z)))\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003c/p\u003e\n     * \n     * @return the square root of 1 - \u003ccode\u003ethis\u003c/code\u003e\u003csup\u003e2\u003c/sup\u003e\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.tan()",
      "begin_line": 873,
      "end_line": 883,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Tangent.html\" TARGET\u003d\"_top\"\u003e\n     * tangent\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003etan(a + bi) \u003d sin(2a)/(cos(2a)+cosh(2b)) + [sinh(2b)/(cos(2a)+cosh(2b))]i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite (or critical) values in real or imaginary parts of the input may\n     * result in infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * tan(1 \u0026plusmn; INFINITY i) \u003d 0 + NaN i\n     * tan(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     * tan(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * tan(\u0026plusmn;\u0026pi;/2 + 0 i) \u003d \u0026plusmn;INFINITY + NaN i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     * \n     * @return the tangent of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 874,col 9)-(line 876,col 9)",
        "(line 878,col 9)-(line 878,col 34)",
        "(line 879,col 9)-(line 879,col 44)",
        "(line 880,col 9)-(line 880,col 64)",
        "(line 882,col 9)-(line 882,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.tanh()",
      "begin_line": 911,
      "end_line": 921,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicTangent.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic tangent\u003c/a\u003e of this complex number.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003etan(a + bi) \u003d sinh(2a)/(cosh(2a)+cos(2b)) + [sin(2b)/(cosh(2a)+cos(2b))]i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\u003c/p\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * tanh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * tanh(\u0026plusmn;INFINITY + i) \u003d NaN + 0 i\n     * tanh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * tanh(0 + (\u0026pi;/2)i) \u003d NaN + INFINITY i\u003c/code\u003e\u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return the hyperbolic tangent of this complex number\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 914,col 9)",
        "(line 916,col 9)-(line 916,col 34)",
        "(line 917,col 9)-(line 917,col 44)",
        "(line 918,col 9)-(line 918,col 64)",
        "(line 920,col 9)-(line 920,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getArgument()",
      "begin_line": 939,
      "end_line": 941,
      "comment": "\n     * \u003cp\u003eCompute the argument of this complex number.\n     * \u003c/p\u003e\n     * \u003cp\u003eThe argument is the angle phi between the positive real axis and the point\n     * representing this number in the complex plane. The value returned is between -PI (not inclusive) \n     * and PI (inclusive), with negative values returned for numbers with negative imaginary parts.\n     * \u003c/p\u003e\n     * \u003cp\u003eIf either real or imaginary part (or both) is NaN, NaN is returned.  Infinite parts are handled\n     * as java.Math.atan2 handles them, essentially treating finite parts as zero in the presence of\n     * an infinite coordinate and returning a multiple of pi/4 depending on the signs of the infinite\n     * parts.  See the javadoc for java.Math.atan2 for full details.\u003c/p\u003e\n     * \n     * @return the argument of this complex number\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.nthRoot(int)",
      "begin_line": 961,
      "end_line": 997,
      "comment": "\n     * \u003cp\u003eComputes the n-th roots of this complex number.\n     * \u003c/p\u003e\n     * \u003cp\u003eThe nth roots are defined by the formula: \u003cpre\u003e\n     * \u003ccode\u003e z\u003csub\u003ek\u003c/sub\u003e \u003d abs\u003csup\u003e 1/n\u003c/sup\u003e (cos(phi + 2\u0026pi;k/n) + i (sin(phi + 2\u0026pi;k/n))\u003c/code\u003e\u003c/pre\u003e\n     * for \u003ci\u003e\u003ccode\u003ek\u003d0, 1, ..., n-1\u003c/code\u003e\u003c/i\u003e, where \u003ccode\u003eabs\u003c/code\u003e and \u003ccode\u003ephi\u003c/code\u003e are\n     * respectively the {@link #abs() modulus} and {@link #getArgument() argument} of this complex number.\n     * \u003c/p\u003e\n     * \u003cp\u003eIf one or both parts of this complex number is NaN, a list with just one element,\n     *  {@link #NaN} is returned.\u003c/p\u003e\n     * \u003cp\u003eif neither part is NaN, but at least one part is infinite, the result is a one-element\n     * list containing {@link #INF}.\u003c/p\u003e\n     * \n     * @param n degree of root\n     * @return List\u003cComplex\u003e all nth roots of this complex number\n     * @throws IllegalArgumentException if parameter n is less than or equal to 0\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 963,col 9)-(line 967,col 9)",
        "(line 969,col 9)-(line 969,col 56)",
        "(line 971,col 9)-(line 974,col 9)",
        "(line 976,col 9)-(line 979,col 9)",
        "(line 982,col 9)-(line 982,col 61)",
        "(line 985,col 9)-(line 985,col 46)",
        "(line 986,col 9)-(line 986,col 45)",
        "(line 987,col 9)-(line 987,col 34)",
        "(line 988,col 9)-(line 994,col 9)",
        "(line 996,col 9)-(line 996,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.createComplex(double, double)",
      "begin_line": 1007,
      "end_line": 1009,
      "comment": "\n     * Create a complex number given the real and imaginary parts.\n     *\n     * @param real the real part\n     * @param imaginary the imaginary part\n     * @return a new complex number instance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.readResolve()",
      "begin_line": 1017,
      "end_line": 1019,
      "comment": "\n     * \u003cp\u003eResolve the transient fields in a deserialized Complex Object.\u003c/p\u003e\n     * \u003cp\u003eSubclasses will need to override {@link #createComplex} to deserialize properly\u003c/p\u003e \n     * @return A Complex instance with all fields resolved.\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getField()",
      "begin_line": 1022,
      "end_line": 1024,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 1023,col 9)-(line 1023,col 42)"
      ]
    }
  ]
}