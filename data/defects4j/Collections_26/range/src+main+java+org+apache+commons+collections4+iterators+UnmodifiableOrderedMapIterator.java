{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/UnmodifiableOrderedMapIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableOrderedMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.OrderedMapIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 30,
      "end_line": 104,
      "comment": "\n * Decorates an ordered map iterator such that it cannot be modified.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.unmodifiableOrderedMapIterator(org.apache.commons.collections4.OrderedMapIterator\u003cK, ? extends V\u003e)",
      "begin_line": 46,
      "end_line": 58,
      "comment": "\n     * Decorates the specified iterator such that it cannot be modified.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param iterator  the iterator to decorate\n     * @return a new unmodifiable ordered map iterator\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.UnmodifiableOrderedMapIterator(org.apache.commons.collections4.OrderedMapIterator\u003cK, ? extends V\u003e)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Constructor.\n     *\n     * @param iterator  the iterator to decorate\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 16)",
        "(line 68,col 9)-(line 68,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.hasNext()",
      "begin_line": 72,
      "end_line": 74,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.next()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.hasPrevious()",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.previous()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.getKey()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.getValue()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.setValue(V)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableOrderedMapIterator.remove()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 77)"
      ]
    }
  ]
}