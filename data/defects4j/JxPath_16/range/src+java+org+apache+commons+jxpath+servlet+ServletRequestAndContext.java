{
  "filepath": "/tmp/JxPath-16b/src/java/org/apache/commons/jxpath/servlet/ServletRequestAndContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ServletRequestAndContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.servlet.HttpSessionAndServletContext"
      ],
      "begin_line": 30,
      "end_line": 59,
      "comment": "\n * Just a structure to hold a ServletRequest and ServletContext together.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "request"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.servlet.ServletRequestAndContext.ServletRequestAndContext(javax.servlet.ServletRequest, javax.servlet.ServletContext)",
      "begin_line": 38,
      "end_line": 42,
      "comment": "\n     * Create a new ServletRequestAndContext.\n     * @param request ServletRequest\n     * @param context ServletContext\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 29)",
        "(line 41,col 9)-(line 41,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.ServletRequestAndContext.getSession()",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 49,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.ServletRequestAndContext.getServletRequest()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Get the request.\n     * @return ServletRequest\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 23)"
      ]
    }
  ]
}