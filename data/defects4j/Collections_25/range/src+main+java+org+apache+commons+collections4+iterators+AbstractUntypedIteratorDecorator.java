{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/iterators/AbstractUntypedIteratorDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUntypedIteratorDecorator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cO\u003e"
      ],
      "begin_line": 30,
      "end_line": 65,
      "comment": "\n * Provides basic behaviour for decorating an iterator with extra functionality\n * without committing the generic type of the Iterator implementation.\n * \u003cp\u003e\n * All methods are forwarded to the decorated iterator.\n *\n * @since 4.0\n * @version $Id$\n "
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
      "type": "constructor",
      "signature": "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator.AbstractUntypedIteratorDecorator(java.util.Iterator\u003cI\u003e)",
      "begin_line": 40,
      "end_line": 46,
      "comment": "\n     * Create a new AbstractUntypedIteratorDecorator.\n     *\n     * @param iterator  the iterator to decorate\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 16)",
        "(line 42,col 9)-(line 44,col 9)",
        "(line 45,col 9)-(line 45,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator.getIterator()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Gets the iterator being decorated.\n     *\n     * @return the decorated iterator\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator.hasNext()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator.remove()",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 26)"
      ]
    }
  ]
}