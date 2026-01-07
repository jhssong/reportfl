{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/event/EventUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 130,
      "comment": "\n * Provides some useful event-based utility methods.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtils.addEventListener(java.lang.Object, java.lang.Class\u003cL\u003e, L)",
      "begin_line": 48,
      "end_line": 62,
      "comment": "\n     * Adds an event listener to the specified source.  This looks for an \"add\" method corresponding to the event\n     * type (addActionListener, for example).\n     * @param eventSource   the event source\n     * @param listenerType  the event listener type\n     * @param listener      the listener\n     * @param \u003cL\u003e           the event listener type\n     *\n     * @throws IllegalArgumentException if the object doesn\u0027t support the listener type\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 61,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtils.bindEventsToMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Class\u003cL\u003e, java.lang.String...)",
      "begin_line": 75,
      "end_line": 80,
      "comment": "\n     * Binds an event listener to a specific method on a specific object.\n     *\n     * @param \u003cL\u003e          the event listener type\n     * @param target       the target object\n     * @param methodName   the name of the method to be called\n     * @param eventSource  the object which is generating events (JButton, JList, etc.)\n     * @param listenerType the listener interface (ActionListener.class, SelectionListener.class, etc.)\n     * @param eventTypes   the event types (method names) from the listener interface (if none specified, all will be\n     *                     supported)\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 78,col 114)",
        "(line 79,col 9)-(line 79,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EventBindingInvocationHandler",
      "is_interface": false,
      "parent_types": [
        "java.lang.reflect.InvocationHandler"
      ],
      "begin_line": 82,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "eventTypes"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.event.EventUtils.EventBindingInvocationHandler.EventBindingInvocationHandler(java.lang.Object, java.lang.String, java.lang.String[])",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n         * Creates a new instance of {@code EventBindingInvocationHandler}.\n         *\n         * @param target the target object for method invocations\n         * @param methodName the name of the method to be invoked\n         * @param eventTypes the names of the supported event types\n         ",
      "child_ranges": [
        "(line 95,col 13)-(line 95,col 33)",
        "(line 96,col 13)-(line 96,col 41)",
        "(line 97,col 13)-(line 97,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtils.EventBindingInvocationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])",
      "begin_line": 109,
      "end_line": 118,
      "comment": "\n         * Handles a method invocation on the proxy object.\n         *\n         * @param proxy the proxy instance\n         * @param method the method to be invoked\n         * @param parameters the parameters for the method invocation\n         * @return the result of the method call\n         * @throws Throwable if an error occurs\n         ",
      "child_ranges": [
        "(line 110,col 13)-(line 116,col 13)",
        "(line 117,col 13)-(line 117,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtils.EventBindingInvocationHandler.hasMatchingParametersMethod(java.lang.reflect.Method)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n         * Checks whether a method for the passed in parameters can be found.\n         *\n         * @param method the listener method invoked\n         * @return a flag whether the parameters could be matched\n         ",
      "child_ranges": [
        "(line 127,col 13)-(line 127,col 118)"
      ]
    }
  ]
}