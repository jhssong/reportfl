{
  "filepath": "/tmp/Lang-27b/src/main/java/org/apache/commons/lang3/event/EventListenerSupport.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventListenerSupport",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 56,
      "end_line": 213,
      "comment": "\n * An EventListenerSupport object can be used to manage a list of event \n * listeners of a particular type. The class provides \n * {@link #addListener(Object)} and {@link #removeListener(Object)} methods\n * for registering listeners, as well as a {@link #fire()} method for firing\n * events to the listeners.\n * \n * \u003cp/\u003e\n * To use this class, suppose you want to support ActionEvents.  You would do:\n * \u003ccode\u003e\u003cpre\u003e\n * public class MyActionEventSource\n * {\n *   private EventListenerSupport\u003cActionListener\u003e actionListeners \u003d \n *       EventListenerSupport.create(ActionListener.class);\n *\n *   public void someMethodThatFiresAction()\n *   {\n *     ActionEvent e \u003d new ActionEvent(this, ActionEvent.ACTION_PERFORMED, \"somethingCool\");\n *     actionListeners.fire().actionPerformed(e);\n *   }\n * }\n * \u003c/pre\u003e\u003c/code\u003e\n *\n * @param \u003cL\u003e the type of event listener that is supported by this proxy.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "listeners"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n    * The list used to hold the registered listeners. This list is \n    * intentionally a thread-safe copy-on-write-array so that traversals over\n    * the list of listeners will be atomic.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "proxy"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * The proxy representing the collection of listeners. Calls to this proxy \n     * object will sent to all registered listeners.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.create(java.lang.Class\u003cT\u003e)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Creates an EventListenerSupport object which supports the specified \n     * listener type.\n     *\n     * @param listenerInterface the type of listener interface that will receive\n     *        events posted using this class.\n     * \n     * @return an EventListenerSupport object which supports the specified \n     *         listener type.\n     *         \n     * @throws NullPointerException if \u003ccode\u003elistenerInterface\u003c/code\u003e is \n     *         \u003ccode\u003enull\u003c/code\u003e.\n     * @throws IllegalArgumentException if \u003ccode\u003elistenerInterface\u003c/code\u003e is\n     *         not an interface.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.EventListenerSupport(java.lang.Class\u003cL\u003e)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Creates an EventListenerSupport object which supports the provided \n     * listener interface.\n     *\n     * @param listenerInterface the type of listener interface that will receive\n     *        events posted using this class.\n     * \n     * @throws NullPointerException if \u003ccode\u003elistenerInterface\u003c/code\u003e is \n     *         \u003ccode\u003enull\u003c/code\u003e.\n     * @throws IllegalArgumentException if \u003ccode\u003elistenerInterface\u003c/code\u003e is\n     *         not an interface.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.EventListenerSupport(java.lang.Class\u003cL\u003e, java.lang.ClassLoader)",
      "begin_line": 121,
      "end_line": 131,
      "comment": "\n     * Creates an EventListenerSupport object which supports the provided \n     * listener interface using the specified class loader to create the JDK \n     * dynamic proxy.\n     *\n     * @param listenerInterface the listener interface.\n     * @param classLoader       the class loader.\n     * \n     * @throws NullPointerException if \u003ccode\u003elistenerInterface\u003c/code\u003e or\n     *         \u003ccode\u003eclassLoader\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * @throws IllegalArgumentException if \u003ccode\u003elistenerInterface\u003c/code\u003e is\n     *         not an interface.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 82)",
        "(line 124,col 9)-(line 124,col 69)",
        "(line 125,col 9)-(line 127,col 41)",
        "(line 128,col 9)-(line 130,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.fire()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * Returns a proxy object which can be used to call listener methods on all \n     * of the registered event listeners. All calls made to this proxy will be\n     * forwarded to all registered listeners.\n     *\n     * @return a proxy object which can be used to call listener methods on all \n     * of the registered event listeners\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.addListener(L)",
      "begin_line": 158,
      "end_line": 162,
      "comment": "\n     * Registers an event listener.\n     *\n     * @param listener the event listener (may not be \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @throws NullPointerException if \u003ccode\u003elistener\u003c/code\u003e is \n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 70)",
        "(line 161,col 9)-(line 161,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.getListenerCount()",
      "begin_line": 169,
      "end_line": 172,
      "comment": "\n     * Returns the number of registered listeners.\n     *\n     * @return the number of registered listeners.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.removeListener(L)",
      "begin_line": 182,
      "end_line": 186,
      "comment": "\n     * Unregisters an event listener.\n     *\n     * @param listener the event listener (may not be \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @throws NullPointerException if \u003ccode\u003elistener\u003c/code\u003e is \n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 70)",
        "(line 185,col 9)-(line 185,col 35)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProxyInvocationHandler",
      "is_interface": false,
      "parent_types": [
        "java.lang.reflect.InvocationHandler"
      ],
      "begin_line": 191,
      "end_line": 212,
      "comment": "\n     * An invocation handler used to dispatch the event(s) to all the listeners.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.ProxyInvocationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])",
      "begin_line": 203,
      "end_line": 211,
      "comment": "\n         * Propagates the method call to all registered listeners in place of\n         * the proxy listener object.\n         * \n         * @param proxy the proxy object representing a listener on which the \n         *        invocation was called.\n         * @param method the listener method that will be called on all of the\n         *        listeners.\n         * @param args event arguments to propogate to the listeners.\n         ",
      "child_ranges": [
        "(line 206,col 13)-(line 209,col 13)",
        "(line 210,col 13)-(line 210,col 24)"
      ]
    }
  ]
}