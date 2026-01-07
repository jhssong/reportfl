{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/queue/UnmodifiableQueue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableQueue",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.queue.AbstractQueueDecorator\u003cE\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 37,
      "end_line": 153,
      "comment": "\n * Decorates another {@link Queue} to ensure it can\u0027t be altered.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 4.0\n * @version $Id$\n "
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
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.unmodifiableQueue(java.util.Queue\u003c? extends E\u003e)",
      "begin_line": 54,
      "end_line": 61,
      "comment": "\n     * Factory method to create an unmodifiable queue.\n     * \u003cp\u003e\n     * If the queue passed in is already unmodifiable, it is returned.\n     *\n     * @param \u003cE\u003e the type of the elements in the queue\n     * @param queue  the queue to decorate, must not be null\n     * @return an unmodifiable Queue\n     * @throws IllegalArgumentException if queue is null\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.UnmodifiableQueue(java.util.Queue\u003c? extends E\u003e)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param queue  the queue to decorate, must not be null\n     * @throws IllegalArgumentException if queue is null\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Write the collection out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException if an I/O error occurs while writing to the output stream\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 33)",
        "(line 84,col 9)-(line 84,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.readObject(java.io.ObjectInputStream)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * Read the collection in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException if an I/O error occurs while reading from the input stream\n     * @throws ClassNotFoundException if the class of a serialized object can not be found\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 31)",
        "(line 97,col 9)-(line 97,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.iterator()",
      "begin_line": 101,
      "end_line": 104,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.add(java.lang.Object)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.addAll(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 111,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.clear()",
      "begin_line": 116,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.remove(java.lang.Object)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.removeAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 126,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.retainAll(java.util.Collection\u003c?\u003e)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.offer(E)",
      "begin_line": 138,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.poll()",
      "begin_line": 143,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.UnmodifiableQueue.remove()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 50)"
      ]
    }
  ]
}