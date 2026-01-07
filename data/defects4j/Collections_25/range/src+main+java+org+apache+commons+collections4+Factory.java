{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/Factory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Factory",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 44,
      "comment": "\n * Defines a functor interface implemented by classes that create objects.\n * \u003cp\u003e\n * A \u003ccode\u003eFactory\u003c/code\u003e creates an object without using an input parameter.\n * If an input parameter is required, then {@link Transformer} is more appropriate.\n * \u003cp\u003e\n * Standard implementations of common factories are provided by\n * {@link FactoryUtils}. These include factories that return a constant,\n * a copy of a prototype or a new instance.\n *\n * @param \u003cT\u003e the type that the factory creates\n *\n * @since 2.1\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Factory.create()",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Create a new object.\n     *\n     * @return a new object\n     * @throws FunctorException (runtime) if the factory cannot create an object\n     ",
      "child_ranges": []
    }
  ]
}