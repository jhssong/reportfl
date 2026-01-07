{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/set/UnmodifiableNavigableSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableNavigableSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.AbstractNavigableSetDecorator\u003cE\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 38,
      "end_line": 182,
      "comment": "\n * Decorates another \u003ccode\u003eNavigableSet\u003c/code\u003e to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.unmodifiableNavigableSet(java.util.NavigableSet\u003cE\u003e)",
      "begin_line": 53,
      "end_line": 58,
      "comment": "\n     * Factory method to create an unmodifiable set.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to decorate, must not be null\n     * @return a new unmodifiable {@link NavigableSet}\n     * @throws NullPointerException if set is null\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.UnmodifiableNavigableSet(java.util.NavigableSet\u003cE\u003e)",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param set  the set to decorate, must not be null\n     * @throws NullPointerException if set is null\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.iterator()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.add(E)",
      "begin_line": 77,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.clear()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.remove(java.lang.Object)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.subSet(E, E)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 76)",
        "(line 112,col 9)-(line 112,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.headSet(E)",
      "begin_line": 115,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 65)",
        "(line 118,col 9)-(line 118,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.tailSet(E)",
      "begin_line": 121,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 67)",
        "(line 124,col 9)-(line 124,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.descendingSet()",
      "begin_line": 129,
      "end_line": 132,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.descendingIterator()",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.subSet(E, boolean, E, boolean)",
      "begin_line": 139,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 107)",
        "(line 142,col 9)-(line 142,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.headSet(E, boolean)",
      "begin_line": 145,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 79)",
        "(line 148,col 9)-(line 148,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.tailSet(E, boolean)",
      "begin_line": 151,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 81)",
        "(line 154,col 9)-(line 154,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 164,
      "end_line": 167,
      "comment": "\n     * Write the collection out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 33)",
        "(line 166,col 9)-(line 166,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.UnmodifiableNavigableSet.readObject(java.io.ObjectInputStream)",
      "begin_line": 176,
      "end_line": 180,
      "comment": "\n     * Read the collection in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 31)",
        "(line 179,col 9)-(line 179,col 55)"
      ]
    }
  ]
}