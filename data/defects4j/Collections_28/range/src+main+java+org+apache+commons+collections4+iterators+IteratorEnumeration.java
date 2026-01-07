{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/IteratorEnumeration.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IteratorEnumeration",
      "is_interface": false,
      "parent_types": [
        "java.util.Enumeration\u003cE\u003e"
      ],
      "begin_line": 29,
      "end_line": 97,
      "comment": "\n * Adapter to make an {@link Iterator Iterator} instance appear to be an\n * {@link Enumeration Enumeration} instance.\n *\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " The iterator being decorated. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.IteratorEnumeration.IteratorEnumeration()",
      "begin_line": 38,
      "end_line": 39,
      "comment": "\n     * Constructs a new \u003ccode\u003eIteratorEnumeration\u003c/code\u003e that will not function\n     * until {@link #setIterator(Iterator) setIterator} is invoked.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.IteratorEnumeration.IteratorEnumeration(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Constructs a new \u003ccode\u003eIteratorEnumeration\u003c/code\u003e that will use the given\n     * iterator.\n     *\n     * @param iterator the iterator to use\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorEnumeration.hasMoreElements()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * Returns true if the underlying iterator has more elements.\n     *\n     * @return true if the underlying iterator has more elements\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorEnumeration.nextElement()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Returns the next element from the underlying iterator.\n     *\n     * @return the next element from the underlying iterator.\n     * @throws java.util.NoSuchElementException if the underlying iterator has\n     * no more elements\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorEnumeration.getIterator()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Returns the underlying iterator.\n     *\n     * @return the underlying iterator\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.IteratorEnumeration.setIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Sets the underlying iterator.\n     *\n     * @param iterator the new underlying iterator\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 33)"
      ]
    }
  ]
}