{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/collection/CompositeCollection.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeCollection",
      "is_interface": false,
      "parent_types": [
        "java.util.Collection\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 480,
      "comment": "\n * Decorates a collection of other collections to provide a single unified view.\n * \u003cp\u003e\n * Changes made to this collection will actually be made on the decorated collection.\n * Add and remove operations require the use of a pluggable strategy. If no\n * strategy is provided then add and remove are unsupported.\n *\n * @param \u003cE\u003e the type of the elements in the collection\n * @since 3.0\n * @version $Id$\n "
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
      "type": "field",
      "varNames": [
        "mutator"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " CollectionMutator to handle changes to the collection "
    },
    {
      "type": "field",
      "varNames": [
        "all"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Collections in the composite "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.CompositeCollection()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Create an empty CompositeCollection.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.CompositeCollection(java.util.Collection\u003cE\u003e)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Create a Composite Collection with one collection.\n     *\n     * @param compositeCollection  the Collection to be appended to the composite\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)",
        "(line 67,col 9)-(line 67,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.CompositeCollection(java.util.Collection\u003cE\u003e, java.util.Collection\u003cE\u003e)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "\n     * Create a Composite Collection with two collections.\n     *\n     * @param compositeCollection1  the Collection to be appended to the composite\n     * @param compositeCollection2  the Collection to be appended to the composite\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 16)",
        "(line 79,col 9)-(line 79,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.CompositeCollection(java.util.Collection\u003cE\u003e...)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * Create a Composite Collection with an array of collections.\n     *\n     * @param compositeCollections  the collections to composite\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 16)",
        "(line 89,col 9)-(line 89,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.size()",
      "begin_line": 100,
      "end_line": 107,
      "comment": "\n     * Gets the size of this composite collection.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003esize()\u003c/code\u003e on each collection.\n     *\n     * @return total number of elements in all contained containers\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 21)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.isEmpty()",
      "begin_line": 116,
      "end_line": 124,
      "comment": "\n     * Checks whether this composite collection is empty.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003eisEmpty()\u003c/code\u003e on each collection.\n     *\n     * @return true if all of the contained collections are empty\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.contains(java.lang.Object)",
      "begin_line": 134,
      "end_line": 142,
      "comment": "\n     * Checks whether this composite collection contains the object.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003econtains()\u003c/code\u003e on each collection.\n     *\n     * @param obj  the object to search for\n     * @return true if obj is contained in any of the contained collections\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.iterator()",
      "begin_line": 154,
      "end_line": 164,
      "comment": "\n     * Gets an iterator over all the collections in this composite.\n     * \u003cp\u003e\n     * This implementation uses an \u003ccode\u003eIteratorChain\u003c/code\u003e.\n     *\n     * @return an \u003ccode\u003eIteratorChain\u003c/code\u003e instance which supports\n     *  \u003ccode\u003eremove()\u003c/code\u003e. Iteration occurs over contained collections in\n     *  the order they were added, but this behavior should not be relied upon.\n     * @see IteratorChain\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 62)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.toArray()",
      "begin_line": 171,
      "end_line": 179,
      "comment": "\n     * Returns an array containing all of the elements in this composite.\n     *\n     * @return an object array of all the elements in the collection\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 51)",
        "(line 174,col 9)-(line 174,col 18)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.toArray(T[])",
      "begin_line": 189,
      "end_line": 210,
      "comment": "\n     * Returns an object array, populating the supplied array if possible.\n     * See \u003ccode\u003eCollection\u003c/code\u003e interface for full details.\n     *\n     * @param \u003cT\u003e  the type of the elements in the collection\n     * @param array  the array to use, populating if possible\n     * @return an array of all the elements in the collection\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 32)",
        "(line 193,col 9)-(line 193,col 31)",
        "(line 194,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 23)",
        "(line 201,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.add(E)",
      "begin_line": 224,
      "end_line": 231,
      "comment": "\n     * Adds an object to the collection, throwing UnsupportedOperationException\n     * unless a CollectionMutator strategy is specified.\n     *\n     * @param obj  the object to add\n     * @return {@code true} if the collection was modified\n     * @throws UnsupportedOperationException if CollectionMutator hasn\u0027t been set\n     * @throws UnsupportedOperationException if add is unsupported\n     * @throws ClassCastException if the object cannot be added due to its type\n     * @throws NullPointerException if the object cannot be added because its null\n     * @throws IllegalArgumentException if the object cannot be added\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 230,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.remove(java.lang.Object)",
      "begin_line": 244,
      "end_line": 251,
      "comment": "\n     * Removes an object from the collection, throwing UnsupportedOperationException\n     * unless a CollectionMutator strategy is specified.\n     *\n     * @param obj  the object being removed\n     * @return true if the collection is changed\n     * @throws UnsupportedOperationException if removed is unsupported\n     * @throws ClassCastException if the object cannot be removed due to its type\n     * @throws NullPointerException if the object cannot be removed because its null\n     * @throws IllegalArgumentException if the object cannot be removed\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 262,
      "end_line": 270,
      "comment": "\n     * Checks whether this composite contains all the elements in the specified collection.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003econtains()\u003c/code\u003e for each element in the\n     * specified collection.\n     *\n     * @param coll  the collection to check for\n     * @return true if all elements contained\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 268,col 9)",
        "(line 269,col 9)-(line 269,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 284,
      "end_line": 291,
      "comment": "\n     * Adds a collection of elements to this collection, throwing\n     * UnsupportedOperationException unless a CollectionMutator strategy is specified.\n     *\n     * @param coll  the collection to add\n     * @return true if the collection was modified\n     * @throws UnsupportedOperationException if CollectionMutator hasn\u0027t been set\n     * @throws UnsupportedOperationException if add is unsupported\n     * @throws ClassCastException if the object cannot be added due to its type\n     * @throws NullPointerException if the object cannot be added because its null\n     * @throws IllegalArgumentException if the object cannot be added\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 302,
      "end_line": 312,
      "comment": "\n     * Removes the elements in the specified collection from this composite collection.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003eremoveAll\u003c/code\u003e on each collection.\n     *\n     * @param coll  the collection to remove\n     * @return true if the collection was modified\n     * @throws UnsupportedOperationException if removeAll is unsupported\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 32)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 324,
      "end_line": 331,
      "comment": "\n     * Retains all the elements in the specified collection in this composite collection,\n     * removing all others.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003eretainAll()\u003c/code\u003e on each collection.\n     *\n     * @param coll  the collection to remove\n     * @return true if the collection was modified\n     * @throws UnsupportedOperationException if retainAll is unsupported\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 32)",
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.clear()",
      "begin_line": 340,
      "end_line": 345,
      "comment": "\n     * Removes all of the elements from this collection .\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003eclear()\u003c/code\u003e on each collection.\n     *\n     * @throws UnsupportedOperationException if clear is unsupported\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.setMutator(org.apache.commons.collections4.collection.CompositeCollection.CollectionMutator\u003cE\u003e)",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * Specify a CollectionMutator strategy instance to handle changes.\n     *\n     * @param mutator  the mutator to use\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.addComposited(java.util.Collection\u003cE\u003e)",
      "begin_line": 362,
      "end_line": 364,
      "comment": "\n     * Add these Collections to the list of collections in this composite\n     *\n     * @param compositeCollection  the Collection to be appended to the composite\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.addComposited(java.util.Collection\u003cE\u003e, java.util.Collection\u003cE\u003e)",
      "begin_line": 372,
      "end_line": 376,
      "comment": "\n     * Add these Collections to the list of collections in this composite\n     *\n     * @param compositeCollection1  the Collection to be appended to the composite\n     * @param compositeCollection2  the Collection to be appended to the composite\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 38)",
        "(line 375,col 9)-(line 375,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.addComposited(java.util.Collection\u003cE\u003e...)",
      "begin_line": 383,
      "end_line": 385,
      "comment": "\n     * Add these Collections to the list of collections in this composite\n     *\n     * @param compositeCollections  the Collections to be appended to the composite\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.removeComposited(java.util.Collection\u003cE\u003e)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * Removes a collection from the those being decorated in this composite.\n     *\n     * @param coll  collection to be removed\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.toCollection()",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * Returns a new collection containing all of the elements\n     *\n     * @return A new ArrayList containing all of the elements in this composite.\n     *         The new collection is \u003ci\u003enot\u003c/i\u003e backed by this composite.\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.getCollections()",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * Gets the collections being decorated.\n     *\n     * @return Unmodifiable list of all collections in this composite.\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.getMutator()",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Get the collection mutator to be used for this CompositeCollection.\n     * @return CollectionMutator\u003cE\u003e\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CollectionMutator",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 430,
      "end_line": 478,
      "comment": "\n     * Pluggable strategy to handle changes to the composite.\n     *\n     * @param \u003cE\u003e the element being held in the collection\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.CollectionMutator.add(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, E)",
      "begin_line": 444,
      "end_line": 444,
      "comment": "\n         * Called when an object is to be added to the composite.\n         *\n         * @param composite  the CompositeCollection being changed\n         * @param collections  all of the Collection instances in this CompositeCollection\n         * @param obj  the object being added\n         * @return true if the collection is changed\n         * @throws UnsupportedOperationException if add is unsupported\n         * @throws ClassCastException if the object cannot be added due to its type\n         * @throws NullPointerException if the object cannot be added because its null\n         * @throws IllegalArgumentException if the object cannot be added\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.CollectionMutator.addAll(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 458,
      "end_line": 460,
      "comment": "\n         * Called when a collection is to be added to the composite.\n         *\n         * @param composite  the CompositeCollection being changed\n         * @param collections  all of the Collection instances in this CompositeCollection\n         * @param coll  the collection being added\n         * @return true if the collection is changed\n         * @throws UnsupportedOperationException if add is unsupported\n         * @throws ClassCastException if the object cannot be added due to its type\n         * @throws NullPointerException if the object cannot be added because its null\n         * @throws IllegalArgumentException if the object cannot be added\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.CollectionMutator.remove(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.lang.Object)",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n         * Called when an object is to be removed to the composite.\n         *\n         * @param composite  the CompositeCollection being changed\n         * @param collections  all of the Collection instances in this CompositeCollection\n         * @param obj  the object being removed\n         * @return true if the collection is changed\n         * @throws UnsupportedOperationException if removed is unsupported\n         * @throws ClassCastException if the object cannot be removed due to its type\n         * @throws NullPointerException if the object cannot be removed because its null\n         * @throws IllegalArgumentException if the object cannot be removed\n         ",
      "child_ranges": []
    }
  ]
}