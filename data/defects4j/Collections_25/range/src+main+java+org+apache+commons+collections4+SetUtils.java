{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/SetUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SetUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 422,
      "comment": "\n * Provides utility methods and decorators for\n * {@link Set} and {@link SortedSet} instances.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.emptySet()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Get a typed empty unmodifiable Set.\n     * @param \u003cE\u003e the element type\n     * @return an empty Set\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 41)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_SORTED_SET"
      ],
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * An empty unmodifiable sorted set.\n     * This is not provided in the JDK.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.emptySortedSet()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Get a typed empty unmodifiable sorted set.\n     * @param \u003cE\u003e the element type\n     * @return an empty sorted Set\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.SetUtils.SetUtils()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * \u003ccode\u003eSetUtils\u003c/code\u003e should not normally be instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.emptyIfNull(java.util.Set\u003cT\u003e)",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Returns an immutable empty set if the argument is \u003ccode\u003enull\u003c/code\u003e,\n     * or the argument itself otherwise.\n     *\n     * @param \u003cT\u003e the element type\n     * @param set the set, possibly \u003ccode\u003enull\u003c/code\u003e\n     * @return an empty set if the argument is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.isEqualSet(java.util.Collection\u003c?\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 121,
      "end_line": 130,
      "comment": "\n     * Tests two sets for equality as per the \u003ccode\u003eequals()\u003c/code\u003e contract\n     * in {@link java.util.Set#equals(java.lang.Object)}.\n     * \u003cp\u003e\n     * This method is useful for implementing \u003ccode\u003eSet\u003c/code\u003e when you cannot\n     * extend AbstractSet. The method takes Collection instances to enable other\n     * collection types to use the Set implementation algorithm.\n     * \u003cp\u003e\n     * The relevant text (slightly paraphrased as this is a static method) is:\n     * \u003cblockquote\u003e\n     * \u003cp\u003eTwo sets are considered equal if they have\n     * the same size, and every member of the first set is contained in\n     * the second. This ensures that the {@code equals} method works\n     * properly across different implementations of the {@code Set}\n     * interface.\u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This implementation first checks if the two sets are the same object:\n     * if so it returns {@code true}.  Then, it checks if the two sets are\n     * identical in size; if not, it returns false. If so, it returns\n     * {@code a.containsAll((Collection) b)}.\u003c/p\u003e\n     * \u003c/blockquote\u003e\n     *\n     * @see java.util.Set\n     * @param set1  the first set, may be null\n     * @param set2  the second set, may be null\n     * @return whether the sets are equal by value comparison\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.hashCodeForSet(java.util.Collection\u003cT\u003e)",
      "begin_line": 145,
      "end_line": 157,
      "comment": "\n     * Generates a hash code using the algorithm specified in\n     * {@link java.util.Set#hashCode()}.\n     * \u003cp\u003e\n     * This method is useful for implementing \u003ccode\u003eSet\u003c/code\u003e when you cannot\n     * extend AbstractSet. The method takes Collection instances to enable other\n     * collection types to use the Set implementation algorithm.\n     *\n     * @param \u003cT\u003e the element type\n     * @see java.util.Set#hashCode()\n     * @param set  the set to calculate the hash code for, may be null\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 150,col 25)",
        "(line 151,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.newIdentityHashSet()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Returns a new hash set that matches elements based on \u003ccode\u003e\u003d\u003d\u003c/code\u003e not\n     * \u003ccode\u003eequals()\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cstrong\u003eThis set will violate the detail of various Set contracts.\u003c/note\u003e\n     * As a general rule, don\u0027t compare this set to other sets. In particular, you can\u0027t\n     * use decorators like {@link ListOrderedSet} on it, which silently assume that these\n     * contracts are fulfilled.\u003c/strong\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote that the returned set is not synchronized and is not thread-safe.\u003c/strong\u003e\n     * If you wish to use this set from multiple threads concurrently, you must use\n     * appropriate synchronization. The simplest approach is to wrap this map\n     * using {@link java.util.Collections#synchronizedSet(Set)}. This class may throw\n     * exceptions when accessed by concurrent threads without synchronization.\n     *\n     * @param \u003cE\u003e  the element type\n     * @return a new identity hash set\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.synchronizedSet(java.util.Set\u003cE\u003e)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * Returns a synchronized set backed by the given set.\n     * \u003cp\u003e\n     * You must manually synchronize on the returned set\u0027s iterator to\n     * avoid non-deterministic behavior:\n     *\n     * \u003cpre\u003e\n     * Set s \u003d SetUtils.synchronizedSet(mySet);\n     * synchronized (s) {\n     *     Iterator i \u003d s.iterator();\n     *     while (i.hasNext()) {\n     *         process (i.next());\n     *     }\n     * }\n     * \u003c/pre\u003e\n     *\n     * This method is just a wrapper for {@link Collections#synchronizedSet(Set)}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to synchronize, must not be null\n     * @return a synchronized set backed by the given set\n     * @throws IllegalArgumentException  if the set is null\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.unmodifiableSet(java.util.Set\u003c? extends E\u003e)",
      "begin_line": 221,
      "end_line": 223,
      "comment": "\n     * Returns an unmodifiable set backed by the given set.\n     * \u003cp\u003e\n     * This method uses the implementation in the decorators subpackage.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to make unmodifiable, must not be null\n     * @return an unmodifiable set backed by the given set\n     * @throws IllegalArgumentException  if the set is null\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.predicatedSet(java.util.Set\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Returns a predicated (validating) set backed by the given set.\n     * \u003cp\u003e\n     * Only objects that pass the test in the given predicate can be added to the set.\n     * Trying to add an invalid object results in an IllegalArgumentException.\n     * It is important not to use the original set after invoking this method,\n     * as it is a backdoor for adding invalid objects.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to predicate, must not be null\n     * @param predicate  the predicate for the set, must not be null\n     * @return a predicated set backed by the given set\n     * @throws IllegalArgumentException  if the Set or Predicate is null\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.transformedSet(java.util.Set\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "\n     * Returns a transformed set backed by the given set.\n     * \u003cp\u003e\n     * Each object is passed through the transformer as it is added to the\n     * Set. It is important not to use the original set after invoking this\n     * method, as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * Existing entries in the specified set will not be transformed.\n     * If you want that behaviour, see {@link TransformedSet#transformedSet}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to transform, must not be null\n     * @param transformer  the transformer for the set, must not be null\n     * @return a transformed set backed by the given set\n     * @throws IllegalArgumentException  if the Set or Transformer is null\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.orderedSet(java.util.Set\u003cE\u003e)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Returns a set that maintains the order of elements that are added\n     * backed by the given set.\n     * \u003cp\u003e\n     * If an element is added twice, the order is determined by the first add.\n     * The order is observed through the iterator or toArray.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to order, must not be null\n     * @return an ordered set backed by the given set\n     * @throws IllegalArgumentException  if the Set is null\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.synchronizedSortedSet(java.util.SortedSet\u003cE\u003e)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * Returns a synchronized sorted set backed by the given sorted set.\n     * \u003cp\u003e\n     * You must manually synchronize on the returned set\u0027s iterator to\n     * avoid non-deterministic behavior:\n     *\n     * \u003cpre\u003e\n     * Set s \u003d SetUtils.synchronizedSortedSet(mySet);\n     * synchronized (s) {\n     *     Iterator i \u003d s.iterator();\n     *     while (i.hasNext()) {\n     *         process (i.next());\n     *     }\n     * }\n     * \u003c/pre\u003e\n     *\n     * This method is just a wrapper for {@link Collections#synchronizedSortedSet(SortedSet)}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the sorted set to synchronize, must not be null\n     * @return a synchronized set backed by the given set\n     * @throws IllegalArgumentException  if the set is null\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.unmodifiableSortedSet(java.util.SortedSet\u003cE\u003e)",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * Returns an unmodifiable sorted set backed by the given sorted set.\n     * \u003cp\u003e\n     * This method uses the implementation in the decorators subpackage.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the sorted set to make unmodifiable, must not be null\n     * @return an unmodifiable set backed by the given set\n     * @throws IllegalArgumentException  if the set is null\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.predicatedSortedSet(java.util.SortedSet\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 337,
      "end_line": 340,
      "comment": "\n     * Returns a predicated (validating) sorted set backed by the given sorted set.\n     * \u003cp\u003e\n     * Only objects that pass the test in the given predicate can be added to the set.\n     * Trying to add an invalid object results in an IllegalArgumentException.\n     * It is important not to use the original set after invoking this method,\n     * as it is a backdoor for adding invalid objects.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the sorted set to predicate, must not be null\n     * @param predicate  the predicate for the sorted set, must not be null\n     * @return a predicated sorted set backed by the given sorted set\n     * @throws IllegalArgumentException  if the Set or Predicate is null\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.transformedSortedSet(java.util.SortedSet\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 358,
      "end_line": 361,
      "comment": "\n     * Returns a transformed sorted set backed by the given set.\n     * \u003cp\u003e\n     * Each object is passed through the transformer as it is added to the\n     * Set. It is important not to use the original set after invoking this\n     * method, as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * Existing entries in the specified set will not be transformed.\n     * If you want that behaviour, see {@link TransformedSortedSet#transformedSortedSet}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to transform, must not be null\n     * @param transformer  the transformer for the set, must not be null\n     * @return a transformed set backed by the given set\n     * @throws IllegalArgumentException  if the Set or Transformer is null\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.unmodifiableNavigableSet(java.util.NavigableSet\u003cE\u003e)",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * Returns an unmodifiable navigable set backed by the given navigable set.\n     * \u003cp\u003e\n     * This method uses the implementation in the decorators subpackage.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the navigable set to make unmodifiable, must not be null\n     * @return an unmodifiable set backed by the given set\n     * @throws IllegalArgumentException  if the set is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.predicatedNavigableSet(java.util.NavigableSet\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 395,
      "end_line": 398,
      "comment": "\n     * Returns a predicated (validating) navigable set backed by the given navigable set.\n     * \u003cp\u003e\n     * Only objects that pass the test in the given predicate can be added to the set.\n     * Trying to add an invalid object results in an IllegalArgumentException.\n     * It is important not to use the original set after invoking this method,\n     * as it is a backdoor for adding invalid objects.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the navigable set to predicate, must not be null\n     * @param predicate  the predicate for the navigable set, must not be null\n     * @return a predicated navigable set backed by the given navigable set\n     * @throws IllegalArgumentException  if the Set or Predicate is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.transformedNavigableSet(java.util.NavigableSet\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 417,
      "end_line": 420,
      "comment": "\n     * Returns a transformed navigable set backed by the given navigable set.\n     * \u003cp\u003e\n     * Each object is passed through the transformer as it is added to the\n     * Set. It is important not to use the original set after invoking this\n     * method, as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * Existing entries in the specified set will not be transformed.\n     * If you want that behaviour, see {@link TransformedNavigableSet#transformedNavigableSet}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the navigable set to transform, must not be null\n     * @param transformer  the transformer for the set, must not be null\n     * @return a transformed set backed by the given set\n     * @throws IllegalArgumentException  if the Set or Transformer is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 82)"
      ]
    }
  ]
}