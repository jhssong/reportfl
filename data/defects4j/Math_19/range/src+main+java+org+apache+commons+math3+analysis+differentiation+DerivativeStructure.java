{
  "filepath": "/tmp/Math-19b/src/main/java/org/apache/commons/math3/analysis/differentiation/DerivativeStructure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DerivativeStructure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.FieldElement\u003corg.apache.commons.math3.analysis.differentiation.DerivativeStructure\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 898,
      "comment": " Class representing both the value and the differentials of a function.\n * \u003cp\u003eThis class is the workhorse of the differentiation package.\u003c/p\u003e\n * \u003cp\u003eThis class is an implementation of the extension to Rall\u0027s\n * numbers described in Dan Kalman\u0027s paper \u003ca\n * href\u003d\"http://www.math.american.edu/People/kalman/pdffiles/mmgautodiff.pdf\"\u003eDoubly\n * Recursive Multivariate Automatic Differentiation\u003c/a\u003e, Mathematics Magazine, vol. 75,\n * no. 3, June 2002.\u003c/p\u003e. Rall\u0027s numbers are an extension to the real numbers used\n * throughout mathematical expressions; they hold the derivative together with the\n * value of a function. Dan Kalman\u0027s derivative structures hold all partial derivatives\n * up to any specified order, with respect to any number of free parameters. Rall\u0027s\n * numbers therefore can be seen as derivative structures for order one derivative and\n * one free parameter, and real numbers can be seen as derivative structures with zero\n * order derivative and no free parameters.\u003c/p\u003e\n * \u003cp\u003e{@link DerivativeStructure} instances can be used directly thanks to\n * the arithmetic operators to the mathematical functions provided as static\n * methods by this class (+, -, *, /, %, sin, cos ...).\u003c/p\u003e\n * \u003cp\u003eImplementing complex expressions by hand using these classes is\n * a tedious and error-prone task but has the advantage of having no limitation\n * on the derivation order despite no requiring users to compute the derivatives by\n * themselves. Implementing complex expression can also be done by developing computation\n * code using standard primitive double values and to use {@link\n * UnivariateFunctionDifferentiator differentiators} to create the {@link\n * DerivativeStructure}-based instances. This method is simpler but may be limited in\n * the accuracy and derivation orders and may be computationally intensive (this is\n * typically the case for {@link FiniteDifferencesDifferentiator finite differences\n * differentiator).\u003c/p\u003e\n * \u003cp\u003eInstances of this class are guaranteed to be immutable.\u003c/p\u003e\n * @see DSCompiler\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Compiler for the current dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Combined array holding all values. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 72,
      "end_line": 75,
      "comment": " Build an instance with all values and derivatives set to 0.\n     * @param compiler compiler to use for computation\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 33)",
        "(line 74,col 9)-(line 74,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int)",
      "begin_line": 81,
      "end_line": 83,
      "comment": " Build an instance with all values and derivatives set to 0.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int, double)",
      "begin_line": 91,
      "end_line": 94,
      "comment": " Build an instance representing a constant value.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param value value of the constant\n     * @see #DerivativeStructure(int, int, int, double)\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 32)",
        "(line 93,col 9)-(line 93,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int, int, double)",
      "begin_line": 108,
      "end_line": 122,
      "comment": " Build an instance representing a variable.\n     * \u003cp\u003eInstances built using this constructor are considered\n     * to be the free variables with respect to which differentials\n     * are computed. As such, their differential with respect to\n     * themselves is +1.\u003c/p\u003e\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param index index of the variable (from 0 to {@code variables - 1})\n     * @param value value of the variable\n     * @exception NumberIsTooLargeException if index is equal to variables or larger\n     * @see #DerivativeStructure(int, int, double)\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 39)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 132,
      "end_line": 138,
      "comment": " Linear combination constructor.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2\n     * @param a1 first scale factor\n     * @param ds1 first base (unscaled) derivative structure\n     * @param a2 second scale factor\n     * @param ds2 second base (unscaled) derivative structure\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 27)",
        "(line 136,col 9)-(line 136,col 50)",
        "(line 137,col 9)-(line 137,col 78)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 150,
      "end_line": 158,
      "comment": " Linear combination constructor.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3\n     * @param a1 first scale factor\n     * @param ds1 first base (unscaled) derivative structure\n     * @param a2 second scale factor\n     * @param ds2 second base (unscaled) derivative structure\n     * @param a3 third scale factor\n     * @param ds3 third base (unscaled) derivative structure\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 27)",
        "(line 155,col 9)-(line 155,col 50)",
        "(line 156,col 9)-(line 156,col 50)",
        "(line 157,col 9)-(line 157,col 95)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 172,
      "end_line": 184,
      "comment": " Linear combination constructor.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3 + a4 * ds4\n     * @param a1 first scale factor\n     * @param ds1 first base (unscaled) derivative structure\n     * @param a2 second scale factor\n     * @param ds2 second base (unscaled) derivative structure\n     * @param a3 third scale factor\n     * @param ds3 third base (unscaled) derivative structure\n     * @param a4 fourth scale factor\n     * @param ds4 fourth base (unscaled) derivative structure\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 27)",
        "(line 178,col 9)-(line 178,col 50)",
        "(line 179,col 9)-(line 179,col 50)",
        "(line 180,col 9)-(line 180,col 50)",
        "(line 181,col 9)-(line 183,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int, double...)",
      "begin_line": 195,
      "end_line": 202,
      "comment": " Build an instance from all its derivatives.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param derivatives derivatives sorted according to\n     * {@link DSCompiler#getPartialDerivativeIndex(int...)}\n     * @exception DimensionMismatchException if derivatives array does not match the\n     * {@link DSCompiler#getSize() size} expected by the compiler\n     * @see #getAllDerivatives()\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 32)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 207,
      "end_line": 210,
      "comment": " Copy constructor.\n     * @param ds instance to copy\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 36)",
        "(line 209,col 9)-(line 209,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getFreeParameters()",
      "begin_line": 215,
      "end_line": 217,
      "comment": " Get the number of free parameters.\n     * @return number of free parameters\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getOrder()",
      "begin_line": 222,
      "end_line": 224,
      "comment": " Get the derivation order.\n     * @return derivation order\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getValue()",
      "begin_line": 230,
      "end_line": 232,
      "comment": " Get the value part of the derivative structure.\n     * @return value part of the derivative structure\n     * @see #getPartialDerivative(int...)\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getPartialDerivative(int...)",
      "begin_line": 244,
      "end_line": 247,
      "comment": " Get a partial derivative.\n     * @param orders derivation orders with respect to each variable (if all orders are 0,\n     * the value is returned)\n     * @return partial derivative\n     * @see #getValue()\n     * @exception DimensionMismatchException if the numbers of variables does not\n     * match the instance\n     * @exception NumberIsTooLargeException if sum of derivation orders is larger\n     * than the instance limits\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getAllDerivatives()",
      "begin_line": 253,
      "end_line": 255,
      "comment": " Get all partial derivatives.\n     * @return a fresh copy of partial derivatives, in an array sorted according to\n     * {@link DSCompiler#getPartialDerivativeIndex(int...)}\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.add(double)",
      "begin_line": 261,
      "end_line": 265,
      "comment": " \u0027+\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this+a\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 69)",
        "(line 263,col 9)-(line 263,col 24)",
        "(line 264,col 9)-(line 264,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.add(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 272,
      "end_line": 278,
      "comment": " \u0027+\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this+a\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 48)",
        "(line 275,col 9)-(line 275,col 69)",
        "(line 276,col 9)-(line 276,col 53)",
        "(line 277,col 9)-(line 277,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.subtract(double)",
      "begin_line": 284,
      "end_line": 286,
      "comment": " \u0027-\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this-a\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.subtract(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 293,
      "end_line": 299,
      "comment": " \u0027-\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this-a\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 48)",
        "(line 296,col 9)-(line 296,col 69)",
        "(line 297,col 9)-(line 297,col 58)",
        "(line 298,col 9)-(line 298,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(int)",
      "begin_line": 302,
      "end_line": 304,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(double)",
      "begin_line": 310,
      "end_line": 316,
      "comment": " \u0027\u0026times;\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this\u0026times;a\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 69)",
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 315,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 323,
      "end_line": 329,
      "comment": " \u0027\u0026times;\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this\u0026times;a\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 48)",
        "(line 326,col 9)-(line 326,col 77)",
        "(line 327,col 9)-(line 327,col 62)",
        "(line 328,col 9)-(line 328,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.divide(double)",
      "begin_line": 335,
      "end_line": 341,
      "comment": " \u0027\u0026divides;\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this\u0026divides;a\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 69)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.divide(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 348,
      "end_line": 354,
      "comment": " \u0027\u0026divides;\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this\u0026divides;a\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 48)",
        "(line 351,col 9)-(line 351,col 77)",
        "(line 352,col 9)-(line 352,col 60)",
        "(line 353,col 9)-(line 353,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.remainder(double)",
      "begin_line": 360,
      "end_line": 364,
      "comment": " \u0027%\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this%a\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 69)",
        "(line 362,col 9)-(line 362,col 36)",
        "(line 363,col 9)-(line 363,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.remainder(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 371,
      "end_line": 377,
      "comment": " \u0027%\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this%a\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 48)",
        "(line 374,col 9)-(line 374,col 77)",
        "(line 375,col 9)-(line 375,col 63)",
        "(line 376,col 9)-(line 376,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.negate()",
      "begin_line": 382,
      "end_line": 388,
      "comment": " unary \u0027-\u0027 operator.\n     * @return -this\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 73)",
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.abs()",
      "begin_line": 393,
      "end_line": 400,
      "comment": " absolute value.\n     * @return abs(this)\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.ceil()",
      "begin_line": 405,
      "end_line": 409,
      "comment": " Get the smallest whole number larger than instance.\n     * @return ceil(this)\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 408,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.floor()",
      "begin_line": 414,
      "end_line": 418,
      "comment": " Get the largest whole number smaller than instance.\n     * @return floor(this)\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 417,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.rint()",
      "begin_line": 423,
      "end_line": 427,
      "comment": " Get the whole number that is the nearest to the instance, or the even one if x is exactly half way between two integers.\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d this \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.round()",
      "begin_line": 432,
      "end_line": 434,
      "comment": " Get the closest long to instance value.\n     * @return closest long to {@link #getValue()}\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.signum()",
      "begin_line": 441,
      "end_line": 445,
      "comment": " Compute the signum of the instance.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.copySign(double)",
      "begin_line": 454,
      "end_line": 461,
      "comment": "\n     * Returns the instance with the sign of the argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param sign the sign for the returned value\n     * @return the instance with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 50)",
        "(line 456,col 9)-(line 456,col 47)",
        "(line 457,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getExponent()",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\n     * Return the exponent of the instance value, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @return exponent for instance in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.scalb(int)",
      "begin_line": 480,
      "end_line": 486,
      "comment": "\n     * Multiply the instance by a power of 2.\n     * @param n power of 2\n     * @return this \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 73)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hypot(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 503,
      "end_line": 545,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 50)",
        "(line 508,col 9)-(line 544,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.compose(double[])",
      "begin_line": 555,
      "end_line": 562,
      "comment": " Compute composition of the instance by a univariate function.\n     * @param f array of value and derivatives of the function at\n     * the current point (i.e. [f({@link #getValue()}),\n     * f\u0027({@link #getValue()}), f\u0027\u0027({@link #getValue()})...]).\n     * @return f(this)\n     * @exception DimensionMismatchException if the number of derivatives\n     * in the array is not equal to {@link #getOrder() order} + 1\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 77)",
        "(line 560,col 9)-(line 560,col 53)",
        "(line 561,col 9)-(line 561,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.reciprocal()",
      "begin_line": 565,
      "end_line": 569,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 77)",
        "(line 567,col 9)-(line 567,col 50)",
        "(line 568,col 9)-(line 568,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sqrt()",
      "begin_line": 574,
      "end_line": 576,
      "comment": " Square root.\n     * @return square root of the instance\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cbrt()",
      "begin_line": 581,
      "end_line": 583,
      "comment": " Cubic root.\n     * @return cubic root of the instance\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.rootN(int)",
      "begin_line": 589,
      "end_line": 593,
      "comment": " N\u003csup\u003eth\u003c/sup\u003e root.\n     * @param n order of the root\n     * @return n\u003csup\u003eth\u003c/sup\u003e root of the instance\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 77)",
        "(line 591,col 9)-(line 591,col 51)",
        "(line 592,col 9)-(line 592,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getField()",
      "begin_line": 596,
      "end_line": 615,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 597,col 9)-(line 614,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-e3717206-460f-4147-8050-41b952f24e36.getZero()",
      "begin_line": 600,
      "end_line": 602,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 601,col 17)-(line 601,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-41eb0356-9dd7-4865-8690-f41aa3348c2a.getOne()",
      "begin_line": 605,
      "end_line": 607,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 606,col 17)-(line 606,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-01ab763a-2b32-4e14-a6d1-3bcc2de3fda8.getRuntimeClass()",
      "begin_line": 610,
      "end_line": 612,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 611,col 17)-(line 611,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(double)",
      "begin_line": 621,
      "end_line": 625,
      "comment": " Power operation.\n     * @param p power to apply\n     * @return this\u003csup\u003ep\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 77)",
        "(line 623,col 9)-(line 623,col 49)",
        "(line 624,col 9)-(line 624,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(int)",
      "begin_line": 631,
      "end_line": 635,
      "comment": " Integer power operation.\n     * @param n power to apply\n     * @return this\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 77)",
        "(line 633,col 9)-(line 633,col 49)",
        "(line 634,col 9)-(line 634,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 642,
      "end_line": 648,
      "comment": " Power operation.\n     * @param e exponent\n     * @return this\u003csup\u003ee\u003c/sup\u003e\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 48)",
        "(line 645,col 9)-(line 645,col 77)",
        "(line 646,col 9)-(line 646,col 57)",
        "(line 647,col 9)-(line 647,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.exp()",
      "begin_line": 653,
      "end_line": 657,
      "comment": " Exponential.\n     * @return exponential of the instance\n     ",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 77)",
        "(line 655,col 9)-(line 655,col 46)",
        "(line 656,col 9)-(line 656,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.expm1()",
      "begin_line": 662,
      "end_line": 666,
      "comment": " Exponential minus 1.\n     * @return exponential minus one of the instance\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 77)",
        "(line 664,col 9)-(line 664,col 48)",
        "(line 665,col 9)-(line 665,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log()",
      "begin_line": 671,
      "end_line": 675,
      "comment": " Natural logarithm.\n     * @return logarithm of the instance\n     ",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 77)",
        "(line 673,col 9)-(line 673,col 46)",
        "(line 674,col 9)-(line 674,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log1p()",
      "begin_line": 680,
      "end_line": 684,
      "comment": " Shifted natural logarithm.\n     * @return logarithm of one plus the instance\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 77)",
        "(line 682,col 9)-(line 682,col 48)",
        "(line 683,col 9)-(line 683,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log10()",
      "begin_line": 689,
      "end_line": 693,
      "comment": " Base 10 logarithm.\n     * @return base 10 logarithm of the instance\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 77)",
        "(line 691,col 9)-(line 691,col 48)",
        "(line 692,col 9)-(line 692,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cos()",
      "begin_line": 698,
      "end_line": 702,
      "comment": " Cosine operation.\n     * @return cos(this)\n     ",
      "child_ranges": [
        "(line 699,col 9)-(line 699,col 77)",
        "(line 700,col 9)-(line 700,col 46)",
        "(line 701,col 9)-(line 701,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sin()",
      "begin_line": 707,
      "end_line": 711,
      "comment": " Sine operation.\n     * @return sin(this)\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 77)",
        "(line 709,col 9)-(line 709,col 46)",
        "(line 710,col 9)-(line 710,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.tan()",
      "begin_line": 716,
      "end_line": 720,
      "comment": " Tangent operation.\n     * @return tan(this)\n     ",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 77)",
        "(line 718,col 9)-(line 718,col 46)",
        "(line 719,col 9)-(line 719,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.acos()",
      "begin_line": 725,
      "end_line": 729,
      "comment": " Arc cosine operation.\n     * @return acos(this)\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 77)",
        "(line 727,col 9)-(line 727,col 47)",
        "(line 728,col 9)-(line 728,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.asin()",
      "begin_line": 734,
      "end_line": 738,
      "comment": " Arc sine operation.\n     * @return asin(this)\n     ",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 77)",
        "(line 736,col 9)-(line 736,col 47)",
        "(line 737,col 9)-(line 737,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan()",
      "begin_line": 743,
      "end_line": 747,
      "comment": " Arc tangent operation.\n     * @return atan(this)\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 77)",
        "(line 745,col 9)-(line 745,col 47)",
        "(line 746,col 9)-(line 746,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan2(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 755,
      "end_line": 761,
      "comment": " Two arguments arc tangent operation.\n     * @param y first argument of the arc tangent\n     * @param x second argument of the arc tangent\n     * @return atan2(y, x)\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 50)",
        "(line 758,col 9)-(line 758,col 79)",
        "(line 759,col 9)-(line 759,col 63)",
        "(line 760,col 9)-(line 760,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cosh()",
      "begin_line": 766,
      "end_line": 770,
      "comment": " Hyperbolic cosine operation.\n     * @return cosh(this)\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 77)",
        "(line 768,col 9)-(line 768,col 47)",
        "(line 769,col 9)-(line 769,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sinh()",
      "begin_line": 775,
      "end_line": 779,
      "comment": " Hyperbolic sine operation.\n     * @return sinh(this)\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 77)",
        "(line 777,col 9)-(line 777,col 47)",
        "(line 778,col 9)-(line 778,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.tanh()",
      "begin_line": 784,
      "end_line": 788,
      "comment": " Hyperbolic tangent operation.\n     * @return tanh(this)\n     ",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 77)",
        "(line 786,col 9)-(line 786,col 47)",
        "(line 787,col 9)-(line 787,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.acosh()",
      "begin_line": 793,
      "end_line": 797,
      "comment": " Inverse hyperbolic cosine operation.\n     * @return acosh(this)\n     ",
      "child_ranges": [
        "(line 794,col 9)-(line 794,col 77)",
        "(line 795,col 9)-(line 795,col 48)",
        "(line 796,col 9)-(line 796,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.asinh()",
      "begin_line": 802,
      "end_line": 806,
      "comment": " Inverse hyperbolic sine operation.\n     * @return asin(this)\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 77)",
        "(line 804,col 9)-(line 804,col 48)",
        "(line 805,col 9)-(line 805,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atanh()",
      "begin_line": 811,
      "end_line": 815,
      "comment": " Inverse hyperbolic  tangent operation.\n     * @return atanh(this)\n     ",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 77)",
        "(line 813,col 9)-(line 813,col 48)",
        "(line 814,col 9)-(line 814,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.toDegrees()",
      "begin_line": 820,
      "end_line": 826,
      "comment": " Convert radians to degrees, with error of less than 0.5 ULP\n     *  @return instance converted into degrees\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 73)",
        "(line 822,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 825,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.toRadians()",
      "begin_line": 831,
      "end_line": 837,
      "comment": " Convert degrees to radians, with error of less than 0.5 ULP\n     *  @return instance converted into radians\n     ",
      "child_ranges": [
        "(line 832,col 9)-(line 832,col 73)",
        "(line 833,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 836,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.taylor(double...)",
      "begin_line": 843,
      "end_line": 845,
      "comment": " Evaluate Taylor expansion a derivative structure.\n     * @param delta parameters offsets (\u0026Delta;x, \u0026Delta;y, ...)\n     * @return value of the Taylor expansion at x + \u0026Delta;x, y + \u0026Delta;y, ...\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.writeReplace()",
      "begin_line": 851,
      "end_line": 853,
      "comment": "\n     * Replace the instance with a data transfer object for serialization.\n     * @return data transfer object that will be serialized\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataTransferObject",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 856,
      "end_line": 896,
      "comment": " Internal class used only for serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 859,
      "end_line": 859,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "variables"
      ],
      "begin_line": 864,
      "end_line": 864,
      "comment": " Number of variables.\n         * @Serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "order"
      ],
      "begin_line": 869,
      "end_line": 869,
      "comment": " Derivation order.\n         * @Serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 874,
      "end_line": 874,
      "comment": " Partial derivatives.\n         * @Serial\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DataTransferObject.DataTransferObject(int, int, double[])",
      "begin_line": 881,
      "end_line": 885,
      "comment": " Simple constructor.\n         * @param variables number of variables\n         * @param order derivation order\n         * @param data partial derivatives\n         ",
      "child_ranges": [
        "(line 882,col 13)-(line 882,col 39)",
        "(line 883,col 13)-(line 883,col 35)",
        "(line 884,col 13)-(line 884,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DataTransferObject.readResolve()",
      "begin_line": 890,
      "end_line": 894,
      "comment": " Replace the deserialized data transfer object with a {@link DerivativeStructure}.\n         * @return replacement {@link DerivativeStructure}\n         ",
      "child_ranges": [
        "(line 891,col 13)-(line 891,col 85)",
        "(line 892,col 13)-(line 892,col 66)",
        "(line 893,col 13)-(line 893,col 22)"
      ]
    }
  ]
}