{
  "filepath": "/tmp/Collections-28b/src/main/java/org/apache/commons/collections4/iterators/NodeListIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "NodeListIterator",
      "is_interface": false,
      "parent_types": [
        "Iterator\u003cNode\u003e"
      ],
      "begin_line": 34,
      "end_line": 91,
      "comment": "\n * An {@link Iterator} over a {@link NodeList}.\n * \u003cp\u003e\n * This iterator does not support {@link #remove()} as a {@link NodeList} does not support\n * removal of items.\n *\n * @since 4.0\n * @version $Id$\n * @see NodeList\n "
    },
    {
      "type": "field",
      "varNames": [
        "nodeList"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " the original NodeList instance "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " The current iterator index "
    },
    {
      "type": "constructor",
      "signature": "NodeListIterator(Node)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027Node\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 48,
      "end_line": 53,
      "comment": "\n     * Convenience constructor, which creates a new NodeListIterator from\n     * the specified node\u0027s childNodes.\n     *\n     * @param node Node, who\u0027s child nodes are wrapped by this class. Must not be null\n     * @throws NullPointerException if node is null\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 52,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "NodeListIterator(NodeList)",
      "exception": "UnsolvedSymbolException{context\u003d\u0027null\u0027, name\u003d\u0027NodeList\u0027, cause\u003d\u0027null\u0027}",
      "begin_line": 62,
      "end_line": 67,
      "comment": "\n     * Constructor, that creates a new NodeListIterator from the specified\n     * \u003ccode\u003eorg.w3c.NodeList\u003c/code\u003e\n     *\n     * @param nodeList node list, which is wrapped by this class. Must not be null\n     * @throws NullPointerException if nodeList is null\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.NodeListIterator.hasNext()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.NodeListIterator.next()",
      "begin_line": 74,
      "end_line": 80,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.iterators.NodeListIterator.remove()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * Throws {@link UnsupportedOperationException}.\n     *\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 105)"
      ]
    }
  ]
}