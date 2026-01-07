{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/ri/axes/ChildContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChildContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 32,
      "end_line": 116,
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
      "end_line": 51,
      "comment": "\n     * Create a new ChildContext.\n     * @param parentContext parent EvalContext\n     * @param nodeTest NodeTest\n     * @param startFromParentLocation whether to start from parent location\n     * @param reverse whether to iterate in reverse\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 29)",
        "(line 48,col 9)-(line 48,col 33)",
        "(line 49,col 9)-(line 49,col 63)",
        "(line 50,col 9)-(line 50,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.getCurrentNodePointer()",
      "begin_line": 53,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.getSingleNodePointer()",
      "begin_line": 68,
      "end_line": 84,
      "comment": "\n     * This method is called on the last context on the path when only\n     * one value is needed.  Note that this will return the whole property,\n     * even if it is a collection. It will not extract the first element\n     * of the collection.  For example, \"books\" will return the collection\n     * of books rather than the first book from that collection.\n     * @return Pointer\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.nextNode()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.reset()",
      "begin_line": 90,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 22)",
        "(line 92,col 9)-(line 92,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.setPosition(int)",
      "begin_line": 95,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 47)",
        "(line 97,col 9)-(line 97,col 36)",
        "(line 98,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.prepare()",
      "begin_line": 107,
      "end_line": 115,
      "comment": "\n     * Allocates a PropertyIterator.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 67)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 86)",
        "(line 113,col 9)-(line 114,col 57)"
      ]
    }
  ]
}