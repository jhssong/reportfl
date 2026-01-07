{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/analysis/differentiation/DerivativeStructure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DerivativeStructure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.RealFieldElement\u003corg.apache.commons.math3.analysis.differentiation.DerivativeStructure\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 62,
      "end_line": 1196,
      "comment": " Class representing both the value and the differentials of a function.\n * \u003cp\u003eThis class is the workhorse of the differentiation package.\u003c/p\u003e\n * \u003cp\u003eThis class is an implementation of the extension to Rall\u0027s\n * numbers described in Dan Kalman\u0027s paper \u003ca\n * href\u003d\"http://www1.american.edu/cas/mathstat/People/kalman/pdffiles/mmgautodiff.pdf\"\u003eDoubly\n * Recursive Multivariate Automatic Differentiation\u003c/a\u003e, Mathematics Magazine, vol. 75,\n * no. 3, June 2002.\u003c/p\u003e. Rall\u0027s numbers are an extension to the real numbers used\n * throughout mathematical expressions; they hold the derivative together with the\n * value of a function. Dan Kalman\u0027s derivative structures hold all partial derivatives\n * up to any specified order, with respect to any number of free parameters. Rall\u0027s\n * numbers therefore can be seen as derivative structures for order one derivative and\n * one free parameter, and real numbers can be seen as derivative structures with zero\n * order derivative and no free parameters.\u003c/p\u003e\n * \u003cp\u003e{@link DerivativeStructure} instances can be used directly thanks to\n * the arithmetic operators to the mathematical functions provided as\n * methods by this class (+, -, *, /, %, sin, cos ...).\u003c/p\u003e\n * \u003cp\u003eImplementing complex expressions by hand using these classes is\n * a tedious and error-prone task but has the advantage of having no limitation\n * on the derivation order despite no requiring users to compute the derivatives by\n * themselves. Implementing complex expression can also be done by developing computation\n * code using standard primitive double values and to use {@link\n * UnivariateFunctionDifferentiator differentiators} to create the {@link\n * DerivativeStructure}-based instances. This method is simpler but may be limited in\n * the accuracy and derivation orders and may be computationally intensive (this is\n * typically the case for {@link FiniteDifferencesDifferentiator finite differences\n * differentiator}.\u003c/p\u003e\n * \u003cp\u003eInstances of this class are guaranteed to be immutable.\u003c/p\u003e\n * @see DSCompiler\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Compiler for the current dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Combined array holding all values. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 76,
      "end_line": 79,
      "comment": " Build an instance with all values and derivatives set to 0.\n     * @param compiler compiler to use for computation\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 33)",
        "(line 78,col 9)-(line 78,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int)",
      "begin_line": 86,
      "end_line": 89,
      "comment": " Build an instance with all values and derivatives set to 0.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @throws NumberIsTooLargeException if order is too large\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int, double)",
      "begin_line": 98,
      "end_line": 102,
      "comment": " Build an instance representing a constant value.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param value value of the constant\n     * @throws NumberIsTooLargeException if order is too large\n     * @see #DerivativeStructure(int, int, int, double)\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 32)",
        "(line 101,col 9)-(line 101,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int, int, double)",
      "begin_line": 116,
      "end_line": 130,
      "comment": " Build an instance representing a variable.\n     * \u003cp\u003eInstances built using this constructor are considered\n     * to be the free variables with respect to which differentials\n     * are computed. As such, their differential with respect to\n     * themselves is +1.\u003c/p\u003e\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param index index of the variable (from 0 to {@code parameters - 1})\n     * @param value value of the variable\n     * @exception NumberIsTooLargeException if {@code index \u003e\u003d parameters}.\n     * @see #DerivativeStructure(int, int, double)\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 39)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 140,
      "end_line": 146,
      "comment": " Linear combination constructor.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2\n     * @param a1 first scale factor\n     * @param ds1 first base (unscaled) derivative structure\n     * @param a2 second scale factor\n     * @param ds2 second base (unscaled) derivative structure\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 27)",
        "(line 144,col 9)-(line 144,col 50)",
        "(line 145,col 9)-(line 145,col 78)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 158,
      "end_line": 166,
      "comment": " Linear combination constructor.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3\n     * @param a1 first scale factor\n     * @param ds1 first base (unscaled) derivative structure\n     * @param a2 second scale factor\n     * @param ds2 second base (unscaled) derivative structure\n     * @param a3 third scale factor\n     * @param ds3 third base (unscaled) derivative structure\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 27)",
        "(line 163,col 9)-(line 163,col 50)",
        "(line 164,col 9)-(line 164,col 50)",
        "(line 165,col 9)-(line 165,col 95)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 180,
      "end_line": 192,
      "comment": " Linear combination constructor.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3 + a4 * ds4\n     * @param a1 first scale factor\n     * @param ds1 first base (unscaled) derivative structure\n     * @param a2 second scale factor\n     * @param ds2 second base (unscaled) derivative structure\n     * @param a3 third scale factor\n     * @param ds3 third base (unscaled) derivative structure\n     * @param a4 fourth scale factor\n     * @param ds4 fourth base (unscaled) derivative structure\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 27)",
        "(line 186,col 9)-(line 186,col 50)",
        "(line 187,col 9)-(line 187,col 50)",
        "(line 188,col 9)-(line 188,col 50)",
        "(line 189,col 9)-(line 191,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int, double...)",
      "begin_line": 204,
      "end_line": 211,
      "comment": " Build an instance from all its derivatives.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param derivatives derivatives sorted according to\n     * {@link DSCompiler#getPartialDerivativeIndex(int...)}\n     * @exception DimensionMismatchException if derivatives array does not match the\n     * {@link DSCompiler#getSize() size} expected by the compiler\n     * @throws NumberIsTooLargeException if order is too large\n     * @see #getAllDerivatives()\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 32)",
        "(line 207,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 216,
      "end_line": 219,
      "comment": " Copy constructor.\n     * @param ds instance to copy\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 36)",
        "(line 218,col 9)-(line 218,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getFreeParameters()",
      "begin_line": 224,
      "end_line": 226,
      "comment": " Get the number of free parameters.\n     * @return number of free parameters\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getOrder()",
      "begin_line": 231,
      "end_line": 233,
      "comment": " Get the derivation order.\n     * @return derivation order\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.createConstant(double)",
      "begin_line": 245,
      "end_line": 247,
      "comment": " Create a constant compatible with instance order and number of parameters.\n     * \u003cp\u003e\n     * This method is a convenience factory method, it simply calls\n     * {@code new DerivativeStructure(getFreeParameters(), getOrder(), c)}\n     * \u003c/p\u003e\n     * @param c value of the constant\n     * @return a constant compatible with instance order and number of parameters\n     * @see #DerivativeStructure(int, int, double)\n     * @since 3.3\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getReal()",
      "begin_line": 252,
      "end_line": 254,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getValue()",
      "begin_line": 260,
      "end_line": 262,
      "comment": " Get the value part of the derivative structure.\n     * @return value part of the derivative structure\n     * @see #getPartialDerivative(int...)\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getPartialDerivative(int...)",
      "begin_line": 274,
      "end_line": 277,
      "comment": " Get a partial derivative.\n     * @param orders derivation orders with respect to each variable (if all orders are 0,\n     * the value is returned)\n     * @return partial derivative\n     * @see #getValue()\n     * @exception DimensionMismatchException if the numbers of variables does not\n     * match the instance\n     * @exception NumberIsTooLargeException if sum of derivation orders is larger\n     * than the instance limits\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getAllDerivatives()",
      "begin_line": 283,
      "end_line": 285,
      "comment": " Get all partial derivatives.\n     * @return a fresh copy of partial derivatives, in an array sorted according to\n     * {@link DSCompiler#getPartialDerivativeIndex(int...)}\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.add(double)",
      "begin_line": 290,
      "end_line": 294,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 69)",
        "(line 292,col 9)-(line 292,col 24)",
        "(line 293,col 9)-(line 293,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.add(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 300,
      "end_line": 306,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 48)",
        "(line 303,col 9)-(line 303,col 69)",
        "(line 304,col 9)-(line 304,col 53)",
        "(line 305,col 9)-(line 305,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.subtract(double)",
      "begin_line": 311,
      "end_line": 313,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.subtract(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 319,
      "end_line": 325,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 48)",
        "(line 322,col 9)-(line 322,col 69)",
        "(line 323,col 9)-(line 323,col 58)",
        "(line 324,col 9)-(line 324,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(int)",
      "begin_line": 328,
      "end_line": 330,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(double)",
      "begin_line": 335,
      "end_line": 341,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 69)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 347,
      "end_line": 353,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 48)",
        "(line 350,col 9)-(line 350,col 77)",
        "(line 351,col 9)-(line 351,col 62)",
        "(line 352,col 9)-(line 352,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.divide(double)",
      "begin_line": 358,
      "end_line": 364,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 69)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.divide(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 370,
      "end_line": 376,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 48)",
        "(line 373,col 9)-(line 373,col 77)",
        "(line 374,col 9)-(line 374,col 60)",
        "(line 375,col 9)-(line 375,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.remainder(double)",
      "begin_line": 379,
      "end_line": 383,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 69)",
        "(line 381,col 9)-(line 381,col 59)",
        "(line 382,col 9)-(line 382,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.remainder(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 390,
      "end_line": 396,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 48)",
        "(line 393,col 9)-(line 393,col 77)",
        "(line 394,col 9)-(line 394,col 63)",
        "(line 395,col 9)-(line 395,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.negate()",
      "begin_line": 399,
      "end_line": 405,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 73)",
        "(line 401,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.abs()",
      "begin_line": 410,
      "end_line": 417,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 416,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.ceil()",
      "begin_line": 422,
      "end_line": 426,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 425,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.floor()",
      "begin_line": 431,
      "end_line": 435,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 434,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.rint()",
      "begin_line": 440,
      "end_line": 444,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 443,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.round()",
      "begin_line": 447,
      "end_line": 449,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.signum()",
      "begin_line": 454,
      "end_line": 458,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 457,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.copySign(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 463,
      "end_line": 470,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 50)",
        "(line 465,col 9)-(line 465,col 55)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.copySign(double)",
      "begin_line": 475,
      "end_line": 482,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 50)",
        "(line 477,col 9)-(line 477,col 47)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getExponent()",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * Return the exponent of the instance value, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @return exponent for instance in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.scalb(int)",
      "begin_line": 499,
      "end_line": 505,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 73)",
        "(line 501,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hypot(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 512,
      "end_line": 554,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 48)",
        "(line 517,col 9)-(line 553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hypot(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 573,
      "end_line": 576,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.compose(double...)",
      "begin_line": 586,
      "end_line": 594,
      "comment": " Compute composition of the instance by a univariate function.\n     * @param f array of value and derivatives of the function at\n     * the current point (i.e. [f({@link #getValue()}),\n     * f\u0027({@link #getValue()}), f\u0027\u0027({@link #getValue()})...]).\n     * @return f(this)\n     * @exception DimensionMismatchException if the number of derivatives\n     * in the array is not equal to {@link #getOrder() order} + 1\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 77)",
        "(line 592,col 9)-(line 592,col 53)",
        "(line 593,col 9)-(line 593,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.reciprocal()",
      "begin_line": 597,
      "end_line": 601,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 77)",
        "(line 599,col 9)-(line 599,col 50)",
        "(line 600,col 9)-(line 600,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sqrt()",
      "begin_line": 606,
      "end_line": 608,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cbrt()",
      "begin_line": 613,
      "end_line": 615,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.rootN(int)",
      "begin_line": 620,
      "end_line": 624,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 77)",
        "(line 622,col 9)-(line 622,col 51)",
        "(line 623,col 9)-(line 623,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getField()",
      "begin_line": 627,
      "end_line": 646,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 628,col 9)-(line 645,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-a3988938-7eb9-47ee-9fde-87863e5db67a.getZero()",
      "begin_line": 631,
      "end_line": 633,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 632,col 17)-(line 632,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-8be2ca41-e98b-4870-aa0f-2ff1a956bcc7.getOne()",
      "begin_line": 636,
      "end_line": 638,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 637,col 17)-(line 637,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-c73dec06-c7d2-427c-b590-b6dfae72e335.getRuntimeClass()",
      "begin_line": 641,
      "end_line": 643,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 642,col 17)-(line 642,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 654,
      "end_line": 658,
      "comment": " Compute a\u003csup\u003ex\u003c/sup\u003e where a is a double and x a {@link DerivativeStructure}\n     * @param a number to exponentiate\n     * @param x power to apply\n     * @return a\u003csup\u003ex\u003c/sup\u003e\n     * @since 3.3\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 655,col 79)",
        "(line 656,col 9)-(line 656,col 53)",
        "(line 657,col 9)-(line 657,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(double)",
      "begin_line": 663,
      "end_line": 667,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 77)",
        "(line 665,col 9)-(line 665,col 49)",
        "(line 666,col 9)-(line 666,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(int)",
      "begin_line": 672,
      "end_line": 676,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 77)",
        "(line 674,col 9)-(line 674,col 49)",
        "(line 675,col 9)-(line 675,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 683,
      "end_line": 689,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 48)",
        "(line 686,col 9)-(line 686,col 77)",
        "(line 687,col 9)-(line 687,col 57)",
        "(line 688,col 9)-(line 688,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.exp()",
      "begin_line": 694,
      "end_line": 698,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 77)",
        "(line 696,col 9)-(line 696,col 46)",
        "(line 697,col 9)-(line 697,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.expm1()",
      "begin_line": 703,
      "end_line": 707,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 77)",
        "(line 705,col 9)-(line 705,col 48)",
        "(line 706,col 9)-(line 706,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log()",
      "begin_line": 712,
      "end_line": 716,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 77)",
        "(line 714,col 9)-(line 714,col 46)",
        "(line 715,col 9)-(line 715,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log1p()",
      "begin_line": 721,
      "end_line": 725,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 77)",
        "(line 723,col 9)-(line 723,col 48)",
        "(line 724,col 9)-(line 724,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log10()",
      "begin_line": 730,
      "end_line": 734,
      "comment": " Base 10 logarithm.\n     * @return base 10 logarithm of the instance\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 77)",
        "(line 732,col 9)-(line 732,col 48)",
        "(line 733,col 9)-(line 733,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cos()",
      "begin_line": 739,
      "end_line": 743,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 77)",
        "(line 741,col 9)-(line 741,col 46)",
        "(line 742,col 9)-(line 742,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sin()",
      "begin_line": 748,
      "end_line": 752,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 77)",
        "(line 750,col 9)-(line 750,col 46)",
        "(line 751,col 9)-(line 751,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.tan()",
      "begin_line": 757,
      "end_line": 761,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 77)",
        "(line 759,col 9)-(line 759,col 46)",
        "(line 760,col 9)-(line 760,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.acos()",
      "begin_line": 766,
      "end_line": 770,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 77)",
        "(line 768,col 9)-(line 768,col 47)",
        "(line 769,col 9)-(line 769,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.asin()",
      "begin_line": 775,
      "end_line": 779,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 77)",
        "(line 777,col 9)-(line 777,col 47)",
        "(line 778,col 9)-(line 778,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan()",
      "begin_line": 784,
      "end_line": 788,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 77)",
        "(line 786,col 9)-(line 786,col 47)",
        "(line 787,col 9)-(line 787,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan2(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 793,
      "end_line": 799,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 48)",
        "(line 796,col 9)-(line 796,col 77)",
        "(line 797,col 9)-(line 797,col 59)",
        "(line 798,col 9)-(line 798,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan2(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 809,
      "end_line": 812,
      "comment": " Two arguments arc tangent operation.\n     * @param y first argument of the arc tangent\n     * @param x second argument of the arc tangent\n     * @return atan2(y, x)\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cosh()",
      "begin_line": 817,
      "end_line": 821,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 818,col 9)-(line 818,col 77)",
        "(line 819,col 9)-(line 819,col 47)",
        "(line 820,col 9)-(line 820,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sinh()",
      "begin_line": 826,
      "end_line": 830,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 77)",
        "(line 828,col 9)-(line 828,col 47)",
        "(line 829,col 9)-(line 829,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.tanh()",
      "begin_line": 835,
      "end_line": 839,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 77)",
        "(line 837,col 9)-(line 837,col 47)",
        "(line 838,col 9)-(line 838,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.acosh()",
      "begin_line": 844,
      "end_line": 848,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 77)",
        "(line 846,col 9)-(line 846,col 48)",
        "(line 847,col 9)-(line 847,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.asinh()",
      "begin_line": 853,
      "end_line": 857,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 77)",
        "(line 855,col 9)-(line 855,col 48)",
        "(line 856,col 9)-(line 856,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atanh()",
      "begin_line": 862,
      "end_line": 866,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 77)",
        "(line 864,col 9)-(line 864,col 48)",
        "(line 865,col 9)-(line 865,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.toDegrees()",
      "begin_line": 871,
      "end_line": 877,
      "comment": " Convert radians to degrees, with error of less than 0.5 ULP\n     *  @return instance converted into degrees\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 73)",
        "(line 873,col 9)-(line 875,col 9)",
        "(line 876,col 9)-(line 876,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.toRadians()",
      "begin_line": 882,
      "end_line": 888,
      "comment": " Convert degrees to radians, with error of less than 0.5 ULP\n     *  @return instance converted into radians\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 73)",
        "(line 884,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.taylor(double...)",
      "begin_line": 895,
      "end_line": 897,
      "comment": " Evaluate Taylor expansion a derivative structure.\n     * @param delta parameters offsets (\u0026Delta;x, \u0026Delta;y, ...)\n     * @return value of the Taylor expansion at x + \u0026Delta;x, y + \u0026Delta;y, ...\n     * @throws MathArithmeticException if factorials becomes too large\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[], org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 904,
      "end_line": 929,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 54)",
        "(line 909,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 54)",
        "(line 913,col 9)-(line 915,col 9)",
        "(line 916,col 9)-(line 916,col 84)",
        "(line 919,col 9)-(line 919,col 68)",
        "(line 920,col 9)-(line 922,col 9)",
        "(line 925,col 9)-(line 925,col 61)",
        "(line 926,col 9)-(line 926,col 31)",
        "(line 927,col 9)-(line 927,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double[], org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 936,
      "end_line": 957,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 54)",
        "(line 941,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 944,col 78)",
        "(line 947,col 9)-(line 947,col 68)",
        "(line 948,col 9)-(line 950,col 9)",
        "(line 953,col 9)-(line 953,col 61)",
        "(line 954,col 9)-(line 954,col 31)",
        "(line 955,col 9)-(line 955,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 964,
      "end_line": 980,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 970,col 96)",
        "(line 973,col 9)-(line 973,col 85)",
        "(line 976,col 9)-(line 976,col 61)",
        "(line 977,col 9)-(line 977,col 31)",
        "(line 978,col 9)-(line 978,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 987,
      "end_line": 1003,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 993,col 85)",
        "(line 996,col 9)-(line 996,col 85)",
        "(line 999,col 9)-(line 999,col 61)",
        "(line 1000,col 9)-(line 1000,col 31)",
        "(line 1001,col 9)-(line 1001,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 1010,
      "end_line": 1028,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1016,col 9)-(line 1018,col 96)",
        "(line 1021,col 9)-(line 1021,col 106)",
        "(line 1024,col 9)-(line 1024,col 61)",
        "(line 1025,col 9)-(line 1025,col 31)",
        "(line 1026,col 9)-(line 1026,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 1035,
      "end_line": 1053,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1043,col 85)",
        "(line 1046,col 9)-(line 1046,col 106)",
        "(line 1049,col 9)-(line 1049,col 61)",
        "(line 1050,col 9)-(line 1050,col 31)",
        "(line 1051,col 9)-(line 1051,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 1060,
      "end_line": 1080,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1067,col 9)-(line 1070,col 96)",
        "(line 1073,col 9)-(line 1073,col 127)",
        "(line 1076,col 9)-(line 1076,col 61)",
        "(line 1077,col 9)-(line 1077,col 31)",
        "(line 1078,col 9)-(line 1078,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 1087,
      "end_line": 1107,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1097,col 85)",
        "(line 1100,col 9)-(line 1100,col 127)",
        "(line 1103,col 9)-(line 1103,col 61)",
        "(line 1104,col 9)-(line 1104,col 31)",
        "(line 1105,col 9)-(line 1105,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.equals(java.lang.Object)",
      "begin_line": 1119,
      "end_line": 1135,
      "comment": "\n     * Test for the equality of two derivative structures.\n     * \u003cp\u003e\n     * Derivative structures are considered equal if they have the same number\n     * of free parameters, the same derivation order, and the same derivatives.\n     * \u003c/p\u003e\n     * @param other Object to test for equality to this\n     * @return true if two derivative structures are equal\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1122,col 9)-(line 1124,col 9)",
        "(line 1126,col 9)-(line 1131,col 9)",
        "(line 1133,col 9)-(line 1133,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hashCode()",
      "begin_line": 1142,
      "end_line": 1145,
      "comment": "\n     * Get a hashCode for the derivative structure.\n     * @return a hash code value for this object\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1144,col 9)-(line 1144,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.writeReplace()",
      "begin_line": 1151,
      "end_line": 1153,
      "comment": "\n     * Replace the instance with a data transfer object for serialization.\n     * @return data transfer object that will be serialized\n     ",
      "child_ranges": [
        "(line 1152,col 9)-(line 1152,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataTransferObject",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 1156,
      "end_line": 1194,
      "comment": " Internal class used only for serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1159,
      "end_line": 1159,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "variables"
      ],
      "begin_line": 1164,
      "end_line": 1164,
      "comment": " Number of variables.\n         * @serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "order"
      ],
      "begin_line": 1169,
      "end_line": 1169,
      "comment": " Derivation order.\n         * @serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 1174,
      "end_line": 1174,
      "comment": " Partial derivatives.\n         * @serial\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DataTransferObject.DataTransferObject(int, int, double[])",
      "begin_line": 1181,
      "end_line": 1185,
      "comment": " Simple constructor.\n         * @param variables number of variables\n         * @param order derivation order\n         * @param data partial derivatives\n         ",
      "child_ranges": [
        "(line 1182,col 13)-(line 1182,col 39)",
        "(line 1183,col 13)-(line 1183,col 35)",
        "(line 1184,col 13)-(line 1184,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DataTransferObject.readResolve()",
      "begin_line": 1190,
      "end_line": 1192,
      "comment": " Replace the deserialized data transfer object with a {@link DerivativeStructure}.\n         * @return replacement {@link DerivativeStructure}\n         ",
      "child_ranges": [
        "(line 1191,col 13)-(line 1191,col 67)"
      ]
    }
  ]
}