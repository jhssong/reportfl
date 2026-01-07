{
  "filepath": "/tmp/JxPath-1b/src/java/org/apache/commons/jxpath/servlet/JXPathServletContexts.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathServletContexts",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 67,
      "end_line": 195,
      "comment": "\n * Static methods that allocate and cache JXPathContexts bound to PageContext,\n * ServletRequest, HttpSession and ServletContext.\n * \u003cp\u003e\n * The JXPathContext returned by {@link #getPageContext getPageContext()}\n * provides access to all scopes via the PageContext.findAttribute()\n * method.  Thus, an expression like \"foo\" will first look for the attribute\n * named \"foo\" in the \"page\" context, then the \"request\" context, then\n * the \"session\" one and finally in the \"application\" context.\n * \u003cp\u003e\n * If you need to limit the attibute lookup to just one scope, you can use the\n * pre-definded variables \"page\", \"request\", \"session\" and \"application\".\n * For example, the expression \"$session/foo\" extracts the value of the\n * session attribute named \"foo\".\n * \u003cp\u003e\n * Following are some implementation details. There is a separate JXPathContext\n * for each of the four scopes. These contexts are chained according to the\n * nesting of the scopes.  So, the parent of the \"page\" JXPathContext is a\n * \"request\" JXPathContext, whose parent is a \"session\" JXPathContext (that is\n * if there is a session), whose parent is an \"application\" context.\n * \u003cp\u003e\n * The  XPath context node for each context is the corresponding object:\n * PageContext, ServletRequest, HttpSession or ServletContext.  This feature can\n * be used by servlets.  A servlet can use one of the methods declared by this\n * class and work with a specific JXPathContext for any scope.\n * \u003cp\u003e\n * Since JXPath chains lookups for variables and extension functions, variables\n * and extension function declared in the outer scopes are also available in\n * the inner scopes.\n * \u003cp\u003e\n * Each  of the four context declares exactly one variable, the value of which\n * is the corresponding object: PageContext, etc.\n * \u003cp\u003e\n * The  \"session\" variable will be undefined if there is no session for this\n * servlet. JXPath does not automatically create sessions.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.JXPathServletContexts.getPageContext(javax.servlet.jsp.PageContext)",
      "begin_line": 94,
      "end_line": 110,
      "comment": "\n     * Returns a JXPathContext bound to the \"page\" scope. Caches that context\n     * within the PageContext itself.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 96,col 79)",
        "(line 97,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.JXPathServletContexts.getRequestContext(javax.servlet.ServletRequest, javax.servlet.ServletContext)",
      "begin_line": 116,
      "end_line": 151,
      "comment": "\n     * Returns a JXPathContext bound to the \"request\" scope. Caches that context\n     * within the request itself.\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 121,col 75)",
        "(line 125,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 43)",
        "(line 134,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 145,col 66)",
        "(line 146,col 9)-(line 146,col 60)",
        "(line 147,col 9)-(line 148,col 67)",
        "(line 149,col 9)-(line 149,col 64)",
        "(line 150,col 9)-(line 150,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.JXPathServletContexts.getSessionContext(javax.servlet.http.HttpSession, javax.servlet.ServletContext)",
      "begin_line": 157,
      "end_line": 173,
      "comment": "\n     * Returns a JXPathContext bound to the \"session\" scope. Caches that context\n     * within the session itself.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 162,col 75)",
        "(line 163,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 172,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.servlet.JXPathServletContexts.getApplicationContext(javax.servlet.ServletContext)",
      "begin_line": 179,
      "end_line": 194,
      "comment": "\n     * Returns  a JXPathContext bound to the \"application\" scope. Caches that\n     * context within the servlet context itself.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 184,col 42)",
        "(line 185,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 23)"
      ]
    }
  ]
}