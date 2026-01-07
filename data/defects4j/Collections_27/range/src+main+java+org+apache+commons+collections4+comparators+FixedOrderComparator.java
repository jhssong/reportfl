{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/comparators/FixedOrderComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedOrderComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cT\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 299,
      "comment": "\n * A Comparator which imposes a specific order on a specific set of Objects.\n * Objects are presented to the FixedOrderComparator in a specified order and\n * subsequent calls to {@link #compare(Object, Object) compare} yield that order.\n * For example:\n * \u003cpre\u003e\n * String[] planets \u003d {\"Mercury\", \"Venus\", \"Earth\", \"Mars\"};\n * FixedOrderComparator distanceFromSun \u003d new FixedOrderComparator(planets);\n * Arrays.sort(planets);                     // Sort to alphabetical order\n * Arrays.sort(planets, distanceFromSun);    // Back to original order\n * \u003c/pre\u003e\n * \u003cp\u003e\n * Once \u003ccode\u003ecompare\u003c/code\u003e has been called, the FixedOrderComparator is locked\n * and attempts to modify it yield an UnsupportedOperationException.\n * \u003cp\u003e\n * Instances of FixedOrderComparator are not synchronized.  The class is not\n * thread-safe at construction time, but it is thread-safe to perform\n * multiple comparisons  after all the setup operations are complete.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 4.0.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Serialization version from Collections 4.0. "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Internal map of object to position "
    },
    {
      "type": "field",
      "varNames": [
        "counter"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Counter used in determining the position in the map "
    },
    {
      "type": "field",
      "varNames": [
        "isLocked"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Is the comparator locked against further change "
    },
    {
      "type": "field",
      "varNames": [
        "unknownObjectBehavior"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The behaviour in the case of an unknown object "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.FixedOrderComparator.FixedOrderComparator()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Constructs an empty FixedOrderComparator.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.FixedOrderComparator.FixedOrderComparator(T...)",
      "begin_line": 92,
      "end_line": 100,
      "comment": "\n     * Constructs a FixedOrderComparator which uses the order of the given array\n     * to compare the objects.\n     * \u003cp\u003e\n     * The array is copied, so later changes will not affect the comparator.\n     *\n     * @param items  the items that the comparator can compare in order\n     * @throws NullPointerException if the array is null\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 16)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.comparators.FixedOrderComparator.FixedOrderComparator(java.util.List\u003cT\u003e)",
      "begin_line": 111,
      "end_line": 119,
      "comment": "\n     * Constructs a FixedOrderComparator which uses the order of the given list\n     * to compare the objects.\n     * \u003cp\u003e\n     * The list is copied, so later changes will not affect the comparator.\n     *\n     * @param items  the items that the comparator can compare in order\n     * @throws NullPointerException if the list is null\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 16)",
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.FixedOrderComparator.isLocked()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Returns true if modifications cannot be made to the FixedOrderComparator.\n     * FixedOrderComparators cannot be modified once they have performed a comparison.\n     *\n     * @return true if attempts to change the FixedOrderComparator yield an\n     *  UnsupportedOperationException, false if it can be changed.\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.FixedOrderComparator.checkLocked()",
      "begin_line": 139,
      "end_line": 143,
      "comment": "\n     * Checks to see whether the comparator is now locked against further changes.\n     *\n     * @throws UnsupportedOperationException if the comparator is locked\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.FixedOrderComparator.getUnknownObjectBehavior()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Gets the behavior for comparing unknown objects.\n     *\n     * @return {@link UnknownObjectBehavior}\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.FixedOrderComparator.setUnknownObjectBehavior(org.apache.commons.collections4.comparators.FixedOrderComparator.UnknownObjectBehavior)",
      "begin_line": 162,
      "end_line": 168,
      "comment": "\n     * Sets the behavior for comparing unknown objects.\n     *\n     * @param unknownObjectBehavior  the flag for unknown behaviour -\n     * UNKNOWN_AFTER, UNKNOWN_BEFORE or UNKNOWN_THROW_EXCEPTION\n     * @throws UnsupportedOperationException if a comparison has been performed\n     * @throws NullPointerException if unknownObjectBehavior is null\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 22)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.FixedOrderComparator.add(T)",
      "begin_line": 182,
      "end_line": 186,
      "comment": "\n     * Adds an item, which compares as after all items known to the Comparator.\n     * If the item is already known to the Comparator, its old position is\n     * replaced with the new position.\n     *\n     * @param obj  the item to be added to the Comparator.\n     * @return true if obj has been added for the first time, false if\n     *  it was already known to the Comparator.\n     * @throws UnsupportedOperationException if a comparison has already been made\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 22)",
        "(line 184,col 9)-(line 184,col 74)",
        "(line 185,col 9)-(line 185,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.FixedOrderComparator.addAsEqual(T, T)",
      "begin_line": 201,
      "end_line": 209,
      "comment": "\n     * Adds a new item, which compares as equal to the given existing item.\n     *\n     * @param existingObj  an item already in the Comparator\u0027s set of\n     *  known objects\n     * @param newObj  an item to be added to the Comparator\u0027s set of\n     *  known objects\n     * @return true if newObj has been added for the first time, false if\n     *  it was already known to the Comparator.\n     * @throws IllegalArgumentException if existingObject is not in the\n     *  Comparator\u0027s set of known objects.\n     * @throws UnsupportedOperationException if a comparison has already been made\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 22)",
        "(line 203,col 9)-(line 203,col 54)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 57)",
        "(line 208,col 9)-(line 208,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.FixedOrderComparator.compare(T, T)",
      "begin_line": 227,
      "end_line": 248,
      "comment": "\n     * Compares two objects according to the order of this Comparator.\n     * \u003cp\u003e\n     * It is important to note that this class will throw an IllegalArgumentException\n     * in the case of an unrecognised object. This is not specified in the\n     * Comparator interface, but is the most appropriate exception.\n     *\n     * @param obj1  the first object to compare\n     * @param obj2  the second object to compare\n     * @return negative if obj1 is less, positive if greater, zero if equal\n     * @throws IllegalArgumentException if obj1 or obj2 are not known\n     *  to this Comparator and an alternative behavior has not been set\n     *  via {@link #setUnknownObjectBehavior(UnknownObjectBehavior)}.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 24)",
        "(line 230,col 9)-(line 230,col 48)",
        "(line 231,col 9)-(line 231,col 48)",
        "(line 232,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 247,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.FixedOrderComparator.hashCode()",
      "begin_line": 257,
      "end_line": 265,
      "comment": "\n     * Implement a hash code for this comparator that is consistent with\n     * {@link #equals(Object) equals}.\n     *\n     * @return a hash code for this comparator.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 23)",
        "(line 260,col 9)-(line 260,col 62)",
        "(line 261,col 9)-(line 261,col 98)",
        "(line 262,col 9)-(line 262,col 35)",
        "(line 263,col 9)-(line 263,col 46)",
        "(line 264,col 9)-(line 264,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.comparators.FixedOrderComparator.equals(java.lang.Object)",
      "begin_line": 279,
      "end_line": 297,
      "comment": "\n     * Returns \u003ccode\u003etrue\u003c/code\u003e iff \u003ci\u003ethat\u003c/i\u003e Object is\n     * is a {@link Comparator} whose ordering is known to be\n     * equivalent to mine.\n     * \u003cp\u003e\n     * This implementation returns \u003ccode\u003etrue\u003c/code\u003e\n     * iff \u003ccode\u003e\u003ci\u003ethat\u003c/i\u003e\u003c/code\u003e is a {@link FixedOrderComparator}\n     * whose attributes are equal to mine.\n     *\n     * @param object  the object to compare to\n     * @return true if equal\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 21)"
      ]
    }
  ]
}