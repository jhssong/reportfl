{
  "filepath": "/tmp/JxPath-21b/src/java/org/apache/commons/jxpath/servlet/HttpSessionAndServletContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HttpSessionAndServletContext",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 59,
      "comment": "\n * Just a structure to hold a ServletRequest and ServletContext together.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "session"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.servlet.HttpSessionAndServletContext.HttpSessionAndServletContext(javax.servlet.http.HttpSession, javax.servlet.ServletContext)",
      "begin_line": 38,
      "end_line": 42,
      "comment": "\n     * Create a new HttpSessionAndServletContext.\n     * @param session HttpSession\n     * @param context ServletContext\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 31)",
        "(line 41,col 9)-(line 41,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.HttpSessionAndServletContext.getSession()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Get the session.\n     * @return HttpSession\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.HttpSessionAndServletContext.getServletContext()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Get the ServletContext.\n     * @return ServletContext\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 23)"
      ]
    }
  ]
}