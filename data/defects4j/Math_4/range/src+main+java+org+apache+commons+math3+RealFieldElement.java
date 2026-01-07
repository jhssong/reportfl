{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/RealFieldElement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealFieldElement",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.FieldElement\u003cT\u003e"
      ],
      "begin_line": 29,
      "end_line": 403,
      "comment": "\n * Interface representing a \u003ca href\u003d\"http://mathworld.wolfram.com/RealNumber.html\"\u003ereal\u003c/a\u003e\n * \u003ca href\u003d\"http://mathworld.wolfram.com/Field.html\"\u003efield\u003c/a\u003e.\n * @param \u003cT\u003e the type of the field elements\n * @see FieldElement\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.getReal()",
      "begin_line": 34,
      "end_line": 34,
      "comment": " Get the real value of the number.\n     * @return real value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.add(double)",
      "begin_line": 40,
      "end_line": 40,
      "comment": " \u0027+\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this+a\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.subtract(double)",
      "begin_line": 46,
      "end_line": 46,
      "comment": " \u0027-\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this-a\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.multiply(double)",
      "begin_line": 52,
      "end_line": 52,
      "comment": " \u0027\u0026times;\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this\u0026times;a\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.divide(double)",
      "begin_line": 58,
      "end_line": 58,
      "comment": " \u0027\u0026divides;\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this\u0026divides;a\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.remainder(double)",
      "begin_line": 65,
      "end_line": 65,
      "comment": " IEEE remainder operator.\n     * @param a right hand side parameter of the operator\n     * @return this - n \u0026times; a where n is the closest integer to this/a\n     * (the even integer is chosen for n if this/a is halfway between two integers)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.remainder(T)",
      "begin_line": 73,
      "end_line": 74,
      "comment": " IEEE remainder operator.\n     * @param a right hand side parameter of the operator\n     * @return this - n \u0026times; a where n is the closest integer to this/a\n     * (the even integer is chosen for n if this/a is halfway between two integers)\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.abs()",
      "begin_line": 79,
      "end_line": 79,
      "comment": " absolute value.\n     * @return abs(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.ceil()",
      "begin_line": 84,
      "end_line": 84,
      "comment": " Get the smallest whole number larger than instance.\n     * @return ceil(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.floor()",
      "begin_line": 89,
      "end_line": 89,
      "comment": " Get the largest whole number smaller than instance.\n     * @return floor(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.rint()",
      "begin_line": 94,
      "end_line": 94,
      "comment": " Get the whole number that is the nearest to the instance, or the even one if x is exactly half way between two integers.\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d this \u003c\u003d r + 0.5\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.round()",
      "begin_line": 99,
      "end_line": 99,
      "comment": " Get the closest long to instance value.\n     * @return closest long to {@link #getReal()}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.signum()",
      "begin_line": 105,
      "end_line": 105,
      "comment": " Compute the signum of the instance.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.copySign(T)",
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Returns the instance with the sign of the argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param sign the sign for the returned value\n     * @return the instance with the same sign as the {@code sign} argument\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.copySign(double)",
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Returns the instance with the sign of the argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param sign the sign for the returned value\n     * @return the instance with the same sign as the {@code sign} argument\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.scalb(int)",
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * Multiply the instance by a power of 2.\n     * @param n power of 2\n     * @return this \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.hypot(T)",
      "begin_line": 146,
      "end_line": 147,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code this} and {@code y}\n     * - sqrt(\u003ci\u003ethis\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param y a value\n     * @return sqrt(\u003ci\u003ethis\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.reciprocal()",
      "begin_line": 150,
      "end_line": 150,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.sqrt()",
      "begin_line": 155,
      "end_line": 155,
      "comment": " Square root.\n     * @return square root of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.cbrt()",
      "begin_line": 160,
      "end_line": 160,
      "comment": " Cubic root.\n     * @return cubic root of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.rootN(int)",
      "begin_line": 166,
      "end_line": 166,
      "comment": " N\u003csup\u003eth\u003c/sup\u003e root.\n     * @param n order of the root\n     * @return n\u003csup\u003eth\u003c/sup\u003e root of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.pow(double)",
      "begin_line": 172,
      "end_line": 172,
      "comment": " Power operation.\n     * @param p power to apply\n     * @return this\u003csup\u003ep\u003c/sup\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.pow(int)",
      "begin_line": 178,
      "end_line": 178,
      "comment": " Integer power operation.\n     * @param n power to apply\n     * @return this\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.pow(T)",
      "begin_line": 185,
      "end_line": 186,
      "comment": " Power operation.\n     * @param e exponent\n     * @return this\u003csup\u003ee\u003c/sup\u003e\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.exp()",
      "begin_line": 191,
      "end_line": 191,
      "comment": " Exponential.\n     * @return exponential of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.expm1()",
      "begin_line": 196,
      "end_line": 196,
      "comment": " Exponential minus 1.\n     * @return exponential minus one of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.log()",
      "begin_line": 201,
      "end_line": 201,
      "comment": " Natural logarithm.\n     * @return logarithm of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.log1p()",
      "begin_line": 206,
      "end_line": 206,
      "comment": " Shifted natural logarithm.\n     * @return logarithm of one plus the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.cos()",
      "begin_line": 218,
      "end_line": 218,
      "comment": " Cosine operation.\n     * @return cos(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.sin()",
      "begin_line": 223,
      "end_line": 223,
      "comment": " Sine operation.\n     * @return sin(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.tan()",
      "begin_line": 228,
      "end_line": 228,
      "comment": " Tangent operation.\n     * @return tan(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.acos()",
      "begin_line": 233,
      "end_line": 233,
      "comment": " Arc cosine operation.\n     * @return acos(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.asin()",
      "begin_line": 238,
      "end_line": 238,
      "comment": " Arc sine operation.\n     * @return asin(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.atan()",
      "begin_line": 243,
      "end_line": 243,
      "comment": " Arc tangent operation.\n     * @return atan(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.atan2(T)",
      "begin_line": 250,
      "end_line": 251,
      "comment": " Two arguments arc tangent operation.\n     * @param x second argument of the arc tangent\n     * @return atan2(this, x)\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.cosh()",
      "begin_line": 256,
      "end_line": 256,
      "comment": " Hyperbolic cosine operation.\n     * @return cosh(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.sinh()",
      "begin_line": 261,
      "end_line": 261,
      "comment": " Hyperbolic sine operation.\n     * @return sinh(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.tanh()",
      "begin_line": 266,
      "end_line": 266,
      "comment": " Hyperbolic tangent operation.\n     * @return tanh(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.acosh()",
      "begin_line": 271,
      "end_line": 271,
      "comment": " Inverse hyperbolic cosine operation.\n     * @return acosh(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.asinh()",
      "begin_line": 276,
      "end_line": 276,
      "comment": " Inverse hyperbolic sine operation.\n     * @return asin(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.atanh()",
      "begin_line": 281,
      "end_line": 281,
      "comment": " Inverse hyperbolic  tangent operation.\n     * @return atanh(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.linearCombination(T[], T[])",
      "begin_line": 291,
      "end_line": 292,
      "comment": "\n     * Compute a linear combination.\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     * @since 3.2\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.linearCombination(double[], T[])",
      "begin_line": 302,
      "end_line": 303,
      "comment": "\n     * Compute a linear combination.\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     * @since 3.2\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.linearCombination(T, T, T, T)",
      "begin_line": 317,
      "end_line": 317,
      "comment": "\n     * Compute a linear combination.\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(Object, Object, Object, Object, Object, Object)\n     * @see #linearCombination(Object, Object, Object, Object, Object, Object, Object, Object)\n     * @since 3.2\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.linearCombination(double, T, double, T)",
      "begin_line": 331,
      "end_line": 331,
      "comment": "\n     * Compute a linear combination.\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, Object, double, Object, double, Object)\n     * @see #linearCombination(double, Object, double, Object, double, Object, double, Object)\n     * @since 3.2\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.linearCombination(T, T, T, T, T, T)",
      "begin_line": 347,
      "end_line": 347,
      "comment": "\n     * Compute a linear combination.\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(Object, Object, Object, Object)\n     * @see #linearCombination(Object, Object, Object, Object, Object, Object, Object, Object)\n     * @since 3.2\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.linearCombination(double, T, double, T, double, T)",
      "begin_line": 363,
      "end_line": 363,
      "comment": "\n     * Compute a linear combination.\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, Object, double, Object)\n     * @see #linearCombination(double, Object, double, Object, double, Object, double, Object)\n     * @since 3.2\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.linearCombination(T, T, T, T, T, T, T, T)",
      "begin_line": 382,
      "end_line": 382,
      "comment": "\n     * Compute a linear combination.\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(Object, Object, Object, Object)\n     * @see #linearCombination(Object, Object, Object, Object, Object, Object)\n     * @since 3.2\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.RealFieldElement.linearCombination(double, T, double, T, double, T, double, T)",
      "begin_line": 401,
      "end_line": 401,
      "comment": "\n     * Compute a linear combination.\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, Object, double, Object)\n     * @see #linearCombination(double, Object, double, Object, double, Object)\n     * @since 3.2\n     ",
      "child_ranges": []
    }
  ]
}