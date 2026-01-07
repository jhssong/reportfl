{
  "filepath": "/tmp/Math-3b/src/main/java/org/apache/commons/math3/analysis/differentiation/DerivativeStructure.java",
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
      "end_line": 1170,
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
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getReal()",
      "begin_line": 238,
      "end_line": 240,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getValue()",
      "begin_line": 246,
      "end_line": 248,
      "comment": " Get the value part of the derivative structure.\n     * @return value part of the derivative structure\n     * @see #getPartialDerivative(int...)\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getPartialDerivative(int...)",
      "begin_line": 260,
      "end_line": 263,
      "comment": " Get a partial derivative.\n     * @param orders derivation orders with respect to each variable (if all orders are 0,\n     * the value is returned)\n     * @return partial derivative\n     * @see #getValue()\n     * @exception DimensionMismatchException if the numbers of variables does not\n     * match the instance\n     * @exception NumberIsTooLargeException if sum of derivation orders is larger\n     * than the instance limits\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getAllDerivatives()",
      "begin_line": 269,
      "end_line": 271,
      "comment": " Get all partial derivatives.\n     * @return a fresh copy of partial derivatives, in an array sorted according to\n     * {@link DSCompiler#getPartialDerivativeIndex(int...)}\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.add(double)",
      "begin_line": 276,
      "end_line": 280,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 69)",
        "(line 278,col 9)-(line 278,col 24)",
        "(line 279,col 9)-(line 279,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.add(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 286,
      "end_line": 292,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 48)",
        "(line 289,col 9)-(line 289,col 69)",
        "(line 290,col 9)-(line 290,col 53)",
        "(line 291,col 9)-(line 291,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.subtract(double)",
      "begin_line": 297,
      "end_line": 299,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.subtract(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 305,
      "end_line": 311,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 48)",
        "(line 308,col 9)-(line 308,col 69)",
        "(line 309,col 9)-(line 309,col 58)",
        "(line 310,col 9)-(line 310,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(int)",
      "begin_line": 314,
      "end_line": 316,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(double)",
      "begin_line": 321,
      "end_line": 327,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 69)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 333,
      "end_line": 339,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 48)",
        "(line 336,col 9)-(line 336,col 77)",
        "(line 337,col 9)-(line 337,col 62)",
        "(line 338,col 9)-(line 338,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.divide(double)",
      "begin_line": 344,
      "end_line": 350,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 69)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.divide(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 356,
      "end_line": 362,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 48)",
        "(line 359,col 9)-(line 359,col 77)",
        "(line 360,col 9)-(line 360,col 60)",
        "(line 361,col 9)-(line 361,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.remainder(double)",
      "begin_line": 365,
      "end_line": 369,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 69)",
        "(line 367,col 9)-(line 367,col 59)",
        "(line 368,col 9)-(line 368,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.remainder(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 376,
      "end_line": 382,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 48)",
        "(line 379,col 9)-(line 379,col 77)",
        "(line 380,col 9)-(line 380,col 63)",
        "(line 381,col 9)-(line 381,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.negate()",
      "begin_line": 385,
      "end_line": 391,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 73)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.abs()",
      "begin_line": 396,
      "end_line": 403,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 402,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.ceil()",
      "begin_line": 408,
      "end_line": 412,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 411,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.floor()",
      "begin_line": 417,
      "end_line": 421,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 420,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.rint()",
      "begin_line": 426,
      "end_line": 430,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 429,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.round()",
      "begin_line": 433,
      "end_line": 435,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.signum()",
      "begin_line": 440,
      "end_line": 444,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 441,col 9)-(line 443,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.copySign(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 449,
      "end_line": 456,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 50)",
        "(line 451,col 9)-(line 451,col 55)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.copySign(double)",
      "begin_line": 461,
      "end_line": 468,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 50)",
        "(line 463,col 9)-(line 463,col 47)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getExponent()",
      "begin_line": 478,
      "end_line": 480,
      "comment": "\n     * Return the exponent of the instance value, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @return exponent for instance in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.scalb(int)",
      "begin_line": 485,
      "end_line": 491,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 73)",
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hypot(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 498,
      "end_line": 540,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 48)",
        "(line 503,col 9)-(line 539,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hypot(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 559,
      "end_line": 562,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.compose(double...)",
      "begin_line": 572,
      "end_line": 580,
      "comment": " Compute composition of the instance by a univariate function.\n     * @param f array of value and derivatives of the function at\n     * the current point (i.e. [f({@link #getValue()}),\n     * f\u0027({@link #getValue()}), f\u0027\u0027({@link #getValue()})...]).\n     * @return f(this)\n     * @exception DimensionMismatchException if the number of derivatives\n     * in the array is not equal to {@link #getOrder() order} + 1\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 577,col 77)",
        "(line 578,col 9)-(line 578,col 53)",
        "(line 579,col 9)-(line 579,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.reciprocal()",
      "begin_line": 583,
      "end_line": 587,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 77)",
        "(line 585,col 9)-(line 585,col 50)",
        "(line 586,col 9)-(line 586,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sqrt()",
      "begin_line": 592,
      "end_line": 594,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cbrt()",
      "begin_line": 599,
      "end_line": 601,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.rootN(int)",
      "begin_line": 606,
      "end_line": 610,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 77)",
        "(line 608,col 9)-(line 608,col 51)",
        "(line 609,col 9)-(line 609,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getField()",
      "begin_line": 613,
      "end_line": 632,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 614,col 9)-(line 631,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-ba72de98-833a-44c6-995f-4171ba49d52c.getZero()",
      "begin_line": 617,
      "end_line": 619,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 618,col 17)-(line 618,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-f51579b8-aedf-4043-9758-49175e76f7d1.getOne()",
      "begin_line": 622,
      "end_line": 624,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 623,col 17)-(line 623,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-6d1d7630-e9e2-44ce-a973-09b4c5bc2d4c.getRuntimeClass()",
      "begin_line": 627,
      "end_line": 629,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 628,col 17)-(line 628,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(double)",
      "begin_line": 637,
      "end_line": 641,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 77)",
        "(line 639,col 9)-(line 639,col 49)",
        "(line 640,col 9)-(line 640,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(int)",
      "begin_line": 646,
      "end_line": 650,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 77)",
        "(line 648,col 9)-(line 648,col 49)",
        "(line 649,col 9)-(line 649,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 657,
      "end_line": 663,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 48)",
        "(line 660,col 9)-(line 660,col 77)",
        "(line 661,col 9)-(line 661,col 57)",
        "(line 662,col 9)-(line 662,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.exp()",
      "begin_line": 668,
      "end_line": 672,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 77)",
        "(line 670,col 9)-(line 670,col 46)",
        "(line 671,col 9)-(line 671,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.expm1()",
      "begin_line": 677,
      "end_line": 681,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 77)",
        "(line 679,col 9)-(line 679,col 48)",
        "(line 680,col 9)-(line 680,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log()",
      "begin_line": 686,
      "end_line": 690,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 77)",
        "(line 688,col 9)-(line 688,col 46)",
        "(line 689,col 9)-(line 689,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log1p()",
      "begin_line": 695,
      "end_line": 699,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 77)",
        "(line 697,col 9)-(line 697,col 48)",
        "(line 698,col 9)-(line 698,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log10()",
      "begin_line": 704,
      "end_line": 708,
      "comment": " Base 10 logarithm.\n     * @return base 10 logarithm of the instance\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 77)",
        "(line 706,col 9)-(line 706,col 48)",
        "(line 707,col 9)-(line 707,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cos()",
      "begin_line": 713,
      "end_line": 717,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 77)",
        "(line 715,col 9)-(line 715,col 46)",
        "(line 716,col 9)-(line 716,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sin()",
      "begin_line": 722,
      "end_line": 726,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 77)",
        "(line 724,col 9)-(line 724,col 46)",
        "(line 725,col 9)-(line 725,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.tan()",
      "begin_line": 731,
      "end_line": 735,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 77)",
        "(line 733,col 9)-(line 733,col 46)",
        "(line 734,col 9)-(line 734,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.acos()",
      "begin_line": 740,
      "end_line": 744,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 77)",
        "(line 742,col 9)-(line 742,col 47)",
        "(line 743,col 9)-(line 743,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.asin()",
      "begin_line": 749,
      "end_line": 753,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 77)",
        "(line 751,col 9)-(line 751,col 47)",
        "(line 752,col 9)-(line 752,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan()",
      "begin_line": 758,
      "end_line": 762,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 77)",
        "(line 760,col 9)-(line 760,col 47)",
        "(line 761,col 9)-(line 761,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan2(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 767,
      "end_line": 773,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 48)",
        "(line 770,col 9)-(line 770,col 77)",
        "(line 771,col 9)-(line 771,col 59)",
        "(line 772,col 9)-(line 772,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan2(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 783,
      "end_line": 786,
      "comment": " Two arguments arc tangent operation.\n     * @param y first argument of the arc tangent\n     * @param x second argument of the arc tangent\n     * @return atan2(y, x)\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cosh()",
      "begin_line": 791,
      "end_line": 795,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 77)",
        "(line 793,col 9)-(line 793,col 47)",
        "(line 794,col 9)-(line 794,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sinh()",
      "begin_line": 800,
      "end_line": 804,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 77)",
        "(line 802,col 9)-(line 802,col 47)",
        "(line 803,col 9)-(line 803,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.tanh()",
      "begin_line": 809,
      "end_line": 813,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 77)",
        "(line 811,col 9)-(line 811,col 47)",
        "(line 812,col 9)-(line 812,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.acosh()",
      "begin_line": 818,
      "end_line": 822,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 77)",
        "(line 820,col 9)-(line 820,col 48)",
        "(line 821,col 9)-(line 821,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.asinh()",
      "begin_line": 827,
      "end_line": 831,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 77)",
        "(line 829,col 9)-(line 829,col 48)",
        "(line 830,col 9)-(line 830,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atanh()",
      "begin_line": 836,
      "end_line": 840,
      "comment": " {@inheritDoc}\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 837,col 77)",
        "(line 838,col 9)-(line 838,col 48)",
        "(line 839,col 9)-(line 839,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.toDegrees()",
      "begin_line": 845,
      "end_line": 851,
      "comment": " Convert radians to degrees, with error of less than 0.5 ULP\n     *  @return instance converted into degrees\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 73)",
        "(line 847,col 9)-(line 849,col 9)",
        "(line 850,col 9)-(line 850,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.toRadians()",
      "begin_line": 856,
      "end_line": 862,
      "comment": " Convert degrees to radians, with error of less than 0.5 ULP\n     *  @return instance converted into radians\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 73)",
        "(line 858,col 9)-(line 860,col 9)",
        "(line 861,col 9)-(line 861,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.taylor(double...)",
      "begin_line": 869,
      "end_line": 871,
      "comment": " Evaluate Taylor expansion a derivative structure.\n     * @param delta parameters offsets (\u0026Delta;x, \u0026Delta;y, ...)\n     * @return value of the Taylor expansion at x + \u0026Delta;x, y + \u0026Delta;y, ...\n     * @throws MathArithmeticException if factorials becomes too large\n     ",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure[], org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 878,
      "end_line": 903,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 54)",
        "(line 883,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 886,col 54)",
        "(line 887,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 84)",
        "(line 893,col 9)-(line 893,col 68)",
        "(line 894,col 9)-(line 896,col 9)",
        "(line 899,col 9)-(line 899,col 61)",
        "(line 900,col 9)-(line 900,col 31)",
        "(line 901,col 9)-(line 901,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double[], org.apache.commons.math3.analysis.differentiation.DerivativeStructure[])",
      "begin_line": 910,
      "end_line": 931,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 54)",
        "(line 915,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 918,col 78)",
        "(line 921,col 9)-(line 921,col 68)",
        "(line 922,col 9)-(line 924,col 9)",
        "(line 927,col 9)-(line 927,col 61)",
        "(line 928,col 9)-(line 928,col 31)",
        "(line 929,col 9)-(line 929,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 938,
      "end_line": 954,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 944,col 96)",
        "(line 947,col 9)-(line 947,col 85)",
        "(line 950,col 9)-(line 950,col 61)",
        "(line 951,col 9)-(line 951,col 31)",
        "(line 952,col 9)-(line 952,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 961,
      "end_line": 977,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 966,col 9)-(line 967,col 85)",
        "(line 970,col 9)-(line 970,col 85)",
        "(line 973,col 9)-(line 973,col 61)",
        "(line 974,col 9)-(line 974,col 31)",
        "(line 975,col 9)-(line 975,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 984,
      "end_line": 1002,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 992,col 96)",
        "(line 995,col 9)-(line 995,col 106)",
        "(line 998,col 9)-(line 998,col 61)",
        "(line 999,col 9)-(line 999,col 31)",
        "(line 1000,col 9)-(line 1000,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 1009,
      "end_line": 1027,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1015,col 9)-(line 1017,col 85)",
        "(line 1020,col 9)-(line 1020,col 106)",
        "(line 1023,col 9)-(line 1023,col 61)",
        "(line 1024,col 9)-(line 1024,col 31)",
        "(line 1025,col 9)-(line 1025,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 1034,
      "end_line": 1054,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1041,col 9)-(line 1044,col 96)",
        "(line 1047,col 9)-(line 1047,col 127)",
        "(line 1050,col 9)-(line 1050,col 61)",
        "(line 1051,col 9)-(line 1051,col 31)",
        "(line 1052,col 9)-(line 1052,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.linearCombination(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 1061,
      "end_line": 1081,
      "comment": " {@inheritDoc}\n     * @exception DimensionMismatchException if number of free parameters\n     * or orders do not match\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1071,col 85)",
        "(line 1074,col 9)-(line 1074,col 127)",
        "(line 1077,col 9)-(line 1077,col 61)",
        "(line 1078,col 9)-(line 1078,col 31)",
        "(line 1079,col 9)-(line 1079,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.equals(java.lang.Object)",
      "begin_line": 1093,
      "end_line": 1109,
      "comment": "\n     * Test for the equality of two derivative structures.\n     * \u003cp\u003e\n     * Derivative structures are considered equal if they have the same number\n     * of free parameters, the same derivation order, and the same derivatives.\n     * \u003c/p\u003e\n     * @param other Object to test for equality to this\n     * @return true if two derivative structures are equal\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1098,col 9)",
        "(line 1100,col 9)-(line 1105,col 9)",
        "(line 1107,col 9)-(line 1107,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hashCode()",
      "begin_line": 1116,
      "end_line": 1119,
      "comment": "\n     * Get a hashCode for the derivative structure.\n     * @return a hash code value for this object\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1118,col 9)-(line 1118,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.writeReplace()",
      "begin_line": 1125,
      "end_line": 1127,
      "comment": "\n     * Replace the instance with a data transfer object for serialization.\n     * @return data transfer object that will be serialized\n     ",
      "child_ranges": [
        "(line 1126,col 9)-(line 1126,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataTransferObject",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 1130,
      "end_line": 1168,
      "comment": " Internal class used only for serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1133,
      "end_line": 1133,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "variables"
      ],
      "begin_line": 1138,
      "end_line": 1138,
      "comment": " Number of variables.\n         * @serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "order"
      ],
      "begin_line": 1143,
      "end_line": 1143,
      "comment": " Derivation order.\n         * @serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 1148,
      "end_line": 1148,
      "comment": " Partial derivatives.\n         * @serial\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DataTransferObject.DataTransferObject(int, int, double[])",
      "begin_line": 1155,
      "end_line": 1159,
      "comment": " Simple constructor.\n         * @param variables number of variables\n         * @param order derivation order\n         * @param data partial derivatives\n         ",
      "child_ranges": [
        "(line 1156,col 13)-(line 1156,col 39)",
        "(line 1157,col 13)-(line 1157,col 35)",
        "(line 1158,col 13)-(line 1158,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DataTransferObject.readResolve()",
      "begin_line": 1164,
      "end_line": 1166,
      "comment": " Replace the deserialized data transfer object with a {@link DerivativeStructure}.\n         * @return replacement {@link DerivativeStructure}\n         ",
      "child_ranges": [
        "(line 1165,col 13)-(line 1165,col 67)"
      ]
    }
  ]
}