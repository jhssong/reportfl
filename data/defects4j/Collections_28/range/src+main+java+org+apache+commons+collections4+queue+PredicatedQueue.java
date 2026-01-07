{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/queue/PredicatedQueue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PredicatedQueue",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.PredicatedCollection\u003cE\u003e",
        "java.util.Queue\u003cE\u003e"
      ],
      "begin_line": 38,
      "end_line": 123,
      "comment": "\n * Decorates another {@link Queue} to validate that additions\n * match a specified predicate.\n * \u003cp\u003e\n * This queue exists to provide validation for the decorated queue.\n * It is normally created to decorate an empty queue.\n * If an object cannot be added to the queue, an IllegalArgumentException is thrown.\n * \u003cp\u003e\n * One usage would be to ensure that no null entries are added to the queue.\n * \u003cpre\u003eQueue queue \u003d PredicatedQueue.predicatedQueue(new UnboundedFifoQueue(), NotNullPredicate.INSTANCE);\u003c/pre\u003e\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.PredicatedQueue.predicatedQueue(java.util.Queue\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Factory method to create a predicated (validating) queue.\n     * \u003cp\u003e\n     * If there are any elements already in the queue being decorated, they\n     * are validated.\n     *\n     * @param \u003cE\u003e the type of the elements in the queue\n     * @param Queue  the queue to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @return a new predicated queue\n     * @throws NullPointerException if queue or predicate is null\n     * @throws IllegalArgumentException if the queue contains invalid elements\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.queue.PredicatedQueue.PredicatedQueue(java.util.Queue\u003cE\u003e, org.apache.commons.collections4.Predicate\u003c? super E\u003e)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the collection being decorated, they\n     * are validated.\n     *\n     * @param queue  the queue to decorate, must not be null\n     * @param predicate  the predicate to use for validation, must not be null\n     * @throws NullPointerException if queue or predicate is null\n     * @throws IllegalArgumentException if the Queue contains invalid elements\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.PredicatedQueue.decorated()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Gets the queue being decorated.\n     *\n     * @return the decorated queue\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.PredicatedQueue.offer(E)",
      "begin_line": 97,
      "end_line": 101,
      "comment": "\n     * Override to validate the object being added to ensure it matches\n     * the predicate.\n     *\n     * @param object  the object being added\n     * @return the result of adding to the underlying queue\n     * @throws IllegalArgumentException if the add is invalid\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 25)",
        "(line 100,col 9)-(line 100,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.PredicatedQueue.poll()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.PredicatedQueue.peek()",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.PredicatedQueue.element()",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.PredicatedQueue.remove()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 36)"
      ]
    }
  ]
}