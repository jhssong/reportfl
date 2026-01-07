{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/UnhandledException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnhandledException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.exception.NestableRuntimeException"
      ],
      "begin_line": 45,
      "end_line": 73,
      "comment": "\n * \u003cp\u003eThrown when it is impossible or undesirable to consume or throw a checked exception.\u003c/p\u003e\n * This exception supplements the standard exception classes by providing a more\n * semantically rich description of the problem.\u003c/p\u003e\n * \n * \u003cp\u003e\u003ccode\u003eUnhandledException\u003c/code\u003e represents the case where a method has to deal\n * with a checked exception but does not wish to.\n * Instead, the checked exception is rethrown in this unchecked wrapper.\u003c/p\u003e\n * \n * \u003cpre\u003e\n * public void foo() {\n *   try {\n *     // do something that throws IOException\n *   } catch (IOException ex) {\n *     // don\u0027t want to or can\u0027t throw IOException from foo()\n *     throw new UnhandledException(ex);\n *   }\n * }\n * \u003c/pre\u003e\n *\n * @author Matthew Hawthorne\n * @since 2.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.UnhandledException.UnhandledException(java.lang.Throwable)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Constructs the exception using a cause.\n     *\n     * @param cause  the underlying cause\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.UnhandledException.UnhandledException(java.lang.String, java.lang.Throwable)",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Constructs the exception using a message and cause.\n     *\n     * @param message  the message to use\n     * @param cause  the underlying cause\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 30)"
      ]
    }
  ]
}