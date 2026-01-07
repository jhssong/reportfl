{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/AbstractOrderedMapIteratorDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractOrderedMapIteratorDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.OrderedMapIterator\u003cK, V\u003e"
      ],
      "begin_line": 29,
      "end_line": 108,
      "comment": "\n * Provides basic behaviour for decorating an ordered map iterator with extra functionality.\n * \u003cp\u003e\n * All methods are forwarded to the decorated map iterator.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " The iterator being decorated "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator.AbstractOrderedMapIteratorDecorator(org.apache.commons.collections4.OrderedMapIterator\u003cK, V\u003e)",
      "begin_line": 41,
      "end_line": 47,
      "comment": "\n     * Constructor that decorates the specified iterator.\n     *\n     * @param iterator  the iterator to decorate, must not be null\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)",
        "(line 43,col 9)-(line 45,col 9)",
        "(line 46,col 9)-(line 46,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator.getOrderedMapIterator()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Gets the iterator being decorated.\n     *\n     * @return the decorated iterator\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator.hasNext()",
      "begin_line": 61,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator.next()",
      "begin_line": 67,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator.hasPrevious()",
      "begin_line": 73,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator.previous()",
      "begin_line": 79,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator.remove()",
      "begin_line": 85,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator.getKey()",
      "begin_line": 91,
      "end_line": 94,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator.getValue()",
      "begin_line": 97,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator.setValue(V)",
      "begin_line": 103,
      "end_line": 106,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 38)"
      ]
    }
  ]
}