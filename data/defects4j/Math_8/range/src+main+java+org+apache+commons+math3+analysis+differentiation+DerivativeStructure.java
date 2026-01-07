{
  "filepath": "/tmp/Math-8b/src/main/java/org/apache/commons/math3/analysis/differentiation/DerivativeStructure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DerivativeStructure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.ExtendedFieldElement\u003corg.apache.commons.math3.analysis.differentiation.DerivativeStructure\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 61,
      "end_line": 1024,
      "comment": " Class representing both the value and the differentials of a function.\n * \u003cp\u003eThis class is the workhorse of the differentiation package.\u003c/p\u003e\n * \u003cp\u003eThis class is an implementation of the extension to Rall\u0027s\n * numbers described in Dan Kalman\u0027s paper \u003ca\n * href\u003d\"http://www.math.american.edu/People/kalman/pdffiles/mmgautodiff.pdf\"\u003eDoubly\n * Recursive Multivariate Automatic Differentiation\u003c/a\u003e, Mathematics Magazine, vol. 75,\n * no. 3, June 2002.\u003c/p\u003e. Rall\u0027s numbers are an extension to the real numbers used\n * throughout mathematical expressions; they hold the derivative together with the\n * value of a function. Dan Kalman\u0027s derivative structures hold all partial derivatives\n * up to any specified order, with respect to any number of free parameters. Rall\u0027s\n * numbers therefore can be seen as derivative structures for order one derivative and\n * one free parameter, and real numbers can be seen as derivative structures with zero\n * order derivative and no free parameters.\u003c/p\u003e\n * \u003cp\u003e{@link DerivativeStructure} instances can be used directly thanks to\n * the arithmetic operators to the mathematical functions provided as static\n * methods by this class (+, -, *, /, %, sin, cos ...).\u003c/p\u003e\n * \u003cp\u003eImplementing complex expressions by hand using these classes is\n * a tedious and error-prone task but has the advantage of having no limitation\n * on the derivation order despite no requiring users to compute the derivatives by\n * themselves. Implementing complex expression can also be done by developing computation\n * code using standard primitive double values and to use {@link\n * UnivariateFunctionDifferentiator differentiators} to create the {@link\n * DerivativeStructure}-based instances. This method is simpler but may be limited in\n * the accuracy and derivation orders and may be computationally intensive (this is\n * typically the case for {@link FiniteDifferencesDifferentiator finite differences\n * differentiator}.\u003c/p\u003e\n * \u003cp\u003eInstances of this class are guaranteed to be immutable.\u003c/p\u003e\n * @see DSCompiler\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Compiler for the current dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Combined array holding all values. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 75,
      "end_line": 78,
      "comment": " Build an instance with all values and derivatives set to 0.\n     * @param compiler compiler to use for computation\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 33)",
        "(line 77,col 9)-(line 77,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int)",
      "begin_line": 84,
      "end_line": 86,
      "comment": " Build an instance with all values and derivatives set to 0.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int, double)",
      "begin_line": 94,
      "end_line": 97,
      "comment": " Build an instance representing a constant value.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param value value of the constant\n     * @see #DerivativeStructure(int, int, int, double)\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 32)",
        "(line 96,col 9)-(line 96,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int, int, double)",
      "begin_line": 111,
      "end_line": 125,
      "comment": " Build an instance representing a variable.\n     * \u003cp\u003eInstances built using this constructor are considered\n     * to be the free variables with respect to which differentials\n     * are computed. As such, their differential with respect to\n     * themselves is +1.\u003c/p\u003e\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param index index of the variable (from 0 to {@code parameters - 1})\n     * @param value value of the variable\n     * @exception NumberIsTooLargeException if {@code index \u003e\u003d parameters}.\n     * @see #DerivativeStructure(int, int, double)\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 39)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 135,
      "end_line": 141,
      "comment": " Linear combination constructor.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2\n     * @param a1 first scale factor\n     * @param ds1 first base (unscaled) derivative structure\n     * @param a2 second scale factor\n     * @param ds2 second base (unscaled) derivative structure\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 27)",
        "(line 139,col 9)-(line 139,col 50)",
        "(line 140,col 9)-(line 140,col 78)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 153,
      "end_line": 161,
      "comment": " Linear combination constructor.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3\n     * @param a1 first scale factor\n     * @param ds1 first base (unscaled) derivative structure\n     * @param a2 second scale factor\n     * @param ds2 second base (unscaled) derivative structure\n     * @param a3 third scale factor\n     * @param ds3 third base (unscaled) derivative structure\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 27)",
        "(line 158,col 9)-(line 158,col 50)",
        "(line 159,col 9)-(line 159,col 50)",
        "(line 160,col 9)-(line 160,col 95)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 175,
      "end_line": 187,
      "comment": " Linear combination constructor.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3 + a4 * ds4\n     * @param a1 first scale factor\n     * @param ds1 first base (unscaled) derivative structure\n     * @param a2 second scale factor\n     * @param ds2 second base (unscaled) derivative structure\n     * @param a3 third scale factor\n     * @param ds3 third base (unscaled) derivative structure\n     * @param a4 fourth scale factor\n     * @param ds4 fourth base (unscaled) derivative structure\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 27)",
        "(line 181,col 9)-(line 181,col 50)",
        "(line 182,col 9)-(line 182,col 50)",
        "(line 183,col 9)-(line 183,col 50)",
        "(line 184,col 9)-(line 186,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int, double...)",
      "begin_line": 198,
      "end_line": 205,
      "comment": " Build an instance from all its derivatives.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param derivatives derivatives sorted according to\n     * {@link DSCompiler#getPartialDerivativeIndex(int...)}\n     * @exception DimensionMismatchException if derivatives array does not match the\n     * {@link DSCompiler#getSize() size} expected by the compiler\n     * @see #getAllDerivatives()\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 32)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 210,
      "end_line": 213,
      "comment": " Copy constructor.\n     * @param ds instance to copy\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 36)",
        "(line 212,col 9)-(line 212,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getFreeParameters()",
      "begin_line": 218,
      "end_line": 220,
      "comment": " Get the number of free parameters.\n     * @return number of free parameters\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getOrder()",
      "begin_line": 225,
      "end_line": 227,
      "comment": " Get the derivation order.\n     * @return derivation order\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getReal()",
      "begin_line": 230,
      "end_line": 232,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getValue()",
      "begin_line": 238,
      "end_line": 240,
      "comment": " Get the value part of the derivative structure.\n     * @return value part of the derivative structure\n     * @see #getPartialDerivative(int...)\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getPartialDerivative(int...)",
      "begin_line": 252,
      "end_line": 255,
      "comment": " Get a partial derivative.\n     * @param orders derivation orders with respect to each variable (if all orders are 0,\n     * the value is returned)\n     * @return partial derivative\n     * @see #getValue()\n     * @exception DimensionMismatchException if the numbers of variables does not\n     * match the instance\n     * @exception NumberIsTooLargeException if sum of derivation orders is larger\n     * than the instance limits\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getAllDerivatives()",
      "begin_line": 261,
      "end_line": 263,
      "comment": " Get all partial derivatives.\n     * @return a fresh copy of partial derivatives, in an array sorted according to\n     * {@link DSCompiler#getPartialDerivativeIndex(int...)}\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.add(double)",
      "begin_line": 266,
      "end_line": 270,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 69)",
        "(line 268,col 9)-(line 268,col 24)",
        "(line 269,col 9)-(line 269,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.add(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 273,
      "end_line": 279,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 48)",
        "(line 276,col 9)-(line 276,col 69)",
        "(line 277,col 9)-(line 277,col 53)",
        "(line 278,col 9)-(line 278,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.subtract(double)",
      "begin_line": 282,
      "end_line": 284,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.subtract(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 287,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 48)",
        "(line 290,col 9)-(line 290,col 69)",
        "(line 291,col 9)-(line 291,col 58)",
        "(line 292,col 9)-(line 292,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(int)",
      "begin_line": 296,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(double)",
      "begin_line": 301,
      "end_line": 307,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 69)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 310,
      "end_line": 316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 48)",
        "(line 313,col 9)-(line 313,col 77)",
        "(line 314,col 9)-(line 314,col 62)",
        "(line 315,col 9)-(line 315,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.divide(double)",
      "begin_line": 319,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 69)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.divide(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 328,
      "end_line": 334,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 48)",
        "(line 331,col 9)-(line 331,col 77)",
        "(line 332,col 9)-(line 332,col 60)",
        "(line 333,col 9)-(line 333,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.remainder(double)",
      "begin_line": 337,
      "end_line": 341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 69)",
        "(line 339,col 9)-(line 339,col 59)",
        "(line 340,col 9)-(line 340,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.remainder(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 344,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 48)",
        "(line 347,col 9)-(line 347,col 77)",
        "(line 348,col 9)-(line 348,col 63)",
        "(line 349,col 9)-(line 349,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.negate()",
      "begin_line": 353,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 73)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.abs()",
      "begin_line": 362,
      "end_line": 369,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 9)-(line 368,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.ceil()",
      "begin_line": 372,
      "end_line": 376,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 373,col 9)-(line 375,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.floor()",
      "begin_line": 379,
      "end_line": 383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 380,col 9)-(line 382,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.rint()",
      "begin_line": 386,
      "end_line": 390,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 387,col 9)-(line 389,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.round()",
      "begin_line": 393,
      "end_line": 395,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.signum()",
      "begin_line": 398,
      "end_line": 402,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 399,col 9)-(line 401,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.copySign(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 405,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 50)",
        "(line 407,col 9)-(line 407,col 55)",
        "(line 408,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.copySign(double)",
      "begin_line": 415,
      "end_line": 422,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 50)",
        "(line 417,col 9)-(line 417,col 47)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getExponent()",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * Return the exponent of the instance value, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @return exponent for instance in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.scalb(int)",
      "begin_line": 437,
      "end_line": 443,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 73)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hypot(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 446,
      "end_line": 488,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 48)",
        "(line 451,col 9)-(line 487,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hypot(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 505,
      "end_line": 508,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.compose(double...)",
      "begin_line": 518,
      "end_line": 525,
      "comment": " Compute composition of the instance by a univariate function.\n     * @param f array of value and derivatives of the function at\n     * the current point (i.e. [f({@link #getValue()}),\n     * f\u0027({@link #getValue()}), f\u0027\u0027({@link #getValue()})...]).\n     * @return f(this)\n     * @exception DimensionMismatchException if the number of derivatives\n     * in the array is not equal to {@link #getOrder() order} + 1\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 77)",
        "(line 523,col 9)-(line 523,col 53)",
        "(line 524,col 9)-(line 524,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.reciprocal()",
      "begin_line": 528,
      "end_line": 532,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 77)",
        "(line 530,col 9)-(line 530,col 50)",
        "(line 531,col 9)-(line 531,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sqrt()",
      "begin_line": 535,
      "end_line": 537,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cbrt()",
      "begin_line": 540,
      "end_line": 542,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.rootN(int)",
      "begin_line": 545,
      "end_line": 549,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 77)",
        "(line 547,col 9)-(line 547,col 51)",
        "(line 548,col 9)-(line 548,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getField()",
      "begin_line": 552,
      "end_line": 571,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 553,col 9)-(line 570,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-7348f829-cd7a-41e4-8f62-b1983ab4c9b2.getZero()",
      "begin_line": 556,
      "end_line": 558,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 557,col 17)-(line 557,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-3c7135f2-bc2b-47a8-a295-0f06088bb60d.getOne()",
      "begin_line": 561,
      "end_line": 563,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 562,col 17)-(line 562,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-1b8507db-98cf-4aaa-90b5-9a0b6b8d0942.getRuntimeClass()",
      "begin_line": 566,
      "end_line": 568,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 567,col 17)-(line 567,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(double)",
      "begin_line": 574,
      "end_line": 578,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 77)",
        "(line 576,col 9)-(line 576,col 49)",
        "(line 577,col 9)-(line 577,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(int)",
      "begin_line": 581,
      "end_line": 585,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 77)",
        "(line 583,col 9)-(line 583,col 49)",
        "(line 584,col 9)-(line 584,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 588,
      "end_line": 594,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 48)",
        "(line 591,col 9)-(line 591,col 77)",
        "(line 592,col 9)-(line 592,col 57)",
        "(line 593,col 9)-(line 593,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.exp()",
      "begin_line": 597,
      "end_line": 601,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 77)",
        "(line 599,col 9)-(line 599,col 46)",
        "(line 600,col 9)-(line 600,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.expm1()",
      "begin_line": 604,
      "end_line": 608,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 77)",
        "(line 606,col 9)-(line 606,col 48)",
        "(line 607,col 9)-(line 607,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log()",
      "begin_line": 611,
      "end_line": 615,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 77)",
        "(line 613,col 9)-(line 613,col 46)",
        "(line 614,col 9)-(line 614,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log1p()",
      "begin_line": 618,
      "end_line": 622,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 77)",
        "(line 620,col 9)-(line 620,col 48)",
        "(line 621,col 9)-(line 621,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log10()",
      "begin_line": 625,
      "end_line": 629,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 77)",
        "(line 627,col 9)-(line 627,col 48)",
        "(line 628,col 9)-(line 628,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cos()",
      "begin_line": 632,
      "end_line": 636,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 77)",
        "(line 634,col 9)-(line 634,col 46)",
        "(line 635,col 9)-(line 635,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sin()",
      "begin_line": 639,
      "end_line": 643,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 77)",
        "(line 641,col 9)-(line 641,col 46)",
        "(line 642,col 9)-(line 642,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.tan()",
      "begin_line": 646,
      "end_line": 650,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 77)",
        "(line 648,col 9)-(line 648,col 46)",
        "(line 649,col 9)-(line 649,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.acos()",
      "begin_line": 653,
      "end_line": 657,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 77)",
        "(line 655,col 9)-(line 655,col 47)",
        "(line 656,col 9)-(line 656,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.asin()",
      "begin_line": 660,
      "end_line": 664,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 77)",
        "(line 662,col 9)-(line 662,col 47)",
        "(line 663,col 9)-(line 663,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan()",
      "begin_line": 667,
      "end_line": 671,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 77)",
        "(line 669,col 9)-(line 669,col 47)",
        "(line 670,col 9)-(line 670,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan2(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 674,
      "end_line": 680,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 48)",
        "(line 677,col 9)-(line 677,col 77)",
        "(line 678,col 9)-(line 678,col 59)",
        "(line 679,col 9)-(line 679,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan2(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 688,
      "end_line": 691,
      "comment": " Two arguments arc tangent operation.\n     * @param y first argument of the arc tangent\n     * @param x second argument of the arc tangent\n     * @return atan2(y, x)\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cosh()",
      "begin_line": 694,
      "end_line": 698,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 77)",
        "(line 696,col 9)-(line 696,col 47)",
        "(line 697,col 9)-(line 697,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sinh()",
      "begin_line": 701,
      "end_line": 705,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 702,col 9)-(line 702,col 77)",
        "(line 703,col 9)-(line 703,col 47)",
        "(line 704,col 9)-(line 704,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.tanh()",
      "begin_line": 708,
      "end_line": 712,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 77)",
        "(line 710,col 9)-(line 710,col 47)",
        "(line 711,col 9)-(line 711,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.acosh()",
      "begin_line": 715,
      "end_line": 719,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 77)",
        "(line 717,col 9)-(line 717,col 48)",
        "(line 718,col 9)-(line 718,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.asinh()",
      "begin_line": 722,
      "end_line": 726,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 77)",
        "(line 724,col 9)-(line 724,col 48)",
        "(line 725,col 9)-(line 725,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atanh()",
      "begin_line": 729,
      "end_line": 733,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 77)",
        "(line 731,col 9)-(line 731,col 48)",
        "(line 732,col 9)-(line 732,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.toDegrees()",
      "begin_line": 738,
      "end_line": 744,
      "comment": " Convert radians to degrees, with error of less than 0.5 ULP\n     *  @return instance converted into degrees\n     ",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 73)",
        "(line 740,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 743,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.toRadians()",
      "begin_line": 749,
      "end_line": 755,
      "comment": " Convert degrees to radians, with error of less than 0.5 ULP\n     *  @return instance converted into radians\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 73)",
        "(line 751,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 754,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.taylor(double...)",
      "begin_line": 761,
      "end_line": 763,
      "comment": " Evaluate Taylor expansion a derivative structure.\n     * @param delta parameters offsets (\u0026Delta;x, \u0026Delta;y, ...)\n     * @return value of the Taylor expansion at x + \u0026Delta;x, y + \u0026Delta;y, ...\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[], org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 766,
      "end_line": 791,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 770,col 9)-(line 770,col 54)",
        "(line 771,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 774,col 54)",
        "(line 775,col 9)-(line 777,col 9)",
        "(line 778,col 9)-(line 778,col 84)",
        "(line 781,col 9)-(line 781,col 68)",
        "(line 782,col 9)-(line 784,col 9)",
        "(line 787,col 9)-(line 787,col 61)",
        "(line 788,col 9)-(line 788,col 31)",
        "(line 789,col 9)-(line 789,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double[], org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 794,
      "end_line": 815,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 54)",
        "(line 799,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 802,col 78)",
        "(line 805,col 9)-(line 805,col 68)",
        "(line 806,col 9)-(line 808,col 9)",
        "(line 811,col 9)-(line 811,col 61)",
        "(line 812,col 9)-(line 812,col 31)",
        "(line 813,col 9)-(line 813,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 818,
      "end_line": 833,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 822,col 9)-(line 823,col 96)",
        "(line 826,col 9)-(line 826,col 85)",
        "(line 829,col 9)-(line 829,col 61)",
        "(line 830,col 9)-(line 830,col 31)",
        "(line 831,col 9)-(line 831,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 836,
      "end_line": 851,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 840,col 9)-(line 841,col 85)",
        "(line 844,col 9)-(line 844,col 85)",
        "(line 847,col 9)-(line 847,col 61)",
        "(line 848,col 9)-(line 848,col 31)",
        "(line 849,col 9)-(line 849,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 854,
      "end_line": 871,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 859,col 9)-(line 861,col 96)",
        "(line 864,col 9)-(line 864,col 106)",
        "(line 867,col 9)-(line 867,col 61)",
        "(line 868,col 9)-(line 868,col 31)",
        "(line 869,col 9)-(line 869,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 874,
      "end_line": 891,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 879,col 9)-(line 881,col 85)",
        "(line 884,col 9)-(line 884,col 106)",
        "(line 887,col 9)-(line 887,col 61)",
        "(line 888,col 9)-(line 888,col 31)",
        "(line 889,col 9)-(line 889,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 894,
      "end_line": 913,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 900,col 9)-(line 903,col 96)",
        "(line 906,col 9)-(line 906,col 127)",
        "(line 909,col 9)-(line 909,col 61)",
        "(line 910,col 9)-(line 910,col 31)",
        "(line 911,col 9)-(line 911,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 916,
      "end_line": 935,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 922,col 9)-(line 925,col 85)",
        "(line 928,col 9)-(line 928,col 127)",
        "(line 931,col 9)-(line 931,col 61)",
        "(line 932,col 9)-(line 932,col 31)",
        "(line 933,col 9)-(line 933,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.equals(java.lang.Object)",
      "begin_line": 947,
      "end_line": 963,
      "comment": "\n     * Test for the equality of two derivative structures.\n     * \u003cp\u003e\n     * Derivative structures are considered equal if they have the same number\n     * of free parameters, the same derivation order, and the same derivatives.\n     * \u003c/p\u003e\n     * @param other Object to test for equality to this\n     * @return true if two derivative structures are equal\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 952,col 9)",
        "(line 954,col 9)-(line 959,col 9)",
        "(line 961,col 9)-(line 961,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hashCode()",
      "begin_line": 970,
      "end_line": 973,
      "comment": "\n     * Get a hashCode for the derivative structure.\n     * @return a hash code value for this object\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.writeReplace()",
      "begin_line": 979,
      "end_line": 981,
      "comment": "\n     * Replace the instance with a data transfer object for serialization.\n     * @return data transfer object that will be serialized\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 980,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataTransferObject",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 984,
      "end_line": 1022,
      "comment": " Internal class used only for serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 987,
      "end_line": 987,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "variables"
      ],
      "begin_line": 992,
      "end_line": 992,
      "comment": " Number of variables.\n         * @serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "order"
      ],
      "begin_line": 997,
      "end_line": 997,
      "comment": " Derivation order.\n         * @serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 1002,
      "end_line": 1002,
      "comment": " Partial derivatives.\n         * @serial\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DataTransferObject.DataTransferObject(int, int, double[])",
      "begin_line": 1009,
      "end_line": 1013,
      "comment": " Simple constructor.\n         * @param variables number of variables\n         * @param order derivation order\n         * @param data partial derivatives\n         ",
      "child_ranges": [
        "(line 1010,col 13)-(line 1010,col 39)",
        "(line 1011,col 13)-(line 1011,col 35)",
        "(line 1012,col 13)-(line 1012,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DataTransferObject.readResolve()",
      "begin_line": 1018,
      "end_line": 1020,
      "comment": " Replace the deserialized data transfer object with a {@link DerivativeStructure}.\n         * @return replacement {@link DerivativeStructure}\n         ",
      "child_ranges": [
        "(line 1019,col 13)-(line 1019,col 67)"
      ]
    }
  ]
}