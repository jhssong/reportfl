{
  "filepath": "/tmp/Lang-64b/src/java/org/apache/commons/lang/UnhandledException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnhandledException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.exception.NestableRuntimeException"
      ],
      "begin_line": 44,
      "end_line": 72,
      "comment": "\n * \u003cp\u003eThrown when it is impossible or undesirable to consume or throw a checked exception.\u003c/p\u003e\n * This exception supplements the standard exception classes by providing a more\n * semantically rich description of the problem.\u003c/p\u003e\n * \n * \u003cp\u003e\u003ccode\u003eUnhandledException\u003c/code\u003e represents the case where a method has to deal\n * with a checked exception but does not wish to.\n * Instead, the checked exception is rethrown in this unchecked wrapper.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * public void foo() {\n *   try {\n *     // do something that throws IOException\n *   } catch (IOException ex) {\n *     // don\u0027t want to or can\u0027t throw IOException from foo()\n *     throw new UnhandledException(ex);\n *   }\n * }\n * \u003c/pre\u003e\n *\n * @author Matthew Hawthorne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.UnhandledException.UnhandledException(java.lang.Throwable)",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Constructs the exception using a cause.\n     *\n     * @param cause  the underlying cause\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.UnhandledException.UnhandledException(java.lang.String, java.lang.Throwable)",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Constructs the exception using a message and cause.\n     *\n     * @param message  the message to use\n     * @param cause  the underlying cause\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 30)"
      ]
    }
  ]
}