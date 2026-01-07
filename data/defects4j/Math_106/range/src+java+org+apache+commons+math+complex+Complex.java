{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/complex/Complex.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Complex",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 397,
      "comment": "\n * Representation of a Complex number - a number which has both a \n * real and imaginary part.\n * \u003cp\u003e\n * Implementations of arithmetic operations handle \u003ccode\u003eNaN\u003c/code\u003e and\n * infinite values according to the rules for {@link java.lang.Double}\n * arithmetic, applying definitional formulas and returning \u003ccode\u003eNaN\u003c/code\u003e or\n * infinite values in real or imaginary parts as these arise in computation. \n * See individual method javadocs for details.\n * \u003cp\u003e\n * {@link #equals} identifies all values with \u003ccode\u003eNaN\u003c/code\u003e in either real \n * or imaginary part - e.g., \u003cpre\u003e\n * \u003ccode\u003e1 + NaNi  \u003d\u003d NaN + i \u003d\u003d NaN + NaNi.\u003c/code\u003e\u003c/pre\u003e\n *\n * @author Apache Software Foundation\n * @version $Revision$ $Date$\n "
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
        "ONE"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " A complex number representing \"1.0 + 0.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " A complex number representing \"0.0 + 0.0i\" "
    },
    {
      "type": "field",
      "varNames": [
        "imaginary"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The imaginary part "
    },
    {
      "type": "field",
      "varNames": [
        "real"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " The real part "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.Complex.Complex(double, double)",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * Create a complex number given the real and imaginary parts.\n     *\n     * @param real the real part\n     * @param imaginary the imaginary part\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 16)",
        "(line 70,col 9)-(line 70,col 25)",
        "(line 71,col 9)-(line 71,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.abs()",
      "begin_line": 84,
      "end_line": 106,
      "comment": "\n     * Return the absolute value of this complex number.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eNaN\u003c/code\u003e if either real or imaginary part is\n     * \u003ccode\u003eNaN\u003c/code\u003e and \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e if\n     * neither part is \u003ccode\u003eNaN\u003c/code\u003e, but at least one part takes an infinite\n     * value.\n     *\n     * @return the absolute value\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.add(org.apache.commons.math.complex.Complex)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * Return the sum of this complex number and the given complex number.\n     * \u003cp\u003e\n     * Uses the definitional formula \n     * \u003cpre\u003e\n     * (a + bi) + (c + di) \u003d (a+c) + (b+d)i\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * If either this or \u003ccode\u003erhs\u003c/code\u003e has a NaN value in either part,\n     * {@link #NaN} is returned; otherwise Inifinite and NaN values are\n     * returned in the parts of the result according to the rules for\n     * {@link java.lang.Double} arithmetic. \n     *\n     * @param rhs the other complex number\n     * @return the complex number sum\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 127,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.conjugate()",
      "begin_line": 144,
      "end_line": 149,
      "comment": "\n     * Return the conjugate of this complex number. The conjugate of\n     * \"A + Bi\" is \"A - Bi\". \n     * \u003cp\u003e\n     * {@link #NaN} is returned if either the real or imaginary\n     * part of this Complex number equals \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     * \u003cp\u003e\n     * If the imaginary part is infinite, and the real part is not NaN, \n     * the returned value has infinite imaginary part of the opposite\n     * sign - e.g. the conjugate of \u003ccode\u003e1 + POSITIVE_INFINITY i\u003c/code\u003e\n     * is \u003ccode\u003e1 - NEGATIVE_INFINITY i\u003c/code\u003e\n     *\n     * @return the conjugate of this Complex object\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.divide(org.apache.commons.math.complex.Complex)",
      "begin_line": 186,
      "end_line": 218,
      "comment": "\n     * Return the quotient of this complex number and the given complex number.\n     * \u003cp\u003e\n     * Implements the definitional formula\n     * \u003cpre\u003e\u003ccode\u003e\n     *    a + bi          ac + bd + (bc - ad)i\n     *    ----------- \u003d -------------------------\n     *    c + di               c\u003csup\u003e2\u003c/sup\u003e + d\u003csup\u003e2\u003c/sup\u003e\n     * \u003c/code\u003e\u003c/pre\u003e\n     * but uses \n     * \u003ca href\u003d\"http://doi.acm.org/10.1145/1039813.1039814\"\u003e\n     * prescaling of operands\u003c/a\u003e to limit the effects of overflows and\n     * underflows in the computation.\n     * \u003cp\u003e\n     * Infinite and NaN values are handled / returned according to the\n     * following rules, applied in the order presented:\n     * \u003cul\u003e\n     * \u003cli\u003eIf either this or \u003ccode\u003erhs\u003c/code\u003e has a NaN value in either part,\n     *  {@link #NaN} is returned.\u003c/li\u003e\n     * \u003cli\u003eIf \u003ccode\u003erhs\u003c/code\u003e equals {@link #ZERO}, {@link #NaN} is returned.\n     * \u003c/li\u003e\n     * \u003cli\u003eIf this and \u003ccode\u003erhs\u003c/code\u003e are both infinite,\n     * {@link #NaN} is returned.\u003c/li\u003e\n     * \u003cli\u003eIf this is finite (i.e., has no infinite or NaN parts) and\n     *  \u003ccode\u003erhs\u003c/code\u003e is infinite (one or both parts infinite), \n     * {@link #ZERO} is returned.\u003c/li\u003e\n     * \u003cli\u003eIf this is infinite and \u003ccode\u003erhs\u003c/code\u003e is finite, NaN values are\n     * returned in the parts of the result if the {@link java.lang.Double}\n     * rules applied to the definitional formula force NaN results.\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param rhs the other complex number\n     * @return the complex number quotient\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 33)",
        "(line 192,col 9)-(line 192,col 38)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 217,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.equals(java.lang.Object)",
      "begin_line": 238,
      "end_line": 263,
      "comment": "\n     * Test for the equality of two Complex objects.\n     * \u003cp\u003e\n     * If both the real and imaginary parts of two Complex numbers\n     * are exactly the same, and neither is \u003ccode\u003eDouble.NaN\u003c/code\u003e, the two\n     * Complex objects are considered to be equal. \n     * \u003cp\u003e\n     * All \u003ccode\u003eNaN\u003c/code\u003e values are considered to be equal - i.e, if either\n     * (or both) real and imaginary parts of the complex number are equal\n     * to \u003ccode\u003eDouble.NaN\u003c/code\u003e, the complex number is equal to \n     * \u003ccode\u003eComplex.NaN\u003c/code\u003e.\n     *\n     * @param other Object to test for equality to this\n     * @return true if two Complex objects are equal, false if\n     *         object is null, not an instance of Complex, or\n     *         not equal to this Complex instance\n     * \n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 20)",
        "(line 241,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.hashCode()",
      "begin_line": 272,
      "end_line": 278,
      "comment": "\n     * Get a hashCode for the complex number.\n     * \u003cp\u003e\n     * All NaN values have the same hash code.\n     * \n     * @return a hash code value for this object\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 277,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getImaginary()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n     * Access the imaginary part.\n     *\n     * @return the imaginary part\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.getReal()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * Access the real part.\n     *\n     * @return the real part\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.isNaN()",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * Returns true if either or both parts of this complex number is NaN;\n     * false otherwise\n     *\n     * @return  true if either or both parts of this complex number is NaN;\n     * false otherwise\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.isInfinite()",
      "begin_line": 318,
      "end_line": 321,
      "comment": "\n     * Returns true if either the real or imaginary part of this complex number\n     * takes an infinite value (either \u003ccode\u003eDouble.POSITIVE_INFINITY\u003c/code\u003e or \n     * \u003ccode\u003eDouble.NEGATIVE_INFINITY\u003c/code\u003e) and neither part\n     * is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \n     * @return true if one or both parts of this complex number are infinite\n     * and neither part is \u003ccode\u003eNaN\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 320,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.multiply(org.apache.commons.math.complex.Complex)",
      "begin_line": 347,
      "end_line": 353,
      "comment": "\n     * Return the product of this complex number and the given complex number.\n     * \u003cp\u003e\n     * Implements the definitional formula:\n     * \u003cpre\u003e\u003ccode\u003e\n     * (a + bi)(c + di) \u003d (ac - bd) + (ad + bc)i\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns {@link #NaN} if either this or \u003ccode\u003erhs\u003c/code\u003e has one or more\n     * NaN parts.\n     * \u003cp\u003e\n     * Returns NaN or infinite values in components of the result per the\n     * definitional formula and and the rules for {@link java.lang.Double}\n     * arithmetic.  Examples:\n     * \u003cpre\u003e\u003ccode\u003e\n     *  (1 + i) (INF + i)  \u003d  INF + INFi\n     *  (1 + INFi) (1 - INFi) \u003d INF + NaNi\n     *  (-INF + -INFi)(1 + NaNi) \u003d NaN + NaNi\n     *  \u003c/code\u003e\u003c/pre\u003e\n     * \n     * @param rhs the other complex number\n     * @return the complex number product\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 352,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.negate()",
      "begin_line": 363,
      "end_line": 369,
      "comment": "\n     * Return the additive inverse of this complex number.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eComplex.NaN\u003c/code\u003e if either real or imaginary\n     * part of this Complex number equals \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     *\n     * @return the negation of this complex number\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 366,col 9)",
        "(line 368,col 9)-(line 368,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.Complex.subtract(org.apache.commons.math.complex.Complex)",
      "begin_line": 389,
      "end_line": 396,
      "comment": "\n     * Return the difference between this complex number and the given complex\n     * number.\n      * \u003cp\u003e\n     * Uses the definitional formula \n     * \u003cpre\u003e\n     * (a + bi) - (c + di) \u003d (a-c) + (b-d)i\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * If either this or \u003ccode\u003erhs\u003c/code\u003e has a NaN value in either part,\n     * {@link #NaN} is returned; otherwise inifinite and NaN values are\n     * returned in the parts of the result according to the rules for\n     * {@link java.lang.Double} arithmetic. \n     * \n     * @param rhs the other complex number\n     * @return the complex number difference\n     * @throws NullPointerException if \u003ccode\u003erhs\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 395,col 44)"
      ]
    }
  ]
}