{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/iterators/AbstractMapIteratorDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractMapIteratorDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.MapIterator\u003cK, V\u003e"
      ],
      "begin_line": 29,
      "end_line": 90,
      "comment": "\n * Provides basic behaviour for decorating a map iterator with extra functionality.\n * \u003cp\u003e\n * All methods are forwarded to the decorated map iterator.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator.AbstractMapIteratorDecorator(org.apache.commons.collections4.MapIterator\u003cK, V\u003e)",
      "begin_line": 41,
      "end_line": 47,
      "comment": "\n     * Constructor that decorates the specified iterator.\n     *\n     * @param iterator  the iterator to decorate, must not be null\n     * @throws IllegalArgumentException if the collection is null\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)",
        "(line 43,col 9)-(line 45,col 9)",
        "(line 46,col 9)-(line 46,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator.getMapIterator()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Gets the iterator being decorated.\n     *\n     * @return the decorated iterator\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator.hasNext()",
      "begin_line": 61,
      "end_line": 63,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator.next()",
      "begin_line": 66,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator.remove()",
      "begin_line": 71,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator.getKey()",
      "begin_line": 76,
      "end_line": 78,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator.getValue()",
      "begin_line": 81,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractMapIteratorDecorator.setValue(V)",
      "begin_line": 86,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 38)"
      ]
    }
  ]
}