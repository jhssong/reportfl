{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/BagUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BagUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 262,
      "comment": "\n * Provides utility methods and decorators for {@link Bag} and {@link SortedBag} instances.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_BAG"
      ],
      "begin_line": 42,
      "end_line": 43,
      "comment": "\n     * An empty unmodifiable bag.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_SORTED_BAG"
      ],
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * An empty unmodifiable sorted bag.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.BagUtils.BagUtils()",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Instantiation of BagUtils is not intended or required.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BagUtils.synchronizedBag(org.apache.commons.collections4.Bag\u003cE\u003e)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Returns a synchronized (thread-safe) bag backed by the given bag. In\n     * order to guarantee serial access, it is critical that all access to the\n     * backing bag is accomplished through the returned bag.\n     * \u003cp\u003e\n     * It is imperative that the user manually synchronize on the returned bag\n     * when iterating over it:\n     *\n     * \u003cpre\u003e\n     * Bag bag \u003d BagUtils.synchronizedBag(new HashBag());\n     * ...\n     * synchronized(bag) {\n     *     Iterator i \u003d bag.iterator(); // Must be in synchronized block\n     *     while (i.hasNext())\n     *         foo(i.next());\n     *     }\n     * }\n     * \u003c/pre\u003e\n     *\n     * Failure to follow this advice may result in non-deterministic behavior.\n     *\n     * @param \u003cE\u003e the element type\n     * @param bag the bag to synchronize, must not be null\n     * @return a synchronized bag backed by that bag\n     * @throws NullPointerException if the Bag is null\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BagUtils.unmodifiableBag(org.apache.commons.collections4.Bag\u003c? extends E\u003e)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Returns an unmodifiable view of the given bag. Any modification attempts\n     * to the returned bag will raise an {@link UnsupportedOperationException}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param bag the bag whose unmodifiable view is to be returned, must not be null\n     * @return an unmodifiable view of that bag\n     * @throws NullPointerException if the Bag is null\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BagUtils.predicatedBag(org.apache.commons.collections4.Bag\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Returns a predicated (validating) bag backed by the given bag.\n     * \u003cp\u003e\n     * Only objects that pass the test in the given predicate can be added to\n     * the bag. Trying to add an invalid object results in an\n     * IllegalArgumentException. It is important not to use the original bag\n     * after invoking this method, as it is a backdoor for adding invalid\n     * objects.\n     *\n     * @param \u003cE\u003e the element type\n     * @param bag the bag to predicate, must not be null\n     * @param predicate the predicate for the bag, must not be null\n     * @return a predicated bag backed by the given bag\n     * @throws NullPointerException if the Bag or Predicate is null\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BagUtils.transformingBag(org.apache.commons.collections4.Bag\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Returns a transformed bag backed by the given bag.\n     * \u003cp\u003e\n     * Each object is passed through the transformer as it is added to the Bag.\n     * It is important not to use the original bag after invoking this method,\n     * as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * Existing entries in the specified bag will not be transformed.\n     * If you want that behaviour, see {@link TransformedBag#transformedBag(Bag, Transformer)}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param bag the bag to predicate, must not be null\n     * @param transformer the transformer for the bag, must not be null\n     * @return a transformed bag backed by the given bag\n     * @throws NullPointerException if the Bag or Transformer is null\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BagUtils.collectionBag(org.apache.commons.collections4.Bag\u003cE\u003e)",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n     * Returns a bag that complies to the Collection contract, backed by the given bag.\n     *\n     * @param \u003cE\u003e the element type\n     * @param bag the bag to decorate, must not be null\n     * @return a Bag that complies to the Collection contract\n     * @throws NullPointerException if bag is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BagUtils.synchronizedSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Returns a synchronized (thread-safe) sorted bag backed by the given\n     * sorted bag. In order to guarantee serial access, it is critical that all\n     * access to the backing bag is accomplished through the returned bag.\n     * \u003cp\u003e\n     * It is imperative that the user manually synchronize on the returned bag\n     * when iterating over it:\n     *\n     * \u003cpre\u003e\n     * SortedBag bag \u003d BagUtils.synchronizedSortedBag(new TreeBag());\n     * ...\n     * synchronized(bag) {\n     *     Iterator i \u003d bag.iterator(); // Must be in synchronized block\n     *     while (i.hasNext())\n     *         foo(i.next());\n     *     }\n     * }\n     * \u003c/pre\u003e\n     *\n     * Failure to follow this advice may result in non-deterministic behavior.\n     *\n     * @param \u003cE\u003e the element type\n     * @param bag the bag to synchronize, must not be null\n     * @return a synchronized bag backed by that bag\n     * @throws NullPointerException if the SortedBag is null\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BagUtils.unmodifiableSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e)",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Returns an unmodifiable view of the given sorted bag. Any modification\n     * attempts to the returned bag will raise an\n     * {@link UnsupportedOperationException}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param bag the bag whose unmodifiable view is to be returned, must not be null\n     * @return an unmodifiable view of that bag\n     * @throws NullPointerException if the SortedBag is null\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BagUtils.predicatedSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 214,
      "end_line": 217,
      "comment": "\n     * Returns a predicated (validating) sorted bag backed by the given sorted\n     * bag.\n     * \u003cp\u003e\n     * Only objects that pass the test in the given predicate can be added to\n     * the bag. Trying to add an invalid object results in an\n     * IllegalArgumentException. It is important not to use the original bag\n     * after invoking this method, as it is a backdoor for adding invalid\n     * objects.\n     *\n     * @param \u003cE\u003e the element type\n     * @param bag the sorted bag to predicate, must not be null\n     * @param predicate the predicate for the bag, must not be null\n     * @return a predicated bag backed by the given bag\n     * @throws NullPointerException if the SortedBag or Predicate is null\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BagUtils.transformingSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n     * Returns a transformed sorted bag backed by the given bag.\n     * \u003cp\u003e\n     * Each object is passed through the transformer as it is added to the Bag.\n     * It is important not to use the original bag after invoking this method,\n     * as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * Existing entries in the specified bag will not be transformed.\n     * If you want that behaviour, see\n     * {@link TransformedSortedBag#transformedSortedBag(SortedBag, Transformer)}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param bag the bag to predicate, must not be null\n     * @param transformer the transformer for the bag, must not be null\n     * @return a transformed bag backed by the given bag\n     * @throws NullPointerException if the Bag or Transformer is null\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BagUtils.emptyBag()",
      "begin_line": 247,
      "end_line": 250,
      "comment": "\n     * Get an empty \u003ccode\u003eBag\u003c/code\u003e.\n     *\n     * @param \u003cE\u003e the element type\n     * @return an empty Bag\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.BagUtils.emptySortedBag()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\n     * Get an empty \u003ccode\u003eSortedBag\u003c/code\u003e.\n     *\n     * @param \u003cE\u003e the element type\n     * @return an empty sorted Bag\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 47)"
      ]
    }
  ]
}