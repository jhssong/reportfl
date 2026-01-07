{
  "filepath": "/tmp/Lang-23b/src/main/java/org/apache/commons/lang3/event/EventListenerSupport.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventListenerSupport",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 324,
      "comment": "\n * An EventListenerSupport object can be used to manage a list of event \n * listeners of a particular type. The class provides \n * {@link #addListener(Object)} and {@link #removeListener(Object)} methods\n * for registering listeners, as well as a {@link #fire()} method for firing\n * events to the listeners.\n * \n * \u003cp/\u003e\n * To use this class, suppose you want to support ActionEvents.  You would do:\n * \u003ccode\u003e\u003cpre\u003e\n * public class MyActionEventSource\n * {\n *   private EventListenerSupport\u003cActionListener\u003e actionListeners \u003d \n *       EventListenerSupport.create(ActionListener.class);\n *\n *   public void someMethodThatFiresAction()\n *   {\n *     ActionEvent e \u003d new ActionEvent(this, ActionEvent.ACTION_PERFORMED, \"somethingCool\");\n *     actionListeners.fire().actionPerformed(e);\n *   }\n * }\n * \u003c/pre\u003e\u003c/code\u003e\n *\n * Serializing an {@link EventListenerSupport} instance will result in any\n * non-{@link Serializable} listeners being silently dropped.\n *\n * @param \u003cL\u003e the type of event listener that is supported by this proxy.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Serialization version "
    },
    {
      "type": "field",
      "varNames": [
        "listeners"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * The list used to hold the registered listeners. This list is \n     * intentionally a thread-safe copy-on-write-array so that traversals over\n     * the list of listeners will be atomic.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "proxy"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * The proxy representing the collection of listeners. Calls to this proxy \n     * object will sent to all registered listeners.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "prototypeArray"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Empty typed array for #getListeners().\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.create(java.lang.Class\u003cT\u003e)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * Creates an EventListenerSupport object which supports the specified \n     * listener type.\n     *\n     * @param listenerInterface the type of listener interface that will receive\n     *        events posted using this class.\n     * \n     * @return an EventListenerSupport object which supports the specified \n     *         listener type.\n     *         \n     * @throws NullPointerException if \u003ccode\u003elistenerInterface\u003c/code\u003e is \n     *         \u003ccode\u003enull\u003c/code\u003e.\n     * @throws IllegalArgumentException if \u003ccode\u003elistenerInterface\u003c/code\u003e is\n     *         not an interface.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.EventListenerSupport(java.lang.Class\u003cL\u003e)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * Creates an EventListenerSupport object which supports the provided \n     * listener interface.\n     *\n     * @param listenerInterface the type of listener interface that will receive\n     *        events posted using this class.\n     * \n     * @throws NullPointerException if \u003ccode\u003elistenerInterface\u003c/code\u003e is \n     *         \u003ccode\u003enull\u003c/code\u003e.\n     * @throws IllegalArgumentException if \u003ccode\u003elistenerInterface\u003c/code\u003e is\n     *         not an interface.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.EventListenerSupport(java.lang.Class\u003cL\u003e, java.lang.ClassLoader)",
      "begin_line": 139,
      "end_line": 147,
      "comment": "\n     * Creates an EventListenerSupport object which supports the provided \n     * listener interface using the specified class loader to create the JDK \n     * dynamic proxy.\n     *\n     * @param listenerInterface the listener interface.\n     * @param classLoader       the class loader.\n     * \n     * @throws NullPointerException if \u003ccode\u003elistenerInterface\u003c/code\u003e or\n     *         \u003ccode\u003eclassLoader\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * @throws IllegalArgumentException if \u003ccode\u003elistenerInterface\u003c/code\u003e is\n     *         not an interface.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 15)",
        "(line 142,col 9)-(line 142,col 82)",
        "(line 143,col 9)-(line 143,col 69)",
        "(line 144,col 9)-(line 145,col 45)",
        "(line 146,col 9)-(line 146,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.EventListenerSupport()",
      "begin_line": 153,
      "end_line": 154,
      "comment": "\n     * Create a new EventListenerSupport instance.\n     * Serialization-friendly constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.fire()",
      "begin_line": 164,
      "end_line": 167,
      "comment": "\n     * Returns a proxy object which can be used to call listener methods on all \n     * of the registered event listeners. All calls made to this proxy will be\n     * forwarded to all registered listeners.\n     *\n     * @return a proxy object which can be used to call listener methods on all \n     * of the registered event listeners\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.addListener(L)",
      "begin_line": 181,
      "end_line": 185,
      "comment": "\n     * Registers an event listener.\n     *\n     * @param listener the event listener (may not be \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @throws NullPointerException if \u003ccode\u003elistener\u003c/code\u003e is \n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 70)",
        "(line 184,col 9)-(line 184,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.getListenerCount()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Returns the number of registered listeners.\n     *\n     * @return the number of registered listeners.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.removeListener(L)",
      "begin_line": 205,
      "end_line": 209,
      "comment": "\n     * Unregisters an event listener.\n     *\n     * @param listener the event listener (may not be \u003ccode\u003enull\u003c/code\u003e).\n     * \n     * @throws NullPointerException if \u003ccode\u003elistener\u003c/code\u003e is \n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 70)",
        "(line 208,col 9)-(line 208,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.getListeners()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * Get an array containing the currently registered listeners.\n     * Modification to this array\u0027s elements will have no effect on the\n     * {@link EventListenerSupport} instance.\n     * @return L[]\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 226,
      "end_line": 245,
      "comment": "\n     * Serialize.\n     * @param objectOutputStream\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 64)",
        "(line 230,col 9)-(line 230,col 104)",
        "(line 231,col 9)-(line 239,col 9)",
        "(line 244,col 9)-(line 244,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.readObject(java.io.ObjectInputStream)",
      "begin_line": 253,
      "end_line": 263,
      "comment": "\n     * Deserialize.\n     * @param objectInputStream\n     * @throws IOException\n     * @throws ClassNotFoundException\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 255,col 61)",
        "(line 257,col 9)-(line 257,col 64)",
        "(line 259,col 9)-(line 260,col 88)",
        "(line 262,col 9)-(line 262,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.initializeTransientFields(java.lang.Class\u003cL\u003e, java.lang.ClassLoader)",
      "begin_line": 270,
      "end_line": 275,
      "comment": "\n     * Initialize transient fields.\n     * @param listenerInterface\n     * @param classLoader\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 272,col 66)",
        "(line 273,col 9)-(line 273,col 36)",
        "(line 274,col 9)-(line 274,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.createProxy(java.lang.Class\u003cL\u003e, java.lang.ClassLoader)",
      "begin_line": 282,
      "end_line": 285,
      "comment": "\n     * Create the proxy object.\n     * @param listenerInterface\n     * @param classLoader\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 284,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.createInvocationHandler()",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * Create the {@link InvocationHandler} responsible for broadcasting calls\n     * to the managed listeners.  Subclasses can override to provide custom behavior.\n     * @return ProxyInvocationHandler\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProxyInvocationHandler",
      "is_interface": false,
      "parent_types": [
        "java.lang.reflect.InvocationHandler"
      ],
      "begin_line": 299,
      "end_line": 323,
      "comment": "\n     * An invocation handler used to dispatch the event(s) to all the listeners.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.ProxyInvocationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])",
      "begin_line": 314,
      "end_line": 322,
      "comment": "\n         * Propagates the method call to all registered listeners in place of\n         * the proxy listener object.\n         * \n         * @param proxy the proxy object representing a listener on which the \n         *        invocation was called.\n         * @param method the listener method that will be called on all of the\n         *        listeners.\n         * @param args event arguments to propagate to the listeners.\n         ",
      "child_ranges": [
        "(line 317,col 13)-(line 320,col 13)",
        "(line 321,col 13)-(line 321,col 24)"
      ]
    }
  ]
}