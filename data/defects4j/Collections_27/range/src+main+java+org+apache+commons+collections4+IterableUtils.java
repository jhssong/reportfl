{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/IterableUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterableUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 1083,
      "comment": "\n * Provides utility methods and decorators for {@link Iterable} instances.\n * \u003cp\u003e\n * \u003cb\u003eNote\u003c/b\u003e: this util class has been designed for fail-fast argument checking.\n * \u003cul\u003e\n * \u003cli\u003e\n * all decorator methods are \u003cb\u003eNOT\u003c/b\u003e null-safe wrt the provided Iterable argument, i.e.\n * they will throw a {@link NullPointerException} if a null Iterable is passed as argument.\n * \u003cli\u003e\n * all other utility methods are null-safe wrt the provided Iterable argument, i.e. they will\n * treat a null Iterable the same way as an empty one. Other arguments which are null,\n * e.g. a {@link Predicate}, will result in a {@link NullPointerException}. Exception: passing\n * a null {@link Comparator} is equivalent to a Comparator with natural ordering.\n * \u003c/ul\u003e\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_ITERABLE"
      ],
      "begin_line": 55,
      "end_line": 61,
      "comment": "\n     * An empty iterable.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-27695444-e94f-4870-ab78-87669c7f0514.iterator()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 13)-(line 59,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.emptyIterable()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Gets an empty iterable.\n     * \u003cp\u003e\n     * This iterable does not contain any elements.\n     *\n     * @param \u003cE\u003e the element type\n     * @return an empty iterable\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.chainedIterable(java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 98,
      "end_line": 102,
      "comment": "\n     * Combines two iterables into a single iterable.\n     * \u003cp\u003e\n     * The returned iterable has an iterator that traverses the elements in {@code a},\n     * followed by the elements in {@code b}. The source iterators are not polled until\n     * necessary.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e the element type\n     * @param a  the first iterable, may not be null\n     * @param b  the second iterable, may not be null\n     * @return a new iterable, combining the provided iterables\n     * @throws NullPointerException if either a or b is null\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.chainedIterable(java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 121,
      "end_line": 126,
      "comment": "\n     * Combines three iterables into a single iterable.\n     * \u003cp\u003e\n     * The returned iterable has an iterator that traverses the elements in {@code a},\n     * followed by the elements in {@code b} and {@code c}. The source iterators are\n     * not polled until necessary.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e the element type\n     * @param a  the first iterable, may not be null\n     * @param b  the second iterable, may not be null\n     * @param c  the third iterable, may not be null\n     * @return a new iterable, combining the provided iterables\n     * @throws NullPointerException if either of the provided iterables is null\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.chainedIterable(java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 146,
      "end_line": 152,
      "comment": "\n     * Combines four iterables into a single iterable.\n     * \u003cp\u003e\n     * The returned iterable has an iterator that traverses the elements in {@code a},\n     * followed by the elements in {@code b}, {@code c} and {@code d}. The source\n     * iterators are not polled until necessary.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e the element type\n     * @param a  the first iterable, may not be null\n     * @param b  the second iterable, may not be null\n     * @param c  the third iterable, may not be null\n     * @param d  the fourth iterable, may not be null\n     * @return a new iterable, combining the provided iterables\n     * @throws NullPointerException if either of the provided iterables is null\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.chainedIterable(java.lang.Iterable\u003c? extends E\u003e...)",
      "begin_line": 169,
      "end_line": 186,
      "comment": "\n     * Combines the provided iterables into a single iterable.\n     * \u003cp\u003e\n     * The returned iterable has an iterator that traverses the elements in the order\n     * of the arguments, i.e. iterables[0], iterables[1], .... The source iterators\n     * are not polled until necessary.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterables  the iterables to combine, may not be null\n     * @return a new iterable, combining the provided iterables\n     * @throws NullPointerException if either of the provided iterables is null\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 32)",
        "(line 171,col 9)-(line 185,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-f426d178-7749-47ef-a85b-04c57a50758c.iterator()",
      "begin_line": 172,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 174,col 17)-(line 183,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-784b7df2-1ffd-4b20-bc84-3a7fe595b2f0.nextIterator(int)",
      "begin_line": 175,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 177,col 25)-(line 181,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.collatedIterable(java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 204,
      "end_line": 213,
      "comment": "\n     * Combines the two provided iterables into an ordered iterable using\n     * natural ordering.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the\n     * corresponding input iterator supports it.\n     *\n     * @param \u003cE\u003e the element type\n     * @param a  the first iterable, may not be null\n     * @param b  the second iterable, may not be null\n     * @return a filtered view on the specified iterable\n     * @throws NullPointerException if either of the provided iterables is null\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 27)",
        "(line 207,col 9)-(line 212,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-01eb32ec-b8be-439d-b44c-10838472d26e.iterator()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 210,col 17)-(line 210,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.collatedIterable(java.util.Comparator\u003c? super E\u003e, java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 231,
      "end_line": 241,
      "comment": "\n     * Combines the two provided iterables into an ordered iterable using the\n     * provided comparator. If the comparator is null, natural ordering will be\n     * used.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e the element type\n     * @param comparator  the comparator defining an ordering over the elements,\n     *   may be null, in which case natural ordering will be used\n     * @param a  the first iterable, may not be null\n     * @param b  the second iterable, may not be null\n     * @return a filtered view on the specified iterable\n     * @throws NullPointerException if either of the provided iterables is null\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 27)",
        "(line 235,col 9)-(line 240,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-4a1db9c6-2080-47bd-ab8b-78248692490e.iterator()",
      "begin_line": 236,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 238,col 17)-(line 238,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.filteredIterable(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 258,
      "end_line": 270,
      "comment": "\n     * Returns a view of the given iterable that only contains elements matching\n     * the provided predicate.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator does not support {@code remove()}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable to filter, may not be null\n     * @param predicate  the predicate used to filter elements, may not be null\n     * @return a filtered view on the specified iterable\n     * @throws NullPointerException if either iterable or predicate is null\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 31)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 269,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-0f792d66-265a-4c9e-b6f3-a61d5a9584bd.iterator()",
      "begin_line": 265,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 267,col 17)-(line 267,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.boundedIterable(java.lang.Iterable\u003cE\u003e, long)",
      "begin_line": 289,
      "end_line": 301,
      "comment": "\n     * Returns a view of the given iterable that contains at most the given number\n     * of elements.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable to limit, may not be null\n     * @param maxSize  the maximum number of elements, must not be negative\n     * @return a bounded view on the specified iterable\n     * @throws IllegalArgumentException if maxSize is negative\n     * @throws NullPointerException if iterable is null\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 31)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 300,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-106dc27a-42e1-4dff-8a20-f883cceaf29f.iterator()",
      "begin_line": 296,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 298,col 17)-(line 298,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.loopingIterable(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 321,
      "end_line": 338,
      "comment": "\n     * Returns a view of the given iterable which will cycle infinitely over\n     * its elements.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} if\n     * {@code iterable.iterator()} does. After {@code remove()} is called, subsequent\n     * cycles omit the removed element, which is no longer in {@code iterable}. The\n     * iterator\u0027s {@code hasNext()} method returns {@code true} until {@code iterable}\n     * is empty.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable to loop, may not be null\n     * @return a view of the iterable, providing an infinite loop over its elements\n     * @throws NullPointerException if iterable is null\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 31)",
        "(line 323,col 9)-(line 337,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-dbfafd8d-b4b1-4934-9083-067cbf244e8e.iterator()",
      "begin_line": 324,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 326,col 17)-(line 335,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-203ef416-48c2-4799-9158-f9ceb223dd0f.nextIterator(int)",
      "begin_line": 327,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 329,col 25)-(line 333,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.reversedIterable(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 359,
      "end_line": 370,
      "comment": "\n     * Returns a reversed view of the given iterable.\n     * \u003cp\u003e\n     * In case the provided iterable is a {@link List} instance, a\n     * {@link ReverseListIterator} will be used to reverse the traversal\n     * order, otherwise an intermediate {@link List} needs to be created.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} if the\n     * provided iterable is a {@link List} instance.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable to use, may not be null\n     * @return a reversed view of the specified iterable\n     * @throws NullPointerException if iterable is null\n     * @see ReverseListIterator\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 31)",
        "(line 361,col 9)-(line 369,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-81552af8-dfc6-44cd-bd67-636187a7cd1f.iterator()",
      "begin_line": 362,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 364,col 17)-(line 366,col 66)",
        "(line 367,col 17)-(line 367,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.skippingIterable(java.lang.Iterable\u003cE\u003e, long)",
      "begin_line": 388,
      "end_line": 400,
      "comment": "\n     * Returns a view of the given iterable that skips the first N elements.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable to use, may not be null\n     * @param elementsToSkip  the number of elements to skip from the start, must not be negative\n     * @return a view of the specified iterable, skipping the first N elements\n     * @throws IllegalArgumentException if elementsToSkip is negative\n     * @throws NullPointerException if iterable is null\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 31)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 399,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-82d10314-acf8-41f6-95e4-37be029f0f81.iterator()",
      "begin_line": 395,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 397,col 17)-(line 397,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.transformedIterable(java.lang.Iterable\u003cI\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 419,
      "end_line": 431,
      "comment": "\n     * Returns a transformed view of the given iterable where all of its elements\n     * have been transformed by the provided transformer.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cI\u003e  the input element type\n     * @param \u003cO\u003e  the output element type\n     * @param iterable  the iterable to transform, may not be null\n     * @param transformer  the transformer, must not be null\n     * @return a transformed view of the specified iterable\n     * @throws NullPointerException if either iterable or transformer is null\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 31)",
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 430,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-dd4f83c3-5f88-452e-8de8-ce22c584c522.iterator()",
      "begin_line": 426,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 428,col 17)-(line 428,col 91)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.uniqueIterable(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 446,
      "end_line": 454,
      "comment": "\n     * Returns a unique view of the given iterable.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator does not support {@code remove()}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable to use, may not be null\n     * @return a unique view of the specified iterable\n     * @throws NullPointerException if iterable is null\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 31)",
        "(line 448,col 9)-(line 453,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-819a0b5b-dfab-4ec2-85e9-d5bcadd5ea8b.iterator()",
      "begin_line": 449,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 451,col 17)-(line 451,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.unmodifiableIterable(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 469,
      "end_line": 475,
      "comment": "\n     * Returns an unmodifiable view of the given iterable.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator does not support {@code remove()}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable to use, may not be null\n     * @return an unmodifiable view of the specified iterable\n     * @throws NullPointerException if iterable is null\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 31)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnmodifiableIterable",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.FluentIterable\u003cE\u003e"
      ],
      "begin_line": 480,
      "end_line": 492,
      "comment": "\n     * Inner class to distinguish unmodifiable instances.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "unmodifiable"
      ],
      "begin_line": 481,
      "end_line": 481,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.IterableUtils.UnmodifiableIterable.UnmodifiableIterable(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 483,
      "end_line": 486,
      "comment": "",
      "child_ranges": [
        "(line 484,col 13)-(line 484,col 20)",
        "(line 485,col 13)-(line 485,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.UnmodifiableIterable.iterator()",
      "begin_line": 488,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 490,col 13)-(line 490,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.zippingIterable(java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 513,
      "end_line": 523,
      "comment": "\n     * Interleaves two iterables into a single iterable.\n     * \u003cp\u003e\n     * The returned iterable has an iterator that traverses the elements in {@code a}\n     * and {@code b} in alternating order. The source iterators are not polled until\n     * necessary.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e the element type\n     * @param a  the first iterable, may not be null\n     * @param b  the second iterable, may not be null\n     * @return a new iterable, interleaving the provided iterables\n     * @throws NullPointerException if either a or b is null\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 24)",
        "(line 516,col 9)-(line 516,col 24)",
        "(line 517,col 9)-(line 522,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-03c8fb7d-ac42-4d4a-9c74-fa888293188e.iterator()",
      "begin_line": 518,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 520,col 17)-(line 520,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.zippingIterable(java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e...)",
      "begin_line": 541,
      "end_line": 557,
      "comment": "\n     * Interleaves two iterables into a single iterable.\n     * \u003cp\u003e\n     * The returned iterable has an iterator that traverses the elements in {@code a}\n     * and {@code b} in alternating order. The source iterators are not polled until\n     * necessary.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e the element type\n     * @param first  the first iterable, may not be null\n     * @param others  the array of iterables to interleave, may not be null\n     * @return a new iterable, interleaving the provided iterables\n     * @throws NullPointerException if either of the provided iterables is null\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 28)",
        "(line 544,col 9)-(line 544,col 29)",
        "(line 545,col 9)-(line 556,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-7d776759-e15f-4ba1-9229-cbbe87189591.iterator()",
      "begin_line": 546,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 548,col 17)-(line 549,col 84)",
        "(line 550,col 17)-(line 550,col 48)",
        "(line 551,col 17)-(line 553,col 17)",
        "(line 554,col 17)-(line 554,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.emptyIfNull(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 570,
      "end_line": 572,
      "comment": "\n     * Returns an immutable empty iterable if the argument is null,\n     * or the argument itself otherwise.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable, may be null\n     * @return an empty iterable if the argument is null\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.forEach(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 582,
      "end_line": 584,
      "comment": "\n     * Applies the closure to each element of the provided iterable.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterator to use, may be null\n     * @param closure  the closure to apply to each element, may not be null\n     * @throws NullPointerException if closure is null\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.forEachButLast(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 596,
      "end_line": 598,
      "comment": "\n     * Executes the given closure on each but the last element in the iterable.\n     * \u003cp\u003e\n     * If the input iterable is null no change is made.\n     *\n     * @param \u003cE\u003e the type of object the {@link Iterable} contains\n     * @param iterable  the iterable to get the input from, may be null\n     * @param closure  the closure to perform, may not be null\n     * @return the last element in the iterable, or null if iterable is null or empty\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.find(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\n     * Finds the first element in the given iterable which matches the given predicate.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterator returns null.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable to search, may be null\n     * @param predicate  the predicate to use, may not be null\n     * @return the first element of the iterable which matches the predicate or null if none could be found\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.indexOf(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 627,
      "end_line": 629,
      "comment": "\n     * Returns the index of the first element in the specified iterable that\n     * matches the given predicate.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterable returns -1.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable to search, may be null\n     * @param predicate  the predicate to use, may not be null\n     * @return the index of the first element which matches the predicate or -1 if none matches\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.matchesAll(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 643,
      "end_line": 645,
      "comment": "\n     * Answers true if a predicate is true for every element of an iterable.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterable returns true.\n     *\n     * @param \u003cE\u003e the type of object the {@link Iterable} contains\n     * @param iterable  the {@link Iterable} to use, may be null\n     * @param predicate  the predicate to use, may not be null\n     * @return true if every element of the collection matches the predicate or if the\n     *   collection is empty, false otherwise\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.matchesAny(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 658,
      "end_line": 660,
      "comment": "\n     * Answers true if a predicate is true for any element of the iterable.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterable returns false.\n     *\n     * @param \u003cE\u003e the type of object the {@link Iterable} contains\n     * @param iterable  the {@link Iterable} to use, may be null\n     * @param predicate  the predicate to use, may not be null\n     * @return true if any element of the collection matches the predicate, false otherwise\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.countMatches(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 673,
      "end_line": 678,
      "comment": "\n     * Counts the number of elements in the input iterable that match the predicate.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e iterable matches no elements.\n     *\n     * @param \u003cE\u003e the type of object the {@link Iterable} contains\n     * @param input  the {@link Iterable} to get the input from, may be null\n     * @param predicate  the predicate to use, may not be null\n     * @return the number of matches for the predicate in the collection\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 676,col 9)",
        "(line 677,col 9)-(line 677,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.isEmpty(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 688,
      "end_line": 694,
      "comment": "\n     * Answers true if the provided iterable is empty.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e iterable returns true.\n     *\n     * @param iterable  the {@link Iterable to use}, may be null\n     * @return true if the iterable is null or empty, false otherwise\n     ",
      "child_ranges": [
        "(line 689,col 9)-(line 693,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.contains(java.lang.Iterable\u003cE\u003e, java.lang.Object)",
      "begin_line": 706,
      "end_line": 712,
      "comment": "\n     * Checks if the object is contained in the given iterable.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterable returns false.\n     *\n     * @param \u003cE\u003e the type of object the {@link Iterable} contains\n     * @param iterable  the iterable to check, may be null\n     * @param object  the object to check\n     * @return true if the object is contained in the iterable, false otherwise\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 711,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.contains(java.lang.Iterable\u003c? extends E\u003e, E, org.apache.commons.collections4.Equator\u003c? super E\u003e)",
      "begin_line": 731,
      "end_line": 737,
      "comment": "\n     * Checks if the object is contained in the given iterable. Object equality\n     * is tested with an {@code equator} unlike {@link #contains(Iterable, Object)}\n     * which uses {@link Object#equals(Object)}.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterable returns false.\n     * A \u003ccode\u003enull\u003c/code\u003e object will not be passed to the equator, instead a\n     * {@link org.apache.commons.collections4.functors.NullPredicate NullPredicate}\n     * will be used.\n     *\n     * @param \u003cE\u003e the type of object the {@link Iterable} contains\n     * @param iterable  the iterable to check, may be null\n     * @param object  the object to check\n     * @param equator  the equator to use to check, may not be null\n     * @return true if the object is contained in the iterable, false otherwise\n     * @throws NullPointerException if equator is null\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 736,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.frequency(java.lang.Iterable\u003cE\u003e, T)",
      "begin_line": 748,
      "end_line": 756,
      "comment": "\n     * Returns the number of occurrences of the provided object in the iterable.\n     *\n     * @param \u003cE\u003e the element type that the {@link Iterable} may contain\n     * @param \u003cT\u003e the element type of the object to find\n     * @param iterable  the {@link Iterable} to search\n     * @param obj  the object to find the cardinality of\n     * @return the the number of occurrences of obj in iterable\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 755,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.get(java.lang.Iterable\u003cT\u003e, int)",
      "begin_line": 770,
      "end_line": 776,
      "comment": "\n     * Returns the \u003ccode\u003eindex\u003c/code\u003e-th value in the \u003ccode\u003eiterable\u003c/code\u003e\u0027s {@link Iterator}, throwing\n     * \u003ccode\u003eIndexOutOfBoundsException\u003c/code\u003e if there is no such element.\n     * \u003cp\u003e\n     * If the {@link Iterable} is a {@link List}, then it will use {@link List#get(int)}.\n     *\n     * @param \u003cT\u003e the type of object in the {@link Iterable}.\n     * @param iterable  the {@link Iterable} to get a value from, may be null\n     * @param index  the index to get\n     * @return the object at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 48)",
        "(line 772,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 775,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.size(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 786,
      "end_line": 792,
      "comment": "\n     * Returns the number of elements contained in the given iterator.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterator returns {@code 0}.\n     *\n     * @param iterable  the iterable to check, may be null\n     * @return the number of elements contained in the iterable\n     ",
      "child_ranges": [
        "(line 787,col 9)-(line 791,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.partition(java.lang.Iterable\u003c? extends O\u003e, org.apache.commons.collections4.Predicate\u003c? super O\u003e)",
      "begin_line": 821,
      "end_line": 831,
      "comment": "\n     * Partitions all elements from iterable into separate output collections,\n     * based on the evaluation of the given predicate.\n     * \u003cp\u003e\n     * For each predicate, the result will contain a list holding all elements of the\n     * input iterable matching the predicate. The last list will hold all elements\n     * which didn\u0027t match any predicate:\n     * \u003cpre\u003e\n     *  [C1, R] \u003d partition(I, P1) with\n     *  I \u003d input\n     *  P1 \u003d first predicate\n     *  C1 \u003d collection of elements matching P1\n     *  R \u003d collection of elements rejected by all predicates\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * If the input iterable is \u003ccode\u003enull\u003c/code\u003e, the same is returned as for an\n     * empty iterable.\n     * \u003cp\u003e\n     * Example: for an input list [1, 2, 3, 4, 5] calling partition with a predicate [x \u0026lt; 3]\n     * will result in the following output: [[1, 2], [3, 4, 5]].\n     *\n     * @param \u003cO\u003e  the type of object the {@link Iterable} contains\n     * @param iterable  the iterable to partition, may be null\n     * @param predicate  the predicate to use, may not be null\n     * @return a list containing the output collections\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 823,col 9)-(line 825,col 9)",
        "(line 826,col 9)-(line 827,col 98)",
        "(line 828,col 9)-(line 829,col 80)",
        "(line 830,col 9)-(line 830,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.partition(java.lang.Iterable\u003c? extends O\u003e, org.apache.commons.collections4.Predicate\u003c? super O\u003e...)",
      "begin_line": 865,
      "end_line": 871,
      "comment": "\n     * Partitions all elements from iterable into separate output collections,\n     * based on the evaluation of the given predicates.\n     * \u003cp\u003e\n     * For each predicate, the result will contain a list holding all elements of the\n     * input iterable matching the predicate. The last list will hold all elements\n     * which didn\u0027t match any predicate:\n     * \u003cpre\u003e\n     *  [C1, C2, R] \u003d partition(I, P1, P2) with\n     *  I \u003d input\n     *  P1 \u003d first predicate\n     *  P2 \u003d second predicate\n     *  C1 \u003d collection of elements matching P1\n     *  C2 \u003d collection of elements matching P2\n     *  R \u003d collection of elements rejected by all predicates\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * \u003cb\u003eNote\u003c/b\u003e: elements are only added to the output collection of the first matching\n     * predicate, determined by the order of arguments.\n     * \u003cp\u003e\n     * If the input iterable is \u003ccode\u003enull\u003c/code\u003e, the same is returned as for an\n     * empty iterable.\n     * \u003cp\u003e\n     * Example: for an input list [1, 2, 3, 4, 5] calling partition with predicates [x \u0026lt; 3]\n     * and [x \u0026lt; 5] will result in the following output: [[1, 2], [3, 4], [5]].\n     *\n     * @param \u003cO\u003e  the type of object the {@link Iterable} contains\n     * @param iterable  the collection to get the input from, may be null\n     * @param predicates  the predicates to use, may not be null\n     * @return a list containing the output collections\n     * @throws NullPointerException if any predicate is null\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 869,col 98)",
        "(line 870,col 9)-(line 870,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.partition(java.lang.Iterable\u003c? extends O\u003e, org.apache.commons.collections4.Factory\u003cR\u003e, org.apache.commons.collections4.Predicate\u003c? super O\u003e...)",
      "begin_line": 909,
      "end_line": 964,
      "comment": "\n     * Partitions all elements from iterable into separate output collections,\n     * based on the evaluation of the given predicates.\n     * \u003cp\u003e\n     * For each predicate, the returned list will contain a collection holding\n     * all elements of the input iterable matching the predicate. The last collection\n     * contained in the list will hold all elements which didn\u0027t match any predicate:\n     * \u003cpre\u003e\n     *  [C1, C2, R] \u003d partition(I, P1, P2) with\n     *  I \u003d input\n     *  P1 \u003d first predicate\n     *  P2 \u003d second predicate\n     *  C1 \u003d collection of elements matching P1\n     *  C2 \u003d collection of elements matching P2\n     *  R \u003d collection of elements rejected by all predicates\n     * \u003c/pre\u003e\n     * \u003cp\u003e\n     * \u003cb\u003eNote\u003c/b\u003e: elements are only added to the output collection of the first matching\n     * predicate, determined by the order of arguments.\n     * \u003cp\u003e\n     * If the input iterable is \u003ccode\u003enull\u003c/code\u003e, the same is returned as for an\n     * empty iterable.\n     * If no predicates have been provided, all elements of the input collection\n     * will be added to the rejected collection.\n     * \u003cp\u003e\n     * Example: for an input list [1, 2, 3, 4, 5] calling partition with predicates [x \u0026lt; 3]\n     * and [x \u0026lt; 5] will result in the following output: [[1, 2], [3, 4], [5]].\n     *\n     * @param \u003cO\u003e  the type of object the {@link Iterable} contains\n     * @param \u003cR\u003e  the type of the output {@link Collection}\n     * @param iterable  the collection to get the input from, may be null\n     * @param partitionFactory  the factory used to create the output collections\n     * @param predicates  the predicates to use, may not be null\n     * @return a list containing the output collections\n     * @throws NullPointerException if any predicate is null\n     ",
      "child_ranges": [
        "(line 912,col 9)-(line 915,col 9)",
        "(line 917,col 9)-(line 919,col 9)",
        "(line 921,col 9)-(line 925,col 9)",
        "(line 927,col 9)-(line 932,col 9)",
        "(line 935,col 9)-(line 935,col 57)",
        "(line 936,col 9)-(line 936,col 62)",
        "(line 937,col 9)-(line 937,col 72)",
        "(line 938,col 9)-(line 940,col 9)",
        "(line 946,col 9)-(line 961,col 9)",
        "(line 963,col 9)-(line 963,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.toList(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 973,
      "end_line": 975,
      "comment": "\n     * Gets a new list with the contents of the provided iterable.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable to use, may be null\n     * @return a list of the iterator contents\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.toString(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 989,
      "end_line": 991,
      "comment": "\n     * Returns a string representation of the elements of the specified iterable.\n     * \u003cp\u003e\n     * The string representation consists of a list of the iterable\u0027s elements,\n     * enclosed in square brackets ({@code \"[]\"}). Adjacent elements are separated\n     * by the characters {@code \", \"} (a comma followed by a space). Elements are\n     * converted to strings as by {@code String.valueOf(Object)}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable to convert to a string, may be null\n     * @return a string representation of {@code iterable}\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.toString(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, java.lang.String\u003e)",
      "begin_line": 1007,
      "end_line": 1013,
      "comment": "\n     * Returns a string representation of the elements of the specified iterable.\n     * \u003cp\u003e\n     * The string representation consists of a list of the iterable\u0027s elements,\n     * enclosed in square brackets ({@code \"[]\"}). Adjacent elements are separated\n     * by the characters {@code \", \"} (a comma followed by a space). Elements are\n     * converted to strings as by using the provided {@code transformer}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable to convert to a string, may be null\n     * @param transformer  the transformer used to get a string representation of an element\n     * @return a string representation of {@code iterable}\n     * @throws NullPointerException if {@code transformer} is null\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1011,col 9)",
        "(line 1012,col 9)-(line 1012,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.toString(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, java.lang.String\u003e, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 1032,
      "end_line": 1039,
      "comment": "\n     * Returns a string representation of the elements of the specified iterable.\n     * \u003cp\u003e\n     * The string representation consists of a list of the iterable\u0027s elements,\n     * enclosed by the provided {@code prefix} and {@code suffix}. Adjacent elements\n     * are separated by the provided {@code delimiter}. Elements are converted to\n     * strings as by using the provided {@code transformer}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable to convert to a string, may be null\n     * @param transformer  the transformer used to get a string representation of an element\n     * @param delimiter  the string to delimit elements\n     * @param prefix  the prefix, prepended to the string representation\n     * @param suffix  the suffix, appended to the string representation\n     * @return a string representation of {@code iterable}\n     * @throws NullPointerException if either transformer, delimiter, prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1038,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.checkNotNull(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 1050,
      "end_line": 1054,
      "comment": "\n     * Fail-fast check for null arguments.\n     *\n     * @param iterable  the iterable to check\n     * @throws NullPointerException if iterable is null\n     ",
      "child_ranges": [
        "(line 1051,col 9)-(line 1053,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.checkNotNull(java.lang.Iterable\u003c?\u003e...)",
      "begin_line": 1062,
      "end_line": 1069,
      "comment": "\n     * Fail-fast check for null arguments.\n     *\n     * @param iterable  the iterable to check\n     * @throws NullPointerException if the argument or any of its contents is null\n     ",
      "child_ranges": [
        "(line 1063,col 9)-(line 1065,col 9)",
        "(line 1066,col 9)-(line 1068,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.emptyIteratorIfNull(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 1079,
      "end_line": 1081,
      "comment": "\n     * Returns an empty iterator if the argument is \u003ccode\u003enull\u003c/code\u003e,\n     * or {@code iterable.iterator()} otherwise.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable, possibly \u003ccode\u003enull\u003c/code\u003e\n     * @return an empty iterator if the argument is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 1080,col 9)-(line 1080,col 89)"
      ]
    }
  ]
}