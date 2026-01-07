{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/collection/SynchronizedCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedCollection",
      "is_interface": false,
      "parent_types": [
        "java.util.Collection\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 216,
      "comment": "\n * Decorates another {@link Collection} to synchronize its behaviour\n * for a multi-threaded environment.\n * \u003cp\u003e\n * Iterators must be manually synchronized:\n * \u003cpre\u003e\n * synchronized (coll) {\n *   Iterator it \u003d coll.iterator();\n *   // do stuff with iterator\n * }\n * \u003c/pre\u003e\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @param \u003cE\u003e the type of the elements in the collection\n * @since 3.0\n * @version $Id$\n "
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
      "type": "field",
      "varNames": [
        "collection"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The collection to decorate "
    },
    {
      "type": "field",
      "varNames": [
        "lock"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The object to lock on, needed for List/SortedSet views "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.synchronizedCollection(java.util.Collection\u003cT\u003e)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Factory method to create a synchronized collection.\n     *\n     * @param \u003cT\u003e the type of the elements in the collection\n     * @param coll  the collection to decorate, must not be null\n     * @return a new synchronized collection\n     * @throws IllegalArgumentException if collection is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.SynchronizedCollection(java.util.Collection\u003cE\u003e)",
      "begin_line": 71,
      "end_line": 77,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param collection  the collection to decorate, must not be null\n     * @throws IllegalArgumentException if the collection is null\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 37)",
        "(line 76,col 9)-(line 76,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.SynchronizedCollection(java.util.Collection\u003cE\u003e, java.lang.Object)",
      "begin_line": 86,
      "end_line": 92,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param collection  the collection to decorate, must not be null\n     * @param lock  the lock object to use, must not be null\n     * @throws IllegalArgumentException if the collection is null\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 37)",
        "(line 91,col 9)-(line 91,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.decorated()",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Gets the collection being decorated.\n     *\n     * @return the decorated collection\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.add(E)",
      "begin_line": 105,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 111,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.clear()",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.contains(java.lang.Object)",
      "begin_line": 123,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 129,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.isEmpty()",
      "begin_line": 135,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.iterator()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Iterators must be manually synchronized.\n     * \u003cpre\u003e\n     * synchronized (coll) {\n     *   Iterator it \u003d coll.iterator();\n     *   // do stuff with iterator\n     * }\n     * \u003c/pre\u003e\n     *\n     * @return an iterator that must be manually synchronized on the collection\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.toArray()",
      "begin_line": 156,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.toArray(T[])",
      "begin_line": 162,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.remove(java.lang.Object)",
      "begin_line": 168,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 174,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 180,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.size()",
      "begin_line": 186,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.equals(java.lang.Object)",
      "begin_line": 192,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.hashCode()",
      "begin_line": 202,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.toString()",
      "begin_line": 209,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)"
      ]
    }
  ]
}