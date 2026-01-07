{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/queue/TransformedQueue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TransformedQueue",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.TransformedCollection\u003cE\u003e",
        "java.util.Queue\u003cE\u003e"
      ],
      "begin_line": 35,
      "end_line": 134,
      "comment": "\n * Decorates another {@link Queue} to transform objects that are added.\n * \u003cp\u003e\n * The add/offer methods are affected by this class.\n * Thus objects must be removed or searched for using their transformed form.\n * For example, if the transformation converts Strings to Integers, you must\n * use the Integer form to remove objects.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(java.util.Queue\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Factory method to create a transforming queue.\n     * \u003cp\u003e\n     * If there are any elements already in the queue being decorated, they\n     * are NOT transformed.\n     * Contrast this with {@link #transformedQueue(Queue, Transformer)}.\n     *\n     * @param \u003cE\u003e the type of the elements in the queue\n     * @param queue  the queue to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed Queue\n     * @throws NullPointerException if queue or transformer is null\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.TransformedQueue.transformedQueue(java.util.Queue\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 73,
      "end_line": 86,
      "comment": "\n     * Factory method to create a transforming queue that will transform\n     * existing contents of the specified queue.\n     * \u003cp\u003e\n     * If there are any elements already in the queue being decorated, they\n     * will be transformed by this method.\n     * Contrast this with {@link #transformingQueue(Queue, Transformer)}.\n     *\n     * @param \u003cE\u003e the type of the elements in the queue\n     * @param queue  the queue to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @return a new transformed Queue\n     * @throws NullPointerException if queue or transformer is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 90)",
        "(line 77,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 85,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.queue.TransformedQueue.TransformedQueue(java.util.Queue\u003cE\u003e, org.apache.commons.collections4.Transformer\u003c? super E, ? extends E\u003e)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "\n     * Constructor that wraps (not copies).\n     * \u003cp\u003e\n     * If there are any elements already in the queue being decorated, they\n     * are NOT transformed.\n     *\n     * @param queue  the queue to decorate, must not be null\n     * @param transformer  the transformer to use for conversion, must not be null\n     * @throws NullPointerException if queue or transformer is null\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.TransformedQueue.getQueue()",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Gets the decorated queue.\n     *\n     * @return the decorated queue\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.TransformedQueue.offer(E)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.TransformedQueue.poll()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.TransformedQueue.peek()",
      "begin_line": 122,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.TransformedQueue.element()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.TransformedQueue.remove()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 35)"
      ]
    }
  ]
}