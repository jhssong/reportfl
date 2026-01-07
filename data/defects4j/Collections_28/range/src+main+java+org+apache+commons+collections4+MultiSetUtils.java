{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/MultiSetUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultiSetUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 119,
      "comment": "\n * Provides utility methods and decorators for {@link MultiSet} instances.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_MULTISET"
      ],
      "begin_line": 35,
      "end_line": 37,
      "comment": "\n     * An empty unmodifiable multiset.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.MultiSetUtils.MultiSetUtils()",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Instantiation of MultiSetUtils is not intended or required.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSetUtils.synchronizedMultiSet(org.apache.commons.collections4.MultiSet\u003cE\u003e)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Returns a synchronized (thread-safe) multiset backed by the given multiset.\n     * In order to guarantee serial access, it is critical that all access to the\n     * backing multiset is accomplished through the returned multiset.\n     * \u003cp\u003e\n     * It is imperative that the user manually synchronize on the returned multiset\n     * when iterating over it:\n     *\n     * \u003cpre\u003e\n     * MultiSet multiset \u003d MultiSetUtils.synchronizedMultiSet(new HashMultiSet());\n     * ...\n     * synchronized(multiset) {\n     *     Iterator i \u003d multiset.iterator(); // Must be in synchronized block\n     *     while (i.hasNext())\n     *         foo(i.next());\n     *     }\n     * }\n     * \u003c/pre\u003e\n     *\n     * Failure to follow this advice may result in non-deterministic behavior.\n     *\n     * @param \u003cE\u003e the element type\n     * @param multiset the multiset to synchronize, must not be null\n     * @return a synchronized multiset backed by that multiset\n     * @throws NullPointerException if the MultiSet is null\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSetUtils.unmodifiableMultiSet(org.apache.commons.collections4.MultiSet\u003c? extends E\u003e)",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Returns an unmodifiable view of the given multiset. Any modification attempts\n     * to the returned multiset will raise an {@link UnsupportedOperationException}.\n     *\n     * @param \u003cE\u003e the element type\n     * @param multiset the multiset whose unmodifiable view is to be returned, must not be null\n     * @return an unmodifiable view of that multiset\n     * @throws NullPointerException if the MultiSet is null\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSetUtils.predicatedMultiSet(org.apache.commons.collections4.MultiSet\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Returns a predicated (validating) multiset backed by the given multiset.\n     * \u003cp\u003e\n     * Only objects that pass the test in the given predicate can be added to\n     * the multiset. Trying to add an invalid object results in an\n     * IllegalArgumentException. It is important not to use the original multiset\n     * after invoking this method, as it is a backdoor for adding invalid\n     * objects.\n     *\n     * @param \u003cE\u003e the element type\n     * @param multiset the multiset to predicate, must not be null\n     * @param predicate the predicate for the multiset, must not be null\n     * @return a predicated multiset backed by the given multiset\n     * @throws NullPointerException if the MultiSet or Predicate is null\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.MultiSetUtils.emptyMultiSet()",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Get an empty \u003ccode\u003eMultiSet\u003c/code\u003e.\n     *\n     * @param \u003cE\u003e the element type\n     * @return an empty MultiSet\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 30)"
      ]
    }
  ]
}