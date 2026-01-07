{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/set/UnmodifiableSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.AbstractSerializableSetDecorator\u003cE\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 36,
      "end_line": 109,
      "comment": "\n * Decorates another \u003ccode\u003eSet\u003c/code\u003e to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSet.unmodifiableSet(java.util.Set\u003c? extends E\u003e)",
      "begin_line": 52,
      "end_line": 59,
      "comment": "\n     * Factory method to create an unmodifiable set.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to decorate, must not be null\n     * @return a new unmodifiable set\n     * @throws IllegalArgumentException if set is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSet.UnmodifiableSet(java.util.Set\u003c? extends E\u003e)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param set  the set to decorate, must not be null\n     * @throws IllegalArgumentException if set is null\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSet.iterator()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSet.add(E)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSet.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSet.clear()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSet.remove(java.lang.Object)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSet.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 50)"
      ]
    }
  ]
}