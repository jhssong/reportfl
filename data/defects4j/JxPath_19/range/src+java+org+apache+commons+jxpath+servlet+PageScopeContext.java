{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/servlet/PageScopeContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PageScopeContext",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 68,
      "comment": "\n * A lightweight wrapper for {@link PageContext} that restricts access\n * to attributes of the \"page\" scope.  This object is needed so that\n * XPath \"foo\" would lookup the attribute \"foo\" in all scopes, while\n * \"$page/foo\" would only look in the \"page\" scope.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
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
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * Create a new PageScopeContext.\n     * @param pageContext base\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.PageScopeContext.getAttributeNames()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Returns attributes of the pageContext declared in the \"page\" scope.\n     * @return Enumeration of attribute names\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.PageScopeContext.getAttribute(java.lang.String)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Get the value of the specified attribute.\n     * @param attribute name\n     * @return Object\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.PageScopeContext.setAttribute(java.lang.String, java.lang.Object)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Set the specified attribute.\n     * @param attribute to set\n     * @param value to set\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 75)"
      ]
    }
  ]
}