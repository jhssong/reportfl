{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/UnmodifiableListIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableListIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.ListIterator\u003cE\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 31,
      "end_line": 114,
      "comment": "\n * Decorates a list iterator such that it cannot be modified.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableListIterator.umodifiableListIterator(java.util.ListIterator\u003c? extends E\u003e)",
      "begin_line": 45,
      "end_line": 55,
      "comment": "\n     * Decorates the specified iterator such that it cannot be modified.\n     *\n     * @param \u003cE\u003e  the element type\n     * @param iterator  the iterator to decorate\n     * @return a new unmodifiable list iterator\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 48,col 9)",
        "(line 49,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableListIterator.UnmodifiableListIterator(java.util.ListIterator\u003c? extends E\u003e)",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Constructor.\n     *\n     * @param iterator  the iterator to decorate\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 16)",
        "(line 65,col 9)-(line 65,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableListIterator.hasNext()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableListIterator.next()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableListIterator.nextIndex()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableListIterator.hasPrevious()",
      "begin_line": 84,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableListIterator.previous()",
      "begin_line": 89,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableListIterator.previousIndex()",
      "begin_line": 94,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableListIterator.remove()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableListIterator.set(E)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableListIterator.add(E)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 74)"
      ]
    }
  ]
}