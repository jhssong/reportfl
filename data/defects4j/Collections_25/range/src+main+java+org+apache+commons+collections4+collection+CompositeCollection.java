{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/collection/CompositeCollection.java",
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
      "end_line": 467,
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
      "end_line": 106,
      "comment": "\n     * Gets the size of this composite collection.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003esize()\u003c/code\u003e on each collection.\n     *\n     * @return total number of elements in all contained containers\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 21)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.isEmpty()",
      "begin_line": 115,
      "end_line": 122,
      "comment": "\n     * Checks whether this composite collection is empty.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003eisEmpty()\u003c/code\u003e on each collection.\n     *\n     * @return true if all of the contained collections are empty\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.contains(java.lang.Object)",
      "begin_line": 132,
      "end_line": 139,
      "comment": "\n     * Checks whether this composite collection contains the object.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003econtains()\u003c/code\u003e on each collection.\n     *\n     * @param obj  the object to search for\n     * @return true if obj is contained in any of the contained collections\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.iterator()",
      "begin_line": 151,
      "end_line": 160,
      "comment": "\n     * Gets an iterator over all the collections in this composite.\n     * \u003cp\u003e\n     * This implementation uses an \u003ccode\u003eIteratorChain\u003c/code\u003e.\n     *\n     * @return an \u003ccode\u003eIteratorChain\u003c/code\u003e instance which supports\n     *  \u003ccode\u003eremove()\u003c/code\u003e. Iteration occurs over contained collections in\n     *  the order they were added, but this behavior should not be relied upon.\n     * @see IteratorChain\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 62)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.toArray()",
      "begin_line": 167,
      "end_line": 174,
      "comment": "\n     * Returns an array containing all of the elements in this composite.\n     *\n     * @return an object array of all the elements in the collection\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 51)",
        "(line 169,col 9)-(line 169,col 18)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.toArray(T[])",
      "begin_line": 184,
      "end_line": 204,
      "comment": "\n     * Returns an object array, populating the supplied array if possible.\n     * See \u003ccode\u003eCollection\u003c/code\u003e interface for full details.\n     *\n     * @param \u003cT\u003e  the type of the elements in the collection\n     * @param array  the array to use, populating if possible\n     * @return an array of all the elements in the collection\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 32)",
        "(line 187,col 9)-(line 187,col 31)",
        "(line 188,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 23)",
        "(line 195,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.add(E)",
      "begin_line": 218,
      "end_line": 224,
      "comment": "\n     * Adds an object to the collection, throwing UnsupportedOperationException\n     * unless a CollectionMutator strategy is specified.\n     *\n     * @param obj  the object to add\n     * @return {@code true} if the collection was modified\n     * @throws UnsupportedOperationException if CollectionMutator hasn\u0027t been set\n     * @throws UnsupportedOperationException if add is unsupported\n     * @throws ClassCastException if the object cannot be added due to its type\n     * @throws NullPointerException if the object cannot be added because its null\n     * @throws IllegalArgumentException if the object cannot be added\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.remove(java.lang.Object)",
      "begin_line": 237,
      "end_line": 243,
      "comment": "\n     * Removes an object from the collection, throwing UnsupportedOperationException\n     * unless a CollectionMutator strategy is specified.\n     *\n     * @param obj  the object being removed\n     * @return true if the collection is changed\n     * @throws UnsupportedOperationException if removed is unsupported\n     * @throws ClassCastException if the object cannot be removed due to its type\n     * @throws NullPointerException if the object cannot be removed because its null\n     * @throws IllegalArgumentException if the object cannot be removed\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 242,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 254,
      "end_line": 261,
      "comment": "\n     * Checks whether this composite contains all the elements in the specified collection.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003econtains()\u003c/code\u003e for each element in the\n     * specified collection.\n     *\n     * @param coll  the collection to check for\n     * @return true if all elements contained\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 275,
      "end_line": 281,
      "comment": "\n     * Adds a collection of elements to this collection, throwing\n     * UnsupportedOperationException unless a CollectionMutator strategy is specified.\n     *\n     * @param coll  the collection to add\n     * @return true if the collection was modified\n     * @throws UnsupportedOperationException if CollectionMutator hasn\u0027t been set\n     * @throws UnsupportedOperationException if add is unsupported\n     * @throws ClassCastException if the object cannot be added due to its type\n     * @throws NullPointerException if the object cannot be added because its null\n     * @throws IllegalArgumentException if the object cannot be added\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 292,
      "end_line": 301,
      "comment": "\n     * Removes the elements in the specified collection from this composite collection.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003eremoveAll\u003c/code\u003e on each collection.\n     *\n     * @param coll  the collection to remove\n     * @return true if the collection was modified\n     * @throws UnsupportedOperationException if removeAll is unsupported\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 32)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 313,
      "end_line": 319,
      "comment": "\n     * Retains all the elements in the specified collection in this composite collection,\n     * removing all others.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003eretainAll()\u003c/code\u003e on each collection.\n     *\n     * @param coll  the collection to remove\n     * @return true if the collection was modified\n     * @throws UnsupportedOperationException if retainAll is unsupported\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 32)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.clear()",
      "begin_line": 328,
      "end_line": 332,
      "comment": "\n     * Removes all of the elements from this collection .\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003eclear()\u003c/code\u003e on each collection.\n     *\n     * @throws UnsupportedOperationException if clear is unsupported\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.setMutator(org.apache.commons.collections4.collection.CompositeCollection.CollectionMutator\u003cE\u003e)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * Specify a CollectionMutator strategy instance to handle changes.\n     *\n     * @param mutator  the mutator to use\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.addComposited(java.util.Collection\u003cE\u003e)",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * Add these Collections to the list of collections in this composite\n     *\n     * @param compositeCollection  the Collection to be appended to the composite\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.addComposited(java.util.Collection\u003cE\u003e, java.util.Collection\u003cE\u003e)",
      "begin_line": 359,
      "end_line": 363,
      "comment": "\n     * Add these Collections to the list of collections in this composite\n     *\n     * @param compositeCollection1  the Collection to be appended to the composite\n     * @param compositeCollection2  the Collection to be appended to the composite\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 38)",
        "(line 362,col 9)-(line 362,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.addComposited(java.util.Collection\u003cE\u003e...)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n     * Add these Collections to the list of collections in this composite\n     *\n     * @param compositeCollections  the Collections to be appended to the composite\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.removeComposited(java.util.Collection\u003cE\u003e)",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n     * Removes a collection from the those being decorated in this composite.\n     *\n     * @param coll  collection to be removed\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.toCollection()",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\n     * Returns a new collection containing all of the elements\n     *\n     * @return A new ArrayList containing all of the elements in this composite.\n     *         The new collection is \u003ci\u003enot\u003c/i\u003e backed by this composite.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.getCollections()",
      "begin_line": 399,
      "end_line": 401,
      "comment": "\n     * Gets the collections being decorated.\n     *\n     * @return Unmodifiable list of all collections in this composite.\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.getMutator()",
      "begin_line": 407,
      "end_line": 409,
      "comment": "\n     * Get the collection mutator to be used for this CompositeCollection.\n     * @return CollectionMutator\u003cE\u003e\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CollectionMutator",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 417,
      "end_line": 465,
      "comment": "\n     * Pluggable strategy to handle changes to the composite.\n     *\n     * @param \u003cE\u003e the element being held in the collection\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.CollectionMutator.add(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, E)",
      "begin_line": 431,
      "end_line": 431,
      "comment": "\n         * Called when an object is to be added to the composite.\n         *\n         * @param composite  the CompositeCollection being changed\n         * @param collections  all of the Collection instances in this CompositeCollection\n         * @param obj  the object being added\n         * @return true if the collection is changed\n         * @throws UnsupportedOperationException if add is unsupported\n         * @throws ClassCastException if the object cannot be added due to its type\n         * @throws NullPointerException if the object cannot be added because its null\n         * @throws IllegalArgumentException if the object cannot be added\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.CollectionMutator.addAll(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\n         * Called when a collection is to be added to the composite.\n         *\n         * @param composite  the CompositeCollection being changed\n         * @param collections  all of the Collection instances in this CompositeCollection\n         * @param coll  the collection being added\n         * @return true if the collection is changed\n         * @throws UnsupportedOperationException if add is unsupported\n         * @throws ClassCastException if the object cannot be added due to its type\n         * @throws NullPointerException if the object cannot be added because its null\n         * @throws IllegalArgumentException if the object cannot be added\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.collection.CompositeCollection.CollectionMutator.remove(org.apache.commons.collections4.collection.CompositeCollection\u003cE\u003e, java.util.List\u003cjava.util.Collection\u003cE\u003e\u003e, java.lang.Object)",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\n         * Called when an object is to be removed to the composite.\n         *\n         * @param composite  the CompositeCollection being changed\n         * @param collections  all of the Collection instances in this CompositeCollection\n         * @param obj  the object being removed\n         * @return true if the collection is changed\n         * @throws UnsupportedOperationException if removed is unsupported\n         * @throws ClassCastException if the object cannot be removed due to its type\n         * @throws NullPointerException if the object cannot be removed because its null\n         * @throws IllegalArgumentException if the object cannot be removed\n         ",
      "child_ranges": []
    }
  ]
}