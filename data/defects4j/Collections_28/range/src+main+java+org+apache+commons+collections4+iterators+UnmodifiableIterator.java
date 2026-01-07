{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/UnmodifiableIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 31,
      "end_line": 86,
      "comment": "\n * Decorates an iterator such that it cannot be modified.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The iterator being decorated "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableIterator.unmodifiableIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 47,
      "end_line": 57,
      "comment": "\n     * Decorates the specified iterator such that it cannot be modified.\n     * \u003cp\u003e\n     * If the iterator is already unmodifiable it is returned directly.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to decorate\n     * @return a new unmodifiable iterator\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 50,col 9)",
        "(line 51,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableIterator.UnmodifiableIterator(java.util.Iterator\u003c? extends E\u003e)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Constructor.\n     *\n     * @param iterator  the iterator to decorate\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 16)",
        "(line 67,col 9)-(line 67,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableIterator.hasNext()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableIterator.next()",
      "begin_line": 76,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableIterator.remove()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 77)"
      ]
    }
  ]
}