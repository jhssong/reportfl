{
  "filepath": "/tmp/Math-9b/src/main/java/org/apache/commons/math3/ExtendedFieldElement.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExtendedFieldElement",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math3.FieldElement\u003cT\u003e"
      ],
      "begin_line": 16,
      "end_line": 501,
      "comment": "\n * Interface representing a \u003ca href\u003d\"http://mathworld.wolfram.com/RealNumber.html\"\u003ereal\u003c/a\u003e\n * \u003ca href\u003d\"http://mathworld.wolfram.com/Field.html\"\u003efield\u003c/a\u003e.\n * \u003cp\u003e\n * Classes implementing this interface will often be singletons.\n * \u003c/p\u003e\n * @param \u003cT\u003e the type of the field elements\n * @see FieldElement\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.getReal()",
      "begin_line": 21,
      "end_line": 21,
      "comment": " Get the real value of the number.\n     * @return real value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.add(double)",
      "begin_line": 27,
      "end_line": 27,
      "comment": " \u0027+\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this+a\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.subtract(double)",
      "begin_line": 33,
      "end_line": 33,
      "comment": " \u0027-\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this-a\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.multiply(double)",
      "begin_line": 39,
      "end_line": 39,
      "comment": " \u0027\u0026times;\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this\u0026times;a\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.divide(double)",
      "begin_line": 45,
      "end_line": 45,
      "comment": " \u0027\u0026divides;\u0027 operator.\n     * @param a right hand side parameter of the operator\n     * @return this\u0026divides;a\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.remainder(double)",
      "begin_line": 52,
      "end_line": 52,
      "comment": " IEEE remainder operator.\n     * @param a right hand side parameter of the operator\n     * @return this - n \u0026times; a where n is the closest integer to this/a\n     * (the even integer is chosen for n if this/a is halfway between two integers)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.remainder(T)",
      "begin_line": 60,
      "end_line": 61,
      "comment": " IEEE remainder operator.\n     * @param a right hand side parameter of the operator\n     * @return this - n \u0026times; a where n is the closest integer to this/a\n     * (the even integer is chosen for n if this/a is halfway between two integers)\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.abs()",
      "begin_line": 66,
      "end_line": 66,
      "comment": " absolute value.\n     * @return abs(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.ceil()",
      "begin_line": 71,
      "end_line": 71,
      "comment": " Get the smallest whole number larger than instance.\n     * @return ceil(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.floor()",
      "begin_line": 76,
      "end_line": 76,
      "comment": " Get the largest whole number smaller than instance.\n     * @return floor(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.rint()",
      "begin_line": 81,
      "end_line": 81,
      "comment": " Get the whole number that is the nearest to the instance, or the even one if x is exactly half way between two integers.\n     * @return a double number r such that r is an integer r - 0.5 \u003c\u003d this \u003c\u003d r + 0.5\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.round()",
      "begin_line": 86,
      "end_line": 86,
      "comment": " Get the closest long to instance value.\n     * @return closest long to {@link #getValue()}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.signum()",
      "begin_line": 92,
      "end_line": 92,
      "comment": " Compute the signum of the instance.\n     * The signum is -1 for negative numbers, +1 for positive numbers and 0 otherwise\n     * @return -1.0, -0.0, +0.0, +1.0 or NaN depending on sign of a\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.copySign(T)",
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * Returns the instance with the sign of the argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param sign the sign for the returned value\n     * @return the instance with the same sign as the {@code sign} argument\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.copySign(double)",
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Returns the instance with the sign of the argument.\n     * A NaN {@code sign} argument is treated as positive.\n     *\n     * @param sign the sign for the returned value\n     * @return the instance with the same sign as the {@code sign} argument\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.scalb(int)",
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Multiply the instance by a power of 2.\n     * @param n power of 2\n     * @return this \u0026times; 2\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.hypot(T)",
      "begin_line": 133,
      "end_line": 134,
      "comment": "\n     * Returns the hypotenuse of a triangle with sides {@code this} and {@code y}\n     * - sqrt(\u003ci\u003ethis\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\u003cbr/\u003e\n     * avoiding intermediate overflow or underflow.\n     *\n     * \u003cul\u003e\n     * \u003cli\u003e If either argument is infinite, then the result is positive infinity.\u003c/li\u003e\n     * \u003cli\u003e else, if either argument is NaN then the result is NaN.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param y a value\n     * @return sqrt(\u003ci\u003ethis\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e\u0026nbsp;+\u003ci\u003ey\u003c/i\u003e\u003csup\u003e2\u003c/sup\u003e)\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.reciprocal()",
      "begin_line": 137,
      "end_line": 137,
      "comment": " {@inheritDoc} ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.sqrt()",
      "begin_line": 142,
      "end_line": 142,
      "comment": " Square root.\n     * @return square root of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.cbrt()",
      "begin_line": 147,
      "end_line": 147,
      "comment": " Cubic root.\n     * @return cubic root of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.rootN(int)",
      "begin_line": 153,
      "end_line": 153,
      "comment": " N\u003csup\u003eth\u003c/sup\u003e root.\n     * @param n order of the root\n     * @return n\u003csup\u003eth\u003c/sup\u003e root of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.pow(double)",
      "begin_line": 159,
      "end_line": 159,
      "comment": " Power operation.\n     * @param p power to apply\n     * @return this\u003csup\u003ep\u003c/sup\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.pow(int)",
      "begin_line": 165,
      "end_line": 165,
      "comment": " Integer power operation.\n     * @param n power to apply\n     * @return this\u003csup\u003en\u003c/sup\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.pow(T)",
      "begin_line": 172,
      "end_line": 173,
      "comment": " Power operation.\n     * @param e exponent\n     * @return this\u003csup\u003ee\u003c/sup\u003e\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.exp()",
      "begin_line": 178,
      "end_line": 178,
      "comment": " Exponential.\n     * @return exponential of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.expm1()",
      "begin_line": 183,
      "end_line": 183,
      "comment": " Exponential minus 1.\n     * @return exponential minus one of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.log()",
      "begin_line": 188,
      "end_line": 188,
      "comment": " Natural logarithm.\n     * @return logarithm of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.log1p()",
      "begin_line": 193,
      "end_line": 193,
      "comment": " Shifted natural logarithm.\n     * @return logarithm of one plus the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.log10()",
      "begin_line": 198,
      "end_line": 198,
      "comment": " Base 10 logarithm.\n     * @return base 10 logarithm of the instance\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.cos()",
      "begin_line": 203,
      "end_line": 203,
      "comment": " Cosine operation.\n     * @return cos(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.sin()",
      "begin_line": 208,
      "end_line": 208,
      "comment": " Sine operation.\n     * @return sin(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.tan()",
      "begin_line": 213,
      "end_line": 213,
      "comment": " Tangent operation.\n     * @return tan(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.acos()",
      "begin_line": 218,
      "end_line": 218,
      "comment": " Arc cosine operation.\n     * @return acos(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.asin()",
      "begin_line": 223,
      "end_line": 223,
      "comment": " Arc sine operation.\n     * @return asin(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.atan()",
      "begin_line": 228,
      "end_line": 228,
      "comment": " Arc tangent operation.\n     * @return atan(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.atan2(T)",
      "begin_line": 235,
      "end_line": 236,
      "comment": " Two arguments arc tangent operation.\n     * @param x second argument of the arc tangent\n     * @return atan2(this, x)\n     * @exception DimensionMismatchException if number of free parameters or orders are inconsistent\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.cosh()",
      "begin_line": 241,
      "end_line": 241,
      "comment": " Hyperbolic cosine operation.\n     * @return cosh(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.sinh()",
      "begin_line": 246,
      "end_line": 246,
      "comment": " Hyperbolic sine operation.\n     * @return sinh(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.tanh()",
      "begin_line": 251,
      "end_line": 251,
      "comment": " Hyperbolic tangent operation.\n     * @return tanh(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.acosh()",
      "begin_line": 256,
      "end_line": 256,
      "comment": " Inverse hyperbolic cosine operation.\n     * @return acosh(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.asinh()",
      "begin_line": 261,
      "end_line": 261,
      "comment": " Inverse hyperbolic sine operation.\n     * @return asin(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.atanh()",
      "begin_line": 266,
      "end_line": 266,
      "comment": " Inverse hyperbolic  tangent operation.\n     * @return atanh(this)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.linearCombination(T[], T[])",
      "begin_line": 290,
      "end_line": 291,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Note that the instance is only used as a prototype to get proper elements dimensions.\n     * Its value is not used, only the parameters values are used.\n     * \u003c/p\u003e\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     * @since 3.2\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.linearCombination(double[], T[])",
      "begin_line": 314,
      "end_line": 315,
      "comment": "\n     * Compute a linear combination accurately.\n     * This method computes the sum of the products\n     * \u003ccode\u003ea\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e to high accuracy.\n     * It does so by using specific multiplication and addition algorithms to\n     * preserve accuracy and reduce cancellation effects.\n     * \u003cbr/\u003e\n     * It is based on the 2005 paper\n     * \u003ca href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita, Siegfried M. Rump,\n     * and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Note that the instance is only used as a prototype to get proper elements dimensions.\n     * Its value is not used, only the parameters values are used.\n     * \u003c/p\u003e\n     * @param a Factors.\n     * @param b Factors.\n     * @return \u003ccode\u003e\u0026Sigma;\u003csub\u003ei\u003c/sub\u003e a\u003csub\u003ei\u003c/sub\u003e b\u003csub\u003ei\u003c/sub\u003e\u003c/code\u003e.\n     * @throws DimensionMismatchException if arrays dimensions don\u0027t match\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.linearCombination(T, T, T, T)",
      "begin_line": 343,
      "end_line": 343,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Note that the instance is only used as a prototype to get proper elements dimensions.\n     * Its value is not used, only the parameters values are used.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(T, T, T, T, T, T)\n     * @see #linearCombination(T, T, T, T, T, T, T, T)\n     * @since 3.2\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.linearCombination(double, T, double, T)",
      "begin_line": 371,
      "end_line": 371,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Note that the instance is only used as a prototype to get proper elements dimensions.\n     * Its value is not used, only the parameters values are used.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e\n     * @see #linearCombination(double, T, double, T, double, T)\n     * @see #linearCombination(double, T, double, T, double, T, double, T)\n     * @since 3.2\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.linearCombination(T, T, T, T, T, T)",
      "begin_line": 401,
      "end_line": 401,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Note that the instance is only used as a prototype to get proper elements dimensions.\n     * Its value is not used, only the parameters values are used.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(T, T, T, T)\n     * @see #linearCombination(T, T, T, T, T, T, T, T)\n     * @since 3.2\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.linearCombination(double, T, double, T, double, T)",
      "begin_line": 431,
      "end_line": 431,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Note that the instance is only used as a prototype to get proper elements dimensions.\n     * Its value is not used, only the parameters values are used.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e\n     * @see #linearCombination(double, T, double, T)\n     * @see #linearCombination(double, T, double, T, double, T, double, T)\n     * @since 3.2\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.linearCombination(T, T, T, T, T, T, T, T)",
      "begin_line": 465,
      "end_line": 465,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Note that the instance is only used as a prototype to get proper elements dimensions.\n     * Its value is not used, only the parameters values are used.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(T, T, T, T)\n     * @see #linearCombination(T, T, T, T, T, T)\n     * @since 3.2\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.ExtendedFieldElement.linearCombination(double, T, double, T, double, T, double, T)",
      "begin_line": 499,
      "end_line": 499,
      "comment": "\n     * Compute a linear combination accurately.\n     * \u003cp\u003e\n     * This method computes a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * to high accuracy. It does so by using specific multiplication and\n     * addition algorithms to preserve accuracy and reduce cancellation effects.\n     * It is based on the 2005 paper \u003ca\n     * href\u003d\"http://citeseerx.ist.psu.edu/viewdoc/summary?doi\u003d10.1.1.2.1547\"\u003e\n     * Accurate Sum and Dot Product\u003c/a\u003e by Takeshi Ogita,\n     * Siegfried M. Rump, and Shin\u0027ichi Oishi published in SIAM J. Sci. Comput.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Note that the instance is only used as a prototype to get proper elements dimensions.\n     * Its value is not used, only the parameters values are used.\n     * \u003c/p\u003e\n     * @param a1 first factor of the first term\n     * @param b1 second factor of the first term\n     * @param a2 first factor of the second term\n     * @param b2 second factor of the second term\n     * @param a3 first factor of the third term\n     * @param b3 second factor of the third term\n     * @param a4 first factor of the third term\n     * @param b4 second factor of the third term\n     * @return a\u003csub\u003e1\u003c/sub\u003e\u0026times;b\u003csub\u003e1\u003c/sub\u003e +\n     * a\u003csub\u003e2\u003c/sub\u003e\u0026times;b\u003csub\u003e2\u003c/sub\u003e + a\u003csub\u003e3\u003c/sub\u003e\u0026times;b\u003csub\u003e3\u003c/sub\u003e +\n     * a\u003csub\u003e4\u003c/sub\u003e\u0026times;b\u003csub\u003e4\u003c/sub\u003e\n     * @see #linearCombination(double, T, double, T)\n     * @see #linearCombination(double, T, double, T, double, T)\n     * @since 3.2\n     ",
      "child_ranges": []
    }
  ]
}