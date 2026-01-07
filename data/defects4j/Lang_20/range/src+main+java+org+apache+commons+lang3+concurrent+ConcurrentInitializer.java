{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/concurrent/ConcurrentInitializer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ConcurrentInitializer",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 54,
      "comment": "\n * \u003cp\u003e\n * Definition of an interface for the thread-safe initialization of objects.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The idea behind this interface is to provide access to an object in a\n * thread-safe manner. A {@code ConcurrentInitializer} can be passed to multiple\n * threads which can all access the object produced by the initializer. Through\n * the {@link #get()} method the object can be queried.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Concrete implementations of this interface will use different strategies for\n * the creation of the managed object, e.g. lazy initialization or\n * initialization in a background thread. This is completely transparent to\n * client code, so it is possible to change the initialization strategy without\n * affecting clients.\n * \u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n * @param \u003cT\u003e the type of the object managed by this initializer class\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.ConcurrentInitializer.get()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Returns the fully initialized object produced by this {@code\n     * ConcurrentInitializer}. A concrete implementation here returns the\n     * results of the initialization process. This method may block until\n     * results are available. Typically, once created the result object is\n     * always the same.\n     *\n     * @return the object created by this {@code ConcurrentException}\n     * @throws ConcurrentException if an error occurred during initialization of\n     * the object\n     ",
      "child_ranges": []
    }
  ]
}