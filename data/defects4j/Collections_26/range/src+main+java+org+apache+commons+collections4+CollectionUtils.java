{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/CollectionUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CollectionUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 1892,
      "comment": "\n * Provides utility methods and decorators for {@link Collection} instances.\n * \u003cp\u003e\n * Various utility methods might put the input objects into a Set/Map/Bag. In case\n * the input objects override {@link Object#equals(Object)}, it is mandatory that\n * the general contract of the {@link Object#hashCode()} method is maintained.\n * \u003cp\u003e\n * NOTE: From 4.0, method parameters will take {@link Iterable} objects when possible.\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "class_interface",
      "name": "CardinalityHelper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 122,
      "comment": "\n     * Helper class to easily access cardinality properties of two collections.\n     * @param \u003cO\u003e  the element type\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cardinalityA"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Contains the cardinality for each object in collection A. "
    },
    {
      "type": "field",
      "varNames": [
        "cardinalityB"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Contains the cardinality for each object in collection B. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.CollectionUtils.CardinalityHelper.CardinalityHelper(java.lang.Iterable\u003c? extends O\u003e, java.lang.Iterable\u003c? extends O\u003e)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n         * Create a new CardinalityHelper for two collections.\n         * @param a  the first collection\n         * @param b  the second collection\n         ",
      "child_ranges": [
        "(line 75,col 13)-(line 75,col 67)",
        "(line 76,col 13)-(line 76,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.CardinalityHelper.max(java.lang.Object)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n         * Returns the maximum frequency of an object.\n         * @param obj  the object\n         * @return the maximum frequency of the object\n         ",
      "child_ranges": [
        "(line 85,col 13)-(line 85,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.CardinalityHelper.min(java.lang.Object)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n         * Returns the minimum frequency of an object.\n         * @param obj  the object\n         * @return the minimum frequency of the object\n         ",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.CardinalityHelper.freqA(java.lang.Object)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n         * Returns the frequency of this object in collection A.\n         * @param obj  the object\n         * @return the frequency of the object in collection A\n         ",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.CardinalityHelper.freqB(java.lang.Object)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n         * Returns the frequency of this object in collection B.\n         * @param obj  the object\n         * @return the frequency of the object in collection B\n         ",
      "child_ranges": [
        "(line 112,col 13)-(line 112,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.CardinalityHelper.getFreq(java.lang.Object, java.util.Map\u003c?, java.lang.Integer\u003e)",
      "begin_line": 115,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 51)",
        "(line 117,col 13)-(line 119,col 13)",
        "(line 120,col 13)-(line 120,col 21)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SetOperationCardinalityHelper",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.CollectionUtils.CardinalityHelper\u003cO\u003e",
        "java.lang.Iterable\u003cO\u003e"
      ],
      "begin_line": 128,
      "end_line": 173,
      "comment": "\n     * Helper class for set-related operations, e.g. union, subtract, intersection.\n     * @param \u003cO\u003e  the element type\n     "
    },
    {
      "type": "field",
      "varNames": [
        "elements"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Contains the unique elements of the two collections. "
    },
    {
      "type": "field",
      "varNames": [
        "newList"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Output collection. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.CollectionUtils.SetOperationCardinalityHelper.SetOperationCardinalityHelper(java.lang.Iterable\u003c? extends O\u003e, java.lang.Iterable\u003c? extends O\u003e)",
      "begin_line": 141,
      "end_line": 148,
      "comment": "\n         * Create a new set operation helper from the two collections.\n         * @param a  the first collection\n         * @param b  the second collection\n         ",
      "child_ranges": [
        "(line 142,col 13)-(line 142,col 24)",
        "(line 143,col 13)-(line 143,col 40)",
        "(line 144,col 13)-(line 144,col 32)",
        "(line 145,col 13)-(line 145,col 32)",
        "(line 147,col 13)-(line 147,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.SetOperationCardinalityHelper.iterator()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 13)-(line 151,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.SetOperationCardinalityHelper.setCardinality(O, int)",
      "begin_line": 159,
      "end_line": 163,
      "comment": "\n         * Add the object {@code count} times to the result collection.\n         * @param obj  the object to add\n         * @param count  the count\n         ",
      "child_ranges": [
        "(line 160,col 13)-(line 162,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.SetOperationCardinalityHelper.list()",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n         * Returns the resulting collection.\n         * @return the result\n         ",
      "child_ranges": [
        "(line 170,col 13)-(line 170,col 27)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_COLLECTION"
      ],
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * An empty unmodifiable collection.\n     * The JDK provides empty Set and List implementations which could be used for\n     * this purpose. However they could be cast to Set or List which might be\n     * undesirable. This implementation only implements Collection.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.CollectionUtils.CollectionUtils()",
      "begin_line": 188,
      "end_line": 188,
      "comment": "\n     * \u003ccode\u003eCollectionUtils\u003c/code\u003e should not normally be instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.emptyCollection()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * Returns the immutable EMPTY_COLLECTION with generic type safety.\n     *\n     * @see #EMPTY_COLLECTION\n     * @since 4.0\n     * @param \u003cT\u003e the element type\n     * @return immutable empty collection\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.emptyIfNull(java.util.Collection\u003cT\u003e)",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * Returns an immutable empty collection if the argument is \u003ccode\u003enull\u003c/code\u003e,\n     * or the argument itself otherwise.\n     *\n     * @param \u003cT\u003e the element type\n     * @param collection the collection, possibly \u003ccode\u003enull\u003c/code\u003e\n     * @return an empty collection if the argument is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.union(java.lang.Iterable\u003c? extends O\u003e, java.lang.Iterable\u003c? extends O\u003e)",
      "begin_line": 231,
      "end_line": 237,
      "comment": "\n     * Returns a {@link Collection} containing the union of the given\n     * {@link Iterable}s.\n     * \u003cp\u003e\n     * The cardinality of each element in the returned {@link Collection} will\n     * be equal to the maximum of the cardinality of that element in the two\n     * given {@link Iterable}s.\n     *\n     * @param a the first collection, must not be null\n     * @param b the second collection, must not be null\n     * @param \u003cO\u003e the generic type that is able to represent the types contained\n     *        in both input collections.\n     * @return the union of the two collections\n     * @see Collection#addAll\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 99)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.intersection(java.lang.Iterable\u003c? extends O\u003e, java.lang.Iterable\u003c? extends O\u003e)",
      "begin_line": 255,
      "end_line": 261,
      "comment": "\n     * Returns a {@link Collection} containing the intersection of the given\n     * {@link Iterable}s.\n     * \u003cp\u003e\n     * The cardinality of each element in the returned {@link Collection} will\n     * be equal to the minimum of the cardinality of that element in the two\n     * given {@link Iterable}s.\n     *\n     * @param a the first collection, must not be null\n     * @param b the second collection, must not be null\n     * @param \u003cO\u003e the generic type that is able to represent the types contained\n     *        in both input collections.\n     * @return the intersection of the two collections\n     * @see Collection#retainAll\n     * @see #containsAny\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 99)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.disjunction(java.lang.Iterable\u003c? extends O\u003e, java.lang.Iterable\u003c? extends O\u003e)",
      "begin_line": 283,
      "end_line": 289,
      "comment": "\n     * Returns a {@link Collection} containing the exclusive disjunction\n     * (symmetric difference) of the given {@link Iterable}s.\n     * \u003cp\u003e\n     * The cardinality of each element \u003ci\u003ee\u003c/i\u003e in the returned\n     * {@link Collection} will be equal to\n     * \u003ctt\u003emax(cardinality(\u003ci\u003ee\u003c/i\u003e,\u003ci\u003ea\u003c/i\u003e),cardinality(\u003ci\u003ee\u003c/i\u003e,\u003ci\u003eb\u003c/i\u003e)) - min(cardinality(\u003ci\u003ee\u003c/i\u003e,\u003ci\u003ea\u003c/i\u003e),\n     * cardinality(\u003ci\u003ee\u003c/i\u003e,\u003ci\u003eb\u003c/i\u003e))\u003c/tt\u003e.\n     * \u003cp\u003e\n     * This is equivalent to\n     * {@code {@link #subtract subtract}({@link #union union(a,b)},{@link #intersection intersection(a,b)})}\n     * or\n     * {@code {@link #union union}({@link #subtract subtract(a,b)},{@link #subtract subtract(b,a)})}.\n\n     * @param a the first collection, must not be null\n     * @param b the second collection, must not be null\n     * @param \u003cO\u003e the generic type that is able to represent the types contained\n     *        in both input collections.\n     * @return the symmetric difference of the two collections\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 99)",
        "(line 285,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.subtract(java.lang.Iterable\u003c? extends O\u003e, java.lang.Iterable\u003c? extends O\u003e)",
      "begin_line": 304,
      "end_line": 307,
      "comment": "\n     * Returns a new {@link Collection} containing {@code \u003ci\u003ea\u003c/i\u003e - \u003ci\u003eb\u003c/i\u003e}.\n     * The cardinality of each element \u003ci\u003ee\u003c/i\u003e in the returned {@link Collection}\n     * will be the cardinality of \u003ci\u003ee\u003c/i\u003e in \u003ci\u003ea\u003c/i\u003e minus the cardinality\n     * of \u003ci\u003ee\u003c/i\u003e in \u003ci\u003eb\u003c/i\u003e, or zero, whichever is greater.\n     *\n     * @param a  the collection to subtract from, must not be null\n     * @param b  the collection to subtract, must not be null\n     * @param \u003cO\u003e the generic type that is able to represent the types contained\n     *        in both input collections.\n     * @return a new collection with the results\n     * @see Collection#removeAll\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 61)",
        "(line 306,col 9)-(line 306,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.subtract(java.lang.Iterable\u003c? extends O\u003e, java.lang.Iterable\u003c? extends O\u003e, org.apache.commons.collections4.Predicate\u003cO\u003e)",
      "begin_line": 330,
      "end_line": 346,
      "comment": "\n     * Returns a new {@link Collection} containing \u003ci\u003ea\u003c/i\u003e minus a subset of\n     * \u003ci\u003eb\u003c/i\u003e.  Only the elements of \u003ci\u003eb\u003c/i\u003e that satisfy the predicate\n     * condition, \u003ci\u003ep\u003c/i\u003e are subtracted from \u003ci\u003ea\u003c/i\u003e.\n     *\n     * \u003cp\u003eThe cardinality of each element \u003ci\u003ee\u003c/i\u003e in the returned {@link Collection}\n     * that satisfies the predicate condition will be the cardinality of \u003ci\u003ee\u003c/i\u003e in \u003ci\u003ea\u003c/i\u003e\n     * minus the cardinality of \u003ci\u003ee\u003c/i\u003e in \u003ci\u003eb\u003c/i\u003e, or zero, whichever is greater.\u003c/p\u003e\n     * \u003cp\u003eThe cardinality of each element \u003ci\u003ee\u003c/i\u003e in the returned {@link Collection} that does \u003cb\u003enot\u003c/b\u003e\n     * satisfy the predicate condition will be equal to the cardinality of \u003ci\u003ee\u003c/i\u003e in \u003ci\u003ea\u003c/i\u003e.\u003c/p\u003e\n     *\n     * @param a  the collection to subtract from, must not be null\n     * @param b  the collection to subtract, must not be null\n     * @param p  the condition used to determine which elements of \u003ci\u003eb\u003c/i\u003e are\n     *        subtracted.\n     * @param \u003cO\u003e the generic type that is able to represent the types contained\n     *        in both input collections.\n     * @return a new collection with the results\n     * @since 4.0\n     * @see Collection#removeAll\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 53)",
        "(line 334,col 9)-(line 334,col 48)",
        "(line 335,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.containsAll(java.util.Collection\u003c?\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 370,
      "end_line": 399,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff all elements of {@code coll2} are also contained\n     * in {@code coll1}. The cardinality of values in {@code coll2} is not taken into account,\n     * which is the same behavior as {@link Collection#containsAll(Collection)}.\n     * \u003cp\u003e\n     * In other words, this method returns \u003ccode\u003etrue\u003c/code\u003e iff the\n     * {@link #intersection} of \u003ci\u003ecoll1\u003c/i\u003e and \u003ci\u003ecoll2\u003c/i\u003e has the same cardinality as\n     * the set of unique values from {@code coll2}. In case {@code coll2} is empty, {@code true}\n     * will be returned.\n     * \u003cp\u003e\n     * This method is intended as a replacement for {@link Collection#containsAll(Collection)}\n     * with a guaranteed runtime complexity of {@code O(n + m)}. Depending on the type of\n     * {@link Collection} provided, this method will be much faster than calling\n     * {@link Collection#containsAll(Collection)} instead, though this will come at the\n     * cost of an additional space complexity O(n).\n     *\n     * @param coll1  the first collection, must not be null\n     * @param coll2  the second collection, must not be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e iff the intersection of the collections has the same cardinality\n     *   as the set of unique elements from the second collection\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.containsAny(java.util.Collection\u003c?\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 413,
      "end_line": 428,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff at least one element is in both collections.\n     * \u003cp\u003e\n     * In other words, this method returns \u003ccode\u003etrue\u003c/code\u003e iff the\n     * {@link #intersection} of \u003ci\u003ecoll1\u003c/i\u003e and \u003ci\u003ecoll2\u003c/i\u003e is not empty.\n     *\n     * @param coll1  the first collection, must not be null\n     * @param coll2  the second collection, must not be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e iff the intersection of the collections is non-empty\n     * @since 2.1\n     * @see #intersection\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 427,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.getCardinalityMap(java.lang.Iterable\u003c? extends O\u003e)",
      "begin_line": 442,
      "end_line": 453,
      "comment": "\n     * Returns a {@link Map} mapping each unique element in the given\n     * {@link Collection} to an {@link Integer} representing the number\n     * of occurrences of that element in the {@link Collection}.\n     * \u003cp\u003e\n     * Only those elements present in the collection will appear as\n     * keys in the map.\n     *\n     * @param \u003cO\u003e  the type of object in the returned {@link Map}. This is a super type of \u003cI\u003e.\n     * @param coll  the collection to get the cardinality map for, must not be null\n     * @return the populated cardinality map\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 64)",
        "(line 444,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.isSubCollection(java.util.Collection\u003c?\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 467,
      "end_line": 475,
      "comment": "\n     * Returns {@code true} iff \u003ci\u003ea\u003c/i\u003e is a sub-collection of \u003ci\u003eb\u003c/i\u003e,\n     * that is, iff the cardinality of \u003ci\u003ee\u003c/i\u003e in \u003ci\u003ea\u003c/i\u003e is less than or\n     * equal to the cardinality of \u003ci\u003ee\u003c/i\u003e in \u003ci\u003eb\u003c/i\u003e, for each element \u003ci\u003ee\u003c/i\u003e\n     * in \u003ci\u003ea\u003c/i\u003e.\n     *\n     * @param a the first (sub?) collection, must not be null\n     * @param b the second (super?) collection, must not be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e iff \u003ci\u003ea\u003c/i\u003e is a sub-collection of \u003ci\u003eb\u003c/i\u003e\n     * @see #isProperSubCollection\n     * @see Collection#containsAll\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 85)",
        "(line 469,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.isProperSubCollection(java.util.Collection\u003c?\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 498,
      "end_line": 500,
      "comment": "\n     * Returns {@code true} iff \u003ci\u003ea\u003c/i\u003e is a \u003ci\u003eproper\u003c/i\u003e sub-collection of \u003ci\u003eb\u003c/i\u003e,\n     * that is, iff the cardinality of \u003ci\u003ee\u003c/i\u003e in \u003ci\u003ea\u003c/i\u003e is less\n     * than or equal to the cardinality of \u003ci\u003ee\u003c/i\u003e in \u003ci\u003eb\u003c/i\u003e,\n     * for each element \u003ci\u003ee\u003c/i\u003e in \u003ci\u003ea\u003c/i\u003e, and there is at least one\n     * element \u003ci\u003ef\u003c/i\u003e such that the cardinality of \u003ci\u003ef\u003c/i\u003e in \u003ci\u003eb\u003c/i\u003e\n     * is strictly greater than the cardinality of \u003ci\u003ef\u003c/i\u003e in \u003ci\u003ea\u003c/i\u003e.\n     * \u003cp\u003e\n     * The implementation assumes\n     * \u003cul\u003e\n     *    \u003cli\u003e\u003ccode\u003ea.size()\u003c/code\u003e and \u003ccode\u003eb.size()\u003c/code\u003e represent the\n     *    total cardinality of \u003ci\u003ea\u003c/i\u003e and \u003ci\u003eb\u003c/i\u003e, resp. \u003c/li\u003e\n     *    \u003cli\u003e\u003ccode\u003ea.size() \u003c Integer.MAXVALUE\u003c/code\u003e\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param a  the first (sub?) collection, must not be null\n     * @param b  the second (super?) collection, must not be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e iff \u003ci\u003ea\u003c/i\u003e is a \u003ci\u003eproper\u003c/i\u003e sub-collection of \u003ci\u003eb\u003c/i\u003e\n     * @see #isSubCollection\n     * @see Collection#containsAll\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.isEqualCollection(java.util.Collection\u003c?\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 514,
      "end_line": 528,
      "comment": "\n     * Returns {@code true} iff the given {@link Collection}s contain\n     * exactly the same elements with exactly the same cardinalities.\n     * \u003cp\u003e\n     * That is, iff the cardinality of \u003ci\u003ee\u003c/i\u003e in \u003ci\u003ea\u003c/i\u003e is\n     * equal to the cardinality of \u003ci\u003ee\u003c/i\u003e in \u003ci\u003eb\u003c/i\u003e,\n     * for each element \u003ci\u003ee\u003c/i\u003e in \u003ci\u003ea\u003c/i\u003e or \u003ci\u003eb\u003c/i\u003e.\n     *\n     * @param a  the first collection, must not be null\n     * @param b  the second collection, must not be null\n     * @return \u003ccode\u003etrue\u003c/code\u003e iff the collections contain the same elements with the same cardinalities.\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 518,col 85)",
        "(line 519,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 526,col 9)",
        "(line 527,col 9)-(line 527,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.isEqualCollection(java.util.Collection\u003c? extends E\u003e, java.util.Collection\u003c? extends E\u003e, org.apache.commons.collections4.Equator\u003c? super E\u003e)",
      "begin_line": 551,
      "end_line": 570,
      "comment": "\n     * Returns {@code true} iff the given {@link Collection}s contain\n     * exactly the same elements with exactly the same cardinalities.\n     * \u003cp\u003e\n     * That is, iff the cardinality of \u003ci\u003ee\u003c/i\u003e in \u003ci\u003ea\u003c/i\u003e is\n     * equal to the cardinality of \u003ci\u003ee\u003c/i\u003e in \u003ci\u003eb\u003c/i\u003e,\n     * for each element \u003ci\u003ee\u003c/i\u003e in \u003ci\u003ea\u003c/i\u003e or \u003ci\u003eb\u003c/i\u003e.\n     * \u003cp\u003e\n     * \u003cb\u003eNote:\u003c/b\u003e from version 4.1 onwards this method requires the input\n     * collections and equator to be of compatible type (using bounded wildcards).\n     * Providing incompatible arguments (e.g. by casting to their rawtypes)\n     * will result in a {@code ClassCastException} thrown at runtime.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param a  the first collection, must not be null\n     * @param b  the second collection, must not be null\n     * @param equator  the Equator used for testing equality\n     * @return \u003ccode\u003etrue\u003c/code\u003e iff the collections contain the same elements with the same cardinalities.\n     * @throws NullPointerException if the equator is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 556,col 9)",
        "(line 558,col 9)-(line 560,col 9)",
        "(line 562,col 9)-(line 567,col 10)",
        "(line 569,col 9)-(line 569,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.Anonymous-f5450ea1-948c-4dea-ae8b-2b92ef0de185.transform(java.lang.Object)",
      "begin_line": 564,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 565,col 17)-(line 565,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EquatorWrapper",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 581,
      "end_line": 608,
      "comment": "\n     * Wraps another object and uses the provided Equator to implement\n     * {@link #equals(Object)} and {@link #hashCode()}.\n     * \u003cp\u003e\n     * This class can be used to store objects into a Map.\n     *\n     * @param \u003cO\u003e  the element type\n     * @since 4.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "equator"
      ],
      "begin_line": 582,
      "end_line": 582,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 583,
      "end_line": 583,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.CollectionUtils.EquatorWrapper.EquatorWrapper(org.apache.commons.collections4.Equator\u003c? super O\u003e, O)",
      "begin_line": 585,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 586,col 13)-(line 586,col 35)",
        "(line 587,col 13)-(line 587,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.EquatorWrapper.getObject()",
      "begin_line": 590,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 591,col 13)-(line 591,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.EquatorWrapper.equals(java.lang.Object)",
      "begin_line": 594,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 596,col 13)-(line 598,col 13)",
        "(line 599,col 13)-(line 600,col 71)",
        "(line 601,col 13)-(line 601,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.EquatorWrapper.hashCode()",
      "begin_line": 604,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 606,col 13)-(line 606,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.cardinality(O, java.lang.Iterable\u003c? super O\u003e)",
      "begin_line": 621,
      "end_line": 627,
      "comment": "\n     * Returns the number of occurrences of \u003ci\u003eobj\u003c/i\u003e in \u003ci\u003ecoll\u003c/i\u003e.\n     *\n     * @param obj the object to find the cardinality of\n     * @param coll the {@link Iterable} to search\n     * @param \u003cO\u003e the type of object that the {@link Iterable} may contain.\n     * @return the the number of occurrences of obj in coll\n     * @throws NullPointerException if coll is null\n     * @deprecated since 4.1, use {@link IterableUtils#frequency(Iterable, Object)} instead.\n     *   Be aware that the order of parameters has changed.\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.find(java.lang.Iterable\u003cT\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 641,
      "end_line": 644,
      "comment": "\n     * Finds the first element in the given collection which matches the given predicate.\n     * \u003cp\u003e\n     * If the input collection or predicate is null, or no element of the collection\n     * matches the predicate, null is returned.\n     *\n     * @param \u003cT\u003e  the type of object the {@link Iterable} contains\n     * @param collection  the collection to search, may be null\n     * @param predicate  the predicate to use, may be null\n     * @return the first element of the collection which matches the predicate or null if none could be found\n     * @deprecated since 4.1, use {@link IterableUtils#find(Iterable, Predicate)} instead\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.forAllDo(java.lang.Iterable\u003cT\u003e, C)",
      "begin_line": 658,
      "end_line": 664,
      "comment": "\n     * Executes the given closure on each element in the collection.\n     * \u003cp\u003e\n     * If the input collection or closure is null, there is no change made.\n     *\n     * @param \u003cT\u003e  the type of object the {@link Iterable} contains\n     * @param \u003cC\u003e  the closure type\n     * @param collection  the collection to get the input from, may be null\n     * @param closure  the closure to perform, may be null\n     * @return closure\n     * @deprecated since 4.1, use {@link IterableUtils#forEach(Iterable, Closure)} instead\n     ",
      "child_ranges": [
        "(line 660,col 9)-(line 662,col 9)",
        "(line 663,col 9)-(line 663,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.forAllDo(java.util.Iterator\u003cT\u003e, C)",
      "begin_line": 679,
      "end_line": 685,
      "comment": "\n     * Executes the given closure on each element in the collection.\n     * \u003cp\u003e\n     * If the input collection or closure is null, there is no change made.\n     *\n     * @param \u003cT\u003e  the type of object the {@link Iterator} contains\n     * @param \u003cC\u003e  the closure type\n     * @param iterator  the iterator to get the input from, may be null\n     * @param closure  the closure to perform, may be null\n     * @return closure\n     * @since 4.0\n     * @deprecated since 4.1, use {@link IteratorUtils#forEach(Iterator, Closure)} instead\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.forAllButLastDo(java.lang.Iterable\u003cT\u003e, C)",
      "begin_line": 700,
      "end_line": 704,
      "comment": "\n     * Executes the given closure on each but the last element in the collection.\n     * \u003cp\u003e\n     * If the input collection or closure is null, there is no change made.\n     *\n     * @param \u003cT\u003e  the type of object the {@link Iterable} contains\n     * @param \u003cC\u003e  the closure type\n     * @param collection  the collection to get the input from, may be null\n     * @param closure  the closure to perform, may be null\n     * @return the last element in the collection, or null if either collection or closure is null\n     * @since 4.0\n     * @deprecated since 4.1, use {@link IterableUtils#forEachButLast(Iterable, Closure)} instead\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.forAllButLastDo(java.util.Iterator\u003cT\u003e, C)",
      "begin_line": 719,
      "end_line": 722,
      "comment": "\n     * Executes the given closure on each but the last element in the collection.\n     * \u003cp\u003e\n     * If the input collection or closure is null, there is no change made.\n     *\n     * @param \u003cT\u003e  the type of object the {@link Collection} contains\n     * @param \u003cC\u003e  the closure type\n     * @param iterator  the iterator to get the input from, may be null\n     * @param closure  the closure to perform, may be null\n     * @return the last element in the collection, or null if either iterator or closure is null\n     * @since 4.0\n     * @deprecated since 4.1, use {@link IteratorUtils#forEachButLast(Iterator, Closure)} instead\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.filter(java.lang.Iterable\u003cT\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 735,
      "end_line": 746,
      "comment": "\n     * Filter the collection by applying a Predicate to each element. If the\n     * predicate returns false, remove the element.\n     * \u003cp\u003e\n     * If the input collection or predicate is null, there is no change made.\n     *\n     * @param \u003cT\u003e  the type of object the {@link Iterable} contains\n     * @param collection  the collection to get the input from, may be null\n     * @param predicate  the predicate to use as a filter, may be null\n     * @return true if the collection is modified by this call, false otherwise.\n     ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 31)",
        "(line 737,col 9)-(line 744,col 9)",
        "(line 745,col 9)-(line 745,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.filterInverse(java.lang.Iterable\u003cT\u003e, org.apache.commons.collections4.Predicate\u003c? super T\u003e)",
      "begin_line": 762,
      "end_line": 764,
      "comment": "\n     * Filter the collection by applying a Predicate to each element. If the\n     * predicate returns true, remove the element.\n     * \u003cp\u003e\n     * This is equivalent to \u003cpre\u003efilter(collection, PredicateUtils.notPredicate(predicate))\u003c/pre\u003e\n     * if predicate is !\u003d null.\n     * \u003cp\u003e\n     * If the input collection or predicate is null, there is no change made.\n     *\n     * @param \u003cT\u003e  the type of object the {@link Iterable} contains\n     * @param collection  the collection to get the input from, may be null\n     * @param predicate  the predicate to use as a filter, may be null\n     * @return true if the collection is modified by this call, false otherwise.\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.transform(java.util.Collection\u003cC\u003e, org.apache.commons.collections4.Transformer\u003c? super C, ? extends C\u003e)",
      "begin_line": 783,
      "end_line": 798,
      "comment": "\n     * Transform the collection by applying a Transformer to each element.\n     * \u003cp\u003e\n     * If the input collection or transformer is null, there is no change made.\n     * \u003cp\u003e\n     * This routine is best for Lists, for which set() is used to do the\n     * transformations \"in place.\" For other Collections, clear() and addAll()\n     * are used to replace elements.\n     * \u003cp\u003e\n     * If the input collection controls its input, such as a Set, and the\n     * Transformer creates duplicates (or are otherwise invalid), the collection\n     * may reduce in size due to calling this method.\n     *\n     * @param \u003cC\u003e  the type of object the {@link Collection} contains\n     * @param collection  the {@link Collection} to get the input from, may be null\n     * @param transformer  the transformer to perform, may be null\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 797,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.countMatches(java.lang.Iterable\u003cC\u003e, org.apache.commons.collections4.Predicate\u003c? super C\u003e)",
      "begin_line": 812,
      "end_line": 815,
      "comment": "\n     * Counts the number of elements in the input collection that match the\n     * predicate.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e collection or predicate matches no elements.\n     *\n     * @param \u003cC\u003e  the type of object the {@link Iterable} contains\n     * @param input  the {@link Iterable} to get the input from, may be null\n     * @param predicate  the predicate to use, may be null\n     * @return the number of matches for the predicate in the collection\n     * @deprecated since 4.1, use {@link IterableUtils#countMatches(Iterable, Predicate)} instead\n     ",
      "child_ranges": [
        "(line 814,col 9)-(line 814,col 90)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.exists(java.lang.Iterable\u003cC\u003e, org.apache.commons.collections4.Predicate\u003c? super C\u003e)",
      "begin_line": 829,
      "end_line": 832,
      "comment": "\n     * Answers true if a predicate is true for at least one element of a\n     * collection.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e collection or predicate returns false.\n     *\n     * @param \u003cC\u003e  the type of object the {@link Iterable} contains\n     * @param input  the {@link Iterable} to get the input from, may be null\n     * @param predicate  the predicate to use, may be null\n     * @return true if at least one element of the collection matches the predicate\n     * @deprecated since 4.1, use {@link IterableUtils#matchesAny(Iterable, Predicate)} instead\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.matchesAll(java.lang.Iterable\u003cC\u003e, org.apache.commons.collections4.Predicate\u003c? super C\u003e)",
      "begin_line": 849,
      "end_line": 852,
      "comment": "\n     * Answers true if a predicate is true for every element of a\n     * collection.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e predicate returns false.\u003cbr/\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty collection returns true.\n     *\n     * @param \u003cC\u003e  the type of object the {@link Iterable} contains\n     * @param input  the {@link Iterable} to get the input from, may be null\n     * @param predicate  the predicate to use, may be null\n     * @return true if every element of the collection matches the predicate or if the\n     * collection is empty, false otherwise\n     * @since 4.0\n     * @deprecated since 4.1, use {@link IterableUtils#matchesAll(Iterable, Predicate)} instead\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.select(java.lang.Iterable\u003c? extends O\u003e, org.apache.commons.collections4.Predicate\u003c? super O\u003e)",
      "begin_line": 866,
      "end_line": 871,
      "comment": "\n     * Selects all elements from input collection which match the given\n     * predicate into an output collection.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e predicate matches no elements.\n     *\n     * @param \u003cO\u003e  the type of object the {@link Iterable} contains\n     * @param inputCollection  the collection to get the input from, may not be null\n     * @param predicate  the predicate to use, may be null\n     * @return the elements matching the predicate (new list)\n     * @throws NullPointerException if the input collection is null\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 869,col 96)",
        "(line 870,col 9)-(line 870,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.select(java.lang.Iterable\u003c? extends O\u003e, org.apache.commons.collections4.Predicate\u003c? super O\u003e, R)",
      "begin_line": 888,
      "end_line": 899,
      "comment": "\n     * Selects all elements from input collection which match the given\n     * predicate and adds them to outputCollection.\n     * \u003cp\u003e\n     * If the input collection or predicate is null, there is no change to the\n     * output collection.\n     *\n     * @param \u003cO\u003e  the type of object the {@link Iterable} contains\n     * @param \u003cR\u003e  the type of the output {@link Collection}\n     * @param inputCollection  the collection to get the input from, may be null\n     * @param predicate  the predicate to use, may be null\n     * @param outputCollection  the collection to output into, may not be null if the inputCollection\n     *   and predicate or not null\n     * @return the outputCollection\n     ",
      "child_ranges": [
        "(line 891,col 9)-(line 897,col 9)",
        "(line 898,col 9)-(line 898,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.select(java.lang.Iterable\u003c? extends O\u003e, org.apache.commons.collections4.Predicate\u003c? super O\u003e, R, R)",
      "begin_line": 928,
      "end_line": 941,
      "comment": "\n     * Selects all elements from inputCollection into an output and rejected collection,\n     * based on the evaluation of the given predicate.\n     * \u003cp\u003e\n     * Elements matching the predicate are added to the \u003ccode\u003eoutputCollection\u003c/code\u003e,\n     * all other elements are added to the \u003ccode\u003erejectedCollection\u003c/code\u003e.\n     * \u003cp\u003e\n     * If the input predicate is \u003ccode\u003enull\u003c/code\u003e, no elements are added to\n     * \u003ccode\u003eoutputCollection\u003c/code\u003e or \u003ccode\u003erejectedCollection\u003c/code\u003e.\n     * \u003cp\u003e\n     * Note: calling the method is equivalent to the following code snippet:\n     * \u003cpre\u003e\n     *   select(inputCollection, predicate, outputCollection);\n     *   selectRejected(inputCollection, predicate, rejectedCollection);\n     * \u003c/pre\u003e\n     *\n     * @param \u003cO\u003e  the type of object the {@link Iterable} contains\n     * @param \u003cR\u003e  the type of the output {@link Collection}\n     * @param inputCollection  the collection to get the input from, may be null\n     * @param predicate  the predicate to use, may be null\n     * @param outputCollection  the collection to output selected elements into, may not be null if the\n     *   inputCollection and predicate are not null\n     * @param rejectedCollection  the collection to output rejected elements into, may not be null if the\n     *   inputCollection or predicate are not null\n     * @return the outputCollection\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 939,col 9)",
        "(line 940,col 9)-(line 940,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.selectRejected(java.lang.Iterable\u003c? extends O\u003e, org.apache.commons.collections4.Predicate\u003c? super O\u003e)",
      "begin_line": 956,
      "end_line": 961,
      "comment": "\n     * Selects all elements from inputCollection which don\u0027t match the given\n     * predicate into an output collection.\n     * \u003cp\u003e\n     * If the input predicate is \u003ccode\u003enull\u003c/code\u003e, the result is an empty\n     * list.\n     *\n     * @param \u003cO\u003e  the type of object the {@link Iterable} contains\n     * @param inputCollection  the collection to get the input from, may not be null\n     * @param predicate  the predicate to use, may be null\n     * @return the elements \u003cb\u003enot\u003c/b\u003e matching the predicate (new list)\n     * @throws NullPointerException if the input collection is null\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 959,col 96)",
        "(line 960,col 9)-(line 960,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.selectRejected(java.lang.Iterable\u003c? extends O\u003e, org.apache.commons.collections4.Predicate\u003c? super O\u003e, R)",
      "begin_line": 978,
      "end_line": 989,
      "comment": "\n     * Selects all elements from inputCollection which don\u0027t match the given\n     * predicate and adds them to outputCollection.\n     * \u003cp\u003e\n     * If the input predicate is \u003ccode\u003enull\u003c/code\u003e, no elements are added to\n     * \u003ccode\u003eoutputCollection\u003c/code\u003e.\n     *\n     * @param \u003cO\u003e  the type of object the {@link Iterable} contains\n     * @param \u003cR\u003e  the type of the output {@link Collection}\n     * @param inputCollection  the collection to get the input from, may be null\n     * @param predicate  the predicate to use, may be null\n     * @param outputCollection  the collection to output into, may not be null if the inputCollection\n     *   and predicate or not null\n     * @return outputCollection\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 988,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.collect(java.lang.Iterable\u003cI\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 1004,
      "end_line": 1009,
      "comment": "\n     * Returns a new Collection containing all elements of the input collection\n     * transformed by the given transformer.\n     * \u003cp\u003e\n     * If the input collection or transformer is null, the result is an empty list.\n     *\n     * @param \u003cI\u003e  the type of object in the input collection\n     * @param \u003cO\u003e  the type of object in the output collection\n     * @param inputCollection  the collection to get the input from, may not be null\n     * @param transformer  the transformer to use, may be null\n     * @return the transformed result (new list)\n     * @throws NullPointerException if the input collection is null\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1007,col 96)",
        "(line 1008,col 9)-(line 1008,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.collect(java.util.Iterator\u003cI\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 1023,
      "end_line": 1026,
      "comment": "\n     * Transforms all elements from the input iterator with the given transformer\n     * and adds them to the output collection.\n     * \u003cp\u003e\n     * If the input iterator or transformer is null, the result is an empty list.\n     *\n     * @param \u003cI\u003e  the type of object in the input collection\n     * @param \u003cO\u003e  the type of object in the output collection\n     * @param inputIterator  the iterator to get the input from, may be null\n     * @param transformer  the transformer to use, may be null\n     * @return the transformed result (new list)\n     ",
      "child_ranges": [
        "(line 1025,col 9)-(line 1025,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.collect(java.lang.Iterable\u003c? extends I\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e, R)",
      "begin_line": 1046,
      "end_line": 1052,
      "comment": "\n     * Transforms all elements from input collection with the given transformer\n     * and adds them to the output collection.\n     * \u003cp\u003e\n     * If the input collection or transformer is null, there is no change to the\n     * output collection.\n     *\n     * @param \u003cI\u003e  the type of object in the input collection\n     * @param \u003cO\u003e  the type of object in the output collection\n     * @param \u003cR\u003e  the type of the output collection\n     * @param inputCollection  the collection to get the input from, may be null\n     * @param transformer  the transformer to use, may be null\n     * @param outputCollection  the collection to output into, may not be null if inputCollection\n     *   and transformer are not null\n     * @return the output collection with the transformed input added\n     * @throws NullPointerException if the outputCollection is null and both, inputCollection and\n     *   transformer are not null\n     ",
      "child_ranges": [
        "(line 1048,col 9)-(line 1050,col 9)",
        "(line 1051,col 9)-(line 1051,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.collect(java.util.Iterator\u003c? extends I\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e, R)",
      "begin_line": 1072,
      "end_line": 1082,
      "comment": "\n     * Transforms all elements from the input iterator with the given transformer\n     * and adds them to the output collection.\n     * \u003cp\u003e\n     * If the input iterator or transformer is null, there is no change to the\n     * output collection.\n     *\n     * @param \u003cI\u003e  the type of object in the input collection\n     * @param \u003cO\u003e  the type of object in the output collection\n     * @param \u003cR\u003e  the type of the output collection\n     * @param inputIterator  the iterator to get the input from, may be null\n     * @param transformer  the transformer to use, may be null\n     * @param outputCollection  the collection to output into, may not be null if inputIterator\n     *   and transformer are not null\n     * @return the outputCollection with the transformed input added\n     * @throws NullPointerException if the output collection is null and both, inputIterator and\n     *   transformer are not null\n     ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1080,col 9)",
        "(line 1081,col 9)-(line 1081,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.addIgnoreNull(java.util.Collection\u003cT\u003e, T)",
      "begin_line": 1095,
      "end_line": 1100,
      "comment": "\n     * Adds an element to the collection unless the element is null.\n     *\n     * @param \u003cT\u003e  the type of object the {@link Collection} contains\n     * @param collection  the collection to add to, must not be null\n     * @param object  the object to add, if null it will not be added\n     * @return true if the collection changed\n     * @throws NullPointerException if the collection is null\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1096,col 9)-(line 1098,col 9)",
        "(line 1099,col 9)-(line 1099,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.addAll(java.util.Collection\u003cC\u003e, java.lang.Iterable\u003c? extends C\u003e)",
      "begin_line": 1113,
      "end_line": 1118,
      "comment": "\n     * Adds all elements in the {@link Iterable} to the given collection. If the\n     * {@link Iterable} is a {@link Collection} then it is cast and will be\n     * added using {@link Collection#addAll(Collection)} instead of iterating.\n     *\n     * @param \u003cC\u003e  the type of object the {@link Collection} contains\n     * @param collection  the collection to add to, must not be null\n     * @param iterable  the iterable of elements to add, must not be null\n     * @return a boolean indicating whether the collection has changed or not.\n     * @throws NullPointerException if the collection or iterator is null\n     ",
      "child_ranges": [
        "(line 1114,col 9)-(line 1116,col 9)",
        "(line 1117,col 9)-(line 1117,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.addAll(java.util.Collection\u003cC\u003e, java.util.Iterator\u003c? extends C\u003e)",
      "begin_line": 1129,
      "end_line": 1135,
      "comment": "\n     * Adds all elements in the iteration to the given collection.\n     *\n     * @param \u003cC\u003e  the type of object the {@link Collection} contains\n     * @param collection  the collection to add to, must not be null\n     * @param iterator  the iterator of elements to add, must not be null\n     * @return a boolean indicating whether the collection has changed or not.\n     * @throws NullPointerException if the collection or iterator is null\n     ",
      "child_ranges": [
        "(line 1130,col 9)-(line 1130,col 32)",
        "(line 1131,col 9)-(line 1133,col 9)",
        "(line 1134,col 9)-(line 1134,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.addAll(java.util.Collection\u003cC\u003e, java.util.Enumeration\u003c? extends C\u003e)",
      "begin_line": 1146,
      "end_line": 1152,
      "comment": "\n     * Adds all elements in the enumeration to the given collection.\n     *\n     * @param \u003cC\u003e  the type of object the {@link Collection} contains\n     * @param collection  the collection to add to, must not be null\n     * @param enumeration  the enumeration of elements to add, must not be null\n     * @return {@code true} if the collections was changed, {@code false} otherwise\n     * @throws NullPointerException if the collection or enumeration is null\n     ",
      "child_ranges": [
        "(line 1147,col 9)-(line 1147,col 32)",
        "(line 1148,col 9)-(line 1150,col 9)",
        "(line 1151,col 9)-(line 1151,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.addAll(java.util.Collection\u003cC\u003e, C[])",
      "begin_line": 1163,
      "end_line": 1169,
      "comment": "\n     * Adds all elements in the array to the given collection.\n     *\n     * @param \u003cC\u003e  the type of object the {@link Collection} contains\n     * @param collection  the collection to add to, must not be null\n     * @param elements  the array of elements to add, must not be null\n     * @return {@code true} if the collection was changed, {@code false} otherwise\n     * @throws NullPointerException if the collection or array is null\n     ",
      "child_ranges": [
        "(line 1164,col 9)-(line 1164,col 32)",
        "(line 1165,col 9)-(line 1167,col 9)",
        "(line 1168,col 9)-(line 1168,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.get(java.util.Iterator\u003cT\u003e, int)",
      "begin_line": 1186,
      "end_line": 1189,
      "comment": "\n     * Returns the \u003ccode\u003eindex\u003c/code\u003e-th value in {@link Iterator}, throwing\n     * \u003ccode\u003eIndexOutOfBoundsException\u003c/code\u003e if there is no such element.\n     * \u003cp\u003e\n     * The Iterator is advanced to \u003ccode\u003eindex\u003c/code\u003e (or to the end, if\n     * \u003ccode\u003eindex\u003c/code\u003e exceeds the number of entries) as a side effect of this method.\n     *\n     * @param iterator  the iterator to get a value from\n     * @param index  the index to get\n     * @param \u003cT\u003e the type of object in the {@link Iterator}\n     * @return the object at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @throws IllegalArgumentException if the object type is invalid\n     * @deprecated since 4.1, use {@code IteratorUtils.get(Iterator, int)} instead\n     ",
      "child_ranges": [
        "(line 1188,col 9)-(line 1188,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.checkIndexBounds(int)",
      "begin_line": 1196,
      "end_line": 1200,
      "comment": "\n     * Ensures an index is not negative.\n     * @param index the index to check.\n     * @throws IndexOutOfBoundsException if the index is negative.\n     ",
      "child_ranges": [
        "(line 1197,col 9)-(line 1199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.get(java.lang.Iterable\u003cT\u003e, int)",
      "begin_line": 1215,
      "end_line": 1218,
      "comment": "\n     * Returns the \u003ccode\u003eindex\u003c/code\u003e-th value in the \u003ccode\u003eiterable\u003c/code\u003e\u0027s {@link Iterator}, throwing\n     * \u003ccode\u003eIndexOutOfBoundsException\u003c/code\u003e if there is no such element.\n     * \u003cp\u003e\n     * If the {@link Iterable} is a {@link List}, then it will use {@link List#get(int)}.\n     *\n     * @param iterable  the {@link Iterable} to get a value from\n     * @param index  the index to get\n     * @param \u003cT\u003e the type of object in the {@link Iterable}.\n     * @return the object at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @deprecated since 4.1, use {@code IterableUtils.get(Iterable, int)} instead\n     ",
      "child_ranges": [
        "(line 1217,col 9)-(line 1217,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.get(java.lang.Object, int)",
      "begin_line": 1250,
      "end_line": 1282,
      "comment": "\n     * Returns the \u003ccode\u003eindex\u003c/code\u003e-th value in \u003ccode\u003eobject\u003c/code\u003e, throwing\n     * \u003ccode\u003eIndexOutOfBoundsException\u003c/code\u003e if there is no such element or\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e if \u003ccode\u003eobject\u003c/code\u003e is not an\n     * instance of one of the supported types.\n     * \u003cp\u003e\n     * The supported types, and associated semantics are:\n     * \u003cul\u003e\n     * \u003cli\u003e Map -- the value returned is the \u003ccode\u003eMap.Entry\u003c/code\u003e in position\n     *      \u003ccode\u003eindex\u003c/code\u003e in the map\u0027s \u003ccode\u003eentrySet\u003c/code\u003e iterator,\n     *      if there is such an entry.\u003c/li\u003e\n     * \u003cli\u003e List -- this method is equivalent to the list\u0027s get method.\u003c/li\u003e\n     * \u003cli\u003e Array -- the \u003ccode\u003eindex\u003c/code\u003e-th array entry is returned,\n     *      if there is such an entry; otherwise an \u003ccode\u003eIndexOutOfBoundsException\u003c/code\u003e\n     *      is thrown.\u003c/li\u003e\n     * \u003cli\u003e Collection -- the value returned is the \u003ccode\u003eindex\u003c/code\u003e-th object\n     *      returned by the collection\u0027s default iterator, if there is such an element.\u003c/li\u003e\n     * \u003cli\u003e Iterator or Enumeration -- the value returned is the\n     *      \u003ccode\u003eindex\u003c/code\u003e-th object in the Iterator/Enumeration, if there\n     *      is such an element.  The Iterator/Enumeration is advanced to\n     *      \u003ccode\u003eindex\u003c/code\u003e (or to the end, if \u003ccode\u003eindex\u003c/code\u003e exceeds the\n     *      number of entries) as a side effect of this method.\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param object  the object to get a value from\n     * @param index  the index to get\n     * @return the object at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @throws IllegalArgumentException if the object type is invalid\n     ",
      "child_ranges": [
        "(line 1251,col 9)-(line 1251,col 22)",
        "(line 1252,col 9)-(line 1254,col 9)",
        "(line 1255,col 9)-(line 1281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.get(java.util.Map\u003cK, V\u003e, int)",
      "begin_line": 1295,
      "end_line": 1298,
      "comment": "\n     * Returns the \u003ccode\u003eindex\u003c/code\u003e-th \u003ccode\u003eMap.Entry\u003c/code\u003e in the \u003ccode\u003emap\u003c/code\u003e\u0027s \u003ccode\u003eentrySet\u003c/code\u003e,\n     * throwing \u003ccode\u003eIndexOutOfBoundsException\u003c/code\u003e if there is no such element.\n     *\n     * @param \u003cK\u003e  the key type in the {@link Map}\n     * @param \u003cV\u003e  the key type in the {@link Map}\n     * @param map  the object to get a value from\n     * @param index  the index to get\n     * @return the object at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 1296,col 9)-(line 1296,col 32)",
        "(line 1297,col 9)-(line 1297,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.size(java.lang.Object)",
      "begin_line": 1317,
      "end_line": 1346,
      "comment": "\n     * Gets the size of the collection/iterator specified.\n     * \u003cp\u003e\n     * This method can handles objects as follows\n     * \u003cul\u003e\n     * \u003cli\u003eCollection - the collection size\n     * \u003cli\u003eMap - the map size\n     * \u003cli\u003eArray - the array size\n     * \u003cli\u003eIterator - the number of elements remaining in the iterator\n     * \u003cli\u003eEnumeration - the number of elements remaining in the enumeration\n     * \u003c/ul\u003e\n     *\n     * @param object  the object to get the size of, may be null\n     * @return the size of the specified collection or 0 if the object was null\n     * @throws IllegalArgumentException thrown if object is not recognised\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 1318,col 9)-(line 1320,col 9)",
        "(line 1321,col 9)-(line 1321,col 22)",
        "(line 1322,col 9)-(line 1344,col 9)",
        "(line 1345,col 9)-(line 1345,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.sizeIsEmpty(java.lang.Object)",
      "begin_line": 1368,
      "end_line": 1390,
      "comment": "\n     * Checks if the specified collection/array/iterator is empty.\n     * \u003cp\u003e\n     * This method can handles objects as follows\n     * \u003cul\u003e\n     * \u003cli\u003eCollection - via collection isEmpty\n     * \u003cli\u003eMap - via map isEmpty\n     * \u003cli\u003eArray - using array size\n     * \u003cli\u003eIterator - via hasNext\n     * \u003cli\u003eEnumeration - via hasMoreElements\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * Note: This method is named to avoid clashing with\n     * {@link #isEmpty(Collection)}.\n     *\n     * @param object  the object to get the size of, may be null\n     * @return true if empty or null\n     * @throws IllegalArgumentException thrown if object is not recognised\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1369,col 9)-(line 1389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.isEmpty(java.util.Collection\u003c?\u003e)",
      "begin_line": 1402,
      "end_line": 1404,
      "comment": "\n     * Null-safe check if the specified collection is empty.\n     * \u003cp\u003e\n     * Null returns true.\n     *\n     * @param coll  the collection to check, may be null\n     * @return true if empty or null\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1403,col 9)-(line 1403,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.isNotEmpty(java.util.Collection\u003c?\u003e)",
      "begin_line": 1415,
      "end_line": 1417,
      "comment": "\n     * Null-safe check if the specified collection is not empty.\n     * \u003cp\u003e\n     * Null returns false.\n     *\n     * @param coll  the collection to check, may be null\n     * @return true if non-null and non-empty\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1416,col 9)-(line 1416,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.reverseArray(java.lang.Object[])",
      "begin_line": 1425,
      "end_line": 1437,
      "comment": "\n     * Reverses the order of the given array.\n     *\n     * @param array  the array to reverse\n     ",
      "child_ranges": [
        "(line 1426,col 9)-(line 1426,col 18)",
        "(line 1427,col 9)-(line 1427,col 33)",
        "(line 1428,col 9)-(line 1428,col 19)",
        "(line 1430,col 9)-(line 1436,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.isFull(java.util.Collection\u003c? extends java.lang.Object\u003e)",
      "begin_line": 1454,
      "end_line": 1468,
      "comment": "\n     * Returns true if no more elements can be added to the Collection.\n     * \u003cp\u003e\n     * This method uses the {@link BoundedCollection} interface to determine the\n     * full status. If the collection does not implement this interface then\n     * false is returned.\n     * \u003cp\u003e\n     * The collection does not have to implement this interface directly.\n     * If the collection has been decorated using the decorators subpackage\n     * then these will be removed to access the BoundedCollection.\n     *\n     * @param coll  the collection to check\n     * @return true if the BoundedCollection is full\n     * @throws NullPointerException if the collection is null\n     ",
      "child_ranges": [
        "(line 1455,col 9)-(line 1457,col 9)",
        "(line 1458,col 9)-(line 1460,col 9)",
        "(line 1461,col 9)-(line 1467,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.maxSize(java.util.Collection\u003c? extends java.lang.Object\u003e)",
      "begin_line": 1485,
      "end_line": 1499,
      "comment": "\n     * Get the maximum number of elements that the Collection can contain.\n     * \u003cp\u003e\n     * This method uses the {@link BoundedCollection} interface to determine the\n     * maximum size. If the collection does not implement this interface then\n     * -1 is returned.\n     * \u003cp\u003e\n     * The collection does not have to implement this interface directly.\n     * If the collection has been decorated using the decorators subpackage\n     * then these will be removed to access the BoundedCollection.\n     *\n     * @param coll  the collection to check\n     * @return the maximum size of the BoundedCollection, -1 if no maximum size\n     * @throws NullPointerException if the collection is null\n     ",
      "child_ranges": [
        "(line 1486,col 9)-(line 1488,col 9)",
        "(line 1489,col 9)-(line 1491,col 9)",
        "(line 1492,col 9)-(line 1498,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.collate(java.lang.Iterable\u003c? extends O\u003e, java.lang.Iterable\u003c? extends O\u003e)",
      "begin_line": 1515,
      "end_line": 1518,
      "comment": "\n     * Merges two sorted Collections, a and b, into a single, sorted List\n     * such that the natural ordering of the elements is retained.\n     * \u003cp\u003e\n     * Uses the standard O(n) merge algorithm for combining two sorted lists.\n     *\n     * @param \u003cO\u003e  the element type\n     * @param a  the first collection, must not be null\n     * @param b  the second collection, must not be null\n     * @return a new sorted List, containing the elements of Collection a and b\n     * @throws NullPointerException if either collection is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 1517,col 9)-(line 1517,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.collate(java.lang.Iterable\u003c? extends O\u003e, java.lang.Iterable\u003c? extends O\u003e, boolean)",
      "begin_line": 1535,
      "end_line": 1539,
      "comment": "\n     * Merges two sorted Collections, a and b, into a single, sorted List\n     * such that the natural ordering of the elements is retained.\n     * \u003cp\u003e\n     * Uses the standard O(n) merge algorithm for combining two sorted lists.\n     *\n     * @param \u003cO\u003e  the element type\n     * @param a  the first collection, must not be null\n     * @param b  the second collection, must not be null\n     * @param includeDuplicates  if {@code true} duplicate elements will be retained, otherwise\n     *   they will be removed in the output collection\n     * @return a new sorted List, containing the elements of Collection a and b\n     * @throws NullPointerException if either collection is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 1538,col 9)-(line 1538,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.collate(java.lang.Iterable\u003c? extends O\u003e, java.lang.Iterable\u003c? extends O\u003e, java.util.Comparator\u003c? super O\u003e)",
      "begin_line": 1555,
      "end_line": 1558,
      "comment": "\n     * Merges two sorted Collections, a and b, into a single, sorted List\n     * such that the ordering of the elements according to Comparator c is retained.\n     * \u003cp\u003e\n     * Uses the standard O(n) merge algorithm for combining two sorted lists.\n     *\n     * @param \u003cO\u003e  the element type\n     * @param a  the first collection, must not be null\n     * @param b  the second collection, must not be null\n     * @param c  the comparator to use for the merge.\n     * @return a new sorted List, containing the elements of Collection a and b\n     * @throws NullPointerException if either collection or the comparator is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 1557,col 9)-(line 1557,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.collate(java.lang.Iterable\u003c? extends O\u003e, java.lang.Iterable\u003c? extends O\u003e, java.util.Comparator\u003c? super O\u003e, boolean)",
      "begin_line": 1576,
      "end_line": 1608,
      "comment": "\n     * Merges two sorted Collections, a and b, into a single, sorted List\n     * such that the ordering of the elements according to Comparator c is retained.\n     * \u003cp\u003e\n     * Uses the standard O(n) merge algorithm for combining two sorted lists.\n     *\n     * @param \u003cO\u003e  the element type\n     * @param a  the first collection, must not be null\n     * @param b  the second collection, must not be null\n     * @param c  the comparator to use for the merge.\n     * @param includeDuplicates  if {@code true} duplicate elements will be retained, otherwise\n     *   they will be removed in the output collection\n     * @return a new sorted List, containing the elements of Collection a and b\n     * @throws NullPointerException if either collection or the comparator is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 1579,col 9)-(line 1581,col 9)",
        "(line 1582,col 9)-(line 1584,col 9)",
        "(line 1587,col 9)-(line 1588,col 90)",
        "(line 1590,col 9)-(line 1590,col 93)",
        "(line 1591,col 9)-(line 1607,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.permutations(java.util.Collection\u003cE\u003e)",
      "begin_line": 1630,
      "end_line": 1637,
      "comment": "\n     * Returns a {@link Collection} of all the permutations of the input collection.\n     * \u003cp\u003e\n     * NOTE: the number of permutations of a given collection is equal to n!, where\n     * n is the size of the collection. Thus, the resulting collection will become\n     * \u003cb\u003every\u003c/b\u003e large for collections \u0026gt; 10 (e.g. 10! \u003d 3628800, 15! \u003d 1307674368000).\n     * \u003cp\u003e\n     * For larger collections it is advised to use a {@link PermutationIterator} to\n     * iterate over all permutations.\n     *\n     * @see PermutationIterator\n     *\n     * @param \u003cE\u003e  the element type\n     * @param collection  the collection to create permutations for, may not be null\n     * @return an unordered collection of all permutations of the input collection\n     * @throws NullPointerException if collection is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 1631,col 9)-(line 1631,col 81)",
        "(line 1632,col 9)-(line 1632,col 69)",
        "(line 1633,col 9)-(line 1635,col 9)",
        "(line 1636,col 9)-(line 1636,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.retainAll(java.util.Collection\u003cC\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 1662,
      "end_line": 1664,
      "comment": "\n     * Returns a collection containing all the elements in \u003ccode\u003ecollection\u003c/code\u003e\n     * that are also in \u003ccode\u003eretain\u003c/code\u003e. The cardinality of an element \u003ccode\u003ee\u003c/code\u003e\n     * in the returned collection is the same as the cardinality of \u003ccode\u003ee\u003c/code\u003e\n     * in \u003ccode\u003ecollection\u003c/code\u003e unless \u003ccode\u003eretain\u003c/code\u003e does not contain \u003ccode\u003ee\u003c/code\u003e, in which\n     * case the cardinality is zero. This method is useful if you do not wish to modify\n     * the collection \u003ccode\u003ec\u003c/code\u003e and thus cannot call \u003ccode\u003ec.retainAll(retain);\u003c/code\u003e.\n     * \u003cp\u003e\n     * This implementation iterates over \u003ccode\u003ecollection\u003c/code\u003e, checking each element in\n     * turn to see if it\u0027s contained in \u003ccode\u003eretain\u003c/code\u003e. If it\u0027s contained, it\u0027s added\n     * to the returned list. As a consequence, it is advised to use a collection type for\n     * \u003ccode\u003eretain\u003c/code\u003e that provides a fast (e.g. O(1)) implementation of\n     * {@link Collection#contains(Object)}.\n     *\n     * @param \u003cC\u003e  the type of object the {@link Collection} contains\n     * @param collection  the collection whose contents are the target of the #retailAll operation\n     * @param retain  the collection containing the elements to be retained in the returned collection\n     * @return a \u003ccode\u003eCollection\u003c/code\u003e containing all the elements of \u003ccode\u003ecollection\u003c/code\u003e\n     * that occur at least once in \u003ccode\u003eretain\u003c/code\u003e.\n     * @throws NullPointerException if either parameter is null\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 1663,col 9)-(line 1663,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.retainAll(java.lang.Iterable\u003cE\u003e, java.lang.Iterable\u003c? extends E\u003e, org.apache.commons.collections4.Equator\u003c? super E\u003e)",
      "begin_line": 1691,
      "end_line": 1711,
      "comment": "\n     * Returns a collection containing all the elements in\n     * \u003ccode\u003ecollection\u003c/code\u003e that are also in \u003ccode\u003eretain\u003c/code\u003e. The\n     * cardinality of an element \u003ccode\u003ee\u003c/code\u003e in the returned collection is\n     * the same as the cardinality of \u003ccode\u003ee\u003c/code\u003e in \u003ccode\u003ecollection\u003c/code\u003e\n     * unless \u003ccode\u003eretain\u003c/code\u003e does not contain \u003ccode\u003ee\u003c/code\u003e, in which case\n     * the cardinality is zero. This method is useful if you do not wish to\n     * modify the collection \u003ccode\u003ec\u003c/code\u003e and thus cannot call\n     * \u003ccode\u003ec.retainAll(retain);\u003c/code\u003e.\n     * \u003cp\u003e\n     * Moreover this method uses an {@link Equator} instead of\n     * {@link Object#equals(Object)} to determine the equality of the elements\n     * in \u003ccode\u003ecollection\u003c/code\u003e and \u003ccode\u003eretain\u003c/code\u003e. Hence this method is\n     * useful in cases where the equals behavior of an object needs to be\n     * modified without changing the object itself.\n     *\n     * @param \u003cE\u003e the type of object the {@link Collection} contains\n     * @param collection the collection whose contents are the target of the {@code retainAll} operation\n     * @param retain the collection containing the elements to be retained in the returned collection\n     * @param equator the Equator used for testing equality\n     * @return a \u003ccode\u003eCollection\u003c/code\u003e containing all the elements of \u003ccode\u003ecollection\u003c/code\u003e\n     * that occur at least once in \u003ccode\u003eretain\u003c/code\u003e according to the \u003ccode\u003eequator\u003c/code\u003e\n     * @throws NullPointerException if any of the parameters is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 1695,col 9)-(line 1699,col 10)",
        "(line 1701,col 9)-(line 1702,col 79)",
        "(line 1704,col 9)-(line 1704,col 48)",
        "(line 1705,col 9)-(line 1709,col 9)",
        "(line 1710,col 9)-(line 1710,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.Anonymous-f5d7ff70-fe8c-42be-95b6-d0553ce934a7.transform(E)",
      "begin_line": 1696,
      "end_line": 1698,
      "comment": "",
      "child_ranges": [
        "(line 1697,col 17)-(line 1697,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.removeAll(java.util.Collection\u003cE\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 1736,
      "end_line": 1738,
      "comment": "\n     * Removes the elements in \u003ccode\u003eremove\u003c/code\u003e from \u003ccode\u003ecollection\u003c/code\u003e. That is, this\n     * method returns a collection containing all the elements in \u003ccode\u003ec\u003c/code\u003e\n     * that are not in \u003ccode\u003eremove\u003c/code\u003e. The cardinality of an element \u003ccode\u003ee\u003c/code\u003e\n     * in the returned collection is the same as the cardinality of \u003ccode\u003ee\u003c/code\u003e\n     * in \u003ccode\u003ecollection\u003c/code\u003e unless \u003ccode\u003eremove\u003c/code\u003e contains \u003ccode\u003ee\u003c/code\u003e, in which\n     * case the cardinality is zero. This method is useful if you do not wish to modify\n     * the collection \u003ccode\u003ec\u003c/code\u003e and thus cannot call \u003ccode\u003ecollection.removeAll(remove);\u003c/code\u003e.\n     * \u003cp\u003e\n     * This implementation iterates over \u003ccode\u003ecollection\u003c/code\u003e, checking each element in\n     * turn to see if it\u0027s contained in \u003ccode\u003eremove\u003c/code\u003e. If it\u0027s not contained, it\u0027s added\n     * to the returned list. As a consequence, it is advised to use a collection type for\n     * \u003ccode\u003eremove\u003c/code\u003e that provides a fast (e.g. O(1)) implementation of\n     * {@link Collection#contains(Object)}.\n     *\n     * @param \u003cE\u003e  the type of object the {@link Collection} contains\n     * @param collection  the collection from which items are removed (in the returned collection)\n     * @param remove  the items to be removed from the returned \u003ccode\u003ecollection\u003c/code\u003e\n     * @return a \u003ccode\u003eCollection\u003c/code\u003e containing all the elements of \u003ccode\u003ecollection\u003c/code\u003e except\n     * any elements that also occur in \u003ccode\u003eremove\u003c/code\u003e.\n     * @throws NullPointerException if either parameter is null\n     * @since 4.0 (method existed in 3.2 but was completely broken)\n     ",
      "child_ranges": [
        "(line 1737,col 9)-(line 1737,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.removeAll(java.lang.Iterable\u003cE\u003e, java.lang.Iterable\u003c? extends E\u003e, org.apache.commons.collections4.Equator\u003c? super E\u003e)",
      "begin_line": 1766,
      "end_line": 1786,
      "comment": "\n     * Removes all elements in \u003ccode\u003eremove\u003c/code\u003e from \u003ccode\u003ecollection\u003c/code\u003e.\n     * That is, this method returns a collection containing all the elements in\n     * \u003ccode\u003ecollection\u003c/code\u003e that are not in \u003ccode\u003eremove\u003c/code\u003e. The\n     * cardinality of an element \u003ccode\u003ee\u003c/code\u003e in the returned collection is\n     * the same as the cardinality of \u003ccode\u003ee\u003c/code\u003e in \u003ccode\u003ecollection\u003c/code\u003e\n     * unless \u003ccode\u003eremove\u003c/code\u003e contains \u003ccode\u003ee\u003c/code\u003e, in which case the\n     * cardinality is zero. This method is useful if you do not wish to modify\n     * the collection \u003ccode\u003ec\u003c/code\u003e and thus cannot call\n     * \u003ccode\u003ecollection.removeAll(remove)\u003c/code\u003e.\n     * \u003cp\u003e\n     * Moreover this method uses an {@link Equator} instead of\n     * {@link Object#equals(Object)} to determine the equality of the elements\n     * in \u003ccode\u003ecollection\u003c/code\u003e and \u003ccode\u003eremove\u003c/code\u003e. Hence this method is\n     * useful in cases where the equals behavior of an object needs to be\n     * modified without changing the object itself.\n     *\n     * @param \u003cE\u003e the type of object the {@link Collection} contains\n     * @param collection the collection from which items are removed (in the returned collection)\n     * @param remove the items to be removed from the returned collection\n     * @param equator the Equator used for testing equality\n     * @return a \u003ccode\u003eCollection\u003c/code\u003e containing all the elements of \u003ccode\u003ecollection\u003c/code\u003e\n     * except any element that if equal according to the \u003ccode\u003eequator\u003c/code\u003e\n     * @throws NullPointerException if any of the parameters is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 1770,col 9)-(line 1774,col 10)",
        "(line 1776,col 9)-(line 1777,col 79)",
        "(line 1779,col 9)-(line 1779,col 48)",
        "(line 1780,col 9)-(line 1784,col 9)",
        "(line 1785,col 9)-(line 1785,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.Anonymous-5b530812-77d8-458d-a088-62d12894b4dc.transform(E)",
      "begin_line": 1771,
      "end_line": 1773,
      "comment": "",
      "child_ranges": [
        "(line 1772,col 17)-(line 1772,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.synchronizedCollection(java.util.Collection\u003cC\u003e)",
      "begin_line": 1813,
      "end_line": 1816,
      "comment": "\n     * Returns a synchronized collection backed by the given collection.\n     * \u003cp\u003e\n     * You must manually synchronize on the returned buffer\u0027s iterator to\n     * avoid non-deterministic behavior:\n     *\n     * \u003cpre\u003e\n     * Collection c \u003d CollectionUtils.synchronizedCollection(myCollection);\n     * synchronized (c) {\n     *     Iterator i \u003d c.iterator();\n     *     while (i.hasNext()) {\n     *         process (i.next());\n     *     }\n     * }\n     * \u003c/pre\u003e\n     *\n     * This method uses the implementation in the decorators subpackage.\n     *\n     * @param \u003cC\u003e  the type of object the {@link Collection} contains\n     * @param collection  the collection to synchronize, must not be null\n     * @return a synchronized collection backed by the given collection\n     * @throws NullPointerException if the collection is null\n     * @deprecated since 4.1, use {@link java.util.Collections#synchronizedCollection(Collection)} instead\n     ",
      "child_ranges": [
        "(line 1815,col 9)-(line 1815,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.unmodifiableCollection(java.util.Collection\u003c? extends C\u003e)",
      "begin_line": 1829,
      "end_line": 1832,
      "comment": "\n     * Returns an unmodifiable collection backed by the given collection.\n     * \u003cp\u003e\n     * This method uses the implementation in the decorators subpackage.\n     *\n     * @param \u003cC\u003e  the type of object the {@link Collection} contains\n     * @param collection  the collection to make unmodifiable, must not be null\n     * @return an unmodifiable collection backed by the given collection\n     * @throws NullPointerException if the collection is null\n     * @deprecated since 4.1, use {@link java.util.Collections#unmodifiableCollection(Collection)} instead\n     ",
      "child_ranges": [
        "(line 1831,col 9)-(line 1831,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.predicatedCollection(java.util.Collection\u003cC\u003e, org.apache.commons.collections4.Predicate\u003c? super C\u003e)",
      "begin_line": 1848,
      "end_line": 1851,
      "comment": "\n     * Returns a predicated (validating) collection backed by the given collection.\n     * \u003cp\u003e\n     * Only objects that pass the test in the given predicate can be added to the collection.\n     * Trying to add an invalid object results in an IllegalArgumentException.\n     * It is important not to use the original collection after invoking this method,\n     * as it is a backdoor for adding invalid objects.\n     *\n     * @param \u003cC\u003e the type of objects in the Collection.\n     * @param collection  the collection to predicate, must not be null\n     * @param predicate  the predicate for the collection, must not be null\n     * @return a predicated collection backed by the given collection\n     * @throws NullPointerException if the Collection is null\n     ",
      "child_ranges": [
        "(line 1850,col 9)-(line 1850,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.transformingCollection(java.util.Collection\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 1869,
      "end_line": 1872,
      "comment": "\n     * Returns a transformed bag backed by the given collection.\n     * \u003cp\u003e\n     * Each object is passed through the transformer as it is added to the\n     * Collection. It is important not to use the original collection after invoking this\n     * method, as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * Existing entries in the specified collection will not be transformed.\n     * If you want that behaviour, see {@link TransformedCollection#transformedCollection}.\n     *\n     * @param \u003cE\u003e the type of object the {@link Collection} contains\n     * @param collection  the collection to predicate, must not be null\n     * @param transformer  the transformer for the collection, must not be null\n     * @return a transformed collection backed by the given collection\n     * @throws NullPointerException if the Collection or Transformer is null\n     ",
      "child_ranges": [
        "(line 1871,col 9)-(line 1871,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.CollectionUtils.extractSingleton(java.util.Collection\u003cE\u003e)",
      "begin_line": 1883,
      "end_line": 1891,
      "comment": "\n     * Extract the lone element of the specified Collection.\n     * @param \u003cE\u003e collection type\n     * @param collection to read\n     * @return sole member of collection\n     * @throws NullPointerException if collection is null\n     * @throws IllegalArgumentException if collection is empty or contains more than one element\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 1884,col 9)-(line 1886,col 9)",
        "(line 1887,col 9)-(line 1889,col 9)",
        "(line 1890,col 9)-(line 1890,col 44)"
      ]
    }
  ]
}