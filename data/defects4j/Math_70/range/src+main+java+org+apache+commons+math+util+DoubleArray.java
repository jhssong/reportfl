{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/util/DoubleArray.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DoubleArray",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 104,
      "comment": "\n * Provides a standard interface for double arrays.  Allows different\n * array implementations to support various storage mechanisms\n * such as automatic expansion, contraction, and array \"rolling\".\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DoubleArray.getNumElements()",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Returns the number of elements currently in the array.  Please note\n     * that this may be different from the length of the internal storage array.\n     *\n     * @return number of elements\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DoubleArray.getElement(int)",
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Returns the element at the specified index.  Note that if an\n     * out of bounds index is supplied a ArrayIndexOutOfBoundsException\n     * will be thrown.\n     *\n     * @param index index to fetch a value from\n     * @return value stored at the specified index\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is less than\n     *         zero or is greater than \u003ccode\u003egetNumElements() - 1\u003c/code\u003e.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DoubleArray.setElement(int, double)",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Sets the element at the specified index.  If the specified index is greater than\n     * \u003ccode\u003egetNumElements() - 1\u003c/code\u003e, the \u003ccode\u003enumElements\u003c/code\u003e property\n     * is increased to \u003ccode\u003eindex +1\u003c/code\u003e and additional storage is allocated\n     * (if necessary) for the new element and all  (uninitialized) elements\n     * between the new element and the previous end of the array).\n     *\n     * @param index index to store a value in\n     * @param value value to store at the specified index\n     * @throws ArrayIndexOutOfBoundsException if \u003ccode\u003eindex\u003c/code\u003e is less than\n     *         zero.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DoubleArray.addElement(double)",
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Adds an element to the end of this expandable array\n     *\n     * @param value to be added to end of array\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DoubleArray.addElementRolling(double)",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * \u003cp\u003e\n     * Adds an element to the end of the array and removes the first\n     * element in the array.  Returns the discarded first element.\n     * The effect is similar to a push operation in a FIFO queue.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * Example: If the array contains the elements 1, 2, 3, 4 (in that order)\n     * and addElementRolling(5) is invoked, the result is an array containing\n     * the entries 2, 3, 4, 5 and the value returned is 1.\n     * \u003c/p\u003e\n     *\n     * @param value the value to be added to the array\n     * @return the value which has been discarded or \"pushed\" out of the array\n     *         by this rolling insert\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DoubleArray.getElements()",
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Returns a double[] array containing the elements of this\n     * \u003ccode\u003eDoubleArray\u003c/code\u003e.  If the underlying implementation is\n     * array-based, this method should always return a copy, rather than a\n     * reference to the underlying array so that changes made to the returned\n     *  array have no effect on the \u003ccode\u003eDoubleArray.\u003c/code\u003e\n     *\n     * @return all elements added to the array\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.DoubleArray.clear()",
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Clear the double array\n     ",
      "child_ranges": []
    }
  ]
}