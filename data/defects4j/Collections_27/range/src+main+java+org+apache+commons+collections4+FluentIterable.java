{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/FluentIterable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FluentIterable",
      "is_interface": false,
      "parent_types": [
        "java.lang.Iterable\u003cE\u003e"
      ],
      "begin_line": 66,
      "end_line": 505,
      "comment": "\n * A FluentIterable provides a powerful yet simple API for manipulating\n * Iterable instances in a fluent manner.\n * \u003cp\u003e\n * A FluentIterable can be created either from an Iterable or from a set\n * of elements. The following types of methods are provided:\n * \u003cul\u003e\n *   \u003cli\u003efluent methods which return a new {@code FluentIterable} instance,\n *       providing a view of the original iterable (e.g. filter(Predicate));\n *   \u003cli\u003econversion methods which copy the FluentIterable\u0027s contents into a\n *       new collection or array (e.g. toList());\n *   \u003cli\u003eutility methods which answer questions about the FluentIterable\u0027s\n *       contents (e.g. size(), anyMatch(Predicate)).\n *   \u003cli\u003e\n * \u003c/ul\u003e\n * \u003cp\u003e\n * The following example outputs the first 3 even numbers in the range [1, 10]\n * into a list:\n * \u003cpre\u003e\n * List\u0026lt;String\u0026gt; result \u003d\n *   FluentIterable\n *       .of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)\n *       .filter(new Predicate\u003cInteger\u003e() {\n *                   public boolean evaluate(Integer number) {\n *                        return number % 2 \u003d\u003d 0;\n *                   }\n *              )\n *       .transform(TransformerUtils.stringValueTransformer())\n *       .limit(3)\n *       .toList();\n * \u003c/pre\u003e\n * The resulting list will contain the following elements:\n * \u003cpre\u003e[2, 4, 6]\u003c/pre\u003e\n *\n * @param \u003cE\u003e  the element type\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterable"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " A reference to the wrapped iterable. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.empty()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * Creates a new empty FluentIterable.\n     *\n     * @param \u003cT\u003e  the element type\n     * @return a new empty FluentIterable\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.of(T)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Creates a new FluentIterable of the single provided element.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator does not support {@code remove()}.\n     *\n     * @param \u003cT\u003e  the element type\n     * @param singleton  the singleton element\n     * @return a new FluentIterable containing the singleton\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.of(T...)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Creates a new FluentIterable from the provided elements.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator does not support {@code remove()}.\n     *\n     * @param \u003cT\u003e  the element type\n     * @param elements  the elements to be contained in the FluentIterable\n     * @return a new FluentIterable containing the provided elements\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.of(java.lang.Iterable\u003cT\u003e)",
      "begin_line": 124,
      "end_line": 131,
      "comment": "\n     * Construct a new FluentIterable from the provided iterable. If the\n     * iterable is already an instance of FluentIterable, the instance\n     * will be returned instead.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the\n     * corresponding input iterator supports it.\n     *\n     * @param \u003cT\u003e  the element type\n     * @param iterable  the iterable to wrap into a FluentIterable, may not be null\n     * @return a new FluentIterable wrapping the provided iterable\n     * @throws NullPointerException if iterable is null\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 45)",
        "(line 126,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.FluentIterable.FluentIterable()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * Package-private constructor, used by IterableUtils.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 29)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.FluentIterable.FluentIterable(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Create a new FluentIterable by wrapping the provided iterable.\n     * @param iterable  the iterable to wrap\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.append(E...)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Returns a new FluentIterable whose iterator will first traverse\n     * the elements of the current iterable, followed by the provided\n     * elements.\n     *\n     * @param elements  the elements to append to the iterable\n     * @return a new iterable, combining this iterable with the elements\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.append(java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Returns a new FluentIterable whose iterator will first traverse\n     * the elements of the current iterable, followed by the elements\n     * of the provided iterable.\n     *\n     * @param other  the other iterable to combine, may not be null\n     * @return a new iterable, combining this iterable with other\n     * @throws NullPointerException if other is null\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.collate(java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Returns a new FluentIterable whose iterator will traverse the\n     * elements of the current and provided iterable in natural order.\n     * \u003cp\u003e\n     * Example: natural ordering\n     * \u003cul\u003e\n     *   \u003cli\u003ethis contains elements [1, 3, 5, 7]\n     *   \u003cli\u003eother contains elements [2, 4, 6, 8]\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * The returned iterable will traverse the elements in the following\n     * order: [1, 2, 3, 4, 5, 6, 7, 8]\n     *\n     * @param other  the other iterable to collate, may not be null\n     * @return a new iterable, collating this iterable with the other in natural order\n     * @throws NullPointerException if other is null\n     * @see {@link org.apache.commons.collections4.iterators.CollatingIterator CollatingIterator}\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.collate(java.lang.Iterable\u003c? extends E\u003e, java.util.Comparator\u003c? super E\u003e)",
      "begin_line": 222,
      "end_line": 225,
      "comment": "\n     * Returns a new FluentIterable whose iterator will traverse the\n     * elements of the current and provided iterable according to the\n     * ordering defined by an comparator.\n     * \u003cp\u003e\n     * Example: descending order\n     * \u003cul\u003e\n     *   \u003cli\u003ethis contains elements [7, 5, 3, 1]\n     *   \u003cli\u003eother contains elements [8, 6, 4, 2]\n     * \u003c/ul\u003e\n     * \u003cp\u003e\n     * The returned iterable will traverse the elements in the following\n     * order: [8, 7, 6, 5, 4, 3, 2, 1]\n     *\n     * @param comparator  the comparator to define an ordering, may be null,\n     *   in which case natural ordering will be used\n     * @param other  the other iterable to collate, may not be null\n     * @return a new iterable, collating this iterable with the other in natural order\n     * @throws NullPointerException if other is null\n     * @see {@link org.apache.commons.collections4.iterators.CollatingIterator CollatingIterator}\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.eval()",
      "begin_line": 240,
      "end_line": 242,
      "comment": "\n     * This method fully traverses an iterator of this iterable and returns\n     * a new iterable with the same contents, but without any reference\n     * to the originating iterables and/or iterators.\n     * \u003cp\u003e\n     * Calling this method is equivalent to:\n     * \u003cpre\u003e\n     *   FluentIterable\u003cE\u003e someIterable \u003d ...;\n     *   FluentIterable.of(someIterable.toList());\n     * \u003c/pre\u003e\n     *\n     * @return a new iterable with the same contents as this iterable\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.filter(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * Returns a new FluentIterable whose iterator will only return\n     * elements from this iterable matching the provided predicate.\n     *\n     * @param predicate  the predicate used to filter elements\n     * @return a new iterable, providing a filtered view of this iterable\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.limit(long)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Returns a new FluentIterable whose iterator will return at most\n     * the provided maximum number of elements from this iterable.\n     *\n     * @param maxSize  the maximum number of elements\n     * @return a new iterable, providing a bounded view of this iterable\n     * @throws IllegalArgumentException if maxSize is negative\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.loop()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n     * Returns a new FluentIterable whose iterator will loop infinitely\n     * over the elements from this iterable.\n     *\n     * @return a new iterable, providing a looping view of this iterable\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.reverse()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * Returns a new FluentIterable whose iterator will traverse the\n     * elements from this iterable in reverse order.\n     *\n     * @return a new iterable, providing a reversed view of this iterable\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.skip(long)",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * Returns a new FluentIterable whose iterator will skip the first\n     * N elements from this iterable.\n     *\n     * @param elementsToSkip  the number of elements to skip\n     * @return a new iterable, providing a view of this iterable by skipping\n     *   the first N elements\n     * @throws IllegalArgumentException if elementsToSkip is negative\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.transform(org.apache.commons.collections4.Transformer\u003c? super E, ? extends O\u003e)",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n     * Returns a new FluentIterable whose iterator will return all elements\n     * of this iterable transformed by the provided transformer.\n     *\n     * @param \u003cO\u003e  the output element type\n     * @param transformer  the transformer applied to each element\n     * @return a new iterable, providing a transformed view of this iterable\n     * @throws NullPointerException if transformer is null\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.unique()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Returns a new FluentIterable whose iterator will return a unique view\n     * of this iterable.\n     *\n     * @return a new iterable, providing a unique view of this iterable\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.unmodifiable()",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n     * Returns a new FluentIterable whose iterator will return an unmodifiable\n     * view of this iterable.\n     *\n     * @return a new iterable, providing an unmodifiable view of this iterable\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.zip(java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Returns a new FluentIterable whose iterator will traverse\n     * the elements of this iterable and the other iterable in\n     * alternating order.\n     *\n     * @param other  the other iterable to interleave, may not be null\n     * @return a new iterable, interleaving this iterable with others\n     * @throws NullPointerException if other is null\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.zip(java.lang.Iterable\u003c? extends E\u003e...)",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\n     * Returns a new FluentIterable whose iterator will traverse\n     * the elements of this iterable and the other iterables in\n     * alternating order.\n     *\n     * @param others  the iterables to interleave, may not be null\n     * @return a new iterable, interleaving this iterable with others\n     * @throws NullPointerException if either of the provided iterables is null\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.iterator()",
      "begin_line": 364,
      "end_line": 367,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.asEnumeration()",
      "begin_line": 375,
      "end_line": 377,
      "comment": "\n     * Returns an Enumeration that will enumerate all elements contained\n     * in this iterable.\n     *\n     * @return an Enumeration over the elements of this iterable\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.allMatch(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 390,
      "end_line": 392,
      "comment": "\n     * Checks if all elements contained in this iterable are matching the\n     * provided predicate.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterable returns true.\n     *\n     * @param predicate  the predicate to use, may not be null\n     * @return true if all elements contained in this iterable match the predicate,\n     *   false otherwise\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.anyMatch(org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 404,
      "end_line": 406,
      "comment": "\n     * Checks if this iterable contains any element matching the provided predicate.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterable returns false.\n     *\n     * @param predicate  the predicate to use, may not be null\n     * @return true if at least one element contained in this iterable matches the predicate,\n     *   false otherwise\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.isEmpty()",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\n     * Checks if this iterable is empty.\n     *\n     * @return true if this iterable does not contain any elements, false otherwise\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.contains(java.lang.Object)",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\n     * Checks if the object is contained in this iterable.\n     *\n     * @param object  the object to check\n     * @return true if the object is contained in this iterable, false otherwise\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.forEach(org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 433,
      "end_line": 435,
      "comment": "\n     * Applies the closure to all elements contained in this iterable.\n     *\n     * @param closure  the closure to apply to each element, may not be null\n     * @throws NullPointerException if closure is null\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.get(int)",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n     * Returns the element at the provided position in this iterable.\n     * In order to return the element, an iterator needs to be traversed\n     * up to the requested position.\n     *\n     * @param position  the position of the element to return\n     * @return the element\n     * @throws IndexOutOfBoundsException if the provided position is outside the\n     *   valid range of this iterable: [0, size)\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.size()",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\n     * Returns the number of elements that are contained in this iterable.\n     * In order to determine the size, an iterator needs to be traversed.\n     *\n     * @return the size of this iterable\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.copyInto(java.util.Collection\u003c? super E\u003e)",
      "begin_line": 468,
      "end_line": 473,
      "comment": "\n     * Traverses an iterator of this iterable and adds all elements\n     * to the provided collection.\n     *\n     * @param collection  the collection to add the elements\n     * @throws NullPointerException if collection is null\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.toArray(java.lang.Class\u003cE\u003e)",
      "begin_line": 483,
      "end_line": 485,
      "comment": "\n     * Returns an array containing all elements of this iterable by traversing\n     * its iterator.\n     *\n     * @param arrayClass  the class of array to create\n     * @return an array of the iterable contents\n     * @throws ArrayStoreException if arrayClass is invalid\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.toList()",
      "begin_line": 495,
      "end_line": 497,
      "comment": "\n     * Returns a mutable list containing all elements of this iterable\n     * by traversing its iterator.\n     * \u003cp\u003e\n     * The returned list is guaranteed to be mutable.\n     *\n     * @return a list of the iterable contents\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.FluentIterable.toString()",
      "begin_line": 500,
      "end_line": 503,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 48)"
      ]
    }
  ]
}