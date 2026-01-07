{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/bag/UnmodifiableSortedBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableSortedBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bag.AbstractSortedBagDecorator\u003cE\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 41,
      "end_line": 155,
      "comment": "\n * Decorates another {@link SortedBag} to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.unmodifiableSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e)",
      "begin_line": 58,
      "end_line": 63,
      "comment": "\n     * Factory method to create an unmodifiable bag.\n     * \u003cp\u003e\n     * If the bag passed in is already unmodifiable, it is returned.\n     *\n     * @param \u003cE\u003e the type of the elements in the bag\n     * @param bag  the bag to decorate, must not be null\n     * @return an unmodifiable SortedBag\n     * @throws NullPointerException if bag is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 62,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.UnmodifiableSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @throws NullPointerException if bag is null\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.writeObject(java.io.ObjectOutputStream)",
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
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.readObject(java.io.ObjectInputStream)",
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
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.iterator()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.add(E)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.clear()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.remove(java.lang.Object)",
      "begin_line": 123,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.add(E, int)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.remove(java.lang.Object, int)",
      "begin_line": 144,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableSortedBag.uniqueSet()",
      "begin_line": 149,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 51)",
        "(line 152,col 9)-(line 152,col 52)"
      ]
    }
  ]
}