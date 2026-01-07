{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/IterableUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IterableUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 696,
      "comment": "\n * Provides utility methods and decorators for {@link Iterable} instances.\n * \u003cp\u003e\n * \u003cb\u003eNote\u003c/b\u003e: by design, all provided utility methods will treat a {@code null}\n * {@link Iterable} parameters the same way as an empty iterable. All other required\n * parameters which are null, e.g. a {@link Predicate}, will result in a\n * {@link NullPointerException}.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.chainedIterable(java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 61,
      "end_line": 65,
      "comment": "\n     * Combines two iterables into a single iterable.\n     * \u003cp\u003e\n     * The returned iterable has an iterator that traverses the elements in {@code a},\n     * followed by the elements in {@code b}. The source iterators are not polled until\n     * necessary.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param a  the first iterable\n     * @param b  the second iterable\n     * @return a new iterable, combining the provided iterables\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.chainedIterable(java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 83,
      "end_line": 88,
      "comment": "\n     * Combines three iterables into a single iterable.\n     * \u003cp\u003e\n     * The returned iterable has an iterator that traverses the elements in {@code a},\n     * followed by the elements in {@code b} and {@code c}. The source iterators are\n     * not polled until necessary.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param a  the first iterable\n     * @param b  the second iterable\n     * @param c  the third iterable\n     * @return a new iterable, combining the provided iterables\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.chainedIterable(java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 107,
      "end_line": 113,
      "comment": "\n     * Combines four iterables into a single iterable.\n     * \u003cp\u003e\n     * The returned iterable has an iterator that traverses the elements in {@code a},\n     * followed by the elements in {@code b}, {@code c} and {@code d}. The source\n     * iterators are not polled until necessary.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param a  the first iterable\n     * @param b  the second iterable\n     * @param c  the third iterable\n     * @param d  the fourth iterable\n     * @return a new iterable, combining the provided iterables\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.chainedIterable(java.lang.Iterable\u003c? extends E\u003e...)",
      "begin_line": 129,
      "end_line": 145,
      "comment": "\n     * Combines the provided iterables into a single iterable.\n     * \u003cp\u003e\n     * The returned iterable has an iterator that traverses the elements in the order\n     * of the arguments, i.e. iterables[0], iterables[1], .... The source iterators\n     * are not polled until necessary.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterables  the iterables to combine\n     * @return a new iterable, combining the provided iterables\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 144,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-908c941a-02b9-4a74-8218-5116532556b9.iterator()",
      "begin_line": 131,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 133,col 17)-(line 142,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-3e8f58d8-534f-42fb-a0c4-04c4f6953795.nextIterator(int)",
      "begin_line": 134,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 136,col 25)-(line 140,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.collatedIterable(java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e, java.util.Comparator\u003c? super E\u003e)",
      "begin_line": 165,
      "end_line": 176,
      "comment": "\n     * Combines the two provided iterables into an ordered iterable using the\n     * provided comparator. If the comparator is null, natural ordering will be\n     * used.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param a  the first iterable, may be null\n     * @param b  the second iterable, may be null\n     * @param comparator  the comparator defining an ordering over the elements,\n     *   may be null, in which case natural ordering will be used\n     * @return a filtered view on the specified iterable\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 175,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-ff9c7bc5-aedc-48ec-a0fe-8f8ef078ce5e.iterator()",
      "begin_line": 169,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 171,col 17)-(line 173,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.filteredIterable(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 193,
      "end_line": 205,
      "comment": "\n     * Returns a view of the given iterable that only contains elements matching\n     * the provided predicate.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator does not supports {@code remove()}.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterable  the iterable to filter, may be null\n     * @param predicate  the predicate used to filter elements, must not be null\n     * @return a filtered view on the specified iterable\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 204,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-51a9b5a1-0c0d-4f58-9430-d633f49fced5.iterator()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 17)-(line 202,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.boundedIterable(java.lang.Iterable\u003cE\u003e, long)",
      "begin_line": 223,
      "end_line": 234,
      "comment": "\n     * Returns a view of the given iterable that contains at most the given number\n     * of elements.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterable  the iterable to limit, may be null\n     * @param maxSize  the maximum number of elements, must not be negative\n     * @return a bounded view on the specified iterable\n     * @throws IllegalArgumentException if maxSize is negative\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 233,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-42cc3569-4f1a-4c7e-9771-39781e781761.iterator()",
      "begin_line": 229,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 231,col 17)-(line 231,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.loopingIterable(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 253,
      "end_line": 273,
      "comment": "\n     * Returns a view of the given iterable which will cycle infinitely over\n     * its elements.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} if\n     * {@code iterable.iterator()} does. After {@code remove()} is called, subsequent\n     * cycles omit the removed element, which is no longer in {@code iterable}. The\n     * iterator\u0027s {@code hasNext()} method returns {@code true} until {@code iterable}\n     * is empty.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterable  the iterable to loop, may be null\n     * @return a view of the iterable, providing an infinite loop over its elements\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 272,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-3b0b3ecb-8931-488e-9dc6-7494617b0848.iterator()",
      "begin_line": 255,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 257,col 17)-(line 270,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-828ea550-6f03-486d-a360-44bb11f92e1d.nextIterator(int)",
      "begin_line": 258,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 260,col 25)-(line 268,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.reversedIterable(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 293,
      "end_line": 304,
      "comment": "\n     * Returns a reversed view of the given iterable.\n     * \u003cp\u003e\n     * In case the provided iterable is a {@link List} instance, a\n     * {@link ReverseListIterator} will be used to reverse the traversal\n     * order, otherwise an intermediate {@link List} needs to be created.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} if the\n     * provided iterable is a {@link List} instance.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterable  the iterable to use, may be null\n     * @return a reversed view of the specified iterable\n     * @see ReverseListIterator\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 303,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-cf15348a-a712-4cf7-85cf-603ab43d4335.iterator()",
      "begin_line": 295,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 297,col 17)-(line 299,col 76)",
        "(line 301,col 17)-(line 301,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.skippingIterable(java.lang.Iterable\u003cE\u003e, long)",
      "begin_line": 321,
      "end_line": 332,
      "comment": "\n     * Returns a view of the given iterable that skips the first N elements.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterable  the iterable to use, may be null\n     * @param elementsToSkip  the number of elements to skip from the start, must not be negative\n     * @return a view of the specified iterable, skipping the first N elements\n     * @throws IllegalArgumentException if elementsToSkip is negative\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 331,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-68be1eac-37e3-4b8f-930f-93dc953a808d.iterator()",
      "begin_line": 327,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 329,col 17)-(line 329,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.transformedIterable(java.lang.Iterable\u003cI\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 351,
      "end_line": 363,
      "comment": "\n     * Returns a transformed view of the given iterable where all of its elements\n     * have been transformed by the provided transformer.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cI\u003e  the input element type\n     * @param \u003cO\u003e  the output element type\n     * @param iterable  the iterable to transform, may be null\n     * @param transformer  the transformer , must not be null\n     * @return a transformed view of the specified iterable\n     * @throws NullPointerException if transformer is null\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 362,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-b37f594a-2324-45ed-ab66-5d1c65c1baf3.iterator()",
      "begin_line": 358,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 360,col 17)-(line 360,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.uniqueIterable(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 377,
      "end_line": 384,
      "comment": "\n     * Returns a unique view of the given iterable.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator does not supports {@code remove()}.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterable  the iterable to transform, may be null\n     * @return a unique view of the specified iterable\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 383,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-20fd8905-50cf-48cf-90fd-7beb64979429.iterator()",
      "begin_line": 379,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 381,col 17)-(line 381,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.zippingIterable(java.lang.Iterable\u003c? extends E\u003e, java.lang.Iterable\u003c? extends E\u003e)",
      "begin_line": 404,
      "end_line": 408,
      "comment": "\n     * Interleaves two iterables into a single iterable.\n     * \u003cp\u003e\n     * The returned iterable has an iterator that traverses the elements in {@code a}\n     * and {@code b} in alternating order. The source iterators are not polled until\n     * necessary.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param a  the first iterable\n     * @param b  the second iterable\n     * @return a new iterable, interleaving the provided iterables\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.zippingIterable(java.lang.Iterable\u003c? extends E\u003e...)",
      "begin_line": 424,
      "end_line": 436,
      "comment": "\n     * Interleaves two iterables into a single iterable.\n     * \u003cp\u003e\n     * The returned iterable has an iterator that traverses the elements in {@code a}\n     * and {@code b} in alternating order. The source iterators are not polled until\n     * necessary.\n     * \u003cp\u003e\n     * The returned iterable\u0027s iterator supports {@code remove()} when the corresponding\n     * input iterator supports it.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterables  the array of iterables to interleave\n     * @return a new iterable, interleaving the provided iterables\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 435,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.Anonymous-2321ddf6-f410-483b-8f03-319cd0b6a648.iterator()",
      "begin_line": 426,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 428,col 17)-(line 429,col 83)",
        "(line 430,col 17)-(line 432,col 17)",
        "(line 433,col 17)-(line 433,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.emptyIteratorIfNull(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * Returns an empty iterator if the argument is \u003ccode\u003enull\u003c/code\u003e,\n     * or returns {@code iterable.iterator()} otherwise.\n     *\n     * @param \u003cE\u003e the element type\n     * @param iterable  the iterable, possibly \u003ccode\u003enull\u003c/code\u003e\n     * @return an empty collection if the argument is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.apply(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 461,
      "end_line": 463,
      "comment": "\n     * Applies the closure to each element of the provided iterable.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterable  the iterator to use, may be null\n     * @param closure  the closure to apply to each element, may not be null\n     * @throws NullPointerException if closure is null\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.find(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 476,
      "end_line": 478,
      "comment": "\n     * Finds the first element in the given iterable which matches the given predicate.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterator returns null.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterable  the iterable to search, may be null\n     * @param predicate  the predicate to use, may not be null\n     * @return the first element of the iterable which matches the predicate or null if none could be found\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.matchesAll(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * Answers true if a predicate is true for every element of an iterable.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterable returns true.\n     *\n     * @param \u003cE\u003e  the type of object the {@link Iterable} contains\n     * @param iterable  the {@link Iterable} to use, may be null\n     * @param predicate  the predicate to use, may not be null\n     * @return true if every element of the collection matches the predicate or if the\n     *   collection is empty, false otherwise\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.matchesAny(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 507,
      "end_line": 509,
      "comment": "\n     * Answers true if a predicate is true for any element of the iterable.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterable returns false.\n     *\n     * @param \u003cE\u003e  the type of object the {@link Iterable} contains\n     * @param iterable  the {@link Iterable} to use, may be null\n     * @param predicate  the predicate to use, may not be null\n     * @return true if any element of the collection matches the predicate, false otherwise\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.frequency(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 522,
      "end_line": 535,
      "comment": "\n     * Counts the number of elements in the input iterable that match the predicate.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e iterable matches no elements.\n     *\n     * @param \u003cE\u003e  the type of object the {@link Iterable} contains\n     * @param input  the {@link Iterable} to get the input from, may be null\n     * @param predicate  the predicate to use, may not be null\n     * @return the number of matches for the predicate in the collection\n     * @throws NullPointerException if predicate is null\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 23)",
        "(line 527,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.isEmpty(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 545,
      "end_line": 551,
      "comment": "\n     * Answers true if the provided iterable is empty.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e iterable returns true.\n     *\n     * @param iterable  the {@link Iterable to use}, may be null\n     * @return true if the iterable is null or empty, false otherwise\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 550,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.contains(java.lang.Iterable\u003cE\u003e, java.lang.Object)",
      "begin_line": 563,
      "end_line": 569,
      "comment": "\n     * Checks if the object is contained in the given iterable.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterable returns false.\n     *\n     * @param \u003cE\u003e  the type of object the {@link Iterable} contains\n     * @param iterable  the iterable to check, may be null\n     * @param object  the object to check\n     * @return true if the object is contained in the iterable, false otherwise\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 568,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.contains(java.lang.Iterable\u003c? extends E\u003e, E, org.apache.commons.collections4.Equator\u003c? super E\u003e)",
      "begin_line": 588,
      "end_line": 594,
      "comment": "\n     * Checks if the object is contained in the given iterable. Object equality\n     * is tested with an {@code equator} unlike {@link #contains(Iterable, Object)}\n     * which uses {@link Object#equals(Object)}.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterable returns false.\n     * A \u003ccode\u003enull\u003c/code\u003e object will not be passed to the equator, instead a\n     * {@link org.apache.commons.collections4.functors.NullPredicate NullPredicate}\n     * will be used.\n     *\n     * @param \u003cE\u003e  the type of object the {@link Iterable} contains\n     * @param iterable  the iterable to check, may be null\n     * @param object  the object to check\n     * @param equator  the equator to use to check, may not be null\n     * @return true if the object is contained in the iterable, false otherwise\n     * @throws NullPointerException if equator is null\n     ",
      "child_ranges": [
        "(line 590,col 9)-(line 592,col 9)",
        "(line 593,col 9)-(line 593,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.get(java.lang.Iterable\u003cT\u003e, int)",
      "begin_line": 608,
      "end_line": 614,
      "comment": "\n     * Returns the \u003ccode\u003eindex\u003c/code\u003e-th value in the \u003ccode\u003eiterable\u003c/code\u003e\u0027s {@link Iterator}, throwing\n     * \u003ccode\u003eIndexOutOfBoundsException\u003c/code\u003e if there is no such element.\n     * \u003cp\u003e\n     * If the {@link Iterable} is a {@link List}, then it will use {@link List#get(int)}.\n     *\n     * @param \u003cT\u003e the type of object in the {@link Iterable}.\n     * @param iterable  the {@link Iterable} to get a value from, may be null\n     * @param index  the index to get\n     * @return the object at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 48)",
        "(line 610,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.size(java.lang.Iterable\u003c?\u003e)",
      "begin_line": 624,
      "end_line": 630,
      "comment": "\n     * Returns the number of elements contained in the given iterator.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterator returns {@code 0}.\n     *\n     * @param iterable  the iterable to check, may be null\n     * @return the number of elements contained in the iterable\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 629,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.toString(java.lang.Iterable\u003cE\u003e)",
      "begin_line": 644,
      "end_line": 646,
      "comment": "\n     * Returns a string representation of the elements of the specified iterable.\n     * \u003cp\u003e\n     * The string representation consists of a list of the iterable\u0027s elements,\n     * enclosed in square brackets ({@code \"[]\"}). Adjacent elements are separated\n     * by the characters {@code \", \"} (a comma followed by a space). Elements are\n     * converted to strings as by {@code String.valueOf(Object)}.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterable  the iterable to convert to a string, may be null\n     * @return a string representation of {@code iterable}\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.toString(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, java.lang.String\u003e)",
      "begin_line": 662,
      "end_line": 668,
      "comment": "\n     * Returns a string representation of the elements of the specified iterable.\n     * \u003cp\u003e\n     * The string representation consists of a list of the iterable\u0027s elements,\n     * enclosed in square brackets ({@code \"[]\"}). Adjacent elements are separated\n     * by the characters {@code \", \"} (a comma followed by a space). Elements are\n     * converted to strings as by using the provided {@code transformer}.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterable  the iterable to convert to a string, may be null\n     * @param transformer  the transformer used to get a string representation of an element\n     * @return a string representation of {@code iterable}\n     * @throws NullPointerException if {@code transformer} is null\n     ",
      "child_ranges": [
        "(line 664,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IterableUtils.toString(java.lang.Iterable\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, java.lang.String\u003e, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 687,
      "end_line": 694,
      "comment": "\n     * Returns a string representation of the elements of the specified iterable.\n     * \u003cp\u003e\n     * The string representation consists of a list of the iterable\u0027s elements,\n     * enclosed by the provided {@code prefix} and {@code suffix}. Adjacent elements\n     * are separated by the provided {@code delimiter}. Elements are converted to\n     * strings as by using the provided {@code transformer}.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterable  the iterable to convert to a string, may be null\n     * @param transformer  the transformer used to get a string representation of an element\n     * @param delimiter  the string to delimit elements\n     * @param prefix  the prefix, prepended to the string representation\n     * @param suffix  the suffix, appended to the string representation\n     * @return a string representation of {@code iterable}\n     * @throws NullPointerException if either transformer, delimiter, prefix or suffix is null\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 693,col 78)"
      ]
    }
  ]
}