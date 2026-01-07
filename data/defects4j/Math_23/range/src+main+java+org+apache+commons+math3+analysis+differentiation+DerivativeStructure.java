{
  "filepath": "/tmp/Math-23b/src/main/java/org/apache/commons/math3/analysis/differentiation/DerivativeStructure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DerivativeStructure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.FieldElement\u003corg.apache.commons.math3.analysis.differentiation.DerivativeStructure\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 53,
      "end_line": 868,
      "comment": " Class representing both the value and the differentials of a function.\n * \u003cp\u003eThis class is the workhorse of the differentiation package.\u003c/p\u003e\n * \u003cp\u003eThis class is an implementation of the extension to Rall\u0027s\n * numbers described in Dan Kalman\u0027s paper \u003ca\n * href\u003d\"http://www.math.american.edu/People/kalman/pdffiles/mmgautodiff.pdf\"\u003eDoubly\n * Recursive Multivariate Automatic Differentiation\u003c/a\u003e, Mathematics Magazine, vol. 75,\n * no. 3, June 2002.\u003c/p\u003e. Rall\u0027s numbers are an extension to the real numbers used\n * throughout mathematical expressions; they hold the derivative together with the\n * value of a function. Dan Kalman\u0027s derivative structures holds all partial derivatives\n * up to any specified order, with respect to any number of free variables. Rall\u0027s\n * number therefore can be seen as derivative structures for order one derivative and\n * one free variable, and real numbers can be seen as derivative structures with zero\n * order derivative and no free variables.\u003c/p\u003e\n * \u003cp\u003e{@link DerivativeStructure} instances can be used directly thanks to\n * the arithmetic operators to the mathematical functions provided as static\n * methods by this class (+, -, *, /, %, sin, cos ...).\u003c/p\u003e\n * \u003cp\u003eImplementing complex expressions by hand using these classes is\n * however a complex and error-prone task, so the classical use is\n * simply to develop computation code using standard primitive double\n * values and to use {@link UnivariateDifferentiator differentiators} to create\n * the {@link DerivativeStructure}-based instances.\u003c/p\u003e\n * \u003cp\u003eInstances of this class are guaranteed to be immutable.\u003c/p\u003e\n * @see DSCompiler\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "compiler"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Compiler for the current dimensions. "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Combined array holding all values. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DSCompiler)",
      "begin_line": 67,
      "end_line": 70,
      "comment": " Build an instance with all values and derivatives set to 0.\n     * @param compiler compiler to use for computation\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 33)",
        "(line 69,col 9)-(line 69,col 55)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int)",
      "begin_line": 76,
      "end_line": 78,
      "comment": " Build an instance with all values and derivatives set to 0.\n     * @param parameters number of free parameters\n     * @param order derivation order\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int, double)",
      "begin_line": 87,
      "end_line": 90,
      "comment": " Build an instance representing a constant value.\n     * @param parameters number of free parameters\n     * @param parameters number of variables\n     * @param order derivation order\n     * @param value value of the constant\n     * @see #DerivativeStructure(int, int, int, double)\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 32)",
        "(line 89,col 9)-(line 89,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(int, int, int, double)",
      "begin_line": 104,
      "end_line": 118,
      "comment": " Build an instance representing a variable.\n     * \u003cp\u003eInstances built using this constructor are considered\n     * to be the free variables with respect to which differentials\n     * are computed. As such, their differential with respect to\n     * themselves is +1.\u003c/p\u003e\n     * @param parameters number of free parameters\n     * @param order derivation order\n     * @param index index of the variable (from 0 to {@code variables - 1})\n     * @param value value of the variable\n     * @exception NumberIsTooLargeException if index is equal to variables or larger\n     * @see #DerivativeStructure(int, int, double)\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 39)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 128,
      "end_line": 134,
      "comment": " Linear combination constructor.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2\n     * @param a1 first scale factor\n     * @param ds1 first base (unscaled) derivative structure\n     * @param a2 second scale factor\n     * @param ds2 second base (unscaled) derivative structure\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 27)",
        "(line 132,col 9)-(line 132,col 50)",
        "(line 133,col 9)-(line 133,col 78)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 146,
      "end_line": 154,
      "comment": " Linear combination constructor.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3\n     * @param a1 first scale factor\n     * @param ds1 first base (unscaled) derivative structure\n     * @param a2 second scale factor\n     * @param ds2 second base (unscaled) derivative structure\n     * @param a3 third scale factor\n     * @param ds3 third base (unscaled) derivative structure\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 27)",
        "(line 151,col 9)-(line 151,col 50)",
        "(line 152,col 9)-(line 152,col 50)",
        "(line 153,col 9)-(line 153,col 95)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure, double, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 168,
      "end_line": 180,
      "comment": " Linear combination constructor.\n     * The derivative structure built will be a1 * ds1 + a2 * ds2 + a3 * ds3 + a4 * ds4\n     * @param a1 first scale factor\n     * @param ds1 first base (unscaled) derivative structure\n     * @param a2 second scale factor\n     * @param ds2 second base (unscaled) derivative structure\n     * @param a3 third scale factor\n     * @param ds3 third base (unscaled) derivative structure\n     * @param a4 fourth scale factor\n     * @param ds4 fourth base (unscaled) derivative structure\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 27)",
        "(line 174,col 9)-(line 174,col 50)",
        "(line 175,col 9)-(line 175,col 50)",
        "(line 176,col 9)-(line 176,col 50)",
        "(line 177,col 9)-(line 179,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DerivativeStructure(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 185,
      "end_line": 188,
      "comment": " Copy constructor.\n     * @param instance to copy\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 36)",
        "(line 187,col 9)-(line 187,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getFreeParameters()",
      "begin_line": 193,
      "end_line": 195,
      "comment": " Get the number of free parameters.\n     * @return number of free parameters\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getOrder()",
      "begin_line": 200,
      "end_line": 202,
      "comment": " Get the derivation order.\n     * @return derivation order\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getValue()",
      "begin_line": 208,
      "end_line": 210,
      "comment": " Get the value part of the derivative structure.\n     * @return value part of the derivative structure\n     * @see #getPartialDerivative(int...)\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getPartialDerivative(int...)",
      "begin_line": 222,
      "end_line": 225,
      "comment": " Get a partial derivative.\n     * @param orders derivation orders with respect to each variable (if all orders are 0,\n     * the value is returned)\n     * @return partial derivative\n     * @see #getValue()\n     * @exception DimensionMismatchException if the numbers of variables does not\n     * match the instance\n     * @exception NumberIsTooLargeException if sum of derivation orders is larger\n     * than the instance limits\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.add(double)",
      "begin_line": 231,
      "end_line": 235,
      "comment": " \u0027+\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this+a\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 69)",
        "(line 233,col 9)-(line 233,col 24)",
        "(line 234,col 9)-(line 234,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.add(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 242,
      "end_line": 248,
      "comment": " \u0027+\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this+a\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 48)",
        "(line 245,col 9)-(line 245,col 69)",
        "(line 246,col 9)-(line 246,col 53)",
        "(line 247,col 9)-(line 247,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.subtract(double)",
      "begin_line": 254,
      "end_line": 256,
      "comment": " \u0027-\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this-a\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.subtract(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 263,
      "end_line": 269,
      "comment": " \u0027-\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this-a\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 48)",
        "(line 266,col 9)-(line 266,col 69)",
        "(line 267,col 9)-(line 267,col 58)",
        "(line 268,col 9)-(line 268,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(int)",
      "begin_line": 272,
      "end_line": 274,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(double)",
      "begin_line": 280,
      "end_line": 286,
      "comment": " \u0027\u0026times;\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this\u0026times;a\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 69)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.multiply(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 293,
      "end_line": 299,
      "comment": " \u0027\u0026times;\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this\u0026times;a\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 48)",
        "(line 296,col 9)-(line 296,col 77)",
        "(line 297,col 9)-(line 297,col 62)",
        "(line 298,col 9)-(line 298,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.divide(double)",
      "begin_line": 305,
      "end_line": 311,
      "comment": " \u0027\u0026divides;\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this\u0026divides;a\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 69)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 310,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.divide(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 318,
      "end_line": 324,
      "comment": " \u0027\u0026divides;\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this\u0026divides;a\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 48)",
        "(line 321,col 9)-(line 321,col 77)",
        "(line 322,col 9)-(line 322,col 60)",
        "(line 323,col 9)-(line 323,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.remainder(double)",
      "begin_line": 330,
      "end_line": 334,
      "comment": " \u0027%\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this%a\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 69)",
        "(line 332,col 9)-(line 332,col 36)",
        "(line 333,col 9)-(line 333,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.remainder(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 341,
      "end_line": 347,
      "comment": " \u0027%\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this%a\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 48)",
        "(line 344,col 9)-(line 344,col 77)",
        "(line 345,col 9)-(line 345,col 63)",
        "(line 346,col 9)-(line 346,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.negate()",
      "begin_line": 352,
      "end_line": 358,
      "comment": " unary \u0027-\u0027 operator.\n     * @return -this\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 73)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.abs()",
      "begin_line": 363,
      "end_line": 370,
      "comment": " absolute value.\n     * @return abs(this)\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.ceil()",
      "begin_line": 375,
      "end_line": 379,
      "comment": " Get the smallest whole number larger than instance.\n     * @return ceil(this)\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 378,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.floor()",
      "begin_line": 384,
      "end_line": 388,
      "comment": " Get the largest whole number smaller than instance.\n     * @return floor(this)\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 387,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.rint()",
      "begin_line": 393,
      "end_line": 397,
      "comment": " Get the whole number that is the nearest to the instance, or the even one if x is exactly half way between two integers.\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d this \u003c\u003d r + 0.5\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 396,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.round()",
      "begin_line": 402,
      "end_line": 404,
      "comment": " Get the closest long to instance value.\n     * @return closest long to {@link #getValue()}\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.signum()",
      "begin_line": 411,
      "end_line": 415,
      "comment": " Compute the signum of the instance.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @param a number on which evaluation is done\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 414,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.copySign(double)",
      "begin_line": 424,
      "end_line": 431,
      "comment": "\n     * Returns the instance with the sign of the argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param sign the sign for the returned value\n     * @return the instance with the same sign as the {@code sign} argument\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 50)",
        "(line 426,col 9)-(line 426,col 47)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getExponent()",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * Return the exponent of the instance value, removing the bias.\n     * \u003cp\u003e\n     * For double numbers of the form 2\u003csup\u003ex\u003c/sup\u003e, the unbiased\n     * exponent is exactly x.\n     * \u003c/p\u003e\n     * @return exponent for instance in IEEE754 representation, without bias\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.scalb(int)",
      "begin_line": 450,
      "end_line": 456,
      "comment": "\n     * Multiply the instance by a power of 2.\n     * @param n power of 2\n     * @return this \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 73)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 455,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.hypot(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 473,
      "end_line": 515,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code x} and {@code y}\n     * - sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param x a value\n     * @param y a value\n     * @return sqrt(\u003ci\u003ex\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 50)",
        "(line 478,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.compose(double[])",
      "begin_line": 525,
      "end_line": 532,
      "comment": " Compute composition of the instance by a univariate function.\n     * @param f array of value and derivatives of the function at\n     * the current point (i.e. [f({@link #getValue()}),\n     * f\u0027({@link #getValue()}), f\u0027\u0027({@link #getValue()})...]).\n     * @return f(this)\n     * @exception DimensionMismatchException if the number of derivatives\n     * in the array is not equal to {@link #getOrder() order} + 1\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 77)",
        "(line 530,col 9)-(line 530,col 53)",
        "(line 531,col 9)-(line 531,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.reciprocal()",
      "begin_line": 535,
      "end_line": 539,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 77)",
        "(line 537,col 9)-(line 537,col 50)",
        "(line 538,col 9)-(line 538,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sqrt()",
      "begin_line": 544,
      "end_line": 546,
      "comment": " Square root.\n     * @return square root of the instance\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cbrt()",
      "begin_line": 551,
      "end_line": 553,
      "comment": " Cubic root.\n     * @return cubic root of the instance\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.rootN(int)",
      "begin_line": 559,
      "end_line": 563,
      "comment": " N\u003csup\u003eth\u003c/sup\u003e root.\n     * @param n order of the root\n     * @return n\u003csup\u003eth\u003c/sup\u003e root of the instance\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 77)",
        "(line 561,col 9)-(line 561,col 51)",
        "(line 562,col 9)-(line 562,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.getField()",
      "begin_line": 566,
      "end_line": 585,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 567,col 9)-(line 584,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-97501cc8-05ec-4228-9a3c-507fb53ab46b.getZero()",
      "begin_line": 570,
      "end_line": 572,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 571,col 17)-(line 571,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-f1ba9da8-fafd-4708-8b4d-496688eb2891.getOne()",
      "begin_line": 575,
      "end_line": 577,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 576,col 17)-(line 576,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.Anonymous-e6007666-9fd8-4931-b14c-1a54f5665480.getRuntimeClass()",
      "begin_line": 580,
      "end_line": 582,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 581,col 17)-(line 581,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(double)",
      "begin_line": 591,
      "end_line": 595,
      "comment": " Power operation.\n     * @param p power to apply\n     * @return this\u003csup\u003ep\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 77)",
        "(line 593,col 9)-(line 593,col 49)",
        "(line 594,col 9)-(line 594,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(int)",
      "begin_line": 601,
      "end_line": 605,
      "comment": " Integer power operation.\n     * @param n power to apply\n     * @return this\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 77)",
        "(line 603,col 9)-(line 603,col 49)",
        "(line 604,col 9)-(line 604,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.pow(org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 612,
      "end_line": 618,
      "comment": " Power operation.\n     * @param e exponent\n     * @return this\u003csup\u003ee\u003c/sup\u003e\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 48)",
        "(line 615,col 9)-(line 615,col 77)",
        "(line 616,col 9)-(line 616,col 57)",
        "(line 617,col 9)-(line 617,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.exp()",
      "begin_line": 623,
      "end_line": 627,
      "comment": " Exponential.\n     * @return exponential of the instance\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 77)",
        "(line 625,col 9)-(line 625,col 46)",
        "(line 626,col 9)-(line 626,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.expm1()",
      "begin_line": 632,
      "end_line": 636,
      "comment": " Exponential minus 1.\n     * @return exponential minus one of the instance\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 77)",
        "(line 634,col 9)-(line 634,col 48)",
        "(line 635,col 9)-(line 635,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log()",
      "begin_line": 641,
      "end_line": 645,
      "comment": " Natural logarithm.\n     * @return logarithm of the instance\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 77)",
        "(line 643,col 9)-(line 643,col 46)",
        "(line 644,col 9)-(line 644,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log1p()",
      "begin_line": 650,
      "end_line": 654,
      "comment": " Shifted natural logarithm.\n     * @return logarithm of one plus the instance\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 77)",
        "(line 652,col 9)-(line 652,col 48)",
        "(line 653,col 9)-(line 653,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.log10()",
      "begin_line": 659,
      "end_line": 663,
      "comment": " Base 10 logarithm.\n     * @return base 10 logarithm of the instance\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 77)",
        "(line 661,col 9)-(line 661,col 48)",
        "(line 662,col 9)-(line 662,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cos()",
      "begin_line": 668,
      "end_line": 672,
      "comment": " Cosine operation.\n     * @return cos(this)\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 77)",
        "(line 670,col 9)-(line 670,col 46)",
        "(line 671,col 9)-(line 671,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sin()",
      "begin_line": 677,
      "end_line": 681,
      "comment": " Sine operation.\n     * @return sin(this)\n     ",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 77)",
        "(line 679,col 9)-(line 679,col 46)",
        "(line 680,col 9)-(line 680,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.tan()",
      "begin_line": 686,
      "end_line": 690,
      "comment": " Tangent operation.\n     * @return tan(this)\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 687,col 77)",
        "(line 688,col 9)-(line 688,col 46)",
        "(line 689,col 9)-(line 689,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.acos()",
      "begin_line": 695,
      "end_line": 699,
      "comment": " Arc cosine operation.\n     * @return acos(this)\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 77)",
        "(line 697,col 9)-(line 697,col 47)",
        "(line 698,col 9)-(line 698,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.asin()",
      "begin_line": 704,
      "end_line": 708,
      "comment": " Arc sine operation.\n     * @return asin(this)\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 77)",
        "(line 706,col 9)-(line 706,col 47)",
        "(line 707,col 9)-(line 707,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan()",
      "begin_line": 713,
      "end_line": 717,
      "comment": " Arc tangent operation.\n     * @return atan(this)\n     ",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 77)",
        "(line 715,col 9)-(line 715,col 47)",
        "(line 716,col 9)-(line 716,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atan2(org.apache.commons.math3.analysis.differentiation.DerivativeStructure, org.apache.commons.math3.analysis.differentiation.DerivativeStructure)",
      "begin_line": 725,
      "end_line": 731,
      "comment": " Two arguments arc tangent operation.\n     * @param y first argument of the arc tangent\n     * @param x second argument of the arc tangent\n     * @return atan2(y, x)\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 50)",
        "(line 728,col 9)-(line 728,col 79)",
        "(line 729,col 9)-(line 729,col 63)",
        "(line 730,col 9)-(line 730,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.cosh()",
      "begin_line": 736,
      "end_line": 740,
      "comment": " Hyperbolic cosine operation.\n     * @return cosh(this)\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 77)",
        "(line 738,col 9)-(line 738,col 47)",
        "(line 739,col 9)-(line 739,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.sinh()",
      "begin_line": 745,
      "end_line": 749,
      "comment": " Hyperbolic sine operation.\n     * @return sinh(this)\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 77)",
        "(line 747,col 9)-(line 747,col 47)",
        "(line 748,col 9)-(line 748,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.tanh()",
      "begin_line": 754,
      "end_line": 758,
      "comment": " Hyperbolic tangent operation.\n     * @return tanh(this)\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 755,col 77)",
        "(line 756,col 9)-(line 756,col 47)",
        "(line 757,col 9)-(line 757,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.acosh()",
      "begin_line": 763,
      "end_line": 767,
      "comment": " Inverse hyperbolic cosine operation.\n     * @return acosh(this)\n     ",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 77)",
        "(line 765,col 9)-(line 765,col 48)",
        "(line 766,col 9)-(line 766,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.asinh()",
      "begin_line": 772,
      "end_line": 776,
      "comment": " Inverse hyperbolic sine operation.\n     * @return asin(this)\n     ",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 77)",
        "(line 774,col 9)-(line 774,col 48)",
        "(line 775,col 9)-(line 775,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.atanh()",
      "begin_line": 781,
      "end_line": 785,
      "comment": " Inverse hyperbolic  tangent operation.\n     * @return atanh(this)\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 77)",
        "(line 783,col 9)-(line 783,col 48)",
        "(line 784,col 9)-(line 784,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.toDegrees()",
      "begin_line": 790,
      "end_line": 796,
      "comment": " Convert radians to degrees, with error of less than 0.5 ULP\n     *  @return instance converted into degrees\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 73)",
        "(line 792,col 9)-(line 794,col 9)",
        "(line 795,col 9)-(line 795,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.toRadians()",
      "begin_line": 801,
      "end_line": 807,
      "comment": " Convert degrees to radians, with error of less than 0.5 ULP\n     *  @return instance converted into radians\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 73)",
        "(line 803,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.taylor(double...)",
      "begin_line": 813,
      "end_line": 815,
      "comment": " Evaluate Taylor expansion a derivative structure.\n     * @param delta parameters offsets (\u0026Delta;x, \u0026Delta;y, ...)\n     * @return value of the Taylor expansion at x + \u0026Delta;x, y + \u0026Delta;y, ...\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.writeReplace()",
      "begin_line": 821,
      "end_line": 823,
      "comment": "\n     * Replace the instance with a data transfer object for serialization.\n     * @return data transfer object that will be serialized\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 95)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataTransferObject",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 826,
      "end_line": 866,
      "comment": " Internal class used only for serialization. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 829,
      "end_line": 829,
      "comment": " Serializable UID. "
    },
    {
      "type": "field",
      "varNames": [
        "variables"
      ],
      "begin_line": 834,
      "end_line": 834,
      "comment": " Number of variables.\n         * @Serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "order"
      ],
      "begin_line": 839,
      "end_line": 839,
      "comment": " Derivation order.\n         * @Serial\n         "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 844,
      "end_line": 844,
      "comment": " Partial derivatives.\n         * @Serial\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DataTransferObject.DataTransferObject(int, int, double[])",
      "begin_line": 851,
      "end_line": 855,
      "comment": " Simple constructor.\n         * @param variables number of variables\n         * @param order derivation order\n         * @param data partial derivatives\n         ",
      "child_ranges": [
        "(line 852,col 13)-(line 852,col 39)",
        "(line 853,col 13)-(line 853,col 35)",
        "(line 854,col 13)-(line 854,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.analysis.differentiation.DerivativeStructure.DataTransferObject.readResolve()",
      "begin_line": 860,
      "end_line": 864,
      "comment": " Replace the deserialized data transfer object with a {@link DerivativeStructure}.\n         * @return replacement {@link DerivativeStructure}\n         ",
      "child_ranges": [
        "(line 861,col 13)-(line 861,col 85)",
        "(line 862,col 13)-(line 862,col 66)",
        "(line 863,col 13)-(line 863,col 22)"
      ]
    }
  ]
}