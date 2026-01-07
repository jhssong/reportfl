{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/iterators/AbstractListIteratorDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractListIteratorDecorator",
      "is_interface": false,
      "parent_types": [
        "java.util.ListIterator\u003cE\u003e"
      ],
      "begin_line": 29,
      "end_line": 105,
      "comment": "\n * Provides basic behaviour for decorating a list iterator with extra functionality.\n * \u003cp\u003e\n * All methods are forwarded to the decorated list iterator.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator.AbstractListIteratorDecorator(java.util.ListIterator\u003cE\u003e)",
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
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator.getListIterator()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Gets the iterator being decorated.\n     *\n     * @return the decorated iterator\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator.hasNext()",
      "begin_line": 61,
      "end_line": 63,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator.next()",
      "begin_line": 66,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator.nextIndex()",
      "begin_line": 71,
      "end_line": 73,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator.hasPrevious()",
      "begin_line": 76,
      "end_line": 78,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator.previous()",
      "begin_line": 81,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator.previousIndex()",
      "begin_line": 86,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator.remove()",
      "begin_line": 91,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator.set(E)",
      "begin_line": 96,
      "end_line": 98,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractListIteratorDecorator.add(E)",
      "begin_line": 101,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 26)"
      ]
    }
  ]
}