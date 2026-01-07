{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/event/EventListenerSupport.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EventListenerSupport",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 66,
      "end_line": 316,
      "comment": "\n * An EventListenerSupport object can be used to manage a list of event\n * listeners of a particular type. The class provides\n * {@link #addListener(Object)} and {@link #removeListener(Object)} methods\n * for registering listeners, as well as a {@link #fire()} method for firing\n * events to the listeners.\n *\n * \u003cp/\u003e\n * To use this class, suppose you want to support ActionEvents.  You would do:\n * \u003ccode\u003e\u003cpre\u003e\n * public class MyActionEventSource\n * {\n *   private EventListenerSupport\u003cActionListener\u003e actionListeners \u003d\n *       EventListenerSupport.create(ActionListener.class);\n *\n *   public void someMethodThatFiresAction()\n *   {\n *     ActionEvent e \u003d new ActionEvent(this, ActionEvent.ACTION_PERFORMED, \"somethingCool\");\n *     actionListeners.fire().actionPerformed(e);\n *   }\n * }\n * \u003c/pre\u003e\u003c/code\u003e\n *\n * Serializing an {@link EventListenerSupport} instance will result in any\n * non-{@link Serializable} listeners being silently dropped.\n *\n * @param \u003cL\u003e the type of event listener that is supported by this proxy.\n *\n * @since 3.0\n * @version $Id$\n "
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
      "comment": "\n     * The list used to hold the registered listeners. This list is\n     * intentionally a thread-safe copy-on-write-array so that traversals over\n     * the list of listeners will be atomic.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "proxy"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * The proxy representing the collection of listeners. Calls to this proxy\n     * object will sent to all registered listeners.\n     "
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
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * Creates an EventListenerSupport object which supports the specified\n     * listener type.\n     *\n     * @param \u003cT\u003e the type of the listener interface\n     * @param listenerInterface the type of listener interface that will receive\n     *        events posted using this class.\n     *\n     * @return an EventListenerSupport object which supports the specified\n     *         listener type.\n     *\n     * @throws NullPointerException if \u003ccode\u003elistenerInterface\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     * @throws IllegalArgumentException if \u003ccode\u003elistenerInterface\u003c/code\u003e is\n     *         not an interface.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 62)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.EventListenerSupport(java.lang.Class\u003cL\u003e)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Creates an EventListenerSupport object which supports the provided\n     * listener interface.\n     *\n     * @param listenerInterface the type of listener interface that will receive\n     *        events posted using this class.\n     *\n     * @throws NullPointerException if \u003ccode\u003elistenerInterface\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     * @throws IllegalArgumentException if \u003ccode\u003elistenerInterface\u003c/code\u003e is\n     *         not an interface.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 80)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.EventListenerSupport(java.lang.Class\u003cL\u003e, java.lang.ClassLoader)",
      "begin_line": 138,
      "end_line": 145,
      "comment": "\n     * Creates an EventListenerSupport object which supports the provided\n     * listener interface using the specified class loader to create the JDK\n     * dynamic proxy.\n     *\n     * @param listenerInterface the listener interface.\n     * @param classLoader       the class loader.\n     *\n     * @throws NullPointerException if \u003ccode\u003elistenerInterface\u003c/code\u003e or\n     *         \u003ccode\u003eclassLoader\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e.\n     * @throws IllegalArgumentException if \u003ccode\u003elistenerInterface\u003c/code\u003e is\n     *         not an interface.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 15)",
        "(line 140,col 9)-(line 140,col 82)",
        "(line 141,col 9)-(line 141,col 69)",
        "(line 142,col 9)-(line 143,col 45)",
        "(line 144,col 9)-(line 144,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.EventListenerSupport()",
      "begin_line": 151,
      "end_line": 152,
      "comment": "\n     * Create a new EventListenerSupport instance.\n     * Serialization-friendly constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.fire()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Returns a proxy object which can be used to call listener methods on all\n     * of the registered event listeners. All calls made to this proxy will be\n     * forwarded to all registered listeners.\n     *\n     * @return a proxy object which can be used to call listener methods on all\n     * of the registered event listeners\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.addListener(L)",
      "begin_line": 178,
      "end_line": 181,
      "comment": "\n     * Registers an event listener.\n     *\n     * @param listener the event listener (may not be \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws NullPointerException if \u003ccode\u003elistener\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 70)",
        "(line 180,col 9)-(line 180,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.getListenerCount()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Returns the number of registered listeners.\n     *\n     * @return the number of registered listeners.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.removeListener(L)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * Unregisters an event listener.\n     *\n     * @param listener the event listener (may not be \u003ccode\u003enull\u003c/code\u003e).\n     *\n     * @throws NullPointerException if \u003ccode\u003elistener\u003c/code\u003e is\n     *         \u003ccode\u003enull\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 70)",
        "(line 202,col 9)-(line 202,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.getListeners()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Get an array containing the currently registered listeners.\n     * Modification to this array\u0027s elements will have no effect on the\n     * {@link EventListenerSupport} instance.\n     * @return L[]\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.writeObject(java.io.ObjectOutputStream)",
      "begin_line": 220,
      "end_line": 239,
      "comment": "\n     * Serialize.\n     * @param objectOutputStream the output stream\n     * @throws IOException if an IO error occurs\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 64)",
        "(line 224,col 9)-(line 224,col 104)",
        "(line 225,col 9)-(line 233,col 9)",
        "(line 238,col 9)-(line 238,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.readObject(java.io.ObjectInputStream)",
      "begin_line": 247,
      "end_line": 257,
      "comment": "\n     * Deserialize.\n     * @param objectInputStream the input stream\n     * @throws IOException if an IO error occurs\n     * @throws ClassNotFoundException if the class cannot be resolved\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 249,col 61)",
        "(line 251,col 9)-(line 251,col 64)",
        "(line 253,col 9)-(line 254,col 88)",
        "(line 256,col 9)-(line 256,col 101)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.initializeTransientFields(java.lang.Class\u003cL\u003e, java.lang.ClassLoader)",
      "begin_line": 264,
      "end_line": 269,
      "comment": "\n     * Initialize transient fields.\n     * @param listenerInterface the class of the listener interface\n     * @param classLoader the class loader to be used\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 266,col 66)",
        "(line 267,col 9)-(line 267,col 36)",
        "(line 268,col 9)-(line 268,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.createProxy(java.lang.Class\u003cL\u003e, java.lang.ClassLoader)",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * Create the proxy object.\n     * @param listenerInterface the class of the listener interface\n     * @param classLoader the class loader to be used\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 278,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.createInvocationHandler()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * Create the {@link InvocationHandler} responsible for broadcasting calls\n     * to the managed listeners.  Subclasses can override to provide custom behavior.\n     * @return ProxyInvocationHandler\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 44)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ProxyInvocationHandler",
      "is_interface": false,
      "parent_types": [
        "java.lang.reflect.InvocationHandler"
      ],
      "begin_line": 293,
      "end_line": 315,
      "comment": "\n     * An invocation handler used to dispatch the event(s) to all the listeners.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 295,
      "end_line": 295,
      "comment": " Serialization version "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.event.EventListenerSupport.ProxyInvocationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])",
      "begin_line": 309,
      "end_line": 314,
      "comment": "\n         * Propagates the method call to all registered listeners in place of\n         * the proxy listener object.\n         *\n         * @param proxy the proxy object representing a listener on which the\n         *        invocation was called.\n         * @param method the listener method that will be called on all of the\n         *        listeners.\n         * @param args event arguments to propagate to the listeners.\n         * @return the result of the method call\n         * @throws Throwable if an error occurs\n         ",
      "child_ranges": [
        "(line 310,col 13)-(line 312,col 13)",
        "(line 313,col 13)-(line 313,col 24)"
      ]
    }
  ]
}