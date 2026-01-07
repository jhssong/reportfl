{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/servlet/ServletRequestAndContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ServletRequestAndContext",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.servlet.HttpSessionAndServletContext"
      ],
      "begin_line": 31,
      "end_line": 59,
      "comment": "\n * Just a structure to hold a {@link ServletRequest} and {@link ServletContext}\n * together.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "request"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.servlet.ServletRequestAndContext.ServletRequestAndContext(javax.servlet.ServletRequest, javax.servlet.ServletContext)",
      "begin_line": 40,
      "end_line": 44,
      "comment": "\n     * Create a new ServletRequestAndContext.\n     *\n     * @param request ServletRequest\n     * @param context ServletContext\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 29)",
        "(line 43,col 9)-(line 43,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.ServletRequestAndContext.getSession()",
      "begin_line": 46,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 48,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.ServletRequestAndContext.getServletRequest()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Get the request.\n     *\n     * @return ServletRequest\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 23)"
      ]
    }
  ]
}