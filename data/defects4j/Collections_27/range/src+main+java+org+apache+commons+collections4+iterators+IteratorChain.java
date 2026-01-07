{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/iterators/IteratorChain.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IteratorChain",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 51,
      "end_line": 278,
      "comment": "\n * An IteratorChain is an Iterator that wraps a number of Iterators.\n * \u003cp\u003e\n * This class makes multiple iterators look like one to the caller. When any\n * method from the Iterator interface is called, the IteratorChain will delegate\n * to a single underlying Iterator. The IteratorChain will invoke the Iterators\n * in sequence until all Iterators are exhausted.\n * \u003cp\u003e\n * Under many circumstances, linking Iterators together in this manner is more\n * efficient (and convenient) than reading out the contents of each Iterator\n * into a List and creating a new Iterator.\n * \u003cp\u003e\n * Calling a method that adds new Iterator \u003ci\u003eafter a method in the Iterator\n * interface has been called\u003c/i\u003e will result in an UnsupportedOperationException.\n * \u003cp\u003e\n * NOTE: As from version 3.0, the IteratorChain may contain no iterators. In\n * this case the class will function as an empty iterator.\n * \u003cp\u003e\n * NOTE: As from version 4.0, the IteratorChain stores the iterators in a queue\n * and removes any reference to them as soon as they are not used anymore. Thus\n * the methods {@code setIterator(Iterator)} and {@code getIterators()} have been\n * removed and {@link #size()} will return the number of remaining iterators in\n * the queue.\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iteratorChain"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " The chain of iterators "
    },
    {
      "type": "field",
      "varNames": [
        "currentIterator"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " The current iterator "
    },
    {
      "type": "field",
      "varNames": [
        "lastUsedIterator"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * The \"last used\" Iterator is the Iterator upon which next() or hasNext()\n     * was most recently called used for the remove() operation only\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isLocked"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * ComparatorChain is \"locked\" after the first time compare(Object,Object)\n     * is called\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.IteratorChain()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Construct an IteratorChain with no Iterators.\n     * \u003cp\u003e\n     * You will normally use {@link #addIterator(Iterator)} to add some\n     * iterators after using this constructor.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.IteratorChain(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Construct an IteratorChain with a single Iterator.\n     * \u003cp\u003e\n     * This method takes one iterator. The newly constructed iterator will\n     * iterate through that iterator. Thus calling this constructor on its own\n     * will have no effect other than decorating the input iterator.\n     * \u003cp\u003e\n     * You will normally use {@link #addIterator(Iterator)} to add some more\n     * iterators after using this constructor.\n     *\n     * @param iterator the first child iterator in the IteratorChain, not null\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 16)",
        "(line 97,col 9)-(line 97,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.IteratorChain(java.util.Iterator\u003c? extends E\u003e, java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "\n     * Constructs a new \u003ccode\u003eIteratorChain\u003c/code\u003e over the two given iterators.\n     * \u003cp\u003e\n     * This method takes two iterators. The newly constructed iterator will\n     * iterate through each one of the input iterators in turn.\n     *\n     * @param first the first child iterator in the IteratorChain, not null\n     * @param second the second child iterator in the IteratorChain, not null\n     * @throws NullPointerException if either iterator is null\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 16)",
        "(line 112,col 9)-(line 112,col 27)",
        "(line 113,col 9)-(line 113,col 28)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.IteratorChain(java.util.Iterator\u003c? extends E\u003e...)",
      "begin_line": 125,
      "end_line": 130,
      "comment": "\n     * Constructs a new \u003ccode\u003eIteratorChain\u003c/code\u003e over the array of iterators.\n     * \u003cp\u003e\n     * This method takes an array of iterators. The newly constructed iterator\n     * will iterate through each one of the input iterators in turn.\n     *\n     * @param iteratorChain the array of iterators, not null\n     * @throws NullPointerException if iterators array is or contains null\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 16)",
        "(line 127,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.IteratorChain(java.util.Collection\u003cjava.util.Iterator\u003c? extends E\u003e\u003e)",
      "begin_line": 144,
      "end_line": 149,
      "comment": "\n     * Constructs a new \u003ccode\u003eIteratorChain\u003c/code\u003e over the collection of\n     * iterators.\n     * \u003cp\u003e\n     * This method takes a collection of iterators. The newly constructed\n     * iterator will iterate through each one of the input iterators in turn.\n     *\n     * @param iteratorChain the collection of iterators, not null\n     * @throws NullPointerException if iterators collection is or contains null\n     * @throws ClassCastException if iterators collection doesn\u0027t contain an\n     * iterator\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 16)",
        "(line 146,col 9)-(line 148,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.addIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 159,
      "end_line": 165,
      "comment": "\n     * Add an Iterator to the end of the chain\n     *\n     * @param iterator Iterator to add\n     * @throws IllegalStateException if I\u0027ve already started iterating\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 22)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.size()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Returns the remaining number of Iterators in the current IteratorChain.\n     *\n     * @return Iterator count\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.isLocked()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Determine if modifications can still be made to the IteratorChain.\n     * IteratorChains cannot be modified once they have executed a method from\n     * the Iterator interface.\n     *\n     * @return true if IteratorChain cannot be modified, false if it can\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.checkLocked()",
      "begin_line": 190,
      "end_line": 195,
      "comment": "\n     * Checks whether the iterator chain is now locked and in use.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 194,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.lockChain()",
      "begin_line": 201,
      "end_line": 205,
      "comment": "\n     * Lock the chain so no more iterators can be added. This must be called\n     * from all Iterator interface methods.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 204,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.updateCurrentIterator()",
      "begin_line": 211,
      "end_line": 226,
      "comment": "\n     * Updates the current iterator field to ensure that the current Iterator is\n     * not exhausted\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 225,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.hasNext()",
      "begin_line": 234,
      "end_line": 240,
      "comment": "\n     * Return true if any Iterator in the IteratorChain has a remaining element.\n     *\n     * @return true if elements remain\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 20)",
        "(line 236,col 9)-(line 236,col 32)",
        "(line 237,col 9)-(line 237,col 43)",
        "(line 239,col 9)-(line 239,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.next()",
      "begin_line": 249,
      "end_line": 255,
      "comment": "\n     * Returns the next Object of the current Iterator\n     *\n     * @return Object from the current Iterator\n     * @throws java.util.NoSuchElementException if all the Iterators are\n     * exhausted\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 20)",
        "(line 251,col 9)-(line 251,col 32)",
        "(line 252,col 9)-(line 252,col 43)",
        "(line 254,col 9)-(line 254,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorChain.remove()",
      "begin_line": 270,
      "end_line": 276,
      "comment": "\n     * Removes from the underlying collection the last element returned by the\n     * Iterator. As with next() and hasNext(), this method calls remove() on the\n     * underlying Iterator. Therefore, this method may throw an\n     * UnsupportedOperationException if the underlying Iterator does not support\n     * this method.\n     *\n     * @throws UnsupportedOperationException if the remove operator is not\n     * supported by the underlying Iterator\n     * @throws IllegalStateException if the next method has not yet been called,\n     * or the remove method has already been called after the last call to the\n     * next method.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 20)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 34)"
      ]
    }
  ]
}