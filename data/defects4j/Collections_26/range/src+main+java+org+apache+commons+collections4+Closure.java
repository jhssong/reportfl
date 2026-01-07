{
  "filepath": "/tmp/Collections-26b/src/main/java/org/apache/commons/collections4/Closure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Closure",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 44,
      "comment": "\n * Defines a functor interface implemented by classes that do something.\n * \u003cp\u003e\n * A \u003ccode\u003eClosure\u003c/code\u003e represents a block of code which is executed from\n * inside some block, function or iteration. It operates an input object.\n * \u003cp\u003e\n * Standard implementations of common closures are provided by\n * {@link ClosureUtils}. These include method invocation and for/while loops.\n *\n * @param \u003cT\u003e the type that the closure acts on\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.Closure.execute(T)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Performs an action on the specified input object.\n     *\n     * @param input  the input to execute on\n     * @throws ClassCastException (runtime) if the input is the wrong class\n     * @throws IllegalArgumentException (runtime) if the input is invalid\n     * @throws FunctorException (runtime) if any other error occurs\n     ",
      "child_ranges": []
    }
  ]
}