{
  "filepath": "/tmp/Math-6b/src/main/java/org/apache/commons/math3/analysis/differentiation/DerivativeStructure.java",
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
      "end_line": 1087,
      "comment": " Class representing both the value and the differentials of a function.\n * \u003cp\u003eThis class is the workhorse of the differentiation package.\u003c/p\u003e\n * \u003cp\u003eThis class is an implementation of the extension to Rall\u0027s\n * numbers described in Dan Kalman\u0027s paper \u003ca\n * href\u003d\"http://www.math.american.edu/People/kalman/pdffiles/mmgautodiff.pdf\"\u003eDoubly\n * Recursive Multivariate Automatic Differentiation\u003c/a\u003e, Mathematics Magazine, vol. 75,\n * no. 3, June 2002.\u003c/p\u003e. Rall\u0027s numbers are an extension to the real numbers used\n * throughout mathematical expressions; they hold the derivative together with the\n * value of a function. Dan Kalman\u0027s derivative structures hold all partial derivatives\n * up to any specified order, with respect to any number of free parameters. Rall\u0027s\n * numbers therefore can be seen as derivative structures for order one derivative and\n * one free parameter, and real numbers can be seen as derivative structures with zero\n * order derivative and no free parameters.\u003c/p\u003e\n * \u003cp\u003e{@link DerivativeStructure} instances can be used directly thanks to\n * the arithmetic operators to the mathematical functions provided as static\n * methods by this class (+, -, *, /, %, sin, cos ...).\u003c/p\u003e\n * \u003cp\u003eImplementing complex expressions by hand using these classes is\n * a tedious and error-prone task but has the advantage of having no limitation\n * on the derivation order despite no requiring users to compute the derivatives by\n * themselves. Implementing complex expression can also be done by developing computation\n * code using standard primitive double values and to use {@link\n * UnivariateFunctionDifferentiator differentiators} to create the {@link\n * DerivativeStructure}-based instances. This method is simpler but may be limited in\n * the accuracy and derivation orders and may be computationally intensive (this is\n * typically the case for {@link FiniteDifferencesDifferentiator finite differences\n * differentiator}.\u003c/p\u003e\n * \u003cp\u003eInstances of this class are guaranteed to be immutable.\u003c/p\u003e\n * @see DSCompiler\n * @version $Id$\n * @since 3.1\n "
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
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getReal()",
      "begin_line": 236,
      "end_line": 238,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getValue()",
      "begin_line": 244,
      "end_line": 246,
      "comment": " Get the value part of the derivative structure.\n     * @return value part of the derivative structure\n     * @see #getPartialDerivative(int...)\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getPartialDerivative(int...)",
      "begin_line": 258,
      "end_line": 261,
      "comment": " Get a partial derivative.\n     * @param orders derivation orders with respect to each variable (if all orders are 0,\n     * the value is returned)\n     * @return partial derivative\n     * @see #getValue()\n     * @exception DimensionMismatchException if the numbers of variables does not\n     * match the instance\n     * @exception NumberIsTooLargeException if sum of derivation orders is larger\n     * than the instance limits\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getAllDerivatives()",
      "begin_line": 267,
      "end_line": 269,
      "comment": " Get all partial derivatives.\n     * @return a fresh copy of partial derivatives, in an array sorted according to\n     * {@link DSCompiler#getPartialDerivativeIndex(int...)}\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.add(double)",
      "begin_line": 272,
      "end_line": 276,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 69)",
        "(line 274,col 9)-(line 274,col 24)",
        "(line 275,col 9)-(line 275,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.add(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 282,
      "end_line": 288,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 48)",
        "(line 285,col 9)-(line 285,col 69)",
        "(line 286,col 9)-(line 286,col 53)",
        "(line 287,col 9)-(line 287,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.subtract(double)",
      "begin_line": 291,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.subtract(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 299,
      "end_line": 305,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 48)",
        "(line 302,col 9)-(line 302,col 69)",
        "(line 303,col 9)-(line 303,col 58)",
        "(line 304,col 9)-(line 304,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(int)",
      "begin_line": 308,
      "end_line": 310,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(double)",
      "begin_line": 313,
      "end_line": 319,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 69)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 325,
      "end_line": 331,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 48)",
        "(line 328,col 9)-(line 328,col 77)",
        "(line 329,col 9)-(line 329,col 62)",
        "(line 330,col 9)-(line 330,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.divide(double)",
      "begin_line": 334,
      "end_line": 340,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 69)",
        "(line 336,col 9)-(line 338,col 9)",
        "(line 339,col 9)-(line 339,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.divide(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 346,
      "end_line": 352,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 48)",
        "(line 349,col 9)-(line 349,col 77)",
        "(line 350,col 9)-(line 350,col 60)",
        "(line 351,col 9)-(line 351,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.remainder(double)",
      "begin_line": 355,
      "end_line": 359,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 69)",
        "(line 357,col 9)-(line 357,col 59)",
        "(line 358,col 9)-(line 358,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.remainder(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 365,
      "end_line": 371,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 48)",
        "(line 368,col 9)-(line 368,col 77)",
        "(line 369,col 9)-(line 369,col 63)",
        "(line 370,col 9)-(line 370,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.negate()",
      "begin_line": 374,
      "end_line": 380,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 73)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.abs()",
      "begin_line": 383,
      "end_line": 390,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 384,col 9)-(line 389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.ceil()",
      "begin_line": 393,
      "end_line": 397,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 394,col 9)-(line 396,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.floor()",
      "begin_line": 400,
      "end_line": 404,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 401,col 9)-(line 403,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.rint()",
      "begin_line": 407,
      "end_line": 411,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 408,col 9)-(line 410,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.round()",
      "begin_line": 414,
      "end_line": 416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.signum()",
      "begin_line": 419,
      "end_line": 423,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 420,col 9)-(line 422,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.copySign(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 426,
      "end_line": 433,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 50)",
        "(line 428,col 9)-(line 428,col 55)",
        "(line 429,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.copySign(double)",
      "begin_line": 436,
      "end_line": 443,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 50)",
        "(line 438,col 9)-(line 438,col 47)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getExponent()",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\n     * Return the exponent of the instance value, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @return exponent for instance in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.scalb(int)",
      "begin_line": 458,
      "end_line": 464,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 73)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hypot(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 470,
      "end_line": 512,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 48)",
        "(line 475,col 9)-(line 511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hypot(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 530,
      "end_line": 533,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.compose(double...)",
      "begin_line": 543,
      "end_line": 551,
      "comment": " Compute composition of the instance by a univariate function.\n     * @param f array of value and derivatives of the function at\n     * the current point (i.e. [f({@link #getValue()}),\n     * f\u0027({@link #getValue()}), f\u0027\u0027({@link #getValue()})...]).\n     * @return f(this)\n     * @exception DimensionMismatchException if the number of derivatives\n     * in the array is not equal to {@link #getOrder() order} + 1\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 77)",
        "(line 549,col 9)-(line 549,col 53)",
        "(line 550,col 9)-(line 550,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.reciprocal()",
      "begin_line": 554,
      "end_line": 558,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 77)",
        "(line 556,col 9)-(line 556,col 50)",
        "(line 557,col 9)-(line 557,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sqrt()",
      "begin_line": 561,
      "end_line": 563,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cbrt()",
      "begin_line": 566,
      "end_line": 568,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.rootN(int)",
      "begin_line": 571,
      "end_line": 575,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 77)",
        "(line 573,col 9)-(line 573,col 51)",
        "(line 574,col 9)-(line 574,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getField()",
      "begin_line": 578,
      "end_line": 597,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 579,col 9)-(line 596,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-5e8ed995-5d26-4ac4-92db-13f6381c6dac.getZero()",
      "begin_line": 582,
      "end_line": 584,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 583,col 17)-(line 583,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-58fed353-4f03-4263-b127-ab3951bc4cac.getOne()",
      "begin_line": 587,
      "end_line": 589,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 588,col 17)-(line 588,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-5ba59127-bdb4-49d8-8bb2-81e222d541d8.getRuntimeClass()",
      "begin_line": 592,
      "end_line": 594,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 593,col 17)-(line 593,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(double)",
      "begin_line": 600,
      "end_line": 604,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 77)",
        "(line 602,col 9)-(line 602,col 49)",
        "(line 603,col 9)-(line 603,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(int)",
      "begin_line": 607,
      "end_line": 611,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 77)",
        "(line 609,col 9)-(line 609,col 49)",
        "(line 610,col 9)-(line 610,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 617,
      "end_line": 623,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 48)",
        "(line 620,col 9)-(line 620,col 77)",
        "(line 621,col 9)-(line 621,col 57)",
        "(line 622,col 9)-(line 622,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.exp()",
      "begin_line": 626,
      "end_line": 630,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 77)",
        "(line 628,col 9)-(line 628,col 46)",
        "(line 629,col 9)-(line 629,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.expm1()",
      "begin_line": 633,
      "end_line": 637,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 634,col 9)-(line 634,col 77)",
        "(line 635,col 9)-(line 635,col 48)",
        "(line 636,col 9)-(line 636,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log()",
      "begin_line": 640,
      "end_line": 644,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 77)",
        "(line 642,col 9)-(line 642,col 46)",
        "(line 643,col 9)-(line 643,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log1p()",
      "begin_line": 647,
      "end_line": 651,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 77)",
        "(line 649,col 9)-(line 649,col 48)",
        "(line 650,col 9)-(line 650,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log10()",
      "begin_line": 656,
      "end_line": 660,
      "comment": " Base 10 logarithm.\n     * @return base 10 logarithm of the instance\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 77)",
        "(line 658,col 9)-(line 658,col 48)",
        "(line 659,col 9)-(line 659,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cos()",
      "begin_line": 663,
      "end_line": 667,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 664,col 9)-(line 664,col 77)",
        "(line 665,col 9)-(line 665,col 46)",
        "(line 666,col 9)-(line 666,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sin()",
      "begin_line": 670,
      "end_line": 674,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 77)",
        "(line 672,col 9)-(line 672,col 46)",
        "(line 673,col 9)-(line 673,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.tan()",
      "begin_line": 677,
      "end_line": 681,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 77)",
        "(line 679,col 9)-(line 679,col 46)",
        "(line 680,col 9)-(line 680,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.acos()",
      "begin_line": 684,
      "end_line": 688,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 77)",
        "(line 686,col 9)-(line 686,col 47)",
        "(line 687,col 9)-(line 687,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.asin()",
      "begin_line": 691,
      "end_line": 695,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 77)",
        "(line 693,col 9)-(line 693,col 47)",
        "(line 694,col 9)-(line 694,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan()",
      "begin_line": 698,
      "end_line": 702,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 77)",
        "(line 700,col 9)-(line 700,col 47)",
        "(line 701,col 9)-(line 701,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan2(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 705,
      "end_line": 711,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 48)",
        "(line 708,col 9)-(line 708,col 77)",
        "(line 709,col 9)-(line 709,col 59)",
        "(line 710,col 9)-(line 710,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan2(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 720,
      "end_line": 723,
      "comment": " Two arguments arc tangent operation.\n     * @param y first argument of the arc tangent\n     * @param x second argument of the arc tangent\n     * @return atan2(y, x)\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cosh()",
      "begin_line": 726,
      "end_line": 730,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 77)",
        "(line 728,col 9)-(line 728,col 47)",
        "(line 729,col 9)-(line 729,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sinh()",
      "begin_line": 733,
      "end_line": 737,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 77)",
        "(line 735,col 9)-(line 735,col 47)",
        "(line 736,col 9)-(line 736,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.tanh()",
      "begin_line": 740,
      "end_line": 744,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 77)",
        "(line 742,col 9)-(line 742,col 47)",
        "(line 743,col 9)-(line 743,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.acosh()",
      "begin_line": 747,
      "end_line": 751,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 77)",
        "(line 749,col 9)-(line 749,col 48)",
        "(line 750,col 9)-(line 750,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.asinh()",
      "begin_line": 754,
      "end_line": 758,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 77)",
        "(line 756,col 9)-(line 756,col 48)",
        "(line 757,col 9)-(line 757,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atanh()",
      "begin_line": 761,
      "end_line": 765,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 77)",
        "(line 763,col 9)-(line 763,col 48)",
        "(line 764,col 9)-(line 764,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.toDegrees()",
      "begin_line": 770,
      "end_line": 776,
      "comment": " Convert radians to degrees, with error of less than 0.5 ULP\n     *  @return instance converted into degrees\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 73)",
        "(line 772,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 775,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.toRadians()",
      "begin_line": 781,
      "end_line": 787,
      "comment": " Convert degrees to radians, with error of less than 0.5 ULP\n     *  @return instance converted into radians\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 73)",
        "(line 783,col 9)-(line 785,col 9)",
        "(line 786,col 9)-(line 786,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.taylor(double...)",
      "begin_line": 794,
      "end_line": 796,
      "comment": " Evaluate Taylor expansion a derivative structure.\n     * @param delta parameters offsets (\u0026Delta;x, \u0026Delta;y, ...)\n     * @return value of the Taylor expansion at x + \u0026Delta;x, y + \u0026Delta;y, ...\n     * @throws MathArithmeticException if factorials becomes too large\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[], org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 802,
      "end_line": 827,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 54)",
        "(line 807,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 810,col 54)",
        "(line 811,col 9)-(line 813,col 9)",
        "(line 814,col 9)-(line 814,col 84)",
        "(line 817,col 9)-(line 817,col 68)",
        "(line 818,col 9)-(line 820,col 9)",
        "(line 823,col 9)-(line 823,col 61)",
        "(line 824,col 9)-(line 824,col 31)",
        "(line 825,col 9)-(line 825,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double[], org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 833,
      "end_line": 854,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 54)",
        "(line 838,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 841,col 78)",
        "(line 844,col 9)-(line 844,col 68)",
        "(line 845,col 9)-(line 847,col 9)",
        "(line 850,col 9)-(line 850,col 61)",
        "(line 851,col 9)-(line 851,col 31)",
        "(line 852,col 9)-(line 852,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 860,
      "end_line": 876,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 866,col 96)",
        "(line 869,col 9)-(line 869,col 85)",
        "(line 872,col 9)-(line 872,col 61)",
        "(line 873,col 9)-(line 873,col 31)",
        "(line 874,col 9)-(line 874,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 882,
      "end_line": 898,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 888,col 85)",
        "(line 891,col 9)-(line 891,col 85)",
        "(line 894,col 9)-(line 894,col 61)",
        "(line 895,col 9)-(line 895,col 31)",
        "(line 896,col 9)-(line 896,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 904,
      "end_line": 922,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 912,col 96)",
        "(line 915,col 9)-(line 915,col 106)",
        "(line 918,col 9)-(line 918,col 61)",
        "(line 919,col 9)-(line 919,col 31)",
        "(line 920,col 9)-(line 920,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 928,
      "end_line": 946,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 934,col 9)-(line 936,col 85)",
        "(line 939,col 9)-(line 939,col 106)",
        "(line 942,col 9)-(line 942,col 61)",
        "(line 943,col 9)-(line 943,col 31)",
        "(line 944,col 9)-(line 944,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 952,
      "end_line": 972,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 959,col 9)-(line 962,col 96)",
        "(line 965,col 9)-(line 965,col 127)",
        "(line 968,col 9)-(line 968,col 61)",
        "(line 969,col 9)-(line 969,col 31)",
        "(line 970,col 9)-(line 970,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 978,
      "end_line": 998,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 988,col 85)",
        "(line 991,col 9)-(line 991,col 127)",
        "(line 994,col 9)-(line 994,col 61)",
        "(line 995,col 9)-(line 995,col 31)",
        "(line 996,col 9)-(line 996,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.equals(java.lang.Object)",
      "begin_line": 1010,
      "end_line": 1026,
      "comment": "\n     * Test for the equality of two derivative structures.\n     * \u003cp\u003e\n     * Derivative structures are considered equal if they have the same number\n     * of free parameters, the same derivation order, and the same derivatives.\n     * \u003c/p\u003e\n     * @param other Object to test for equality to this\n     * @return true if two derivative structures are equal\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1013,col 9)-(line 1015,col 9)",
        "(line 1017,col 9)-(line 1022,col 9)",
        "(line 1024,col 9)-(line 1024,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hashCode()",
      "begin_line": 1033,
      "end_line": 1036,
      "comment": "\n     * Get a hashCode for the derivative structure.\n     * @return a hash code value for this object\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1035,col 9)-(line 1035,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.writeReplace()",
      "begin_line": 1042,
      "end_line": 1044,
      "comment": "\n     * Replace the instance with a data transfer object for serialization.\n     * @return data transfer object that will be serialized\n     ",
      "child_ranges": [
        "(line 1043,col 9)-(line 1043,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataTransferObject",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 1047,
      "end_line": 1085,
      "comment": " Internal class used only for serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1050,
      "end_line": 1050,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "variables"
      ],
      "begin_line": 1055,
      "end_line": 1055,
      "comment": " Number of variables.\n         * @serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "order"
      ],
      "begin_line": 1060,
      "end_line": 1060,
      "comment": " Derivation order.\n         * @serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 1065,
      "end_line": 1065,
      "comment": " Partial derivatives.\n         * @serial\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DataTransferObject.DataTransferObject(int, int, double[])",
      "begin_line": 1072,
      "end_line": 1076,
      "comment": " Simple constructor.\n         * @param variables number of variables\n         * @param order derivation order\n         * @param data partial derivatives\n         ",
      "child_ranges": [
        "(line 1073,col 13)-(line 1073,col 39)",
        "(line 1074,col 13)-(line 1074,col 35)",
        "(line 1075,col 13)-(line 1075,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DataTransferObject.readResolve()",
      "begin_line": 1081,
      "end_line": 1083,
      "comment": " Replace the deserialized data transfer object with a {@link DerivativeStructure}.\n         * @return replacement {@link DerivativeStructure}\n         ",
      "child_ranges": [
        "(line 1082,col 13)-(line 1082,col 67)"
      ]
    }
  ]
}