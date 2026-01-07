{
  "filepath": "/tmp/Lang-16b/src/main/java/org/apache/commons/lang3/compare/FixedOrderComparator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FixedOrderComparator",
      "is_interface": false,
      "parent_types": [
        "java.util.Comparator\u003cT\u003e"
      ],
      "begin_line": 46,
      "end_line": 243,
      "comment": "\n * A Comparator which imposes a specific order on a specific set of Objects.\n * Objects are presented to the FixedOrderComparator in a specified order and\n * subsequent calls to {@link #compare(Object, Object) compare} yield that order.\n * For example:\n * \u003cpre\u003e\n * String[] planets \u003d {\"Mercury\", \"Venus\", \"Earth\", \"Mars\"};\n * FixedOrderComparator distanceFromSun \u003d new FixedOrderComparator(planets);\n * Arrays.sort(planets);                     // Sort to alphabetical order\n * Arrays.sort(planets, distanceFromSun);    // Back to original order\n * \u003c/pre\u003e\n * \u003cp\u003e\n * Once \u003ccode\u003ecompare\u003c/code\u003e has been called, the FixedOrderComparator is locked\n * and attempts to modify it yield an UnsupportedOperationException.\n * \u003cp\u003e\n * Instances of FixedOrderComparator are not synchronized.  The class is not\n * thread-safe at construction time, but it is thread-safe to perform\n * multiple comparisons  after all the setup operations are complete.\n *\n * @since Commons Collections 3.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Internal map of object to position "
    },
    {
      "type": "field",
      "varNames": [
        "counter"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Counter used in determining the position in the map "
    },
    {
      "type": "field",
      "varNames": [
        "isLocked"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Is the comparator locked against further change "
    },
    {
      "type": "field",
      "varNames": [
        "unknownObjectBehavior"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " The behaviour in the case of an unknown object "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.compare.FixedOrderComparator.FixedOrderComparator()",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Constructs an empty FixedOrderComparator.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.compare.FixedOrderComparator.FixedOrderComparator(T[])",
      "begin_line": 86,
      "end_line": 94,
      "comment": "\n     * Constructs a FixedOrderComparator which uses the order of the given array\n     * to compare the objects.\n     * \u003cp\u003e\n     * The array is copied, so later changes will not affect the comparator.\n     *\n     * @param items  the items that the comparator can compare in order\n     * @throws IllegalArgumentException if the array is null\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 16)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.compare.FixedOrderComparator.FixedOrderComparator(java.util.List\u003cT\u003e)",
      "begin_line": 105,
      "end_line": 113,
      "comment": "\n     * Constructs a FixedOrderComparator which uses the order of the given list\n     * to compare the objects.\n     * \u003cp\u003e\n     * The list is copied, so later changes will not affect the comparator.\n     *\n     * @param items  the items that the comparator can compare in order\n     * @throws IllegalArgumentException if the list is null\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 16)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.FixedOrderComparator.isLocked()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Returns true if modifications cannot be made to the FixedOrderComparator.\n     * FixedOrderComparators cannot be modified once they have performed a comparison.\n     *\n     * @return true if attempts to change the FixedOrderComparator yield an\n     *  UnsupportedOperationException, false if it can be changed.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.FixedOrderComparator.checkLocked()",
      "begin_line": 133,
      "end_line": 137,
      "comment": "\n     * Checks to see whether the comparator is now locked against further changes.\n     *\n     * @throws UnsupportedOperationException if the comparator is locked\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.FixedOrderComparator.getUnknownObjectBehavior()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Gets the behavior for comparing unknown objects.\n     *\n     * @return {@link UnknownObjectBehavior}\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.FixedOrderComparator.setUnknownObjectBehavior(org.apache.commons.lang3.compare.FixedOrderComparator.UnknownObjectBehavior)",
      "begin_line": 156,
      "end_line": 162,
      "comment": "\n     * Sets the behavior for comparing unknown objects.\n     *\n     * @param unknownObjectBehavior  the flag for unknown behaviour -\n     * UNKNOWN_AFTER, UNKNOWN_BEFORE or UNKNOWN_THROW_EXCEPTION\n     * @throws UnsupportedOperationException if a comparison has been performed\n     * @throws IllegalArgumentException if the unknown flag is not valid\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 22)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.FixedOrderComparator.add(T)",
      "begin_line": 176,
      "end_line": 180,
      "comment": "\n     * Adds an item, which compares as after all items known to the Comparator.\n     * If the item is already known to the Comparator, its old position is\n     * replaced with the new position.\n     *\n     * @param obj  the item to be added to the Comparator.\n     * @return true if obj has been added for the first time, false if\n     *  it was already known to the Comparator.\n     * @throws UnsupportedOperationException if a comparison has already been made\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 22)",
        "(line 178,col 9)-(line 178,col 64)",
        "(line 179,col 9)-(line 179,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.FixedOrderComparator.addAsEqual(T, T)",
      "begin_line": 195,
      "end_line": 203,
      "comment": "\n     * Adds a new item, which compares as equal to the given existing item.\n     *\n     * @param existingObj  an item already in the Comparator\u0027s set of\n     *  known objects\n     * @param newObj  an item to be added to the Comparator\u0027s set of\n     *  known objects\n     * @return true if newObj has been added for the first time, false if\n     *  it was already known to the Comparator.\n     * @throws IllegalArgumentException if existingObject is not in the\n     *  Comparator\u0027s set of known objects.\n     * @throws UnsupportedOperationException if a comparison has already been made\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 22)",
        "(line 197,col 9)-(line 197,col 48)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 51)",
        "(line 202,col 9)-(line 202,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.compare.FixedOrderComparator.compare(T, T)",
      "begin_line": 221,
      "end_line": 241,
      "comment": "\n     * Compares two objects according to the order of this Comparator.\n     * \u003cp\u003e\n     * It is important to note that this class will throw an IllegalArgumentException\n     * in the case of an unrecognised object. This is not specified in the\n     * Comparator interface, but is the most appropriate exception.\n     *\n     * @param obj1  the first object to compare\n     * @param obj2  the second object to compare\n     * @return negative if obj1 is less, positive if greater, zero if equal\n     * @throws IllegalArgumentException if obj1 or obj2 are not known\n     *  to this Comparator and an alternative behavior has not been set\n     *  via {@link #setUnknownObjectBehavior(UnknownObjectBehavior)}.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 24)",
        "(line 223,col 9)-(line 223,col 42)",
        "(line 224,col 9)-(line 224,col 42)",
        "(line 225,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 46)"
      ]
    }
  ]
}