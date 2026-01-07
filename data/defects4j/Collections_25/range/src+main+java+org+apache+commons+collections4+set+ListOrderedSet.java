{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/set/ListOrderedSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ListOrderedSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.set.AbstractSerializableSetDecorator\u003cE\u003e"
      ],
      "begin_line": 55,
      "end_line": 409,
      "comment": "\n * Decorates another \u003ccode\u003eSet\u003c/code\u003e to ensure that the order of addition is\n * retained and used by the iterator.\n * \u003cp\u003e\n * If an object is added to the set for a second time, it will remain in the\n * original position in the iteration. The order can be observed from the set\n * via the iterator or toArray methods.\n * \u003cp\u003e\n * The ListOrderedSet also has various useful direct methods. These include many\n * from \u003ccode\u003eList\u003c/code\u003e, such as \u003ccode\u003eget(int)\u003c/code\u003e,\n * \u003ccode\u003eremove(int)\u003c/code\u003e and \u003ccode\u003eindexOf(int)\u003c/code\u003e. An unmodifiable\n * \u003ccode\u003eList\u003c/code\u003e view of the set can be obtained via \u003ccode\u003easList()\u003c/code\u003e.\n * \u003cp\u003e\n * This class cannot implement the \u003ccode\u003eList\u003c/code\u003e interface directly as\n * various interface methods (notably equals/hashCode) are incompatible with a\n * set.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "setOrder"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Internal list to hold the sequence of objects "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.listOrderedSet(java.util.Set\u003cE\u003e, java.util.List\u003cE\u003e)",
      "begin_line": 77,
      "end_line": 88,
      "comment": "\n     * Factory method to create an ordered set specifying the list and set to use.\n     * \u003cp\u003e\n     * The list and set must both be empty.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set the set to decorate, must be empty and not null\n     * @param list the list to decorate, must be empty and not null\n     * @return a new ordered set\n     * @throws IllegalArgumentException if set or list is null\n     * @throws IllegalArgumentException if either the set or list is not empty\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.listOrderedSet(java.util.Set\u003cE\u003e)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Factory method to create an ordered set.\n     * \u003cp\u003e\n     * An \u003ccode\u003eArrayList\u003c/code\u003e is used to retain order.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set the set to decorate, must not be null\n     * @return a new ordered set\n     * @throws IllegalArgumentException if set is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.listOrderedSet(java.util.List\u003cE\u003e)",
      "begin_line": 119,
      "end_line": 127,
      "comment": "\n     * Factory method to create an ordered set using the supplied list to retain order.\n     * \u003cp\u003e\n     * A \u003ccode\u003eHashSet\u003c/code\u003e is used for the set behaviour.\n     * \u003cp\u003e\n     * NOTE: If the list contains duplicates, the duplicates are removed,\n     * altering the specified list.\n     *\n     * @param \u003cE\u003e the element type\n     * @param list the list to decorate, must not be null\n     * @return a new ordered set\n     * @throws IllegalArgumentException if list is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 72)",
        "(line 124,col 9)-(line 124,col 48)",
        "(line 126,col 9)-(line 126,col 48)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.ListOrderedSet()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * Constructs a new empty \u003ccode\u003eListOrderedSet\u003c/code\u003e using a\n     * \u003ccode\u003eHashSet\u003c/code\u003e and an \u003ccode\u003eArrayList\u003c/code\u003e internally.\n     *\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 32)",
        "(line 138,col 9)-(line 138,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.ListOrderedSet(java.util.Set\u003cE\u003e)",
      "begin_line": 147,
      "end_line": 150,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param set the set to decorate, must not be null\n     * @throws IllegalArgumentException if set is null\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 19)",
        "(line 149,col 9)-(line 149,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.ListOrderedSet(java.util.Set\u003cE\u003e, java.util.List\u003cE\u003e)",
      "begin_line": 162,
      "end_line": 168,
      "comment": "\n     * Constructor that wraps (not copies) the Set and specifies the list to\n     * use.\n     * \u003cp\u003e\n     * The set and list must both be correctly initialised to the same elements.\n     *\n     * @param set the set to decorate, must not be null\n     * @param list the list to decorate, must not be null\n     * @throws IllegalArgumentException if set or list is null\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 19)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.asList()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Gets an unmodifiable view of the order of the Set.\n     *\n     * @return an unmodifiable list view\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.clear()",
      "begin_line": 181,
      "end_line": 185,
      "comment": " -----------------------------------------------------------------------",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 28)",
        "(line 184,col 9)-(line 184,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.iterator()",
      "begin_line": 187,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.add(E)",
      "begin_line": 192,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 201,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 31)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.remove(java.lang.Object)",
      "begin_line": 210,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 58)",
        "(line 213,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 216,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 219,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 31)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 237,
      "end_line": 253,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * This implementation iterates over the elements of this set, checking\n     * each element in turn to see if it\u0027s contained in \u003ccode\u003ecoll\u003c/code\u003e.\n     * If it\u0027s not contained, it\u0027s removed from this set. As a consequence,\n     * it is advised to use a collection type for \u003ccode\u003ecoll\u003c/code\u003e that provides\n     * a fast (e.g. O(1)) implementation of {@link Collection#contains(Object)}.\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 53)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.toArray()",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.toArray(T[])",
      "begin_line": 260,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.get(int)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Returns the element at the specified position in this ordered set.\n     *\n     * @param index the position of the element in the ordered {@link Set}.\n     * @return the element at position {@code index}\n     * @see List#get(int)\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.indexOf(java.lang.Object)",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Returns the index of the first occurrence of the specified element in\n     * ordered set.\n     *\n     * @param object the element to search for\n     * @return the index of the first occurrence of the object, or {@code -1} if\n     *         this ordered set does not contain this object\n     * @see List#indexOf(Object)\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.add(int, E)",
      "begin_line": 302,
      "end_line": 307,
      "comment": "\n     * Inserts the specified element at the specified position if it is not yet\n     * contained in this ordered set (optional operation). Shifts the element\n     * currently at this position and any subsequent elements to the right.\n     *\n     * @param index the index at which the element is to be inserted\n     * @param object the element to be inserted\n     * @see List#add(int, Object)\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 306,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.addAll(int, java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 320,
      "end_line": 338,
      "comment": "\n     * Inserts all elements in the specified collection not yet contained in the\n     * ordered set at the specified position (optional operation). Shifts the\n     * element currently at the position and all subsequent elements to the\n     * right.\n     *\n     * @param index the position to insert the elements\n     * @param coll the collection containing the elements to be inserted\n     * @return {@code true} if this ordered set changed as a result of the call\n     * @see List#addAll(int, Collection)\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 32)",
        "(line 323,col 9)-(line 323,col 49)",
        "(line 324,col 9)-(line 331,col 9)",
        "(line 333,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 337,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.remove(int)",
      "begin_line": 348,
      "end_line": 352,
      "comment": "\n     * Removes the element at the specified position from the ordered set.\n     * Shifts any subsequent elements to the left.\n     *\n     * @param index the index of the element to be removed\n     * @return the element that has been remove from the ordered set\n     * @see List#remove(int)\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 45)",
        "(line 350,col 9)-(line 350,col 20)",
        "(line 351,col 9)-(line 351,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.toString()",
      "begin_line": 362,
      "end_line": 365,
      "comment": " Fortunately List.toString and Set.toString look the same",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OrderedSetIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractIteratorDecorator\u003cE\u003e",
        "org.apache.commons.collections4.OrderedIterator\u003cE\u003e"
      ],
      "begin_line": 371,
      "end_line": 407,
      "comment": "\n     * Internal iterator handle remove.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "set"
      ],
      "begin_line": 376,
      "end_line": 376,
      "comment": " Object we iterate on "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 379,
      "end_line": 379,
      "comment": " Last object retrieved "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.OrderedSetIterator.OrderedSetIterator(java.util.ListIterator\u003cE\u003e, java.util.Collection\u003cE\u003e)",
      "begin_line": 381,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 28)",
        "(line 383,col 13)-(line 383,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.OrderedSetIterator.next()",
      "begin_line": 386,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 388,col 13)-(line 388,col 40)",
        "(line 389,col 13)-(line 389,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.OrderedSetIterator.remove()",
      "begin_line": 392,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 394,col 13)-(line 394,col 29)",
        "(line 395,col 13)-(line 395,col 35)",
        "(line 396,col 13)-(line 396,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.OrderedSetIterator.hasPrevious()",
      "begin_line": 399,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 400,col 13)-(line 400,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.set.ListOrderedSet.OrderedSetIterator.previous()",
      "begin_line": 403,
      "end_line": 406,
      "comment": "",
      "child_ranges": [
        "(line 404,col 13)-(line 404,col 64)",
        "(line 405,col 13)-(line 405,col 24)"
      ]
    }
  ]
}