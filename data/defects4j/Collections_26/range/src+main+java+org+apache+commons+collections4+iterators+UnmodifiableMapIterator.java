{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/UnmodifiableMapIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnmodifiableMapIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MapIterator\u003cK, V\u003e",
        "org.apache.commons.collections4.Unmodifiable"
      ],
      "begin_line": 30,
      "end_line": 94,
      "comment": "\n * Decorates a map iterator such that it cannot be modified.\n * \u003cp\u003e\n * Attempts to modify it will result in an UnsupportedOperationException.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The iterator being decorated "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(org.apache.commons.collections4.MapIterator\u003c? extends K, ? extends V\u003e)",
      "begin_line": 45,
      "end_line": 56,
      "comment": "\n     * Decorates the specified iterator such that it cannot be modified.\n     *\n     * @param \u003cK\u003e  the key type\n     * @param \u003cV\u003e  the value type\n     * @param iterator  the iterator to decorate\n     * @return a new unmodifiable map iterator\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 49,col 9)",
        "(line 50,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableMapIterator.UnmodifiableMapIterator(org.apache.commons.collections4.MapIterator\u003c? extends K, ? extends V\u003e)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Constructor.\n     *\n     * @param iterator  the iterator to decorate\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 16)",
        "(line 66,col 9)-(line 66,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableMapIterator.hasNext()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableMapIterator.next()",
      "begin_line": 74,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableMapIterator.getKey()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableMapIterator.getValue()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableMapIterator.setValue(V)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableMapIterator.remove()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 77)"
      ]
    }
  ]
}