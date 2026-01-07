{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/bag/UnmodifiableBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bag.AbstractBagDecorator\u003cE\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 41,
      "end_line": 158,
      "comment": "\n * Decorates another {@link Bag} to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.unmodifiableBag(org.apache.commons.collections4.Bag\u003c? extends E\u003e)",
      "begin_line": 58,
      "end_line": 65,
      "comment": "\n     * Factory method to create an unmodifiable bag.\n     * \u003cp\u003e\n     * If the bag passed in is already unmodifiable, it is returned.\n     *\n     * @param \u003cE\u003e the type of the elements in the bag\n     * @param bag  the bag to decorate, must not be null\n     * @return an unmodifiable Bag\n     * @throws NullPointerException if bag is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.UnmodifiableBag(org.apache.commons.collections4.Bag\u003c? extends E\u003e)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @throws NullPointerException if bag is null\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Write the collection out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 33)",
        "(line 88,col 9)-(line 88,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.readObject(java.io.ObjectInputStream)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "\n     * Read the collection in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     * @throws ClassCastException if deserialised object has wrong type\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 31)",
        "(line 102,col 9)-(line 102,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.iterator()",
      "begin_line": 106,
      "end_line": 109,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.add(E)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.clear()",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.remove(java.lang.Object)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.add(E, int)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.remove(java.lang.Object, int)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.UnmodifiableBag.uniqueSet()",
      "begin_line": 152,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 51)",
        "(line 155,col 9)-(line 155,col 56)"
      ]
    }
  ]
}