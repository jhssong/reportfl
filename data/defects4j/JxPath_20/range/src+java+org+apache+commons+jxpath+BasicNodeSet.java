{
  "filepath": "/tmp/JxPath-20b/src/java/org/apache/commons/jxpath/BasicNodeSet.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BasicNodeSet",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.NodeSet"
      ],
      "begin_line": 30,
      "end_line": 110,
      "comment": "\n * A simple implementation of {@link NodeSet} that behaves as a collection\n * of pointers.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "pointers"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readOnlyPointers"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nodes"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSet.add(org.apache.commons.jxpath.Pointer)",
      "begin_line": 40,
      "end_line": 44,
      "comment": "\n     * Add a pointer to this NodeSet.\n     * @param pointer to add\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 43,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSet.add(org.apache.commons.jxpath.NodeSet)",
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * Add the specified NodeSet to this NodeSet.\n     * @param nodeSet to add\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 53,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSet.remove(org.apache.commons.jxpath.Pointer)",
      "begin_line": 60,
      "end_line": 64,
      "comment": "\n     * Remove a pointer from this NodeSet.\n     * @param pointer to remove\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSet.getPointers()",
      "begin_line": 66,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 70,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSet.getNodes()",
      "begin_line": 73,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSet.getValues()",
      "begin_line": 85,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSet.toString()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.BasicNodeSet.clearCacheLists()",
      "begin_line": 104,
      "end_line": 108,
      "comment": "\n     * Clear cache list members.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 32)",
        "(line 106,col 9)-(line 106,col 21)",
        "(line 107,col 9)-(line 107,col 22)"
      ]
    }
  ]
}