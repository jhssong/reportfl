{
  "filepath": "/tmp/JxPath-16b/src/java/org/apache/commons/jxpath/ri/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 101,
      "comment": "\n * XPath parser\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "parser"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Parser.parseExpression(java.lang.String, org.apache.commons.jxpath.ri.Compiler)",
      "begin_line": 43,
      "end_line": 73,
      "comment": "\n     * Parses the XPath expression. Throws a JXPathException in case\n     * of a syntax error.\n     * @param expression to parse\n     * @param compiler the compiler\n     * @return parsed Object\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 72,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Parser.describePosition(java.lang.String, int)",
      "begin_line": 81,
      "end_line": 90,
      "comment": "\n     * Describe a parse position.\n     * @param expression to parse\n     * @param position parse position\n     * @return String\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 89,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.Parser.addEscapes(java.lang.String)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * Add escapes to the specified String.\n     * @param string incoming String\n     * @return String\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 48)"
      ]
    }
  ]
}