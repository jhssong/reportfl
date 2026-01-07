{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/FieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldVector",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 58,
      "end_line": 299,
      "comment": "\n * Interface defining a field-valued vector with basic algebraic operations.\n * \u003cp\u003e\n * vector element indexing is 0-based -- e.g., \u003ccode\u003egetEntry(0)\u003c/code\u003e\n * returns the first element of the vector.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The various \u003ccode\u003emapXxx\u003c/code\u003e and \u003ccode\u003emapXxxToSelf\u003c/code\u003e methods operate\n * on vectors element-wise, i.e. they perform the same operation (adding a scalar,\n * applying a function ...) on each element in turn. The \u003ccode\u003emapXxx\u003c/code\u003e\n * versions create a new vector to hold the result and do not change the instance.\n * The \u003ccode\u003emapXxxToSelf\u003c/code\u003e versions use the instance itself to store the\n * results, so the instance is changed by these methods. In both cases, the result\n * vector is returned by the methods, this allows to use the \u003ci\u003efluent API\u003c/i\u003e\n * style, like this:\n * \u003c/p\u003e\n * \u003cpre\u003e\n *   RealVector result \u003d v.mapAddToSelf(3.0).mapTanToSelf().mapSquareToSelf();\n * \u003c/pre\u003e\n * \u003cp\u003e\n * Note that as almost all operations on {@link FieldElement} throw {@link\n * NullArgumentException} when operating on a null element, it is the responsibility\n * of \u003ccode\u003eFieldVector\u003c/code\u003e implementations to make sure no null elements\n * are inserted into the vector. This must be done in all constructors and\n * all setters.\n * \u003cp\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.getField()",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Get the type of field elements of the vector.\n     * @return type of field elements of the vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.copy()",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Returns a (deep) copy of this.\n     * @return vector copy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.add(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Compute the sum of {@code this} and {@code v}.\n     * @param v vector to be added\n     * @return {@code this + v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as {@code this}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.subtract(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Compute {@code this} minus {@code v}.\n     * @param v vector to be subtracted\n     * @return {@code this - v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as {@code this}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapAdd(T)",
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Map an addition operation to each entry.\n     * @param d value to be added to each entry\n     * @return {@code this + d}\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapAddToSelf(T)",
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * Map an addition operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to be added to each entry\n     * @return for convenience, return {@code this}\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapSubtract(T)",
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * Map a subtraction operation to each entry.\n     * @param d value to be subtracted to each entry\n     * @return {@code this - d}\n     * @throws NullArgumentException if {@code d} is {@code null}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapSubtractToSelf(T)",
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * Map a subtraction operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to be subtracted to each entry\n     * @return for convenience, return {@code this}\n     * @throws NullArgumentException if {@code d} is {@code null}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapMultiply(T)",
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Map a multiplication operation to each entry.\n     * @param d value to multiply all entries by\n     * @return {@code this * d}\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapMultiplyToSelf(T)",
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Map a multiplication operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to multiply all entries by\n     * @return for convenience, return {@code this}\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapDivide(T)",
      "begin_line": 146,
      "end_line": 147,
      "comment": "\n     * Map a division operation to each entry.\n     * @param d value to divide all entries by\n     * @return {@code this / d}\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws MathArithmeticException if {@code d} is zero.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapDivideToSelf(T)",
      "begin_line": 157,
      "end_line": 158,
      "comment": "\n     * Map a division operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to divide all entries by\n     * @return for convenience, return {@code this}\n     * @throws NullArgumentException if {@code d} is {@code null}.\n     * @throws MathArithmeticException if {@code d} is zero.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapInv()",
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * Map the 1/x function to each entry.\n     * @return a vector containing the result of applying the function to each entry.\n     * @throws MathArithmeticException if one of the entries is zero.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.mapInvToSelf()",
      "begin_line": 173,
      "end_line": 173,
      "comment": "\n     * Map the 1/x function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return {@code this}\n     * @throws MathArithmeticException if one of the entries is zero.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.ebeMultiply(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 181,
      "end_line": 182,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing {@code this[i] * v[i]} for all {@code i}\n     * @throws DimensionMismatchException if {@code v} is not the same size as {@code this}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.ebeDivide(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 191,
      "end_line": 192,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing {@code this[i] / v[i]} for all {@code i}\n     * @throws DimensionMismatchException if {@code v} is not the same size as {@code this}\n     * @throws MathArithmeticException if one entry of {@code v} is zero.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.getData()",
      "begin_line": 199,
      "end_line": 200,
      "comment": "\n     * Returns vector entries as a T array.\n     * @return T array of entries\n     * @deprecated as of 3.1, to be removed in 4.0. Please use the {@link #toArray()} method instead.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.dotProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 208,
      "end_line": 208,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product of {@code this} and {@code v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as {@code this}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.projection(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 217,
      "end_line": 218,
      "comment": "\n     * Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which {@code this} must be projected\n     * @return projection of {@code this} onto {@code v}\n     * @throws DimensionMismatchException if {@code v} is not the same size as {@code this}\n     * @throws MathArithmeticException if {@code v} is the null vector.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.outerProduct(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 225,
      "end_line": 225,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the matrix outer product between instance and v\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.getEntry(int)",
      "begin_line": 235,
      "end_line": 235,
      "comment": "\n     * Returns the entry in the specified index.\n     *\n     * @param index Index location of entry to be fetched.\n     * @return the vector entry at {@code index}.\n     * @throws OutOfRangeException if the index is not valid.\n     * @see #setEntry(int, FieldElement)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.setEntry(int, T)",
      "begin_line": 244,
      "end_line": 244,
      "comment": "\n     * Set a single element.\n     * @param index element index.\n     * @param value new value for the element.\n     * @throws OutOfRangeException if the index is not valid.\n     * @see #getEntry(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.getDimension()",
      "begin_line": 250,
      "end_line": 250,
      "comment": "\n     * Returns the size of the vector.\n     * @return size\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.append(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 257,
      "end_line": 257,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.append(T)",
      "begin_line": 264,
      "end_line": 264,
      "comment": "\n     * Construct a vector by appending a T to this vector.\n     * @param d T to append.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.getSubVector(int, int)",
      "begin_line": 274,
      "end_line": 275,
      "comment": "\n     * Get a subvector from consecutive elements.\n     * @param index index of first element.\n     * @param n number of elements to be retrieved.\n     * @return a vector containing n elements.\n     * @throws OutOfRangeException if the index is not valid.\n     * @throws NotPositiveException if the number of elements if not positive.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.setSubVector(int, org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 283,
      "end_line": 283,
      "comment": "\n     * Set a set of consecutive elements.\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws OutOfRangeException if the index is not valid.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.set(T)",
      "begin_line": 289,
      "end_line": 289,
      "comment": "\n     * Set all elements to a single value.\n     * @param value single value to set for all elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldVector.toArray()",
      "begin_line": 297,
      "end_line": 297,
      "comment": "\n     * Convert the vector to a T array.\n     * \u003cp\u003eThe array is independent from vector data, it\u0027s elements\n     * are copied.\u003c/p\u003e\n     * @return array containing a copy of vector elements\n     ",
      "child_ranges": []
    }
  ]
}