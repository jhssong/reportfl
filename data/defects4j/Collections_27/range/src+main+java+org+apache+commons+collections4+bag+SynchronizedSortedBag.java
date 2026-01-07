{
  "filepath": "/tmp/Collections-27b/src/main/java/org/apache/commons/collections4/bag/SynchronizedSortedBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedSortedBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.bag.SynchronizedBag\u003cE\u003e",
        "org.apache.commons.collections4.SortedBag\u003cE\u003e"
      ],
      "begin_line": 36,
      "end_line": 108,
      "comment": "\n * Decorates another {@link SortedBag} to synchronize its behaviour\n * for a multi-threaded environment.\n * \u003cp\u003e\n * Methods are synchronized, then forwarded to the decorated bag.\n * Iterators must be separately synchronized around the loop.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.SynchronizedSortedBag.synchronizedSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Factory method to create a synchronized sorted bag.\n     *\n     * @param \u003cE\u003e the type of the elements in the bag\n     * @param bag  the bag to decorate, must not be null\n     * @return a new synchronized SortedBag\n     * @throws NullPointerException if bag is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.SynchronizedSortedBag.SynchronizedSortedBag(org.apache.commons.collections4.SortedBag\u003cE\u003e)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @throws NullPointerException if bag is null\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.SynchronizedSortedBag.SynchronizedSortedBag(org.apache.commons.collections4.Bag\u003cE\u003e, java.lang.Object)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @param lock  the lock to use, must not be null\n     * @throws NullPointerException if bag or lock is null\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.SynchronizedSortedBag.getSortedBag()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Gets the bag being decorated.\n     *\n     * @return the decorated bag\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.SynchronizedSortedBag.first()",
      "begin_line": 87,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.SynchronizedSortedBag.last()",
      "begin_line": 94,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.SynchronizedSortedBag.comparator()",
      "begin_line": 101,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)"
      ]
    }
  ]
}