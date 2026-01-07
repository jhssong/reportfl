{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/multiset/UnmodifiableMultiSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableMultiSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.multiset.AbstractMultiSetDecorator\u003cE\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 39,
      "end_line": 166,
      "comment": "\n * Decorates another {@link MultiSet} to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 4.1\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.unmodifiableMultiSet(org.apache.commons.collections4.MultiSet\u003c? extends E\u003e)",
      "begin_line": 55,
      "end_line": 62,
      "comment": "\n     * Factory method to create an unmodifiable multiset.\n     * \u003cp\u003e\n     * If the multiset passed in is already unmodifiable, it is returned.\n     *\n     * @param \u003cE\u003e  the type of the elements in the multiset\n     * @param multiset  the multiset to decorate, may not be null\n     * @return an unmodifiable MultiSet\n     * @throws NullPointerException if multiset is null\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.UnmodifiableMultiSet(org.apache.commons.collections4.MultiSet\u003c? extends E\u003e)",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param multiset  the multiset to decorate, may not be null\n     * @throws NullPointerException if multiset is null\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Write the collection out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 33)",
        "(line 85,col 9)-(line 85,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.readObject(java.io.ObjectInputStream)",
      "begin_line": 96,
      "end_line": 100,
      "comment": "\n     * Read the collection in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @throws ClassCastException if deserialised object has wrong type\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 31)",
        "(line 99,col 9)-(line 99,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.iterator()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.add(E)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.clear()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.remove(java.lang.Object)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.setCount(E, int)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.add(E, int)",
      "begin_line": 144,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.remove(java.lang.Object, int)",
      "begin_line": 149,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.uniqueSet()",
      "begin_line": 154,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 51)",
        "(line 157,col 9)-(line 157,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.UnmodifiableMultiSet.entrySet()",
      "begin_line": 160,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 66)",
        "(line 163,col 9)-(line 163,col 52)"
      ]
    }
  ]
}