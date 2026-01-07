{
  "filepath": "/tmp/Math-21b/src/main/java/org/apache/commons/math3/linear/FieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldVector",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 341,
      "comment": "\n * Interface defining a field-valued vector with basic algebraic operations.\n * \u003cp\u003e\n * vector element indexing is 0-based -- e.g., \u003ccode\u003egetEntry(0)\u003c/code\u003e\n * returns the first element of the vector.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The various \u003ccode\u003emapXxx\u003c/code\u003e and \u003ccode\u003emapXxxToSelf\u003c/code\u003e methods operate\n * on vectors element-wise, i.e. they perform the same operation (adding a scalar,\n * applying a function ...) on each element in turn. The \u003ccode\u003emapXxx\u003c/code\u003e\n * versions create a new vector to hold the result and do not change the instance.\n * The \u003ccode\u003emapXxxToSelf\u003c/code\u003e versions use the instance itself to store the\n * results, so the instance is changed by these methods. In both cases, the result\n * vector is returned by the methods, this allows to use the \u003ci\u003efluent API\u003c/i\u003e\n * style, like this:\n * \u003c/p\u003e\n * \u003cpre\u003e\n *   RealVector result \u003d v.mapAddToSelf(3.0).mapTanToSelf().mapSquareToSelf();\n * \u003c/pre\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.getField()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Get the type of field elements of the vector.\n     * @return type of field elements of the vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.copy()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Returns a (deep) copy of this.\n     * @return vector copy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.add(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Compute the sum of {@code this} and {@code v}. Implementations should throw\n     * {@link org.apache.commons.math3.exception.DimensionMismatchException} if\n     * {@code v} is not the same size as {@code this}.\n     *\n     * @param v vector to be added\n     * @return {@code this + v}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.subtract(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Compute {@code this} minus {@code v}. Implementations should throw\n     * {@link org.apache.commons.math3.exception.DimensionMismatchException} if\n     * {@code v} is not the same size as {@code this}\n     *\n     * @param v vector to be subtracted\n     * @return {@code this + v}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapAdd(T)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Map an addition operation to each entry. Implementations should throw\n     * {@link org.apache.commons.math3.exception.NullArgumentException} if\n     * {@code d} is {@code null}.\n     *\n     * @param d value to be added to each entry\n     * @return {@code this + d}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapAddToSelf(T)",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Map an addition operation to each entry. The instance \u003cstrong\u003eis\u003c/strong\u003e\n     * changed by this method. Implementations should throw\n     * {@link org.apache.commons.math3.exception.NullArgumentException} if\n     * {@code d} is {@code null}.\n     *\n     * @param d value to be added to each entry\n     * @return for convenience, return {@code this}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapSubtract(T)",
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Map a subtraction operation to each entry. Implementations should throw\n     * {@link org.apache.commons.math3.exception.NullArgumentException} if\n     * {@code d} is {@code null}.\n     *\n     * @param d value to be subtracted to each entry\n     * @return {@code this - d}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapSubtractToSelf(T)",
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * Map a subtraction operation to each entry. The instance\n     * \u003cstrong\u003eis\u003c/strong\u003e changed by this method. Implementations should throw\n     * {@link org.apache.commons.math3.exception.NullArgumentException} if\n     * {@code d} is {@code null}.\n     *\n     * @param d value to be subtracted to each entry\n     * @return for convenience, return {@code this}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapMultiply(T)",
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * Map a multiplication operation to each entry. Implementations should throw\n     * {@link org.apache.commons.math3.exception.NullArgumentException} if\n     * {@code d} is {@code null}.\n     *\n     * @param d value to multiply all entries by\n     * @return {@code this * d}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapMultiplyToSelf(T)",
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * Map a multiplication operation to each entry. The instance\n     * \u003cstrong\u003eis\u003c/strong\u003e changed by this method. Implementations should throw\n     * {@link org.apache.commons.math3.exception.NullArgumentException} if\n     * {@code d} is {@code null}.\n     *\n     * @param d value to multiply all entries by\n     * @return for convenience, return {@code this}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapDivide(T)",
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * Map a division operation to each entry. Implementations should throw\n     * \u003cul\u003e\n     * \u003cli\u003e{@link org.apache.commons.math3.exception.NullArgumentException} if\n     *     {@code d} is {@code null},\u003c/li\u003e\n     * \u003cli\u003e{@link org.apache.commons.math3.exception.MathArithmeticException} if\n     *     {@code d} is zero.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param d value to divide all entries by\n     * @return {@code this / d}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapDivideToSelf(T)",
      "begin_line": 170,
      "end_line": 170,
      "comment": "\n     * Map a division operation to each entry. The instance \u003cstrong\u003eis\u003c/strong\u003e\n     * changed by this method.\n     * \u003cul\u003e\n     * \u003cli\u003e{@link org.apache.commons.math3.exception.NullArgumentException} if\n     *     {@code d} is {@code null},\u003c/li\u003e\n     * \u003cli\u003e{@link org.apache.commons.math3.exception.MathArithmeticException} if\n     *     {@code d} is zero.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param d value to divide all entries by\n     * @return for convenience, return {@code this}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapInv()",
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n     * Map the 1/x function to each entry. Implementations should throw\n     * {@link org.apache.commons.math3.exception.MathArithmeticException} if\n     * one of the entries is zero.\n     *\n     * @return a vector containing the result of applying the function to each\n     * entry.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapInvToSelf()",
      "begin_line": 190,
      "end_line": 190,
      "comment": "\n     * Map the 1/x function to each entry. The instance \u003cstrong\u003eis\u003c/strong\u003e\n     * changed by this method. Implementations should throw\n     * {@link org.apache.commons.math3.exception.MathArithmeticException} if\n     * one of the entries is zero.\n     *\n     * @return for convenience, return {@code this}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.ebeMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 200,
      "end_line": 200,
      "comment": "\n     * Element-by-element multiplication. Implementations should throw\n     * {@link org.apache.commons.math3.exception.DimensionMismatchException} if\n     * {@code v} is not the same size as {@code this}.\n     *\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing {@code this[i] * v[i]} for all {@code i}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.ebeDivide(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 215,
      "end_line": 215,
      "comment": "\n     * Element-by-element division. Implementations should throw\n     * \u003cul\u003e\n     * \u003cli\u003e{@link org.apache.commons.math3.exception.DimensionMismatchException}\n     *     if {@code v} is not the same size as {@code this},\u003c/li\u003e\n     * \u003cli\u003e{@link org.apache.commons.math3.exception.MathArithmeticException}\n     *     if one entry of {@code v} is zero.\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing {@code this[i] / v[i]} for all {@code i}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.getData()",
      "begin_line": 221,
      "end_line": 221,
      "comment": "\n     * Returns vector entries as a T array.\n     * @return T array of entries\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.dotProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 231,
      "end_line": 231,
      "comment": "\n     * Compute the dot product. Implementations should throw\n     * {@link org.apache.commons.math3.exception.DimensionMismatchException} if\n     * {@code v} is not the same size as {@code this}.\n     *\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product of {@code this} and {@code v}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.projection(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 247,
      "end_line": 247,
      "comment": "\n     * Find the orthogonal projection of this vector onto another vector.\n     * Implementations should throw\n     * \u003cul\u003e\n     * \u003cli\u003e{@link org.apache.commons.math3.exception.DimensionMismatchException}\n     *     if {@code v} is not the same size as {@code this},\u003c/li\u003e\n     * \u003cli\u003e{@link org.apache.commons.math3.exception.MathArithmeticException}\n     *     if {@code v} is the null vector.\n     * \u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param v vector onto which {@code this} must be projected\n     * @return projection of {@code this} onto {@code v}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.outerProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 254,
      "end_line": 254,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the matrix outer product between instance and v\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.getEntry(int)",
      "begin_line": 265,
      "end_line": 265,
      "comment": "\n     * Returns the entry in the specified index. Implementations should throw\n     * {@link org.apache.commons.math3.exception.OutOfRangeException} if the\n     * index is not valid.\n     *\n     * @param index Index location of entry to be fetched.\n     * @return the vector entry at {@code index}.\n     * @see #setEntry(int, FieldElement)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.setEntry(int, T)",
      "begin_line": 280,
      "end_line": 280,
      "comment": "\n     * Set a single element. Implementations should throw\n     * \u003cul\u003e\n     * \u003cli\u003e{@link org.apache.commons.math3.exception.OutOfRangeException} if the\n     *     index is not valid,\u003c/li\u003e\n     * \u003cli\u003e{@link org.apache.commons.math3.exception.NullArgumentException} if\n     *     the value is {@code null}.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param index element index.\n     * @param value new value for the element.\n     * @see #getEntry(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.getDimension()",
      "begin_line": 286,
      "end_line": 286,
      "comment": "\n     * Returns the size of the vector.\n     * @return size\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.append(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 293,
      "end_line": 293,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.append(T)",
      "begin_line": 300,
      "end_line": 300,
      "comment": "\n     * Construct a vector by appending a T to this vector.\n     * @param d T to append.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.getSubVector(int, int)",
      "begin_line": 315,
      "end_line": 315,
      "comment": "\n     * Get a subvector from consecutive elements. Implementations should throw\n     * \u003cul\u003e\n     * \u003cli\u003e{@link org.apache.commons.math3.exception.OutOfRangeException} if the\n     *     index is not valid,\u003c/li\u003e\n     * \u003cli\u003e{@link org.apache.commons.math3.exception.NotPositiveException} if\n     *     the number of elements is not positive.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param index index of first element.\n     * @param n number of elements to be retrieved.\n     * @return a vector containing n elements.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.setSubVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 325,
      "end_line": 325,
      "comment": "\n     * Set a set of consecutive elements. Implementations should throw\n     * {@link org.apache.commons.math3.exception.OutOfRangeException} if the\n     * index is not valid.\n     *\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.set(T)",
      "begin_line": 331,
      "end_line": 331,
      "comment": "\n     * Set all elements to a single value.\n     * @param value single value to set for all elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.toArray()",
      "begin_line": 339,
      "end_line": 339,
      "comment": "\n     * Convert the vector to a T array.\n     * \u003cp\u003eThe array is independent from vector data, it\u0027s elements\n     * are copied.\u003c/p\u003e\n     * @return array containing a copy of vector elements\n     ",
      "child_ranges": []
    }
  ]
}