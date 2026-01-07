{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/collection/IndexedCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IndexedCollection",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cC\u003e"
      ],
      "begin_line": 44,
      "end_line": 260,
      "comment": "\n * An IndexedCollection is a Map-like view onto a Collection. It accepts a\n * keyTransformer to define how the keys are converted from the values.\n * \u003cp\u003e\n * Modifications made to this decorator modify the index as well as the\n * decorated {@link Collection}. However, modifications to the underlying\n * {@link Collection} will not update the index and it will get out of sync.\n * \u003cp\u003e\n * If modification of the decorated {@link Collection} is unavoidable, then a\n * call to {@link #reindex()} will update the index to the current contents of\n * the {@link Collection}.\n *\n * @param \u003cK\u003e the type of object in the index.\n * @param \u003cC\u003e the type of object in the collection.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "keyTransformer"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " The {@link Transformer} for generating index keys. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The map of indexes to collected objects. "
    },
    {
      "type": "field",
      "varNames": [
        "uniqueIndex"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " The uniqueness constraint for the index. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.uniqueIndexedCollection(java.util.Collection\u003cC\u003e, org.apache.commons.collections4.Transformer\u003cC, K\u003e)",
      "begin_line": 72,
      "end_line": 77,
      "comment": "\n     * Create an {@link IndexedCollection} for a unique index.\n     * \u003cp\u003e\n     * If an element is added, which maps to an existing key, an {@link IllegalArgumentException}\n     * will be thrown.\n     *\n     * @param \u003cK\u003e the index object type.\n     * @param \u003cC\u003e the collection type.\n     * @param coll the decorated {@link Collection}.\n     * @param keyTransformer the {@link Transformer} for generating index keys.\n     * @return the created {@link IndexedCollection}.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.nonUniqueIndexedCollection(java.util.Collection\u003cC\u003e, org.apache.commons.collections4.Transformer\u003cC, K\u003e)",
      "begin_line": 88,
      "end_line": 93,
      "comment": "\n     * Create an {@link IndexedCollection} for a non-unique index.\n     *\n     * @param \u003cK\u003e the index object type.\n     * @param \u003cC\u003e the collection type.\n     * @param coll the decorated {@link Collection}.\n     * @param keyTransformer the {@link Transformer} for generating index keys.\n     * @return the created {@link IndexedCollection}.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.IndexedCollection(java.util.Collection\u003cC\u003e, org.apache.commons.collections4.Transformer\u003cC, K\u003e, org.apache.commons.collections4.MultiMap\u003cK, C\u003e, boolean)",
      "begin_line": 103,
      "end_line": 110,
      "comment": "\n     * Create a {@link IndexedCollection}.\n     *\n     * @param coll  decorated {@link Collection}\n     * @param keyTransformer  {@link Transformer} for generating index keys\n     * @param map  map to use as index\n     * @param uniqueIndex  if the index shall enforce uniqueness of index keys\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 20)",
        "(line 106,col 9)-(line 106,col 45)",
        "(line 107,col 9)-(line 107,col 25)",
        "(line 108,col 9)-(line 108,col 39)",
        "(line 109,col 9)-(line 109,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.add(C)",
      "begin_line": 118,
      "end_line": 125,
      "comment": "\n     * {@inheritDoc}\n     *\n     * @throws IllegalArgumentException if the object maps to an existing key and the index\n     *   enforces a uniqueness constraint\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 48)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.addAll(java.util.Collection\u003c? extends C\u003e)",
      "begin_line": 127,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 32)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.clear()",
      "begin_line": 136,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 22)",
        "(line 139,col 9)-(line 139,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.contains(java.lang.Object)",
      "begin_line": 147,
      "end_line": 151,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * Note: uses the index for fast lookup\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 158,
      "end_line": 166,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * Note: uses the index for fast lookup\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.get(K)",
      "begin_line": 179,
      "end_line": 183,
      "comment": "\n     * Get the element associated with the given key.\n     * \u003cp\u003e\n     * In case of a non-unique index, this method will return the first\n     * value associated with the given key. To retrieve all elements associated\n     * with a key, use {@link #values(Object)}.\n     *\n     * @param key  key to look up\n     * @return element found\n     * @see #values(Object)\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 181,col 66)",
        "(line 182,col 9)-(line 182,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.values(K)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Get all elements associated with the given key.\n     *\n     * @param key  key to look up\n     * @return a collection of elements found, or null if {@code contains(key) \u003d\u003d false}\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.reindex()",
      "begin_line": 199,
      "end_line": 204,
      "comment": "\n     * Clears the index and re-indexes the entire decorated {@link Collection}.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 22)",
        "(line 201,col 9)-(line 203,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.remove(java.lang.Object)",
      "begin_line": 206,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 53)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 213,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 216,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 32)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 225,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 54)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.addToIndex(C)",
      "begin_line": 243,
      "end_line": 249,
      "comment": "\n     * Provides checking for adding the index.\n     *\n     * @param object the object to index\n     * @throws IllegalArgumentException if the object maps to an existing key and the index\n     *   enforces a uniqueness constraint\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 55)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.IndexedCollection.removeFromIndex(C)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Removes an object from the index.\n     *\n     * @param object the object to remove\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 55)"
      ]
    }
  ]
}