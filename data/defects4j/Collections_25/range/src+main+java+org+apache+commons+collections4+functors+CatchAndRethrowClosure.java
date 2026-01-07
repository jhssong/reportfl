{
  "filepath": "/tmp/Collections-25b/src/main/java/org/apache/commons/collections4/functors/CatchAndRethrowClosure.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CatchAndRethrowClosure",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.collections4.Closure\u003cE\u003e"
      ],
      "begin_line": 49,
      "end_line": 76,
      "comment": "\n * {@link Closure} that catches any checked exception and re-throws it as a\n * {@link FunctorException} runtime exception. Example usage:\n *\n * \u003cpre\u003e\n * // Create a catch and re-throw closure via anonymous subclass\n * CatchAndRethrowClosure\u0026lt;String\u0026gt; writer \u003d new ThrowingClosure() {\n *     private java.io.Writer out \u003d // some writer\n *\n *     protected void executeAndThrow(String input) throws IOException {\n *         out.write(input); // throwing of IOException allowed\n *     }\n * };\n *\n * // use catch and re-throw closure\n * java.util.List\u003cString\u003e strList \u003d // some list\n * try {\n *     CollctionUtils.forAllDo(strList, writer);\n * } catch (FunctorException ex) {\n *     Throwable originalError \u003d ex.getCause();\n *     // handle error\n * }\n * \u003c/pre\u003e\n *\n * @since 4.0\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.CatchAndRethrowClosure.execute(E)",
      "begin_line": 58,
      "end_line": 66,
      "comment": "\n     * Execute this closure on the specified input object.\n     *\n     * @param input the input to execute on\n     * @throws FunctorException (runtime) if the closure execution resulted in a\n     *             checked exception.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 65,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.collections4.functors.CatchAndRethrowClosure.executeAndThrow(E)",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Execute this closure on the specified input object.\n     *\n     * @param input the input to execute on\n     * @throws Throwable if the closure execution resulted in a checked\n     *             exception.\n     ",
      "child_ranges": []
    }
  ]
}