{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/concurrent/LazyInitializer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LazyInitializer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang3.concurrent.ConcurrentInitializer\u003cT\u003e"
      ],
      "begin_line": 79,
      "end_line": 119,
      "comment": "\n * \u003cp\u003e\n * This class provides a generic implementation of the lazy initialization\n * pattern.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Sometimes an application has to deal with an object only under certain\n * circumstances, e.g. when the user selects a specific menu item or if a\n * special event is received. If the creation of the object is costly or the\n * consumption of memory or other system resources is significant, it may make\n * sense to defer the creation of this object until it is really needed. This is\n * a use case for the lazy initialization pattern.\n * \u003c/p\u003e\n * \u003cp\u003e\n * This abstract base class provides an implementation of the double-check idiom\n * for an instance field as discussed in Joshua Bloch\u0027s \"Effective Java\", 2nd\n * edition, item 71. The class already implements all necessary synchronization.\n * A concrete subclass has to implement the {@code initialize()} method, which\n * actually creates the wrapped data object.\n * \u003c/p\u003e\n * \u003cp\u003e\n * As an usage example consider that we have a class {@code ComplexObject} whose\n * instantiation is a complex operation. In order to apply lazy initialization\n * to this class, a subclass of {@code LazyInitializer} has to be created:\n *\n * \u003cpre\u003e\n * public class ComplexObjectInitializer extends LazyInitializer\u0026lt;ComplexObject\u0026gt; {\n *     \u0026#064;Override\n *     protected ComplexObject initialize() {\n *         return new ComplexObject();\n *     }\n * }\n * \u003c/pre\u003e\n *\n * Access to the data object is provided through the {@code get()} method. So,\n * code that wants to obtain the {@code ComplexObject} instance would simply\n * look like this:\n *\n * \u003cpre\u003e\n * // Create an instance of the lazy initializer\n * ComplexObjectInitializer initializer \u003d new ComplexObjectInitializer();\n * ...\n * // When the object is actually needed:\n * ComplexObject cobj \u003d initializer.get();\n * \u003c/pre\u003e\n *\n * \u003c/p\u003e\n * \u003cp\u003e\n * If multiple threads call the {@code get()} method when the object has not yet\n * been created, they are blocked until initialization completes. The algorithm\n * guarantees that only a single instance of the wrapped object class is\n * created, which is passed to all callers. Once initialized, calls to the\n * {@code get()} method are pretty fast because no synchronization is needed\n * (only an access to a \u003cb\u003evolatile\u003c/b\u003e member field).\n * \u003c/p\u003e\n *\n * @since 3.0\n * @version $Id$\n * @param \u003cT\u003e the type of the object managed by this initializer class\n "
    },
    {
      "type": "field",
      "varNames": [
        "object"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Stores the managed object. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.LazyInitializer.get()",
      "begin_line": 91,
      "end_line": 106,
      "comment": "\n     * Returns the object wrapped by this instance. On first access the object\n     * is created. After that it is cached and can be accessed pretty fast.\n     *\n     * @return the object initialized by this {@code LazyInitializer}\n     * @throws ConcurrentException if an error occurred during initialization of\n     * the object\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 26)",
        "(line 96,col 9)-(line 103,col 9)",
        "(line 105,col 9)-(line 105,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.concurrent.LazyInitializer.initialize()",
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * Creates and initializes the object managed by this {@code\n     * LazyInitializer}. This method is called by {@link #get()} when the object\n     * is accessed for the first time. An implementation can focus on the\n     * creation of the object. No synchronization is needed, as this is already\n     * handled by {@code get()}.\n     *\n     * @return the managed data object\n     * @throws ConcurrentException if an error occurs during object creation\n     ",
      "child_ranges": []
    }
  ]
}