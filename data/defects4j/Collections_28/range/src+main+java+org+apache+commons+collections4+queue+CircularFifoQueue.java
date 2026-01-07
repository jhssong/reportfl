{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/queue/CircularFifoQueue.java",
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
      "end_line": 430,
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
      "end_line": 191,
      "comment": "\n     * {@inheritDoc}\n     * \u003cp\u003e\n     * A {@code CircularFifoQueue} can never be full, thus this returns always\n     * {@code false}.\n     *\n     * @return always returns {@code false}\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.isAtFullCapacity()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Returns {@code true} if the capacity limit of this queue has been reached,\n     * i.e. the number of elements stored in the queue equals its maximum size.\n     *\n     * @return {@code true} if the capacity limit has been reached, {@code false} otherwise\n     * @since 4.1\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.maxSize()",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\n     * Gets the maximum size of the collection (the bound).\n     *\n     * @return the maximum number of elements the collection can hold\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.clear()",
      "begin_line": 217,
      "end_line": 223,
      "comment": "\n     * Clears this queue.\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 21)",
        "(line 220,col 9)-(line 220,col 18)",
        "(line 221,col 9)-(line 221,col 16)",
        "(line 222,col 9)-(line 222,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.add(E)",
      "begin_line": 233,
      "end_line": 254,
      "comment": "\n     * Adds the given element to this queue. If the queue is full, the least recently added\n     * element is discarded so that a new element can be inserted.\n     *\n     * @param element  the element to add\n     * @return true, always\n     * @throws NullPointerException  if the given element is null\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 243,col 34)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 253,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.get(int)",
      "begin_line": 263,
      "end_line": 273,
      "comment": "\n     * Returns the element at the specified position in this queue.\n     *\n     * @param index the position of the element in the queue\n     * @return the element at position {@code index}\n     * @throws NoSuchElementException if the requested position is outside the range [0, size)\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 30)",
        "(line 265,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 271,col 54)",
        "(line 272,col 9)-(line 272,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.offer(E)",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\n     * Adds the given element to this queue. If the queue is full, the least recently added\n     * element is discarded so that a new element can be inserted.\n     *\n     * @param element  the element to add\n     * @return true, always\n     * @throws NullPointerException  if the given element is null\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.poll()",
      "begin_line": 290,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.element()",
      "begin_line": 298,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.peek()",
      "begin_line": 306,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.remove()",
      "begin_line": 314,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 318,col 9)",
        "(line 320,col 9)-(line 320,col 42)",
        "(line 321,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.increment(int)",
      "begin_line": 339,
      "end_line": 345,
      "comment": "\n     * Increments the internal index.\n     *\n     * @param index  the index to increment\n     * @return the updated index\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 16)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.decrement(int)",
      "begin_line": 353,
      "end_line": 359,
      "comment": "\n     * Decrements the internal index.\n     *\n     * @param index  the index to decrement\n     * @return the updated index\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 16)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.iterator()",
      "begin_line": 366,
      "end_line": 428,
      "comment": "\n     * Returns an iterator over this queue\u0027s elements.\n     *\n     * @return an iterator over this queue\u0027s elements\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 427,col 10)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 370,
      "end_line": 370,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastReturnedIndex"
      ],
      "begin_line": 371,
      "end_line": 371,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isFirst"
      ],
      "begin_line": 372,
      "end_line": 372,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.Anonymous-f03ae0a6-1b8b-43fa-be0e-0271997acf5c.hasNext()",
      "begin_line": 374,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 376,col 17)-(line 376,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.Anonymous-a1cfac44-8d4e-45db-9100-ad7fc3043c6b.next()",
      "begin_line": 379,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 381,col 17)-(line 383,col 17)",
        "(line 384,col 17)-(line 384,col 32)",
        "(line 385,col 17)-(line 385,col 42)",
        "(line 386,col 17)-(line 386,col 41)",
        "(line 387,col 17)-(line 387,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.queue.CircularFifoQueue.Anonymous-61be3454-8a8b-4240-a22b-82b7807fc602.remove()",
      "begin_line": 390,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 392,col 17)-(line 394,col 17)",
        "(line 397,col 17)-(line 401,col 17)",
        "(line 403,col 17)-(line 403,col 48)",
        "(line 404,col 17)-(line 418,col 17)",
        "(line 420,col 17)-(line 420,col 39)",
        "(line 421,col 17)-(line 421,col 37)",
        "(line 422,col 17)-(line 422,col 37)",
        "(line 423,col 17)-(line 423,col 29)",
        "(line 424,col 17)-(line 424,col 41)"
      ]
    }
  ]
}