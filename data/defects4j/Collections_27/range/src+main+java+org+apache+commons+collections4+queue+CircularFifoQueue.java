{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/queue/CircularFifoQueue.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CircularFifoQueue",
      "is_interface": false,
      "parent_types": [
        "java.util.AbstractCollection\u003cE\u003e",
        "java.util.Queue\u003cE\u003e",
        "org.apache.commons.collections4.BoundedCollection\u003cE\u003e",
        "java.io.Serializable"
      ],
      "begin_line": 49,
      "end_line": 420,
      "comment": "\n * CircularFifoQueue is a first-in first-out queue with a fixed size that\n * replaces its oldest element if full.\n * \u003cp\u003e\n * The removal order of a {@link CircularFifoQueue} is based on the\n * insertion order; elements are removed in the same order in which they\n * were added.  The iteration order is the same as the removal order.\n * \u003cp\u003e\n * The {@link #add(Object)}, {@link #remove()}, {@link #peek()}, {@link #poll},\n * {@link #offer(Object)} operations all perform in constant time.\n * All other operations perform in linear time or worse.\n * \u003cp\u003e\n * This queue prevents null objects from being added.\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Serialization version. "
    },
    {
      "type": "field",
      "varNames": [
        "elements"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Underlying storage array. "
    },
    {
      "type": "field",
      "varNames": [
        "start"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Array index of first (oldest) queue element. "
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Index mod maxElements of the array position following the last queue\n     * element.  Queue elements start at elements[start] and \"wrap around\"\n     * elements[maxElements-1], ending at elements[decrement(end)].\n     * For example, elements \u003d {c,a,b}, start\u003d1, end\u003d1 corresponds to\n     * the queue [a,b,c].\n     "
    },
    {
      "type": "field",
      "varNames": [
        "full"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Flag to indicate if the queue is currently full. "
    },
    {
      "type": "field",
      "varNames": [
        "maxElements"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Capacity of the queue. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.CircularFifoQueue()",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Constructor that creates a queue with the default size of 32.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 17)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.CircularFifoQueue(int)",
      "begin_line": 89,
      "end_line": 96,
      "comment": "\n     * Constructor that creates a queue with the specified size.\n     *\n     * @param size  the size of the queue (cannot be changed)\n     * @throws IllegalArgumentException  if the size is \u0026lt; 1\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 42)",
        "(line 95,col 9)-(line 95,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.CircularFifoQueue(java.util.Collection\u003c? extends E\u003e)",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Constructor that creates a queue from the specified collection.\n     * The collection size also sets the queue size.\n     *\n     * @param coll  the collection to copy into the queue, may not be null\n     * @throws NullPointerException if the collection is null\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 26)",
        "(line 107,col 9)-(line 107,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 117,
      "end_line": 123,
      "comment": "\n     * Write the queue out using a custom routine.\n     *\n     * @param out  the output stream\n     * @throws IOException if an I/O error occurs while writing to the output stream\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 33)",
        "(line 119,col 9)-(line 119,col 29)",
        "(line 120,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.readObject(java.io.ObjectInputStream)",
      "begin_line": 132,
      "end_line": 147,
      "comment": "\n     * Read the queue in using a custom routine.\n     *\n     * @param in  the input stream\n     * @throws IOException if an I/O error occurs while writing to the output stream\n     * @throws ClassNotFoundException if the class of a serialized object can not be found\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 31)",
        "(line 135,col 9)-(line 135,col 49)",
        "(line 136,col 9)-(line 136,col 38)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 18)",
        "(line 141,col 9)-(line 141,col 35)",
        "(line 142,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.size()",
      "begin_line": 155,
      "end_line": 168,
      "comment": "\n     * Returns the number of elements stored in the queue.\n     *\n     * @return this queue\u0027s size\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 21)",
        "(line 159,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 167,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.isEmpty()",
      "begin_line": 175,
      "end_line": 178,
      "comment": "\n     * Returns true if this queue is empty; false otherwise.\n     *\n     * @return true if this queue is empty\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.isFull()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * A {@code CircularFifoQueue} can never be full, thus this returns always\n     * {@code false}.\n     *\n     * @return always returns {@code false}\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.isAtFullCapacity()",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Returns {@code true} if the capacity limit of this queue has been reached,\n     * i.e. the number of elements stored in the queue equals its maximum size.\n     *\n     * @return {@code true} if the capacity limit has been reached, {@code false} otherwise\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.maxSize()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Gets the maximum size of the collection (the bound).\n     *\n     * @return the maximum number of elements the collection can hold\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.clear()",
      "begin_line": 215,
      "end_line": 221,
      "comment": "\n     * Clears this queue.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 21)",
        "(line 218,col 9)-(line 218,col 18)",
        "(line 219,col 9)-(line 219,col 16)",
        "(line 220,col 9)-(line 220,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.add(E)",
      "begin_line": 231,
      "end_line": 252,
      "comment": "\n     * Adds the given element to this queue. If the queue is full, the least recently added\n     * element is discarded so that a new element can be inserted.\n     *\n     * @param element  the element to add\n     * @return true, always\n     * @throws NullPointerException  if the given element is null\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 34)",
        "(line 243,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 251,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.get(int)",
      "begin_line": 261,
      "end_line": 271,
      "comment": "\n     * Returns the element at the specified position in this queue.\n     *\n     * @param index the position of the element in the queue\n     * @return the element at position {@code index}\n     * @throws NoSuchElementException if the requested position is outside the range [0, size)\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 30)",
        "(line 263,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 269,col 54)",
        "(line 270,col 9)-(line 270,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.offer(E)",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Adds the given element to this queue. If the queue is full, the least recently added\n     * element is discarded so that a new element can be inserted.\n     *\n     * @param element  the element to add\n     * @return true, always\n     * @throws NullPointerException  if the given element is null\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.poll()",
      "begin_line": 287,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.element()",
      "begin_line": 294,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.peek()",
      "begin_line": 301,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 302,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.remove()",
      "begin_line": 308,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 313,col 42)",
        "(line 314,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 322,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.increment(int)",
      "begin_line": 332,
      "end_line": 338,
      "comment": "\n     * Increments the internal index.\n     *\n     * @param index  the index to increment\n     * @return the updated index\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 16)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.decrement(int)",
      "begin_line": 346,
      "end_line": 352,
      "comment": "\n     * Decrements the internal index.\n     *\n     * @param index  the index to decrement\n     * @return the updated index\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 16)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.iterator()",
      "begin_line": 359,
      "end_line": 418,
      "comment": "\n     * Returns an iterator over this queue\u0027s elements.\n     *\n     * @return an iterator over this queue\u0027s elements\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 417,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 363,
      "end_line": 363,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastReturnedIndex"
      ],
      "begin_line": 364,
      "end_line": 364,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isFirst"
      ],
      "begin_line": 365,
      "end_line": 365,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.Anonymous-e54d1a5c-7055-455b-8fcc-b889f4b047ff.hasNext()",
      "begin_line": 367,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 368,col 17)-(line 368,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.Anonymous-1b5d41fb-4694-4227-a490-4dfb4281ee73.next()",
      "begin_line": 371,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 372,col 17)-(line 374,col 17)",
        "(line 375,col 17)-(line 375,col 32)",
        "(line 376,col 17)-(line 376,col 42)",
        "(line 377,col 17)-(line 377,col 41)",
        "(line 378,col 17)-(line 378,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.Anonymous-46236f7c-e4d5-432d-a316-c8de6d85ebb8.remove()",
      "begin_line": 381,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 382,col 17)-(line 384,col 17)",
        "(line 387,col 17)-(line 391,col 17)",
        "(line 393,col 17)-(line 393,col 48)",
        "(line 394,col 17)-(line 408,col 17)",
        "(line 410,col 17)-(line 410,col 39)",
        "(line 411,col 17)-(line 411,col 37)",
        "(line 412,col 17)-(line 412,col 37)",
        "(line 413,col 17)-(line 413,col 29)",
        "(line 414,col 17)-(line 414,col 41)"
      ]
    }
  ]
}