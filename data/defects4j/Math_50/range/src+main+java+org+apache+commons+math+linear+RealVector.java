{
  "filepath": "/tmp/Math-50b/src/main/java/org/apache/commons/math/linear/RealVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVector",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 47,
      "end_line": 654,
      "comment": "\n * Interface defining a real-valued vector with basic algebraic operations.\n * \u003cp\u003e\n * vector element indexing is 0-based -- e.g., {@code getEntry(0)}\n * returns the first element of the vector.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@code code map} and {@code mapToSelf} methods operate\n * on vectors element-wise, i.e. they perform the same operation (adding a scalar,\n * applying a function ...) on each element in turn. The {@code map}\n * version creates a new vector to hold the result and do not change the instance.\n * The {@code mapToSelf} version use the instance itself to store the\n * results, so the instance is changed by this method. In both cases, the result\n * vector is returned by the methods, this allows to use the \u003ci\u003efluent API\u003c/i\u003e\n * style, like this:\n * \u003c/p\u003e\n * \u003cpre\u003e\n *   RealVector result \u003d v.mapAddToSelf(3.4).mapToSelf(new Tan()).mapToSelf(new Power(2.3));\n * \u003c/pre\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Acts as if it is implemented as:\n     * \u003cpre\u003e\n     *  Entry e \u003d null;\n     *  for(Iterator\u003cEntry\u003e it \u003d iterator(); it.hasNext(); e \u003d it.next()) {\n     *      e.setValue(function.value(e.getValue()));\n     *  }\n     * \u003c/pre\u003e\n     *\n     * @param function Function to apply to each entry.\n     * @return this vector.\n     * @throws org.apache.commons.math.exception.MathUserException\n     * if the function throws it.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.map(org.apache.commons.math.analysis.UnivariateRealFunction)",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Acts as if implemented as:\n     * \u003cpre\u003e\n     *  return copy().map(function);\n     * \u003c/pre\u003e\n     *\n     * @param function Function to apply to each entry.\n     * @return a new vector.\n     * @throws org.apache.commons.math.exception.MathUserException\n     * if the function throws it.\n     ",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 78,
      "end_line": 110,
      "comment": " Class representing a modifiable entry in the vector. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Index of the entry. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.getValue()",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n         * Get the value of the entry.\n         *\n         * @return the value of the entry.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.setValue(double)",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n         * Set the value of the entry.\n         *\n         * @param value New value for the entry.\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.getIndex()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n         * Get the index of the entry.\n         *\n         * @return the index of the entry.\n         ",
      "child_ranges": [
        "(line 100,col 13)-(line 100,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.Entry.setIndex(int)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n         * Set the index of the entry.\n         *\n         * @param index New index for the entry.\n         ",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.iterator()",
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * Generic dense iterator.\n     * It iterates in increasing order of the vector index.\n     *\n     * @return a dense iterator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.sparseIterator()",
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * Specialized implementations may choose to not iterate over all\n     * dimensions, either because those values are unset, or are equal\n     * to defaultValue(), or are small enough to be ignored for the\n     * purposes of iteration.\n     * No guarantees are made about order of iteration.\n     * In dense implementations, this method will often delegate to\n     * {@link #iterator()}.\n     *\n     * @return a sparse iterator\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.copy()",
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * Returns a (deep) copy of this vector.\n     *\n     * @return a vector copy.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.add(org.apache.commons.math.linear.RealVector)",
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n     * Compute the sum of this vector and {@code v}.\n     *\n     * @param v Vector to be added.\n     * @return {@code this} + {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.add(double[])",
      "begin_line": 158,
      "end_line": 158,
      "comment": "\n     * Compute the sum of this vector and {@code v}.\n     *\n     * @param v Vector to be added.\n     * @return {@code this} + {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.subtract(org.apache.commons.math.linear.RealVector)",
      "begin_line": 169,
      "end_line": 169,
      "comment": "\n     * Subtract {@code v} from this vector.\n     *\n     * @param v Vector to be subtracted.\n     * @return {@code this} - {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.subtract(double[])",
      "begin_line": 179,
      "end_line": 179,
      "comment": "\n     * Subtract {@code v} from this vector.\n     *\n     * @param v Vector to be subtracted.\n     * @return {@code this} - {@code v}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAdd(double)",
      "begin_line": 187,
      "end_line": 187,
      "comment": "\n     * Add a value to each entry.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this} + {@code d}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapAddToSelf(double)",
      "begin_line": 196,
      "end_line": 196,
      "comment": "\n     * Add a value to each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be added to each entry.\n     * @return {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSubtract(double)",
      "begin_line": 204,
      "end_line": 204,
      "comment": "\n     * Subtract a value from each entry.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this} - {@code d}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapSubtractToSelf(double)",
      "begin_line": 213,
      "end_line": 213,
      "comment": "\n     * Subtract a value from each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to be subtracted.\n     * @return {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapMultiply(double)",
      "begin_line": 221,
      "end_line": 221,
      "comment": "\n     * Multiply each entry.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this} * {@code d}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapMultiplyToSelf(double)",
      "begin_line": 230,
      "end_line": 230,
      "comment": "\n     * Multiply each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Multiplication factor.\n     * @return {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapDivide(double)",
      "begin_line": 238,
      "end_line": 238,
      "comment": "\n     * Divide each entry.\n     *\n     * @param d Value to divide by.\n     * @return {@code this} / {@code d}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.mapDivideToSelf(double)",
      "begin_line": 247,
      "end_line": 247,
      "comment": "\n     * Divide each entry.\n     * The instance is changed in-place.\n     *\n     * @param d Value to divide by.\n     * @return {@code this}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeMultiply(org.apache.commons.math.linear.RealVector)",
      "begin_line": 256,
      "end_line": 256,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeMultiply(double[])",
      "begin_line": 265,
      "end_line": 265,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeDivide(org.apache.commons.math.linear.RealVector)",
      "begin_line": 274,
      "end_line": 274,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.ebeDivide(double[])",
      "begin_line": 283,
      "end_line": 283,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getData()",
      "begin_line": 289,
      "end_line": 289,
      "comment": "\n     * Returns vector entries as a double array.\n     * @return double array of entries\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.dotProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 298,
      "end_line": 298,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.dotProduct(double[])",
      "begin_line": 307,
      "end_line": 307,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.cosine(org.apache.commons.math.linear.RealVector)",
      "begin_line": 316,
      "end_line": 316,
      "comment": "\n     * Computes the cosine of the angle between this vector and the\n     * argument.\n     *\n     * @param v Vector.\n     * @return the cosine of the angle between this vector and {@code v}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.cosine(double[])",
      "begin_line": 325,
      "end_line": 325,
      "comment": "\n     * Computes the cosine of the angle between this vector and the\n     * vector whose components are given as argument.\n     *\n     * @param v Components of a vector.\n     * @return the cosine of the angle between this vector and {@code v}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getNorm()",
      "begin_line": 336,
      "end_line": 336,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is the root of the sum of\n     * the squared elements.\u003c/p\u003e\n     * @return norm\n     * @see #getL1Norm()\n     * @see #getLInfNorm()\n     * @see #getDistance(RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getL1Norm()",
      "begin_line": 347,
      "end_line": 347,
      "comment": "\n     * Returns the L\u003csub\u003e1\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e1\u003c/sub\u003e norm is the sum of the absolute\n     * values of elements.\u003c/p\u003e\n     * @return norm\n     * @see #getNorm()\n     * @see #getLInfNorm()\n     * @see #getL1Distance(RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getLInfNorm()",
      "begin_line": 358,
      "end_line": 358,
      "comment": "\n     * Returns the L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm of the vector.\n     * \u003cp\u003eThe L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm is the max of the absolute\n     * values of elements.\u003c/p\u003e\n     * @return norm\n     * @see #getNorm()\n     * @see #getL1Norm()\n     * @see #getLInfDistance(RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 373,
      "end_line": 373,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * elements differences, or euclidian distance.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getNorm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getDistance(double[])",
      "begin_line": 388,
      "end_line": 388,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with the\n     * L\u003csub\u003e2\u003c/sub\u003e norm, i.e. the square root of the sum of\n     * elements differences, or euclidian distance.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getL1Distance(double[])\n     * @see #getLInfDistance(double[])\n     * @see #getNorm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getL1Distance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 403,
      "end_line": 403,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getDistance(RealVector)\n     * @see #getLInfDistance(RealVector)\n     * @see #getL1Norm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getL1Distance(double[])",
      "begin_line": 418,
      "end_line": 418,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e1\u003c/sub\u003e norm, i.e. the sum of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getDistance(double[])\n     * @see #getLInfDistance(double[])\n     * @see #getL1Norm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getLInfDistance(org.apache.commons.math.linear.RealVector)",
      "begin_line": 433,
      "end_line": 433,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getDistance(RealVector)\n     * @see #getL1Distance(RealVector)\n     * @see #getLInfNorm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getLInfDistance(double[])",
      "begin_line": 448,
      "end_line": 448,
      "comment": "\n     * Distance between two vectors.\n     * \u003cp\u003eThis method computes the distance consistent with\n     * L\u003csub\u003e\u0026infin;\u003c/sub\u003e norm, i.e. the max of the absolute values of\n     * elements differences.\u003c/p\u003e\n     * @param v vector to which distance is requested\n     * @return distance between two vectors.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     * @see #getDistance(double[])\n     * @see #getL1Distance(double[])\n     * @see #getLInfNorm()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.unitVector()",
      "begin_line": 455,
      "end_line": 455,
      "comment": " Creates a unit vector pointing in the direction of this vector.\n     * \u003cp\u003eThe instance is not changed by this method.\u003c/p\u003e\n     * @return a unit vector pointing in direction of this vector\n     * @exception ArithmeticException if the norm is null\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.unitize()",
      "begin_line": 462,
      "end_line": 462,
      "comment": " Converts this vector into a unit vector.\n     * \u003cp\u003eThe instance itself is changed by this method.\u003c/p\u003e\n     * @throws  org.apache.commons.math.exception.MathArithmeticException\n     * if the norm is zero.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.projection(org.apache.commons.math.linear.RealVector)",
      "begin_line": 470,
      "end_line": 470,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.projection(double[])",
      "begin_line": 478,
      "end_line": 478,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code v} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.outerProduct(org.apache.commons.math.linear.RealVector)",
      "begin_line": 485,
      "end_line": 485,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the matrix outer product between instance and v\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.outerProduct(double[])",
      "begin_line": 492,
      "end_line": 492,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the matrix outer product between instance and v\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getEntry(int)",
      "begin_line": 503,
      "end_line": 503,
      "comment": "\n     * Returns the entry in the specified index.\n     *\n     * @param index Index location of entry to be fetched.\n     * @return the vector entry at {@code index}.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is not valid.\n     * @see #setEntry(int, double)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.setEntry(int, double)",
      "begin_line": 513,
      "end_line": 513,
      "comment": "\n     * Set a single element.\n     * @param index element index.\n     * @param value new value for the element.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is not valid.\n     * @see #getEntry(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getDimension()",
      "begin_line": 519,
      "end_line": 519,
      "comment": "\n     * Returns the size of the vector.\n     * @return size\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.append(org.apache.commons.math.linear.RealVector)",
      "begin_line": 526,
      "end_line": 526,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.append(double)",
      "begin_line": 533,
      "end_line": 533,
      "comment": "\n     * Construct a vector by appending a double to this vector.\n     * @param d double to append.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.append(double[])",
      "begin_line": 540,
      "end_line": 540,
      "comment": "\n     * Construct a vector by appending a double array to this vector.\n     * @param a double array to append.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.getSubVector(int, int)",
      "begin_line": 550,
      "end_line": 550,
      "comment": "\n     * Get a subvector from consecutive elements.\n     * @param index index of first element.\n     * @param n number of elements to be retrieved.\n     * @return a vector containing n elements.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.setSubVector(int, org.apache.commons.math.linear.RealVector)",
      "begin_line": 560,
      "end_line": 560,
      "comment": "\n     * Set a set of consecutive elements.\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is not valid.\n     * @see #setSubVector(int, double[])\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.setSubVector(int, double[])",
      "begin_line": 570,
      "end_line": 570,
      "comment": "\n     * Set a set of consecutive elements.\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is not valid.\n     * @see #setSubVector(int, RealVector)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.set(double)",
      "begin_line": 576,
      "end_line": 576,
      "comment": "\n     * Set all elements to a single value.\n     * @param value single value to set for all elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.toArray()",
      "begin_line": 584,
      "end_line": 584,
      "comment": "\n     * Convert the vector to a double array.\n     * \u003cp\u003eThe array is independent from vector data, it\u0027s elements\n     * are copied.\u003c/p\u003e\n     * @return array containing a copy of vector elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.isNaN()",
      "begin_line": 591,
      "end_line": 591,
      "comment": "\n     * Check whether any coordinate of this vector is {@code NaN}.\n     * @return {@code true} if any coordinate of this vector is {@code NaN},\n     * {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.isInfinite()",
      "begin_line": 599,
      "end_line": 599,
      "comment": "\n     * Check whether any coordinate of this vector is infinite and none are {@code NaN}.\n     *\n     * @return {@code true} if any coordinate of this vector is infinite and\n     * none are {@code NaN}, {@code false} otherwise.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.combine(double, double, double[])",
      "begin_line": 612,
      "end_line": 612,
      "comment": "\n     * Returns the linear combination of {@code this} and {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return a vector containing {@code a * this[i] + b * y[i]} for all\n     * {@code i}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.combine(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 625,
      "end_line": 625,
      "comment": "\n     * Returns the linear combination of {@code this} and {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return a vector containing {@code a * this[i] + b * y[i]} for all\n     * {@code i}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.combineToSelf(double, double, double[])",
      "begin_line": 639,
      "end_line": 639,
      "comment": "\n     * Updates {@code this} with the linear combination of {@code this} and\n     * {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return {@code this}, with components equal to\n     * {@code a * this[i] + b * y[i]} for all {@code i}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealVector.combineToSelf(double, double, org.apache.commons.math.linear.RealVector)",
      "begin_line": 653,
      "end_line": 653,
      "comment": "\n     * Updates {@code this} with the linear combination of {@code this} and\n     * {@code y}.\n     *\n     * @param a Weight of {@code this}.\n     * @param b Weight of {@code y}.\n     * @param y Vector with which {@code this} is linearly combined.\n     * @return {@code this}, with components equal to\n     * {@code a * this[i] + b * y[i]} for all {@code i}.\n     * @throws org.apache.commons.math.exception.DimensionMismatchException\n     * if {@code y} is not the same size as this vector.\n     ",
      "child_ranges": []
    }
  ]
}