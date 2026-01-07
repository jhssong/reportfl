{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/AbstractUntypedIteratorDecorator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AbstractUntypedIteratorDecorator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cO\u003e"
      ],
      "begin_line": 30,
      "end_line": 68,
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
      "begin_line": 41,
      "end_line": 47,
      "comment": "\n     * Create a new AbstractUntypedIteratorDecorator.\n     *\n     * @param iterator  the iterator to decorate\n     * @throws NullPointerException if the iterator is null\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)",
        "(line 43,col 9)-(line 45,col 9)",
        "(line 46,col 9)-(line 46,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator.getIterator()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Gets the iterator being decorated.\n     *\n     * @return the decorated iterator\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator.hasNext()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator.remove()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 26)"
      ]
    }
  ]
}