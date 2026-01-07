{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/AbstractIteratorDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractIteratorDecorator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator\u003cE, E\u003e"
      ],
      "begin_line": 29,
      "end_line": 48,
      "comment": "\n * Provides basic behaviour for decorating an iterator with extra functionality.\n * \u003cp\u003e\n * All methods are forwarded to the decorated iterator.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.AbstractIteratorDecorator.AbstractIteratorDecorator(java.util.Iterator\u003cE\u003e)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Constructor that decorates the specified iterator.\n     *\n     * @param iterator  the iterator to decorate, must not be null\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractIteratorDecorator.next()",
      "begin_line": 43,
      "end_line": 46,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 36)"
      ]
    }
  ]
}