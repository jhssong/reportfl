{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/collection/UnmodifiableBoundedCollection.java",
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
      "end_line": 166,
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
      "comment": "\n     * Factory method to create an unmodifiable bounded collection.\n     *\n     * @param \u003cE\u003e the type of the elements in the collection\n     * @param coll  the \u003ccode\u003eBoundedCollection\u003c/code\u003e to decorate, must not be null\n     * @return a new unmodifiable bounded collection\n     * @throws NullPointerException if {@code coll} is {@code null}\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 80,
      "end_line": 102,
      "comment": "\n     * Factory method to create an unmodifiable bounded collection.\n     * \u003cp\u003e\n     * This method is capable of drilling down through up to 1000 other decorators\n     * to find a suitable BoundedCollection.\n     *\n     * @param \u003cE\u003e the type of the elements in the collection\n     * @param coll  the \u003ccode\u003eBoundedCollection\u003c/code\u003e to decorate, must not be null\n     * @return a new unmodifiable bounded collection\n     * @throws NullPointerException if coll is null\n     * @throws IllegalArgumentException if coll is not a {@code BoundedCollection}\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 87,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 81)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.UnmodifiableBoundedCollection(org.apache.commons.collections4.BoundedCollection\u003c? extends E\u003e)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param coll  the collection to decorate, must not be null\n     * @throws NullPointerException if coll is null\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.iterator()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.add(E)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.clear()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.remove(java.lang.Object)",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.isFull()",
      "begin_line": 152,
      "end_line": 155,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.maxSize()",
      "begin_line": 157,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.decorated()",
      "begin_line": 162,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 56)"
      ]
    }
  ]
}