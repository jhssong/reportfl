{
  "filepath": "/tmp/JxPath-17b/src/java/org/apache/commons/jxpath/ri/axes/ChildContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChildContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 32,
      "end_line": 134,
      "comment": "\n * EvalContext that can walk the \"child::\", \"following-sibling::\" and\n * \"preceding-sibling::\" axes.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "nodeTest"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startFromParentLocation"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "reverse"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "iterator"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.ChildContext(org.apache.commons.jxpath.ri.EvalContext, org.apache.commons.jxpath.ri.compiler.NodeTest, boolean, boolean)",
      "begin_line": 45,
      "end_line": 55,
      "comment": "\n     * Create a new ChildContext.\n     * @param parentContext parent EvalContext\n     * @param nodeTest NodeTest\n     * @param startFromParentLocation whether to start from parent location\n     * @param reverse whether to iterate in reverse\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 29)",
        "(line 52,col 9)-(line 52,col 33)",
        "(line 53,col 9)-(line 53,col 63)",
        "(line 54,col 9)-(line 54,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.getCurrentNodePointer()",
      "begin_line": 60,
      "end_line": 67,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.getSingleNodePointer()",
      "begin_line": 77,
      "end_line": 93,
      "comment": "\n     * This method is called on the last context on the path when only\n     * one value is needed.  Note that this will return the whole property,\n     * even if it is a collection. It will not extract the first element\n     * of the collection.  For example, \"books\" will return the collection\n     * of books rather than the first book from that collection.\n     * @return Pointer\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.nextNode()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.reset()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 22)",
        "(line 107,col 9)-(line 107,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.setPosition(int)",
      "begin_line": 113,
      "end_line": 120,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 47)",
        "(line 115,col 9)-(line 115,col 36)",
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.prepare()",
      "begin_line": 125,
      "end_line": 133,
      "comment": "\n     * Allocates a PropertyIterator.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 67)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 86)",
        "(line 131,col 9)-(line 132,col 66)"
      ]
    }
  ]
}