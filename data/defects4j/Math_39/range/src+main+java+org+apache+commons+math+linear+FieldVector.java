{
  "filepath": "/tmp/Math-39b/src/main/java/org/apache/commons/math/linear/FieldVector.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldVector",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 271,
      "comment": "\n * Interface defining a field-valued vector with basic algebraic operations.\n * \u003cp\u003e\n * vector element indexing is 0-based -- e.g., \u003ccode\u003egetEntry(0)\u003c/code\u003e\n * returns the first element of the vector.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The various \u003ccode\u003emapXxx\u003c/code\u003e and \u003ccode\u003emapXxxToSelf\u003c/code\u003e methods operate\n * on vectors element-wise, i.e. they perform the same operation (adding a scalar,\n * applying a function ...) on each element in turn. The \u003ccode\u003emapXxx\u003c/code\u003e\n * versions create a new vector to hold the result and do not change the instance.\n * The \u003ccode\u003emapXxxToSelf\u003c/code\u003e versions use the instance itself to store the\n * results, so the instance is changed by these methods. In both cases, the result\n * vector is returned by the methods, this allows to use the \u003ci\u003efluent API\u003c/i\u003e\n * style, like this:\n * \u003c/p\u003e\n * \u003cpre\u003e\n *   RealVector result \u003d v.mapAddToSelf(3.0).mapTanToSelf().mapSquareToSelf();\n * \u003c/pre\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.getField()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Get the type of field elements of the vector.\n     * @return type of field elements of the vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.copy()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Returns a (deep) copy of this.\n     * @return vector copy\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.add(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 66,
      "end_line": 67,
      "comment": "\n     * Compute the sum of this and v.\n     * @param v vector to be added\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.subtract(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 75,
      "end_line": 76,
      "comment": "\n     * Compute this minus v.\n     * @param v vector to be subtracted\n     * @return this + v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.mapAdd(T)",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Map an addition operation to each entry.\n     * @param d value to be added to each entry\n     * @return this + d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.mapAddToSelf(T)",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Map an addition operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to be added to each entry\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.mapSubtract(T)",
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Map a subtraction operation to each entry.\n     * @param d value to be subtracted to each entry\n     * @return this - d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.mapSubtractToSelf(T)",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Map a subtraction operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to be subtracted to each entry\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.mapMultiply(T)",
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Map a multiplication operation to each entry.\n     * @param d value to multiply all entries by\n     * @return this * d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.mapMultiplyToSelf(T)",
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Map a multiplication operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to multiply all entries by\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.mapDivide(T)",
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Map a division operation to each entry.\n     * @param d value to divide all entries by\n     * @return this / d\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.mapDivideToSelf(T)",
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Map a division operation to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @param d value to divide all entries by\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.mapInv()",
      "begin_line": 142,
      "end_line": 142,
      "comment": "\n     * Map the 1/x function to each entry.\n     * @return a vector containing the result of applying the function to each entry\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.mapInvToSelf()",
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n     * Map the 1/x function to each entry.\n     * \u003cp\u003eThe instance \u003cstrong\u003eis\u003c/strong\u003e changed by this method.\u003c/p\u003e\n     * @return for convenience, return this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.ebeMultiply(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 157,
      "end_line": 157,
      "comment": "\n     * Element-by-element multiplication.\n     * @param v vector by which instance elements must be multiplied\n     * @return a vector containing this[i] * v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.ebeDivide(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * Element-by-element division.\n     * @param v vector by which instance elements must be divided\n     * @return a vector containing this[i] / v[i] for all i\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.getData()",
      "begin_line": 171,
      "end_line": 171,
      "comment": "\n     * Returns vector entries as a T array.\n     * @return T array of entries\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.dotProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 179,
      "end_line": 180,
      "comment": "\n     * Compute the dot product.\n     * @param v vector with which dot product should be computed\n     * @return the scalar dot product between instance and v\n     * @exception IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.projection(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 187,
      "end_line": 188,
      "comment": " Find the orthogonal projection of this vector onto another vector.\n     * @param v vector onto which instance must be projected\n     * @return projection of the instance onto v\n     * @throws IllegalArgumentException if v is not the same size as this\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.outerProduct(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * Compute the outer product.\n     * @param v vector with which outer product should be computed\n     * @return the matrix outer product between instance and v\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.getEntry(int)",
      "begin_line": 206,
      "end_line": 206,
      "comment": "\n     * Returns the entry in the specified index.\n     *\n     * @param index Index location of entry to be fetched.\n     * @return the vector entry at {@code index}.\n     * @throws org.apache.commons.math.exception.OutOfRangeException if the\n     * index is not valid.\n     * @see #setEntry(int, FieldElement)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.setEntry(int, T)",
      "begin_line": 216,
      "end_line": 216,
      "comment": "\n     * Set a single element.\n     * @param index element index.\n     * @param value new value for the element.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is inconsistent with vector size.\n     * @see #getEntry(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.getDimension()",
      "begin_line": 222,
      "end_line": 222,
      "comment": "\n     * Returns the size of the vector.\n     * @return size\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.append(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 229,
      "end_line": 229,
      "comment": "\n     * Construct a vector by appending a vector to this vector.\n     * @param v vector to append to this one.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.append(T)",
      "begin_line": 236,
      "end_line": 236,
      "comment": "\n     * Construct a vector by appending a T to this vector.\n     * @param d T to append.\n     * @return a new vector\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.getSubVector(int, int)",
      "begin_line": 246,
      "end_line": 246,
      "comment": "\n     * Get a subvector from consecutive elements.\n     * @param index index of first element.\n     * @param n number of elements to be retrieved.\n     * @return a vector containing n elements.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is inconsistent with vector size.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.setSubVector(int, org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 255,
      "end_line": 255,
      "comment": "\n     * Set a set of consecutive elements.\n     * @param index index of first element to be set.\n     * @param v vector containing the values to set.\n     * @throws org.apache.commons.math.exception.OutOfRangeException\n     * if the index is inconsistent with vector size.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.set(T)",
      "begin_line": 261,
      "end_line": 261,
      "comment": "\n     * Set all elements to a single value.\n     * @param value single value to set for all elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldVector.toArray()",
      "begin_line": 269,
      "end_line": 269,
      "comment": "\n     * Convert the vector to a T array.\n     * \u003cp\u003eThe array is independent from vector data, it\u0027s elements\n     * are copied.\u003c/p\u003e\n     * @return array containing a copy of vector elements\n     ",
      "child_ranges": []
    }
  ]
}