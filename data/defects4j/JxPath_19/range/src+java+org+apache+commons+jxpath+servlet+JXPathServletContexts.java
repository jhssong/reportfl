{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/servlet/JXPathServletContexts.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathServletContexts",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 68,
      "end_line": 201,
      "comment": "\n * Static methods that allocate and cache JXPathContexts bound to\n * {@link PageContext}, {@link ServletRequest}, {@link HttpSession}\n * and {@link ServletContext}.\n * \u003cp\u003e\n * The {@link JXPathContext} returned by {@link #getPageContext getPageContext()}\n * provides access to all scopes via the PageContext.findAttribute()\n * method.  Thus, an expression like \"foo\" will first look for the attribute\n * named \"foo\" in the \"page\" context, then the \"request\" context, then\n * the \"session\" one and finally in the \"application\" context.\n * \u003cp\u003e\n * If you need to limit the attibute lookup to just one scope, you can use the\n * pre-definded variables \"page\", \"request\", \"session\" and \"application\".\n * For example, the expression \"$session/foo\" extracts the value of the\n * session attribute named \"foo\".\n * \u003cp\u003e\n * Following are some implementation details. There is a separate JXPathContext\n * for each of the four scopes. These contexts are chained according to the\n * nesting of the scopes.  So, the parent of the \"page\" JXPathContext is a\n * \"request\" JXPathContext, whose parent is a \"session\" JXPathContext (that is\n * if there is a session), whose parent is an \"application\" context.\n * \u003cp\u003e\n * The  XPath context node for each context is the corresponding object:\n * PageContext, ServletRequest, HttpSession or ServletContext.  This feature can\n * be used by servlets.  A servlet can use one of the methods declared by this\n * class and work with a specific JXPathContext for any scope.\n * \u003cp\u003e\n * Since JXPath chains lookups for variables and extension functions, variables\n * and extension function declared in the outer scopes are also available in\n * the inner scopes.\n * \u003cp\u003e\n * Each  of the four context declares exactly one variable, the value of which\n * is the corresponding object: PageContext, etc.\n * \u003cp\u003e\n * The  \"session\" variable will be undefined if there is no session for this\n * servlet. JXPath does not automatically create sessions.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.JXPathServletContexts.getPageContext(javax.servlet.jsp.PageContext)",
      "begin_line": 97,
      "end_line": 113,
      "comment": "\n     * Returns a JXPathContext bound to the \"page\" scope. Caches that context\n     * within the PageContext itself.\n     * @param pageContext as described\n     * @return JXPathContext\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 99,col 79)",
        "(line 100,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.JXPathServletContexts.getRequestContext(javax.servlet.ServletRequest, javax.servlet.ServletContext)",
      "begin_line": 122,
      "end_line": 155,
      "comment": "\n     * Returns a JXPathContext bound to the \"request\" scope. Caches that context\n     * within the request itself.\n     * @param request as described\n     * @param servletContext operative\n     * @return JXPathContext\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 125,col 75)",
        "(line 129,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 43)",
        "(line 138,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 149,col 66)",
        "(line 150,col 9)-(line 150,col 60)",
        "(line 151,col 9)-(line 152,col 67)",
        "(line 153,col 9)-(line 153,col 64)",
        "(line 154,col 9)-(line 154,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.JXPathServletContexts.getSessionContext(javax.servlet.http.HttpSession, javax.servlet.ServletContext)",
      "begin_line": 164,
      "end_line": 178,
      "comment": "\n     * Returns a JXPathContext bound to the \"session\" scope. Caches that context\n     * within the session itself.\n     * @param session as described\n     * @param servletContext operative\n     * @return JXPathContext\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 167,col 75)",
        "(line 168,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.JXPathServletContexts.getApplicationContext(javax.servlet.ServletContext)",
      "begin_line": 186,
      "end_line": 200,
      "comment": "\n     * Returns  a JXPathContext bound to the \"application\" scope. Caches that\n     * context within the servlet context itself.\n     * @param servletContext operative\n     * @return JXPathContext\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 190,col 42)",
        "(line 191,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 23)"
      ]
    }
  ]
}