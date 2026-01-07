{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/IteratorUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IteratorUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 82,
      "end_line": 1499,
      "comment": "\n * Provides static utility methods and decorators for {@link Iterator}\n * instances. The implementations are provided in the iterators subpackage.\n * \u003cp\u003e\n * WARNING: Due to human error certain binary incompatibilities were introduced\n * between Commons Collections 2.1 and 3.0. The class remained source and test\n * compatible, so if you can recompile all your classes and dependencies\n * everything is OK. Those methods which are binary incompatible are marked as\n * such, together with alternate solutions that are binary compatible\n * against versions 2.1.1 and 3.1.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_ITERATOR"
      ],
      "begin_line": 92,
      "end_line": 93,
      "comment": "\n     * An iterator over no elements.\n     * \u003cp\u003e\n     * WARNING: This constant is binary incompatible with Commons Collections 2.1 and 2.1.1.\n     * Use \u003ccode\u003eEmptyIterator.INSTANCE\u003c/code\u003e for compatibility with Commons Collections 2.1.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_LIST_ITERATOR"
      ],
      "begin_line": 101,
      "end_line": 102,
      "comment": "\n     * A list iterator over no elements.\n     * \u003cp\u003e\n     * WARNING: This constant is binary incompatible with Commons Collections 2.1 and 2.1.1.\n     * Use \u003ccode\u003eEmptyListIterator.INSTANCE\u003c/code\u003e for compatibility with Commons Collections 2.1.1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_ORDERED_ITERATOR"
      ],
      "begin_line": 107,
      "end_line": 108,
      "comment": "\n     * An ordered iterator over no elements.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_MAP_ITERATOR"
      ],
      "begin_line": 113,
      "end_line": 114,
      "comment": "\n     * A map iterator over no elements.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_ORDERED_MAP_ITERATOR"
      ],
      "begin_line": 119,
      "end_line": 120,
      "comment": "\n     * An ordered map iterator over no elements.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOSTRING_PREFIX"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * Default prefix used while converting an Iterator to its String representation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOSTRING_SUFFIX"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * Default suffix used while converting an Iterator to its String representation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOSTRING_DELIMITER"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Default delimiter used to delimit elements while converting an Iterator\n     * to its String representation.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.IteratorUtils.IteratorUtils()",
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * IteratorUtils is not normally instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.emptyIterator()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Gets an empty iterator.\n     * \u003cp\u003e\n     * This iterator is a valid iterator object that will iterate over\n     * nothing.\n     * \u003cp\u003e\n     * WARNING: This method is binary incompatible with Commons Collections 2.1 and 2.1.1.\n     * Use \u003ccode\u003eEmptyIterator.INSTANCE\u003c/code\u003e for compatibility with Commons Collections 2.1.1.\n     *\n     * @param \u003cE\u003e  the element type\n     * @return  an iterator over nothing\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.emptyListIterator()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Gets an empty list iterator.\n     * \u003cp\u003e\n     * This iterator is a valid list iterator object that will iterate\n     * over nothing.\n     * \u003cp\u003e\n     * WARNING: This method is binary incompatible with Commons Collections 2.1 and 2.1.1.\n     * Use \u003ccode\u003eEmptyListIterator.INSTANCE\u003c/code\u003e for compatibility with Commons Collections 2.1.1.\n     *\n     * @param \u003cE\u003e  the element type\n     * @return  a list iterator over nothing\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.emptyOrderedIterator()",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Gets an empty ordered iterator.\n     * \u003cp\u003e\n     * This iterator is a valid iterator object that will iterate\n     * over nothing.\n     *\n     * @param \u003cE\u003e  the element type\n     * @return  an ordered iterator over nothing\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.emptyMapIterator()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Gets an empty map iterator.\n     * \u003cp\u003e\n     * This iterator is a valid map iterator object that will iterate\n     * over nothing.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @return  a map iterator over nothing\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.emptyOrderedMapIterator()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Gets an empty ordered map iterator.\n     * \u003cp\u003e\n     * This iterator is a valid map iterator object that will iterate\n     * over nothing.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @return  a map iterator over nothing\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.singletonIterator(E)",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Gets a singleton iterator.\n     * \u003cp\u003e\n     * This iterator is a valid iterator object that will iterate over\n     * the specified object.\n     * \u003cp\u003e\n     * WARNING: This method is binary incompatible with Commons Collections 2.1 and 2.1.1.\n     * Use \u003ccode\u003enew SingletonIterator(object)\u003c/code\u003e for compatibility.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param object  the single object over which to iterate\n     * @return  a singleton iterator over the object\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.singletonListIterator(E)",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * Gets a singleton list iterator.\n     * \u003cp\u003e\n     * This iterator is a valid list iterator object that will iterate over\n     * the specified object.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param object  the single object over which to iterate\n     * @return  a singleton list iterator over the object\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.arrayIterator(E...)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Gets an iterator over an object array.\n     * \u003cp\u003e\n     * WARNING: This method is binary incompatible with Commons Collections 2.1 and 2.1.1.\n     * Use \u003ccode\u003enew ArrayIterator(array)\u003c/code\u003e for compatibility.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param array  the array over which to iterate\n     * @return  an iterator over the array\n     * @throws NullPointerException if array is null\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.arrayIterator(java.lang.Object)",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * Gets an iterator over an object or primitive array.\n     * \u003cp\u003e\n     * This method will handle primitive arrays as well as object arrays.\n     * The primitives will be wrapped in the appropriate wrapper class.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param array  the array over which to iterate\n     * @return  an iterator over the array\n     * @throws IllegalArgumentException if the array is not an array\n     * @throws NullPointerException if array is null\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.arrayIterator(E[], int)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Gets an iterator over the end part of an object array.\n     * \u003cp\u003e\n     * WARNING: This method is binary incompatible with Commons Collections 2.1 and 2.1.1.\n     * Use \u003ccode\u003enew ArrayIterator(array,start)\u003c/code\u003e for compatibility.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param array  the array over which to iterate\n     * @param start  the index to start iterating at\n     * @return an iterator over part of the array\n     * @throws IndexOutOfBoundsException if start is less than zero or greater\n     *   than the length of the array\n     * @throws NullPointerException if array is null\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.arrayIterator(java.lang.Object, int)",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * Gets an iterator over the end part of an object or primitive array.\n     * \u003cp\u003e\n     * This method will handle primitive arrays as well as object arrays.\n     * The primitives will be wrapped in the appropriate wrapper class.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param array  the array over which to iterate\n     * @param start  the index to start iterating at\n     * @return an iterator over part of the array\n     * @throws IllegalArgumentException if the array is not an array\n     * @throws IndexOutOfBoundsException if start is less than zero or greater\n     *   than the length of the array\n     * @throws NullPointerException if array is null\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.arrayIterator(E[], int, int)",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * Gets an iterator over part of an object array.\n     * \u003cp\u003e\n     * WARNING: This method is binary incompatible with Commons Collections 2.1 and 2.1.1.\n     * Use \u003ccode\u003enew ArrayIterator(array,start,end)\u003c/code\u003e for compatibility.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param array  the array over which to iterate\n     * @param start  the index to start iterating at\n     * @param end  the index to finish iterating at\n     * @return an iterator over part of the array\n     * @throws IndexOutOfBoundsException if array bounds are invalid\n     * @throws IllegalArgumentException if end is before start\n     * @throws NullPointerException if array is null\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.arrayIterator(java.lang.Object, int, int)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n     * Gets an iterator over part of an object or primitive array.\n     * \u003cp\u003e\n     * This method will handle primitive arrays as well as object arrays.\n     * The primitives will be wrapped in the appropriate wrapper class.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param array  the array over which to iterate\n     * @param start  the index to start iterating at\n     * @param end  the index to finish iterating at\n     * @return an iterator over part of the array\n     * @throws IllegalArgumentException if the array is not an array or end is before start\n     * @throws IndexOutOfBoundsException if array bounds are invalid\n     * @throws NullPointerException if array is null\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.arrayListIterator(E...)",
      "begin_line": 368,
      "end_line": 370,
      "comment": "\n     * Gets a list iterator over an object array.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param array  the array over which to iterate\n     * @return  a list iterator over the array\n     * @throws NullPointerException if array is null\n     ",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.arrayListIterator(java.lang.Object)",
      "begin_line": 384,
      "end_line": 386,
      "comment": "\n     * Gets a list iterator over an object or primitive array.\n     * \u003cp\u003e\n     * This method will handle primitive arrays as well as object arrays.\n     * The primitives will be wrapped in the appropriate wrapper class.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param array  the array over which to iterate\n     * @return  a list iterator over the array\n     * @throws IllegalArgumentException if the array is not an array\n     * @throws NullPointerException if array is null\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.arrayListIterator(E[], int)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "\n     * Gets a list iterator over the end part of an object array.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param array  the array over which to iterate\n     * @param start  the index to start iterating at\n     * @return a list iterator over part of the array\n     * @throws IndexOutOfBoundsException if start is less than zero\n     * @throws NullPointerException if array is null\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.arrayListIterator(java.lang.Object, int)",
      "begin_line": 416,
      "end_line": 418,
      "comment": "\n     * Gets a list iterator over the end part of an object or primitive array.\n     * \u003cp\u003e\n     * This method will handle primitive arrays as well as object arrays.\n     * The primitives will be wrapped in the appropriate wrapper class.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param array  the array over which to iterate\n     * @param start  the index to start iterating at\n     * @return a list iterator over part of the array\n     * @throws IllegalArgumentException if the array is not an array\n     * @throws IndexOutOfBoundsException if start is less than zero\n     * @throws NullPointerException if array is null\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.arrayListIterator(E[], int, int)",
      "begin_line": 432,
      "end_line": 434,
      "comment": "\n     * Gets a list iterator over part of an object array.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param array  the array over which to iterate\n     * @param start  the index to start iterating at\n     * @param end  the index to finish iterating at\n     * @return a list iterator over part of the array\n     * @throws IndexOutOfBoundsException if array bounds are invalid\n     * @throws IllegalArgumentException if end is before start\n     * @throws NullPointerException if array is null\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.arrayListIterator(java.lang.Object, int, int)",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n     * Gets a list iterator over part of an object or primitive array.\n     * \u003cp\u003e\n     * This method will handle primitive arrays as well as object arrays.\n     * The primitives will be wrapped in the appropriate wrapper class.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param array  the array over which to iterate\n     * @param start  the index to start iterating at\n     * @param end  the index to finish iterating at\n     * @return a list iterator over part of the array\n     * @throws IllegalArgumentException if the array is not an array or end is before start\n     * @throws IndexOutOfBoundsException if array bounds are invalid\n     * @throws NullPointerException if array is null\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.boundedIterator(java.util.Iterator\u003c? extends E\u003e, long)",
      "begin_line": 468,
      "end_line": 470,
      "comment": "\n     * Decorates the specified iterator to return at most the given number\n     * of elements.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to decorate\n     * @param max  the maximum number of elements returned by this iterator\n     * @return a new bounded iterator\n     * @throws IllegalArgumentException if the iterator is null or max is negative\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.boundedIterator(java.util.Iterator\u003c? extends E\u003e, long, long)",
      "begin_line": 488,
      "end_line": 491,
      "comment": "\n     * Decorates the specified iterator to return at most the given number\n     * of elements, skipping all elements until the iterator reaches the\n     * position at {@code offset}.\n     * \u003cp\u003e\n     * The iterator is immediately advanced until it reaches the position at\n     * {@code offset}, incurring O(n) time.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to decorate\n     * @param offset  the index of the first element of the decorated iterator to return\n     * @param max  the maximum number of elements returned by this iterator\n     * @return a new bounded iterator\n     * @throws IllegalArgumentException if the iterator is null or either offset or max is negative\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.unmodifiableIterator(java.util.Iterator\u003cE\u003e)",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\n     * Gets an immutable version of an {@link Iterator}. The returned object\n     * will always throw an {@link UnsupportedOperationException} for\n     * the {@link Iterator#remove} method.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to make immutable\n     * @return an immutable version of the iterator\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(java.util.ListIterator\u003cE\u003e)",
      "begin_line": 518,
      "end_line": 520,
      "comment": "\n     * Gets an immutable version of a {@link ListIterator}. The returned object\n     * will always throw an {@link UnsupportedOperationException} for\n     * the {@link Iterator#remove}, {@link ListIterator#add} and\n     * {@link ListIterator#set} methods.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param listIterator  the iterator to make immutable\n     * @return an immutable version of the iterator\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.unmodifiableMapIterator(org.apache.commons.collections4.MapIterator\u003cK, V\u003e)",
      "begin_line": 532,
      "end_line": 534,
      "comment": "\n     * Gets an immutable version of a {@link MapIterator}. The returned object\n     * will always throw an {@link UnsupportedOperationException} for\n     * the {@link Iterator#remove}, {@link MapIterator#setValue(Object)} methods.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param mapIterator  the iterator to make immutable\n     * @return an immutable version of the iterator\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.chainedIterator(java.util.Iterator\u003c? extends E\u003e, java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 549,
      "end_line": 554,
      "comment": "\n     * Gets an iterator that iterates through two {@link Iterator}s\n     * one after another.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator1  the first iterator to use, not null\n     * @param iterator2  the second iterator to use, not null\n     * @return a combination iterator over the iterators\n     * @throws NullPointerException if either iterator is null\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.chainedIterator(java.util.Iterator\u003c? extends E\u003e...)",
      "begin_line": 565,
      "end_line": 567,
      "comment": "\n     * Gets an iterator that iterates through an array of {@link Iterator}s\n     * one after another.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterators  the iterators to use, not null or empty or contain nulls\n     * @return a combination iterator over the iterators\n     * @throws NullPointerException if iterators array is null or contains a null\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.chainedIterator(java.util.Collection\u003cjava.util.Iterator\u003c? extends E\u003e\u003e)",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\n     * Gets an iterator that iterates through a collections of {@link Iterator}s\n     * one after another.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterators  the iterators to use, not null or empty or contain nulls\n     * @return a combination iterator over the iterators\n     * @throws NullPointerException if iterators collection is null or contains a null\n     * @throws ClassCastException if the iterators collection contains the wrong object type\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.collatedIterator(java.util.Comparator\u003c? super E\u003e, java.util.Iterator\u003c? extends E\u003e, java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 602,
      "end_line": 606,
      "comment": "\n     * Gets an iterator that provides an ordered iteration over the elements\n     * contained in a collection of ordered {@link Iterator}s.\n     * \u003cp\u003e\n     * Given two ordered {@link Iterator}s \u003ccode\u003eA\u003c/code\u003e and \u003ccode\u003eB\u003c/code\u003e,\n     * the {@link Iterator#next()} method will return the lesser of\n     * \u003ccode\u003eA.next()\u003c/code\u003e and \u003ccode\u003eB.next()\u003c/code\u003e.\n     * \u003cp\u003e\n     * The comparator is optional. If null is specified then natural order is used.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param comparator  the comparator to use, may be null for natural order\n     * @param iterator1  the first iterators to use, not null\n     * @param iterator2  the first iterators to use, not null\n     * @return a combination iterator over the iterators\n     * @throws NullPointerException if either iterator is null\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.collatedIterator(java.util.Comparator\u003c? super E\u003e, java.util.Iterator\u003c? extends E\u003e...)",
      "begin_line": 624,
      "end_line": 627,
      "comment": "\n     * Gets an iterator that provides an ordered iteration over the elements\n     * contained in an array of {@link Iterator}s.\n     * \u003cp\u003e\n     * Given two ordered {@link Iterator}s \u003ccode\u003eA\u003c/code\u003e and \u003ccode\u003eB\u003c/code\u003e,\n     * the {@link Iterator#next()} method will return the lesser of\n     * \u003ccode\u003eA.next()\u003c/code\u003e and \u003ccode\u003eB.next()\u003c/code\u003e and so on.\n     * \u003cp\u003e\n     * The comparator is optional. If null is specified then natural order is used.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param comparator  the comparator to use, may be null for natural order\n     * @param iterators  the iterators to use, not null or empty or contain nulls\n     * @return a combination iterator over the iterators\n     * @throws NullPointerException if iterators array is null or contains a null value\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.collatedIterator(java.util.Comparator\u003c? super E\u003e, java.util.Collection\u003cjava.util.Iterator\u003c? extends E\u003e\u003e)",
      "begin_line": 646,
      "end_line": 649,
      "comment": "\n     * Gets an iterator that provides an ordered iteration over the elements\n     * contained in a collection of {@link Iterator}s.\n     * \u003cp\u003e\n     * Given two ordered {@link Iterator}s \u003ccode\u003eA\u003c/code\u003e and \u003ccode\u003eB\u003c/code\u003e,\n     * the {@link Iterator#next()} method will return the lesser of\n     * \u003ccode\u003eA.next()\u003c/code\u003e and \u003ccode\u003eB.next()\u003c/code\u003e and so on.\n     * \u003cp\u003e\n     * The comparator is optional. If null is specified then natural order is used.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param comparator  the comparator to use, may be null for natural order\n     * @param iterators  the iterators to use, not null or empty or contain nulls\n     * @return a combination iterator over the iterators\n     * @throws NullPointerException if iterators collection is null or contains a null\n     * @throws ClassCastException if the iterators collection contains the wrong object type\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.objectGraphIterator(E, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 707,
      "end_line": 710,
      "comment": "\n     * Gets an iterator that operates over an object graph.\n     * \u003cp\u003e\n     * This iterator can extract multiple objects from a complex tree-like object graph.\n     * The iteration starts from a single root object.\n     * It uses a \u003ccode\u003eTransformer\u003c/code\u003e to extract the iterators and elements.\n     * Its main benefit is that no intermediate \u003ccode\u003eList\u003c/code\u003e is created.\n     * \u003cp\u003e\n     * For example, consider an object graph:\n     * \u003cpre\u003e\n     *                 |- Branch -- Leaf\n     *                 |         \\- Leaf\n     *         |- Tree |         /- Leaf\n     *         |       |- Branch -- Leaf\n     *  Forest |                 \\- Leaf\n     *         |       |- Branch -- Leaf\n     *         |       |         \\- Leaf\n     *         |- Tree |         /- Leaf\n     *                 |- Branch -- Leaf\n     *                 |- Branch -- Leaf\u003c/pre\u003e\n     * The following \u003ccode\u003eTransformer\u003c/code\u003e, used in this class, will extract all\n     * the Leaf objects without creating a combined intermediate list:\n     * \u003cpre\u003e\n     * public Object transform(Object input) {\n     *   if (input instanceof Forest) {\n     *     return ((Forest) input).treeIterator();\n     *   }\n     *   if (input instanceof Tree) {\n     *     return ((Tree) input).branchIterator();\n     *   }\n     *   if (input instanceof Branch) {\n     *     return ((Branch) input).leafIterator();\n     *   }\n     *   if (input instanceof Leaf) {\n     *     return input;\n     *   }\n     *   throw new ClassCastException();\n     * }\u003c/pre\u003e\n     * \u003cp\u003e\n     * Internally, iteration starts from the root object. When next is called,\n     * the transformer is called to examine the object. The transformer will return\n     * either an iterator or an object. If the object is an Iterator, the next element\n     * from that iterator is obtained and the process repeats. If the element is an object\n     * it is returned.\n     * \u003cp\u003e\n     * Under many circumstances, linking Iterators together in this manner is\n     * more efficient (and convenient) than using nested for loops to extract a list.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param root  the root object to start iterating from, null results in an empty iterator\n     * @param transformer  the transformer to use, see above, null uses no effect transformer\n     * @return a new object graph iterator\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.transformedIterator(java.util.Iterator\u003c? extends I\u003e, org.apache.commons.collections4.Transformer\u003c? super I, ? extends O\u003e)",
      "begin_line": 727,
      "end_line": 737,
      "comment": "\n     * Gets an iterator that transforms the elements of another iterator.\n     * \u003cp\u003e\n     * The transformation occurs during the next() method and the underlying\n     * iterator is unaffected by the transformation.\n     *\n     * @param \u003cI\u003e  the input type\n     * @param \u003cO\u003e  the output type\n     * @param iterator  the iterator to use, not null\n     * @param transform  the transform to use, not null\n     * @return a new transforming iterator\n     * @throws NullPointerException if either parameter is null\n     ",
      "child_ranges": [
        "(line 730,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 736,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.filteredIterator(java.util.Iterator\u003c? extends E\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 753,
      "end_line": 762,
      "comment": "\n     * Gets an iterator that filters another iterator.\n     * \u003cp\u003e\n     * The returned iterator will only return objects that match the specified\n     * filtering predicate.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to use, not null\n     * @param predicate  the predicate to use as a filter, not null\n     * @return a new filtered iterator\n     * @throws NullPointerException if either parameter is null\n     ",
      "child_ranges": [
        "(line 755,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.filteredListIterator(java.util.ListIterator\u003c? extends E\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 776,
      "end_line": 786,
      "comment": "\n     * Gets a list iterator that filters another list iterator.\n     * \u003cp\u003e\n     * The returned iterator will only return objects that match the specified\n     * filtering predicate.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param listIterator  the list iterator to use, not null\n     * @param predicate  the predicate to use as a filter, not null\n     * @return a new filtered iterator\n     * @throws NullPointerException if either parameter is null\n     ",
      "child_ranges": [
        "(line 779,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 784,col 9)",
        "(line 785,col 9)-(line 785,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.loopingIterator(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 802,
      "end_line": 807,
      "comment": "\n     * Gets an iterator that loops continuously over the supplied collection.\n     * \u003cp\u003e\n     * The iterator will only stop looping if the remove method is called\n     * enough times to empty the collection, or if the collection is empty\n     * to start with.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param coll  the collection to iterate over, not null\n     * @return a new looping iterator\n     * @throws NullPointerException if the collection is null\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.loopingListIterator(java.util.List\u003cE\u003e)",
      "begin_line": 821,
      "end_line": 826,
      "comment": "\n     * Gets an iterator that loops continuously over the supplied list.\n     * \u003cp\u003e\n     * The iterator will only stop looping if the remove method is called\n     * enough times to empty the list, or if the list is empty to start with.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param list  the list to iterate over, not null\n     * @return a new looping iterator\n     * @throws NullPointerException if the list is null\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 825,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "nodeListIterator(NodeList)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027NodeList\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 839,
      "end_line": 844,
      "comment": "\n     * Gets an {@link Iterator} that wraps the specified {@link NodeList}.\n     * The returned {@link Iterator} can be used for a single iteration.\n     *\n     * @param nodeList the node list to use, not null\n     * @return a new, single use {@link Iterator}\n     * @throws NullPointerException if nodeList is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 842,col 9)",
        "(line 843,col 9)-(line 843,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "nodeListIterator(Node)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Node\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 863,
      "end_line": 868,
      "comment": "\n     * Gets an {@link Iterator} that wraps the specified node\u0027s childNodes.\n     * The returned {@link Iterator} can be used for a single iteration.\n     * \u003cp\u003e\n     * Convenience method, allows easy iteration over NodeLists:\n     * \u003cpre\u003e\n     *   Iterator\u0026lt;Node\u0026gt; iterator \u003d IteratorUtils.nodeListIterator(node);\n     *   for(Node childNode : IteratorUtils.asIterable(iterator)) {\n     *     ...\n     *   }\n     * \u003c/pre\u003e\n     *\n     * @param node the node to use, not null\n     * @return a new, single use {@link Iterator}\n     * @throws NullPointerException if node is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 864,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 867,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.peekingIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 882,
      "end_line": 884,
      "comment": "\n     * Gets an iterator that supports one-element lookahead.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to decorate, not null\n     * @return a peeking iterator\n     * @throws NullPointerException if the iterator is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.pushbackIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 898,
      "end_line": 900,
      "comment": "\n     * Gets an iterator that supports pushback of elements.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to decorate, not null\n     * @return a pushback iterator\n     * @throws NullPointerException if the iterator is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.skippingIterator(java.util.Iterator\u003cE\u003e, long)",
      "begin_line": 914,
      "end_line": 916,
      "comment": "\n     * Decorates the specified iterator to skip the first N elements.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to decorate\n     * @param offset  the first number of elements to skip\n     * @return a new skipping iterator\n     * @throws IllegalArgumentException if the iterator is null or offset is negative\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 915,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.zippingIterator(java.util.Iterator\u003c? extends E\u003e, java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 930,
      "end_line": 933,
      "comment": "\n     * Returns an iterator that interleaves elements from the decorated iterators.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param a  the first iterator to interleave\n     * @param b  the second iterator to interleave\n     * @return an iterator, interleaving the decorated iterators\n     * @throws IllegalArgumentException if any iterator is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.zippingIterator(java.util.Iterator\u003c? extends E\u003e, java.util.Iterator\u003c? extends E\u003e, java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 946,
      "end_line": 950,
      "comment": "\n     * Returns an iterator that interleaves elements from the decorated iterators.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param a  the first iterator to interleave\n     * @param b  the second iterator to interleave\n     * @param c  the third iterator to interleave\n     * @return an iterator, interleaving the decorated iterators\n     * @throws IllegalArgumentException if any iterator is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.zippingIterator(java.util.Iterator\u003c? extends E\u003e...)",
      "begin_line": 961,
      "end_line": 963,
      "comment": "\n     * Returns an iterator that interleaves elements from the decorated iterators.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterators  the array of iterators to interleave\n     * @return an iterator, interleaving the decorated iterators\n     * @throws IllegalArgumentException if any iterator is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.asIterator(java.util.Enumeration\u003c? extends E\u003e)",
      "begin_line": 974,
      "end_line": 979,
      "comment": "\n     * Gets an iterator that provides an iterator view of the given enumeration.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param enumeration  the enumeration to use\n     * @return a new iterator\n     ",
      "child_ranges": [
        "(line 975,col 9)-(line 977,col 9)",
        "(line 978,col 9)-(line 978,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.asIterator(java.util.Enumeration\u003c? extends E\u003e, java.util.Collection\u003c? super E\u003e)",
      "begin_line": 990,
      "end_line": 999,
      "comment": "\n     * Gets an iterator that provides an iterator view of the given enumeration\n     * that will remove elements from the specified collection.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param enumeration  the enumeration to use\n     * @param removeCollection  the collection to remove elements from\n     * @return a new iterator\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 994,col 9)",
        "(line 995,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 998,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.asEnumeration(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 1009,
      "end_line": 1014,
      "comment": "\n     * Gets an enumeration that wraps an iterator.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to use, not null\n     * @return a new enumeration\n     * @throws NullPointerException if iterator is null\n     ",
      "child_ranges": [
        "(line 1010,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1013,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.asIterable(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 1025,
      "end_line": 1030,
      "comment": "\n     * Gets an {@link Iterable} that wraps an iterator.  The returned {@link Iterable} can be\n     * used for a single iteration.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to use, not null\n     * @return a new, single use {@link Iterable}\n     * @throws NullPointerException if iterator is null\n     ",
      "child_ranges": [
        "(line 1026,col 9)-(line 1028,col 9)",
        "(line 1029,col 9)-(line 1029,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.asMultipleUseIterable(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 1041,
      "end_line": 1046,
      "comment": "\n     * Gets an iterable that wraps an iterator.  The returned iterable can be\n     * used for multiple iterations.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to use, not null\n     * @return a new, multiple use iterable\n     * @throws NullPointerException if iterator is null\n     ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1044,col 9)",
        "(line 1045,col 9)-(line 1045,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.toListIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 1059,
      "end_line": 1064,
      "comment": "\n     * Gets a list iterator based on a simple iterator.\n     * \u003cp\u003e\n     * As the wrapped Iterator is traversed, a LinkedList of its values is\n     * cached, permitting all required operations of ListIterator.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to use, not null\n     * @return a new iterator\n     * @throws NullPointerException if iterator parameter is null\n     ",
      "child_ranges": [
        "(line 1060,col 9)-(line 1062,col 9)",
        "(line 1063,col 9)-(line 1063,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.toArray(java.util.Iterator\u003c?\u003e)",
      "begin_line": 1076,
      "end_line": 1082,
      "comment": "\n     * Gets an array based on an iterator.\n     * \u003cp\u003e\n     * As the wrapped Iterator is traversed, an ArrayList of its values is\n     * created. At the end, this is converted to an array.\n     *\n     * @param iterator  the iterator to use, not null\n     * @return an array of the iterator contents\n     * @throws NullPointerException if iterator parameter is null\n     ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1079,col 9)",
        "(line 1080,col 9)-(line 1080,col 51)",
        "(line 1081,col 9)-(line 1081,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.toArray(java.util.Iterator\u003c? extends E\u003e, java.lang.Class\u003cE\u003e)",
      "begin_line": 1097,
      "end_line": 1108,
      "comment": "\n     * Gets an array based on an iterator.\n     * \u003cp\u003e\n     * As the wrapped Iterator is traversed, an ArrayList of its values is\n     * created. At the end, this is converted to an array.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to use, not null\n     * @param arrayClass  the class of array to create\n     * @return an array of the iterator contents\n     * @throws NullPointerException if iterator parameter or arrayClass is null\n     * @throws ClassCastException if the arrayClass is invalid\n     ",
      "child_ranges": [
        "(line 1098,col 9)-(line 1100,col 9)",
        "(line 1101,col 9)-(line 1103,col 9)",
        "(line 1104,col 9)-(line 1104,col 51)",
        "(line 1105,col 9)-(line 1106,col 75)",
        "(line 1107,col 9)-(line 1107,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.toList(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 1121,
      "end_line": 1123,
      "comment": "\n     * Gets a list based on an iterator.\n     * \u003cp\u003e\n     * As the wrapped Iterator is traversed, an ArrayList of its values is\n     * created. At the end, the list is returned.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to use, not null\n     * @return a list of the iterator contents\n     * @throws NullPointerException if iterator parameter is null\n     ",
      "child_ranges": [
        "(line 1122,col 9)-(line 1122,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.toList(java.util.Iterator\u003c? extends E\u003e, int)",
      "begin_line": 1138,
      "end_line": 1150,
      "comment": "\n     * Gets a list based on an iterator.\n     * \u003cp\u003e\n     * As the wrapped Iterator is traversed, an ArrayList of its values is\n     * created. At the end, the list is returned.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to use, not null\n     * @param estimatedSize  the initial size of the ArrayList\n     * @return a list of the iterator contents\n     * @throws NullPointerException if iterator parameter is null\n     * @throws IllegalArgumentException if the size is less than 1\n     ",
      "child_ranges": [
        "(line 1139,col 9)-(line 1141,col 9)",
        "(line 1142,col 9)-(line 1144,col 9)",
        "(line 1145,col 9)-(line 1145,col 61)",
        "(line 1146,col 9)-(line 1148,col 9)",
        "(line 1149,col 9)-(line 1149,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.getIterator(java.lang.Object)",
      "begin_line": 1173,
      "end_line": 1221,
      "comment": "\n     * Gets a suitable Iterator for the given object.\n     * \u003cp\u003e\n     * This method can handle objects as follows\n     * \u003cul\u003e\n     * \u003cli\u003enull - empty iterator\n     * \u003cli\u003eIterator - returned directly\n     * \u003cli\u003eEnumeration - wrapped\n     * \u003cli\u003eCollection - iterator from collection returned\n     * \u003cli\u003eMap - values iterator returned\n     * \u003cli\u003eDictionary - values (elements) enumeration returned as iterator\n     * \u003cli\u003earray - iterator over array returned\n     * \u003cli\u003eobject with iterator() public method accessed by reflection\n     * \u003cli\u003eobject - singleton iterator\n     * \u003cli\u003eNodeList - iterator over the list\n     * \u003cli\u003eNode - iterator over the child nodes\n     * \u003c/ul\u003e\n     *\n     * @param obj  the object to convert to an iterator\n     * @return a suitable iterator, never null\n     ",
      "child_ranges": [
        "(line 1174,col 9)-(line 1176,col 9)",
        "(line 1177,col 9)-(line 1179,col 9)",
        "(line 1180,col 9)-(line 1182,col 9)",
        "(line 1183,col 9)-(line 1185,col 9)",
        "(line 1186,col 9)-(line 1188,col 9)",
        "(line 1189,col 9)-(line 1191,col 9)",
        "(line 1192,col 9)-(line 1194,col 9)",
        "(line 1195,col 9)-(line 1197,col 9)",
        "(line 1198,col 9)-(line 1202,col 9)",
        "(line 1203,col 9)-(line 1219,col 9)",
        "(line 1220,col 9)-(line 1220,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.apply(java.util.Iterator\u003cE\u003e, org.apache.commons.collections4.Closure\u003c? super E\u003e)",
      "begin_line": 1235,
      "end_line": 1246,
      "comment": "\n     * Applies the closure to each element of the provided iterator.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to use, may be null\n     * @param closure  the closure to apply to each element, may not be null\n     * @throws NullPointerException if closure is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 1236,col 9)-(line 1238,col 9)",
        "(line 1240,col 9)-(line 1245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.find(java.util.Iterator\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 1260,
      "end_line": 1274,
      "comment": "\n     * Finds the first element in the given iterator which matches the given predicate.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterator returns null.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to search, may be null\n     * @param predicate  the predicate to use, may not be null\n     * @return the first element of the iterator which matches the predicate or null if none could be found\n     * @throws NullPointerException if predicate is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 1261,col 9)-(line 1263,col 9)",
        "(line 1265,col 9)-(line 1272,col 9)",
        "(line 1273,col 9)-(line 1273,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.matchesAny(java.util.Iterator\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 1288,
      "end_line": 1302,
      "comment": "\n     * Answers true if a predicate is true for any element of the iterator.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterator returns false.\n     *\n     * @param \u003cE\u003e  the type of object the {@link Iterator} contains\n     * @param iterator  the {@link Iterator} to use, may be null\n     * @param predicate  the predicate to use, may not be null\n     * @return true if any element of the collection matches the predicate, false otherwise\n     * @throws NullPointerException if predicate is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 1289,col 9)-(line 1291,col 9)",
        "(line 1293,col 9)-(line 1300,col 9)",
        "(line 1301,col 9)-(line 1301,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.matchesAll(java.util.Iterator\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 1317,
      "end_line": 1331,
      "comment": "\n     * Answers true if a predicate is true for every element of an iterator.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterator returns true.\n     *\n     * @param \u003cE\u003e  the type of object the {@link Iterator} contains\n     * @param iterator  the {@link Iterator} to use, may be null\n     * @param predicate  the predicate to use, may not be null\n     * @return true if every element of the collection matches the predicate or if the\n     *   collection is empty, false otherwise\n     * @throws NullPointerException if predicate is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 1318,col 9)-(line 1320,col 9)",
        "(line 1322,col 9)-(line 1329,col 9)",
        "(line 1330,col 9)-(line 1330,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.isEmpty(java.util.Iterator\u003c?\u003e)",
      "begin_line": 1342,
      "end_line": 1344,
      "comment": "\n     * Checks if the given iterator is empty.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterator returns true.\n     *\n     * @param iterator  the {@link Iterator} to use, may be null\n     * @return true if the iterator is exhausted or null, false otherwise\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 1343,col 9)-(line 1343,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.contains(java.util.Iterator\u003cE\u003e, java.lang.Object)",
      "begin_line": 1357,
      "end_line": 1359,
      "comment": "\n     * Checks if the object is contained in the given iterator.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterator returns false.\n     *\n     * @param \u003cE\u003e  the type of object the {@link Iterator} contains\n     * @param iterator  the iterator to check, may be null\n     * @param object  the object to check\n     * @return true if the object is contained in the iterator, false otherwise\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 1358,col 9)-(line 1358,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.get(java.util.Iterator\u003cE\u003e, int)",
      "begin_line": 1376,
      "end_line": 1387,
      "comment": "\n     * Returns the \u003ccode\u003eindex\u003c/code\u003e-th value in {@link Iterator}, throwing\n     * \u003ccode\u003eIndexOutOfBoundsException\u003c/code\u003e if there is no such element.\n     * \u003cp\u003e\n     * The Iterator is advanced to \u003ccode\u003eindex\u003c/code\u003e (or to the end, if\n     * \u003ccode\u003eindex\u003c/code\u003e exceeds the number of entries) as a side effect of this method.\n     *\n     * @param \u003cE\u003e  the type of object in the {@link Iterator}\n     * @param iterator  the iterator to get a value from\n     * @param index  the index to get\n     * @return the object at the specified index\n     * @throws IndexOutOfBoundsException if the index is invalid\n     * @throws IllegalArgumentException if the object type is invalid\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 1377,col 9)-(line 1377,col 22)",
        "(line 1378,col 9)-(line 1378,col 44)",
        "(line 1379,col 9)-(line 1385,col 9)",
        "(line 1386,col 9)-(line 1386,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.size(java.util.Iterator\u003c?\u003e)",
      "begin_line": 1398,
      "end_line": 1407,
      "comment": "\n     * Returns the number of elements contained in the given iterator.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e or empty iterator returns {@code 0}.\n     *\n     * @param iterator  the iterator to check, may be null\n     * @return the number of elements contained in the iterator\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 1399,col 9)-(line 1399,col 21)",
        "(line 1400,col 9)-(line 1405,col 9)",
        "(line 1406,col 9)-(line 1406,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.toString(java.util.Iterator\u003cE\u003e)",
      "begin_line": 1422,
      "end_line": 1426,
      "comment": "\n     * Returns a string representation of the elements of the specified iterator.\n     * \u003cp\u003e\n     * The string representation consists of a list of the iterator\u0027s elements,\n     * enclosed in square brackets ({@code \"[]\"}). Adjacent elements are separated\n     * by the characters {@code \", \"} (a comma followed by a space). Elements are\n     * converted to strings as by {@code String.valueOf(Object)}.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to convert to a string\n     * @return a string representation of {@code iterator}\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 1423,col 9)-(line 1425,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.toString(java.util.Iterator\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, java.lang.String\u003e)",
      "begin_line": 1443,
      "end_line": 1447,
      "comment": "\n     * Returns a string representation of the elements of the specified iterator.\n     * \u003cp\u003e\n     * The string representation consists of a list of the iterable\u0027s elements,\n     * enclosed in square brackets ({@code \"[]\"}). Adjacent elements are separated\n     * by the characters {@code \", \"} (a comma followed by a space). Elements are\n     * converted to strings as by using the provided {@code transformer}.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to convert to a string, may be null\n     * @param transformer  the transformer used to get a string representation of an element\n     * @return a string representation of {@code iterator}\n     * @throws NullPointerException if {@code transformer} is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 1445,col 9)-(line 1446,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.IteratorUtils.toString(java.util.Iterator\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, java.lang.String\u003e, java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 1467,
      "end_line": 1497,
      "comment": "\n     * Returns a string representation of the elements of the specified iterator.\n     * \u003cp\u003e\n     * The string representation consists of a list of the iterator\u0027s elements,\n     * enclosed by the provided {@code prefix} and {@code suffix}. Adjacent elements\n     * are separated by the provided {@code delimiter}. Elements are converted to\n     * strings as by using the provided {@code transformer}.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to convert to a string, may be null\n     * @param transformer  the transformer used to get a string representation of an element\n     * @param delimiter  the string to delimit elements\n     * @param prefix  the prefix, prepended to the string representation\n     * @param suffix  the suffix, appended to the string representation\n     * @return a string representation of {@code iterator}\n     * @throws NullPointerException if either transformer, delimiter, prefix or suffix is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 1472,col 9)-(line 1474,col 9)",
        "(line 1475,col 9)-(line 1477,col 9)",
        "(line 1478,col 9)-(line 1480,col 9)",
        "(line 1481,col 9)-(line 1483,col 9)",
        "(line 1484,col 9)-(line 1484,col 70)",
        "(line 1485,col 9)-(line 1494,col 9)",
        "(line 1495,col 9)-(line 1495,col 37)",
        "(line 1496,col 9)-(line 1496,col 40)"
      ]
    }
  ]
}