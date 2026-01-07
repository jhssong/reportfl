{
  "filepath": "/tmp/JxPath-3b/src/java/org/apache/commons/jxpath/ri/axes/ChildContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChildContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.ri.EvalContext"
      ],
      "begin_line": 32,
      "end_line": 126,
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
      "begin_line": 38,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 29)",
        "(line 45,col 9)-(line 45,col 33)",
        "(line 46,col 9)-(line 46,col 63)",
        "(line 47,col 9)-(line 47,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.getCurrentNodePointer()",
      "begin_line": 50,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 61,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.getSingleNodePointer()",
      "begin_line": 71,
      "end_line": 87,
      "comment": "\n     * This method is called on the last context on the path when only\n     * one value is needed.  Note that this will return the whole property,\n     * even if it is a collection. It will not extract the first element\n     * of the collection.  For example, \"books\" will return the collection\n     * of books rather than the first book from that collection.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 85,col 9)",
        "(line 86,col 9)-(line 86,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.nextNode()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.reset()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 22)",
        "(line 95,col 9)-(line 95,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.setPosition(int)",
      "begin_line": 98,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 47)",
        "(line 100,col 9)-(line 100,col 36)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.axes.ChildContext.prepare()",
      "begin_line": 113,
      "end_line": 125,
      "comment": "\n     * Allocates a PropertyIterator.\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 67)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 124,col 9)"
      ]
    }
  ]
}