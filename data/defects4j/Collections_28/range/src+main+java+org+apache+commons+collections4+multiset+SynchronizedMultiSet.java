{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/multiset/SynchronizedMultiSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedMultiSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.SynchronizedCollection\u003cE\u003e",
        "org.apache.commons.collections4.MultiSet\u003cE\u003e"
      ],
      "begin_line": 34,
      "end_line": 164,
      "comment": "\n * Decorates another {@link MultiSet} to synchronize its behaviour\n * for a multi-threaded environment.\n * \u003cp\u003e\n * Methods are synchronized, then forwarded to the decorated multiset.\n * Iterators must be separately synchronized around the loop.\n *\n * @since 4.1\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.SynchronizedMultiSet.synchronizedMultiSet(org.apache.commons.collections4.MultiSet\u003cE\u003e)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Factory method to create a synchronized multiset.\n     *\n     * @param \u003cE\u003e the type of the elements in the multiset\n     * @param multiset  the multiset to decorate, must not be null\n     * @return a new synchronized MultiSet\n     * @throws NullPointerException if multiset is null\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.SynchronizedMultiSet.SynchronizedMultiSet(org.apache.commons.collections4.MultiSet\u003cE\u003e)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param multiset  the multiset to decorate, must not be null\n     * @throws NullPointerException if multiset is null\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.SynchronizedMultiSet.SynchronizedMultiSet(org.apache.commons.collections4.MultiSet\u003cE\u003e, java.lang.Object)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Constructor that wraps (not copies).\n     *\n     * @param multiset  the multiset to decorate, must not be null\n     * @param lock  the lock to use, must not be null\n     * @throws NullPointerException if multiset or lock is null\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.SynchronizedMultiSet.decorated()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * Gets the multiset being decorated.\n     *\n     * @return the decorated multiset\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.SynchronizedMultiSet.equals(java.lang.Object)",
      "begin_line": 83,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 90,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.SynchronizedMultiSet.hashCode()",
      "begin_line": 93,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 97,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.SynchronizedMultiSet.add(E, int)",
      "begin_line": 102,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.SynchronizedMultiSet.remove(java.lang.Object, int)",
      "begin_line": 109,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.SynchronizedMultiSet.getCount(java.lang.Object)",
      "begin_line": 116,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.SynchronizedMultiSet.setCount(E, int)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.SynchronizedMultiSet.uniqueSet()",
      "begin_line": 130,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.multiset.SynchronizedMultiSet.entrySet()",
      "begin_line": 138,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 143,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "SynchronizedSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.collection.SynchronizedCollection\u003cT\u003e",
        "java.util.Set\u003cT\u003e"
      ],
      "begin_line": 150,
      "end_line": 162,
      "comment": "\n     * Synchronized Set for the MultiSet class.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " Serialization version "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.multiset.SynchronizedMultiSet.SynchronizedSet.SynchronizedSet(java.util.Set\u003cT\u003e, java.lang.Object)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n         * Constructor.\n         * @param set  the set to decorate\n         * @param lock  the lock to use, shared with the multiset\n         ",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 29)"
      ]
    }
  ]
}