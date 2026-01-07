{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/complex/ComplexUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ComplexUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 563,
      "comment": "\n * Static implementations of common \n * {@link org.apache.commons.math.complex.Complex}-valued functions.  Included\n * are trigonometric, exponential, log, power and square root functions.\n *\u003cp\u003e\n * Reference:\n * \u003cul\u003e\n * \u003cli\u003e\u003ca href\u003d\"http://myweb.lmu.edu/dmsmith/ZMLIB.pdf\"\u003e\n * Multiple Precision Complex Arithmetic and Functions\u003c/a\u003e\u003c/li\u003e\n * \u003c/ul\u003e\n * See individual method javadocs for the computational formulas used.\n * In general, NaN values in either real or imaginary parts of input arguments\n * result in {@link Complex#NaN} returned.  Otherwise, infinite or NaN values\n * are returned as they arise in computing the real functions specified in the\n * computational formulas.  Null arguments result in NullPointerExceptions.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.complex.ComplexUtils.ComplexUtils()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.acos(org.apache.commons.math.complex.Complex)",
      "begin_line": 64,
      "end_line": 71,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseCosine.html\" TARGET\u003d\"_top\"\u003e\n     * inverse cosine\u003c/a\u003e for the given complex argument.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e acos(z) \u003d -i (log(z + i (sqrt(1 - z\u003csup\u003e2\u003c/sup\u003e))))\u003c/code\u003e\u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite.\n     * \n     * @param z the value whose inverse cosine is to be returned\n     * @return the inverse cosine of \u003ccode\u003ez\u003c/code\u003e\n     * @throws NullPointerException if \u003ccode\u003ez\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 69,col 9)-(line 70,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.asin(org.apache.commons.math.complex.Complex)",
      "begin_line": 88,
      "end_line": 95,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseSine.html\" TARGET\u003d\"_top\"\u003e\n     * inverse sine\u003c/a\u003e for the given complex argument.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e asin(z) \u003d -i (log(sqrt(1 - z\u003csup\u003e2\u003c/sup\u003e) + iz)) \u003c/code\u003e\u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite.\n     * \n     * @param z the value whose inverse sine is to be returned.\n     * @return the inverse sine of \u003ccode\u003ez\u003c/code\u003e.\n     * @throws NullPointerException if \u003ccode\u003ez\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 94,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.atan(org.apache.commons.math.complex.Complex)",
      "begin_line": 112,
      "end_line": 120,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/InverseTangent.html\" TARGET\u003d\"_top\"\u003e\n     * inverse tangent\u003c/a\u003e for the given complex argument.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e atan(z) \u003d (i/2) log((i + z)/(i - z)) \u003c/code\u003e\u003c/pre\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite. \n     * \n     * @param z the value whose inverse tangent is to be returned\n     * @return the inverse tangent of \u003ccode\u003ez\u003c/code\u003e\n     * @throws NullPointerException if \u003ccode\u003ez\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 119,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.cos(org.apache.commons.math.complex.Complex)",
      "begin_line": 149,
      "end_line": 159,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Cosine.html\" TARGET\u003d\"_top\"\u003e\n     * cosine\u003c/a\u003e\n     * for the given complex argument.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e cos(a + bi) \u003d cos(a)cosh(b) - sin(a)sinh(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * cos(1 \u0026plusmn; INFINITY i) \u003d 1 \u0026#x2213; INFINITY i\n     * cos(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     * cos(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\n     * \n     * @param z the value whose cosine is to be returned\n     * @return the cosine of \u003ccode\u003ez\u003c/code\u003e\n     * @throws NullPointerException if \u003ccode\u003ez\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 154,col 31)",
        "(line 155,col 9)-(line 155,col 36)",
        "(line 157,col 9)-(line 158,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.cosh(org.apache.commons.math.complex.Complex)",
      "begin_line": 188,
      "end_line": 198,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicCosine.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic cosine\u003c/a\u003e for the given complex argument.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e cosh(a + bi) \u003d cosh(a)cos(b) + sinh(a)sin(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * cosh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * cosh(\u0026plusmn;INFINITY + i) \u003d INFINITY \u0026plusmn; INFINITY i\n     * cosh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eNullPointerException\u003c/code\u003e if z is null.\n     * \n     * @param z the value whose hyperbolic cosine is to be returned.\n     * @return the hyperbolic cosine of \u003ccode\u003ez\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 193,col 31)",
        "(line 194,col 9)-(line 194,col 36)",
        "(line 196,col 9)-(line 197,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.exp(org.apache.commons.math.complex.Complex)",
      "begin_line": 228,
      "end_line": 236,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/ExponentialFunction.html\" TARGET\u003d\"_top\"\u003e\n     * exponential function\u003c/a\u003e for the given complex argument.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e exp(a + bi) \u003d exp(a)cos(b) + exp(a)sin(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#exp}, {@link java.lang.Math#cos}, and\n     * {@link java.lang.Math#sin}.\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * exp(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * exp(INFINITY + i) \u003d INFINITY + INFINITY i\n     * exp(-INFINITY + i) \u003d 0 + 0i\n     * exp(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\n     * \u003cp\u003e\n     * Throws \u003ccode\u003eNullPointerException\u003c/code\u003e if z is null.\n     * \n     * @param z the value\n     * @return \u003ci\u003ee\u003c/i\u003e\u003csup\u003e\u003ccode\u003ez\u003c/code\u003e\u003c/sup\u003e\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 233,col 36)",
        "(line 234,col 9)-(line 234,col 44)",
        "(line 235,col 9)-(line 235,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.log(org.apache.commons.math.complex.Complex)",
      "begin_line": 268,
      "end_line": 275,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/NaturalLogarithm.html\" TARGET\u003d\"_top\"\u003e\n     * natural logarithm\u003c/a\u003e for the given complex argument.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e log(a + bi) \u003d ln(|a + bi|) + arg(a + bi)i\u003c/code\u003e\u003c/pre\u003e\n     * where ln on the right hand side is {@link java.lang.Math#log},\n     * \u003ccode\u003e|a + bi|\u003c/code\u003e is the modulus, {@link Complex#abs},  and\n     * \u003ccode\u003earg(a + bi) \u003d {@link java.lang.Math#atan2}(b, a)\u003c/code\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \u003cp\u003e\n     * Infinite (or critical) values in real or imaginary parts of the input may\n     * result in infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * log(1 \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (\u0026pi;/2)i\n     * log(INFINITY + i) \u003d INFINITY + 0i\n     * log(-INFINITY + i) \u003d INFINITY + \u0026pi;i\n     * log(INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (\u0026pi;/4)i\n     * log(-INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY \u0026plusmn; (3\u0026pi;/4)i\n     * log(0 + 0i) \u003d -INFINITY + 0i\n     * \u003c/code\u003e\u003c/pre\u003e\n     * Throws \u003ccode\u003eNullPointerException\u003c/code\u003e if z is null.\n     * \n     * @param z the value.\n     * @return ln \u003ccode\u003ez\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 274,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.polar2Complex(double, double)",
      "begin_line": 302,
      "end_line": 308,
      "comment": "\n     * Creates a complex number from the given polar representation.\n     * \u003cp\u003e\n     * The value returned is \u003ccode\u003er\u0026middot;e\u003csup\u003ei\u0026middot;theta\u003c/sup\u003e\u003c/code\u003e,\n     * computed as \u003ccode\u003er\u0026middot;cos(theta) + r\u0026middot;sin(theta)i\u003c/code\u003e\n     * \u003cp\u003e\n     * If either \u003ccode\u003er\u003c/code\u003e or \u003ccode\u003etheta\u003c/code\u003e is NaN, or \n     * \u003ccode\u003etheta\u003c/code\u003e is infinite, {@link Complex#NaN} is returned.\n     * \u003cp\u003e\n     * If \u003ccode\u003er\u003c/code\u003e is infinite and \u003ccode\u003etheta\u003c/code\u003e is finite, \n     * infinite or NaN values may be returned in parts of the result, following\n     * the rules for double arithmetic.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * polar2Complex(INFINITY, \u0026pi;/4) \u003d INFINITY + INFINITY i\n     * polar2Complex(INFINITY, 0) \u003d INFINITY + NaN i\n     * polar2Complex(INFINITY, -\u0026pi;/4) \u003d INFINITY - INFINITY i\n     * polar2Complex(INFINITY, 5\u0026pi;/4) \u003d -INFINITY - INFINITY i \u003c/code\u003e\u003c/pre\u003e\n     * \n     * @param r the modulus of the complex number to create\n     * @param theta  the argument of the complex number to create\n     * @return \u003ccode\u003er\u0026middot;e\u003csup\u003ei\u0026middot;theta\u003c/sup\u003e\u003c/code\u003e\n     * @throws IllegalArgumentException  if r is negative\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.pow(org.apache.commons.math.complex.Complex, org.apache.commons.math.complex.Complex)",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * Returns of value of \u003ccode\u003ey\u003c/code\u003e raised to the power of \u003ccode\u003ex\u003c/code\u003e.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e y\u003csup\u003ex\u003c/sup\u003e \u003d exp(x\u0026middot;log(y))\u003c/code\u003e\u003c/pre\u003e \n     * where \u003ccode\u003eexp\u003c/code\u003e and \u003ccode\u003elog\u003c/code\u003e are {@link #exp} and\n     * {@link #log}, respectively.\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e or infinite, or if \u003ccode\u003ey\u003c/code\u003e\n     * equals {@link Complex#ZERO}.\n     * \n     * @param y the base.\n     * @param x the exponent.\n     * @return \u003ccode\u003ey\u003c/code\u003e\u003csup\u003e\u003ccode\u003ex\u003c/code\u003e\u003c/sup\u003e\n     * @throws NullPointerException if either x or y is null\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.sin(org.apache.commons.math.complex.Complex)",
      "begin_line": 359,
      "end_line": 369,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Sine.html\" TARGET\u003d\"_top\"\u003e\n     * sine\u003c/a\u003e\n     * for the given complex argument.\n     * \u003cp\u003e\n      * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e sin(a + bi) \u003d sin(a)cosh(b) - cos(a)sinh(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * sin(1 \u0026plusmn; INFINITY i) \u003d 1 \u0026plusmn; INFINITY i\n     * sin(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     * sin(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\u003e\n     * \n     * Throws \u003ccode\u003eNullPointerException\u003c/code\u003e if z is null. \n     * \n     * @param z the value whose sine is to be returned.\n     * @return the sine of \u003ccode\u003ez\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 364,col 31)",
        "(line 365,col 9)-(line 365,col 36)",
        "(line 367,col 9)-(line 368,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.sinh(org.apache.commons.math.complex.Complex)",
      "begin_line": 397,
      "end_line": 407,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicSine.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic sine\u003c/a\u003e for the given complex argument.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003e sinh(a + bi) \u003d sinh(a)cos(b)) + cosh(a)sin(b)i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * sinh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * sinh(\u0026plusmn;INFINITY + i) \u003d \u0026plusmn; INFINITY + INFINITY i\n     * sinh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\u003c/code\u003e\u003c/pre\n     * \n     * @param z the value whose hyperbolic sine is to be returned\n     * @return the hyperbolic sine of \u003ccode\u003ez\u003c/code\u003e\n     * @throws NullPointerException if \u003ccode\u003ez\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 400,col 9)",
        "(line 402,col 9)-(line 402,col 31)",
        "(line 403,col 9)-(line 403,col 36)",
        "(line 405,col 9)-(line 406,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.sqrt(org.apache.commons.math.complex.Complex)",
      "begin_line": 443,
      "end_line": 461,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/SquareRoot.html\" TARGET\u003d\"_top\"\u003e\n     * square root\u003c/a\u003e for the given complex argument.\n     * \u003cp\u003e\n     * Implements the following algorithm to compute \u003ccode\u003esqrt(a + bi)\u003c/code\u003e: \n     * \u003col\u003e\u003cli\u003eLet \u003ccode\u003et \u003d sqrt((|a| + |a + bi|) / 2)\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003cpre\u003eif \u003ccode\u003e a \u0026#8805; 0\u003c/code\u003e return \u003ccode\u003et + (b/2t)i\u003c/code\u003e\n     *  else return \u003ccode\u003e|b|/2t + sign(b)t i \u003c/code\u003e\u003c/pre\u003e\u003c/li\u003e\n     * \u003c/ol\u003e\n     * where \u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e|a| \u003d {@link Math#abs}(a)\u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e|a + bi| \u003d {@link Complex#abs}(a + bi) \u003c/code\u003e\u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003esign(b) \u003d  {@link MathUtils#indicator}(b) \u003c/code\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * sqrt(1 \u0026plusmn; INFINITY i) \u003d INFINITY + NaN i\n     * sqrt(INFINITY + i) \u003d INFINITY + 0i\n     * sqrt(-INFINITY + i) \u003d 0 + INFINITY i\n     * sqrt(INFINITY \u0026plusmn; INFINITY i) \u003d INFINITY + NaN i\n     * sqrt(-INFINITY \u0026plusmn; INFINITY i) \u003d NaN \u0026plusmn; INFINITY i\n     * \u003c/code\u003e\u003c/pre\u003e\n     * \n     * @param z the value whose square root is to be returned\n     * @return the square root of \u003ccode\u003ez\u003c/code\u003e\n     * @throws NullPointerException if \u003ccode\u003ez\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 446,col 9)",
        "(line 448,col 9)-(line 448,col 31)",
        "(line 449,col 9)-(line 449,col 36)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 454,col 60)",
        "(line 455,col 9)-(line 460,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.sqrt1z(org.apache.commons.math.complex.Complex)",
      "begin_line": 482,
      "end_line": 484,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/SquareRoot.html\" TARGET\u003d\"_top\"\u003e\n     * square root\u003c/a\u003e of 1 - \u003ccode\u003ez\u003c/code\u003e\u003csup\u003e2\u003c/sup\u003e for the given complex\n     * argument.\n     * \u003cp\u003e\n     * Computes the result directly as \n     * \u003ccode\u003esqrt(Complex.ONE.subtract(z.multiply(z)))\u003c/code\u003e.\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result. \n     * \n     * @param z the value\n     * @return the square root of 1 - \u003ccode\u003ez\u003c/code\u003e\u003csup\u003e2\u003c/sup\u003e\n     * @throws NullPointerException if \u003ccode\u003ez\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.tan(org.apache.commons.math.complex.Complex)",
      "begin_line": 513,
      "end_line": 523,
      "comment": "\n     * Compute the \n     * \u003ca href\u003d\"http://mathworld.wolfram.com/Tangent.html\" TARGET\u003d\"_top\"\u003e\n     * tangent\u003c/a\u003e for the given complex argument.\n     * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003etan(a + bi) \u003d sin(2a)/(cos(2a)+cosh(2b)) + [sinh(2b)/(cos(2a)+cosh(2b))]i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \u003cp\u003e\n     * Infinite (or critical) values in real or imaginary parts of the input may\n     * result in infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * tan(1 \u0026plusmn; INFINITY i) \u003d 0 + NaN i\n     * tan(\u0026plusmn;INFINITY + i) \u003d NaN + NaN i\n     * tan(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * tan(\u0026plusmn;\u0026pi;/2 + 0 i) \u003d \u0026plusmn;INFINITY + NaN i\u003c/code\u003e\u003c/pre\u003e\n     * \n     * @param z the value whose tangent is to be returned\n     * @return the tangent of \u003ccode\u003ez\u003c/code\u003e\n     * @throws NullPointerException if \u003ccode\u003ez\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 516,col 9)",
        "(line 518,col 9)-(line 518,col 38)",
        "(line 519,col 9)-(line 519,col 43)",
        "(line 520,col 9)-(line 520,col 53)",
        "(line 522,col 9)-(line 522,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.complex.ComplexUtils.tanh(org.apache.commons.math.complex.Complex)",
      "begin_line": 552,
      "end_line": 562,
      "comment": "\n     * Compute the\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/HyperbolicTangent.html\" TARGET\u003d\"_top\"\u003e\n     * hyperbolic tangent\u003c/a\u003e for the given complex argument.\n    * \u003cp\u003e\n     * Implements the formula: \u003cpre\u003e\n     * \u003ccode\u003etan(a + bi) \u003d sinh(2a)/(cosh(2a)+cos(2b)) + [sin(2b)/(cosh(2a)+cos(2b))]i\u003c/code\u003e\u003c/pre\u003e\n     * where the (real) functions on the right-hand side are\n     * {@link java.lang.Math#sin}, {@link java.lang.Math#cos}, \n     * {@link MathUtils#cosh} and {@link MathUtils#sinh}.\n     * \u003cp\u003e\n     * Returns {@link Complex#NaN} if either real or imaginary part of the \n     * input argument is \u003ccode\u003eNaN\u003c/code\u003e.\n     * \u003cp\u003e\n     * Infinite values in real or imaginary parts of the input may result in\n     * infinite or NaN values returned in parts of the result.\u003cpre\u003e\n     * Examples: \n     * \u003ccode\u003e\n     * tanh(1 \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * tanh(\u0026plusmn;INFINITY + i) \u003d NaN + 0 i\n     * tanh(\u0026plusmn;INFINITY \u0026plusmn; INFINITY i) \u003d NaN + NaN i\n     * tanh(0 + (\u0026pi;/2)i) \u003d NaN + INFINITY i\u003c/code\u003e\u003c/pre\u003e\n     *\n     * @param z the value whose hyperbolic tangent is to be returned\n     * @return the hyperbolic tangent of \u003ccode\u003ez\u003c/code\u003e\n     * @throws NullPointerException if \u003ccode\u003ez\u003c/code\u003e is null\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 555,col 9)",
        "(line 557,col 9)-(line 557,col 38)",
        "(line 558,col 9)-(line 558,col 43)",
        "(line 559,col 9)-(line 559,col 53)",
        "(line 561,col 9)-(line 561,col 69)"
      ]
    }
  ]
}