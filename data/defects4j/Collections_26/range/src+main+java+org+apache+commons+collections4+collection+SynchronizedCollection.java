{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/collection/SynchronizedCollection.java",
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
      "end_line": 232,
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
      "comment": "\n     * Factory method to create a synchronized collection.\n     *\n     * @param \u003cT\u003e the type of the elements in the collection\n     * @param coll  the collection to decorate, must not be null\n     * @return a new synchronized collection\n     * @throws NullPointerException if collection is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.SynchronizedCollection(java.util.Collection\u003cE\u003e)",
      "begin_line": 71,
      "end_line": 77,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param collection  the collection to decorate, must not be null\n     * @throws NullPointerException if the collection is null\n     ",
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
      "end_line": 95,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param collection  the collection to decorate, must not be null\n     * @param lock  the lock object to use, must not be null\n     * @throws NullPointerException if the collection or lock is null\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 37)",
        "(line 94,col 9)-(line 94,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.decorated()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Gets the collection being decorated.\n     *\n     * @return the decorated collection\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.add(E)",
      "begin_line": 108,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.clear()",
      "begin_line": 122,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.contains(java.lang.Object)",
      "begin_line": 129,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 136,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.isEmpty()",
      "begin_line": 143,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.iterator()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "\n     * Iterators must be manually synchronized.\n     * \u003cpre\u003e\n     * synchronized (coll) {\n     *   Iterator it \u003d coll.iterator();\n     *   // do stuff with iterator\n     * }\n     * \u003c/pre\u003e\n     *\n     * @return an iterator that must be manually synchronized on the collection\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.toArray()",
      "begin_line": 166,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.toArray(T[])",
      "begin_line": 173,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.remove(java.lang.Object)",
      "begin_line": 180,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 187,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 194,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.size()",
      "begin_line": 201,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.equals(java.lang.Object)",
      "begin_line": 208,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.hashCode()",
      "begin_line": 218,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.SynchronizedCollection.toString()",
      "begin_line": 225,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 229,col 9)"
      ]
    }
  ]
}