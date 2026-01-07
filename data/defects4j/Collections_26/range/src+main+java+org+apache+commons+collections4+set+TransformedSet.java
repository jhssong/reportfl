{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/set/TransformedSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.TransformedCollection\u003cE\u003e",
        "java.util.Set\u003cE\u003e"
      ],
      "begin_line": 37,
      "end_line": 114,
      "comment": "\n * Decorates another \u003ccode\u003eSet\u003c/code\u003e to transform objects that are added.\n * \u003cp\u003e\n * The add methods are affected by this class.\n * Thus objects must be removed or searched for using their transformed form.\n * For example, if the transformation converts Strings to Integers, you must\n * use the Integer form to remove objects.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedSet.transformingSet(java.util.Set\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Factory method to create a transforming set.\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * are NOT transformed.\n     * Contrast this with {@link #transformedSet(Set, Transformer)}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed set\n     * @throws NullPointerException if set or transformer is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedSet.transformedSet(java.util.Set\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 76,
      "end_line": 87,
      "comment": "\n     * Factory method to create a transforming set that will transform\n     * existing contents of the specified set.\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * will be transformed by this method.\n     * Contrast this with {@link #transformingSet(Set, Transformer)}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed set\n     * @throws NullPointerException if set or transformer is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 84)",
        "(line 78,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.TransformedSet.TransformedSet(java.util.Set\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the set being decorated, they\n     * are NOT transformed.\n     *\n     * @param set  the set to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @throws NullPointerException if set or transformer is null\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedSet.equals(java.lang.Object)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.TransformedSet.hashCode()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 38)"
      ]
    }
  ]
}