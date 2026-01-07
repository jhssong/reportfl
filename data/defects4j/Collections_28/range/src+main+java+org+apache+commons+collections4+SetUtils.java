{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/SetUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SetUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 645,
      "comment": "\n * Provides utility methods and decorators for\n * {@link Set} and {@link SortedSet} instances.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.emptySet()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Get a typed empty unmodifiable Set.\n     * @param \u003cE\u003e the element type\n     * @return an empty Set\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 41)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_SORTED_SET"
      ],
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * An empty unmodifiable sorted set.\n     * This is not provided in the JDK.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.emptySortedSet()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Get a typed empty unmodifiable sorted set.\n     * @param \u003cE\u003e the element type\n     * @return an empty sorted Set\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.SetUtils.SetUtils()",
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * \u003ccode\u003eSetUtils\u003c/code\u003e should not normally be instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.emptyIfNull(java.util.Set\u003cT\u003e)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Returns an immutable empty set if the argument is \u003ccode\u003enull\u003c/code\u003e,\n     * or the argument itself otherwise.\n     *\n     * @param \u003cT\u003e the element type\n     * @param set the set, possibly \u003ccode\u003enull\u003c/code\u003e\n     * @return an empty set if the argument is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.isEqualSet(java.util.Collection\u003c?\u003e, java.util.Collection\u003c?\u003e)",
      "begin_line": 124,
      "end_line": 133,
      "comment": "\n     * Tests two sets for equality as per the \u003ccode\u003eequals()\u003c/code\u003e contract\n     * in {@link java.util.Set#equals(java.lang.Object)}.\n     * \u003cp\u003e\n     * This method is useful for implementing \u003ccode\u003eSet\u003c/code\u003e when you cannot\n     * extend AbstractSet. The method takes Collection instances to enable other\n     * collection types to use the Set implementation algorithm.\n     * \u003cp\u003e\n     * The relevant text (slightly paraphrased as this is a static method) is:\n     * \u003cblockquote\u003e\n     * \u003cp\u003eTwo sets are considered equal if they have\n     * the same size, and every member of the first set is contained in\n     * the second. This ensures that the {@code equals} method works\n     * properly across different implementations of the {@code Set}\n     * interface.\u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This implementation first checks if the two sets are the same object:\n     * if so it returns {@code true}.  Then, it checks if the two sets are\n     * identical in size; if not, it returns false. If so, it returns\n     * {@code a.containsAll((Collection) b)}.\u003c/p\u003e\n     * \u003c/blockquote\u003e\n     *\n     * @see java.util.Set\n     * @param set1  the first set, may be null\n     * @param set2  the second set, may be null\n     * @return whether the sets are equal by value comparison\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.hashCodeForSet(java.util.Collection\u003cT\u003e)",
      "begin_line": 148,
      "end_line": 160,
      "comment": "\n     * Generates a hash code using the algorithm specified in\n     * {@link java.util.Set#hashCode()}.\n     * \u003cp\u003e\n     * This method is useful for implementing \u003ccode\u003eSet\u003c/code\u003e when you cannot\n     * extend AbstractSet. The method takes Collection instances to enable other\n     * collection types to use the Set implementation algorithm.\n     *\n     * @param \u003cT\u003e the element type\n     * @see java.util.Set#hashCode()\n     * @param set  the set to calculate the hash code for, may be null\n     * @return the hash code\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 153,col 25)",
        "(line 154,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.newIdentityHashSet()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Returns a new hash set that matches elements based on \u003ccode\u003e\u003d\u003d\u003c/code\u003e not\n     * \u003ccode\u003eequals()\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cstrong\u003eThis set will violate the detail of various Set contracts.\u003c/note\u003e\n     * As a general rule, don\u0027t compare this set to other sets. In particular, you can\u0027t\n     * use decorators like {@link ListOrderedSet} on it, which silently assume that these\n     * contracts are fulfilled.\u003c/strong\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eNote that the returned set is not synchronized and is not thread-safe.\u003c/strong\u003e\n     * If you wish to use this set from multiple threads concurrently, you must use\n     * appropriate synchronization. The simplest approach is to wrap this map\n     * using {@link java.util.Collections#synchronizedSet(Set)}. This class may throw\n     * exceptions when accessed by concurrent threads without synchronization.\n     *\n     * @param \u003cE\u003e  the element type\n     * @return a new identity hash set\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.synchronizedSet(java.util.Set\u003cE\u003e)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Returns a synchronized set backed by the given set.\n     * \u003cp\u003e\n     * You must manually synchronize on the returned set\u0027s iterator to\n     * avoid non-deterministic behavior:\n     *\n     * \u003cpre\u003e\n     * Set s \u003d SetUtils.synchronizedSet(mySet);\n     * synchronized (s) {\n     *     Iterator i \u003d s.iterator();\n     *     while (i.hasNext()) {\n     *         process (i.next());\n     *     }\n     * }\n     * \u003c/pre\u003e\n     *\n     * This method is just a wrapper for {@link Collections#synchronizedSet(Set)}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to synchronize, must not be null\n     * @return a synchronized set backed by the given set\n     * @throws NullPointerException if the set is null\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.unmodifiableSet(java.util.Set\u003c? extends E\u003e)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Returns an unmodifiable set backed by the given set.\n     * \u003cp\u003e\n     * This method uses the implementation in the decorators subpackage.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to make unmodifiable, must not be null\n     * @return an unmodifiable set backed by the given set\n     * @throws NullPointerException if the set is null\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.predicatedSet(java.util.Set\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Returns a predicated (validating) set backed by the given set.\n     * \u003cp\u003e\n     * Only objects that pass the test in the given predicate can be added to the set.\n     * Trying to add an invalid object results in an IllegalArgumentException.\n     * It is important not to use the original set after invoking this method,\n     * as it is a backdoor for adding invalid objects.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to predicate, must not be null\n     * @param predicate  the predicate for the set, must not be null\n     * @return a predicated set backed by the given set\n     * @throws NullPointerException if the set or predicate is null\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.transformedSet(java.util.Set\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 262,
      "end_line": 265,
      "comment": "\n     * Returns a transformed set backed by the given set.\n     * \u003cp\u003e\n     * Each object is passed through the transformer as it is added to the\n     * Set. It is important not to use the original set after invoking this\n     * method, as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * Existing entries in the specified set will not be transformed.\n     * If you want that behaviour, see {@link TransformedSet#transformedSet}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to transform, must not be null\n     * @param transformer  the transformer for the set, must not be null\n     * @return a transformed set backed by the given set\n     * @throws NullPointerException if the set or transformer is null\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.orderedSet(java.util.Set\u003cE\u003e)",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\n     * Returns a set that maintains the order of elements that are added\n     * backed by the given set.\n     * \u003cp\u003e\n     * If an element is added twice, the order is determined by the first add.\n     * The order is observed through the iterator or toArray.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to order, must not be null\n     * @return an ordered set backed by the given set\n     * @throws NullPointerException if the set is null\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.synchronizedSortedSet(java.util.SortedSet\u003cE\u003e)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Returns a synchronized sorted set backed by the given sorted set.\n     * \u003cp\u003e\n     * You must manually synchronize on the returned set\u0027s iterator to\n     * avoid non-deterministic behavior:\n     *\n     * \u003cpre\u003e\n     * Set s \u003d SetUtils.synchronizedSortedSet(mySet);\n     * synchronized (s) {\n     *     Iterator i \u003d s.iterator();\n     *     while (i.hasNext()) {\n     *         process (i.next());\n     *     }\n     * }\n     * \u003c/pre\u003e\n     *\n     * This method is just a wrapper for {@link Collections#synchronizedSortedSet(SortedSet)}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the sorted set to synchronize, must not be null\n     * @return a synchronized set backed by the given set\n     * @throws NullPointerException if the set is null\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.unmodifiableSortedSet(java.util.SortedSet\u003cE\u003e)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Returns an unmodifiable sorted set backed by the given sorted set.\n     * \u003cp\u003e\n     * This method uses the implementation in the decorators subpackage.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the sorted set to make unmodifiable, must not be null\n     * @return an unmodifiable set backed by the given set\n     * @throws NullPointerException if the set is null\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.predicatedSortedSet(java.util.SortedSet\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 340,
      "end_line": 343,
      "comment": "\n     * Returns a predicated (validating) sorted set backed by the given sorted set.\n     * \u003cp\u003e\n     * Only objects that pass the test in the given predicate can be added to the set.\n     * Trying to add an invalid object results in an IllegalArgumentException.\n     * It is important not to use the original set after invoking this method,\n     * as it is a backdoor for adding invalid objects.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the sorted set to predicate, must not be null\n     * @param predicate  the predicate for the sorted set, must not be null\n     * @return a predicated sorted set backed by the given sorted set\n     * @throws NullPointerException if the set or predicate is null\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.transformedSortedSet(java.util.SortedSet\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 361,
      "end_line": 364,
      "comment": "\n     * Returns a transformed sorted set backed by the given set.\n     * \u003cp\u003e\n     * Each object is passed through the transformer as it is added to the\n     * Set. It is important not to use the original set after invoking this\n     * method, as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * Existing entries in the specified set will not be transformed.\n     * If you want that behaviour, see {@link TransformedSortedSet#transformedSortedSet}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the set to transform, must not be null\n     * @param transformer  the transformer for the set, must not be null\n     * @return a transformed set backed by the given set\n     * @throws NullPointerException if the set or transformer is null\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.unmodifiableNavigableSet(java.util.NavigableSet\u003cE\u003e)",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n     * Returns an unmodifiable navigable set backed by the given navigable set.\n     * \u003cp\u003e\n     * This method uses the implementation in the decorators subpackage.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the navigable set to make unmodifiable, must not be null\n     * @return an unmodifiable set backed by the given set\n     * @throws NullPointerException if the set is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.predicatedNavigableSet(java.util.NavigableSet\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 398,
      "end_line": 401,
      "comment": "\n     * Returns a predicated (validating) navigable set backed by the given navigable set.\n     * \u003cp\u003e\n     * Only objects that pass the test in the given predicate can be added to the set.\n     * Trying to add an invalid object results in an IllegalArgumentException.\n     * It is important not to use the original set after invoking this method,\n     * as it is a backdoor for adding invalid objects.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the navigable set to predicate, must not be null\n     * @param predicate  the predicate for the navigable set, must not be null\n     * @return a predicated navigable set backed by the given navigable set\n     * @throws NullPointerException if the set or predicate is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.transformedNavigableSet(java.util.NavigableSet\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 420,
      "end_line": 423,
      "comment": "\n     * Returns a transformed navigable set backed by the given navigable set.\n     * \u003cp\u003e\n     * Each object is passed through the transformer as it is added to the\n     * Set. It is important not to use the original set after invoking this\n     * method, as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * Existing entries in the specified set will not be transformed.\n     * If you want that behaviour, see {@link TransformedNavigableSet#transformedNavigableSet}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param set  the navigable set to transform, must not be null\n     * @param transformer  the transformer for the set, must not be null\n     * @return a transformed set backed by the given set\n     * @throws NullPointerException if the set or transformer is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.union(java.util.Set\u003c? extends E\u003e, java.util.Set\u003c? extends E\u003e)",
      "begin_line": 441,
      "end_line": 469,
      "comment": "\n     * Returns a unmodifiable \u003cb\u003eview\u003c/b\u003e of the union of the given {@link Set}s.\n     * \u003cp\u003e\n     * The returned view contains all elements of {@code a} and {@code b}.\n     *\n     * @param \u003cE\u003e the generic type that is able to represent the types contained\n     *   in both input sets.\n     * @param a  the first set, must not be null\n     * @param b  the second set, must not be null\n     * @return a view of the union of the two set\n     * @throws NullPointerException if either input set is null\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 446,col 52)",
        "(line 448,col 9)-(line 468,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-ea05d565-76ce-4c97-9e24-9e729c9ad8f2.contains(java.lang.Object)",
      "begin_line": 449,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 451,col 17)-(line 451,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-3c56bf39-b295-4210-95d0-6a7f621077dd.createIterator()",
      "begin_line": 454,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 456,col 17)-(line 456,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-1bfddefc-e8b4-40d4-8cfe-6ec030ff0fa7.isEmpty()",
      "begin_line": 459,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 461,col 17)-(line 461,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-e10e350f-f04e-46ad-bca4-59d7af84484a.size()",
      "begin_line": 464,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 466,col 17)-(line 466,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.difference(java.util.Set\u003c? extends E\u003e, java.util.Set\u003c? extends E\u003e)",
      "begin_line": 485,
      "end_line": 508,
      "comment": "\n     * Returns a unmodifiable \u003cb\u003eview\u003c/b\u003e containing the difference of the given\n     * {@link Set}s, denoted by {@code a \\ b} (or {@code a - b}).\n     * \u003cp\u003e\n     * The returned view contains all elements of {@code a} that are not a member\n     * of {@code b}.\n     *\n     * @param \u003cE\u003e the generic type that is able to represent the types contained\n     *   in both input sets.\n     * @param a  the set to subtract from, must not be null\n     * @param b  the set to subtract, must not be null\n     * @return a view of the relative complement of  of the two sets\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 488,col 9)",
        "(line 490,col 9)-(line 495,col 10)",
        "(line 497,col 9)-(line 507,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-21ebcab7-84aa-4c79-adae-8370c7738349.evaluate(E)",
      "begin_line": 491,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 493,col 17)-(line 493,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-107ac9c4-d5b6-4b43-9d81-a3d216e14fd1.contains(java.lang.Object)",
      "begin_line": 498,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 500,col 17)-(line 500,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-07f22a7e-c7ea-4716-821d-94dcfdd63c91.createIterator()",
      "begin_line": 503,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 505,col 17)-(line 505,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.intersection(java.util.Set\u003c? extends E\u003e, java.util.Set\u003c? extends E\u003e)",
      "begin_line": 523,
      "end_line": 546,
      "comment": "\n     * Returns a unmodifiable \u003cb\u003eview\u003c/b\u003e of the intersection of the given {@link Set}s.\n     * \u003cp\u003e\n     * The returned view contains all elements that are members of both input sets\n     * ({@code a} and {@code b}).\n     *\n     * @param \u003cE\u003e the generic type that is able to represent the types contained\n     *   in both input sets.\n     * @param a  the first set, must not be null\n     * @param b  the second set, must not be null\n     * @return a view of the intersection of the two sets\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 526,col 9)",
        "(line 528,col 9)-(line 533,col 10)",
        "(line 535,col 9)-(line 545,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-a9df8907-039b-4697-a76a-63d23306ce9b.evaluate(E)",
      "begin_line": 529,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 531,col 17)-(line 531,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-4ca44eed-bc5c-4621-9254-c38510745053.contains(java.lang.Object)",
      "begin_line": 536,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 538,col 17)-(line 538,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-2c328b72-f6fa-4c70-9cba-cf49b0bc16c2.createIterator()",
      "begin_line": 541,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 543,col 17)-(line 543,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.disjunction(java.util.Set\u003c? extends E\u003e, java.util.Set\u003c? extends E\u003e)",
      "begin_line": 564,
      "end_line": 593,
      "comment": "\n     * Returns a unmodifiable \u003cb\u003eview\u003c/b\u003e of the symmetric difference of the given\n     * {@link Set}s.\n     * \u003cp\u003e\n     * The returned view contains all elements of {@code a} and {@code b} that are\n     * not a member of the other set.\n     * \u003cp\u003e\n     * This is equivalent to {@code union(difference(a, b), difference(b, a))}.\n     *\n     * @param \u003cE\u003e the generic type that is able to represent the types contained\n     *   in both input sets.\n     * @param a  the first set, must not be null\n     * @param b  the second set, must not be null\n     * @return a view of the symmetric difference of the two sets\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 567,col 9)",
        "(line 569,col 9)-(line 569,col 52)",
        "(line 570,col 9)-(line 570,col 52)",
        "(line 572,col 9)-(line 592,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-0426116d-f18c-4437-9b2e-86df80bda789.contains(java.lang.Object)",
      "begin_line": 573,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 575,col 17)-(line 575,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-0abef63d-94ff-4c90-9655-1b96a5639a33.createIterator()",
      "begin_line": 578,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 580,col 17)-(line 580,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-d78128cc-8f71-41a7-a015-8f6ceed7dc15.isEmpty()",
      "begin_line": 583,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 585,col 17)-(line 585,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.Anonymous-a053f3be-c00c-49aa-883d-d09bc79aa879.size()",
      "begin_line": 588,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 590,col 17)-(line 590,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SetView",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractSet\u003cE\u003e"
      ],
      "begin_line": 605,
      "end_line": 644,
      "comment": "\n     * An unmodifiable \u003cb\u003eview\u003c/b\u003e of a set that may be backed by other sets.\n     * \u003cp\u003e\n     * If the decorated sets change, this view will change as well. The contents\n     * of this view can be transferred to another instance via the {@link #copyInto(Set)}\n     * and {@link #toSet()} methods.\n     *\n     * @param \u003cE\u003e the element type\n     * @since 4.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.SetView.iterator()",
      "begin_line": 607,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 609,col 13)-(line 609,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.SetView.createIterator()",
      "begin_line": 617,
      "end_line": 617,
      "comment": "\n         * Return an iterator for this view; the returned iterator is\n         * not required to be unmodifiable.\n         * @return a new iterator for this view\n         ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.SetView.size()",
      "begin_line": 619,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 621,col 13)-(line 621,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.SetView.copyInto(S)",
      "begin_line": 630,
      "end_line": 632,
      "comment": "\n         * Copies the contents of this view into the provided set.\n         *\n         * @param \u003cS\u003e the set type\n         * @param set  the set for copying the contents\n         ",
      "child_ranges": [
        "(line 631,col 13)-(line 631,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.SetUtils.SetView.toSet()",
      "begin_line": 639,
      "end_line": 643,
      "comment": "\n         * Returns a new set containing the contents of this view.\n         *\n         * @return a new set containing all elements of this view\n         ",
      "child_ranges": [
        "(line 640,col 13)-(line 640,col 54)",
        "(line 641,col 13)-(line 641,col 26)",
        "(line 642,col 13)-(line 642,col 23)"
      ]
    }
  ]
}