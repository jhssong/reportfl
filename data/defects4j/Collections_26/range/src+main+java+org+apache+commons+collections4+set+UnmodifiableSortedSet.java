{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/set/UnmodifiableSortedSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableSortedSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.AbstractSortedSetDecorator\u003cE\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 39,
      "end_line": 153,
      "comment": "\n * Decorates another \u003ccode\u003eSortedSet\u003c/code\u003e to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.unmodifiableSortedSet(java.util.SortedSet\u003cE\u003e)",
      "begin_line": 55,
      "end_line": 60,
      "comment": "\n     * Factory method to create an unmodifiable set.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to decorate, must not be null\n     * @return a new unmodifiable {@link SortedSet}\n     * @throws NullPointerException if set is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.UnmodifiableSortedSet(java.util.SortedSet\u003cE\u003e)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param set  the set to decorate, must not be null\n     * @throws NullPointerException if set is null\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.iterator()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.add(E)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.clear()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.remove(java.lang.Object)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 99,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.subSet(E, E)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 76)",
        "(line 113,col 9)-(line 113,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.headSet(E)",
      "begin_line": 116,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 65)",
        "(line 119,col 9)-(line 119,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.tailSet(E)",
      "begin_line": 122,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 67)",
        "(line 125,col 9)-(line 125,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 135,
      "end_line": 138,
      "comment": "\n     * Write the collection out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 33)",
        "(line 137,col 9)-(line 137,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableSortedSet.readObject(java.io.ObjectInputStream)",
      "begin_line": 147,
      "end_line": 151,
      "comment": "\n     * Read the collection in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 31)",
        "(line 150,col 9)-(line 150,col 55)"
      ]
    }
  ]
}