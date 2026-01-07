{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/concurrent/AtomicInitializer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AtomicInitializer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.ConcurrentInitializer\u003cT\u003e"
      ],
      "begin_line": 67,
      "end_line": 106,
      "comment": "\n * \u003cp\u003e\n * A specialized implementation of the {@code ConcurrentInitializer} interface\n * based on an {@link AtomicReference} variable.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This class maintains a member field of type {@code AtomicReference}. It\n * implements the following algorithm to create and initialize an object in its\n * {@link #get()} method:\n * \u003cul\u003e\n * \u003cli\u003eFirst it is checked whether the {@code AtomicReference} variable contains\n * already a value. If this is the case, the value is directly returned.\u003c/li\u003e\n * \u003cli\u003eOtherwise the {@link #initialize()} method is called. This method must be\n * defined in concrete subclasses to actually create the managed object.\u003c/li\u003e\n * \u003cli\u003eAfter the object was created by {@link #initialize()} it is checked\n * whether the {@code AtomicReference} variable is still undefined. This has to\n * be done because in the meantime another thread may have initialized the\n * object. If the reference is still empty, the newly created object is stored\n * in it and returned by this method.\u003c/li\u003e\n * \u003cli\u003eOtherwise the value stored in the {@code AtomicReference} is returned.\u003c/li\u003e\n * \u003c/ul\u003e\n * \u003c/p\u003e\n * \u003cp\u003e\n * Because atomic variables are used this class does not need any\n * synchronization. So there is no danger of deadlock, and access to the managed\n * object is efficient. However, if multiple threads access the {@code\n * AtomicInitializer} object before it has been initialized almost at the same\n * time, it can happen that {@link #initialize()} is called multiple times. The\n * algorithm outlined above guarantees that {@link #get()} always returns the\n * same object though.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Compared with the {@link LazyInitializer} class, this class can be more\n * efficient because it does not need synchronization. The drawback is that the\n * {@link #initialize()} method can be called multiple times which may be\n * problematic if the creation of the managed object is expensive. As a rule of\n * thumb this initializer implementation is preferable if there are not too many\n * threads involved and the probability that multiple threads access an\n * uninitialized object is small. If there is high parallelism,\n * {@link LazyInitializer} is more appropriate.\n * \u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n * @param \u003cT\u003e the type of the object managed by this initializer class\n "
    },
    {
      "type": "field",
      "varNames": [
        "reference"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Holds the reference to the managed object. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AtomicInitializer.get()",
      "begin_line": 80,
      "end_line": 92,
      "comment": "\n     * Returns the object managed by this initializer. The object is created if\n     * it is not available yet and stored internally. This method always returns\n     * the same object.\n     *\n     * @return the object created by this {@code AtomicInitializer}\n     * @throws ConcurrentException if an error occurred during initialization of\n     * the object\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 35)",
        "(line 83,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AtomicInitializer.initialize()",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Creates and initializes the object managed by this {@code\n     * AtomicInitializer}. This method is called by {@link #get()} when the\n     * managed object is not available yet. An implementation can focus on the\n     * creation of the object. No synchronization is needed, as this is already\n     * handled by {@code get()}. As stated by the class comment, it is possible\n     * that this method is called multiple times.\n     *\n     * @return the managed data object\n     * @throws ConcurrentException if an error occurs during object creation\n     ",
      "child_ranges": []
    }
  ]
}