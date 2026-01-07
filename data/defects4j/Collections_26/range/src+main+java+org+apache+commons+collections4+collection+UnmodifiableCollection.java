{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/collection/UnmodifiableCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableCollection",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cE\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 36,
      "end_line": 111,
      "comment": "\n * Decorates another {@link Collection} to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @param \u003cE\u003e the type of the elements in the collection\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.collection.UnmodifiableCollection.unmodifiableCollection(java.util.Collection\u003c? extends T\u003e)",
      "begin_line": 54,
      "end_line": 61,
      "comment": "\n     * Factory method to create an unmodifiable collection.\n     * \u003cp\u003e\n     * If the collection passed in is already unmodifiable, it is returned.\n     *\n     * @param \u003cT\u003e the type of the elements in the collection\n     * @param coll  the collection to decorate, must not be null\n     * @return an unmodifiable collection\n     * @throws NullPointerException if collection is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableCollection.UnmodifiableCollection(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param coll  the collection to decorate, must not be null\n     * @throws NullPointerException if collection is null\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableCollection.iterator()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableCollection.add(E)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableCollection.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableCollection.clear()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableCollection.remove(java.lang.Object)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableCollection.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.UnmodifiableCollection.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 50)"
      ]
    }
  ]
}