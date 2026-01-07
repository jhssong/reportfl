{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/UnmodifiableMapIterator.java",
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
      "end_line": 100,
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
      "end_line": 73,
      "comment": "-----------------------------------------------------------------------",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableMapIterator.next()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableMapIterator.getKey()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableMapIterator.getValue()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableMapIterator.setValue(V)",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.UnmodifiableMapIterator.remove()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 77)"
      ]
    }
  ]
}