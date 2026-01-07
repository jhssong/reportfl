{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/RealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVector",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 873,
      "comment": "\n * Interface defining a real-valued vector with basic algebraic operations.\n * \u003cp\u003e\n * vector element indexing is 0-based -- e.g., \u003ccode\u003egetEntry(0)\u003c/code\u003e\n * returns the first element of the vector.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The various \u003ccode\u003emapXxx\u003c/code\u003e and \u003ccode\u003emapXxxToSelf\u003c/code\u003e methods operate\n * on vectors element-wise, i.e. they perform the same operation (adding a scalar,\n * applying a function ...) on each element in turn. The \u003ccode\u003emapXxx\u003c/code\u003e\n * versions create a new vector to hold the result and do not change the instance.\n * The \u003ccode\u003emapXxxToSelf\u003c/code\u003e versions use the instance itself to store the\n * results, so the instance is changed by these methods. In both cases, the result\n * vector is returned by the methods, this allows to use the \u003ci\u003efluent API\u003c/i\u003e\n * style, like this:\n * \u003c/p\u003e\n * \u003cpre\u003e\n *   RealVector result \u003d v.mapAddToSelf(3.0).mapTanToSelf().mapSquareToSelf();\n * \u003c/pre\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Acts as if it is implemented as:\n     * Entry e \u003d null;\n     * for(Iterator\u003cEntry\u003e it \u003d iterator(); it.hasNext(); e \u003d it.next()) {\n     *   e.setValue(function.value(e.getValue()));\n     * }\n     * @param function to apply to each successive entry\n     * @return this vector\n     * @throws FunctionEvaluationException if function throws it on application to any entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Acts as if implemented as:\n     * return copy().map(function);\n     * @param function to apply to each successive entry\n     * @return a new vector\n     * @throws FunctionEvaluationException if function throws it on application to any entry\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 72,
      "end_line": 101,
      "comment": " Class representing a modifiable entry in the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Index of the entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.getValue()",
      "begin_line": 80,
      "end_line": 80,
      "comment": " Get the value of the entry.\n         * @return value of the entry\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.setValue(double)",
      "begin_line": 85,
      "end_line": 85,
      "comment": " Set the value of the entry.\n         * @param value new value for the entry\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.getIndex()",
      "begin_line": 90,
      "end_line": 92,
      "comment": " Get the index of the entry.\n         * @return index of the entry\n         ",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.setIndex(int)",
      "begin_line": 97,
      "end_line": 99,
      "comment": " Set the index of the entry.\n         * @param index new index for the entry\n         ",
      "child_ranges": [
        "(line 98,col 13)-(line 98,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.iterator()",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Generic dense iterator - starts with index \u003d\u003d zero, and hasNext() \u003d\u003d true until index \u003d\u003d getDimension();\n     * @return a dense iterator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.sparseIterator()",
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Specialized implementations may choose to not iterate over all dimensions, either because those values are\n     * unset, or are equal to defaultValue(), or are small enough to be ignored for the purposes of iteration.\n     * No guarantees are made about order of iteration.\n     * In dense implementations, this method will often delegate to {@link #iterator()}\n     * @return a sparse iterator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.copy()",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Returns a (deep) copy of this.\n     * @return vector copy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 130,
      "end_line": 131,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.add(double[])",
      "begin_line": 139,
      "end_line": 140,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 148,
      "end_line": 149,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.subtract(double[])",
      "begin_line": 157,
      "end_line": 158,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAdd(double)",
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * Map an addition operation to each entry.\n     * @param d value to be added to each entry\n     * @return this + d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAddToSelf(double)",
      "begin_line": 173,
      "end_line": 173,
      "comment": "\n     * Map an addition operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to be added to each entry\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSubtract(double)",
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n     * Map a subtraction operation to each entry.\n     * @param d value to be subtracted to each entry\n     * @return this - d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSubtractToSelf(double)",
      "begin_line": 188,
      "end_line": 188,
      "comment": "\n     * Map a subtraction operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to be subtracted to each entry\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapMultiply(double)",
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * Map a multiplication operation to each entry.\n     * @param d value to multiply all entries by\n     * @return this * d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapMultiplyToSelf(double)",
      "begin_line": 203,
      "end_line": 203,
      "comment": "\n     * Map a multiplication operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to multiply all entries by\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapDivide(double)",
      "begin_line": 210,
      "end_line": 210,
      "comment": "\n     * Map a division operation to each entry.\n     * @param d value to divide all entries by\n     * @return this / d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapDivideToSelf(double)",
      "begin_line": 218,
      "end_line": 218,
      "comment": "\n     * Map a division operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to divide all entries by\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapPow(double)",
      "begin_line": 225,
      "end_line": 225,
      "comment": "\n     * Map a power operation to each entry.\n     * @param d value to raise all entries to\n     * @return this ^ d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapPowToSelf(double)",
      "begin_line": 233,
      "end_line": 233,
      "comment": "\n     * Map a power operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to raise all entries to\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapExp()",
      "begin_line": 239,
      "end_line": 239,
      "comment": "\n     * Map the {@link Math#exp(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapExpToSelf()",
      "begin_line": 246,
      "end_line": 246,
      "comment": "\n     * Map the {@link Math#exp(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapExpm1()",
      "begin_line": 252,
      "end_line": 252,
      "comment": "\n     * Map the {@link Math#expm1(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapExpm1ToSelf()",
      "begin_line": 259,
      "end_line": 259,
      "comment": "\n     * Map the {@link Math#expm1(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapLog()",
      "begin_line": 265,
      "end_line": 265,
      "comment": "\n     * Map the {@link Math#log(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapLogToSelf()",
      "begin_line": 272,
      "end_line": 272,
      "comment": "\n     * Map the {@link Math#log(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapLog10()",
      "begin_line": 278,
      "end_line": 278,
      "comment": "\n     * Map the {@link Math#log10(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapLog10ToSelf()",
      "begin_line": 285,
      "end_line": 285,
      "comment": "\n     * Map the {@link Math#log10(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapLog1p()",
      "begin_line": 291,
      "end_line": 291,
      "comment": "\n     * Map the {@link Math#log1p(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapLog1pToSelf()",
      "begin_line": 298,
      "end_line": 298,
      "comment": "\n     * Map the {@link Math#log1p(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCosh()",
      "begin_line": 304,
      "end_line": 304,
      "comment": "\n     * Map the {@link Math#cosh(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCoshToSelf()",
      "begin_line": 311,
      "end_line": 311,
      "comment": "\n     * Map the {@link Math#cosh(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSinh()",
      "begin_line": 317,
      "end_line": 317,
      "comment": "\n     * Map the {@link Math#sinh(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSinhToSelf()",
      "begin_line": 324,
      "end_line": 324,
      "comment": "\n     * Map the {@link Math#sinh(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapTanh()",
      "begin_line": 330,
      "end_line": 330,
      "comment": "\n     * Map the {@link Math#tanh(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapTanhToSelf()",
      "begin_line": 337,
      "end_line": 337,
      "comment": "\n     * Map the {@link Math#tanh(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCos()",
      "begin_line": 343,
      "end_line": 343,
      "comment": "\n     * Map the {@link Math#cos(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCosToSelf()",
      "begin_line": 350,
      "end_line": 350,
      "comment": "\n     * Map the {@link Math#cos(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSin()",
      "begin_line": 356,
      "end_line": 356,
      "comment": "\n     * Map the {@link Math#sin(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSinToSelf()",
      "begin_line": 363,
      "end_line": 363,
      "comment": "\n     * Map the {@link Math#sin(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapTan()",
      "begin_line": 369,
      "end_line": 369,
      "comment": "\n     * Map the {@link Math#tan(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapTanToSelf()",
      "begin_line": 376,
      "end_line": 376,
      "comment": "\n     * Map the {@link Math#tan(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAcos()",
      "begin_line": 382,
      "end_line": 382,
      "comment": "\n     * Map the {@link Math#acos(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAcosToSelf()",
      "begin_line": 389,
      "end_line": 389,
      "comment": "\n     * Map the {@link Math#acos(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAsin()",
      "begin_line": 395,
      "end_line": 395,
      "comment": "\n     * Map the {@link Math#asin(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAsinToSelf()",
      "begin_line": 402,
      "end_line": 402,
      "comment": "\n     * Map the {@link Math#asin(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAtan()",
      "begin_line": 408,
      "end_line": 408,
      "comment": "\n     * Map the {@link Math#atan(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAtanToSelf()",
      "begin_line": 415,
      "end_line": 415,
      "comment": "\n     * Map the {@link Math#atan(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapInv()",
      "begin_line": 421,
      "end_line": 421,
      "comment": "\n     * Map the 1/x function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapInvToSelf()",
      "begin_line": 428,
      "end_line": 428,
      "comment": "\n     * Map the 1/x function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAbs()",
      "begin_line": 434,
      "end_line": 434,
      "comment": "\n     * Map the {@link Math#abs(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAbsToSelf()",
      "begin_line": 441,
      "end_line": 441,
      "comment": "\n     * Map the {@link Math#abs(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSqrt()",
      "begin_line": 447,
      "end_line": 447,
      "comment": "\n     * Map the {@link Math#sqrt(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSqrtToSelf()",
      "begin_line": 454,
      "end_line": 454,
      "comment": "\n     * Map the {@link Math#sqrt(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCbrt()",
      "begin_line": 460,
      "end_line": 460,
      "comment": "\n     * Map the {@link Math#cbrt(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCbrtToSelf()",
      "begin_line": 467,
      "end_line": 467,
      "comment": "\n     * Map the {@link Math#cbrt(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCeil()",
      "begin_line": 473,
      "end_line": 473,
      "comment": "\n     * Map the {@link Math#ceil(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapCeilToSelf()",
      "begin_line": 480,
      "end_line": 480,
      "comment": "\n     * Map the {@link Math#ceil(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapFloor()",
      "begin_line": 486,
      "end_line": 486,
      "comment": "\n     * Map the {@link Math#floor(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapFloorToSelf()",
      "begin_line": 493,
      "end_line": 493,
      "comment": "\n     * Map the {@link Math#floor(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapRint()",
      "begin_line": 499,
      "end_line": 499,
      "comment": "\n     * Map the {@link Math#rint(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapRintToSelf()",
      "begin_line": 506,
      "end_line": 506,
      "comment": "\n     * Map the {@link Math#rint(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSignum()",
      "begin_line": 512,
      "end_line": 512,
      "comment": "\n     * Map the {@link Math#signum(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSignumToSelf()",
      "begin_line": 519,
      "end_line": 519,
      "comment": "\n     * Map the {@link Math#signum(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapUlp()",
      "begin_line": 525,
      "end_line": 525,
      "comment": "\n     * Map the {@link Math#ulp(double)} function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapUlpToSelf()",
      "begin_line": 532,
      "end_line": 532,
      "comment": "\n     * Map the {@link Math#ulp(double)} function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 540,
      "end_line": 540,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeMultiply(double[])",
      "begin_line": 548,
      "end_line": 548,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 556,
      "end_line": 556,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeDivide(double[])",
      "begin_line": 564,
      "end_line": 564,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getData()",
      "begin_line": 570,
      "end_line": 570,
      "comment": "\n     * Returns vector entries as a double array.\n     * @return double array of entries\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 578,
      "end_line": 579,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.dotProduct(double[])",
      "begin_line": 587,
      "end_line": 588,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getNorm()",
      "begin_line": 599,
      "end_line": 599,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is the root of the sum of\n     * the squared elements.\u003c/p\u003e\n     * @return norm\n     * @see #getL1Norm()\n     * @see #getLInfNorm()\n     * @see #getDistance(RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getL1Norm()",
      "begin_line": 610,
      "end_line": 610,
      "comment": "\n     * Returns the L\u003csub\u003e1\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e1\u003c/sub\u003e norm is the sum of the absolute\n     * values of elements.\u003c/p\u003e\n     * @return norm\n     * @see #getNorm()\n     * @see #getLInfNorm()\n     * @see #getL1Distance(RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getLInfNorm()",
      "begin_line": 621,
      "end_line": 621,
      "comment": "\n     * Returns the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm is the max of the absolute\n     * values of elements.\u003c/p\u003e\n     * @return norm\n     * @see #getNorm()\n     * @see #getL1Norm()\n     * @see #getLInfDistance(RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 635,
      "end_line": 636,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * elements differences, or euclidian distance.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getDistance(double[])",
      "begin_line": 650,
      "end_line": 651,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * elements differences, or euclidian distance.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getL1Distance(double[])\n     * @see #getLInfDistance(double[])\n     * @see #getNorm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 665,
      "end_line": 666,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getL1Norm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getL1Distance(double[])",
      "begin_line": 680,
      "end_line": 681,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(double[])\n     * @see #getLInfDistance(double[])\n     * @see #getL1Norm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 695,
      "end_line": 696,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfNorm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getLInfDistance(double[])",
      "begin_line": 710,
      "end_line": 711,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @exception IllegalArgumentException if v is not the same size as this\n     * @see #getDistance(double[])\n     * @see #getL1Distance(double[])\n     * @see #getLInfNorm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.unitVector()",
      "begin_line": 718,
      "end_line": 718,
      "comment": " Creates a unit vector pointing in the direction of this vector.\n     * \u003cp\u003eThe instance is not changed by this method.\u003c/p\u003e\n     * @return a unit vector pointing in direction of this vector\n     * @exception ArithmeticException if the norm is null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.unitize()",
      "begin_line": 724,
      "end_line": 724,
      "comment": " Converts this vector into a unit vector.\n     * \u003cp\u003eThe instance itself is changed by this method.\u003c/p\u003e\n     * @exception ArithmeticException if the norm is null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 731,
      "end_line": 732,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.projection(double[])",
      "begin_line": 739,
      "end_line": 740,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 748,
      "end_line": 749,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.outerProduct(double[])",
      "begin_line": 757,
      "end_line": 758,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the square matrix outer product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getEntry(int)",
      "begin_line": 771,
      "end_line": 772,
      "comment": "\n     * Returns the entry in the specified index.\n     * \u003cp\u003e\n     * The index start at 0 and must be lesser than the size,\n     * otherwise a {@link MatrixIndexException} is thrown.\n     * \u003c/p\u003e\n     * @param index  index location of entry to be fetched\n     * @return vector entry at index\n     * @throws MatrixIndexException if the index is not valid\n     * @see #setEntry(int, double)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.setEntry(int, double)",
      "begin_line": 782,
      "end_line": 783,
      "comment": "\n     * Set a single element.\n     * @param index element index.\n     * @param value new value for the element.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     * @see #getEntry(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getDimension()",
      "begin_line": 789,
      "end_line": 789,
      "comment": "\n     * Returns the size of the vector.\n     * @return size\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 796,
      "end_line": 796,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.append(double)",
      "begin_line": 803,
      "end_line": 803,
      "comment": "\n     * Construct a vector by appending a double to this vector.\n     * @param d double to append.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.append(double[])",
      "begin_line": 810,
      "end_line": 810,
      "comment": "\n     * Construct a vector by appending a double array to this vector.\n     * @param a double array to append.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getSubVector(int, int)",
      "begin_line": 820,
      "end_line": 821,
      "comment": "\n     * Get a subvector from consecutive elements.\n     * @param index index of first element.\n     * @param n number of elements to be retrieved.\n     * @return a vector containing n elements.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 831,
      "end_line": 832,
      "comment": "\n     * Set a set of consecutive elements.\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     * @see #setSubVector(int, double[])\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.setSubVector(int, double[])",
      "begin_line": 842,
      "end_line": 843,
      "comment": "\n     * Set a set of consecutive elements.\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @exception MatrixIndexException if the index is\n     * inconsistent with vector size\n     * @see #setSubVector(int, RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.set(double)",
      "begin_line": 849,
      "end_line": 849,
      "comment": "\n     * Set all elements to a single value.\n     * @param value single value to set for all elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.toArray()",
      "begin_line": 857,
      "end_line": 857,
      "comment": "\n     * Convert the vector to a double array.\n     * \u003cp\u003eThe array is independent from vector data, it\u0027s elements\n     * are copied.\u003c/p\u003e\n     * @return array containing a copy of vector elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.isNaN()",
      "begin_line": 863,
      "end_line": 863,
      "comment": "\n     * Returns true if any coordinate of this vector is NaN; false otherwise\n     * @return  true if any coordinate of this vector is NaN; false otherwise\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.isInfinite()",
      "begin_line": 871,
      "end_line": 871,
      "comment": "\n     * Returns true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     * @return  true if any coordinate of this vector is infinite and none are NaN;\n     * false otherwise\n     ",
      "child_ranges": []
    }
  ]
}