{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/queue/AbstractQueueDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractQueueDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.AbstractCollectionDecorator\u003cE\u003e",
        "java.util.Queue\u003cE\u003e"
      ],
      "begin_line": 38,
      "end_line": 98,
      "comment": "\n * Decorates another {@link Queue} to provide additional behaviour.\n * \u003cp\u003e\n * Methods are forwarded directly to the decorated queue.\n * \u003cp\u003e\n * This implementation does not forward the hashCode and equals methods through\n * to the backing object, but relies on Object\u0027s implementation. This is\n * necessary as some Queue implementations, e.g. LinkedList, have custom a\n * equals implementation for which symmetry can not be preserved.\n * See class javadoc of AbstractCollectionDecorator for more information.\n *\n * @param \u003cE\u003e the type of the elements in the queue\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueDecorator.AbstractQueueDecorator()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Constructor only used in deserialization, do not use otherwise.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueDecorator.AbstractQueueDecorator(java.util.Queue\u003cE\u003e)",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param queue  the queue to decorate, must not be null\n     * @throws NullPointerException if queue is null\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueDecorator.decorated()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Gets the queue being decorated.\n     *\n     * @return the decorated queue\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueDecorator.offer(E)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueDecorator.poll()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueDecorator.peek()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueDecorator.element()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.AbstractQueueDecorator.remove()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 36)"
      ]
    }
  ]
}