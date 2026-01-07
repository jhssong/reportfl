{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/ListUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ListUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 705,
      "comment": "\n * Provides utility methods and decorators for {@link List} instances.\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.ListUtils.ListUtils()",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * \u003ccode\u003eListUtils\u003c/code\u003e should not normally be instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.emptyIfNull(java.util.List\u003cT\u003e)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Returns an immutable empty list if the argument is \u003ccode\u003enull\u003c/code\u003e,\n     * or the argument itself otherwise.\n     *\n     * @param \u003cT\u003e the element type\n     * @param list the list, possibly \u003ccode\u003enull\u003c/code\u003e\n     * @return an empty list if the argument is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.defaultIfNull(java.util.List\u003cT\u003e, java.util.List\u003cT\u003e)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Returns either the passed in list, or if the list is {@code null},\n     * the value of {@code defaultList}.\n     *\n     * @param \u003cT\u003e the element type\n     * @param list  the list, possibly {@code null}\n     * @param defaultList  the returned values if list is {@code null}\n     * @return an empty list if the argument is \u003ccode\u003enull\u003c/code\u003e\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.intersection(java.util.List\u003c? extends E\u003e, java.util.List\u003c? extends E\u003e)",
      "begin_line": 89,
      "end_line": 108,
      "comment": "\n     * Returns a new list containing all elements that are contained in\n     * both given lists.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param list1  the first list\n     * @param list2  the second list\n     * @return  the intersection of those two lists\n     * @throws NullPointerException if either list is null\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 50)",
        "(line 92,col 9)-(line 92,col 42)",
        "(line 93,col 9)-(line 93,col 41)",
        "(line 94,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 99,col 59)",
        "(line 101,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.subtract(java.util.List\u003cE\u003e, java.util.List\u003c? extends E\u003e)",
      "begin_line": 126,
      "end_line": 135,
      "comment": "\n     * Subtracts all elements in the second list from the first list,\n     * placing the results in a new list.\n     * \u003cp\u003e\n     * This differs from {@link List#removeAll(Collection)} in that\n     * cardinality is respected; if \u003cCode\u003elist1\u003c/Code\u003e contains two\n     * occurrences of \u003cCode\u003enull\u003c/Code\u003e and \u003cCode\u003elist2\u003c/Code\u003e only\n     * contains one occurrence, then the returned list will still contain\n     * one occurrence.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param list1  the list to subtract from\n     * @param list2  the list to subtract\n     * @return  a new list containing the results\n     * @throws NullPointerException if either list is null\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 55)",
        "(line 128,col 9)-(line 128,col 53)",
        "(line 129,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.sum(java.util.List\u003c? extends E\u003e, java.util.List\u003c? extends E\u003e)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Returns the sum of the given lists.  This is their intersection\n     * subtracted from their union.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param list1  the first list\n     * @param list2  the second list\n     * @return  a new list containing the sum of those lists\n     * @throws NullPointerException if either list is null\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.union(java.util.List\u003c? extends E\u003e, java.util.List\u003c? extends E\u003e)",
      "begin_line": 162,
      "end_line": 166,
      "comment": "\n     * Returns a new list containing the second list appended to the\n     * first list.  The {@link List#addAll(Collection)} operation is\n     * used to append the two given lists into a new list.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param list1  the first list\n     * @param list2  the second list\n     * @return  a new list containing the union of those lists\n     * @throws NullPointerException if either list is null\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 60)",
        "(line 164,col 9)-(line 164,col 29)",
        "(line 165,col 9)-(line 165,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.select(java.util.Collection\u003c? extends E\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\n     * Selects all elements from input collection which match the given\n     * predicate into an output list.\n     * \u003cp\u003e\n     * A \u003ccode\u003enull\u003c/code\u003e predicate matches no elements.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param inputCollection\n     *            the collection to get the input from, may not be null\n     * @param predicate\n     *            the predicate to use, may be null\n     * @return the elements matching the predicate (new list)\n     * @throws NullPointerException\n     *             if the input list is null\n     *\n     * @since 4.0\n     * @see CollectionUtils#select(Iterable, Predicate)\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.selectRejected(java.util.Collection\u003c? extends E\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 210,
      "end_line": 213,
      "comment": "\n     * Selects all elements from inputCollection which don\u0027t match the given\n     * predicate into an output collection.\n     * \u003cp\u003e\n     * If the input predicate is \u003ccode\u003enull\u003c/code\u003e, the result is an empty\n     * list.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param inputCollection\n     *            the collection to get the input from, may not be null\n     * @param predicate\n     *            the predicate to use, may be null\n     * @return the elements \u003cb\u003enot\u003c/b\u003e matching the predicate (new list)\n     * @throws NullPointerException\n     *             if the input collection is null\n     *\n     * @since 4.0\n     * @see CollectionUtils#selectRejected(Iterable, Predicate)\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 116)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.isEqualList(java.util.Collection\u003c?\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 244,
      "end_line": 267,
      "comment": "\n     * Tests two lists for value-equality as per the equality contract in\n     * {@link java.util.List#equals(java.lang.Object)}.\n     * \u003cp\u003e\n     * This method is useful for implementing \u003ccode\u003eList\u003c/code\u003e when you cannot\n     * extend AbstractList. The method takes Collection instances to enable other\n     * collection types to use the List implementation algorithm.\n     * \u003cp\u003e\n     * The relevant text (slightly paraphrased as this is a static method) is:\n     * \u003cblockquote\u003e\n     * Compares the two list objects for equality.  Returns\n     * {@code true} if and only if both\n     * lists have the same size, and all corresponding pairs of elements in\n     * the two lists are \u003ci\u003eequal\u003c/i\u003e.  (Two elements {@code e1} and\n     * {@code e2} are \u003ci\u003eequal\u003c/i\u003e if \u003ctt\u003e(e1\u003d\u003dnull ? e2\u003d\u003dnull :\n     * e1.equals(e2))\u003c/tt\u003e.)  In other words, two lists are defined to be\n     * equal if they contain the same elements in the same order.  This\n     * definition ensures that the equals method works properly across\n     * different implementations of the {@code List} interface.\n     * \u003c/blockquote\u003e\n     *\n     * \u003cb\u003eNote:\u003c/b\u003e The behaviour of this method is undefined if the lists are\n     * modified during the equals comparison.\n     *\n     * @see java.util.List\n     * @param list1  the first list, may be null\n     * @param list2  the second list, may be null\n     * @return whether the lists are equal by value comparison\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 49)",
        "(line 253,col 9)-(line 253,col 49)",
        "(line 254,col 9)-(line 254,col 27)",
        "(line 255,col 9)-(line 255,col 27)",
        "(line 257,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 266,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.hashCodeForList(java.util.Collection\u003c?\u003e)",
      "begin_line": 281,
      "end_line": 293,
      "comment": "\n     * Generates a hash code using the algorithm specified in\n     * {@link java.util.List#hashCode()}.\n     * \u003cp\u003e\n     * This method is useful for implementing \u003ccode\u003eList\u003c/code\u003e when you cannot\n     * extend AbstractList. The method takes Collection instances to enable other\n     * collection types to use the List implementation algorithm.\n     *\n     * @see java.util.List#hashCode()\n     * @param list  the list to generate the hashCode for, may be null\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 25)",
        "(line 286,col 9)-(line 286,col 47)",
        "(line 288,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.retainAll(java.util.Collection\u003cE\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 318,
      "end_line": 327,
      "comment": "\n     * Returns a List containing all the elements in \u003ccode\u003ecollection\u003c/code\u003e\n     * that are also in \u003ccode\u003eretain\u003c/code\u003e. The cardinality of an element \u003ccode\u003ee\u003c/code\u003e\n     * in the returned list is the same as the cardinality of \u003ccode\u003ee\u003c/code\u003e\n     * in \u003ccode\u003ecollection\u003c/code\u003e unless \u003ccode\u003eretain\u003c/code\u003e does not contain \u003ccode\u003ee\u003c/code\u003e, in which\n     * case the cardinality is zero. This method is useful if you do not wish to modify\n     * the collection \u003ccode\u003ec\u003c/code\u003e and thus cannot call \u003ccode\u003ecollection.retainAll(retain);\u003c/code\u003e.\n     * \u003cp\u003e\n     * This implementation iterates over \u003ccode\u003ecollection\u003c/code\u003e, checking each element in\n     * turn to see if it\u0027s contained in \u003ccode\u003eretain\u003c/code\u003e. If it\u0027s contained, it\u0027s added\n     * to the returned list. As a consequence, it is advised to use a collection type for\n     * \u003ccode\u003eretain\u003c/code\u003e that provides a fast (e.g. O(1)) implementation of\n     * {@link Collection#contains(Object)}.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param collection  the collection whose contents are the target of the #retailAll operation\n     * @param retain  the collection containing the elements to be retained in the returned collection\n     * @return a \u003ccode\u003eList\u003c/code\u003e containing all the elements of \u003ccode\u003ec\u003c/code\u003e\n     * that occur at least once in \u003ccode\u003eretain\u003c/code\u003e.\n     * @throws NullPointerException if either parameter is null\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 90)",
        "(line 321,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 326,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.removeAll(java.util.Collection\u003cE\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 352,
      "end_line": 360,
      "comment": "\n     * Removes the elements in \u003ccode\u003eremove\u003c/code\u003e from \u003ccode\u003ecollection\u003c/code\u003e. That is, this\n     * method returns a list containing all the elements in \u003ccode\u003ecollection\u003c/code\u003e\n     * that are not in \u003ccode\u003eremove\u003c/code\u003e. The cardinality of an element \u003ccode\u003ee\u003c/code\u003e\n     * in the returned collection is the same as the cardinality of \u003ccode\u003ee\u003c/code\u003e\n     * in \u003ccode\u003ecollection\u003c/code\u003e unless \u003ccode\u003eremove\u003c/code\u003e contains \u003ccode\u003ee\u003c/code\u003e, in which\n     * case the cardinality is zero. This method is useful if you do not wish to modify\n     * \u003ccode\u003ecollection\u003c/code\u003e and thus cannot call \u003ccode\u003ecollection.removeAll(remove);\u003c/code\u003e.\n     * \u003cp\u003e\n     * This implementation iterates over \u003ccode\u003ecollection\u003c/code\u003e, checking each element in\n     * turn to see if it\u0027s contained in \u003ccode\u003eremove\u003c/code\u003e. If it\u0027s not contained, it\u0027s added\n     * to the returned list. As a consequence, it is advised to use a collection type for\n     * \u003ccode\u003eremove\u003c/code\u003e that provides a fast (e.g. O(1)) implementation of\n     * {@link Collection#contains(Object)}.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param collection  the collection from which items are removed (in the returned collection)\n     * @param remove  the items to be removed from the returned \u003ccode\u003ecollection\u003c/code\u003e\n     * @return a \u003ccode\u003eList\u003c/code\u003e containing all the elements of \u003ccode\u003ec\u003c/code\u003e except\n     * any elements that also occur in \u003ccode\u003eremove\u003c/code\u003e.\n     * @throws NullPointerException if either parameter is null\n     * @since 3.2\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 48)",
        "(line 354,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.synchronizedList(java.util.List\u003cE\u003e)",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\n     * Returns a synchronized list backed by the given list.\n     * \u003cp\u003e\n     * You must manually synchronize on the returned list\u0027s iterator to\n     * avoid non-deterministic behavior:\n     *\n     * \u003cpre\u003e\n     * List list \u003d ListUtils.synchronizedList(myList);\n     * synchronized (list) {\n     *     Iterator i \u003d list.iterator();\n     *     while (i.hasNext()) {\n     *         process (i.next());\n     *     }\n     * }\n     * \u003c/pre\u003e\n     *\n     * This method is just a wrapper for {@link Collections#synchronizedList(List)}.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param list  the list to synchronize, must not be null\n     * @return a synchronized list backed by the given list\n     * @throws IllegalArgumentException  if the list is null\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.unmodifiableList(java.util.List\u003c? extends E\u003e)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n     * Returns an unmodifiable list backed by the given list.\n     * \u003cp\u003e\n     * This method uses the implementation in the decorators subpackage.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param list  the list to make unmodifiable, must not be null\n     * @return an unmodifiable list backed by the given list\n     * @throws IllegalArgumentException  if the list is null\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.predicatedList(java.util.List\u003cE\u003e, org.apache.commons.collections4.Predicate\u003cE\u003e)",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\n     * Returns a predicated (validating) list backed by the given list.\n     * \u003cp\u003e\n     * Only objects that pass the test in the given predicate can be added to the list.\n     * Trying to add an invalid object results in an IllegalArgumentException.\n     * It is important not to use the original list after invoking this method,\n     * as it is a backdoor for adding invalid objects.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param list  the list to predicate, must not be null\n     * @param predicate  the predicate for the list, must not be null\n     * @return a predicated list backed by the given list\n     * @throws IllegalArgumentException  if the List or Predicate is null\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.transformedList(java.util.List\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 442,
      "end_line": 445,
      "comment": "\n     * Returns a transformed list backed by the given list.\n     * \u003cp\u003e\n     * This method returns a new list (decorating the specified list) that\n     * will transform any new entries added to it.\n     * Existing entries in the specified list will not be transformed.\n     * \u003cp\u003e\n     * Each object is passed through the transformer as it is added to the\n     * List. It is important not to use the original list after invoking this\n     * method, as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * Existing entries in the specified list will not be transformed.\n     * If you want that behaviour, see {@link TransformedList#transformedList}.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param list  the list to predicate, must not be null\n     * @param transformer  the transformer for the list, must not be null\n     * @return a transformed list backed by the given list\n     * @throws IllegalArgumentException  if the List or Transformer is null\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.lazyList(java.util.List\u003cE\u003e, org.apache.commons.collections4.Factory\u003c? extends E\u003e)",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n     * Returns a \"lazy\" list whose elements will be created on demand.\n     * \u003cp\u003e\n     * When the index passed to the returned list\u0027s {@link List#get(int) get}\n     * method is greater than the list\u0027s size, then the factory will be used\n     * to create a new object and that object will be inserted at that index.\n     * \u003cp\u003e\n     * For instance:\n     *\n     * \u003cpre\u003e\n     * Factory\u0026lt;Date\u0026gt; factory \u003d new Factory\u0026lt;Date\u0026gt;() {\n     *     public Date create() {\n     *         return new Date();\n     *     }\n     * }\n     * List\u0026lt;Date\u0026gt; lazy \u003d ListUtils.lazyList(new ArrayList\u0026lt;Date\u0026gt;(), factory);\n     * Date date \u003d lazy.get(3);\n     * \u003c/pre\u003e\n     *\n     * After the above code is executed, \u003ccode\u003edate\u003c/code\u003e will refer to\n     * a new \u003ccode\u003eDate\u003c/code\u003e instance.  Furthermore, that \u003ccode\u003eDate\u003c/code\u003e\n     * instance is the fourth element in the list.  The first, second,\n     * and third element are all set to \u003ccode\u003enull\u003c/code\u003e.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param list  the list to make lazy, must not be null\n     * @param factory  the factory for creating new objects, must not be null\n     * @return a lazy list backed by the given list\n     * @throws IllegalArgumentException  if the List or Factory is null\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.fixedSizeList(java.util.List\u003cE\u003e)",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * Returns a fixed-sized list backed by the given list.\n     * Elements may not be added or removed from the returned list, but\n     * existing elements can be changed (for instance, via the\n     * {@link List#set(int, Object)} method).\n     *\n     * @param \u003cE\u003e  the element type\n     * @param list  the list whose size to fix, must not be null\n     * @return a fixed-size list backed by that list\n     * @throws IllegalArgumentException  if the List is null\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.indexOf(java.util.List\u003cE\u003e, org.apache.commons.collections4.Predicate\u003cE\u003e)",
      "begin_line": 508,
      "end_line": 518,
      "comment": "\n     * Finds the first index in the given List which matches the given predicate.\n     * \u003cp\u003e\n     * If the input List or predicate is null, or no element of the List\n     * matches the predicate, -1 is returned.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param list the List to search, may be null\n     * @param predicate  the predicate to use, may be null\n     * @return the first index of an Object in the List which matches the predicate or -1 if none could be found\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.longestCommonSubsequence(java.util.List\u003cE\u003e, java.util.List\u003cE\u003e)",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\n     * Returns the longest common subsequence (LCS) of two sequences (lists).\n     *\n     * @param \u003cE\u003e  the element type\n     * @param a  the first list\n     * @param b  the second list\n     * @return the longest common subsequence\n     * @throws IllegalArgumentException if either list is {@code null}\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 532,col 7)-(line 532,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.longestCommonSubsequence(java.util.List\u003cE\u003e, java.util.List\u003cE\u003e, org.apache.commons.collections4.Equator\u003c? super E\u003e)",
      "begin_line": 546,
      "end_line": 560,
      "comment": "\n     * Returns the longest common subsequence (LCS) of two sequences (lists).\n     *\n     * @param \u003cE\u003e  the element type\n     * @param a  the first list\n     * @param b  the second list\n     * @param equator  the equator used to test object equality\n     * @return the longest common subsequence\n     * @throws IllegalArgumentException if either list or the equator is {@code null}\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 555,col 9)-(line 555,col 92)",
        "(line 556,col 9)-(line 556,col 60)",
        "(line 557,col 9)-(line 557,col 58)",
        "(line 558,col 9)-(line 558,col 30)",
        "(line 559,col 9)-(line 559,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.longestCommonSubsequence(java.lang.CharSequence, java.lang.CharSequence)",
      "begin_line": 574,
      "end_line": 584,
      "comment": "\n     * Returns the longest common subsequence (LCS) of two {@link CharSequence} objects.\n     * \u003cp\u003e\n     * This is a convenience method for using {@link #longestCommonSubsequence(List, List)}\n     * with {@link CharSequence} instances.\n     *\n     * @param a  the first sequence\n     * @param b  the second sequence\n     * @return the longest common subsequence as {@link String}\n     * @throws IllegalArgumentException if either sequence is {@code null}\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 119)",
        "(line 579,col 9)-(line 579,col 53)",
        "(line 580,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 583,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LcsVisitor",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.sequence.CommandVisitor\u003cE\u003e"
      ],
      "begin_line": 589,
      "end_line": 607,
      "comment": "\n     * A helper class used to construct the longest common subsequence.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sequence"
      ],
      "begin_line": 590,
      "end_line": 590,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.ListUtils.LcsVisitor.LcsVisitor()",
      "begin_line": 592,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 593,col 13)-(line 593,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.LcsVisitor.visitInsertCommand(E)",
      "begin_line": 596,
      "end_line": 596,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.LcsVisitor.visitDeleteCommand(E)",
      "begin_line": 598,
      "end_line": 598,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.LcsVisitor.visitKeepCommand(E)",
      "begin_line": 600,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 601,col 13)-(line 601,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.LcsVisitor.getSubSequence()",
      "begin_line": 604,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 605,col 13)-(line 605,col 28)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CharSequenceAsList",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractList\u003cjava.lang.Character\u003e"
      ],
      "begin_line": 612,
      "end_line": 630,
      "comment": "\n     * A simple wrapper to use a CharSequence as List.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sequence"
      ],
      "begin_line": 614,
      "end_line": 614,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.ListUtils.CharSequenceAsList.CharSequenceAsList(java.lang.CharSequence)",
      "begin_line": 616,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.CharSequenceAsList.get(int)",
      "begin_line": 620,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.CharSequenceAsList.size()",
      "begin_line": 625,
      "end_line": 628,
      "comment": "",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.partition(java.util.List\u003cT\u003e, int)",
      "begin_line": 654,
      "end_line": 662,
      "comment": "\n     * Returns consecutive {@link List#subList(int, int) sublists} of a\n     * list, each of the same size (the final list may be smaller). For example,\n     * partitioning a list containing {@code [a, b, c, d, e]} with a partition\n     * size of 3 yields {@code [[a, b, c], [d, e]]} -- an outer list containing\n     * two inner lists of three and two elements, all in the original order.\n     * \u003cp\u003e\n     * The outer list is unmodifiable, but reflects the latest state of the\n     * source list. The inner lists are sublist views of the original list,\n     * produced on demand using {@link List#subList(int, int)}, and are subject\n     * to all the usual caveats about modification as explained in that API.\n     * \u003cp\u003e\n     * Adapted from http://code.google.com/p/guava-libraries/\n     *\n     * @param \u003cT\u003e  the element type\n     * @param list  the list to return consecutive sublists of\n     * @param size  the desired size of each sublist (the last may be smaller)\n     * @return a list of consecutive sublists\n     * @throws IllegalArgumentException if list is {@code null} or size is not strictly positive\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 661,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Partition",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractList\u003cjava.util.List\u003cT\u003e\u003e"
      ],
      "begin_line": 668,
      "end_line": 704,
      "comment": "\n     * Provides a partition view on a {@link List}.\n     * @since 4.0\n     "
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 669,
      "end_line": 669,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 670,
      "end_line": 670,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.ListUtils.Partition.Partition(java.util.List\u003cT\u003e, int)",
      "begin_line": 672,
      "end_line": 675,
      "comment": "",
      "child_ranges": [
        "(line 673,col 13)-(line 673,col 29)",
        "(line 674,col 13)-(line 674,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.Partition.get(int)",
      "begin_line": 677,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 679,col 13)-(line 679,col 40)",
        "(line 680,col 13)-(line 682,col 13)",
        "(line 683,col 13)-(line 685,col 13)",
        "(line 686,col 13)-(line 689,col 13)",
        "(line 690,col 13)-(line 690,col 43)",
        "(line 691,col 13)-(line 691,col 64)",
        "(line 692,col 13)-(line 692,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.Partition.size()",
      "begin_line": 695,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 697,col 13)-(line 697,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.ListUtils.Partition.isEmpty()",
      "begin_line": 700,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 702,col 13)-(line 702,col 34)"
      ]
    }
  ]
}