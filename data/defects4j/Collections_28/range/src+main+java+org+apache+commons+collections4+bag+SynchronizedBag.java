{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/bag/SynchronizedBag.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedBag",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.SynchronizedCollection\u003cE\u003e",
        "org.apache.commons.collections4.Bag\u003cE\u003e"
      ],
      "begin_line": 36,
      "end_line": 151,
      "comment": "\n * Decorates another {@link Bag} to synchronize its behaviour\n * for a multi-threaded environment.\n * \u003cp\u003e\n * Methods are synchronized, then forwarded to the decorated bag.\n * Iterators must be separately synchronized around the loop.\n * \u003cp\u003e\n * This class is Serializable from Commons Collections 3.1.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.bag.SynchronizedBag.synchronizedBag(org.apache.commons.collections4.Bag\u003cE\u003e)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Factory method to create a synchronized bag.\n     *\n     * @param \u003cE\u003e the type of the elements in the bag\n     * @param bag  the bag to decorate, must not be null\n     * @return a new synchronized Bag\n     * @throws NullPointerException if bag is null\n     * @since 4.0\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.SynchronizedBag.SynchronizedBag(org.apache.commons.collections4.Bag\u003cE\u003e)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @throws NullPointerException if bag is null\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.SynchronizedBag.SynchronizedBag(org.apache.commons.collections4.Bag\u003cE\u003e, java.lang.Object)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param bag  the bag to decorate, must not be null\n     * @param lock  the lock to use, must not be null\n     * @throws NullPointerException if bag or lock is null\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.SynchronizedBag.getBag()",
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Gets the bag being decorated.\n     *\n     * @return the decorated bag\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.SynchronizedBag.equals(java.lang.Object)",
      "begin_line": 85,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.SynchronizedBag.hashCode()",
      "begin_line": 95,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.SynchronizedBag.add(E, int)",
      "begin_line": 104,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.SynchronizedBag.remove(java.lang.Object, int)",
      "begin_line": 111,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.SynchronizedBag.uniqueSet()",
      "begin_line": 118,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.bag.SynchronizedBag.getCount(java.lang.Object)",
      "begin_line": 126,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SynchronizedBagSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.SynchronizedCollection\u003cE\u003e",
        "java.util.Set\u003cE\u003e"
      ],
      "begin_line": 137,
      "end_line": 149,
      "comment": "\n     * Synchronized Set for the Bag class.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.bag.SynchronizedBag.SynchronizedBagSet.SynchronizedBagSet(java.util.Set\u003cE\u003e, java.lang.Object)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n         * Constructor.\n         * @param set  the set to decorate\n         * @param lock  the lock to use, shared with the bag\n         ",
      "child_ranges": [
        "(line 147,col 13)-(line 147,col 29)"
      ]
    }
  ]
}