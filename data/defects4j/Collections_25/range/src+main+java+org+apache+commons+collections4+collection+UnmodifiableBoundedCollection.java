{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/collection/UnmodifiableBoundedCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableBoundedCollection",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cE\u003e",
        "org.apache.commons.collections4.BoundedCollection\u003cE\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 43,
      "end_line": 163,
      "comment": "\n * {@link UnmodifiableBoundedCollection} decorates another\n * {@link BoundedCollection} to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * If a BoundedCollection is first wrapped in some other collection decorator,\n * such as synchronized or predicated, the BoundedCollection methods are no\n * longer accessible.\n * The factory on this class will attempt to retrieve the bounded nature by\n * examining the package scope variables.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(org.apache.commons.collections4.BoundedCollection\u003c? extends E\u003e)",
      "begin_line": 58,
      "end_line": 65,
      "comment": "\n     * Factory method to create an unmodifiable bounded collection.\n     *\n     * @param \u003cE\u003e the type of the elements in the collection\n     * @param coll  the \u003ccode\u003eBoundedCollection\u003c/code\u003e to decorate, must not be null\n     * @return a new unmodifiable bounded collection\n     * @throws IllegalArgumentException if {@code coll} is {@code null}\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 79,
      "end_line": 101,
      "comment": "\n     * Factory method to create an unmodifiable bounded collection.\n     * \u003cp\u003e\n     * This method is capable of drilling down through up to 1000 other decorators\n     * to find a suitable BoundedCollection.\n     *\n     * @param \u003cE\u003e the type of the elements in the collection\n     * @param coll  the \u003ccode\u003eBoundedCollection\u003c/code\u003e to decorate, must not be null\n     * @return a new unmodifiable bounded collection\n     * @throws IllegalArgumentException if {@code coll} is {@code null}\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 86,col 9)-(line 95,col 9)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.UnmodifiableBoundedCollection(org.apache.commons.collections4.BoundedCollection\u003c? extends E\u003e)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param coll  the collection to decorate, must not be null\n     * @throws IllegalArgumentException if coll is null\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.iterator()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.add(E)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.clear()",
      "begin_line": 130,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.remove(java.lang.Object)",
      "begin_line": 135,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 145,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.isFull()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.maxSize()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.decorated()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 56)"
      ]
    }
  ]
}