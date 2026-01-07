{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/EnumerationUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumerationUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 97,
      "comment": "\n * Provides utility methods for {@link Enumeration} instances.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.EnumerationUtils.EnumerationUtils()",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * EnumerationUtils is not normally instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.EnumerationUtils.get(java.util.Enumeration\u003cT\u003e, int)",
      "begin_line": 54,
      "end_line": 66,
      "comment": "\n     * Returns the \u003ccode\u003eindex\u003c/code\u003e-th value in the {@link Enumeration}, throwing\n     * \u003ccode\u003eIndexOutOfBoundsException\u003c/code\u003e if there is no such element.\n     * \u003cp\u003e\n     * The Enumeration is advanced to \u003ccode\u003eindex\u003c/code\u003e (or to the end, if\n     * \u003ccode\u003eindex\u003c/code\u003e exceeds the number of entries) as a side effect of this method.\n     *\n     * @param e  the enumeration to get a value from\n     * @param index  the index to get\n     * @param \u003cT\u003e the type of object in the {@link Enumeration}\n     * @return the object at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @throws IllegalArgumentException if the object type is invalid\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 22)",
        "(line 56,col 9)-(line 56,col 44)",
        "(line 57,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.EnumerationUtils.toList(java.util.Enumeration\u003c? extends E\u003e)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Creates a list based on an enumeration.\n     *\n     * \u003cp\u003eAs the enumeration is traversed, an ArrayList of its values is\n     * created. The new list is returned.\u003c/p\u003e\n     *\n     * @param \u003cE\u003e the element type\n     * @param enumeration  the enumeration to traverse, which should not be \u003ccode\u003enull\u003c/code\u003e.\n     * @return a list containing all elements of the given enumeration\n     * @throws NullPointerException if the enumeration parameter is \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.EnumerationUtils.toList(java.util.StringTokenizer)",
      "begin_line": 90,
      "end_line": 96,
      "comment": "\n     * Override toList(Enumeration) for StringTokenizer as it implements Enumeration\u0026lt;Object\u0026gt;\n     * for the sake of backward compatibility.\n     *\n     * @param stringTokenizer  the tokenizer to convert to a {@link List}\u0026lt;{@link String}\u0026gt;\n     * @return a list containing all tokens of the given StringTokenizer\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 89)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 22)"
      ]
    }
  ]
}