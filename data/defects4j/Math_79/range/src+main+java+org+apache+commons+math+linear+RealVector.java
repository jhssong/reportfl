{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/RealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVector",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 42,
      "end_line": 799,
      "comment": "\n * Interface defining a real-valued vector with basic algebraic operations.\n * \u003cp\u003e\n * vector element indexing is 0-based -- e.g., \u003ccode\u003egetEntry(0)\u003c/code\u003e\n * returns the first element of the vector.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The various \u003ccode\u003emapXxx\u003c/code\u003e and \u003ccode\u003emapXxxToSelf\u003c/code\u003e methods operate\n * on vectors element-wise, i.e. they perform the same operation (adding a scalar,\n * applying a function ...) on each element in turn. The \u003ccode\u003emapXxx\u003c/code\u003e\n * versions create a new vector to hold the result and do not change the instance.\n * The \u003ccode\u003emapXxxToSelf\u003c/code\u003e versions use the instance itself to store the\n * results, so the instance is changed by these methods. In both cases, the result\n * vector is returned by the methods, this allows to use the \u003ci\u003efluent API\u003c/i\u003e\n * style, like this:\n * \u003c/p\u003e\n * \u003cpre\u003e\n *   RealVector result \u003d v.mapAddToSelf(3.0).mapTanToSelf().mapSquareToSelf();\n * \u003c/pre\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.copy()",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Returns a (deep) copy of this.\n     * @return vector copy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 56,
      "end_line": 57,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.add(double[])",
      "begin_line": 65,
      "end_line": 66,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 74,
      "end_line": 75,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.subtract(double[])",
      "begin_line": 83,
      "end_line": 84,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAdd(double)",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Map an addition operation to each entry.\n     * @param d value to be added to each entry\n     * @return this + d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAddToSelf(double)",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Map an addition operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to be added to each entry\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSubtract(double)",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Map a subtraction operation to each entry.\n     * @param d value to be subtracted to each entry\n     * @return this - d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSubtractToSelf(double)",
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Map a subtraction operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to be subtracted to each entry\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapMultiply(double)",
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Map a multiplication operation to each entry.\n     * @param d value to multiply all entries by\n     * @return this * d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapMultiplyToSelf(double)",
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Map a multiplication operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to multiply all entries by\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapDivide(double)",
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Map a division operation to each entry.\n     * @param d value to divide all entries by\n     * @return this / d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapDivideToSelf(double)",
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * Map a division operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to divide all entries by\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapPow(double)",
      "begin_line": 151,
      "end_line": 151,
      "comment": "\n     * Map a power operation to each entry.\n     * @param d value to raise all entries to\n     * @return this ^ d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapPowToSelf(double)",
      "begin_line": 159,
      "end_line": 159,
      "comment": "\n     * Map a power operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to raise all entries to\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapExp()",
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * Map the {@link Math#exp(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapExpToSelf()",
      "begin_line": 172,
      "end_line": 172,
      "comment": "\n     * Map the {@link Math#exp(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapExpm1()",
      "begin_line": 178,
      "end_line": 178,
      "comment": "\n     * Map the {@link Math#expm1(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapExpm1ToSelf()",
      "begin_line": 185,
      "end_line": 185,
      "comment": "\n     * Map the {@link Math#expm1(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapLog()",
      "begin_line": 191,
      "end_line": 191,
      "comment": "\n     * Map the {@link Math#log(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapLogToSelf()",
      "begin_line": 198,
      "end_line": 198,
      "comment": "\n     * Map the {@link Math#log(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapLog10()",
      "begin_line": 204,
      "end_line": 204,
      "comment": "\n     * Map the {@link Math#log10(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapLog10ToSelf()",
      "begin_line": 211,
      "end_line": 211,
      "comment": "\n     * Map the {@link Math#log10(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapLog1p()",
      "begin_line": 217,
      "end_line": 217,
      "comment": "\n     * Map the {@link Math#log1p(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapLog1pToSelf()",
      "begin_line": 224,
      "end_line": 224,
      "comment": "\n     * Map the {@link Math#log1p(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCosh()",
      "begin_line": 230,
      "end_line": 230,
      "comment": "\n     * Map the {@link Math#cosh(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCoshToSelf()",
      "begin_line": 237,
      "end_line": 237,
      "comment": "\n     * Map the {@link Math#cosh(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSinh()",
      "begin_line": 243,
      "end_line": 243,
      "comment": "\n     * Map the {@link Math#sinh(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSinhToSelf()",
      "begin_line": 250,
      "end_line": 250,
      "comment": "\n     * Map the {@link Math#sinh(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapTanh()",
      "begin_line": 256,
      "end_line": 256,
      "comment": "\n     * Map the {@link Math#tanh(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapTanhToSelf()",
      "begin_line": 263,
      "end_line": 263,
      "comment": "\n     * Map the {@link Math#tanh(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCos()",
      "begin_line": 269,
      "end_line": 269,
      "comment": "\n     * Map the {@link Math#cos(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCosToSelf()",
      "begin_line": 276,
      "end_line": 276,
      "comment": "\n     * Map the {@link Math#cos(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSin()",
      "begin_line": 282,
      "end_line": 282,
      "comment": "\n     * Map the {@link Math#sin(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSinToSelf()",
      "begin_line": 289,
      "end_line": 289,
      "comment": "\n     * Map the {@link Math#sin(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapTan()",
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n     * Map the {@link Math#tan(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapTanToSelf()",
      "begin_line": 302,
      "end_line": 302,
      "comment": "\n     * Map the {@link Math#tan(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAcos()",
      "begin_line": 308,
      "end_line": 308,
      "comment": "\n     * Map the {@link Math#acos(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAcosToSelf()",
      "begin_line": 315,
      "end_line": 315,
      "comment": "\n     * Map the {@link Math#acos(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAsin()",
      "begin_line": 321,
      "end_line": 321,
      "comment": "\n     * Map the {@link Math#asin(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAsinToSelf()",
      "begin_line": 328,
      "end_line": 328,
      "comment": "\n     * Map the {@link Math#asin(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAtan()",
      "begin_line": 334,
      "end_line": 334,
      "comment": "\n     * Map the {@link Math#atan(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAtanToSelf()",
      "begin_line": 341,
      "end_line": 341,
      "comment": "\n     * Map the {@link Math#atan(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapInv()",
      "begin_line": 347,
      "end_line": 347,
      "comment": "\n     * Map the 1/x function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapInvToSelf()",
      "begin_line": 354,
      "end_line": 354,
      "comment": "\n     * Map the 1/x function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAbs()",
      "begin_line": 360,
      "end_line": 360,
      "comment": "\n     * Map the {@link Math#abs(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAbsToSelf()",
      "begin_line": 367,
      "end_line": 367,
      "comment": "\n     * Map the {@link Math#abs(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSqrt()",
      "begin_line": 373,
      "end_line": 373,
      "comment": "\n     * Map the {@link Math#sqrt(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSqrtToSelf()",
      "begin_line": 380,
      "end_line": 380,
      "comment": "\n     * Map the {@link Math#sqrt(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCbrt()",
      "begin_line": 386,
      "end_line": 386,
      "comment": "\n     * Map the {@link Math#cbrt(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCbrtToSelf()",
      "begin_line": 393,
      "end_line": 393,
      "comment": "\n     * Map the {@link Math#cbrt(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCeil()",
      "begin_line": 399,
      "end_line": 399,
      "comment": "\n     * Map the {@link Math#ceil(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCeilToSelf()",
      "begin_line": 406,
      "end_line": 406,
      "comment": "\n     * Map the {@link Math#ceil(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapFloor()",
      "begin_line": 412,
      "end_line": 412,
      "comment": "\n     * Map the {@link Math#floor(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapFloorToSelf()",
      "begin_line": 419,
      "end_line": 419,
      "comment": "\n     * Map the {@link Math#floor(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapRint()",
      "begin_line": 425,
      "end_line": 425,
      "comment": "\n     * Map the {@link Math#rint(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapRintToSelf()",
      "begin_line": 432,
      "end_line": 432,
      "comment": "\n     * Map the {@link Math#rint(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSignum()",
      "begin_line": 438,
      "end_line": 438,
      "comment": "\n     * Map the {@link Math#signum(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSignumToSelf()",
      "begin_line": 445,
      "end_line": 445,
      "comment": "\n     * Map the {@link Math#signum(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapUlp()",
      "begin_line": 451,
      "end_line": 451,
      "comment": "\n     * Map the {@link Math#ulp(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapUlpToSelf()",
      "begin_line": 458,
      "end_line": 458,
      "comment": "\n     * Map the {@link Math#ulp(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 466,
      "end_line": 466,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeMultiply(double[])",
      "begin_line": 474,
      "end_line": 474,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 482,
      "end_line": 482,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeDivide(double[])",
      "begin_line": 490,
      "end_line": 490,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getData()",
      "begin_line": 496,
      "end_line": 496,
      "comment": "\n     * Returns vector entries as a double array.\n     * @return double array of entries\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 504,
      "end_line": 505,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.dotProduct(double[])",
      "begin_line": 513,
      "end_line": 514,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getNorm()",
      "begin_line": 525,
      "end_line": 525,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is the root of the sum of\n     * the squared elements.\u003c/p\u003e\n     * @return norm\n     * @see #getL1Norm()\n     * @see #getLInfNorm()\n     * @see #getDistance(RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getL1Norm()",
      "begin_line": 536,
      "end_line": 536,
      "comment": "\n     * Returns the L\u003csub\u003e1\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e1\u003c/sub\u003e norm is the sum of the absolute\n     * values of elements.\u003c/p\u003e\n     * @return norm\n     * @see #getNorm()\n     * @see #getLInfNorm()\n     * @see #getL1Distance(RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getLInfNorm()",
      "begin_line": 547,
      "end_line": 547,
      "comment": "\n     * Returns the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm is the max of the absolute\n     * values of elements.\u003c/p\u003e\n     * @return norm\n     * @see #getNorm()\n     * @see #getL1Norm()\n     * @see #getLInfDistance(RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 561,
      "end_line": 562,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * elements differences, or euclidian distance.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getDistance(double[])",
      "begin_line": 576,
      "end_line": 577,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * elements differences, or euclidian distance.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getL1Distance(double[])\n     * @see #getLInfDistance(double[])\n     * @see #getNorm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 591,
      "end_line": 592,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getL1Norm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getL1Distance(double[])",
      "begin_line": 606,
      "end_line": 607,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(double[])\n     * @see #getLInfDistance(double[])\n     * @see #getL1Norm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 621,
      "end_line": 622,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfNorm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getLInfDistance(double[])",
      "begin_line": 636,
      "end_line": 637,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(double[])\n     * @see #getL1Distance(double[])\n     * @see #getLInfNorm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.unitVector()",
      "begin_line": 644,
      "end_line": 644,
      "comment": " Creates a unit vector pointing in the direction of this vector.\n     * \u003cp\u003eThe instance is not changed by this method.\u003c/p\u003e\n     * @return a unit vector pointing in direction of this vector\n     * @exception ArithmeticException if the norm is null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.unitize()",
      "begin_line": 650,
      "end_line": 650,
      "comment": " Converts this vector into a unit vector.\n     * \u003cp\u003eThe instance itself is changed by this method.\u003c/p\u003e\n     * @exception ArithmeticException if the norm is null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 657,
      "end_line": 658,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.projection(double[])",
      "begin_line": 665,
      "end_line": 666,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 674,
      "end_line": 675,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.outerProduct(double[])",
      "begin_line": 683,
      "end_line": 684,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getEntry(int)",
      "begin_line": 697,
      "end_line": 698,
      "comment": "\n     * Returns the entry in the specified index.\n     * \u003cp\u003e\n     * The index start at 0 and must be lesser than the size,\n     * otherwise a {@link MatrixIndexException} is thrown.\n     * \u003c/p\u003e\n     * @param index  index location of entry to be fetched\n     * @return vector entry at index\n     * @throws MatrixIndexException if the index is not valid\n     * @see #setEntry(int, double)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.setEntry(int, double)",
      "begin_line": 708,
      "end_line": 709,
      "comment": "\n     * Set a single element.\n     * @param index element index.\n     * @param value new value for the element.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     * @see #getEntry(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getDimension()",
      "begin_line": 715,
      "end_line": 715,
      "comment": "\n     * Returns the size of the vector.\n     * @return size\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 722,
      "end_line": 722,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.append(double)",
      "begin_line": 729,
      "end_line": 729,
      "comment": "\n     * Construct a vector by appending a double to this vector.\n     * @param d double to append.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.append(double[])",
      "begin_line": 736,
      "end_line": 736,
      "comment": "\n     * Construct a vector by appending a double array to this vector.\n     * @param a double array to append.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getSubVector(int, int)",
      "begin_line": 746,
      "end_line": 747,
      "comment": "\n     * Get a subvector from consecutive elements.\n     * @param index index of first element.\n     * @param n number of elements to be retrieved.\n     * @return a vector containing n elements.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 757,
      "end_line": 758,
      "comment": "\n     * Set a set of consecutive elements.\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     * @see #setSubVector(int, double[])\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.setSubVector(int, double[])",
      "begin_line": 768,
      "end_line": 769,
      "comment": "\n     * Set a set of consecutive elements.\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     * @see #setSubVector(int, RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.set(double)",
      "begin_line": 775,
      "end_line": 775,
      "comment": "\n     * Set all elements to a single value.\n     * @param value single value to set for all elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.toArray()",
      "begin_line": 783,
      "end_line": 783,
      "comment": "\n     * Convert the vector to a double array.\n     * \u003cp\u003eThe array is independent from vector data, it\u0027s elements\n     * are copied.\u003c/p\u003e\n     * @return array containing a copy of vector elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.isNaN()",
      "begin_line": 789,
      "end_line": 789,
      "comment": "\n     * Returns true if any coordinate of this vector is NaN; false otherwise\n     * @return  true if any coordinate of this vector is NaN; false otherwise\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.isInfinite()",
      "begin_line": 797,
      "end_line": 797,
      "comment": "\n     * Returns true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     * @return  true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     ",
      "child_ranges": []
    }
  ]
}