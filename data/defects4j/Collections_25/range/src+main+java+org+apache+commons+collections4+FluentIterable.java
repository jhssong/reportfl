{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/FluentIterable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FluentIterable",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003cE\u003e"
      ],
      "begin_line": 64,
      "end_line": 477,
      "comment": "\n * A FluentIterable provides a powerful yet simple API for manipulating\n * Iterable instances in a fluent manner.\n * \u003cp\u003e\n * A FluentIterable can be created either from an Iterable or from a set\n * of elements. The following types of methods are provided:\n * \u003cul\u003e\n *   \u003cli\u003efluent methods which return a new {@code FluentIterable} instance,\n *       providing a view of the original iterable (e.g. filter(Predicate));\n *   \u003cli\u003econversion methods which copy the FluentIterable\u0027s contents into a\n *       new collection or array (e.g. toList());\n *   \u003cli\u003eutility methods which answer questions about the FluentIterable\u0027s\n *       contents (e.g. size(), anyMatch(Predicate)).\n *   \u003cli\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * The following example outputs the first 3 even numbers in the range [1, 10]\n * into a list:\n * \u003cpre\u003e\n * List\u0026lt;String\u0026gt; result \u003d\n *   FluentIterable\n *       .of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)\n *       .filter(new Predicate\u003cInteger\u003e() {\n *                   public boolean evaluate(Integer number) {\n *                        return number % 2 \u003d\u003d 0;\n *                   }\n *              )\n *       .transform(TransformerUtils.stringValueTransformer())\n *       .limit(3)\n *       .toList();\n * \u003c/pre\u003e\n * The resulting list will contain the following elements:\n * \u003cpre\u003e[2, 4, 6]\u003c/pre\u003e\n *\n * @param \u003cE\u003e  the element type\n * @since 4.1\n * @version $Id: $\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterable"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " A reference to the wrapped iterable. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.of(T...)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Creates a new FluentIterable from the provided elements.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator does not support {@code remove()}.\n     *\n     * @param \u003cT\u003e  the element type\n     * @param elements  the elements to be contained in the FluentIterable\n     * @return a new FluentIterable containing the provided elements\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.of(java.lang.Iterable\u003cT\u003e)",
      "begin_line": 97,
      "end_line": 106,
      "comment": "\n     * Construct a new FluentIterable from the provided iterable. If the\n     * iterable is already an instance of FluentIterable, the instance\n     * will be returned instead.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the\n     * corresponding input iterator supports it.\n     *\n     * @param \u003cT\u003e  the element type\n     * @param iterable  the iterable to wrap into a FluentIterable\n     * @return a new FluentIterable wrapping the provided iterable\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.FluentIterable.FluentIterable()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Package-private constructor, used by IterableUtils.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.FluentIterable.FluentIterable(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Create a new FluentIterable by wrapping the provided iterable.\n     * @param iterable  the iterable to wrap\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.append(E...)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "\n     * Returns a new FluentIterable whose iterator will first traverse\n     * the elements of the current iterable, followed by the provided\n     * elements.\n     *\n     * @param elements  the elements to append to the iterable\n     * @return a new iterable, combining this iterable with the elements\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.append(java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Returns a new FluentIterable whose iterator will first traverse\n     * the elements of the current iterable, followed by the elements\n     * of the provided iterable.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e iterable will be treated as an empty iterable.\n     *\n     * @param other  the other iterable to combine, may be null\n     * @return a new iterable, combining this iterable with other\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.collate(java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Returns a new FluentIterable whose iterator will traverse the\n     * elements of the current and provided iterable in natural order.\n     * \u003cp\u003e\n     * Example: natural ordering\n     * \u003cul\u003e\n     *   \u003cli\u003ethis contains elements [1, 3, 5, 7]\n     *   \u003cli\u003eother contains elements [2, 4, 6, 8]\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * The returned iterable will traverse the elements in the following\n     * order: [1, 2, 3, 4, 5, 6, 7, 8]\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e iterable will be treated as an empty iterable.\n     *\n     * @param other  the other iterable to collate, may be null\n     * @return a new iterable, collating this iterable with the other in natural order\n     * @see {@link org.apache.commons.collections4.iterators.CollatingIterator CollatingIterator}\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.collate(java.lang.Iterable\u003c? extends E\u003e, java.util.Comparator\u003c? super E\u003e)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * Returns a new FluentIterable whose iterator will traverse the\n     * elements of the current and provided iterable according to the\n     * ordering defined by an comparator.\n     * \u003cp\u003e\n     * Example: descending order\n     * \u003cul\u003e\n     *   \u003cli\u003ethis contains elements [7, 5, 3, 1]\n     *   \u003cli\u003eother contains elements [8, 6, 4, 2]\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * The returned iterable will traverse the elements in the following\n     * order: [8, 7, 6, 5, 4, 3, 2, 1]\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e iterable will be treated as an empty iterable.\n     *\n     * @param other  the other iterable to collate, may be null\n     * @param comparator  the comparator to define an ordering, may be null,\n     *   in which case natural ordering will be used\n     * @return a new iterable, collating this iterable with the other in natural order\n     * @see {@link org.apache.commons.collections4.iterators.CollatingIterator CollatingIterator}\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.eval()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * This method fully traverses an iterator of this iterable and returns\n     * a new iterable with the same contents, but without any reference\n     * to the originating iterables and/or iterators.\n     * \u003cp\u003e\n     * Calling this method is equivalent to:\n     * \u003cpre\u003e\n     *   FluentIterable\u003cE\u003e someIterable \u003d ...;\n     *   FluentIterable.of(someIterable.toList());\n     * \u003c/pre\u003e\n     *\n     * @return a new iterable with the same contents as this iterable\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.filter(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Returns a new FluentIterable whose iterator will only return\n     * elements from this iterable matching the provided predicate.\n     *\n     * @param predicate  the predicate used to filter elements\n     * @return a new iterable, providing a filtered view of this iterable\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.limit(long)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Returns a new FluentIterable whose iterator will return at most\n     * the provided maximum number of elements from this iterable.\n     *\n     * @param maxSize  the maximum number of elements\n     * @return a new iterable, providing a bounded view of this iterable\n     * @throws IllegalArgumentException if maxSize is negative\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.loop()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Returns a new FluentIterable whose iterator will loop infinitely\n     * over the elements from this iterable.\n     *\n     * @return a new iterable, providing a looping view of this iterable\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.reverse()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Returns a new FluentIterable whose iterator will traverse the\n     * elements from this iterable in reverse order.\n     *\n     * @return a new iterable, providing a reversed view of this iterable\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.skip(long)",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Returns a new FluentIterable whose iterator will skip the first\n     * N elements from this iterable.\n     *\n     * @param elementsToSkip  the number of elements to skip\n     * @return a new iterable, providing a view of this iterable by skipping\n     *   the first N elements\n     * @throws IllegalArgumentException if elementsToSkip is negative\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.transform(org.apache.commons.collections4.Transformer\u003c? super E, ? extends O\u003e)",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * Returns a new FluentIterable whose iterator will return all elements\n     * of this iterable transformed by the provided transformer.\n     *\n     * @param \u003cO\u003e  the output element type\n     * @param transformer  the transformer applied to each element\n     * @return a new iterable, providing a transformed view of this iterable\n     * @throws NullPointerException if transformer is null\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.unique()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Returns a new FluentIterable whose iterator will return a unique view\n     * of this iterable.\n     *\n     * @return a new iterable, providing a unique view of this iterable\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.zip(java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n     * Returns a new FluentIterable whose iterator will traverse\n     * the elements of this iterable and the other iterable in\n     * alternating order.\n     *\n     * @param other  the other iterable to interleave\n     * @return a new iterable, interleaving this iterable with others\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.zip(java.lang.Iterable\u003c? extends E\u003e...)",
      "begin_line": 322,
      "end_line": 328,
      "comment": "\n     * Returns a new FluentIterable whose iterator will traverse\n     * the elements of this iterable and the other iterables in\n     * alternating order.\n     *\n     * @param others  the iterables to interleave\n     * @return a new iterable, interleaving this iterable with others\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 324,col 66)",
        "(line 325,col 9)-(line 325,col 32)",
        "(line 326,col 9)-(line 326,col 65)",
        "(line 327,col 9)-(line 327,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.iterator()",
      "begin_line": 334,
      "end_line": 336,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.asEnumeration()",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\n     * Returns an Enumeration that will enumerate all elements contained\n     * in this iterable.\n     *\n     * @return an Enumeration over the elements of this iterable\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.apply(org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Applies the closure to all elements contained in this iterable.\n     *\n     * @param closure  the closure to apply to each element, may not be null\n     * @throws NullPointerException if closure is null\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.allMatch(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 369,
      "end_line": 371,
      "comment": "\n     * Checks if all elements contained in this iterable are matching the\n     * provided predicate.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterable returns true.\n     *\n     * @param predicate  the predicate to use, may not be null\n     * @return true if all elements contained in this iterable match the predicate,\n     *   false otherwise\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.anyMatch(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 383,
      "end_line": 385,
      "comment": "\n     * Checks if this iterable contains any element matching the provided predicate.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterable returns false.\n     *\n     * @param predicate  the predicate to use, may not be null\n     * @return true if at least one element contained in this iterable matches the predicate,\n     *   false otherwise\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.isEmpty()",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * Checks if this iterable is empty.\n     *\n     * @return true if this iterable does not contain any elements, false otherwise\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.contains(java.lang.Object)",
      "begin_line": 402,
      "end_line": 404,
      "comment": "\n     * Checks if the object is contained in this iterable.\n     *\n     * @param object  the object to check\n     * @return true if the object is contained in this iterable, false otherwise\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.get(int)",
      "begin_line": 416,
      "end_line": 418,
      "comment": "\n     * Returns the element at the provided position in this iterable.\n     * In order to return the element, an iterator needs to be traversed\n     * up to the requested position.\n     *\n     * @param position  the position of the element to return\n     * @return the element\n     * @throws IndexOutOfBoundsException if the provided position is outside the\n     *   valid range of this iterable: [0, size)\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.size()",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\n     * Returns the number of elements that are contained in this iterable.\n     * In order to determine the size, an iterator needs to be traversed.\n     *\n     * @return the size of this iterable\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.copyInto(java.util.Collection\u003c? super E\u003e)",
      "begin_line": 437,
      "end_line": 445,
      "comment": "\n     * Traverses an iterator of this iterable and adds all elements\n     * to the provided collection.\n     *\n     * @param collection  the collection to add the elements\n     * @throws NullPointerException if collection is null\n     ",
      "child_ranges": [
        "(line 438,col 9)-(line 440,col 9)",
        "(line 442,col 9)-(line 444,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.toArray(java.lang.Class\u003cE\u003e)",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\n     * Returns an array containing all elements of this iterable by traversing\n     * its iterator.\n     *\n     * @param arrayClass  the class of array to create\n     * @return an array of the iterable contents\n     * @throws ClassCastException if arrayClass is invalid\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.toList()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * Returns a list containing all elements of this iterable by\n     * traversing its iterator.\n     * \u003cp\u003e\n     * The returned list is guaranteed to be mutable.\n     *\n     * @return a list of the iterable contents\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.toString()",
      "begin_line": 472,
      "end_line": 475,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 48)"
      ]
    }
  ]
}