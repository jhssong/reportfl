{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/set/CompositeSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompositeSet",
      "is_interface": false,
      "parent_types": [
        "java.util.Set\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 511,
      "comment": "\n * Decorates a set of other sets to provide a single unified view.\n * \u003cp\u003e\n * Changes made to this set will actually be made on the decorated set.\n * Add operations require the use of a pluggable strategy.\n * If no strategy is provided then add is unsupported.\n * \u003cp\u003e\n * From version 4.0, this class does not extend\n * {@link org.apache.commons.collections4.collection.CompositeCollection CompositeCollection}\n * anymore due to its input restrictions (only accepts Sets).\n * See \u003ca href\u003d\"https://issues.apache.org/jira/browse/COLLECTIONS-424\"\u003eCOLLECTIONS-424\u003c/a\u003e\n * for more details.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "mutator"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " SetMutator to handle changes to the collection "
    },
    {
      "type": "field",
      "varNames": [
        "all"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Sets in the composite "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.CompositeSet.CompositeSet()",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Create an empty CompositeSet.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.CompositeSet.CompositeSet(java.util.Set\u003cE\u003e)",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Create a CompositeSet with just \u003ccode\u003eset\u003c/code\u003e composited.\n     *\n     * @param set  the initial set in the composite\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 16)",
        "(line 74,col 9)-(line 74,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.CompositeSet.CompositeSet(java.util.Set\u003cE\u003e...)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Create a composite set with sets as the initial set of composited Sets.\n     *\n     * @param sets  the initial sets in the composite\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 16)",
        "(line 84,col 9)-(line 84,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.size()",
      "begin_line": 95,
      "end_line": 102,
      "comment": "\n     * Gets the size of this composite set.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003esize()\u003c/code\u003e on each set.\n     *\n     * @return total number of elements in all contained containers\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 21)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.isEmpty()",
      "begin_line": 111,
      "end_line": 119,
      "comment": "\n     * Checks whether this composite set is empty.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003eisEmpty()\u003c/code\u003e on each set.\n     *\n     * @return true if all of the contained sets are empty\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.contains(java.lang.Object)",
      "begin_line": 129,
      "end_line": 137,
      "comment": "\n     * Checks whether this composite set contains the object.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003econtains()\u003c/code\u003e on each set.\n     *\n     * @param obj  the object to search for\n     * @return true if obj is contained in any of the contained sets\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.iterator()",
      "begin_line": 149,
      "end_line": 159,
      "comment": "\n     * Gets an iterator over all the sets in this composite.\n     * \u003cp\u003e\n     * This implementation uses an \u003ccode\u003eIteratorChain\u003c/code\u003e.\n     *\n     * @return an \u003ccode\u003eIteratorChain\u003c/code\u003e instance which supports\n     *  \u003ccode\u003eremove()\u003c/code\u003e. Iteration occurs over contained collections in\n     *  the order they were added, but this behavior should not be relied upon.\n     * @see IteratorChain\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 62)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.toArray()",
      "begin_line": 166,
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
      "signature": "org.apache.commons.collections4.set.CompositeSet.toArray(T[])",
      "begin_line": 184,
      "end_line": 205,
      "comment": "\n     * Returns an object array, populating the supplied array if possible.\n     * See \u003ccode\u003eCollection\u003c/code\u003e interface for full details.\n     *\n     * @param \u003cT\u003e  the type of the elements in the collection\n     * @param array  the array to use, populating if possible\n     * @return an array of all the elements in the collection\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 32)",
        "(line 188,col 9)-(line 188,col 31)",
        "(line 189,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 23)",
        "(line 196,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.add(E)",
      "begin_line": 218,
      "end_line": 225,
      "comment": "\n     * Adds an object to the collection, throwing UnsupportedOperationException\n     * unless a SetMutator strategy is specified.\n     *\n     * @param obj  the object to add\n     * @return {@code true} if the collection was modified\n     * @throws UnsupportedOperationException if SetMutator hasn\u0027t been set or add is unsupported\n     * @throws ClassCastException if the object cannot be added due to its type\n     * @throws NullPointerException if the object cannot be added because its null\n     * @throws IllegalArgumentException if the object cannot be added\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.remove(java.lang.Object)",
      "begin_line": 234,
      "end_line": 242,
      "comment": "\n     * If a \u003ccode\u003eCollectionMutator\u003c/code\u003e is defined for this CompositeSet then this\n     * method will be called anyway.\n     *\n     * @param obj  object to be removed\n     * @return true if the object is removed, false otherwise\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.containsAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 253,
      "end_line": 261,
      "comment": "\n     * Checks whether this composite contains all the elements in the specified collection.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003econtains()\u003c/code\u003e for each element in the\n     * specified collection.\n     *\n     * @param coll  the collection to check for\n     * @return true if all elements contained\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 274,
      "end_line": 281,
      "comment": "\n     * Adds a collection of elements to this composite, throwing\n     * UnsupportedOperationException unless a SetMutator strategy is specified.\n     *\n     * @param coll  the collection to add\n     * @return true if the composite was modified\n     * @throws UnsupportedOperationException if SetMutator hasn\u0027t been set or add is unsupported\n     * @throws ClassCastException if the object cannot be added due to its type\n     * @throws NullPointerException if the object cannot be added because its null\n     * @throws IllegalArgumentException if the object cannot be added\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 280,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 292,
      "end_line": 302,
      "comment": "\n     * Removes the elements in the specified collection from this composite set.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003eremoveAll\u003c/code\u003e on each collection.\n     *\n     * @param coll  the collection to remove\n     * @return true if the composite was modified\n     * @throws UnsupportedOperationException if removeAll is unsupported\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 32)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 314,
      "end_line": 321,
      "comment": "\n     * Retains all the elements in the specified collection in this composite set,\n     * removing all others.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003eretainAll()\u003c/code\u003e on each collection.\n     *\n     * @param coll  the collection to remove\n     * @return true if the composite was modified\n     * @throws UnsupportedOperationException if retainAll is unsupported\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 32)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.clear()",
      "begin_line": 330,
      "end_line": 335,
      "comment": "\n     * Removes all of the elements from this composite set.\n     * \u003cp\u003e\n     * This implementation calls \u003ccode\u003eclear()\u003c/code\u003e on each set.\n     *\n     * @throws UnsupportedOperationException if clear is unsupported\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.setMutator(org.apache.commons.collections4.set.CompositeSet.SetMutator\u003cE\u003e)",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Specify a SetMutator strategy instance to handle changes.\n     *\n     * @param mutator  the mutator to use\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.addComposited(java.util.Set\u003cE\u003e)",
      "begin_line": 356,
      "end_line": 372,
      "comment": "\n     * Add a Set to this composite.\n     *\n     * @param set  the set to add\n     * @throws IllegalArgumentException if a SetMutator is set, but fails to resolve a collision\n     * @throws UnsupportedOperationException if there is no SetMutator set\n     * @throws NullPointerException if {@code set} is null\n     * @see SetMutator\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.addComposited(java.util.Set\u003cE\u003e, java.util.Set\u003cE\u003e)",
      "begin_line": 380,
      "end_line": 383,
      "comment": "\n     * Add these Sets to the list of sets in this composite.\n     *\n     * @param set1  the first Set to be appended to the composite\n     * @param set2  the second Set to be appended to the composite\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 28)",
        "(line 382,col 9)-(line 382,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.addComposited(java.util.Set\u003cE\u003e...)",
      "begin_line": 390,
      "end_line": 394,
      "comment": "\n     * Add these Sets to the list of sets in this composite\n     *\n     * @param sets  the Sets to be appended to the composite\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.removeComposited(java.util.Set\u003cE\u003e)",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * Removes a set from those being decorated in this composite.\n     *\n     * @param set  set to be removed\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.toSet()",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * Returns a new Set containing all of the elements.\n     *\n     * @return A new HashSet containing all of the elements in this composite.\n     *   The new collection is \u003ci\u003enot\u003c/i\u003e backed by this composite.\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.getSets()",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\n     * Gets the sets being decorated.\n     *\n     * @return Unmodifiable list of all sets in this composite.\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.getMutator()",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * Get the set mutator to be used for this CompositeSet.\n     * @return the set mutator\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.equals(java.lang.Object)",
      "begin_line": 437,
      "end_line": 444,
      "comment": "\n     * {@inheritDoc}\n     * @see java.util.Set#equals\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 442,col 9)",
        "(line 443,col 9)-(line 443,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.hashCode()",
      "begin_line": 450,
      "end_line": 457,
      "comment": "\n     * {@inheritDoc}\n     * @see java.util.Set#hashCode\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 21)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SetMutator",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 462,
      "end_line": 510,
      "comment": "\n     * Define callbacks for mutation operations.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.SetMutator.add(org.apache.commons.collections4.set.CompositeSet\u003cE\u003e, java.util.List\u003cjava.util.Set\u003cE\u003e\u003e, E)",
      "begin_line": 476,
      "end_line": 476,
      "comment": "\n         * Called when an object is to be added to the composite.\n         *\n         * @param composite  the CompositeSet being changed\n         * @param sets  all of the Set instances in this CompositeSet\n         * @param obj  the object being added\n         * @return true if the collection is changed\n         * @throws UnsupportedOperationException if add is unsupported\n         * @throws ClassCastException if the object cannot be added due to its type\n         * @throws NullPointerException if the object cannot be added because its null\n         * @throws IllegalArgumentException if the object cannot be added\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.SetMutator.addAll(org.apache.commons.collections4.set.CompositeSet\u003cE\u003e, java.util.List\u003cjava.util.Set\u003cE\u003e\u003e, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 490,
      "end_line": 492,
      "comment": "\n         * Called when a collection is to be added to the composite.\n         *\n         * @param composite  the CompositeSet being changed\n         * @param sets  all of the Set instances in this CompositeSet\n         * @param coll  the collection being added\n         * @return true if the collection is changed\n         * @throws UnsupportedOperationException if add is unsupported\n         * @throws ClassCastException if the object cannot be added due to its type\n         * @throws NullPointerException if the object cannot be added because its null\n         * @throws IllegalArgumentException if the object cannot be added\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.CompositeSet.SetMutator.resolveCollision(org.apache.commons.collections4.set.CompositeSet\u003cE\u003e, java.util.Set\u003cE\u003e, java.util.Set\u003cE\u003e, java.util.Collection\u003cE\u003e)",
      "begin_line": 506,
      "end_line": 509,
      "comment": "\n         * Called when a Set is added to the CompositeSet and there is a\n         * collision between existing and added sets.\n         * \u003cp\u003e\n         * If \u003ccode\u003eadded\u003c/code\u003e and \u003ccode\u003eexisting\u003c/code\u003e still have any intersects\n         * after this method returns an IllegalArgumentException will be thrown.\n         *\n         * @param comp  the CompositeSet being modified\n         * @param existing  the Set already existing in the composite\n         * @param added  the Set being added to the composite\n         * @param intersects  the intersection of the existing and added sets\n         ",
      "child_ranges": []
    }
  ]
}