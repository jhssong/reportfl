{
  "filepath": "/tmp/Lang-25b/src/main/java/org/apache/commons/lang3/event/EventUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 119,
      "comment": "\n * Provides some useful event-based utility methods.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtils.addEventListener(java.lang.Object, java.lang.Class\u003cL\u003e, L)",
      "begin_line": 48,
      "end_line": 66,
      "comment": "\n     * Adds an event listener to the specified source.  This looks for an \"add\" method corresponding to the event\n     * type (addActionListener, for example).\n     * @param eventSource   the event source\n     * @param listenerType  the event listener type\n     * @param listener      the listener\n     * @param \u003cL\u003e           the event listener type\n     *\n     * @throws IllegalArgumentException if the object doesn\u0027t support the listener type\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 65,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtils.bindEventsToMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Class\u003cL\u003e, java.lang.String...)",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * Binds an event listener to a specific method on a specific object.\n     *\n     * @param \u003cL\u003e          the event listener type\n     * @param target       the target object\n     * @param methodName   the name of the method to be called\n     * @param eventSource  the object which is generating events (JButton, JList, etc.)\n     * @param listenerType the listener interface (ActionListener.class, SelectionListener.class, etc.)\n     * @param eventTypes   the event types (method names) from the listener interface (if none specified, all will be\n     *                     supported)\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 202)",
        "(line 82,col 9)-(line 82,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EventBindingInvocationHandler",
      "is_interface": false,
      "parent_types": [
        "java.lang.reflect.InvocationHandler"
      ],
      "begin_line": 85,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "methodName"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "eventTypes"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.event.EventUtils.EventBindingInvocationHandler.EventBindingInvocationHandler(java.lang.Object, java.lang.String, java.lang.String[])",
      "begin_line": 91,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 33)",
        "(line 94,col 13)-(line 94,col 41)",
        "(line 95,col 13)-(line 95,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtils.EventBindingInvocationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])",
      "begin_line": 98,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 100,col 13)-(line 110,col 13)",
        "(line 111,col 13)-(line 111,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventUtils.EventBindingInvocationHandler.hasMatchingParametersMethod(java.lang.reflect.Method)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 118)"
      ]
    }
  ]
}