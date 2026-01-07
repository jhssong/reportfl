{
  "filepath": "/tmp/JxPath-13b/src/java/org/apache/commons/jxpath/servlet/PageScopeContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PageScopeContext",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 53,
      "comment": "\n * A lightweight wrapper for PageContext that restricts access\n * to attributes of the \"page\" scope.  This object is needed so that\n * XPath \"foo\" would lookup the attribute \"foo\" in all scopes, while\n * \"$page/foo\" would only look in the \"page\" scope.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "pageContext"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.servlet.PageScopeContext.PageScopeContext(javax.servlet.jsp.PageContext)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.PageScopeContext.getAttributeNames()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Returns attributes of the pageContext declared in the \"page\" scope.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.PageScopeContext.getAttribute(java.lang.String)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.PageScopeContext.setAttribute(java.lang.String, java.lang.Object)",
      "begin_line": 50,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 75)"
      ]
    }
  ]
}