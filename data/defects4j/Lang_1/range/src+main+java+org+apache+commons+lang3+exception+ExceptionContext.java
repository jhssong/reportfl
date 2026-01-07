{
  "filepath": "/tmp/Lang-1b/src/main/java/org/apache/commons/lang3/exception/ExceptionContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExceptionContext",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 103,
      "comment": "\n * Allows the storage and retrieval of contextual information based on label-value\n * pairs for exceptions.\n * \u003cp\u003e\n * Implementations are expected to manage the pairs in a list-style collection\n * that keeps the pairs in the sequence of their addition.\n * \u003c/p\u003e\n * \n * @see ContextedException\n * @see ContextedRuntimeException\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionContext.addContextValue(java.lang.String, java.lang.Object)",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Adds a contextual label-value pair into this context.\n     * \u003cp\u003e\n     * The pair will be added to the context, independently of an already\n     * existing pair with the same label.\n     * \u003c/p\u003e\n     * \n     * @param label  the label of the item to add, {@code null} not recommended\n     * @param value  the value of item to add, may be {@code null}\n     * @return {@code this}, for method chaining, not {@code null}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionContext.setContextValue(java.lang.String, java.lang.Object)",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Sets a contextual label-value pair into this context.\n     * \u003cp\u003e\n     * The pair will be added normally, but any existing label-value pair with\n     * the same label is removed from the context.\n     * \u003c/p\u003e\n     * \n     * @param label  the label of the item to add, {@code null} not recommended\n     * @param value  the value of item to add, may be {@code null}\n     * @return {@code this}, for method chaining, not {@code null}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionContext.getContextValues(java.lang.String)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Retrieves all the contextual data values associated with the label.\n     * \n     * @param label  the label to get the contextual values for, may be {@code null}\n     * @return the contextual values associated with the label, never {@code null}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionContext.getFirstContextValue(java.lang.String)",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Retrieves the first available contextual data value associated with the label.\n     * \n     * @param label  the label to get the contextual value for, may be {@code null}\n     * @return the first contextual value associated with the label, may be {@code null}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionContext.getContextLabels()",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Retrieves the full set of labels defined in the contextual data.\n     * \n     * @return the set of labels, not {@code null}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionContext.getContextEntries()",
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * Retrieves the full list of label-value pairs defined in the contextual data.\n     * \n     * @return the list of pairs, not {@code null}\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ExceptionContext.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * Gets the contextualized error message based on a base message.\n     * This will add the context label-value pairs to the message.\n     * \n     * @param baseMessage  the base exception message \u003cb\u003ewithout\u003c/b\u003e context information appended\n     * @return the exception message \u003cb\u003ewith\u003c/b\u003e context information appended, not {@code null}\n     ",
      "child_ranges": []
    }
  ]
}