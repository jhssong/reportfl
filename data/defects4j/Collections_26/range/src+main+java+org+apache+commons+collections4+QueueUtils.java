{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/QueueUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QueueUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 108,
      "comment": "\n * Provides utility methods and decorators for {@link Queue} instances.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_QUEUE"
      ],
      "begin_line": 37,
      "end_line": 38,
      "comment": "\n     * An empty unmodifiable queue.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.QueueUtils.QueueUtils()",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * \u003ccode\u003eQueueUtils\u003c/code\u003e should not normally be instantiated.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.QueueUtils.unmodifiableQueue(java.util.Queue\u003c? extends E\u003e)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Returns an unmodifiable queue backed by the given queue.\n     *\n     * @param \u003cE\u003e the type of the elements in the queue\n     * @param queue  the queue to make unmodifiable, must not be null\n     * @return an unmodifiable queue backed by that queue\n     * @throws NullPointerException if the queue is null\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.QueueUtils.predicatedQueue(java.util.Queue\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Returns a predicated (validating) queue backed by the given queue.\n     * \u003cp\u003e\n     * Only objects that pass the test in the given predicate can be added to the queue.\n     * Trying to add an invalid object results in an IllegalArgumentException.\n     * It is important not to use the original queue after invoking this method,\n     * as it is a backdoor for adding invalid objects.\n     *\n     * @param \u003cE\u003e the type of the elements in the queue\n     * @param queue  the queue to predicate, must not be null\n     * @param predicate  the predicate used to evaluate new elements, must not be null\n     * @return a predicated queue\n     * @throws NullPointerException if the queue or predicate is null\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.QueueUtils.transformingQueue(java.util.Queue\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * Returns a transformed queue backed by the given queue.\n     * \u003cp\u003e\n     * Each object is passed through the transformer as it is added to the\n     * Queue. It is important not to use the original queue after invoking this\n     * method, as it is a backdoor for adding untransformed objects.\n     * \u003cp\u003e\n     * Existing entries in the specified queue will not be transformed.\n     * If you want that behaviour, see {@link TransformedQueue#transformedQueue}.\n     *\n     * @param \u003cE\u003e the type of the elements in the queue\n     * @param queue  the queue to predicate, must not be null\n     * @param transformer  the transformer for the queue, must not be null\n     * @return a transformed queue backed by the given queue\n     * @throws NullPointerException if the queue or transformer is null\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.QueueUtils.emptyQueue()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Get an empty \u003ccode\u003eQueue\u003c/code\u003e.\n     *\n     * @param \u003cE\u003e the type of the elements in the queue\n     * @return an empty {@link Queue}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 38)"
      ]
    }
  ]
}