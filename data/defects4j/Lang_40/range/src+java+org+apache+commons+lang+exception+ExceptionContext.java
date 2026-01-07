{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/exception/ExceptionContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionContext",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 33,
      "end_line": 68,
      "comment": "\n * Provides context information for exceptions. It is available as separate interface to allow\n * it usage independently from the {@link ContextedException} and\n * {@link ContextedRuntimeException}.\n * \n * @see ContextedException\n * @see ContextedRuntimeException\n * @author D. Ashmore\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionContext.addLabeledValue(java.lang.String, java.io.Serializable)",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Adds a context item along with a label.  \n     * @param label label of item\n     * @param value value of item\n     * @return context itself to allow method chaining\n     * @since 3.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionContext.getLabeledValue(java.lang.String)",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Provides context information associated with the given label.\n     * @param label label of item\n     * @return value value associated with label\n     * @since 3.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionContext.getLabelSet()",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Provides a set of labels that are currently in the context.\n     * @return labelSet labels currently used by the context\n     * @since 3.0\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ExceptionContext.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Implementors provide the given base message with context label/value item \n     * information appended.\n     * @param baseMessage exception message \u003cb\u003ewithout\u003c/b\u003e context information appended\n     * @return formattedMessage exception message \u003cb\u003ewith\u003c/b\u003e context information appended\n     * @since 3.0\n     ",
      "child_ranges": []
    }
  ]
}