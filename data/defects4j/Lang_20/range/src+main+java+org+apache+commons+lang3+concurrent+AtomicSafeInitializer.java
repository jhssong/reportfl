{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/concurrent/AtomicSafeInitializer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AtomicSafeInitializer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.ConcurrentInitializer\u003cT\u003e"
      ],
      "begin_line": 56,
      "end_line": 96,
      "comment": "\n * \u003cp\u003e\n * A specialized {@code ConcurrentInitializer} implementation which is similar\n * to {@link AtomicInitializer}, but ensures that the {@link #initialize()}\n * method is called only once.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As {@link AtomicInitializer} this class is based on atomic variables, so it\n * can create an object under concurrent access without synchronization.\n * However, it implements an additional check to guarantee that the\n * {@link #initialize()} method which actually creates the object cannot be\n * called multiple times.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Because of this additional check this implementation is slightly less\n * efficient than {@link AtomicInitializer}, but if the object creation in the\n * {@code initialize()} method is expensive or if multiple invocations of\n * {@code initialize()} are problematic, it is the better alternative.\n * \u003c/p\u003e\n * \u003cp\u003e\n * From its semantics this class has the same properties as\n * {@link LazyInitializer}. It is a \u0026quot;save\u0026quot; implementation of the lazy\n * initializer pattern. Comparing both classes in terms of efficiency is\n * difficult because which one is faster depends on multiple factors. Because\n * {@code AtomicSafeInitializer} does not use synchronization at all it probably\n * outruns {@link LazyInitializer}, at least under low or moderate concurrent\n * access. Developers should run their own benchmarks on the expected target\n * platform to decide which implementation is suitable for their specific use\n * case.\n * \u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n * @param \u003cT\u003e the type of the object managed by this initializer class\n "
    },
    {
      "type": "field",
      "varNames": [
        "factory"
      ],
      "begin_line": 59,
      "end_line": 60,
      "comment": " A guard which ensures that initialize() is called only once. "
    },
    {
      "type": "field",
      "varNames": [
        "reference"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Holds the reference to the managed object. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AtomicSafeInitializer.get()",
      "begin_line": 72,
      "end_line": 82,
      "comment": "\n     * Get (and initialize, if not initialized yet) the required object\n     *\n     * @return lazily initialized object\n     * @throws ConcurrentException if the initialization of the object causes an\n     * exception\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 17)",
        "(line 75,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 81,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.AtomicSafeInitializer.initialize()",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Creates and initializes the object managed by this\n     * {@code AtomicInitializer}. This method is called by {@link #get()} when\n     * the managed object is not available yet. An implementation can focus on\n     * the creation of the object. No synchronization is needed, as this is\n     * already handled by {@code get()}. This method is guaranteed to be called\n     * only once.\n     *\n     * @return the managed data object\n     * @throws ConcurrentException if an error occurs during object creation\n     ",
      "child_ranges": []
    }
  ]
}